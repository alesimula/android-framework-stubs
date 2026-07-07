package android.content.pm;

@android.annotation.SystemApi
public final class IntentFilterVerificationInfo implements android.os.Parcelable {
    private static final java.lang.String ATTR_DOMAIN_NAME = "name";
    private static final java.lang.String ATTR_PACKAGE_NAME = "packageName";
    private static final java.lang.String ATTR_STATUS = "status";
    public static final android.os.Parcelable.Creator<android.content.pm.IntentFilterVerificationInfo> CREATOR = null;
    private static final java.lang.String TAG = null;
    private static final java.lang.String TAG_DOMAIN = "domain";
    private android.util.ArraySet<java.lang.String> mDomains;
    private java.lang.String mPackageName;
    private int mStatus;
    public IntentFilterVerificationInfo() {}
    public IntentFilterVerificationInfo(android.os.Parcel p0) {}
    public IntentFilterVerificationInfo(com.android.modules.utils.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public IntentFilterVerificationInfo(java.lang.String p0, android.util.ArraySet<java.lang.String> p1) {}
    public static java.lang.String getStatusStringFromValue(long p0) { return null; }
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.util.Set<java.lang.String> getDomains() { return null; }
    public java.lang.String getDomainsString() { return null; }
    int getIntFromXml(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1, int p2) { return 0; }
    public java.lang.String getPackageName() { return null; }
    public int getStatus() { return 0; }
    public java.lang.String getStatusString() { return null; }
    java.lang.String getStringFromXml(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1, java.lang.String p2) { return null; }
    public void readFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void setDomains(android.util.ArraySet<java.lang.String> p0) {}
    public void setStatus(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
}
