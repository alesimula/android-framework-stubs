package android.hardware.tv.tuner;

public class FrontendIsdbsSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendIsdbsSettings> CREATOR = null;
    public int coderate;
    public long endFrequency;
    public long frequency;
    public int modulation;
    public int rolloff;
    public int streamId;
    public int streamIdType;
    public int symbolRate;
    public FrontendIsdbsSettings() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
