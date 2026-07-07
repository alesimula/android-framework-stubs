package android.hardware.radio.modem;

public class ActivityStatsInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.modem.ActivityStatsInfo> CREATOR = null;
    public int idleModeTimeMs;
    public int sleepModeTimeMs;
    public android.hardware.radio.modem.ActivityStatsTechSpecificInfo[] techSpecificInfo;
    public ActivityStatsInfo() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
