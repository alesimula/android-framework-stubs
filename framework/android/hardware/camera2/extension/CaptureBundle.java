package android.hardware.camera2.extension;

public class CaptureBundle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.CaptureBundle> CREATOR = null;
    public android.hardware.camera2.extension.ParcelImage captureImage;
    public android.hardware.camera2.impl.CameraMetadataNative captureResult;
    public int sequenceId;
    public int stage;
    public CaptureBundle() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
