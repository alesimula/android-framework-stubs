package android.media;

public class AudioPortConfigFw implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioPortConfigFw> CREATOR = null;
    public android.media.audio.common.AudioPortConfig hal;
    public android.media.AudioPortConfigSys sys;
    public AudioPortConfigFw() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
