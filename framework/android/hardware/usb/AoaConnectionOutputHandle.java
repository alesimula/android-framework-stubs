package android.hardware.usb;

public class AoaConnectionOutputHandle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.usb.AoaConnectionOutputHandle> CREATOR = null;
    public android.os.ParcelFileDescriptor fd;
    public boolean isAccessoryFfsEnabled;
    public int maxPacketSize;
    public AoaConnectionOutputHandle() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
