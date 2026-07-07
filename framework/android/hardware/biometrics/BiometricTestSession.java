package android.hardware.biometrics;

public class BiometricTestSession implements java.lang.AutoCloseable {
    private static final java.lang.String BASE_TAG = "BiometricTestSession";
    private final android.hardware.biometrics.BiometricManager mBiometricManager = null;
    private java.util.concurrent.CountDownLatch mCloseLatch;
    private final int mSensorId = 0;
    private android.hardware.biometrics.ITestSession mTestSession;
    private final java.util.List<android.hardware.biometrics.ITestSession> mTestSessionsForAllSensors = null;
    private final android.util.ArraySet<java.lang.Integer> mTestedUsers = null;
    private final android.util.ArraySet<java.lang.Integer> mUsersCleaningUp = null;
    public BiometricTestSession(android.content.Context p0, java.util.List<android.hardware.biometrics.SensorProperties> p1, int p2, android.hardware.biometrics.BiometricTestSession.TestSessionProvider p3) throws android.os.RemoteException {}
    private java.lang.String getTag() { return null; }
    private void setTestHalEnabled(boolean p0) {}
    public void acceptAuthentication(int p0) {}
    public void cleanupInternalState(int p0) {}
    public void close() {}
    public void finishEnroll(int p0) {}
    public void notifyAcquired(int p0, int p1) {}
    public void notifyError(int p0, int p1) {}
    public void rejectAuthentication(int p0) {}
    public void startEnroll(int p0) {}

    private class TestSessionCallbackIml extends android.hardware.biometrics.ITestSessionCallback.Stub {
        private final int mSensorId = 0;
        private TestSessionCallbackIml(android.hardware.biometrics.BiometricTestSession p0, int p1) { super(); }
        public void onCleanupFinished(int p0) {}
        public void onCleanupStarted(int p0) {}
    }

    public static interface TestSessionProvider {
        public android.hardware.biometrics.ITestSession createTestSession(android.content.Context p0, int p1, android.hardware.biometrics.ITestSessionCallback p2) throws android.os.RemoteException;
    }
}
