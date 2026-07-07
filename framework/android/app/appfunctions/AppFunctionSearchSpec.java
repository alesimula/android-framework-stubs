package android.app.appfunctions;

public final class AppFunctionSearchSpec implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.appfunctions.AppFunctionSearchSpec> CREATOR = null;
    private final android.util.ArraySet<android.app.appfunctions.AppFunctionName> mFunctionNames = null;
    private final long mMinSchemaVersion = 0L;
    private final android.util.ArraySet<java.lang.String> mPackageNames = null;
    private final java.lang.String mSchemaCategory = null;
    private final java.lang.String mSchemaName = null;
    private final android.util.ArraySet<java.lang.Integer> mScopes = null;
    private AppFunctionSearchSpec(android.os.Parcel p0) {}
    private AppFunctionSearchSpec(java.util.Set<java.lang.String> p0, java.util.Set<android.app.appfunctions.AppFunctionName> p1, java.lang.String p2, java.lang.String p3, long p4, java.util.Set<java.lang.Integer> p5) {}
    private java.lang.String getOrStringQueryExpression(android.util.ArraySet<java.lang.String> p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Set<android.app.appfunctions.AppFunctionName> getFunctionNames() { return null; }
    public long getMinSchemaVersion() { return 0L; }
    public java.util.Set<android.app.appfunctions.AppFunctionName> getObservedAppFunctions() { return null; }
    public java.util.Set<java.lang.String> getObservedPackageNames() { return null; }
    public java.lang.String getPackageAppSearchQuery() { return null; }
    public java.util.Set<java.lang.String> getPackageNames() { return null; }
    public java.util.List<java.lang.String> getQualifiedIdsFilter() { return null; }
    public java.lang.String getSchemaCategory() { return null; }
    public java.lang.String getSchemaName() { return null; }
    public java.util.Set<java.lang.Integer> getScopes() { return null; }
    public java.lang.String getStaticMetadataAppSearchQuery() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.Set<android.app.appfunctions.AppFunctionName> mFunctionNames;
        private long mMinSchemaVersion;
        private java.util.Set<java.lang.String> mPackageNames;
        private java.lang.String mSchemaCategory;
        private java.lang.String mSchemaName;
        private java.util.Set<java.lang.Integer> mScopes;
        public Builder() {}
        public Builder(android.app.appfunctions.AppFunctionSearchSpec p0) {}
        public android.app.appfunctions.AppFunctionSearchSpec build() { return null; }
        public android.app.appfunctions.AppFunctionSearchSpec.Builder setFunctionNames(java.util.Set<android.app.appfunctions.AppFunctionName> p0) { return null; }
        public android.app.appfunctions.AppFunctionSearchSpec.Builder setMinSchemaVersion(long p0) { return null; }
        public android.app.appfunctions.AppFunctionSearchSpec.Builder setPackageNames(java.util.Set<java.lang.String> p0) { return null; }
        public android.app.appfunctions.AppFunctionSearchSpec.Builder setSchemaCategory(java.lang.String p0) { return null; }
        public android.app.appfunctions.AppFunctionSearchSpec.Builder setSchemaName(java.lang.String p0) { return null; }
        public android.app.appfunctions.AppFunctionSearchSpec.Builder setScopes(java.util.Set<java.lang.Integer> p0) { return null; }
    }
}
