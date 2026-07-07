package android.hardware.camera2.params;

public final class OutputConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.params.OutputConfiguration> CREATOR = null;
    private static final int MAX_SURFACES_COUNT = 4;
    public static final int MIRROR_MODE_AUTO = 0;
    public static final int MIRROR_MODE_H = 2;
    public static final int MIRROR_MODE_NONE = 1;
    public static final int MIRROR_MODE_V = 3;
    public static final int MULTI_RES_OFF = 0;
    public static final int MULTI_RES_ON = 1;
    public static final int MULTI_RES_ON_CONCURRENT = 2;
    @android.annotation.SystemApi
    public static final int ROTATION_0 = 0;
    @android.annotation.SystemApi
    public static final int ROTATION_180 = 2;
    @android.annotation.SystemApi
    public static final int ROTATION_270 = 3;
    @android.annotation.SystemApi
    public static final int ROTATION_90 = 1;
    public static final int SURFACE_GROUP_ID_NONE = -1;
    private static final int SURFACE_TYPE_IMAGE_READER = 4;
    private static final int SURFACE_TYPE_MEDIA_CODEC = 3;
    private static final int SURFACE_TYPE_MEDIA_RECORDER = 2;
    private static final java.lang.String TAG = "OutputConfiguration";
    public static final int TIMESTAMP_BASE_CHOREOGRAPHER_SYNCED = 4;
    public static final int TIMESTAMP_BASE_DEFAULT = 0;
    public static final int TIMESTAMP_BASE_MONOTONIC = 2;
    public static final int TIMESTAMP_BASE_READOUT_SENSOR = 5;
    public static final int TIMESTAMP_BASE_REALTIME = 3;
    public static final int TIMESTAMP_BASE_SENSOR = 1;
    private static java.util.concurrent.atomic.AtomicInteger sNextMultiResolutionGroupId;
    private final int SURFACE_TYPE_SURFACE_TEXTURE = 0;
    private final int SURFACE_TYPE_SURFACE_VIEW = 0;
    private final int SURFACE_TYPE_UNKNOWN = 0;
    private int mColorSpace;
    private int mConfiguredDataspace;
    private final int mConfiguredFormat = 0;
    private final int mConfiguredGenerationId = 0;
    private android.util.Size mConfiguredSize;
    private long mDynamicRangeProfile;
    private boolean mIsDeferredConfig;
    private boolean mIsReadoutSensorTimestampBase;
    private boolean mIsShared;
    private int mMirrorMode;
    private android.util.IntArray mMirrorModeForSurfaces;
    private int mMultiResMode;
    private android.hardware.camera2.MultiResolutionImageReader mMultiResolutionReader;
    private android.hardware.camera2.extension.IOnActiveOutputSurfaceCallback mOnActiveOutputSurfaceCallback;
    private java.lang.String mPhysicalCameraId;
    private final int mPublicFormat = 0;
    private boolean mReadoutTimestampEnabled;
    private final int mRotation = 0;
    private java.util.ArrayList<java.lang.Integer> mSensorPixelModesUsed;
    private long mStreamUseCase;
    private final int mSurfaceGroupId = 0;
    private final int mSurfaceType = 0;
    private java.util.ArrayList<android.view.Surface> mSurfaces;
    private int mTimestampBase;
    private long mUsage;
    public OutputConfiguration(int p0, int p1, android.util.Size p2) {}
    public OutputConfiguration(int p0, int p1, android.util.Size p2, long p3) {}
    public OutputConfiguration(int p0, android.util.Size p1) {}
    public OutputConfiguration(int p0, android.util.Size p1, long p2) {}
    public OutputConfiguration(int p0, android.view.Surface p1) {}
    @android.annotation.SystemApi
    public OutputConfiguration(int p0, android.view.Surface p1, int p2) {}
    public OutputConfiguration(android.hardware.camera2.params.OutputConfiguration p0) {}
    private OutputConfiguration(android.os.Parcel p0) {}
    public <T extends java.lang.Object> OutputConfiguration(android.util.Size p0, java.lang.Class<T> p1) {}
    public OutputConfiguration(android.view.Surface p0) {}
    @android.annotation.SystemApi
    public OutputConfiguration(android.view.Surface p0, int p1) {}
    public static java.util.Collection<android.hardware.camera2.params.OutputConfiguration> createInstancesForMultiResolutionOutput(android.hardware.camera2.MultiResolutionImageReader p0) { return null; }
    public static java.util.List<android.hardware.camera2.params.OutputConfiguration> createInstancesForMultiResolutionOutput(java.util.Collection<android.hardware.camera2.params.MultiResolutionStreamInfo> p0, int p1) { return null; }
    private static int getAndIncreaseMultiResolutionGroupId() { return 0; }
    public static void setSurfacesForMultiResolutionOutput(java.util.Collection<android.hardware.camera2.params.OutputConfiguration> p0, android.hardware.camera2.MultiResolutionImageReader p1) {}
    public void addSensorPixelModeUsed(int p0) {}
    public void addSurface(android.view.Surface p0) {}
    public void clearColorSpace() {}
    public int describeContents() { return 0; }
    public void enableSurfaceSharing() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.ColorSpace getColorSpace() { return null; }
    public int getConfiguredFormat() { return 0; }
    public android.util.Size getConfiguredSize() { return null; }
    public long getDynamicRangeProfile() { return 0L; }
    public int getMaxSharedSurfaceCount() { return 0; }
    public int getMirrorMode() { return 0; }
    public int getMirrorMode(android.view.Surface p0) { return 0; }
    public android.hardware.camera2.MultiResolutionImageReader getMultiResolutionReader() { return null; }
    public android.hardware.camera2.extension.IOnActiveOutputSurfaceCallback getOnActiveOutputSurfaceCallback() { return null; }
    public java.lang.String getPhysicalCameraId() { return null; }
    @android.annotation.SystemApi
    public int getRotation() { return 0; }
    public java.util.List<java.lang.Integer> getSensorPixelModes() { return null; }
    public long getStreamUseCase() { return 0L; }
    public android.view.Surface getSurface() { return null; }
    public int getSurfaceGroupId() { return 0; }
    public java.util.List<android.view.Surface> getSurfaces() { return null; }
    public int getTimestampBase() { return 0; }
    public long getUsage() { return 0L; }
    public int hashCode() { return 0; }
    public boolean isDeferredConfiguration() { return false; }
    public boolean isForPhysicalCamera() { return false; }
    public boolean isMultiResolution() { return false; }
    public boolean isReadoutTimestampEnabled() { return false; }
    public boolean isShared() { return false; }
    public android.hardware.camera2.params.OutputConfiguration makeDeferredAndRemoveSurfaces() { return null; }
    public void removeSensorPixelModeUsed(int p0) {}
    public void removeSurface(android.view.Surface p0) {}
    public void setColorSpace(android.graphics.ColorSpace.Named p0) {}
    public void setDynamicRangeProfile(long p0) {}
    public void setMirrorMode(int p0) {}
    public void setMirrorMode(android.view.Surface p0, int p1) {}
    public void setMultiResolutionOutput(android.hardware.camera2.MultiResolutionImageReader p0) {}
    public void setOnActiveOutputSurfaceCallback(android.hardware.camera2.extension.IOnActiveOutputSurfaceCallback p0) {}
    public void setPhysicalCameraId(java.lang.String p0) {}
    public void setReadoutTimestampEnabled(boolean p0) {}
    public void setStreamUseCase(long p0) {}
    public void setTimestampBase(int p0) {}
    public void updateCachedSurfaceSize() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MirrorMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SensorPixelMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StreamUseCase {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TimestampBase {
    }
}
