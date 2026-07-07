package android.hardware.camera2.extension;

public class CameraOutputConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.CameraOutputConfig> CREATOR = null;
    public static final int TYPE_IMAGEREADER = 1;
    public static final int TYPE_MULTIRES_IMAGEREADER = 2;
    public static final int TYPE_SURFACE = 0;
    public int capacity;
    public long dynamicRangeProfile;
    public int imageFormat;
    public boolean isMultiResolutionOutput;
    public android.hardware.camera2.extension.IOnActiveOutputSurfaceCallback onActiveOutputSurfaceCallback;
    public android.hardware.camera2.extension.OutputConfigId outputId;
    public java.lang.String physicalCameraId;
    public java.util.List<android.hardware.camera2.extension.CameraOutputConfig> sharedSurfaceConfigs;
    public android.hardware.camera2.extension.Size size;
    public android.view.Surface surface;
    public int surfaceGroupId;
    public int type;
    public long usage;
    public CameraOutputConfig() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
