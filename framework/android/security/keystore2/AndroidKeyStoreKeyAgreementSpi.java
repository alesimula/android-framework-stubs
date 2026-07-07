package android.security.keystore2;

public class AndroidKeyStoreKeyAgreementSpi extends javax.crypto.KeyAgreementSpi implements android.security.keystore.KeyStoreCryptoOperation {
    private static final java.lang.String TAG = "AndroidKeyStoreKeyAgreementSpi";
    private android.security.keystore2.AndroidKeyStorePrivateKey mKey;
    private final int mKeymintAlgorithm = 0;
    private android.security.KeyStoreOperation mOperation;
    private long mOperationHandle;
    private java.security.PublicKey mOtherPartyKey;
    protected AndroidKeyStoreKeyAgreementSpi(int p0) { super(); }
    private void ensureKeystoreOperationInitialized() throws java.security.InvalidKeyException, java.lang.IllegalStateException {}
    private void resetAll() {}
    private void resetWhilePreservingInitState() {}
    protected java.security.Key engineDoPhase(java.security.Key p0, boolean p1) throws java.security.InvalidKeyException, java.lang.IllegalStateException { return null; }
    protected int engineGenerateSecret(byte[] p0, int p1) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException { return 0; }
    protected javax.crypto.SecretKey engineGenerateSecret(java.lang.String p0) throws java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException { return null; }
    protected byte[] engineGenerateSecret() throws java.lang.IllegalStateException { return null; }
    protected void engineInit(java.security.Key p0, java.security.SecureRandom p1) throws java.security.InvalidKeyException {}
    protected void engineInit(java.security.Key p0, java.security.spec.AlgorithmParameterSpec p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void finalize() throws java.lang.Throwable {}
    public long getOperationHandle() { return 0L; }

    public static class ECDH extends android.security.keystore2.AndroidKeyStoreKeyAgreementSpi {
        public ECDH() { super(0); }
    }

    public static class XDH extends android.security.keystore2.AndroidKeyStoreKeyAgreementSpi {
        public XDH() { super(0); }
    }
}
