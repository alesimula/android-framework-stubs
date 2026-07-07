package android.companion.virtual.audio;

@android.annotation.SystemApi
public final class VirtualAudioDevice implements java.io.Closeable {
    private final android.companion.virtual.audio.VirtualAudioDevice.AudioConfigurationChangeCallback mCallback = null;
    private final android.content.Context mContext = null;
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.companion.virtual.audio.VirtualAudioDevice.CloseListener mListener = null;
    private android.companion.virtual.audio.VirtualAudioSession mOngoingSession;
    private final android.companion.virtual.IVirtualDevice mVirtualDevice = null;
    private final android.hardware.display.VirtualDisplay mVirtualDisplay = null;
    public VirtualAudioDevice(android.content.Context p0, android.companion.virtual.IVirtualDevice p1, android.hardware.display.VirtualDisplay p2, java.util.concurrent.Executor p3, android.companion.virtual.audio.VirtualAudioDevice.AudioConfigurationChangeCallback p4, android.companion.virtual.audio.VirtualAudioDevice.CloseListener p5) {}
    public void close() {}
    public android.companion.virtual.audio.AudioCapture getAudioCapture() { return null; }
    public android.companion.virtual.audio.AudioInjection getAudioInjection() { return null; }
    public android.companion.virtual.audio.AudioCapture startAudioCapture(android.media.AudioFormat p0) { return null; }
    public android.companion.virtual.audio.AudioInjection startAudioInjection(android.media.AudioFormat p0) { return null; }

    @android.annotation.SystemApi
    public static interface AudioConfigurationChangeCallback {
        public void onPlaybackConfigChanged(java.util.List<android.media.AudioPlaybackConfiguration> p0);
        public void onRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> p0);
    }

    public static interface CloseListener {
        public void onClosed();
    }
}
