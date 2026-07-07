package android.hardware;

public class CameraStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.CameraStatus> CREATOR = null;
    public java.lang.String cameraId;
    public java.lang.String clientPackage;
    public int deviceId;
    public int status;
    public java.lang.String[] unavailablePhysicalCameras;
    public CameraStatus() {}
    public int describeContents() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
