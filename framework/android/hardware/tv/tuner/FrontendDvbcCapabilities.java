package android.hardware.tv.tuner;

public class FrontendDvbcCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDvbcCapabilities> CREATOR = null;
    public byte annexCap;
    public long fecCap;
    public int modulationCap;
    public FrontendDvbcCapabilities() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
