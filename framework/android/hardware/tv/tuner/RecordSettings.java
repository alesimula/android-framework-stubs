package android.hardware.tv.tuner;

public class RecordSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.RecordSettings> CREATOR = null;
    public int dataFormat;
    public long highThreshold;
    public long lowThreshold;
    public long packetSize;
    public int statusMask;
    public RecordSettings() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
