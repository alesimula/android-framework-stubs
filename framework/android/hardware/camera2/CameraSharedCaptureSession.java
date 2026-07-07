package android.hardware.camera2;

@android.annotation.SystemApi
public abstract class CameraSharedCaptureSession extends android.hardware.camera2.CameraCaptureSession {
    public CameraSharedCaptureSession() { super(); }
    @android.annotation.SystemApi
    public abstract int startStreaming(java.util.List<android.view.Surface> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException;
    @android.annotation.SystemApi
    public abstract void stopStreaming() throws android.hardware.camera2.CameraAccessException;
}
