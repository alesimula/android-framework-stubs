package android.hardware.tv.tuner;

public class FrontendDvbsCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDvbsCapabilities> CREATOR = null;
    public long innerfecCap;
    public int modulationCap;
    public byte standard;
    public FrontendDvbsCapabilities() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
