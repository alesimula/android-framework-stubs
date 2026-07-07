package android.hardware.camera2.extension;

@android.annotation.SystemApi
public class ExtensionOutputConfiguration {
    private android.hardware.camera2.MultiResolutionImageReader mMultiResolutionImageReader;
    private final int mOutputConfigId = 0;
    private final java.lang.String mPhysicalCameraId = null;
    private final int mSurfaceGroupId = 0;
    private final java.util.List<android.hardware.camera2.extension.CameraOutputSurface> mSurfaces = null;
    public ExtensionOutputConfiguration(java.util.List<android.hardware.camera2.extension.CameraOutputSurface> p0, int p1, java.lang.String p2, int p3) {}
    private void initializeOutputConfig(android.hardware.camera2.extension.CameraOutputConfig p0, android.hardware.camera2.extension.CameraOutputSurface p1) {}
    public android.hardware.camera2.MultiResolutionImageReader getMultiResolutionImageReader() { return null; }
    android.hardware.camera2.extension.CameraOutputConfig getOutputConfig() { return null; }
    public void setMultiResolutionImageReader(android.hardware.camera2.MultiResolutionImageReader p0) {}
}
