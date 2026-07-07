package android.hardware.common;

public class NativeHandle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.common.NativeHandle> CREATOR = null;
    public android.os.ParcelFileDescriptor[] fds;
    public int[] ints;
    public NativeHandle() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
