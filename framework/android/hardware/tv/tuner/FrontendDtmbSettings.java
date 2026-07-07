package android.hardware.tv.tuner;

public class FrontendDtmbSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDtmbSettings> CREATOR = null;
    public int bandwidth;
    public int codeRate;
    public long endFrequency;
    public long frequency;
    public int guardInterval;
    public int interleaveMode;
    public int inversion;
    public int modulation;
    public int transmissionMode;
    public FrontendDtmbSettings() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
