package android.hardware.camera2.extension;

public class CameraSessionConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.CameraSessionConfig> CREATOR = null;
    public int colorSpace;
    public java.util.List<android.hardware.camera2.extension.CameraOutputConfig> outputConfigs;
    public android.hardware.camera2.impl.CameraMetadataNative sessionParameter;
    public int sessionTemplateId;
    public int sessionType;
    public CameraSessionConfig() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
