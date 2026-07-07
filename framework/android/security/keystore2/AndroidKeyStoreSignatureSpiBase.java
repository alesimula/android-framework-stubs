package android.security.keystore2;

abstract class AndroidKeyStoreSignatureSpiBase extends java.security.SignatureSpi implements android.security.keystore.KeyStoreCryptoOperation {
    private static final java.lang.String TAG = "AndroidKeyStoreSignatureSpiBase";
    private java.lang.Exception mCachedException;
    private android.security.keystore2.AndroidKeyStoreKey mKey;
    private android.security.keystore2.KeyStoreCryptoOperationStreamer mMessageStreamer;
    private android.security.KeyStoreOperation mOperation;
    private long mOperationChallenge;
    private java.security.Signature mSignature;
    private boolean mSigning;
    AndroidKeyStoreSignatureSpiBase() { super(); }
    private void abortOperation() {}
    private void ensureKeystoreOperationInitialized() throws java.security.InvalidKeyException {}
    protected abstract void addAlgorithmSpecificParametersToBegin(android.security.keystore2.AndroidKeyStoreKey p0, java.util.List<android.hardware.security.keymint.KeyParameter> p1);
    protected android.security.keystore2.KeyStoreCryptoOperationStreamer createMainDataStreamer(android.security.KeyStoreOperation p0) { return null; }
    @java.lang.Deprecated
    protected final java.lang.Object engineGetParameter(java.lang.String p0) throws java.security.InvalidParameterException { return null; }
    protected void engineInitSign(java.security.PrivateKey p0) throws java.security.InvalidKeyException {}
    protected final void engineInitSign(java.security.PrivateKey p0, java.security.SecureRandom p1) throws java.security.InvalidKeyException {}
    protected void engineInitVerify(java.security.PublicKey p0) throws java.security.InvalidKeyException {}
    @java.lang.Deprecated
    protected final void engineSetParameter(java.lang.String p0, java.lang.Object p1) throws java.security.InvalidParameterException {}
    protected final int engineSign(byte[] p0, int p1, int p2) throws java.security.SignatureException { return 0; }
    protected final byte[] engineSign() throws java.security.SignatureException { return null; }
    protected final void engineUpdate(byte p0) throws java.security.SignatureException {}
    protected final void engineUpdate(java.nio.ByteBuffer p0) {}
    protected final void engineUpdate(byte[] p0, int p1, int p2) throws java.security.SignatureException {}
    protected final boolean engineVerify(byte[] p0) throws java.security.SignatureException { return false; }
    protected final boolean engineVerify(byte[] p0, int p1, int p2) throws java.security.SignatureException { return false; }
    protected abstract java.lang.String getAlgorithm();
    public final long getOperationHandle() { return 0L; }
    protected void initKey(android.security.keystore2.AndroidKeyStoreKey p0) throws java.security.InvalidKeyException {}
    protected final boolean isSigning() { return false; }
    protected void resetAll() {}
    protected void resetWhilePreservingInitState() {}
}
