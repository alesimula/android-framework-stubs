package android.hardware.tv.tuner;

public class FrontendDvbsSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDvbsSettings> CREATOR = null;
    public android.hardware.tv.tuner.FrontendDvbsCodeRate coderate;
    public long endFrequency;
    public long frequency;
    public int inputStreamId;
    public int inversion;
    public boolean isDiseqcRxMessage;
    public int modulation;
    public int pilot;
    public int rolloff;
    public int scanType;
    public byte standard;
    public int symbolRate;
    public int vcmMode;
    public FrontendDvbsSettings() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
