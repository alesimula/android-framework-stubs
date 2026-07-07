package android.media.audio.common;

public class AudioProfile implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioProfile> CREATOR = null;
    public android.media.audio.common.AudioChannelLayout[] channelMasks;
    public int encapsulationType;
    public android.media.audio.common.AudioFormatDescription format;
    public java.lang.String name;
    public int[] sampleRates;
    public AudioProfile() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
