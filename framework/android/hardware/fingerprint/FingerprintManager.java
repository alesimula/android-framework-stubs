package android.hardware.fingerprint;

@android.annotation.RestrictedForEnvironment(environments="SDK Runtime", from=34)
@java.lang.Deprecated
public class FingerprintManager implements android.hardware.biometrics.BiometricAuthenticator, android.hardware.biometrics.BiometricFingerprintConstants {
    public static final int ENROLL_ENROLL = 2;
    public static final int ENROLL_FIND_SENSOR = 1;
    public static final int SENSOR_ID_ANY = -1;
    private static final java.lang.String TAG = "FingerprintManager";
    public static final int UDFPS_UI_OVERLAY_SHOWN = 1;
    public static final int UDFPS_UI_READY = 2;
    private final android.content.Context mContext = null;
    private float[] mEnrollStageThresholds;
    private android.os.HandlerExecutor mExecutor;
    private android.os.Handler mHandler;
    private java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> mProps;
    private final android.hardware.fingerprint.IFingerprintService mService = null;
    private final android.os.IBinder mToken = null;
    public FingerprintManager(android.content.Context p0, android.hardware.fingerprint.IFingerprintService p1) {}
    private void cancelAuthentication(long p0) {}
    private void cancelEnrollment(long p0) {}
    private void cancelFingerprintDetect(long p0) {}
    private float[] createEnrollStageThresholds(android.content.Context p0) { return null; }
    public static java.lang.String getAcquiredString(android.content.Context p0, int p1, int p2) { return null; }
    private int getCurrentUserId() { return 0; }
    public static java.lang.String getErrorString(android.content.Context p0, int p1, int p2) { return null; }
    private android.hardware.fingerprint.FingerprintSensorPropertiesInternal getFirstFingerprintSensor() { return null; }
    private void sendPowerPressed() {}
    private void useHandler(android.os.Handler p0) {}
    public void addAuthenticatorsRegisteredCallback(android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback p0) {}
    public void addLockoutResetCallback(android.hardware.fingerprint.FingerprintManager.LockoutResetCallback p0) {}
    @java.lang.Deprecated
    public void authenticate(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.os.CancellationSignal p1, int p2, android.hardware.fingerprint.FingerprintManager.AuthenticationCallback p3, android.os.Handler p4) {}
    @java.lang.Deprecated
    public void authenticate(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.os.CancellationSignal p1, android.hardware.fingerprint.FingerprintManager.AuthenticationCallback p2, android.os.Handler p3, int p4) {}
    @java.lang.Deprecated
    public void authenticate(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.os.CancellationSignal p1, android.hardware.fingerprint.FingerprintManager.AuthenticationCallback p2, android.os.Handler p3, int p4, int p5, int p6) {}
    public void authenticate(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.os.CancellationSignal p1, android.hardware.fingerprint.FingerprintManager.AuthenticationCallback p2, android.os.Handler p3, android.hardware.fingerprint.FingerprintAuthenticateOptions p4) {}
    public android.hardware.biometrics.BiometricTestSession createTestSession(int p0) { return null; }
    public void detectFingerprint(android.os.CancellationSignal p0, android.hardware.fingerprint.FingerprintManager.FingerprintDetectionCallback p1, android.hardware.fingerprint.FingerprintAuthenticateOptions p2) {}
    public void enroll(byte[] p0, android.os.CancellationSignal p1, int p2, android.hardware.fingerprint.FingerprintManager.EnrollmentCallback p3, int p4, android.hardware.fingerprint.FingerprintEnrollOptions p5) {}
    public void generateChallenge(int p0, int p1, android.hardware.fingerprint.FingerprintManager.GenerateChallengeCallback p2) {}
    public void generateChallenge(int p0, android.hardware.fingerprint.FingerprintManager.GenerateChallengeCallback p1) {}
    public int getEnrollStageCount() { return 0; }
    public float getEnrollStageThreshold(int p0) { return 0.0f; }
    public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints() { return null; }
    public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints(int p0) { return null; }
    public int getLockoutModeForUser(int p0, int p1) { return 0; }
    public java.util.List<android.hardware.biometrics.SensorProperties> getSensorProperties() { return null; }
    public java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> getSensorPropertiesInternal() { return null; }
    @java.lang.Deprecated
    public boolean hasEnrolledFingerprints() { return false; }
    public boolean hasEnrolledFingerprints(int p0) { return false; }
    public boolean hasEnrolledTemplates() { return false; }
    public boolean hasEnrolledTemplates(int p0) { return false; }
    @java.lang.Deprecated
    public boolean isHardwareDetected() { return false; }
    public boolean isPowerbuttonFps() { return false; }
    public void onPointerDown(long p0, int p1, int p2, float p3, float p4, float p5, float p6, float p7, long p8, long p9, boolean p10) {}
    public void onPointerDown(long p0, int p1, int p2, int p3, float p4, float p5) {}
    public void onPointerUp(long p0, int p1) {}
    public void onPointerUp(long p0, int p1, int p2, float p3, float p4, float p5, float p6, float p7, long p8, long p9, boolean p10) {}
    public void onPowerPressed() {}
    public void onUdfpsUiEvent(int p0, long p1, int p2) {}
    public void registerBiometricStateListener(android.hardware.biometrics.BiometricStateListener p0) {}
    public void remove(android.hardware.fingerprint.Fingerprint p0, int p1, android.hardware.fingerprint.FingerprintManager.RemovalCallback p2) {}
    public void removeAll(int p0, android.hardware.fingerprint.FingerprintManager.RemovalCallback p1) {}
    public void rename(int p0, int p1, java.lang.String p2) {}
    public void resetLockout(int p0, int p1, byte[] p2) {}
    public void revokeChallenge(int p0, long p1) {}
    public void scheduleWatchdog() {}
    public void setIgnoreDisplayTouches(long p0, int p1, boolean p2) {}
    public void setUdfpsOverlayController(android.hardware.fingerprint.IUdfpsOverlayController p0) {}

    @java.lang.Deprecated
    public static abstract class AuthenticationCallback extends android.hardware.biometrics.BiometricAuthenticator.AuthenticationCallback {
        public AuthenticationCallback() { super(); }
        public void onAuthenticationAcquired(int p0) {}
        public void onAuthenticationError(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationFailed() {}
        public void onAuthenticationHelp(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult p0) {}
        public void onUdfpsPointerDown(int p0) {}
        public void onUdfpsPointerUp(int p0) {}
    }

    @java.lang.Deprecated
    public static class AuthenticationResult {
        private android.hardware.fingerprint.FingerprintManager.CryptoObject mCryptoObject;
        private android.hardware.fingerprint.Fingerprint mFingerprint;
        private boolean mIsStrongBiometric;
        private int mUserId;
        public AuthenticationResult(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.hardware.fingerprint.Fingerprint p1, int p2, boolean p3) {}
        public android.hardware.fingerprint.FingerprintManager.CryptoObject getCryptoObject() { return null; }
        public android.hardware.fingerprint.Fingerprint getFingerprint() { return null; }
        public int getUserId() { return 0; }
        public boolean isStrongBiometric() { return false; }
    }

    @java.lang.Deprecated
    public static final class CryptoObject extends android.hardware.biometrics.CryptoObject {
        public CryptoObject(java.security.Signature p0) { super(0L); }
        public CryptoObject(javax.crypto.Cipher p0) { super(0L); }
        public CryptoObject(javax.crypto.Mac p0) { super(0L); }
        public javax.crypto.Cipher getCipher() { return null; }
        @java.lang.Deprecated
        public android.security.identity.IdentityCredential getIdentityCredential() { return null; }
        public javax.crypto.KeyAgreement getKeyAgreement() { return null; }
        public javax.crypto.Mac getMac() { return null; }
        public android.security.identity.PresentationSession getPresentationSession() { return null; }
        public java.security.Signature getSignature() { return null; }
    }

    public static abstract class EnrollmentCallback {
        public EnrollmentCallback() {}
        public void onAcquired(boolean p0) {}
        public void onEnrollmentError(int p0, java.lang.CharSequence p1) {}
        public void onEnrollmentHelp(int p0, java.lang.CharSequence p1) {}
        public void onEnrollmentProgress(int p0) {}
        public void onUdfpsOverlayShown() {}
        public void onUdfpsPointerDown(int p0) {}
        public void onUdfpsPointerUp(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnrollReason {
    }

    public static interface FingerprintDetectionCallback {
        default public void onDetectionError(int p0) {}
        public void onFingerprintDetected(int p0, int p1, boolean p2);
    }

    class FingerprintServiceReceiver extends android.hardware.fingerprint.IFingerprintServiceReceiver.Stub {
        private final android.hardware.fingerprint.FingerprintCallback mFingerprintCallback = null;
        FingerprintServiceReceiver(android.hardware.fingerprint.FingerprintManager p0, android.hardware.fingerprint.FingerprintCallback p1) { super(); }
        public void onAcquired(int p0, int p1) {}
        public void onAuthenticationFailed() {}
        public void onAuthenticationSucceeded(android.hardware.fingerprint.Fingerprint p0, int p1, boolean p2) {}
        public void onChallengeGenerated(int p0, int p1, long p2) {}
        public void onEnrollResult(android.hardware.fingerprint.Fingerprint p0, int p1) {}
        public void onError(int p0, int p1) {}
        public void onFingerprintDetected(int p0, int p1, boolean p2) {}
        public void onRemoved(android.hardware.fingerprint.Fingerprint p0, int p1) {}
        public void onUdfpsOverlayShown() {}
        public void onUdfpsPointerDown(int p0) {}
        public void onUdfpsPointerUp(int p0) {}
    }

    public static interface GenerateChallengeCallback {
        public void onChallengeGenerated(int p0, int p1, long p2);
    }

    public static abstract class LockoutResetCallback {
        public LockoutResetCallback() {}
        public void onLockoutReset(int p0) {}
    }

    private class OnAuthenticationCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private final long mAuthRequestId = 0L;
        OnAuthenticationCancelListener(android.hardware.fingerprint.FingerprintManager p0, long p1) {}
        public void onCancel() {}
    }

    private class OnEnrollCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private final long mAuthRequestId = 0L;
        private OnEnrollCancelListener(android.hardware.fingerprint.FingerprintManager p0, long p1) {}
        public void onCancel() {}
    }

    private class OnFingerprintDetectionCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private final long mAuthRequestId = 0L;
        OnFingerprintDetectionCancelListener(android.hardware.fingerprint.FingerprintManager p0, long p1) {}
        public void onCancel() {}
    }

    public static abstract class RemovalCallback {
        public RemovalCallback() {}
        public void onRemovalError(android.hardware.fingerprint.Fingerprint p0, int p1, java.lang.CharSequence p2) {}
        public void onRemovalSucceeded(android.hardware.fingerprint.Fingerprint p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UdfpsUiEvent {
    }
}
