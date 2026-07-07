package android.hardware.tv.tuner;

public class FrontendIsdbtLayerSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendIsdbtLayerSettings> CREATOR = null;
    public int coderate;
    public int modulation;
    public int numOfSegment;
    public int timeInterleave;
    public FrontendIsdbtLayerSettings() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
