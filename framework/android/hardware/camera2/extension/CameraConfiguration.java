package android.hardware.camera2.extension;

@android.annotation.SystemApi
public final class CameraConfiguration {
    private android.hardware.camera2.extension.CameraOutputSurface mPostViewOutputSurface;
    private android.hardware.camera2.extension.CameraOutputSurface mPreviewOutputSurface;
    private java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> mSessionParams;
    private android.hardware.camera2.extension.CameraOutputSurface mStillCaptureOutputSurface;
    CameraConfiguration(android.hardware.camera2.extension.CameraOutputSurface p0, android.hardware.camera2.extension.CameraOutputSurface p1, android.hardware.camera2.extension.CameraOutputSurface p2) {}
    public android.hardware.camera2.extension.CameraOutputSurface getPostViewOutputSurface() { return null; }
    public android.hardware.camera2.extension.CameraOutputSurface getPreviewOutputSurface() { return null; }
    public java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getSessionWideParams() { return null; }
    public android.hardware.camera2.extension.CameraOutputSurface getStillCaptureOutputSurface() { return null; }
    public void setSessionWideParams(java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> p0) {}
}
