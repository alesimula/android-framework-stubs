package android.app.appfunctions;

public final class AppFunctionPackageMetadata implements android.app.appfunctions.AbstractAppFunctionMetadata, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.appfunctions.AppFunctionPackageMetadata> CREATOR = null;
    public static final java.lang.String PROPERTY_PACKAGE_NAME = "packageName";
    public static final java.lang.String PROPERTY_TOP_LEVEL_DOCUMENTS = "topLevelMetadataDocuments";
    public static final java.lang.String SCHEMA_TYPE = "AppFunctionPackageData";
    private final android.app.appfunctions.GenericDocumentWrapper mMetadataDocumentWrapper = null;
    private final java.lang.String mPackageName = null;
    private AppFunctionPackageMetadata(android.os.Parcel p0) {}
    private AppFunctionPackageMetadata(java.lang.String p0, android.app.appsearch.GenericDocument p1) {}
    public static android.app.appfunctions.AppFunctionPackageMetadata create(java.lang.String p0, java.util.List<android.app.appsearch.GenericDocument> p1) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.appsearch.GenericDocument getMetadataDocument() { return null; }
    public java.lang.String getPackageName() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
