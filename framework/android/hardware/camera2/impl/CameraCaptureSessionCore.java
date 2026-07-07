package android.hardware.camera2.impl;

public interface CameraCaptureSessionCore {
    public void closeWithoutDraining();
    public android.hardware.camera2.impl.CameraDeviceImpl.StateCallbackKK getDeviceStateCallback();
    public boolean isAborting();
    public void replaceSessionClose();
}
