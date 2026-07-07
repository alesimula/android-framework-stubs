package android.media;

public final class AudioTimestamp implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioTimestamp> CREATOR = null;
    public static final int TIMEBASE_BOOTTIME = 1;
    public static final int TIMEBASE_MONOTONIC = 0;
    public long framePosition;
    public long nanoTime;
    public AudioTimestamp() {}
    private AudioTimestamp(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Timebase {
    }
}
