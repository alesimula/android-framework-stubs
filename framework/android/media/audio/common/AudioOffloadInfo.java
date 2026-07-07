package android.media.audio.common;

public class AudioOffloadInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioOffloadInfo> CREATOR = null;
    public android.media.audio.common.AudioConfigBase base;
    public int bitRatePerSecond;
    public int bitWidth;
    public int contentId;
    public long durationUs;
    public byte encapsulationMode;
    public boolean hasVideo;
    public boolean isStreaming;
    public int offloadBufferSize;
    public int streamType;
    public int syncId;
    public int usage;
    public AudioOffloadInfo() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
