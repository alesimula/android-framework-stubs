package android.content.pm;

public final class SigningDetails implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.SigningDetails> CREATOR = null;
    private static final int PAST_CERT_EXISTS = 0;
    private static final java.lang.String TAG = "SigningDetails";
    public static final android.content.pm.SigningDetails UNKNOWN = null;
    private final android.content.pm.Signature[] mPastSigningCertificates = null;
    private final android.util.ArraySet<java.security.PublicKey> mPublicKeys = null;
    private final int mSignatureSchemeMinorVersion = 0;
    private final int mSignatureSchemeVersion = 0;
    private final android.content.pm.Signature[] mSignatures = null;
    public SigningDetails(android.content.pm.SigningDetails p0) {}
    protected SigningDetails(android.os.Parcel p0) {}
    public SigningDetails(android.content.pm.Signature[] p0, int p1) throws java.security.cert.CertificateException {}
    public SigningDetails(android.content.pm.Signature[] p0, int p1, int p2, android.util.ArraySet<java.security.PublicKey> p3, android.content.pm.Signature[] p4) {}
    public SigningDetails(android.content.pm.Signature[] p0, int p1, int p2, android.content.pm.Signature[] p3) throws java.security.cert.CertificateException {}
    public SigningDetails(android.content.pm.Signature[] p0, int p1, android.util.ArraySet<java.security.PublicKey> p2, android.content.pm.Signature[] p3) {}
    public SigningDetails(android.content.pm.Signature[] p0, int p1, android.content.pm.Signature[] p2) throws java.security.cert.CertificateException {}
    @java.lang.Deprecated
    private void __metadata() {}
    private boolean checkV32HybridCapability(android.content.pm.SigningDetails p0, int p1) { return false; }
    private android.content.pm.SigningDetails getDescendantOrSelf(android.content.pm.SigningDetails p0) { return null; }
    private boolean hasCertificateInternal(android.content.pm.Signature p0, int p1) { return false; }
    private boolean hasSha256CertificateInternal(byte[] p0, int p1) { return false; }
    private android.content.pm.SigningDetails mergeLineageWithAncestorOrSelf(android.content.pm.SigningDetails p0, int p1) { return null; }
    public static android.util.ArraySet<java.security.PublicKey> toSigningKeys(android.content.pm.Signature[] p0) throws java.security.cert.CertificateException { return null; }
    public boolean checkCapability(android.content.pm.SigningDetails p0, int p1) { return false; }
    public boolean checkCapability(java.lang.String p0, int p1) { return false; }
    public boolean checkCapabilityRecover(android.content.pm.SigningDetails p0, int p1) throws java.security.cert.CertificateException { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.content.pm.Signature[] getPastSigningCertificates() { return null; }
    public android.util.ArraySet<java.security.PublicKey> getPublicKeys() { return null; }
    public int getSignatureSchemeMinorVersion() { return 0; }
    public int getSignatureSchemeVersion() { return 0; }
    public android.content.pm.Signature[] getSignatures() { return null; }
    android.content.pm.Signature getV32ClassicalHybridSigner() { return null; }
    public boolean hasAncestor(android.content.pm.SigningDetails p0) { return false; }
    public boolean hasAncestorOrSelf(android.content.pm.SigningDetails p0) { return false; }
    public boolean hasAncestorOrSelfWithDigest(java.util.Set<java.lang.String> p0) { return false; }
    public boolean hasCertificate(android.content.pm.Signature p0) { return false; }
    public boolean hasCertificate(android.content.pm.Signature p0, int p1) { return false; }
    public boolean hasCertificate(byte[] p0) { return false; }
    public boolean hasCommonAncestor(android.content.pm.SigningDetails p0) { return false; }
    public boolean hasCommonSignerWithCapability(android.content.pm.SigningDetails p0, int p1) { return false; }
    public boolean hasPastSigningCertificates() { return false; }
    public boolean hasSha256Certificate(byte[] p0) { return false; }
    public boolean hasSha256Certificate(byte[] p0, int p1) { return false; }
    public boolean hasSignatures() { return false; }
    public int hashCode() { return 0; }
    public boolean isPqcSigned() { return false; }
    boolean isV32Hybrid() { return false; }
    public android.content.pm.SigningDetails mergeLineageWith(android.content.pm.SigningDetails p0) { return null; }
    public android.content.pm.SigningDetails mergeLineageWith(android.content.pm.SigningDetails p0, int p1) { return null; }
    public boolean signaturesMatchExactly(android.content.pm.SigningDetails p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private android.content.pm.Signature[] mPastSigningCertificates;
        private int mSignatureSchemeMinorVersion;
        private int mSignatureSchemeVersion;
        private android.content.pm.Signature[] mSignatures;
        public Builder() {}
        private void checkInvariants() {}
        public android.content.pm.SigningDetails build() throws java.security.cert.CertificateException { return null; }
        public android.content.pm.SigningDetails.Builder setPastSigningCertificates(android.content.pm.Signature[] p0) { return null; }
        public android.content.pm.SigningDetails.Builder setSignatureSchemeMinorVersion(int p0) { return null; }
        public android.content.pm.SigningDetails.Builder setSignatureSchemeVersion(int p0) { return null; }
        public android.content.pm.SigningDetails.Builder setSignatures(android.content.pm.Signature[] p0) { return null; }
    }

    public static @interface CapabilityMergeRule {
        public static final int MERGE_OTHER_CAPABILITY = 1;
        public static final int MERGE_RESTRICTED_CAPABILITY = 2;
        public static final int MERGE_SELF_CAPABILITY = 0;
    }

    public static @interface CertCapabilities {
        public static final int AUTH = 16;
        public static final int INSTALLED_DATA = 1;
        public static final int PERMISSION = 4;
        public static final int ROLLBACK = 8;
        public static final int SHARED_USER_ID = 2;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SignatureSchemeMinorVersion {
        public static final int MINOR_VERSION_32_HYBRID = 2;
        public static final int MINOR_VERSION_DEFAULT = 0;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SignatureSchemeVersion {
        public static final int JAR = 1;
        public static final int SIGNING_BLOCK_V2 = 2;
        public static final int SIGNING_BLOCK_V3 = 3;
        public static final int SIGNING_BLOCK_V4 = 4;
        public static final int UNKNOWN = 0;
    }
}
