package android.security.keystore2;

public class AndroidKeyStoreSpi extends java.security.KeyStoreSpi {
    public static final java.lang.String NAME = "AndroidKeyStore";
    public static final java.lang.String TAG = "AndroidKeyStoreSpi";
    private android.security.KeyStore2 mKeyStore;
    private int mNamespace;
    public AndroidKeyStoreSpi() { super(); }
    private static void assertCanReplace(java.lang.String p0, int p1, int p2, android.system.keystore2.KeyDescriptor p3) throws java.security.KeyStoreException {}
    private android.system.keystore2.KeyDescriptor[] getAliasesBatch(java.lang.String p0) { return null; }
    private android.system.keystore2.KeyEntryResponse getKeyMetadata(java.lang.String p0) { return null; }
    private int getKeymasterEcCurve(java.security.PrivateKey p0) { return 0; }
    private static android.security.keystore.KeyProtection getLegacyKeyProtectionParameter(java.security.PrivateKey p0) throws java.security.KeyStoreException { return null; }
    private static boolean getMgf1DigestSetterFlag() { return false; }
    private int getTargetDomain() { return 0; }
    private boolean isKeyEntry(java.lang.String p0) { return false; }
    private android.system.keystore2.KeyDescriptor makeKeyDescriptor(java.lang.String p0) { return null; }
    private void setPrivateKeyEntry(java.lang.String p0, java.security.PrivateKey p1, java.security.cert.Certificate[] p2, java.security.KeyStore.ProtectionParameter p3) throws java.security.KeyStoreException {}
    private void setSecretKeyEntry(java.lang.String p0, javax.crypto.SecretKey p1, java.security.KeyStore.ProtectionParameter p2) throws java.security.KeyStoreException {}
    private void setWrappedKeyEntry(java.lang.String p0, android.security.keystore.WrappedKeyEntry p1, java.security.KeyStore.ProtectionParameter p2) throws java.security.KeyStoreException {}
    static java.security.cert.X509Certificate toCertificate(byte[] p0) { return null; }
    private static java.util.Collection<java.security.cert.X509Certificate> toCertificates(byte[] p0) { return null; }
    public java.util.Enumeration<java.lang.String> engineAliases() { return null; }
    public boolean engineContainsAlias(java.lang.String p0) { return false; }
    public void engineDeleteEntry(java.lang.String p0) throws java.security.KeyStoreException {}
    public java.security.cert.Certificate engineGetCertificate(java.lang.String p0) { return null; }
    public java.lang.String engineGetCertificateAlias(java.security.cert.Certificate p0) { return null; }
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String p0) { return null; }
    public java.util.Date engineGetCreationDate(java.lang.String p0) { return null; }
    public java.security.Key engineGetKey(java.lang.String p0, char[] p1) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException { return null; }
    public boolean engineIsCertificateEntry(java.lang.String p0) { return false; }
    public boolean engineIsKeyEntry(java.lang.String p0) { return false; }
    public void engineLoad(java.io.InputStream p0, char[] p1) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {}
    public void engineLoad(java.security.KeyStore.LoadStoreParameter p0) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {}
    public void engineSetCertificateEntry(java.lang.String p0, java.security.cert.Certificate p1) throws java.security.KeyStoreException {}
    public void engineSetEntry(java.lang.String p0, java.security.KeyStore.Entry p1, java.security.KeyStore.ProtectionParameter p2) throws java.security.KeyStoreException {}
    public void engineSetKeyEntry(java.lang.String p0, java.security.Key p1, char[] p2, java.security.cert.Certificate[] p3) throws java.security.KeyStoreException {}
    public void engineSetKeyEntry(java.lang.String p0, byte[] p1, java.security.cert.Certificate[] p2) throws java.security.KeyStoreException {}
    public int engineSize() { return 0; }
    public void engineStore(java.io.OutputStream p0, char[] p1) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {}
    public void initForTesting(android.security.KeyStore2 p0) {}

    private class KeyEntriesEnumerator implements java.util.Enumeration<java.lang.String> {
        private android.system.keystore2.KeyDescriptor[] mCurrentBatch;
        private int mCurrentEntry;
        private java.lang.String mLastAlias;
        private KeyEntriesEnumerator(android.security.keystore2.AndroidKeyStoreSpi p0) {}
        private void getAndValidateNextBatch() {}
        public boolean hasMoreElements() { return false; }
        public java.lang.String nextElement() { return null; }
    }
}
