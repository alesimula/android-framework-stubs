package android.app.trust;

public class TrustManager {
    public static final java.lang.String ACTION_BIND_SIGNIFICANT_PLACE_PROVIDER = "com.android.trust.provider.SignificantPlaceProvider.BIND";
    private static final java.lang.String DATA_FLAGS = "initiatedByUser";
    private static final java.lang.String DATA_GRANTED_MESSAGES = "grantedMessages";
    private static final java.lang.String DATA_MESSAGE = "message";
    private static final java.lang.String DATA_NEWLY_UNLOCKED = "newlyUnlocked";
    private static final int MSG_ENABLED_TRUST_AGENTS_CHANGED = 4;
    private static final int MSG_IS_ACTIVE_UNLOCK_RUNNING = 5;
    private static final int MSG_TRUST_CHANGED = 1;
    private static final int MSG_TRUST_ERROR = 3;
    private static final int MSG_TRUST_MANAGED_CHANGED = 2;
    private static final java.lang.String TAG = "TrustManager";
    private final android.os.Handler mHandler = null;
    private final android.app.trust.ITrustManager mService = null;
    private final android.util.ArrayMap<android.app.trust.TrustManager.TrustListener, android.app.trust.ITrustListener> mTrustListeners = null;
    public TrustManager(android.os.IBinder p0) {}
    public void clearAllBiometricRecognized(android.hardware.biometrics.BiometricSourceType p0, int p1) {}
    public boolean isActiveUnlockRunning(int p0) { return false; }
    public boolean isInSignificantPlace() { return false; }
    public boolean isTrustUsuallyManaged(int p0) { return false; }
    public void registerDeviceLockedStateListener(com.android.internal.policy.IDeviceLockedStateListener p0, int p1) {}
    public void registerTrustListener(android.app.trust.TrustManager.TrustListener p0) {}
    public void reportEnabledTrustAgentsChanged(int p0) {}
    public void reportKeyguardShowingChanged() {}
    public void reportUnlockAttempt(boolean p0, int p1) {}
    public void reportUnlockLockout(int p0, int p1) {}
    public void reportUserMayRequestUnlock(int p0) {}
    public void reportUserRequestedUnlock(int p0, boolean p1) {}
    public void setDeviceLockedForUser(int p0, boolean p1) {}
    public void unlockedByBiometricForUser(int p0, android.hardware.biometrics.BiometricSourceType p1) {}
    public void unregisterDeviceLockedStateListener(com.android.internal.policy.IDeviceLockedStateListener p0) {}
    public void unregisterTrustListener(android.app.trust.TrustManager.TrustListener p0) {}

    public static interface TrustListener {
        public void onEnabledTrustAgentsChanged(int p0);
        public void onIsActiveUnlockRunningChanged(boolean p0, int p1);
        public void onTrustChanged(boolean p0, boolean p1, int p2, int p3, java.util.List<java.lang.String> p4);
        public void onTrustError(java.lang.CharSequence p0);
        public void onTrustManagedChanged(boolean p0, int p1);
    }
}
