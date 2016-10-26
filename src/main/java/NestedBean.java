public class NestedBean {
    private Nesting1 field1;
    private Nesting1 field2;
    private Nesting1 field3;
    private Nesting1 field4;
    private Nesting1 field5;
    private Nesting1 field6;
    private Nesting1 field7;
    private Nesting1 field8;
    private Nesting1 field9;
    private Nesting1 field10;

    public NestedBean() {
    }

    private NestedBean(Builder builder) {
        setField1(builder.field1);
        setField2(builder.field2);
        setField3(builder.field3);
        setField4(builder.field4);
        setField5(builder.field5);
        setField6(builder.field6);
        setField7(builder.field7);
        setField8(builder.field8);
        setField9(builder.field9);
        setField10(builder.field10);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Nesting1 getField1() {
        return field1;
    }

    public void setField1(Nesting1 field1) {
        this.field1 = field1;
    }

    public Nesting1 getField2() {
        return field2;
    }

    public void setField2(Nesting1 field2) {
        this.field2 = field2;
    }

    public Nesting1 getField3() {
        return field3;
    }

    public void setField3(Nesting1 field3) {
        this.field3 = field3;
    }

    public Nesting1 getField4() {
        return field4;
    }

    public void setField4(Nesting1 field4) {
        this.field4 = field4;
    }

    public Nesting1 getField5() {
        return field5;
    }

    public void setField5(Nesting1 field5) {
        this.field5 = field5;
    }

    public Nesting1 getField6() {
        return field6;
    }

    public void setField6(Nesting1 field6) {
        this.field6 = field6;
    }

    public Nesting1 getField7() {
        return field7;
    }

    public void setField7(Nesting1 field7) {
        this.field7 = field7;
    }

    public Nesting1 getField8() {
        return field8;
    }

    public void setField8(Nesting1 field8) {
        this.field8 = field8;
    }

    public Nesting1 getField9() {
        return field9;
    }

    public void setField9(Nesting1 field9) {
        this.field9 = field9;
    }

    public Nesting1 getField10() {
        return field10;
    }

    public void setField10(Nesting1 field10) {
        this.field10 = field10;
    }

    public static final class Builder {
        private Nesting1 field1 = Nesting1.newBuilder().build();
        private Nesting1 field2 = Nesting1.newBuilder().build();
        private Nesting1 field3 = Nesting1.newBuilder().build();
        private Nesting1 field4 = Nesting1.newBuilder().build();
        private Nesting1 field5 = Nesting1.newBuilder().build();
        private Nesting1 field6 = Nesting1.newBuilder().build();
        private Nesting1 field7 = Nesting1.newBuilder().build();
        private Nesting1 field8 = Nesting1.newBuilder().build();
        private Nesting1 field9 = Nesting1.newBuilder().build();
        private Nesting1 field10 = Nesting1.newBuilder().build();

        private Builder() {
        }

        public Builder field1(Nesting1 field1) {
            this.field1 = field1;
            return this;
        }

        public Builder field2(Nesting1 field2) {
            this.field2 = field2;
            return this;
        }

        public Builder field3(Nesting1 field3) {
            this.field3 = field3;
            return this;
        }

        public Builder field4(Nesting1 field4) {
            this.field4 = field4;
            return this;
        }

        public Builder field5(Nesting1 field5) {
            this.field5 = field5;
            return this;
        }

        public Builder field6(Nesting1 field6) {
            this.field6 = field6;
            return this;
        }

        public Builder field7(Nesting1 field7) {
            this.field7 = field7;
            return this;
        }

        public Builder field8(Nesting1 field8) {
            this.field8 = field8;
            return this;
        }

        public Builder field9(Nesting1 field9) {
            this.field9 = field9;
            return this;
        }

        public Builder field10(Nesting1 field10) {
            this.field10 = field10;
            return this;
        }

       public NestedBean build() {
            return new NestedBean(this);
        }
    }
}
