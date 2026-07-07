package android.util.apk;

public class ApkSignatureSchemeV3Verifier {
    static final int APK_SIGNATURE_SCHEME_V31_BLOCK_ID = 462663009;
    static final int APK_SIGNATURE_SCHEME_V32_BLOCK_ID = 1893845151;
    static final int APK_SIGNATURE_SCHEME_V3_BLOCK_ID = -262969152;
    private static final int HYBRID_MAX_SDK_VERSION_ATTR_ID = -1626949732;
    private static final int HYBRID_MIN_SDK_VERSION_ATTR_ID = -1080818391;
    private static final int PROOF_OF_ROTATION_ATTR_ID = 1000370060;
    private static final int ROTATION_MIN_SDK_VERSION_ATTR_ID = 1436519170;
    public static final int SF_ATTRIBUTE_ANDROID_APK_SIGNED_ID = 3;
    private static final int SIGNER_TARGETS_DEV_RELEASE_ATTR_ID = -1029262406;
    private final java.io.RandomAccessFile mApk = null;
    private int mBlockId;
    private java.util.OptionalInt mOptionalHybridMaxSdkVersion;
    private java.util.OptionalInt mOptionalHybridMinSdkVersion;
    private java.util.OptionalInt mOptionalRotationMinSdkVersion;
    private int mSignerMinSdkVersion;
    private final boolean mVerifyIntegrity = false;
    private ApkSignatureSchemeV3Verifier(java.io.RandomAccessFile p0, boolean p1) {}
    public static android.util.apk.SignatureInfo findSignature(java.io.RandomAccessFile p0) throws java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }
    private static android.util.apk.SignatureInfo findSignature(java.io.RandomAccessFile p0, int p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }
    static byte[] generateApkVerity(java.lang.String p0, android.util.apk.ByteBufferFactory p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.security.DigestException, java.security.NoSuchAlgorithmException { return null; }
    static byte[] getVerityRootHash(java.lang.String p0) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.lang.SecurityException { return null; }
    public static boolean hasSignature(java.lang.String p0) throws java.io.IOException { return false; }
    public static android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner unsafeGetCertsWithoutVerification(java.lang.String p0) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.io.IOException { return null; }
    private android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner verify(android.util.apk.SignatureInfo p0, int p1) throws java.lang.SecurityException, java.io.IOException, android.util.apk.ApkSignatureSchemeV3Verifier.PlatformNotSupportedException { return null; }
    private static android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner verify(java.io.RandomAccessFile p0, boolean p1) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.io.IOException { return null; }
    public static android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner verify(java.lang.String p0) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.io.IOException { return null; }
    private static android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner verify(java.lang.String p0, boolean p1) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.io.IOException { return null; }
    private android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner verifyAdditionalAttributes(java.nio.ByteBuffer p0, java.util.List<java.security.cert.X509Certificate> p1, java.security.cert.CertificateFactory p2, java.util.Map<java.lang.Integer, byte[]> p3, int p4, int p5, int p6) throws java.io.IOException, android.util.apk.ApkSignatureSchemeV3Verifier.PlatformNotSupportedException { return null; }
    private android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner verifySigner(java.nio.ByteBuffer p0, java.security.cert.CertificateFactory p1) throws java.lang.SecurityException, java.io.IOException, android.util.apk.ApkSignatureSchemeV3Verifier.PlatformNotSupportedException { return null; }
    private android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner verifyV31Signers(java.util.List<android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner> p0) { return null; }
    public android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner verifyV32Signers(java.util.List<android.util.apk.ApkSignatureSchemeV3Verifier.VerifiedSigner> p0) { return null; }

    private static class PlatformNotSupportedException extends java.lang.Exception {
        PlatformNotSupportedException(java.lang.String p0) { super(); }
    }

    public static class VerifiedSigner {
        public int algorithmId;
        public int blockId;
        public final java.security.cert.X509Certificate[] certs = null;
        public final java.util.Map<java.lang.Integer, byte[]> contentDigests = null;
        public boolean isDevTarget;
        public int maxSdkVersion;
        public int minSdkVersion;
        public final android.util.apk.ApkSigningBlockUtils.VerifiedProofOfRotation por = null;
        public byte[] verityRootHash;
        public VerifiedSigner(java.security.cert.X509Certificate[] p0, android.util.apk.ApkSigningBlockUtils.VerifiedProofOfRotation p1, java.util.Map<java.lang.Integer, byte[]> p2, int p3, int p4, int p5, boolean p6) {}
        public VerifiedSigner(java.security.cert.X509Certificate[] p0, android.util.apk.ApkSigningBlockUtils.VerifiedProofOfRotation p1, byte[] p2, java.util.Map<java.lang.Integer, byte[]> p3, int p4) {}
    }
}
