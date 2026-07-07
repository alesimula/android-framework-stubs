package android.debug;

public class PairDevice implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.debug.PairDevice> CREATOR = null;
    public boolean connected;
    public java.lang.String guid;
    public java.lang.String name;
    public PairDevice() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
