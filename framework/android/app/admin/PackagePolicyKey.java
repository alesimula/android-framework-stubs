package android.app.admin;

@android.annotation.SystemApi
public final class PackagePolicyKey extends android.app.admin.PolicyKey {
    private static final java.lang.String ATTR_PACKAGE_NAME = "package-name";
    public static final android.os.Parcelable.Creator<android.app.admin.PackagePolicyKey> CREATOR = null;
    private final java.lang.String mPackageName = null;
    private PackagePolicyKey(android.os.Parcel p0) { super(null); }
    public PackagePolicyKey(java.lang.String p0) { super(null); }
    public PackagePolicyKey(java.lang.String p0, java.lang.String p1) { super(null); }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getPackageName() { return null; }
    public int hashCode() { return 0; }
    public android.app.admin.PackagePolicyKey readFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public void saveToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public java.lang.String toString() { return null; }
    public void writeToBundle(android.os.Bundle p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
