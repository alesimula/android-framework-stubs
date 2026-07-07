package android.hardware.tv.tuner;

public class FrontendAnalogSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendAnalogSettings> CREATOR = null;
    public int aftFlag;
    public long endFrequency;
    public long frequency;
    public int inversion;
    public int sifStandard;
    public int type;
    public FrontendAnalogSettings() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
