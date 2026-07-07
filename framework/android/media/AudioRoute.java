package android.media;

public class AudioRoute implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioRoute> CREATOR = null;
    public boolean isExclusive;
    public int sinkPortId;
    public int[] sourcePortIds;
    public AudioRoute() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
