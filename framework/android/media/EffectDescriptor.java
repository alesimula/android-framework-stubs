package android.media;

public class EffectDescriptor implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.EffectDescriptor> CREATOR = null;
    public int apiVersion;
    public int cpuLoad;
    public int flags;
    public java.lang.String implementor;
    public int memoryUsage;
    public java.lang.String name;
    public android.media.audio.common.AudioUuid type;
    public android.media.audio.common.AudioUuid uuid;
    public EffectDescriptor() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
