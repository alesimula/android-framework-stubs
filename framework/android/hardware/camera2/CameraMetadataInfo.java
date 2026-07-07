package android.hardware.camera2;

public final class CameraMetadataInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.CameraMetadataInfo> CREATOR = null;
    public static final int fmqSize = 0;
    public static final int metadata = 1;
    private int _tag;
    private java.lang.Object _value;
    public CameraMetadataInfo() {}
    private CameraMetadataInfo(int p0, java.lang.Object p1) {}
    private CameraMetadataInfo(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.camera2.CameraMetadataInfo fmqSize(long p0) { return null; }
    public static android.hardware.camera2.CameraMetadataInfo metadata(android.hardware.camera2.impl.CameraMetadataNative p0) { return null; }
    public int describeContents() { return 0; }
    public long getFmqSize() { return 0L; }
    public android.hardware.camera2.impl.CameraMetadataNative getMetadata() { return null; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setFmqSize(long p0) {}
    public void setMetadata(android.hardware.camera2.impl.CameraMetadataNative p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int fmqSize = 0;
        public static final int metadata = 1;
    }
}
