package android.hardware.usb;

public class AoaConnectionInputHandle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.usb.AoaConnectionInputHandle> CREATOR = null;
    public android.os.ParcelFileDescriptor fd;
    public boolean isAccessoryFfsEnabled;
    public AoaConnectionInputHandle() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
