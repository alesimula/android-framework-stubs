package android.security.keystore2;

public abstract class AndroidKeyStoreKeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private static final int ALGORITHM_ED25519 = 1204;
    private static final int ALGORITHM_XDH = 1203;
    private static final java.lang.String CURVE_ED25519 = null;
    private static final java.lang.String CURVE_X25519 = null;
    private static final int EC_DEFAULT_KEY_SIZE = 256;
    private static final int NO_KEY_SIZE = -1;
    private static final int RSA_DEFAULT_KEY_SIZE = 2048;
    private static final int RSA_MAX_KEY_SIZE = 8192;
    private static final int RSA_MIN_KEY_SIZE = 512;
    private static final java.util.List<java.lang.String> SUPPORTED_EC_CURVE_NAMES = null;
    private static final java.util.Map<java.lang.String, java.lang.Integer> SUPPORTED_EC_CURVE_NAME_TO_SIZE = null;
    private static final java.util.List<java.lang.Integer> SUPPORTED_EC_CURVE_SIZES = null;
    private static final java.lang.String TAG = "AndroidKeyStoreKeyPairGeneratorSpi";
    private android.system.keystore2.KeyDescriptor mAttestKeyDescriptor;
    private java.lang.String mEcCurveName;
    private java.lang.String mEntryAlias;
    private int mEntryNamespace;
    private java.lang.String mJcaKeyAlgorithm;
    private int mKeySizeBits;
    private android.security.KeyStore2 mKeyStore;
    private int mKeymasterAlgorithm;
    private int[] mKeymasterBlockModes;
    private int[] mKeymasterDigests;
    private int[] mKeymasterEncryptionPaddings;
    private int[] mKeymasterMgf1Digests;
    private int[] mKeymasterPurposes;
    private int[] mKeymasterSignaturePaddings;
    private java.lang.String mMlDsaAlgorithmName;
    private int mMlDsaVariantTag;
    private final int mOriginalKeymasterAlgorithm = 0;
    private java.lang.Long mRSAPublicExponent;
    private java.security.SecureRandom mRng;
    private android.security.keystore.KeyGenParameterSpec mSpec;
    protected AndroidKeyStoreKeyPairGeneratorSpi(int p0) { super(); }
    protected AndroidKeyStoreKeyPairGeneratorSpi(int p0, java.lang.String p1) { super(); }
    private void addAlgorithmSpecificParameters(java.util.List<android.hardware.security.keymint.KeyParameter> p0) {}
    private void addAttestationParameters(java.util.List<android.hardware.security.keymint.KeyParameter> p0) throws java.security.ProviderException, java.lang.IllegalArgumentException, android.security.keystore.DeviceIdAttestationException {}
    private android.system.keystore2.KeyDescriptor buildAndCheckAttestKeyDescriptor(android.security.keystore.KeyGenParameterSpec p0) throws java.security.InvalidAlgorithmParameterException { return null; }
    private android.security.keystore.KeyGenParameterSpec buildKeyGenParameterSpecFromLegacy(android.security.KeyPairGeneratorSpec p0, int p1) { return null; }
    private void checkAttestKeyChallenge(android.security.keystore.KeyGenParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
    private void checkAttestKeyPurpose(android.security.keystore.KeyGenParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
    private void checkAttestKeyPurpose(android.system.keystore2.Authorization[] p0) throws java.security.InvalidAlgorithmParameterException {}
    private void checkAttestKeySecurityLevel(android.security.keystore.KeyGenParameterSpec p0, android.system.keystore2.KeyEntryResponse p1) throws java.security.InvalidAlgorithmParameterException {}
    private void checkCorrectKeyPurposeIfCurve25519(android.security.keystore.KeyGenParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
    private static void checkValidKeySize(int p0, int p1, boolean p2, java.lang.String p3) throws java.security.InvalidAlgorithmParameterException {}
    private java.util.Collection<android.hardware.security.keymint.KeyParameter> constructKeyGenerationArguments() throws android.security.keystore.DeviceIdAttestationException, java.lang.IllegalArgumentException, java.security.InvalidAlgorithmParameterException { return null; }
    private static int getDefaultKeySize(int p0) { return 0; }
    private int getKeymasterAlgorithmFromLegacy(int p0, android.security.KeyPairGeneratorSpec p1) throws java.security.InvalidAlgorithmParameterException { return 0; }
    private static boolean getMgf1DigestSetterFlag() { return false; }
    private static boolean hasOnlyAllowedPurposeForEd25519(int p0) { return false; }
    private void initAlgorithmSpecificParameters() throws java.security.InvalidAlgorithmParameterException {}
    private static boolean isCurve25519(java.lang.String p0) { return false; }
    private boolean isPropertyEmptyOrUnknown(java.lang.String p0) { return false; }
    private static int keySizeAndNameToEcCurve(int p0, java.lang.String p1) throws java.security.InvalidAlgorithmParameterException { return 0; }
    private void resetAll() {}
    private void validateDigests() throws java.security.InvalidAlgorithmParameterException {}
    public java.security.KeyPair generateKeyPair() { return null; }
    public void initialize(int p0, java.security.SecureRandom p1) throws java.security.InvalidParameterException {}
    public void initialize(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}

    public static class EC extends android.security.keystore2.AndroidKeyStoreKeyPairGeneratorSpi {
        public EC() { super(0); }
    }

    public static class ED25519 extends android.security.keystore2.AndroidKeyStoreKeyPairGeneratorSpi {
        public ED25519() { super(0); }
    }

    public static class MLDSA extends android.security.keystore2.AndroidKeyStoreKeyPairGeneratorSpi {
        public MLDSA() { super(0); }
    }

    public static class MLDSA65 extends android.security.keystore2.AndroidKeyStoreKeyPairGeneratorSpi {
        public MLDSA65() { super(0); }
    }

    public static class MLDSA87 extends android.security.keystore2.AndroidKeyStoreKeyPairGeneratorSpi {
        public MLDSA87() { super(0); }
    }

    public static class RSA extends android.security.keystore2.AndroidKeyStoreKeyPairGeneratorSpi {
        public RSA() { super(0); }
    }

    public static class XDH extends android.security.keystore2.AndroidKeyStoreKeyPairGeneratorSpi {
        public XDH() { super(0); }
    }
}
