package android.security.authenticationpolicy;

@android.annotation.SystemApi
public final class AuthenticationPolicyManager {
    private static final boolean DEBUG = Boolean.valueOf(false);
    @android.annotation.SystemApi
    public static final int ERROR_ALREADY_ENABLED = 6;
    @android.annotation.SystemApi
    public static final int ERROR_INSUFFICIENT_BIOMETRICS = 5;
    @android.annotation.SystemApi
    public static final int ERROR_INVALID_PARAMS = 3;
    @android.annotation.SystemApi
    public static final int ERROR_NOT_AUTHORIZED = 7;
    @android.annotation.SystemApi
    public static final int ERROR_NO_BIOMETRICS_ENROLLED = 4;
    @android.annotation.SystemApi
    public static final int ERROR_UNKNOWN = 1;
    @android.annotation.SystemApi
    public static final int ERROR_UNSUPPORTED = 2;
    @android.annotation.SystemApi
    public static final int SUCCESS = 0;
    private static final java.lang.String TAG = "AuthenticationPolicyManager";
    private final android.security.authenticationpolicy.IAuthenticationPolicyService mAuthenticationPolicyService = null;
    private final android.content.Context mContext = null;
    private final java.util.concurrent.ConcurrentHashMap<android.security.authenticationpolicy.AuthenticationPolicyManager.SecureLockDeviceStatusListener, android.security.authenticationpolicy.ISecureLockDeviceStatusListener.Stub> mSecureLockDeviceStatusListeners = null;
    public AuthenticationPolicyManager(android.content.Context p0, android.security.authenticationpolicy.IAuthenticationPolicyService p1) {}
    public void cancelWatchRangingForRequestId(long p0) {}
    @android.annotation.SystemApi
    public void createCrossDeviceAuthenticationRequest(android.companion.DeviceId p0, java.lang.String p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<byte[], android.security.authenticationpolicy.CrossDeviceAuthenticationException> p3) {}
    public void createTestCrossDeviceAuthenticationRequest(android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo p0, android.companion.DeviceId p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<byte[], android.security.authenticationpolicy.CrossDeviceAuthenticationException> p3) {}
    public int disableSecureLockDevice(int p0, android.security.authenticationpolicy.DisableSecureLockDeviceParams p1) { return 0; }
    @android.annotation.SystemApi
    public int disableSecureLockDevice(android.security.authenticationpolicy.DisableSecureLockDeviceParams p0) { return 0; }
    @android.annotation.SystemApi
    public int enableSecureLockDevice(android.security.authenticationpolicy.EnableSecureLockDeviceParams p0) { return 0; }
    @android.annotation.SystemApi
    public int getSecureLockDeviceAvailability() { return 0; }
    @android.annotation.SystemApi
    public boolean isSecureLockDeviceEnabled() { return false; }
    public void isWatchRangingAvailable(android.proximity.IProximityResultCallback p0) {}
    @android.annotation.SystemApi
    public void parseCrossDeviceAuthenticationRequest(byte[] p0, java.lang.String p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage, android.security.authenticationpolicy.CrossDeviceAuthenticationException> p3) {}
    @android.annotation.SystemApi
    public void registerSecureLockDeviceStatusListener(java.util.concurrent.Executor p0, android.security.authenticationpolicy.AuthenticationPolicyManager.SecureLockDeviceStatusListener p1) {}
    public void setSecureLockDeviceTestStatus(boolean p0) {}
    public void startWatchRangingForIdentityCheck(long p0, android.proximity.IProximityResultCallback p1, android.os.Handler p2) {}
    @android.annotation.SystemApi
    public void unregisterSecureLockDeviceStatusListener(android.security.authenticationpolicy.AuthenticationPolicyManager.SecureLockDeviceStatusListener p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisableSecureLockDeviceRequestStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnableSecureLockDeviceRequestStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GetSecureLockDeviceAvailabilityRequestStatus {
    }

    private static final class ProximityResultCallbackWrapper extends android.proximity.IProximityResultCallback.Stub {
        private final android.os.Handler mHandler = null;
        private final android.proximity.IProximityResultCallback mProximityResultCallback = null;
        ProximityResultCallbackWrapper(android.os.Handler p0, android.proximity.IProximityResultCallback p1) { super(); }
        public void onError(int p0) {}
        public void onSuccess(int p0) {}
    }

    @android.annotation.SystemApi
    public static interface SecureLockDeviceStatusListener {
        public void onSecureLockDeviceAvailableStatusChanged(int p0);
        public void onSecureLockDeviceEnabledStatusChanged(boolean p0);
    }
}
