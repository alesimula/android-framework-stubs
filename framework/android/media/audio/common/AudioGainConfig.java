package android.media.audio.common;

public class AudioGainConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioGainConfig> CREATOR = null;
    public android.media.audio.common.AudioChannelLayout channelMask;
    public int index;
    public int mode;
    public int rampDurationMs;
    public int[] values;
    public AudioGainConfig() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
