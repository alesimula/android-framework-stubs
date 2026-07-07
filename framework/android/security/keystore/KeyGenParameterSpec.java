package android.security.keystore;

public final class KeyGenParameterSpec implements java.security.spec.AlgorithmParameterSpec, android.security.keystore.UserAuthArgs {
    private static final javax.security.auth.x500.X500Principal DEFAULT_ATTESTATION_CERT_SUBJECT = null;
    private static final java.util.Date DEFAULT_CERT_NOT_AFTER = null;
    private static final java.util.Date DEFAULT_CERT_NOT_BEFORE = null;
    private static final java.math.BigInteger DEFAULT_CERT_SERIAL_NUMBER = null;
    private static final javax.security.auth.x500.X500Principal DEFAULT_SELF_SIGNED_CERT_SUBJECT = null;
    private final java.lang.String mAttestKeyAlias = null;
    private final byte[] mAttestationChallenge = null;
    private final int[] mAttestationIds = null;
    private final java.lang.String[] mBlockModes = null;
    private final long mBoundToSecureUserId = 0L;
    private final java.util.Date mCertificateNotAfter = null;
    private final java.util.Date mCertificateNotBefore = null;
    private final java.math.BigInteger mCertificateSerialNumber = null;
    private final javax.security.auth.x500.X500Principal mCertificateSubject = null;
    private final boolean mCriticalToDeviceEncryption = false;
    private final boolean mDevicePropertiesAttestationIncluded = false;
    private final java.lang.String[] mDigests = null;
    private final java.lang.String[] mEncryptionPaddings = null;
    private final boolean mInvalidatedByBiometricEnrollment = false;
    private final boolean mIsStrongBoxBacked = false;
    private final int mKeySize = 0;
    private final java.util.Date mKeyValidityForConsumptionEnd = null;
    private final java.util.Date mKeyValidityForOriginationEnd = null;
    private final java.util.Date mKeyValidityStart = null;
    private final java.lang.String mKeystoreAlias = null;
    private final int mMaxUsageCount = 0;
    private final java.util.Set<java.lang.String> mMgf1Digests = null;
    private final int mNamespace = 0;
    private final int mPurposes = 0;
    private final boolean mRandomizedEncryptionRequired = false;
    private final java.lang.String[] mSignaturePaddings = null;
    private final java.security.spec.AlgorithmParameterSpec mSpec = null;
    private final boolean mUniqueIdIncluded = false;
    private final boolean mUnlockedDeviceRequired = false;
    private final boolean mUserAuthenticationRequired = false;
    private final int mUserAuthenticationType = 0;
    private final boolean mUserAuthenticationValidWhileOnBody = false;
    private final int mUserAuthenticationValidityDurationSeconds = 0;
    private final boolean mUserConfirmationRequired = false;
    private final boolean mUserPresenceRequired = false;
    public KeyGenParameterSpec(java.lang.String p0, int p1, int p2, java.security.spec.AlgorithmParameterSpec p3, javax.security.auth.x500.X500Principal p4, java.math.BigInteger p5, java.util.Date p6, java.util.Date p7, java.util.Date p8, java.util.Date p9, java.util.Date p10, int p11, java.lang.String[] p12, java.util.Set<java.lang.String> p13, java.lang.String[] p14, java.lang.String[] p15, java.lang.String[] p16, boolean p17, boolean p18, int p19, int p20, boolean p21, byte[] p22, boolean p23, int[] p24, boolean p25, boolean p26, boolean p27, boolean p28, boolean p29, boolean p30, boolean p31, int p32, java.lang.String p33, long p34) {}
    public java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec() { return null; }
    public java.lang.String getAttestKeyAlias() { return null; }
    public byte[] getAttestationChallenge() { return null; }
    @android.annotation.SystemApi
    public int[] getAttestationIds() { return null; }
    public java.lang.String[] getBlockModes() { return null; }
    public long getBoundToSpecificSecureUserId() { return 0L; }
    public java.util.Date getCertificateNotAfter() { return null; }
    public java.util.Date getCertificateNotBefore() { return null; }
    public java.math.BigInteger getCertificateSerialNumber() { return null; }
    public javax.security.auth.x500.X500Principal getCertificateSubject() { return null; }
    public java.lang.String[] getDigests() { return null; }
    public java.lang.String[] getEncryptionPaddings() { return null; }
    public int getKeySize() { return 0; }
    public java.util.Date getKeyValidityForConsumptionEnd() { return null; }
    public java.util.Date getKeyValidityForOriginationEnd() { return null; }
    public java.util.Date getKeyValidityStart() { return null; }
    public java.lang.String getKeystoreAlias() { return null; }
    public int getMaxUsageCount() { return 0; }
    public java.util.Set<java.lang.String> getMgf1Digests() { return null; }
    @android.annotation.SystemApi
    public int getNamespace() { return 0; }
    public int getPurposes() { return 0; }
    public java.lang.String[] getSignaturePaddings() { return null; }
    @java.lang.Deprecated
    public int getUid() { return 0; }
    public int getUserAuthenticationType() { return 0; }
    public int getUserAuthenticationValidityDurationSeconds() { return 0; }
    public boolean isCriticalToDeviceEncryption() { return false; }
    public boolean isDevicePropertiesAttestationIncluded() { return false; }
    public boolean isDigestsSpecified() { return false; }
    public boolean isInvalidatedByBiometricEnrollment() { return false; }
    public boolean isMgf1DigestsSpecified() { return false; }
    public boolean isRandomizedEncryptionRequired() { return false; }
    public boolean isStrongBoxBacked() { return false; }
    public boolean isUniqueIdIncluded() { return false; }
    public boolean isUnlockedDeviceRequired() { return false; }
    public boolean isUserAuthenticationRequired() { return false; }
    public boolean isUserAuthenticationValidWhileOnBody() { return false; }
    public boolean isUserConfirmationRequired() { return false; }
    public boolean isUserPresenceRequired() { return false; }

    public static final class Builder {
        private java.lang.String mAttestKeyAlias;
        private byte[] mAttestationChallenge;
        private int[] mAttestationIds;
        private java.lang.String[] mBlockModes;
        private long mBoundToSecureUserId;
        private java.util.Date mCertificateNotAfter;
        private java.util.Date mCertificateNotBefore;
        private java.math.BigInteger mCertificateSerialNumber;
        private javax.security.auth.x500.X500Principal mCertificateSubject;
        private boolean mCriticalToDeviceEncryption;
        private boolean mDevicePropertiesAttestationIncluded;
        private java.lang.String[] mDigests;
        private java.lang.String[] mEncryptionPaddings;
        private boolean mInvalidatedByBiometricEnrollment;
        private boolean mIsStrongBoxBacked;
        private int mKeySize;
        private java.util.Date mKeyValidityForConsumptionEnd;
        private java.util.Date mKeyValidityForOriginationEnd;
        private java.util.Date mKeyValidityStart;
        private final java.lang.String mKeystoreAlias = null;
        private int mMaxUsageCount;
        private java.util.Set<java.lang.String> mMgf1Digests;
        private int mNamespace;
        private int mPurposes;
        private boolean mRandomizedEncryptionRequired;
        private java.lang.String[] mSignaturePaddings;
        private java.security.spec.AlgorithmParameterSpec mSpec;
        private boolean mUniqueIdIncluded;
        private boolean mUnlockedDeviceRequired;
        private boolean mUserAuthenticationRequired;
        private int mUserAuthenticationType;
        private boolean mUserAuthenticationValidWhileOnBody;
        private int mUserAuthenticationValidityDurationSeconds;
        private boolean mUserConfirmationRequired;
        private boolean mUserPresenceRequired;
        public Builder(android.security.keystore.KeyGenParameterSpec p0) {}
        public Builder(java.lang.String p0, int p1) {}
        public android.security.keystore.KeyGenParameterSpec build() { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setAlgorithmParameterSpec(java.security.spec.AlgorithmParameterSpec p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setAttestKeyAlias(java.lang.String p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setAttestationChallenge(byte[] p0) { return null; }
        @android.annotation.SystemApi
        public android.security.keystore.KeyGenParameterSpec.Builder setAttestationIds(int[] p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setBlockModes(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setBoundToSpecificSecureUserId(long p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setCertificateNotAfter(java.util.Date p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setCertificateNotBefore(java.util.Date p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setCertificateSerialNumber(java.math.BigInteger p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setCertificateSubject(javax.security.auth.x500.X500Principal p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setCriticalToDeviceEncryption(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setDevicePropertiesAttestationIncluded(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setDigests(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setEncryptionPaddings(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setInvalidatedByBiometricEnrollment(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setIsStrongBoxBacked(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setKeySize(int p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityEnd(java.util.Date p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityForConsumptionEnd(java.util.Date p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityForOriginationEnd(java.util.Date p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityStart(java.util.Date p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setMaxUsageCount(int p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setMgf1Digests(java.lang.String... p0) { return null; }
        @android.annotation.SystemApi
        public android.security.keystore.KeyGenParameterSpec.Builder setNamespace(int p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setRandomizedEncryptionRequired(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setSignaturePaddings(java.lang.String... p0) { return null; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public android.security.keystore.KeyGenParameterSpec.Builder setUid(int p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setUniqueIdIncluded(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setUnlockedDeviceRequired(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationParameters(int p0, int p1) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationRequired(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationValidWhileOnBody(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationValidityDurationSeconds(int p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setUserConfirmationRequired(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setUserPresenceRequired(boolean p0) { return null; }
    }
}
