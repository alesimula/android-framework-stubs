package android.app.admin;

@android.annotation.SystemApi
public abstract class PolicyKey implements android.os.Parcelable {
    static final java.lang.String ATTR_POLICY_IDENTIFIER = "policy-identifier";
    static final java.lang.String TAG = "PolicyKey";
    private final java.lang.String mIdentifier = null;
    protected PolicyKey(java.lang.String p0) {}
    public static android.app.admin.PolicyKey readGenericPolicyKeyFromXml(com.android.modules.utils.TypedXmlPullParser p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getIdentifier() { return null; }
    public boolean hasSameIdentifierAs(android.app.admin.PolicyKey p0) { return false; }
    public int hashCode() { return 0; }
    public android.app.admin.PolicyKey readFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public void saveToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public abstract void writeToBundle(android.os.Bundle p0);
}
