package android.hardware;

public class TorchStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.TorchStatus> CREATOR = null;
    public java.lang.String cameraId;
    public int deviceId;
    public int status;
    public TorchStatus() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
