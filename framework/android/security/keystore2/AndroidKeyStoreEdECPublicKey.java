package android.security.keystore2;

public class AndroidKeyStoreEdECPublicKey extends android.security.keystore2.AndroidKeyStorePublicKey implements java.security.interfaces.EdECPublicKey {
    private static final byte[] DER_KEY_PREFIX = null;
    private static final int ED25519_KEY_SIZE_BYTES = 32;
    private java.security.spec.EdECPoint mPoint;
    public AndroidKeyStoreEdECPublicKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyMetadata p1, java.lang.String p2, android.security.KeyStoreSecurityLevel p3, byte[] p4) { super(null, null, null, null, null); }
    private static int matchesPreamble(byte[] p0, byte[] p1) { return 0; }
    private static java.security.spec.EdECPoint pointFromKeyByteArray(byte[] p0) { return null; }
    private static void reverse(byte[] p0) {}
    public java.security.spec.NamedParameterSpec getParams() { return null; }
    public java.security.spec.EdECPoint getPoint() { return null; }
    android.security.keystore2.AndroidKeyStorePrivateKey getPrivateKey() { return null; }
}
