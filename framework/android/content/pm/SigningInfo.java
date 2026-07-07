package android.content.pm;

public final class SigningInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.SigningInfo> CREATOR = null;
    public static final int VERSION_JAR = 1;
    public static final int VERSION_SIGNING_BLOCK_V2 = 2;
    public static final int VERSION_SIGNING_BLOCK_V3 = 3;
    public static final int VERSION_SIGNING_BLOCK_V4 = 4;
    private final android.content.pm.SigningDetails mSigningDetails = null;
    public SigningInfo() {}
    public SigningInfo(int p0, java.util.Collection<android.content.pm.Signature> p1, java.util.Collection<java.security.PublicKey> p2, java.util.Collection<android.content.pm.Signature> p3) {}
    public SigningInfo(android.content.pm.SigningDetails p0) {}
    public SigningInfo(android.content.pm.SigningInfo p0) {}
    private SigningInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.content.pm.Signature[] getApkContentsSigners() { return null; }
    public java.util.Collection<java.security.PublicKey> getPublicKeys() { return null; }
    public int getSchemeVersion() { return 0; }
    public android.content.pm.Signature[] getSigningCertificateHistory() { return null; }
    public android.content.pm.SigningDetails getSigningDetails() { return null; }
    public boolean hasMultipleSigners() { return false; }
    public boolean hasPastSigningCertificates() { return false; }
    public boolean signersMatchExactly(android.content.pm.SigningInfo p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppSigningSchemeVersion {
    }
}
