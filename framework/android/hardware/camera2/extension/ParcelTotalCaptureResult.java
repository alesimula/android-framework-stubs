package android.hardware.camera2.extension;

public class ParcelTotalCaptureResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.ParcelTotalCaptureResult> CREATOR = null;
    public long frameNumber;
    public java.lang.String logicalCameraId;
    public android.hardware.camera2.CaptureRequest parent;
    public java.util.List<android.hardware.camera2.extension.ParcelCaptureResult> partials;
    public java.util.List<android.hardware.camera2.impl.PhysicalCaptureResultInfo> physicalResult;
    public android.hardware.camera2.impl.CameraMetadataNative results;
    public int sequenceId;
    public int sessionId;
    public ParcelTotalCaptureResult() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
