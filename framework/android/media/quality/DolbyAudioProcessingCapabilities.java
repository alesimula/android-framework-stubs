package android.media.quality;

public class DolbyAudioProcessingCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.quality.DolbyAudioProcessingCapabilities> CREATOR = null;
    public boolean isAtmosSupported;
    public boolean isSurroundVirtualizerSupported;
    public boolean isVolumeLevelerSupported;
    public int[] supportedSoundModes;
    public DolbyAudioProcessingCapabilities() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
