package android.hardware.tv.tuner;

public class FrontendDvbtCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDvbtCapabilities> CREATOR = null;
    public int bandwidthCap;
    public int coderateCap;
    public int constellationCap;
    public int guardIntervalCap;
    public int hierarchyCap;
    public boolean isMisoSupported;
    public boolean isT2Supported;
    public int transmissionModeCap;
    public FrontendDvbtCapabilities() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
