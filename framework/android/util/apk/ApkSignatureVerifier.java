package android.util.apk;

public class ApkSignatureVerifier {
    private static final java.lang.String LOG_TAG = "ApkSignatureVerifier";
    private static final java.util.concurrent.atomic.AtomicReference<byte[]> sBuffer = null;
    private static final android.util.ArrayMap<android.content.pm.SigningDetails, android.content.pm.SigningDetails> sOverrideSigningDetails = null;
    public ApkSignatureVerifier() {}
    public static void addOverrideSigningDetails(android.content.pm.SigningDetails p0, android.content.pm.SigningDetails p1) {}
    public static void clearOverrideSigningDetails() {}
    private static void closeQuietly(android.util.jar.StrictJarFile p0) {}
    private static android.content.pm.Signature[] convertToSignatures(java.security.cert.Certificate[][] p0) throws java.security.cert.CertificateEncodingException { return null; }
    public static byte[] generateApkVerity(java.lang.String p0, android.util.apk.ByteBufferFactory p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.security.DigestException, java.security.NoSuchAlgorithmException { return null; }
    public static int getMinimumSignatureSchemeVersionForTargetSdk(int p0) { return 0; }
    public static byte[] getVerityRootHash(java.lang.String p0) throws java.io.IOException, java.lang.SecurityException { return null; }
    private static android.content.pm.parsing.result.ParseResult<java.security.cert.Certificate[][]> loadCertificates(android.content.pm.parsing.result.ParseInput p0, android.util.jar.StrictJarFile p1, java.util.zip.ZipEntry p2) { return null; }
    private static void readFullyIgnoringContents(java.io.InputStream p0) throws java.io.IOException {}
    public static void removeOverrideSigningDetails(android.content.pm.SigningDetails p0) {}
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> unsafeGetCertsWithoutVerification(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, int p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> verify(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, int p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> verify(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, int p2, java.util.function.Supplier<java.io.File> p3) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> verify(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, int p2, java.util.function.Supplier<java.io.File> p3, android.util.apk.InitAppScanMetrics p4) { return null; }
    private static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> verifySignatures(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, int p2, boolean p3, java.util.function.Supplier<java.io.File> p4, android.util.apk.InitAppScanMetrics p5) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.util.apk.ApkSignatureVerifier.SigningDetailsWithDigests> verifySignaturesInternal(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, int p2, boolean p3) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.util.apk.ApkSignatureVerifier.SigningDetailsWithDigests> verifySignaturesInternal(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, int p2, boolean p3, java.util.function.Supplier<java.io.File> p4, android.util.apk.InitAppScanMetrics p5) { return null; }
    private static android.content.pm.parsing.result.ParseResult<android.util.apk.ApkSignatureVerifier.SigningDetailsWithDigests> verifyV1Signature(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, boolean p2, android.util.apk.InitAppScanMetrics p3) { return null; }
    private static android.content.pm.parsing.result.ParseResult<android.util.apk.ApkSignatureVerifier.SigningDetailsWithDigests> verifyV2Signature(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, boolean p2, android.util.apk.InitAppScanMetrics p3) throws android.util.apk.SignatureNotFoundException { return null; }
    private static android.content.pm.parsing.result.ParseResult<android.util.apk.ApkSignatureVerifier.SigningDetailsWithDigests> verifyV3AndBelowSignatures(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, int p2, boolean p3, android.util.apk.InitAppScanMetrics p4) { return null; }
    private static android.content.pm.parsing.result.ParseResult<android.util.apk.ApkSignatureVerifier.SigningDetailsWithDigests> verifyV3Signature(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, boolean p2, android.util.apk.InitAppScanMetrics p3) throws android.util.apk.SignatureNotFoundException { return null; }
    private static android.content.pm.parsing.result.ParseResult<android.util.apk.ApkSignatureVerifier.SigningDetailsWithDigests> verifyV4Signature(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, int p2, boolean p3, android.util.apk.InitAppScanMetrics p4) throws android.util.apk.SignatureNotFoundException { return null; }

    public static class Result {
        public final java.security.cert.Certificate[][] certs = null;
        public final int signatureSchemeVersion = 0;
        public final android.content.pm.Signature[] sigs = null;
        public Result(java.security.cert.Certificate[][] p0, android.content.pm.Signature[] p1, int p2) {}
    }

    public static class SigningDetailsWithDigests {
        public final java.util.Map<java.lang.Integer, byte[]> contentDigests = null;
        public final android.content.pm.SigningDetails signingDetails = null;
        SigningDetailsWithDigests(android.content.pm.SigningDetails p0, java.util.Map<java.lang.Integer, byte[]> p1) {}
    }
}
