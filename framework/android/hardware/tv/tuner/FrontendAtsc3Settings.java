package android.hardware.tv.tuner;

public class FrontendAtsc3Settings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendAtsc3Settings> CREATOR = null;
    public int bandwidth;
    public byte demodOutputFormat;
    public long endFrequency;
    public long frequency;
    public int inversion;
    public android.hardware.tv.tuner.FrontendAtsc3PlpSettings[] plpSettings;
    public FrontendAtsc3Settings() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
