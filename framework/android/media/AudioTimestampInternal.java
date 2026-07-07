package android.media;

public class AudioTimestampInternal implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioTimestampInternal> CREATOR = null;
    public int nsec;
    public long position;
    public long sec;
    public AudioTimestampInternal() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
