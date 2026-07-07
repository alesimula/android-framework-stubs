package android.companion.virtual.audio;

public final class VirtualAudioSession extends android.companion.virtual.audio.IAudioRoutingCallback.Stub implements android.companion.virtual.audio.UserRestrictionsDetector.UserRestrictionsCallback, java.io.Closeable {
    private static final long INITIAL_RETRY_DELAY_MS = 10L;
    private static final int MAX_RETRIES = 3;
    private static final java.lang.String TAG = "VirtualAudioSession";
    private android.companion.virtual.audio.AudioCapture mAudioCapture;
    private final android.companion.virtual.audio.VirtualAudioSession.AudioConfigChangedCallback mAudioConfigChangedCallback = null;
    private android.companion.virtual.audio.AudioInjection mAudioInjection;
    private android.media.audiopolicy.AudioPolicy mAudioPolicy;
    private final android.content.Context mContext = null;
    private final java.lang.Object mLock = null;
    private final android.util.IntArray mReroutedAppUids = null;
    private final android.companion.virtual.audio.UserRestrictionsDetector mUserRestrictionsDetector = null;
    public VirtualAudioSession(android.content.Context p0, android.companion.virtual.audio.VirtualAudioDevice.AudioConfigurationChangeCallback p1, java.util.concurrent.Executor p2) { super(); }
    private android.media.AudioRecord createAudioRecordForMix(android.media.audiopolicy.AudioMix p0) { return null; }
    private static android.media.audiopolicy.AudioMix createAudioRecordMix(android.media.AudioFormat p0, int[] p1) { return null; }
    private void createAudioStreams(int[] p0) {}
    private android.media.AudioTrack createAudioTrackForMix(android.media.audiopolicy.AudioMix p0) { return null; }
    private static android.media.audiopolicy.AudioMix createAudioTrackMix(android.media.AudioFormat p0, int[] p1) { return null; }
    private void releaseAudioStreams() {}
    public void close() {}
    public android.companion.virtual.audio.AudioCapture getAudioCapture() { return null; }
    public android.companion.virtual.audio.VirtualAudioSession.AudioConfigChangedCallback getAudioConfigChangedListener() { return null; }
    public android.companion.virtual.audio.AudioInjection getAudioInjection() { return null; }
    public android.util.IntArray getReroutedAppUids() { return null; }
    public void onAppsNeedingAudioRoutingChanged(int[] p0) {}
    public void onMicrophoneRestrictionChanged(boolean p0) {}
    public android.companion.virtual.audio.AudioCapture startAudioCapture(android.media.AudioFormat p0) { return null; }
    public android.companion.virtual.audio.AudioInjection startAudioInjection(android.media.AudioFormat p0) { return null; }

    public static final class AudioConfigChangedCallback extends android.companion.virtual.audio.IAudioConfigChangedCallback.Stub {
        private final android.companion.virtual.audio.VirtualAudioDevice.AudioConfigurationChangeCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        AudioConfigChangedCallback(android.content.Context p0, java.util.concurrent.Executor p1, android.companion.virtual.audio.VirtualAudioDevice.AudioConfigurationChangeCallback p2) { super(); }
        public void onPlaybackConfigChanged(java.util.List<android.media.AudioPlaybackConfiguration> p0) {}
        public void onRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> p0) {}
    }
}
