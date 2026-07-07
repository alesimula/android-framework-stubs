package android.hardware.tv.tuner;

public class FrontendAtsc3PlpSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendAtsc3PlpSettings> CREATOR = null;
    public int codeRate;
    public int fec;
    public int interleaveMode;
    public int modulation;
    public int plpId;
    public FrontendAtsc3PlpSettings() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
