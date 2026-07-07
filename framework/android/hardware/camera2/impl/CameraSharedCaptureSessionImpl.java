package android.hardware.camera2.impl;

public class CameraSharedCaptureSessionImpl extends android.hardware.camera2.CameraSharedCaptureSession implements android.hardware.camera2.impl.CameraCaptureSessionCore {
    private static final java.lang.String TAG = "CameraSharedCaptureSessionImpl";
    private final android.hardware.camera2.impl.CameraDeviceImpl mCameraDevice = null;
    private final java.util.concurrent.Executor mDeviceExecutor = null;
    private final android.os.ConditionVariable mInitialized = null;
    private final android.hardware.camera2.impl.CameraCaptureSessionImpl mSessionImpl = null;
    CameraSharedCaptureSessionImpl(int p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1, java.util.concurrent.Executor p2, android.hardware.camera2.impl.CameraDeviceImpl p3, java.util.concurrent.Executor p4, boolean p5) { super(); }
    public void abortCaptures() throws android.hardware.camera2.CameraAccessException {}
    public int capture(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureSingleRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void close() {}
    public void closeWithoutDraining() {}
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
    public void stopStreaming() throws android.hardware.camera2.CameraAccessException {}
    public boolean supportsOfflineProcessing(android.view.Surface p0) { return false; }
    public android.hardware.camera2.CameraOfflineSession switchToOffline(java.util.Collection<android.view.Surface> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback p2) throws android.hardware.camera2.CameraAccessException { return null; }
    public void tearDown(android.view.Surface p0) throws android.hardware.camera2.CameraAccessException {}
    public void updateOutputConfiguration(android.hardware.camera2.params.OutputConfiguration p0) throws android.hardware.camera2.CameraAccessException {}

    private class WrapperCallback extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        private final android.hardware.camera2.CameraCaptureSession.StateCallback mCallback = null;
        WrapperCallback(android.hardware.camera2.impl.CameraSharedCaptureSessionImpl p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1) { super(); }
        public void onActive(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onClosed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigured(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onReady(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onSurfacePrepared(android.hardware.camera2.CameraCaptureSession p0, android.view.Surface p1) {}
    }
}
