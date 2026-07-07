package android.hardware.tv.tuner;

public class FrontendAtscSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendAtscSettings> CREATOR = null;
    public long endFrequency;
    public long frequency;
    public int inversion;
    public int modulation;
    public FrontendAtscSettings() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
