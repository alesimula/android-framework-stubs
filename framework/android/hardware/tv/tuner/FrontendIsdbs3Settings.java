package android.hardware.tv.tuner;

public class FrontendIsdbs3Settings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendIsdbs3Settings> CREATOR = null;
    public int coderate;
    public long endFrequency;
    public long frequency;
    public int modulation;
    public int rolloff;
    public int streamId;
    public int streamIdType;
    public int symbolRate;
    public FrontendIsdbs3Settings() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
