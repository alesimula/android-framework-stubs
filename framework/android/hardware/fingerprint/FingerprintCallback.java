package android.hardware.fingerprint;

public class FingerprintCallback {
    public static final int REMOVE_ALL = 2;
    public static final int REMOVE_SINGLE = 1;
    private static final java.lang.String TAG = "FingerprintCallback";
    private android.hardware.fingerprint.FingerprintManager.AuthenticationCallback mAuthenticationCallback;
    private android.hardware.fingerprint.FingerprintManager.CryptoObject mCryptoObject;
    private android.hardware.fingerprint.FingerprintManager.EnrollmentCallback mEnrollmentCallback;
    private android.hardware.fingerprint.FingerprintManager.FingerprintDetectionCallback mFingerprintDetectionCallback;
    private android.hardware.fingerprint.FingerprintManager.GenerateChallengeCallback mGenerateChallengeCallback;
    private android.hardware.fingerprint.FingerprintManager.RemovalCallback mRemovalCallback;
    private android.hardware.fingerprint.Fingerprint mRemoveFingerprint;
    private int mRemoveRequest;
    FingerprintCallback(android.hardware.fingerprint.FingerprintManager.AuthenticationCallback p0, android.hardware.fingerprint.FingerprintManager.CryptoObject p1) {}
    FingerprintCallback(android.hardware.fingerprint.FingerprintManager.EnrollmentCallback p0) {}
    FingerprintCallback(android.hardware.fingerprint.FingerprintManager.FingerprintDetectionCallback p0) {}
    FingerprintCallback(android.hardware.fingerprint.FingerprintManager.GenerateChallengeCallback p0) {}
    FingerprintCallback(android.hardware.fingerprint.FingerprintManager.RemovalCallback p0, int p1, android.hardware.fingerprint.Fingerprint p2) {}
    public void sendAcquiredResult(android.content.Context p0, int p1, int p2) {}
    public void sendAuthenticatedFailed() {}
    public void sendAuthenticatedSucceeded(android.hardware.fingerprint.Fingerprint p0, int p1, boolean p2) {}
    public void sendChallengeGenerated(long p0, int p1, int p2) {}
    public void sendEnrollResult(int p0) {}
    public void sendErrorResult(android.content.Context p0, int p1, int p2) {}
    public void sendFingerprintDetected(int p0, int p1, boolean p2) {}
    public void sendRemovedResult(android.hardware.fingerprint.Fingerprint p0, int p1) {}
    public void sendUdfpsOverlayShown() {}
    public void sendUdfpsPointerDown(int p0) {}
    public void sendUdfpsPointerUp(int p0) {}

    public static @interface RemoveRequest {
    }
}
