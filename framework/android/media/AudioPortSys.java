package android.media;

public class AudioPortSys implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioPortSys> CREATOR = null;
    public android.media.AudioPortConfigFw activeConfig;
    public android.media.AudioPortExtSys ext;
    public android.media.AudioGainSys[] gains;
    public android.media.AudioProfileSys[] profiles;
    public int role;
    public int type;
    public AudioPortSys() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
