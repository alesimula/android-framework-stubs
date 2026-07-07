package android.media;

public class Ringtone {
    private static final boolean LOGD = true;
    private static final java.lang.String[] MEDIA_COLUMNS = null;
    private static final java.lang.String MEDIA_SELECTION = "mime_type LIKE 'audio/%' OR mime_type IN ('application/ogg', 'application/x-flac')";
    private static final java.lang.String TAG = "Ringtone";
    private static final android.os.VibrationAttributes VIBRATION_ATTRIBUTES = null;
    private static final int VIBRATION_LOOP_DELAY_MS = 200;
    private static final java.util.ArrayList<android.media.Ringtone> sActiveRingtones = null;
    private final boolean mAllowRemote = false;
    private android.media.AudioAttributes mAudioAttributes;
    private final android.media.AudioManager mAudioManager = null;
    private final android.media.Ringtone.MyOnCompletionListener mCompletionListener = null;
    private final android.content.Context mContext = null;
    private android.media.audiofx.HapticGenerator mHapticGenerator;
    private boolean mHapticGeneratorEnabled;
    private boolean mIsLooping;
    private boolean mIsVibrating;
    private android.media.MediaPlayer mLocalPlayer;
    private final java.lang.Object mPlaybackSettingsLock = null;
    private boolean mPreferBuiltinDevice;
    private final android.media.IRingtonePlayer mRemotePlayer = null;
    private final android.os.Binder mRemoteToken = null;
    private final boolean mRingtoneVibrationSupported = false;
    private java.lang.String mTitle;
    private android.net.Uri mUri;
    private android.os.VibrationEffect mVibrationEffect;
    private final android.os.Vibrator mVibrator = null;
    private float mVolume;
    private android.media.VolumeShaper mVolumeShaper;
    private android.media.VolumeShaper.Configuration mVolumeShaperConfig;
    public Ringtone(android.content.Context p0, boolean p1) {}
    private void applyPlaybackProperties_sync() {}
    private void destroyLocalPlayer() {}
    private android.media.AudioDeviceInfo getBuiltinDevice(android.media.AudioManager p0) { return null; }
    public static java.lang.String getTitle(android.content.Context p0, android.net.Uri p1, boolean p2, boolean p3) { return null; }
    private boolean playFallbackRingtone() { return false; }
    private void playVibration() {}
    private void startLocalPlayer() {}
    public boolean createLocalMediaPlayer() { return false; }
    protected void finalize() {}
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    @java.lang.Deprecated
    public int getStreamType() { return 0; }
    public java.lang.String getTitle(android.content.Context p0) { return null; }
    public android.net.Uri getUri() { return null; }
    public android.os.VibrationEffect getVibrationEffect() { return null; }
    public com.android.internal.util.VibrationStatsWriter getVibrationStatsWriter() { return null; }
    public float getVolume() { return 0.0f; }
    @android.annotation.SystemApi
    public boolean hasHapticChannels() { return false; }
    public boolean hasLocalPlayer() { return false; }
    public boolean isHapticGeneratorEnabled() { return false; }
    public boolean isLooping() { return false; }
    public boolean isPlaying() { return false; }
    public void play() {}
    public boolean preferBuiltinDevice(boolean p0) { return false; }
    public void setAudioAttributes(android.media.AudioAttributes p0) throws java.lang.IllegalArgumentException {}
    public void setAudioAttributesField(android.media.AudioAttributes p0) {}
    public boolean setHapticGeneratorEnabled(boolean p0) { return false; }
    public void setLooping(boolean p0) {}
    @java.lang.Deprecated
    public void setStreamType(int p0) {}
    void setTitle(java.lang.String p0) {}
    public void setUri(android.net.Uri p0) {}
    public void setUri(android.net.Uri p0, android.media.VolumeShaper.Configuration p1) {}
    public void setVolume(float p0) {}
    public void setVolumeShaperConfig(android.media.VolumeShaper.Configuration p0) {}
    public void stop() {}

    class MyOnCompletionListener implements android.media.MediaPlayer.OnCompletionListener {
        MyOnCompletionListener(android.media.Ringtone p0) {}
        public void onCompletion(android.media.MediaPlayer p0) {}
    }
}
