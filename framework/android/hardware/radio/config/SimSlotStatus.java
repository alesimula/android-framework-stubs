package android.hardware.radio.config;

public class SimSlotStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.config.SimSlotStatus> CREATOR = null;
    public java.lang.String atr;
    public int cardState;
    public java.lang.String eid;
    public android.hardware.radio.config.SimPortInfo[] portInfo;
    public int supportedMepMode;
    public SimSlotStatus() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
