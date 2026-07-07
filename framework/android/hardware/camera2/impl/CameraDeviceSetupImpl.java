package android.hardware.camera2.impl;

public class CameraDeviceSetupImpl extends android.hardware.camera2.CameraDevice.CameraDeviceSetup {
    private final java.lang.String mCameraId = null;
    private final android.hardware.camera2.CameraManager mCameraManager = null;
    private final android.content.Context mContext = null;
    private final java.lang.Object mInterfaceLock = null;
    private final int mTargetSdkVersion = 0;
    public CameraDeviceSetupImpl(java.lang.String p0, android.hardware.camera2.CameraManager p1, android.content.Context p2) { super(); }
    public static boolean isCameraDeviceSetupSupported(android.hardware.camera2.CameraCharacteristics p0) { return false; }
    public android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getId() { return null; }
    public android.hardware.camera2.CameraCharacteristics getSessionCharacteristics(android.hardware.camera2.params.SessionConfiguration p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public int hashCode() { return 0; }
    public boolean isSessionConfigurationSupported(android.hardware.camera2.params.SessionConfiguration p0) throws android.hardware.camera2.CameraAccessException { return false; }
    public void openCamera(java.util.concurrent.Executor p0, android.hardware.camera2.CameraDevice.StateCallback p1) throws android.hardware.camera2.CameraAccessException {}
    public java.lang.String toString() { return null; }
}
