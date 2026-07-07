package android.hardware.camera2.extension;

public class CaptureFailure implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.CaptureFailure> CREATOR = null;
    public boolean dropped;
    public java.lang.String errorPhysicalCameraId;
    public long frameNumber;
    public int reason;
    public android.hardware.camera2.CaptureRequest request;
    public int sequenceId;
    public CaptureFailure() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
