package android.hardware.radio.sim;

public class SimRefreshResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.SimRefreshResult> CREATOR = null;
    public static final int TYPE_SIM_FILE_UPDATE = 0;
    public static final int TYPE_SIM_INIT = 1;
    public static final int TYPE_SIM_RESET = 2;
    public java.lang.String aid;
    public int efId;
    public int type;
    public SimRefreshResult() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
