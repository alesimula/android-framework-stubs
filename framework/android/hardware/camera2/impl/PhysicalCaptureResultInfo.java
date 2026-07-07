package android.hardware.camera2.impl;

public class PhysicalCaptureResultInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.impl.PhysicalCaptureResultInfo> CREATOR = null;
    private java.lang.String cameraId;
    private android.hardware.camera2.CameraMetadataInfo cameraMetadataInfo;
    private PhysicalCaptureResultInfo(android.os.Parcel p0) {}
    public PhysicalCaptureResultInfo(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) {}
    public int describeContents() { return 0; }
    public java.lang.String getCameraId() { return null; }
    public android.hardware.camera2.impl.CameraMetadataNative getCameraMetadata() { return null; }
    public android.hardware.camera2.CameraMetadataInfo getCameraMetadataInfo() { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
