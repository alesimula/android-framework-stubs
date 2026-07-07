package android.util.jar;

class StrictJarVerifier {
    private static final java.lang.String[] DIGEST_ALGORITHMS = null;
    private static final int MAX_JAR_SIGNERS = 10;
    private static final java.lang.String SF_ATTRIBUTE_ANDROID_APK_SIGNED_NAME = "X-Android-APK-Signed";
    private final java.util.Hashtable<java.lang.String, java.security.cert.Certificate[]> certificates = null;
    private final java.lang.String jarName = null;
    private final int mainAttributesEnd = 0;
    private final android.util.jar.StrictJarManifest manifest = null;
    private final java.util.HashMap<java.lang.String, byte[]> metaEntries = null;
    private final boolean signatureSchemeRollbackProtectionsEnforced = false;
    private final java.util.Hashtable<java.lang.String, java.util.HashMap<java.lang.String, java.util.jar.Attributes>> signatures = null;
    private final java.util.Hashtable<java.lang.String, java.security.cert.Certificate[][]> verifiedEntries = null;
    StrictJarVerifier(java.lang.String p0, android.util.jar.StrictJarManifest p1, java.util.HashMap<java.lang.String, byte[]> p2, boolean p3) {}
    private static java.lang.SecurityException failedVerification(java.lang.String p0, java.lang.String p1) { return null; }
    private static java.lang.SecurityException failedVerification(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) { return null; }
    private static java.lang.SecurityException invalidDigest(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    private boolean verify(java.util.jar.Attributes p0, java.lang.String p1, byte[] p2, int p3, int p4, boolean p5, boolean p6) { return false; }
    static java.security.cert.Certificate[] verifyBytes(byte[] p0, byte[] p1) throws java.security.GeneralSecurityException { return null; }
    private void verifyCertificate(java.lang.String p0) {}
    private static boolean verifyMessageDigest(byte[] p0, byte[] p1) { return false; }
    void addMetaEntry(java.lang.String p0, byte[] p1) {}
    java.security.cert.Certificate[][] getCertificateChains(java.lang.String p0) { return null; }
    android.util.jar.StrictJarVerifier.VerifierEntry initEntry(java.lang.String p0) { return null; }
    boolean isSignedJar() { return false; }
    boolean readCertificates() { return false; }
    void removeMetaEntries() {}

    static class VerifierEntry extends java.io.OutputStream {
        private final java.security.cert.Certificate[][] certChains = null;
        private final java.security.MessageDigest digest = null;
        private final byte[] hash = null;
        private final java.lang.String name = null;
        private final java.util.Hashtable<java.lang.String, java.security.cert.Certificate[][]> verifiedEntries = null;
        VerifierEntry(java.lang.String p0, java.security.MessageDigest p1, byte[] p2, java.security.cert.Certificate[][] p3, java.util.Hashtable<java.lang.String, java.security.cert.Certificate[][]> p4) { super(); }
        void verify() {}
        public void write(int p0) {}
        public void write(byte[] p0, int p1, int p2) {}
    }
}
