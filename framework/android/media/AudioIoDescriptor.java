package android.media;

public class AudioIoDescriptor implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioIoDescriptor> CREATOR = null;
    public android.media.audio.common.AudioChannelLayout channelMask;
    public android.media.audio.common.AudioFormatDescription format;
    public long frameCount;
    public long frameCountHAL;
    public int ioHandle;
    public boolean isInput;
    public int latency;
    public android.media.AudioPatchFw patch;
    public int portId;
    public int samplingRate;
    public AudioIoDescriptor() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
