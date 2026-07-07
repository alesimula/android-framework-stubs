package android.hardware.graphics.common;

public class HardwareBuffer implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.graphics.common.HardwareBuffer> CREATOR = null;
    public android.hardware.graphics.common.HardwareBufferDescription description;
    public android.hardware.common.NativeHandle handle;
    public HardwareBuffer() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
