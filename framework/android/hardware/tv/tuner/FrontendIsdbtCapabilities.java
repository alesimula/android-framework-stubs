package android.hardware.tv.tuner;

public class FrontendIsdbtCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendIsdbtCapabilities> CREATOR = null;
    public int bandwidthCap;
    public int coderateCap;
    public int guardIntervalCap;
    public boolean isFullSegment;
    public boolean isSegmentAuto;
    public int modeCap;
    public int modulationCap;
    public int timeInterleaveCap;
    public FrontendIsdbtCapabilities() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
