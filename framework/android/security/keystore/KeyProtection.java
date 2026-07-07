package android.security.keystore;

public final class KeyProtection implements java.security.KeyStore.ProtectionParameter, android.security.keystore.UserAuthArgs {
    private final java.lang.String[] mBlockModes = null;
    private final long mBoundToSecureUserId = 0L;
    private final boolean mCriticalToDeviceEncryption = false;
    private final java.lang.String[] mDigests = null;
    private final java.lang.String[] mEncryptionPaddings = null;
    private final boolean mInvalidatedByBiometricEnrollment = false;
    private final boolean mIsStrongBoxBacked = false;
    private final java.util.Date mKeyValidityForConsumptionEnd = null;
    private final java.util.Date mKeyValidityForOriginationEnd = null;
    private final java.util.Date mKeyValidityStart = null;
    private final int mMaxUsageCount = 0;
    private final java.util.Set<java.lang.String> mMgf1Digests = null;
    private final int mPurposes = 0;
    private final boolean mRandomizedEncryptionRequired = false;
    private final boolean mRollbackResistant = false;
    private final java.lang.String[] mSignaturePaddings = null;
    private final boolean mUnlockedDeviceRequired = false;
    private final boolean mUserAuthenticationRequired = false;
    private final int mUserAuthenticationType = 0;
    private final boolean mUserAuthenticationValidWhileOnBody = false;
    private final int mUserAuthenticationValidityDurationSeconds = 0;
    private final boolean mUserConfirmationRequired = false;
    private final boolean mUserPresenceRequred = false;
    private KeyProtection(java.util.Date p0, java.util.Date p1, java.util.Date p2, int p3, java.lang.String[] p4, java.lang.String[] p5, java.lang.String[] p6, java.util.Set<java.lang.String> p7, java.lang.String[] p8, boolean p9, boolean p10, int p11, int p12, boolean p13, boolean p14, boolean p15, long p16, boolean p17, boolean p18, boolean p19, boolean p20, int p21, boolean p22) {}
    public java.lang.String[] getBlockModes() { return null; }
    public long getBoundToSpecificSecureUserId() { return 0L; }
    public java.lang.String[] getDigests() { return null; }
    public java.lang.String[] getEncryptionPaddings() { return null; }
    public java.util.Date getKeyValidityForConsumptionEnd() { return null; }
    public java.util.Date getKeyValidityForOriginationEnd() { return null; }
    public java.util.Date getKeyValidityStart() { return null; }
    public int getMaxUsageCount() { return 0; }
    public java.util.Set<java.lang.String> getMgf1Digests() { return null; }
    public int getPurposes() { return 0; }
    public java.lang.String[] getSignaturePaddings() { return null; }
    public int getUserAuthenticationType() { return 0; }
    public int getUserAuthenticationValidityDurationSeconds() { return 0; }
    public boolean isCriticalToDeviceEncryption() { return false; }
    public boolean isDigestsSpecified() { return false; }
    public boolean isInvalidatedByBiometricEnrollment() { return false; }
    public boolean isMgf1DigestsSpecified() { return false; }
    public boolean isRandomizedEncryptionRequired() { return false; }
    public boolean isRollbackResistant() { return false; }
    public boolean isStrongBoxBacked() { return false; }
    public boolean isUnlockedDeviceRequired() { return false; }
    public boolean isUserAuthenticationRequired() { return false; }
    public boolean isUserAuthenticationValidWhileOnBody() { return false; }
    public boolean isUserConfirmationRequired() { return false; }
    public boolean isUserPresenceRequired() { return false; }

    public static final class Builder {
        private java.lang.String mAttestKeyAlias;
        private java.lang.String[] mBlockModes;
        private long mBoundToSecureUserId;
        private boolean mCriticalToDeviceEncryption;
        private java.lang.String[] mDigests;
        private java.lang.String[] mEncryptionPaddings;
        private boolean mInvalidatedByBiometricEnrollment;
        private boolean mIsStrongBoxBacked;
        private java.util.Date mKeyValidityForConsumptionEnd;
        private java.util.Date mKeyValidityForOriginationEnd;
        private java.util.Date mKeyValidityStart;
        private int mMaxUsageCount;
        private java.util.Set<java.lang.String> mMgf1Digests;
        private int mPurposes;
        private boolean mRandomizedEncryptionRequired;
        private boolean mRollbackResistant;
        private java.lang.String[] mSignaturePaddings;
        private boolean mUnlockedDeviceRequired;
        private boolean mUserAuthenticationRequired;
        private int mUserAuthenticationType;
        private boolean mUserAuthenticationValidWhileOnBody;
        private int mUserAuthenticationValidityDurationSeconds;
        private boolean mUserConfirmationRequired;
        private boolean mUserPresenceRequired;
        public Builder(int p0) {}
        public android.security.keystore.KeyProtection build() { return null; }
        public android.security.keystore.KeyProtection.Builder setBlockModes(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setBoundToSpecificSecureUserId(long p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setCriticalToDeviceEncryption(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setDigests(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setEncryptionPaddings(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setInvalidatedByBiometricEnrollment(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setIsStrongBoxBacked(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setKeyValidityEnd(java.util.Date p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setKeyValidityForConsumptionEnd(java.util.Date p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setKeyValidityForOriginationEnd(java.util.Date p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setKeyValidityStart(java.util.Date p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setMaxUsageCount(int p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setMgf1Digests(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setRandomizedEncryptionRequired(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setRollbackResistant(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setSignaturePaddings(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setUnlockedDeviceRequired(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setUserAuthenticationParameters(int p0, int p1) { return null; }
        public android.security.keystore.KeyProtection.Builder setUserAuthenticationRequired(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setUserAuthenticationValidWhileOnBody(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.security.keystore.KeyProtection.Builder setUserAuthenticationValidityDurationSeconds(int p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setUserConfirmationRequired(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setUserPresenceRequired(boolean p0) { return null; }
    }
}
