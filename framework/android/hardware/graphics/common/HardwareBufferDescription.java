package android.hardware.graphics.common;

public class HardwareBufferDescription implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.graphics.common.HardwareBufferDescription> CREATOR = null;
    public int format;
    public int height;
    public int layers;
    public int stride;
    public long usage;
    public int width;
    public HardwareBufferDescription() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
