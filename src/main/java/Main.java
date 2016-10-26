import org.apache.spark.SparkConf;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.SparkSession;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    /*
     * Attempts to project a Dataset of a `nested` Java Bean object to an RDD.
     * GenerateSafeProjection produces an `apply` method that tries to create a
     * NestedBean from the InternalRow, but the generated code comes from a
     * single (similarly nested) Expression, and is not properly split among
     * separate `apply` methods. Yields a single monolithic `apply` method that
     * "grows beyond 64 KB".
     */
    public static void main(String[] args) {
        SparkConf conf = new SparkConf()
                .setMaster("local")
                .set("spark.serializer", "org.apache.spark.serializer.KyroSerializer")
                .registerKryoClasses(new Class[]{NestedBean.class});
        SparkSession spark = SparkSession.builder().config(conf).getOrCreate();

        List<NestedBean> data = IntStream.range(0, 50)
                .mapToObj(x -> NestedBean.newBuilder().build())
                .collect(Collectors.toList());

        Encoder<NestedBean> encoder = Encoders.bean(NestedBean.class);
        Dataset<NestedBean> ds = spark.createDataset(data, encoder);
        ds.toJavaRDD().collect().stream().forEach(System.out::println);
    }
}
