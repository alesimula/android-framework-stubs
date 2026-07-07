package android.companion.virtual.camera;

@android.annotation.SystemApi
public interface VirtualCameraCallback {
    default public void onConfigureSession(android.companion.virtual.camera.VirtualCameraSessionConfig p0, java.util.function.ObjLongConsumer<android.hardware.camera2.CaptureResult> p1) {}
    default public void onOpenCamera() {}
    default public void onProcessCaptureRequest(int p0, long p1) {}
    default public void onProcessCaptureRequest(int p0, long p1, android.hardware.camera2.CaptureRequest p2) {}
    public void onStreamClosed(int p0);
    public void onStreamConfigured(int p0, android.view.Surface p1, int p2, int p3, int p4);
}
