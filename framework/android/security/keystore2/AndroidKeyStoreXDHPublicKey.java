package android.security.keystore2;

public class AndroidKeyStoreXDHPublicKey extends android.security.keystore2.AndroidKeyStorePublicKey implements java.security.interfaces.XECPublicKey {
    private static final int X25519_KEY_SIZE_BYTES = 32;
    private static final byte[] X509_PREAMBLE = null;
    private static final byte[] X509_PREAMBLE_WITH_NULL = null;
    private final byte[] mEncodedKey = null;
    private final int mPreambleLength = 0;
    public AndroidKeyStoreXDHPublicKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyMetadata p1, java.lang.String p2, android.security.KeyStoreSecurityLevel p3, byte[] p4) { super(null, null, null, null, null); }
    private static int matchesPreamble(byte[] p0, byte[] p1) { return 0; }
    public java.lang.String getAlgorithm() { return null; }
    public java.security.spec.AlgorithmParameterSpec getParams() { return null; }
    android.security.keystore2.AndroidKeyStorePrivateKey getPrivateKey() { return null; }
    public java.math.BigInteger getU() { return null; }
}
