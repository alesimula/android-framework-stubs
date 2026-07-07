package android.hardware.radio.modem;

public class HardwareConfigModem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.modem.HardwareConfigModem> CREATOR = null;
    public int maxDataCalls;
    public int maxStandby;
    public int maxVoiceCalls;
    public int rat;
    public int rilModel;
    public HardwareConfigModem() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
