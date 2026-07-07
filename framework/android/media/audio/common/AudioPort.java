package android.media.audio.common;

public class AudioPort implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioPort> CREATOR = null;
    public android.media.audio.common.AudioPortExt ext;
    public android.media.audio.common.ExtraAudioDescriptor[] extraAudioDescriptors;
    public android.media.audio.common.AudioIoFlags flags;
    public android.media.audio.common.AudioGain[] gains;
    public int id;
    public java.lang.String name;
    public android.media.audio.common.AudioProfile[] profiles;
    public AudioPort() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
