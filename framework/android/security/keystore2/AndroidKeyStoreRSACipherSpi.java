package android.security.keystore2;

abstract class AndroidKeyStoreRSACipherSpi extends android.security.keystore2.AndroidKeyStoreCipherSpiBase {
    private final int mKeymasterPadding = 0;
    private int mKeymasterPaddingOverride;
    private int mModulusSizeBytes;
    AndroidKeyStoreRSACipherSpi(int p0) { super(); }
    protected void addAlgorithmSpecificParametersToBegin(java.util.List<android.hardware.security.keymint.KeyParameter> p0) {}
    protected boolean adjustConfigForEncryptingWithPrivateKey() { return false; }
    protected final int engineGetBlockSize() { return 0; }
    protected final byte[] engineGetIV() { return null; }
    protected final int engineGetOutputSize(int p0) { return 0; }
    protected final int getKeymasterPaddingOverride() { return 0; }
    protected final int getModulusSizeBytes() { return 0; }
    protected java.lang.String getTransform() { return null; }
    protected final void initKey(int p0, java.security.Key p1) throws java.security.InvalidKeyException {}
    protected void loadAlgorithmSpecificParametersFromBeginResult(android.hardware.security.keymint.KeyParameter[] p0) {}
    protected final void resetAll() {}
    protected final void resetWhilePreservingInitState() {}
    protected final void setKeymasterPaddingOverride(int p0) {}

    public static final class NoPadding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi {
        public NoPadding() { super(0); }
        protected boolean adjustConfigForEncryptingWithPrivateKey() { return false; }
        protected java.security.AlgorithmParameters engineGetParameters() { return null; }
        protected final int getAdditionalEntropyAmountForBegin() { return 0; }
        protected final int getAdditionalEntropyAmountForFinish() { return 0; }
        protected void initAlgorithmSpecificParameters() throws java.security.InvalidKeyException {}
        protected void initAlgorithmSpecificParameters(java.security.AlgorithmParameters p0) throws java.security.InvalidAlgorithmParameterException {}
        protected void initAlgorithmSpecificParameters(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
    }

    static abstract class OAEPWithMGF1Padding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi {
        private static final java.lang.String MGF_ALGORITHM_MGF1 = "MGF1";
        private int mDigestOutputSizeBytes;
        private int mKeymasterDigest;
        private int mKeymasterMgf1Digest;
        OAEPWithMGF1Padding(int p0) { super(0); }
        private static boolean isMgfDigestTagPresentInKeyProperties(android.system.keystore2.Authorization[] p0) { return false; }
        protected final void addAlgorithmSpecificParametersToBegin(java.util.List<android.hardware.security.keymint.KeyParameter> p0, android.system.keystore2.Authorization[] p1) {}
        protected final java.security.AlgorithmParameters engineGetParameters() { return null; }
        protected final int getAdditionalEntropyAmountForBegin() { return 0; }
        protected final int getAdditionalEntropyAmountForFinish() { return 0; }
        protected final java.lang.String getTransform() { return null; }
        protected final void initAlgorithmSpecificParameters() throws java.security.InvalidKeyException {}
        protected final void initAlgorithmSpecificParameters(java.security.AlgorithmParameters p0) throws java.security.InvalidAlgorithmParameterException {}
        protected final void initAlgorithmSpecificParameters(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
        protected final void loadAlgorithmSpecificParametersFromBeginResult(android.hardware.security.keymint.KeyParameter[] p0) {}
    }

    public static class OAEPWithSHA1AndMGF1Padding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi.OAEPWithMGF1Padding {
        public OAEPWithSHA1AndMGF1Padding() { super(0); }
    }

    public static class OAEPWithSHA224AndMGF1Padding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi.OAEPWithMGF1Padding {
        public OAEPWithSHA224AndMGF1Padding() { super(0); }
    }

    public static class OAEPWithSHA256AndMGF1Padding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi.OAEPWithMGF1Padding {
        public OAEPWithSHA256AndMGF1Padding() { super(0); }
    }

    public static class OAEPWithSHA384AndMGF1Padding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi.OAEPWithMGF1Padding {
        public OAEPWithSHA384AndMGF1Padding() { super(0); }
    }

    public static class OAEPWithSHA512AndMGF1Padding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi.OAEPWithMGF1Padding {
        public OAEPWithSHA512AndMGF1Padding() { super(0); }
    }

    public static final class PKCS1Padding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi {
        public PKCS1Padding() { super(0); }
        protected boolean adjustConfigForEncryptingWithPrivateKey() { return false; }
        protected java.security.AlgorithmParameters engineGetParameters() { return null; }
        protected final int getAdditionalEntropyAmountForBegin() { return 0; }
        protected final int getAdditionalEntropyAmountForFinish() { return 0; }
        protected void initAlgorithmSpecificParameters() throws java.security.InvalidKeyException {}
        protected void initAlgorithmSpecificParameters(java.security.AlgorithmParameters p0) throws java.security.InvalidAlgorithmParameterException {}
        protected void initAlgorithmSpecificParameters(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
    }
}
