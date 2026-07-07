package android.security.keystore2;

public abstract class AndroidKeyStoreKeyFactorySpi extends java.security.KeyFactorySpi {
    public AndroidKeyStoreKeyFactorySpi() { super(); }
    private void checkKeyAlgorithm(java.security.Key p0) throws java.security.spec.InvalidKeySpecException {}
    protected java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec p0) throws java.security.spec.InvalidKeySpecException { return null; }
    protected java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec p0) throws java.security.spec.InvalidKeySpecException { return null; }
    protected <T extends java.security.spec.KeySpec> T engineGetKeySpec(java.security.Key p0, java.lang.Class<T> p1) throws java.security.spec.InvalidKeySpecException { return null; }
    protected java.security.Key engineTranslateKey(java.security.Key p0) throws java.security.InvalidKeyException { return null; }
    boolean supportsAlgorithm(java.lang.String p0) { return false; }

    public static class EC extends android.security.keystore2.AndroidKeyStoreKeyFactorySpi {
        public EC() { super(); }
    }

    public static class ED25519 extends android.security.keystore2.AndroidKeyStoreKeyFactorySpi {
        public ED25519() { super(); }
    }

    public static class MLDSA extends android.security.keystore2.AndroidKeyStoreKeyFactorySpi {
        public MLDSA() { super(); }
        public boolean supportsAlgorithm(java.lang.String p0) { return false; }
    }

    public static class MLDSA65 extends android.security.keystore2.AndroidKeyStoreKeyFactorySpi {
        public MLDSA65() { super(); }
        public boolean supportsAlgorithm(java.lang.String p0) { return false; }
    }

    public static class MLDSA87 extends android.security.keystore2.AndroidKeyStoreKeyFactorySpi {
        public MLDSA87() { super(); }
        public boolean supportsAlgorithm(java.lang.String p0) { return false; }
    }

    public static class RSA extends android.security.keystore2.AndroidKeyStoreKeyFactorySpi {
        public RSA() { super(); }
    }

    public static class XDH extends android.security.keystore2.AndroidKeyStoreKeyFactorySpi {
        public XDH() { super(); }
    }
}
