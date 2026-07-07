package android.security.keystore2;

abstract class AndroidKeyStoreMlDsaSignatureSpi extends android.security.keystore2.AndroidKeyStoreSignatureSpiBase {
    AndroidKeyStoreMlDsaSignatureSpi() { super(); }
    private void checkKey(java.security.Key p0) throws java.security.InvalidKeyException {}
    private java.lang.String getMlDsaAlgorithm(android.security.keystore2.AndroidKeyStoreKey p0) { return null; }
    protected void addAlgorithmSpecificParametersToBegin(android.security.keystore2.AndroidKeyStoreKey p0, java.util.List<android.hardware.security.keymint.KeyParameter> p1) {}
    protected final void engineInitSign(java.security.PrivateKey p0) throws java.security.InvalidKeyException {}
    protected final void engineInitVerify(java.security.PublicKey p0) throws java.security.InvalidKeyException {}
    abstract boolean supportsAlgorithm(java.lang.String p0);

    public static class MLDSA extends android.security.keystore2.AndroidKeyStoreMlDsaSignatureSpi {
        public MLDSA() { super(); }
        protected java.lang.String getAlgorithm() { return null; }
        public boolean supportsAlgorithm(java.lang.String p0) { return false; }
    }

    public static class MLDSA65 extends android.security.keystore2.AndroidKeyStoreMlDsaSignatureSpi {
        public MLDSA65() { super(); }
        protected java.lang.String getAlgorithm() { return null; }
        public boolean supportsAlgorithm(java.lang.String p0) { return false; }
    }

    public static class MLDSA87 extends android.security.keystore2.AndroidKeyStoreMlDsaSignatureSpi {
        public MLDSA87() { super(); }
        protected java.lang.String getAlgorithm() { return null; }
        public boolean supportsAlgorithm(java.lang.String p0) { return false; }
    }
}
