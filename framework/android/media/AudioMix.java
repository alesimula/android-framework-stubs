package android.media;

public class AudioMix implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioMix> CREATOR = null;
    public boolean allowPrivilegedMediaPlaybackCapture;
    public int cbFlags;
    public android.media.AudioMixMatchCriterion[] criteria;
    public android.media.audio.common.AudioDevice device;
    public android.media.audio.common.AudioConfig format;
    public boolean isBatchCapture;
    public boolean mIsPersistent;
    public android.os.IBinder mToken;
    public int mVirtualDeviceId;
    public int mixType;
    public int routeFlags;
    public boolean voiceCommunicationCaptureAllowed;
    public AudioMix() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
