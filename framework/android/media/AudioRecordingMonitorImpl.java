package android.media;

public class AudioRecordingMonitorImpl implements android.media.AudioRecordingMonitor {
    private static final java.lang.String TAG = "android.media.AudioRecordingMonitor";
    private static android.media.IAudioService sService;
    private final android.media.AudioRecordingMonitorClient mClient = null;
    private java.util.List<android.media.AudioRecordingMonitorImpl.AudioRecordingCallbackInfo> mRecordCallbackList;
    private final java.lang.Object mRecordCallbackLock = null;
    private final android.media.IRecordingConfigDispatcher mRecordingCallback = null;
    AudioRecordingMonitorImpl(android.media.AudioRecordingMonitorClient p0) {}
    private static android.media.IAudioService getService() { return null; }
    private void handleCallback(java.util.List<android.media.AudioRecordingConfiguration> p0) {}
    void endRecordingCallbackHandling() {}
    public android.media.AudioRecordingConfiguration getActiveRecordingConfiguration() { return null; }
    android.media.AudioRecordingConfiguration getMyConfig(java.util.List<android.media.AudioRecordingConfiguration> p0) { return null; }
    public void registerAudioRecordingCallback(java.util.concurrent.Executor p0, android.media.AudioManager.AudioRecordingCallback p1) {}
    public void unregisterAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback p0) {}

    private static final class AudioRecordingCallbackInfo {
        private final android.media.AudioManager.AudioRecordingCallback cb = null;
        private final java.util.concurrent.Executor executor = null;
        private AudioRecordingCallbackInfo(android.media.AudioManager.AudioRecordingCallback p0, java.util.concurrent.Executor p1) {}
        public android.media.AudioManager.AudioRecordingCallback cb() { return null; }
        void dispatch(java.util.List<android.media.AudioRecordingConfiguration> p0) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public java.util.concurrent.Executor executor() { return null; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
    }
}
