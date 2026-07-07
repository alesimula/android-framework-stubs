package android.hardware.tv.tuner;

public class FrontendDtmbCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDtmbCapabilities> CREATOR = null;
    public int bandwidthCap;
    public int codeRateCap;
    public int guardIntervalCap;
    public int interleaveModeCap;
    public int modulationCap;
    public int transmissionModeCap;
    public FrontendDtmbCapabilities() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
