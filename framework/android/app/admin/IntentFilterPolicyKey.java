package android.app.admin;

@android.annotation.SystemApi
public final class IntentFilterPolicyKey extends android.app.admin.PolicyKey {
    public static final android.os.Parcelable.Creator<android.app.admin.IntentFilterPolicyKey> CREATOR = null;
    private static final java.lang.String TAG = "IntentFilterPolicyKey";
    private static final java.lang.String TAG_INTENT_FILTER_ENTRY = "filter";
    private final android.content.IntentFilter mFilter = null;
    private IntentFilterPolicyKey(android.os.Parcel p0) { super(null); }
    public IntentFilterPolicyKey(java.lang.String p0) { super(null); }
    public IntentFilterPolicyKey(java.lang.String p0, android.content.IntentFilter p1) { super(null); }
    private android.content.IntentFilter readIntentFilterFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.content.IntentFilter getIntentFilter() { return null; }
    public int hashCode() { return 0; }
    public android.app.admin.IntentFilterPolicyKey readFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public void saveToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public java.lang.String toString() { return null; }
    public void writeToBundle(android.os.Bundle p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
