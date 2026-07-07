package android.media;

public class AudioPatchFw implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioPatchFw> CREATOR = null;
    public int id;
    public android.media.AudioPortConfigFw[] sinks;
    public android.media.AudioPortConfigFw[] sources;
    public AudioPatchFw() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
