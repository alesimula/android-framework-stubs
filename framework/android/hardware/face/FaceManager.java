package android.hardware.face;

public class FaceManager implements android.hardware.biometrics.BiometricAuthenticator {
    private static final java.lang.String TAG = "FaceManager";
    private final android.content.Context mContext = null;
    private android.os.HandlerExecutor mExecutor;
    private android.os.Handler mHandler;
    private java.util.List<android.hardware.face.FaceSensorPropertiesInternal> mProps;
    private final android.hardware.face.IFaceService mService = null;
    private final android.os.IBinder mToken = null;
    public FaceManager(android.content.Context p0, android.hardware.face.IFaceService p1) {}
    private void cancelAuthentication(long p0) {}
    private void cancelEnrollment(long p0) {}
    private void cancelFaceDetect(long p0) {}
    public static java.lang.String getAuthHelpMessage(android.content.Context p0, int p1, int p2) { return null; }
    public static java.lang.String getEnrollHelpMessage(android.content.Context p0, int p1, int p2) { return null; }
    public static java.lang.String getErrorString(android.content.Context p0, int p1, int p2) { return null; }
    public static int getMappedAcquiredInfo(int p0, int p1) { return 0; }
    private void useHandler(android.os.Handler p0) {}
    public void addAuthenticatorsRegisteredCallback(android.hardware.face.IFaceAuthenticatorsRegisteredCallback p0) {}
    public void addLockoutResetCallback(android.hardware.face.FaceManager.LockoutResetCallback p0) {}
    @java.lang.Deprecated
    public void authenticate(android.hardware.biometrics.CryptoObject p0, android.os.CancellationSignal p1, android.hardware.face.FaceManager.AuthenticationCallback p2, android.os.Handler p3, int p4) {}
    public void authenticate(android.hardware.biometrics.CryptoObject p0, android.os.CancellationSignal p1, android.hardware.face.FaceManager.AuthenticationCallback p2, android.os.Handler p3, android.hardware.face.FaceAuthenticateOptions p4) {}
    public void detectFace(android.os.CancellationSignal p0, android.hardware.face.FaceManager.FaceDetectionCallback p1, android.hardware.face.FaceAuthenticateOptions p2) {}
    public void enroll(int p0, byte[] p1, android.os.CancellationSignal p2, android.hardware.face.FaceManager.EnrollmentCallback p3, int[] p4) {}
    public void enroll(int p0, byte[] p1, android.os.CancellationSignal p2, android.hardware.face.FaceManager.EnrollmentCallback p3, int[] p4, android.view.Surface p5, boolean p6, android.hardware.face.FaceEnrollOptions p7) {}
    public void enrollRemotely(int p0, byte[] p1, android.os.CancellationSignal p2, android.hardware.face.FaceManager.EnrollmentCallback p3, int[] p4) {}
    public void generateChallenge(int p0, int p1, android.hardware.face.FaceManager.GenerateChallengeCallback p2) {}
    public void generateChallenge(int p0, android.hardware.face.FaceManager.GenerateChallengeCallback p1) {}
    public java.util.List<android.hardware.face.Face> getEnrolledFaces() { return null; }
    public java.util.List<android.hardware.face.Face> getEnrolledFaces(int p0) { return null; }
    public void getFeature(int p0, int p1, android.hardware.face.FaceManager.GetFeatureCallback p2) {}
    public int getLockoutModeForUser(int p0, int p1) { return 0; }
    public java.util.List<android.hardware.face.FaceSensorProperties> getSensorProperties() { return null; }
    public java.util.List<android.hardware.face.FaceSensorPropertiesInternal> getSensorPropertiesInternal() { return null; }
    public boolean hasEnrolledTemplates() { return false; }
    public boolean hasEnrolledTemplates(int p0) { return false; }
    public boolean isHardwareDetected() { return false; }
    public void registerBiometricStateListener(android.hardware.biometrics.BiometricStateListener p0) {}
    public void remove(android.hardware.face.Face p0, int p1, android.hardware.face.FaceManager.RemovalCallback p2) {}
    public void removeAll(int p0, android.hardware.face.FaceManager.RemovalCallback p1) {}
    public void resetLockout(int p0, int p1, byte[] p2) {}
    public void revokeChallenge(int p0, int p1, long p2) {}
    public void scheduleWatchdog() {}
    public void setFeature(int p0, int p1, boolean p2, byte[] p3, android.hardware.face.FaceManager.SetFeatureCallback p4) {}

    public static abstract class AuthenticationCallback extends android.hardware.biometrics.BiometricAuthenticator.AuthenticationCallback {
        public AuthenticationCallback() { super(); }
        public void onAuthenticationAcquired(int p0) {}
        public void onAuthenticationError(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationFailed() {}
        public void onAuthenticationHelp(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationSucceeded(android.hardware.face.FaceManager.AuthenticationResult p0) {}
    }

    public static class AuthenticationResult {
        private final android.hardware.biometrics.CryptoObject mCryptoObject = null;
        private final android.hardware.face.Face mFace = null;
        private final boolean mIsStrongBiometric = false;
        private final int mUserId = 0;
        public AuthenticationResult(android.hardware.biometrics.CryptoObject p0, android.hardware.face.Face p1, int p2, boolean p3) {}
        public android.hardware.biometrics.CryptoObject getCryptoObject() { return null; }
        public android.hardware.face.Face getFace() { return null; }
        public int getUserId() { return 0; }
        public boolean isStrongBiometric() { return false; }
    }

    public static abstract class EnrollmentCallback {
        public EnrollmentCallback() {}
        public void onEnrollmentError(int p0, java.lang.CharSequence p1) {}
        public void onEnrollmentFrame(int p0, java.lang.CharSequence p1, android.hardware.face.FaceEnrollCell p2, int p3, float p4, float p5, float p6) {}
        public void onEnrollmentHelp(int p0, java.lang.CharSequence p1) {}
        public void onEnrollmentProgress(int p0) {}
    }

    public static interface FaceDetectionCallback {
        default public void onDetectionError(int p0) {}
        public void onFaceDetected(int p0, int p1, boolean p2);
    }

    private class FaceServiceReceiver extends android.hardware.face.IFaceServiceReceiver.Stub {
        private final android.hardware.face.FaceCallback mFaceCallback = null;
        FaceServiceReceiver(android.hardware.face.FaceManager p0, android.hardware.face.FaceCallback p1) { super(); }
        public void onAcquired(int p0, int p1) {}
        public void onAuthenticationFailed() {}
        public void onAuthenticationFrame(android.hardware.face.FaceAuthenticationFrame p0) {}
        public void onAuthenticationSucceeded(android.hardware.face.Face p0, int p1, boolean p2) {}
        public void onChallengeGenerated(int p0, int p1, long p2) {}
        public void onEnrollResult(android.hardware.face.Face p0, int p1) {}
        public void onEnrollmentFrame(android.hardware.face.FaceEnrollFrame p0) {}
        public void onError(int p0, int p1) {}
        public void onFaceDetected(int p0, int p1, boolean p2) {}
        public void onFeatureGet(boolean p0, int[] p1, boolean[] p2) {}
        public void onFeatureSet(boolean p0, int p1) {}
        public void onRemoved(android.hardware.face.Face p0, int p1) {}
    }

    public static interface GenerateChallengeCallback {
        public void onGenerateChallengeResult(int p0, int p1, long p2);
    }

    public static abstract class GetFeatureCallback {
        public GetFeatureCallback() {}
        public abstract void onCompleted(boolean p0, int[] p1, boolean[] p2);
    }

    public static abstract class LockoutResetCallback {
        public LockoutResetCallback() {}
        public void onLockoutReset(int p0) {}
    }

    private class OnAuthenticationCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private final long mAuthRequestId = 0L;
        OnAuthenticationCancelListener(android.hardware.face.FaceManager p0, long p1) {}
        public void onCancel() {}
    }

    private class OnEnrollCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private final long mAuthRequestId = 0L;
        private OnEnrollCancelListener(android.hardware.face.FaceManager p0, long p1) {}
        public void onCancel() {}
    }

    private class OnFaceDetectionCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private final long mAuthRequestId = 0L;
        OnFaceDetectionCancelListener(android.hardware.face.FaceManager p0, long p1) {}
        public void onCancel() {}
    }

    public static abstract class RemovalCallback {
        public RemovalCallback() {}
        public void onRemovalError(android.hardware.face.Face p0, int p1, java.lang.CharSequence p2) {}
        public void onRemovalSucceeded(android.hardware.face.Face p0, int p1) {}
    }

    public static abstract class SetFeatureCallback {
        public SetFeatureCallback() {}
        public abstract void onCompleted(boolean p0, int p1);
    }
}
