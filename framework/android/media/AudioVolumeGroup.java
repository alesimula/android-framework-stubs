package android.media;

public class AudioVolumeGroup implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioVolumeGroup> CREATOR = null;
    public android.media.audio.common.AudioAttributes[] audioAttributes;
    public int groupId;
    public java.lang.String name;
    public int[] streams;
    public AudioVolumeGroup() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
