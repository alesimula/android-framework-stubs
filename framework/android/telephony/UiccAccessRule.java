package android.telephony;

@android.annotation.SystemApi
public final class UiccAccessRule implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.UiccAccessRule> CREATOR = null;
    private static final java.lang.String DELIMITER_CERTIFICATE_HASH_PACKAGE_NAMES = ":";
    private static final java.lang.String DELIMITER_INDIVIDUAL_PACKAGE_NAMES = ",";
    private static final int ENCODING_VERSION = 1;
    private static final java.lang.String TAG = "UiccAccessRule";
    private final long mAccessType = 0L;
    private final byte[] mCertificateHash = null;
    private final int mCertificateHashHashCode = 0;
    private final java.lang.String mPackageName = null;
    UiccAccessRule(android.os.Parcel p0) {}
    public UiccAccessRule(byte[] p0, java.lang.String p1, long p2) {}
    public static android.telephony.UiccAccessRule[] decodeRules(byte[] p0) { return null; }
    public static android.telephony.UiccAccessRule[] decodeRulesFromCarrierConfig(java.lang.String[] p0) { return null; }
    public static byte[] encodeRules(android.telephony.UiccAccessRule[] p0) { return null; }
    public static byte[] getCertHash(android.content.pm.Signature p0, java.lang.String p1) { return null; }
    public static int getCertificateHashHashCode(byte[] p0) { return 0; }
    public static java.util.List<android.content.pm.Signature> getSignatures(android.content.pm.PackageInfo p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getCarrierPrivilegeStatus(android.content.pm.PackageInfo p0) { return 0; }
    public int getCarrierPrivilegeStatus(android.content.pm.Signature p0, java.lang.String p1) { return 0; }
    public java.lang.String getCertificateHexString() { return null; }
    public java.lang.String getPackageName() { return null; }
    public boolean hasMatchingCertificateHashAndPackageName(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean hasMatchingCertificateHashAndPackageName(byte[] p0, java.lang.String p1) { return false; }
    public boolean hasMatchingCertificateHashHashAndPackageName(int p0, java.lang.String p1) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
