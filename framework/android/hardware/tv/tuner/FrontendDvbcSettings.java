package android.hardware.tv.tuner;

public class FrontendDvbcSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDvbcSettings> CREATOR = null;
    public byte annex;
    public int bandwidth;
    public long endFrequency;
    public long fec;
    public long frequency;
    public int interleaveMode;
    public int inversion;
    public int modulation;
    public int outerFec;
    public int symbolRate;
    public FrontendDvbcSettings() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
