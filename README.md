# specific-safe-projection-error

This error reproduction creates a "nested" Java Bean of 90 fields, and encodes it to a Dataset<NestedBean>. Attempting to convert this Dataset to a JavaRDD generates an ``apply`` method larger than 64 KB:

```
Caused by: org.codehaus.janino.JaninoRuntimeException: 
    Code of method "apply(Ljava/lang/Object;)Ljava/lang/Object;" of class 
    "org.apache.spark.sql.catalyst.expressions.GeneratedClass$SpecificSafeProjection" 
    grows beyond 64 KB
```
