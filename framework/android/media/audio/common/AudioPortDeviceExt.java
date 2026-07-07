package android.media.audio.common;

public class AudioPortDeviceExt implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioPortDeviceExt> CREATOR = null;
    public static final int FLAG_INDEX_DEFAULT_DEVICE = 0;
    public android.media.audio.common.AudioDevice device;
    public int encapsulationMetadataTypes;
    public int encapsulationModes;
    public android.media.audio.common.AudioFormatDescription[] encodedFormats;
    public int flags;
    public android.media.audio.common.AudioChannelLayout speakerLayout;
    public AudioPortDeviceExt() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
