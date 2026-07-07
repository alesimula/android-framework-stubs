package android.app.appfunctions;

public final class AppFunctionMetadata implements android.app.appfunctions.AbstractAppFunctionMetadata, android.os.Parcelable {
    public static final int APP_FUNCTION_TYPE_DYNAMIC_ACTIVITY = 2;
    public static final int APP_FUNCTION_TYPE_DYNAMIC_GLOBAL = 1;
    public static final int APP_FUNCTION_TYPE_STATIC = 0;
    public static final android.os.Parcelable.Creator<android.app.appfunctions.AppFunctionMetadata> CREATOR = null;
    public static final java.lang.String DYNAMIC_APP_FUNCTIONS_SERVICE_NAME = "@null";
    public static final java.lang.String PROPERTY_ENABLED_BY_DEFAULT = "enabledByDefault";
    public static final java.lang.String PROPERTY_FUNCTION_ID = "id";
    public static final java.lang.String PROPERTY_PACKAGE_NAME_HASH = "packageNameHash";
    public static final java.lang.String PROPERTY_SCHEMA_CATEGORY = "schemaCategory";
    public static final java.lang.String PROPERTY_SCHEMA_NAME = "schemaName";
    public static final java.lang.String PROPERTY_SCHEMA_VERSION = "schemaVersion";
    public static final java.lang.String PROPERTY_SCOPE = "scope";
    public static final java.lang.String PROPERTY_SERVICE_NAME = "serviceName";
    public static final java.lang.String PROPERTY_VALUE_SCOPE_ACTIVITY = "activity";
    public static final java.lang.String PROPERTY_VALUE_SCOPE_GLOBAL = "global";
    public static final int SCOPE_ACTIVITY = 1;
    public static final int SCOPE_GLOBAL = 0;
    private final android.app.appfunctions.GenericDocumentWrapper mAppFunctionMetadataDocumentWrapper = null;
    private final android.app.appfunctions.AppFunctionName mAppFunctionName = null;
    private final android.app.appfunctions.AppFunctionPackageMetadata mAppFunctionPackageMetadata = null;
    private final android.app.appfunctions.AppFunctionSchemaMetadata mAppFunctionSchemaMetadata = null;
    private AppFunctionMetadata(android.app.appfunctions.AppFunctionName p0, android.app.appfunctions.AppFunctionSchemaMetadata p1, android.app.appfunctions.AppFunctionPackageMetadata p2, android.app.appsearch.GenericDocument p3) {}
    private AppFunctionMetadata(android.os.Parcel p0) {}
    private static android.app.appfunctions.AppFunctionSchemaMetadata getAppFunctionSchemaMetadataOrNull(android.app.appsearch.GenericDocument p0) { return null; }
    static java.lang.String scopeToScopeXmlValue(int p0) { return null; }
    static int scopeXmlValueToScope(java.lang.String p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.appsearch.GenericDocument getMetadataDocument() { return null; }
    public android.app.appfunctions.AppFunctionName getName() { return null; }
    public android.app.appfunctions.AppFunctionPackageMetadata getPackageMetadata() { return null; }
    public android.app.appfunctions.AppFunctionSchemaMetadata getSchemaMetadata() { return null; }
    public int getScope() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppFunctionType {
    }

    public static final class Builder {
        private final android.app.appfunctions.AppFunctionPackageMetadata mPackageMetadata = null;
        public Builder(android.app.appsearch.GenericDocument p0, android.app.appfunctions.AppFunctionPackageMetadata p1) {}
        public android.app.appfunctions.AppFunctionMetadata build() throws java.lang.IllegalArgumentException { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Scope {
    }
}
