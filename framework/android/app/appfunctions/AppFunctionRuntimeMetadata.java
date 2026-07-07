package android.app.appfunctions;

public class AppFunctionRuntimeMetadata {
    public static final java.lang.String APP_FUNCTION_INDEXER_PACKAGE = "android";
    public static final java.lang.String APP_FUNCTION_RUNTIME_METADATA_DB = "appfunctions-db";
    public static final java.lang.String APP_FUNCTION_RUNTIME_NAMESPACE = "app_functions_runtime";
    public static final java.lang.String PROPERTY_APP_FUNCTION_STATIC_METADATA_QUALIFIED_ID = "appFunctionStaticMetadataQualifiedId";
    public static final java.lang.String PROPERTY_ENABLED = "enabled";
    public static final java.lang.String PROPERTY_FUNCTION_ID = "functionId";
    public static final java.lang.String PROPERTY_PACKAGE_NAME = "packageName";
    public static final java.lang.String RUNTIME_SCHEMA_TYPE = "AppFunctionRuntimeMetadata";
    private static final java.lang.String RUNTIME_SCHEMA_TYPE_SEPARATOR = "-";
    private static final java.lang.String TAG = "AppSearchAppFunction";
    public AppFunctionRuntimeMetadata(android.app.appsearch.GenericDocument p0) {}
    public static android.app.appsearch.AppSearchSchema createAppFunctionRuntimeSchema(java.lang.String p0) { return null; }
    public static android.app.appsearch.AppSearchSchema createParentAppFunctionRuntimeSchema() { return null; }
    private static android.app.appsearch.AppSearchSchema.Builder getAppFunctionRuntimeSchemaBuilder(java.lang.String p0) { return null; }
    public static java.lang.String getDocumentIdForAppFunction(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.lang.String getPackageNameFromSchema(java.lang.String p0) { return null; }
    public static java.lang.String getRuntimeSchemaNameForPackage(java.lang.String p0) { return null; }
    public java.lang.String getAppFunctionStaticMetadataQualifiedId() { return null; }
    public int getEnabled() { return 0; }
    public java.lang.String getFunctionId() { return null; }
    public java.lang.String getPackageName() { return null; }

    public static final class Builder {
        public Builder(android.app.appfunctions.AppFunctionRuntimeMetadata p0) {}
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public android.app.appfunctions.AppFunctionRuntimeMetadata build() { return null; }
        public android.app.appfunctions.AppFunctionRuntimeMetadata.Builder setEnabled(int p0) { return null; }
    }
}
