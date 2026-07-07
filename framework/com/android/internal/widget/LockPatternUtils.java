package com.android.internal.widget;

public class LockPatternUtils {
    public static final java.lang.String AUTO_PIN_CONFIRM = "lockscreen.auto_pin_confirm";
    private static final java.lang.String CREDENTIAL_TYPE_API = "getCredentialType";
    public static final int CREDENTIAL_TYPE_NONE = -1;
    public static final int CREDENTIAL_TYPE_PASSWORD = 4;
    public static final int CREDENTIAL_TYPE_PASSWORD_OR_PIN = 2;
    public static final int CREDENTIAL_TYPE_PATTERN = 1;
    public static final int CREDENTIAL_TYPE_PIN = 3;
    public static final int CREDENTIAL_TYPE_UNKNOWN = 0;
    public static final java.lang.String CURRENT_LSKF_BASED_PROTECTOR_ID_KEY = "sp-handle";
    public static final java.lang.String DISABLE_LOCKSCREEN_KEY = "lockscreen.disabled";
    private static final java.lang.String ENABLED_TRUST_AGENTS = "lockscreen.enabledtrustagents";
    public static final byte[] ENCRYPTED_REMOTE_CREDENTIALS_HEADER = null;
    public static final int FAILED_ATTEMPTS_BEFORE_WIPE_GRACE = 5;
    public static final long FAILED_ATTEMPT_COUNTDOWN_INTERVAL_MS = 1000L;
    private static final boolean FRP_CREDENTIAL_ENABLED = true;
    private static final java.lang.String GSI_RUNNING_PROP = "ro.gsid.image_running";
    private static final java.lang.String IS_TRUST_USUALLY_MANAGED = "lockscreen.istrustusuallymanaged";
    private static final java.lang.String KNOWN_TRUST_AGENTS = "lockscreen.knowntrustagents";
    static final java.lang.String LOCKOUT_END_TIME_API = "getLockoutEndTime";
    public static final java.lang.String LOCKSCREEN_POWER_BUTTON_INSTANTLY_LOCKS = "lockscreen.power_button_instantly_locks";
    public static final java.lang.String LOCK_PASSWORD_SALT_KEY = "lockscreen.password_salt";
    private static final java.lang.String LOCK_PIN_ENHANCED_PRIVACY = "pin_enhanced_privacy";
    private static final java.lang.String LOCK_SCREEN_DEVICE_OWNER_INFO = "lockscreen.device_owner_info";
    private static final java.lang.String LOCK_SCREEN_OWNER_INFO = "lock_screen_owner_info";
    private static final java.lang.String LOCK_SCREEN_OWNER_INFO_ENABLED = "lock_screen_owner_info_enabled";
    private static final java.time.Duration MAX_INT_DURATION = null;
    public static final int MIN_AUTO_PIN_REQUIREMENT_LENGTH = 6;
    public static final int MIN_LOCK_PASSWORD_SIZE = 4;
    public static final int MIN_LOCK_PATTERN_SIZE = 4;
    public static final int MIN_PATTERN_REGISTER_FAIL = 4;
    public static final java.lang.String PASSWORD_HISTORY_DELIMITER = ",";
    public static final java.lang.String PASSWORD_HISTORY_KEY = "lockscreen.passwordhistory";
    public static final java.lang.String PASSWORD_TYPE_KEY = "lockscreen.password_type";
    public static final int PIN_LENGTH_UNAVAILABLE = -1;
    private static final java.lang.String TAG = "LockPatternUtils";
    public static final int USER_FRP = -9999;
    public static final int USER_REPAIR_MODE = -9998;
    public static final int VERIFY_FLAG_REQUEST_GK_PW_HANDLE = 1;
    public static final int VERIFY_FLAG_WRITE_REPAIR_MODE_PW = 2;
    private final android.content.ContentResolver mContentResolver = null;
    private final android.content.Context mContext = null;
    private final android.app.PropertyInvalidatedCache<java.lang.Integer, java.lang.Integer> mCredentialTypeCache = null;
    private final android.app.PropertyInvalidatedCache.QueryHandler<java.lang.Integer, java.lang.Integer> mCredentialTypeQuery = null;
    private android.app.admin.DevicePolicyManager mDevicePolicyManager;
    private final android.os.Handler mHandler = null;
    private java.lang.Boolean mHasSecureLockScreen;
    private com.android.internal.widget.ILockSettings mLockSettingsService;
    private final android.app.PropertyInvalidatedCache<java.lang.Integer, java.time.Duration> mLockoutEndTimeCache = null;
    private final android.app.PropertyInvalidatedCache.QueryHandler<java.lang.Integer, java.time.Duration> mLockoutEndTimeQuery = null;
    private final java.util.function.Supplier<java.time.Duration> mTimeSinceBootSupplier = null;
    private android.os.UserManager mUserManager;
    public LockPatternUtils(android.content.Context p0) {}
    public LockPatternUtils(android.content.Context p0, android.os.Looper p1) {}
    public LockPatternUtils(android.content.Context p0, com.android.internal.widget.ILockSettings p1, java.util.function.Supplier<java.time.Duration> p2, android.os.Looper p3) {}
    public static java.util.List<com.android.internal.widget.LockPatternView.Cell> byteArrayToPattern(byte[] p0) { return null; }
    public static boolean canUserEnterRepairMode(android.content.Context p0, android.content.pm.UserInfo p1) { return false; }
    public static int clamp(java.time.Duration p0) { return 0; }
    public static int credentialTypeToPasswordQuality(int p0) { return 0; }
    public static java.lang.String credentialTypeToString(int p0) { return null; }
    private java.util.List<android.content.ComponentName> deserializeTrustAgents(java.lang.String p0) { return null; }
    public static boolean frpCredentialEnabled(android.content.Context p0) { return false; }
    private boolean getBoolean(java.lang.String p0, boolean p1, int p2) { return false; }
    private long getLong(java.lang.String p0, long p1, int p2) { return 0L; }
    private int getRequestedPasswordHistoryLength(int p0) { return 0; }
    private java.lang.String getSalt(int p0) { return null; }
    private java.lang.String getString(java.lang.String p0, int p1) { return null; }
    private android.app.trust.TrustManager getTrustManager() { return null; }
    private android.os.UserManager getUserManager() { return null; }
    public static final void invalidateCredentialTypeCache() {}
    public static final void invalidateLockoutEndTimeCache() {}
    private boolean isCredentialShareableWithParent(int p0) { return false; }
    public static boolean isDeviceEncryptionEnabled() { return false; }
    public static boolean isFileEncryptionEnabled() { return false; }
    public static boolean isGsiRunning() { return false; }
    private boolean isManagedProfile(int p0) { return false; }
    public static boolean isQualityAlphabeticPassword(int p0) { return false; }
    public static boolean isQualityNumericPin(int p0) { return false; }
    public static boolean isRepairModeActive(android.content.Context p0) { return false; }
    public static boolean isRepairModeSupported(android.content.Context p0) { return false; }
    public static boolean isSpecialUserId(int p0) { return false; }
    private static boolean isSpecialUserId(android.content.Context p0, int p1, boolean p2) { return false; }
    private boolean isUseOneLockSettingEnabled(int p0) { return false; }
    public static byte[] patternToByteArray(java.util.List<com.android.internal.widget.LockPatternView.Cell> p0) { return null; }
    public static int pinOrPasswordQualityToCredentialType(int p0) { return 0; }
    private void reportEnabledTrustAgentsChanged(int p0) {}
    private java.lang.String serializeTrustAgents(java.util.Collection<android.content.ComponentName> p0) { return null; }
    private void setBoolean(java.lang.String p0, boolean p1, int p2) {}
    private void setLong(java.lang.String p0, long p1, int p2) {}
    private void setString(java.lang.String p0, java.lang.String p1, int p2) {}
    private static java.time.Duration systemTimeSinceBoot() { return null; }
    private void throwIfCalledOnMainThread() {}
    public static boolean userOwnsFrpCredential(android.content.Context p0, android.content.pm.UserInfo p1) { return false; }
    private com.android.internal.widget.ICheckCredentialProgressCallback wrapCallback(com.android.internal.widget.LockPatternUtils.CheckCredentialProgressCallback p0) { return null; }
    public long addWeakEscrowToken(byte[] p0, int p1, com.android.internal.widget.IWeakEscrowTokenActivatedListener p2) { return 0L; }
    public com.android.internal.widget.VerifyCredentialResponse checkCredential(com.android.internal.widget.LockscreenCredential p0, int p1, com.android.internal.widget.LockPatternUtils.CheckCredentialProgressCallback p2) { return null; }
    public boolean checkPasswordHistory(byte[] p0, byte[] p1, int p2) { return false; }
    public int getActivePasswordQuality(int p0) { return 0; }
    public int getCredentialTypeForUser(int p0) { return 0; }
    public int getCurrentFailedPasswordAttempts(int p0) { return 0; }
    public java.lang.String getDeviceOwnerInfo() { return null; }
    public android.app.admin.DevicePolicyManager getDevicePolicyManager() { return null; }
    public java.util.List<android.content.ComponentName> getEnabledTrustAgents(int p0) { return null; }
    @java.lang.Deprecated
    public int getKeyguardStoredPasswordQuality(int p0) { return 0; }
    public java.util.List<android.content.ComponentName> getKnownTrustAgents(int p0) { return null; }
    public com.android.internal.widget.ILockSettings getLockSettings() { return null; }
    public java.time.Duration getLockoutEndTime(int p0) { return null; }
    public int getMaximumFailedPasswordsForWipe(int p0) { return 0; }
    public int getMaximumPasswordLength(int p0) { return 0; }
    public java.lang.String getOwnerInfo(int p0) { return null; }
    public byte[] getPasswordHistoryHashFactor(com.android.internal.widget.LockscreenCredential p0, int p1) { return null; }
    public int getPinLength(int p0) { return 0; }
    public boolean getPowerButtonInstantlyLocks(int p0) { return false; }
    public int getRequestedMinimumPasswordLength(int p0) { return 0; }
    public int getRequestedPasswordComplexity(int p0) { return 0; }
    public int getRequestedPasswordComplexity(int p0, boolean p1) { return 0; }
    public android.app.admin.PasswordMetrics getRequestedPasswordMetrics(int p0) { return null; }
    public android.app.admin.PasswordMetrics getRequestedPasswordMetrics(int p0, boolean p1) { return null; }
    public int getStrongAuthForUser(int p0) { return 0; }
    public boolean hasPendingEscrowToken(int p0) { return false; }
    public boolean hasSecureLockScreen() { return false; }
    public boolean isAutoPinConfirmEnabled(int p0) { return false; }
    public boolean isBiometricAllowedForUser(int p0) { return false; }
    public boolean isCredentialsDisabledForUser(int p0) { return false; }
    public boolean isDeviceOwnerInfoEnabled() { return false; }
    public boolean isLockPasswordEnabled(int p0) { return false; }
    public boolean isLockPatternEnabled(int p0) { return false; }
    public boolean isLockScreenDisabled(int p0) { return false; }
    public boolean isManagedProfileWithUnifiedChallenge(int p0) { return false; }
    public boolean isOwnerInfoEnabled(int p0) { return false; }
    public boolean isPinEnhancedPrivacyEnabled(int p0) { return false; }
    public boolean isPinEnhancedPrivacyEverChosen(int p0) { return false; }
    public boolean isPowerButtonInstantlyLocksEverChosen(int p0) { return false; }
    public boolean isProfileWithUnifiedChallenge(int p0) { return false; }
    public boolean isSecure(int p0) { return false; }
    public boolean isSeparateProfileChallengeEnabled(int p0) { return false; }
    public boolean isTrustAllowedForUser(int p0) { return false; }
    public boolean isTrustUsuallyManaged(int p0) { return false; }
    public boolean isUserInLockdown(int p0) { return false; }
    public boolean isVisiblePatternEnabled(int p0) { return false; }
    public boolean isVisiblePatternEverChosen(int p0) { return false; }
    public boolean isWeakEscrowTokenActive(long p0, int p1) { return false; }
    public boolean isWeakEscrowTokenValid(long p0, byte[] p1, int p2) { return false; }
    public void prepareToVerifyCredential(int p0) {}
    public boolean refreshStoredPinLength(int p0) { return false; }
    public void registerStrongAuthTracker(com.android.internal.widget.LockPatternUtils.StrongAuthTracker p0) {}
    public boolean registerWeakEscrowTokenRemovedListener(com.android.internal.widget.IWeakEscrowTokenRemovedListener p0) { return false; }
    public void removeCachedUnifiedChallenge(int p0) {}
    public void removeGatekeeperPasswordHandle(long p0) {}
    public boolean removeWeakEscrowToken(long p0, int p1) { return false; }
    public void reportFailedPasswordAttempt(int p0) {}
    public void reportPasswordLockout(java.time.Duration p0, int p1) {}
    public void reportSuccessfulBiometricUnlock(boolean p0, int p1) {}
    public void reportSuccessfulPasswordAttempt(int p0) {}
    public void requireCredentialEntry(int p0) {}
    public void requireStrongAuth(int p0, int p1) {}
    public void resetKeyStore(int p0) {}
    public void scheduleNonStrongBiometricIdleTimeout(int p0) {}
    public void setAutoPinConfirm(boolean p0, int p1) {}
    public void setDeviceOwnerInfo(java.lang.String p0) {}
    public void setEnabledTrustAgents(java.util.Collection<android.content.ComponentName> p0, int p1) {}
    public void setKnownTrustAgents(java.util.Collection<android.content.ComponentName> p0, int p1) {}
    public boolean setLockCredential(com.android.internal.widget.LockscreenCredential p0, com.android.internal.widget.LockscreenCredential p1, int p2) { return false; }
    public void setLockScreenDisabled(boolean p0, int p1) {}
    public void setOwnerInfo(java.lang.String p0, int p1) {}
    public void setOwnerInfoEnabled(boolean p0, int p1) {}
    public void setPinEnhancedPrivacyEnabled(boolean p0, int p1) {}
    public void setPowerButtonInstantlyLocks(boolean p0, int p1) {}
    public void setSeparateProfileChallengeEnabled(int p0, boolean p1, com.android.internal.widget.LockscreenCredential p2) {}
    public void setTrustUsuallyManaged(boolean p0, int p1) {}
    public void setVisiblePatternEnabled(boolean p0, int p1) {}
    public android.app.RemoteLockscreenValidationSession startRemoteLockscreenValidation() { return null; }
    public boolean tryUnlockWithCachedUnifiedChallenge(int p0) { return false; }
    public void unlockUserKeyIfUnsecured(int p0) {}
    public void unregisterStrongAuthTracker(com.android.internal.widget.LockPatternUtils.StrongAuthTracker p0) {}
    public boolean unregisterWeakEscrowTokenRemovedListener(com.android.internal.widget.IWeakEscrowTokenRemovedListener p0) { return false; }
    public void userPresent(int p0) {}
    public android.app.RemoteLockscreenValidationResult validateRemoteLockscreen(byte[] p0) { return null; }
    public com.android.internal.widget.VerifyCredentialResponse verifyCredential(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) { return null; }
    public com.android.internal.widget.VerifyCredentialResponse verifyGatekeeperPasswordHandle(long p0, long p1, int p2) { return null; }
    public com.android.internal.widget.VerifyCredentialResponse verifyTiedProfileChallenge(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) { return null; }
    public boolean writeRepairModeCredential(int p0) { return false; }

    public static interface CheckCredentialProgressCallback {
        public void onEarlyMatched();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CredentialType {
    }

    public static class StrongAuthTracker {
        private static final int ALLOWING_BIOMETRIC = 5892;
        public static final int PRIMARY_AUTH_REQUIRED_FOR_SECURE_LOCK_DEVICE = 2048;
        public static final int SOME_AUTH_REQUIRED_AFTER_ADAPTIVE_AUTH_REQUEST = 512;
        public static final int SOME_AUTH_REQUIRED_AFTER_TRUSTAGENT_EXPIRED = 256;
        public static final int SOME_AUTH_REQUIRED_AFTER_USER_REQUEST = 4;
        public static final int SOME_AUTH_REQUIRED_AFTER_WATCH_DISCONNECTED = 1024;
        public static final int STRONG_AUTH_NOT_REQUIRED = 0;
        public static final int STRONG_AUTH_REQUIRED_AFTER_BOOT = 1;
        public static final int STRONG_AUTH_REQUIRED_AFTER_DPM_LOCK_NOW = 2;
        public static final int STRONG_AUTH_REQUIRED_AFTER_LOCKOUT = 8;
        public static final int STRONG_AUTH_REQUIRED_AFTER_NON_STRONG_BIOMETRICS_TIMEOUT = 128;
        public static final int STRONG_AUTH_REQUIRED_AFTER_TIMEOUT = 16;
        public static final int STRONG_AUTH_REQUIRED_AFTER_USER_LOCKDOWN = 32;
        public static final int STRONG_AUTH_REQUIRED_FOR_UNATTENDED_UPDATE = 64;
        public static final int STRONG_BIOMETRIC_AUTH_REQUIRED_FOR_SECURE_LOCK_DEVICE = 4096;
        private final boolean mDefaultIsNonStrongBiometricAllowed = false;
        private final int mDefaultStrongAuthFlags = 0;
        private final com.android.internal.widget.LockPatternUtils.StrongAuthTracker.H mHandler = null;
        private final android.util.SparseBooleanArray mIsNonStrongBiometricAllowedForUser = null;
        private final android.util.SparseIntArray mStrongAuthRequiredForUser = null;
        private final android.app.trust.IStrongAuthTracker.Stub mStub = null;
        public StrongAuthTracker(android.content.Context p0) {}
        public StrongAuthTracker(android.content.Context p0, android.os.Looper p1) {}
        public static int getDefaultFlags(android.content.Context p0) { return 0; }
        public int getStrongAuthForUser(int p0) { return 0; }
        public android.app.trust.IStrongAuthTracker.Stub getStub() { return null; }
        protected void handleIsNonStrongBiometricAllowedChanged(boolean p0, int p1) {}
        protected void handleStrongAuthRequiredChanged(int p0, int p1) {}
        public boolean isBiometricAllowedForUser(boolean p0, int p1) { return false; }
        public boolean isNonStrongBiometricAllowedAfterIdleTimeout(int p0) { return false; }
        public boolean isTrustAllowedForUser(int p0) { return false; }
        public void onIsNonStrongBiometricAllowedChanged(int p0) {}
        public void onStrongAuthRequiredChanged(int p0) {}

        private class H extends android.os.Handler {
            static final int MSG_ON_IS_NON_STRONG_BIOMETRIC_ALLOWED_CHANGED = 2;
            static final int MSG_ON_STRONG_AUTH_REQUIRED_CHANGED = 1;
            public H(com.android.internal.widget.LockPatternUtils.StrongAuthTracker p0, android.os.Looper p1) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface StrongAuthFlags {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VerifyFlag {
    }

    private static class WrappedCallback extends com.android.internal.widget.ICheckCredentialProgressCallback.Stub {
        private com.android.internal.widget.LockPatternUtils.CheckCredentialProgressCallback mCallback;
        private android.os.Handler mHandler;
        WrappedCallback(android.os.Handler p0, com.android.internal.widget.LockPatternUtils.CheckCredentialProgressCallback p1) { super(); }
        public void onCredentialVerified() throws android.os.RemoteException {}
    }
}
