package android.media;

public final class AudioRecordingConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioRecordingConfiguration> CREATOR = null;
    private static final java.lang.String TAG = null;
    private final android.media.audiofx.AudioEffect.Descriptor[] mClientEffects = null;
    private final android.media.AudioFormat mClientFormat = null;
    private final java.lang.String mClientPackageName = null;
    private final int mClientPortId = 0;
    private final int mClientSessionId = 0;
    private boolean mClientSilenced;
    private final int mClientSource = 0;
    private final int mClientUid = 0;
    private final android.media.audiofx.AudioEffect.Descriptor[] mDeviceEffects = null;
    private final android.media.AudioFormat mDeviceFormat = null;
    private final int mDeviceSource = 0;
    private final int mPatchHandle = 0;
    public AudioRecordingConfiguration(int p0, int p1, int p2, android.media.AudioFormat p3, android.media.AudioFormat p4, int p5, java.lang.String p6) {}
    public AudioRecordingConfiguration(int p0, int p1, int p2, android.media.AudioFormat p3, android.media.AudioFormat p4, int p5, java.lang.String p6, int p7, boolean p8, int p9, android.media.audiofx.AudioEffect.Descriptor[] p10, android.media.audiofx.AudioEffect.Descriptor[] p11) {}
    private AudioRecordingConfiguration(android.os.Parcel p0) {}
    public static android.media.AudioRecordingConfiguration anonymizedCopy(android.media.AudioRecordingConfiguration p0) { return null; }
    public static java.lang.String toLogFriendlyString(android.media.AudioRecordingConfiguration p0) { return null; }
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.media.AudioDeviceInfo getAudioDevice() { return null; }
    public int getAudioSource() { return 0; }
    public int getClientAudioSessionId() { return 0; }
    public int getClientAudioSource() { return 0; }
    public java.util.List<android.media.audiofx.AudioEffect.Descriptor> getClientEffects() { return null; }
    public android.media.AudioFormat getClientFormat() { return null; }
    public java.lang.String getClientPackageName() { return null; }
    public int getClientPortId() { return 0; }
    @android.annotation.SystemApi
    public int getClientUid() { return 0; }
    public java.util.List<android.media.audiofx.AudioEffect.Descriptor> getEffects() { return null; }
    public android.media.AudioFormat getFormat() { return null; }
    public int hashCode() { return 0; }
    public boolean isClientSilenced() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioSource {
    }
}
