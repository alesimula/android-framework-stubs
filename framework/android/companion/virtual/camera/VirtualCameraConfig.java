package android.companion.virtual.camera;

@android.annotation.SystemApi
public final class VirtualCameraConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.virtual.camera.VirtualCameraConfig> CREATOR = null;
    public static final android.hardware.camera2.CameraCharacteristics DEFAULT_VIRTUAL_CAMERA_CHARACTERISTICS = null;
    private static final int LENS_FACING_UNKNOWN = -1;
    public static final int SENSOR_ORIENTATION_0 = 0;
    public static final int SENSOR_ORIENTATION_180 = 180;
    public static final int SENSOR_ORIENTATION_270 = 270;
    public static final int SENSOR_ORIENTATION_90 = 90;
    private static final java.util.Set<java.lang.Integer> SUPPORTED_FORMATS = null;
    private final android.companion.virtual.camera.IVirtualCameraCallback mCallback = null;
    private final android.hardware.camera2.CameraCharacteristics mCameraCharacteristics = null;
    private final boolean mIsMultiStreamEnabled = false;
    private final int mLensFacing = 0;
    private final java.lang.String mName = null;
    private final boolean mPerFrameCameraMetadataEnabled = false;
    private final int mSensorOrientation = 0;
    private final java.util.Set<android.companion.virtual.camera.VirtualCameraStreamConfig> mStreamConfigurations = null;
    private VirtualCameraConfig(android.os.Parcel p0) {}
    private VirtualCameraConfig(java.lang.String p0, java.util.Set<android.companion.virtual.camera.VirtualCameraStreamConfig> p1, java.util.concurrent.Executor p2, android.companion.virtual.camera.VirtualCameraCallback p3, int p4, int p5, boolean p6, android.hardware.camera2.CameraCharacteristics p7, boolean p8) {}
    private static android.hardware.camera2.CameraCharacteristics getDefaultVirtualCameraCharacteristics() { return null; }
    private static boolean isFormatSupported(int p0) { return false; }
    public int describeContents() { return 0; }
    public android.companion.virtual.camera.IVirtualCameraCallback getCallback() { return null; }
    public android.hardware.camera2.CameraCharacteristics getCameraCharacteristics() { return null; }
    public int getLensFacing() { return 0; }
    public java.lang.String getName() { return null; }
    public int getSensorOrientation() { return 0; }
    public java.util.Set<android.companion.virtual.camera.VirtualCameraStreamConfig> getStreamConfigs() { return null; }
    public boolean isConcurrentStreamConfigSupported() { return false; }
    public boolean isPerFrameCameraMetadataEnabled() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.companion.virtual.camera.VirtualCameraCallback mCallback;
        private java.util.concurrent.Executor mCallbackExecutor;
        private android.hardware.camera2.CameraCharacteristics mCameraCharacteristics;
        private boolean mIsMultiStreamEnabled;
        private int mLensFacing;
        private final java.lang.String mName = null;
        private boolean mPerFrameCameraMetadataEnabled;
        private int mSensorOrientation;
        private final android.util.ArraySet<android.companion.virtual.camera.VirtualCameraStreamConfig> mStreamConfigurations = null;
        private int mStreamIndex;
        public Builder(java.lang.String p0) {}
        public android.companion.virtual.camera.VirtualCameraConfig.Builder addStreamConfig(int p0, int p1, int p2, int p3) { return null; }
        public android.companion.virtual.camera.VirtualCameraConfig build() { return null; }
        public android.companion.virtual.camera.VirtualCameraConfig.Builder setCameraCharacteristics(android.hardware.camera2.CameraCharacteristics p0) { return null; }
        public android.companion.virtual.camera.VirtualCameraConfig.Builder setConcurrentStreamConfigSupported(boolean p0) { return null; }
        public android.companion.virtual.camera.VirtualCameraConfig.Builder setLensFacing(int p0) { return null; }
        public android.companion.virtual.camera.VirtualCameraConfig.Builder setPerFrameCameraMetadataEnabled(boolean p0) { return null; }
        public android.companion.virtual.camera.VirtualCameraConfig.Builder setSensorOrientation(int p0) { return null; }
        public android.companion.virtual.camera.VirtualCameraConfig.Builder setVirtualCameraCallback(java.util.concurrent.Executor p0, android.companion.virtual.camera.VirtualCameraCallback p1) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SensorOrientation {
    }

    private static class VirtualCameraCallbackInternal extends android.companion.virtual.camera.IVirtualCameraCallback.Stub {
        private final android.companion.virtual.camera.VirtualCameraCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final boolean mPerFrameCameraMetadataEnabled = false;
        private VirtualCameraCallbackInternal(android.companion.virtual.camera.VirtualCameraCallback p0, java.util.concurrent.Executor p1, boolean p2) { super(); }
        private java.util.function.ObjLongConsumer<android.hardware.camera2.CaptureResult> convertToFrameworkCaptureResultConsumer(android.companion.virtual.camera.ICaptureResultConsumer p0) { return null; }
        public void onConfigureSession(android.hardware.camera2.CaptureRequest p0, android.companion.virtual.camera.ICaptureResultConsumer p1) {}
        public void onOpenCamera() {}
        public void onProcessCaptureRequest(int p0, long p1, android.hardware.camera2.CaptureRequest p2) {}
        public void onStreamClosed(int p0) {}
        public void onStreamConfigured(int p0, android.view.Surface p1, int p2, int p3, int p4) {}
    }
}
