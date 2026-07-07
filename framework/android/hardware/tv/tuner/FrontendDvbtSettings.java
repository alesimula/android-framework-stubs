package android.hardware.tv.tuner;

public class FrontendDvbtSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDvbtSettings> CREATOR = null;
    public int bandwidth;
    public int constellation;
    public long endFrequency;
    public long frequency;
    public int guardInterval;
    public int hierarchy;
    public int hpCoderate;
    public int inversion;
    public boolean isHighPriority;
    public boolean isMiso;
    public int lpCoderate;
    public int plpGroupId;
    public int plpId;
    public int plpMode;
    public byte standard;
    public int transmissionMode;
    public FrontendDvbtSettings() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
