package android.hardware.biometrics;

@android.annotation.RestrictedForEnvironment(environments="SDK Runtime", from=34)
public class BiometricManager {
    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = 1;
    public static final int BIOMETRIC_ERROR_IDENTITY_CHECK_NOT_ACTIVE = 20;
    public static final int BIOMETRIC_ERROR_LOCKOUT = 7;
    public static final int BIOMETRIC_ERROR_NONE_ENROLLED = 11;
    public static final int BIOMETRIC_ERROR_NOT_ENABLED_FOR_APPS = 21;
    public static final int BIOMETRIC_ERROR_NO_HARDWARE = 12;
    public static final int BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final long BIOMETRIC_NO_AUTHENTICATION = -1L;
    public static final int BIOMETRIC_SUCCESS = 0;
    public static final java.lang.String EXTRA_ENROLL_REASON = "enroll_reason";
    private static final int GET_LAST_AUTH_TIME_ALLOWED_AUTHENTICATORS = 32783;
    public static final int ICON_TYPE_ACCOUNT = 2;
    public static final int ICON_TYPE_GENERIC = 3;
    public static final int ICON_TYPE_MESSAGE = 6;
    public static final int ICON_TYPE_PASSWORD = 0;
    public static final int ICON_TYPE_QR_CODE = 1;
    public static final int ICON_TYPE_RESET = 5;
    public static final int ICON_TYPE_SETTING = 4;
    public static final int ICON_TYPE_SUPERVISED = 7;
    private static final java.lang.String TAG = "BiometricManager";
    @android.annotation.SystemApi
    public static final int TYPE_FACE = 8;
    @android.annotation.SystemApi
    public static final int TYPE_FINGERPRINT = 2;
    private final android.content.Context mContext = null;
    private final android.hardware.biometrics.IAuthService mService = null;
    public BiometricManager(android.content.Context p0, android.hardware.biometrics.IAuthService p1) {}
    public static java.lang.String authenticatorToStr(int p0) { return null; }
    private static java.util.Map<java.lang.Integer, android.hardware.biometrics.BiometricEnrollmentStatus> convertBiometricEnrollmentStatusInternalToMap(java.util.List<android.hardware.biometrics.BiometricEnrollmentStatusInternal> p0) { return null; }
    private static java.util.Map<java.lang.Integer, java.lang.Integer> convertStrongSensorStrengthInternalToMap(java.util.List<android.hardware.biometrics.StrongSensorStrengthInternal> p0) { return null; }
    @java.lang.Deprecated
    public int canAuthenticate() { return 0; }
    public int canAuthenticate(int p0) { return 0; }
    public int canAuthenticate(int p0, int p1) { return 0; }
    public android.hardware.biometrics.BiometricTestSession createTestSession(int p0) { return null; }
    public long[] getAuthenticatorIds() { return null; }
    public long[] getAuthenticatorIds(int p0) { return null; }
    public java.util.Map<java.lang.Integer, java.lang.Integer> getBiometricSensorStrengths() { return null; }
    @android.annotation.SystemApi
    public java.util.Map<java.lang.Integer, android.hardware.biometrics.BiometricEnrollmentStatus> getEnrollmentStatus() { return null; }
    public long getLastAuthenticationTime(int p0) { return 0L; }
    public long getLastAuthenticationTime(int p0, int p1) { return 0L; }
    public java.util.List<android.hardware.biometrics.SensorProperties> getSensorProperties() { return null; }
    public android.hardware.biometrics.BiometricManager.Strings getStrings(int p0) { return null; }
    public java.lang.String getUiPackage() { return null; }
    public boolean hasEnrolledBiometrics(int p0) { return false; }
    public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) {}
    public void registerAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) {}
    public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) {}
    public void registerIdentityCheckStateListener(android.hardware.biometrics.IIdentityCheckStateListener p0) {}
    public void resetLockout(int p0, byte[] p1) {}
    public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) {}
    public void setIdentityCheckTestStatus(android.hardware.biometrics.IdentityCheckStatus p0) {}
    public void setLastAuthenticationTimeForTest(long p0) {}
    public void unregisterAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) {}
    public void unregisterIdentityCheckStateListener(android.hardware.biometrics.IIdentityCheckStateListener p0) {}

    public static interface Authenticators {
        @android.annotation.SystemApi
        public static final int BIOMETRIC_CONVENIENCE = 4095;
        public static final int BIOMETRIC_MAX_STRENGTH = 1;
        public static final int BIOMETRIC_MIN_STRENGTH = 32767;
        public static final int BIOMETRIC_STRONG = 15;
        public static final int BIOMETRIC_WEAK = 255;
        public static final int DEVICE_CREDENTIAL = 32768;
        public static final int DEVICE_CREDENTIAL_AND_IDENTITY_CHECK = 131072;
        @android.annotation.SystemApi
        public static final int EMPTY_SET = 0;
        public static final int IDENTITY_CHECK = 65536;
        public static final int LESS_THAN_STRONG = 0;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
        public static @interface StrongTypes {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Types {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BiometricError {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    static @interface BiometricModality {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IconType {
    }

    public static class Strings {
        int mAuthenticators;
        private final android.content.Context mContext = null;
        private final android.hardware.biometrics.IAuthService mService = null;
        private Strings(android.content.Context p0, android.hardware.biometrics.IAuthService p1, int p2) {}
        public java.lang.CharSequence getButtonLabel() { return null; }
        public java.lang.CharSequence getPromptMessage() { return null; }
        public java.lang.CharSequence getSettingName() { return null; }
    }
}
