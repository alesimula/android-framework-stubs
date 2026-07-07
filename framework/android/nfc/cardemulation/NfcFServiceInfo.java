package android.nfc.cardemulation;

@android.annotation.SystemApi
public final class NfcFServiceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.nfc.cardemulation.NfcFServiceInfo> CREATOR = null;
    private static final java.lang.String DEFAULT_T3T_PMM = "FFFFFFFFFFFFFFFF";
    static final java.lang.String TAG = "NfcFServiceInfo";
    private final java.lang.String mDescription = null;
    private java.lang.String mDynamicNfcid2;
    private java.lang.String mDynamicSystemCode;
    private final java.lang.String mNfcid2 = null;
    private final android.content.pm.ResolveInfo mService = null;
    private final java.lang.String mSystemCode = null;
    private final java.lang.String mT3tPmm = null;
    private final int mUid = 0;
    public NfcFServiceInfo(android.content.pm.PackageManager p0, android.content.pm.ResolveInfo p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public NfcFServiceInfo(android.content.pm.ResolveInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, int p6, java.lang.String p7) {}
    private static boolean isValidNfcid2(java.lang.String p0) { return false; }
    private static boolean isValidSystemCode(java.lang.String p0) { return false; }
    public int describeContents() { return 0; }
    public void dump(android.os.ParcelFileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.content.ComponentName getComponent() { return null; }
    public java.lang.String getDescription() { return null; }
    public java.lang.String getNfcid2() { return null; }
    public java.lang.String getSystemCode() { return null; }
    public java.lang.String getT3tPmm() { return null; }
    public int getUid() { return 0; }
    public int hashCode() { return 0; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public void setDynamicNfcid2(java.lang.String p0) {}
    public void setDynamicSystemCode(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
