package android.media.audio.common;

public class AudioGain implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioGain> CREATOR = null;
    public android.media.audio.common.AudioChannelLayout channelMask;
    public int defaultValue;
    public int maxRampMs;
    public int maxValue;
    public int minRampMs;
    public int minValue;
    public int mode;
    public int stepValue;
    public boolean useForVolume;
    public AudioGain() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
