package android.app.appsearch;

public class AppSearchSchema {
    public AppSearchSchema() {}

    public static class Builder {
        public Builder(java.lang.String p0) {}
        public android.app.appsearch.AppSearchSchema.Builder addParentType(java.lang.String p0) { return null; }
        public android.app.appsearch.AppSearchSchema build() { return null; }
        public android.app.appsearch.AppSearchSchema.Builder addProperty(android.app.appsearch.AppSearchSchema.PropertyConfig p0) { return null; }
    }

    public static class StringPropertyConfig {
        public StringPropertyConfig() {}

        public static class Builder {
            public Builder(java.lang.String p0) {}
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setCardinality(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setIndexingType(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setTokenizerType(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig build() { return null; }
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setJoinableValueType(int p0) { return null; }
        }
    }

    public static class BooleanPropertyConfig {
        public BooleanPropertyConfig() {}

        public static class Builder {
            public Builder(java.lang.String p0) {}
            public android.app.appsearch.AppSearchSchema.BooleanPropertyConfig.Builder setCardinality(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.BooleanPropertyConfig build() { return null; }
        }
    }

    public static class BytesPropertyConfig {
        public BytesPropertyConfig() {}

        public static class Builder {
            public Builder(java.lang.String p0) {}
            public android.app.appsearch.AppSearchSchema.BytesPropertyConfig.Builder setCardinality(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.BytesPropertyConfig build() { return null; }
        }
    }

    public static class LongPropertyConfig {
        public LongPropertyConfig() {}

        public static class Builder {
            public Builder(java.lang.String p0) {}
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig.Builder setCardinality(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig.Builder setIndexingType(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig build() { return null; }
        }
    }

    public static class PropertyConfig {
        public PropertyConfig() {}
    }

    public static class DocumentPropertyConfig {
        public DocumentPropertyConfig() {}

        public static class Builder {
            public Builder(java.lang.String p0, java.lang.String p1) {}
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder setCardinality(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig build() { return null; }
        }
    }
}
