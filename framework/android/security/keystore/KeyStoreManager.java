package android.security.keystore;

public final class KeyStoreManager {
    public static final int MODULE_HASH = -1879047468;
    private static final java.lang.String TAG = "KeyStoreManager";
    private static android.security.keystore.KeyStoreManager sInstance;
    private static final java.lang.Object sInstanceLock = null;
    private final android.security.KeyStore2 mKeyStore2 = null;
    private KeyStoreManager() {}
    private static android.system.keystore2.KeyDescriptor createKeyDescriptorFromAlias(java.lang.String p0) { return null; }
    private static android.system.keystore2.KeyDescriptor createKeyDescriptorFromId(long p0, int p1) { return null; }
    private static java.security.cert.X509Certificate getCertificate(byte[] p0) { return null; }
    private static java.util.Collection<java.security.cert.X509Certificate> getCertificates(byte[] p0) { return null; }
    public static android.security.keystore.KeyStoreManager getInstance() { return null; }
    public java.util.List<java.security.cert.X509Certificate> getGrantedCertificateChainFromId(long p0) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    public java.security.Key getGrantedKeyFromId(long p0) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    public java.security.KeyPair getGrantedKeyPairFromId(long p0) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    public byte[] getSupplementaryAttestationInfo(int p0) throws android.security.KeyStoreException { return null; }
    public long grantKeyAccess(java.lang.String p0, int p1) throws android.security.KeyStoreException, java.security.UnrecoverableKeyException { return 0L; }
    public void revokeKeyAccess(java.lang.String p0, int p1) throws android.security.KeyStoreException, java.security.UnrecoverableKeyException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SupplementaryAttestationInfoTagEnum {
    }
}
