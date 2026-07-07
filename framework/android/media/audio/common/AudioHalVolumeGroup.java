package android.media.audio.common;

public class AudioHalVolumeGroup implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalVolumeGroup> CREATOR = null;
    public static final int INDEX_DEFERRED_TO_AUDIO_SERVICE = -1;
    public int maxIndex;
    public int minIndex;
    public java.lang.String name;
    public android.media.audio.common.AudioHalVolumeCurve[] volumeCurves;
    public AudioHalVolumeGroup() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
