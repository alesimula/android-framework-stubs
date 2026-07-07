package android.hardware.camera2.impl;

public class ICameraDeviceUserWrapper {
    private final android.hardware.camera2.ICameraDeviceUser mRemoteDevice = null;
    public ICameraDeviceUserWrapper(android.hardware.camera2.ICameraDeviceUser p0) {}
    public void beginConfigure() throws android.hardware.camera2.CameraAccessException {}
    public long cancelRequest(int p0) throws android.hardware.camera2.CameraAccessException { return 0L; }
    public android.hardware.camera2.utils.OutputAndInputStreamIds configureStreams(android.hardware.camera2.utils.SessionConfigurationAndStreamIds p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.camera2.impl.CameraMetadataNative createDefaultRequest(int p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public int createInputStream(int p0, int p1, int p2, boolean p3) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int createStream(android.hardware.camera2.params.OutputConfiguration p0) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void deleteStream(int p0) throws android.hardware.camera2.CameraAccessException {}
    public void disconnect() {}
    public int[] endConfigure(int p0, android.hardware.camera2.impl.CameraMetadataNative p1, long p2) throws android.hardware.camera2.CameraAccessException { return null; }
    public void finalizeOutputConfigurations(int p0, android.hardware.camera2.params.OutputConfiguration p1) throws android.hardware.camera2.CameraAccessException {}
    public long flush() throws android.hardware.camera2.CameraAccessException { return 0L; }
    public android.hardware.camera2.impl.CameraMetadataNative getCameraInfo() throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.common.fmq.MQDescriptor<java.lang.Byte, java.lang.Byte> getCaptureResultMetadataQueue() throws android.hardware.camera2.CameraAccessException { return null; }
    public int getGlobalAudioRestriction() throws android.hardware.camera2.CameraAccessException { return 0; }
    public android.view.Surface getInputSurface() throws android.hardware.camera2.CameraAccessException { return null; }
    public boolean isPrimaryClient() throws android.hardware.camera2.CameraAccessException { return false; }
    public boolean isSessionConfigurationSupported(android.hardware.camera2.params.SessionConfiguration p0) throws android.hardware.camera2.CameraAccessException { return false; }
    public void prepare(int p0) throws android.hardware.camera2.CameraAccessException {}
    public void prepare2(int p0, int p1) throws android.hardware.camera2.CameraAccessException {}
    public void setCameraAudioRestriction(int p0) throws android.hardware.camera2.CameraAccessException {}
    public android.hardware.camera2.utils.SubmitInfo startStreaming(int[] p0, int[] p1) throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.camera2.utils.SubmitInfo submitRequest(android.hardware.camera2.CaptureRequest p0, boolean p1) throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.camera2.utils.SubmitInfo submitRequestList(android.hardware.camera2.CaptureRequest[] p0, boolean p1) throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.camera2.ICameraOfflineSession switchToOffline(android.hardware.camera2.ICameraDeviceCallbacks p0, int[] p1) throws android.hardware.camera2.CameraAccessException { return null; }
    public void tearDown(int p0) throws android.hardware.camera2.CameraAccessException {}
    public void unlinkToDeath(android.os.IBinder.DeathRecipient p0, int p1) {}
    public void updateOutputConfiguration(int p0, android.hardware.camera2.params.OutputConfiguration p1) throws android.hardware.camera2.CameraAccessException {}
    public void updateOutputConfigurations(int[] p0, android.hardware.camera2.params.OutputConfiguration[] p1) throws android.hardware.camera2.CameraAccessException {}
    public void waitUntilIdle() throws android.hardware.camera2.CameraAccessException {}
}
