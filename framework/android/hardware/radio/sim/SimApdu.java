package android.hardware.radio.sim;

public class SimApdu implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.SimApdu> CREATOR = null;
    public int cla;
    public java.lang.String data;
    public int instruction;
    public boolean isEs10;
    public int p1;
    public int p2;
    public int p3;
    public int sessionId;
    public SimApdu() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
