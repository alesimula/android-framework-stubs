package android.media.quality;

public class DolbyAudioProcessingSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.quality.DolbyAudioProcessingSettings> CREATOR = null;
    public static final int DOLBY_SOUND_MODE_STANDARD = 5;
    public boolean isAtmosEnabled;
    public boolean isSurroundVirtualizerEnabled;
    public boolean isVolumeLevelerEnabled;
    public int soundMode;
    public DolbyAudioProcessingSettings() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
