package android.hardware.camera2.impl;

public class CameraCaptureSessionImpl extends android.hardware.camera2.CameraCaptureSession implements android.hardware.camera2.impl.CameraCaptureSessionCore {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "CameraCaptureSession";
    private final android.hardware.camera2.utils.TaskSingleDrainer mAbortDrainer = null;
    private volatile boolean mAborting;
    private boolean mClosed;
    private final boolean mConfigureSuccess = false;
    private final java.util.concurrent.Executor mDeviceExecutor = null;
    private final android.hardware.camera2.impl.CameraDeviceImpl mDeviceImpl = null;
    private final int mId = 0;
    private final java.lang.String mIdString = null;
    private final android.hardware.camera2.utils.TaskSingleDrainer mIdleDrainer = null;
    private final android.view.Surface mInput = null;
    private final android.hardware.camera2.utils.TaskDrainer<java.lang.Integer> mSequenceDrainer = null;
    private boolean mSkipUnconfigure;
    private final android.hardware.camera2.CameraCaptureSession.StateCallback mStateCallback = null;
    private final java.util.concurrent.Executor mStateExecutor = null;
    CameraCaptureSessionImpl(int p0, android.view.Surface p1, android.hardware.camera2.CameraCaptureSession.StateCallback p2, java.util.concurrent.Executor p3, android.hardware.camera2.impl.CameraDeviceImpl p4, java.util.concurrent.Executor p5, boolean p6) { super(); }
    private int addPendingSequence(int p0) { return 0; }
    private void checkCaptureRequest(android.hardware.camera2.CaptureRequest p0) {}
    private void checkCaptureRequests(java.util.List<android.hardware.camera2.CaptureRequest> p0) {}
    private void checkNotClosed() {}
    private void checkRepeatingRequest(android.hardware.camera2.CaptureRequest p0) {}
    private void checkRepeatingRequests(java.util.List<android.hardware.camera2.CaptureRequest> p0) {}
    private android.hardware.camera2.impl.CaptureCallback createCaptureCallbackProxy(android.os.Handler p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1) { return null; }
    private android.hardware.camera2.impl.CaptureCallback createCaptureCallbackProxyWithExecutor(java.util.concurrent.Executor p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1) { return null; }
    private android.hardware.camera2.CameraCaptureSession.StateCallback createUserStateCallbackProxy(java.util.concurrent.Executor p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1) { return null; }
    private void finishPendingSequence(int p0) {}
    public void abortCaptures() throws android.hardware.camera2.CameraAccessException {}
    public int capture(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureSingleRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void close() {}
    public void closeWithoutDraining() {}
    protected void finalize() throws java.lang.Throwable {}
    public void finalizeOutputConfigurations(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0) throws android.hardware.camera2.CameraAccessException {}
    public android.hardware.camera2.CameraDevice getDevice() { return null; }
    public android.hardware.camera2.impl.CameraDeviceImpl.StateCallbackKK getDeviceStateCallback() { return null; }
    public android.view.Surface getInputSurface() { return null; }
    public boolean isAborting() { return false; }
    public boolean isReprocessable() { return false; }
    public void prepare(int p0, android.view.Surface p1) throws android.hardware.camera2.CameraAccessException {}
    public void prepare(android.view.Surface p0) throws android.hardware.camera2.CameraAccessException {}
    public void replaceSessionClose() {}
    public int setRepeatingBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingRequest(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int startStreaming(java.util.List<android.view.Surface> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {}
    public boolean supportsOfflineProcessing(android.view.Surface p0) { return false; }
    public android.hardware.camera2.CameraOfflineSession switchToOffline(java.util.Collection<android.view.Surface> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback p2) throws android.hardware.camera2.CameraAccessException { return null; }
    public void tearDown(android.view.Surface p0) throws android.hardware.camera2.CameraAccessException {}
    public void updateOutputConfiguration(android.hardware.camera2.params.OutputConfiguration p0) throws android.hardware.camera2.CameraAccessException {}
    public void updateOutputConfigurations(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0) throws android.hardware.camera2.CameraAccessException {}

    private class AbortDrainListener implements android.hardware.camera2.utils.TaskDrainer.DrainListener {
        private AbortDrainListener(android.hardware.camera2.impl.CameraCaptureSessionImpl p0) {}
        public void onDrained() {}
    }

    private class IdleDrainListener implements android.hardware.camera2.utils.TaskDrainer.DrainListener {
        private IdleDrainListener(android.hardware.camera2.impl.CameraCaptureSessionImpl p0) {}
        public void onDrained() {}
    }

    private class SequenceDrainListener implements android.hardware.camera2.utils.TaskDrainer.DrainListener {
        private SequenceDrainListener(android.hardware.camera2.impl.CameraCaptureSessionImpl p0) {}
        public void onDrained() {}
    }
}
