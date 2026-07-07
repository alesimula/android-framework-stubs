package android.hardware.tv.tuner;

public class FrontendAtsc3Capabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendAtsc3Capabilities> CREATOR = null;
    public int bandwidthCap;
    public int codeRateCap;
    public byte demodOutputFormatCap;
    public int fecCap;
    public int modulationCap;
    public int timeInterleaveModeCap;
    public FrontendAtsc3Capabilities() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
