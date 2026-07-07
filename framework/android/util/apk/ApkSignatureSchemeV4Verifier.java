package android.util.apk;

public class ApkSignatureSchemeV4Verifier {
    static final int APK_SIGNATURE_SCHEME_DEFAULT = -1;
    public ApkSignatureSchemeV4Verifier() {}
    private static int convertToContentDigestType(int p0) throws java.lang.SecurityException { return 0; }
    public static android.util.apk.ApkSignatureSchemeV4Verifier.VerifiedSigner extractCertificates(java.lang.String p0) throws android.util.apk.SignatureNotFoundException, java.security.SignatureException, java.lang.SecurityException { return null; }
    public static android.util.Pair<android.os.incremental.V4Signature.HashingInfo, android.os.incremental.V4Signature.SigningInfos> extractSignature(java.lang.String p0) throws android.util.apk.SignatureNotFoundException, java.security.SignatureException { return null; }
    private static android.os.incremental.V4Signature.SigningInfo findSigningInfoForBlockId(android.os.incremental.V4Signature.SigningInfos p0, int p1) throws android.util.apk.SignatureNotFoundException { return null; }
    public static android.util.apk.ApkSignatureSchemeV4Verifier.VerifiedSigner verify(java.lang.String p0, android.os.incremental.V4Signature.HashingInfo p1, android.os.incremental.V4Signature.SigningInfos p2, int p3) throws android.util.apk.SignatureNotFoundException, java.lang.SecurityException { return null; }
    private static android.util.Pair<java.security.cert.Certificate, byte[]> verifySigner(android.os.incremental.V4Signature.SigningInfo p0, byte[] p1) throws java.lang.SecurityException { return null; }

    public static class VerifiedSigner {
        public final byte[] apkDigest = null;
        public final java.security.cert.Certificate[] certs = null;
        public final java.util.Map<java.lang.Integer, byte[]> contentDigests = null;
        public VerifiedSigner(java.security.cert.Certificate[] p0, byte[] p1, java.util.Map<java.lang.Integer, byte[]> p2) {}
    }
}
