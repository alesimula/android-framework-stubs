package android.hardware.camera2.extension;

public class Request implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.Request> CREATOR = null;
    public android.hardware.camera2.impl.CameraMetadataNative parameters;
    public int requestId;
    public java.util.List<android.hardware.camera2.extension.OutputConfigId> targetOutputConfigIds;
    public int templateId;
    public Request() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
