package android.hardware.radio.sim;

public class IccIo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.IccIo> CREATOR = null;
    public java.lang.String aid;
    public int command;
    public java.lang.String data;
    public int fileId;
    public int p1;
    public int p2;
    public int p3;
    public java.lang.String path;
    public java.lang.String pin2;
    public IccIo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
