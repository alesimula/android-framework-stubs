package android.content.pm;

@android.annotation.SystemApi
public final class SignedPackage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.SignedPackage> CREATOR = null;
    static final int MAX_CERTIFICATE_HISTORY_SIZE = 128;
    private static final java.lang.String WILDCARD_PACKAGE_NAME = "*";
    private final java.util.List<byte[]> mCertificateDigestHistory = null;
    private final java.lang.String mPackageName = null;
    private final boolean mWildcardPackageName = false;
    public SignedPackage(android.content.pm.SignedPackageParcel p0) {}
    public SignedPackage(android.os.Parcel p0) {}
    private SignedPackage(java.lang.String p0, java.util.List<byte[]> p1) {}
    public SignedPackage(java.lang.String p0, byte[] p1) {}
    private static boolean byteArrayListEquals(java.util.List<byte[]> p0, java.util.List<byte[]> p1) { return false; }
    private static int byteArrayListHashCode(java.util.List<byte[]> p0) { return 0; }
    public static android.content.pm.SignedPackage createWithCertificateDigestHistory(java.lang.String p0, java.util.List<byte[]> p1) { return null; }
    private static java.util.List<byte[]> readCertificateHistory(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public byte[] getCertificateDigest() { return null; }
    public java.util.List<byte[]> getCertificateDigestHistory() { return null; }
    public java.lang.String getPackageName() { return null; }
    public boolean hasCertificateDigest() { return false; }
    public int hashCode() { return 0; }
    public boolean isWildcardPackageName() { return false; }
    public android.content.pm.SignedPackageParcel toSignedPackageParcel() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
