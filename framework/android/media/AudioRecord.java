package android.media;

public class AudioRecord implements android.media.AudioRouting, android.media.MicrophoneDirection, android.media.AudioRecordingMonitor, android.media.AudioRecordingMonitorClient {
    private static final int AUDIORECORD_ERROR_SETUP_INVALIDCHANNELMASK = -17;
    private static final int AUDIORECORD_ERROR_SETUP_INVALIDFORMAT = -18;
    private static final int AUDIORECORD_ERROR_SETUP_INVALIDSOURCE = -19;
    private static final int AUDIORECORD_ERROR_SETUP_NATIVEINITFAILED = -20;
    private static final int AUDIORECORD_ERROR_SETUP_ZEROFRAMECOUNT = -16;
    public static final int ERROR = -1;
    public static final int ERROR_BAD_VALUE = -2;
    public static final int ERROR_DEAD_OBJECT = -6;
    public static final int ERROR_INVALID_OPERATION = -3;
    private static final long MAX_SHARED_AUDIO_HISTORY_MS = 5000L;
    private static final int NATIVE_EVENT_MARKER = 2;
    private static final int NATIVE_EVENT_NEW_POS = 3;
    public static final int READ_BLOCKING = 0;
    public static final int READ_NON_BLOCKING = 1;
    public static final int RECORDSTATE_RECORDING = 3;
    public static final int RECORDSTATE_STOPPED = 1;
    public static final int STATE_INITIALIZED = 1;
    public static final int STATE_UNINITIALIZED = 0;
    public static final java.lang.String SUBMIX_FIXED_VOLUME = "fixedVolume";
    public static final int SUCCESS = 0;
    private static final java.lang.String TAG = "android.media.AudioRecord";
    private android.media.AudioAttributes mAudioAttributes;
    private android.media.audiopolicy.AudioPolicy mAudioCapturePolicy;
    private int mAudioFormat;
    private android.media.AudioFormat.ChannelMasks mChannelMasks;
    private android.media.AudioRecord.NativeEventHandler mEventHandler;
    private int mHalInputFlags;
    private final android.os.IBinder mICallBack = null;
    private android.os.Looper mInitializationLooper;
    private boolean mIsSubmixFullVolume;
    private android.media.metrics.LogSessionId mLogSessionId;
    private long mNativeAudioRecordHandle;
    private int mNativeBufferSizeInBytes;
    private long mNativeJNIDataHandle;
    private android.media.AudioRecord.OnRecordPositionUpdateListener mPositionListener;
    private final java.lang.Object mPositionListenerLock = null;
    private android.media.AudioDeviceInfo mPreferredDevice;
    private int mRecordSource;
    android.media.AudioRecordingMonitorImpl mRecordingInfoImpl;
    private int mRecordingState;
    private final java.lang.Object mRecordingStateLock = null;
    private android.util.ArrayMap<android.media.AudioRouting.OnRoutingChangedListener, android.media.NativeRoutingEventHandlerDelegate> mRoutingChangeListeners;
    private int mSampleRate;
    private int mSessionId;
    private int mState;
    public AudioRecord(int p0, int p1, int p2, int p3, int p4) throws java.lang.IllegalArgumentException {}
    AudioRecord(long p0) {}
    @android.annotation.SystemApi
    public AudioRecord(android.media.AudioAttributes p0, android.media.AudioFormat p1, int p2, int p3) throws java.lang.IllegalArgumentException {}
    private AudioRecord(android.media.AudioAttributes p0, android.media.AudioFormat p1, int p2, int p3, android.content.Context p4, int p5, int p6) throws java.lang.IllegalArgumentException {}
    private void audioBuffSizeCheck(int p0) throws java.lang.IllegalArgumentException {}
    private void audioParamCheck(int p0, int p1, int p2) throws java.lang.IllegalArgumentException {}
    private void broadcastRoutingChange() {}
    private static int getChannelMaskFromLegacyConfig(int p0, boolean p1) { return 0; }
    @android.annotation.SystemApi
    public static long getMaxSharedAudioHistoryMillis() { return 0L; }
    public static int getMinBufferSize(int p0, int p1, int p2) { return 0; }
    private java.util.List<android.media.AudioDeviceInfo> getRoutedDevicesInternal() { return null; }
    private void handleFullVolumeRec(boolean p0) {}
    private static void logd(java.lang.String p0) {}
    private static void loge(java.lang.String p0) {}
    private final native void native_disableDeviceCallback();
    private final native void native_enableDeviceCallback();
    private native void native_finalize();
    private native android.os.PersistableBundle native_getMetrics();
    private native int native_getPortId();
    private native int[] native_getRoutedDeviceIds();
    private final native int native_get_active_microphones(java.util.ArrayList<android.media.MicrophoneInfo> p0);
    private final native int native_get_buffer_size_in_frames();
    private final native int native_get_marker_pos();
    private static final native int native_get_min_buff_size(int p0, int p1, int p2);
    private final native int native_get_pos_update_period();
    private final native int native_get_timestamp(android.media.AudioTimestamp p0, int p1);
    private final native int native_read_in_byte_array(byte[] p0, int p1, int p2, boolean p3);
    private final native int native_read_in_direct_buffer(java.lang.Object p0, int p1, boolean p2);
    private final native int native_read_in_float_array(float[] p0, int p1, int p2, boolean p3);
    private final native int native_read_in_short_array(short[] p0, int p1, int p2, boolean p3);
    private final native boolean native_setInputDevice(int p0);
    private native void native_setLogSessionId(java.lang.String p0);
    private final native int native_set_marker_pos(int p0);
    private final native int native_set_pos_update_period(int p0);
    private native int native_set_preferred_microphone_direction(int p0);
    private native int native_set_preferred_microphone_field_dimension(float p0);
    @java.lang.Deprecated
    private int native_setup(java.lang.Object p0, java.lang.Object p1, int[] p2, int p3, int p4, int p5, int p6, int[] p7, java.lang.String p8, long p9, int p10) { return 0; }
    private native int native_setup(java.lang.Object p0, java.lang.Object p1, int[] p2, java.lang.Object p3, int p4, int p5, int[] p6, android.os.Parcel p7, long p8, int p9, int p10);
    private native int native_shareAudioHistory(java.lang.String p0, long p1);
    private final native int native_start(int p0, int p1);
    private final native void native_stop();
    private static void postEventFromNative(java.lang.Object p0, int p1, int p2, int p3, java.lang.Object p4) {}
    private static int resolveSessionId(android.content.Context p0, int p1) { return 0; }
    private void testDisableNativeRoutingCallbacksLocked() {}
    private void testEnableNativeRoutingCallbacksLocked() {}
    private void unregisterAudioPolicyOnRelease(android.media.audiopolicy.AudioPolicy p0) {}
    @java.lang.Deprecated
    public void addOnRoutingChangedListener(android.media.AudioRecord.OnRoutingChangedListener p0, android.os.Handler p1) {}
    public void addOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener p0, android.os.Handler p1) {}
    void deferred_connect(long p0) {}
    protected void finalize() {}
    public java.util.List<android.media.MicrophoneInfo> getActiveMicrophones() throws java.io.IOException { return null; }
    public android.media.AudioRecordingConfiguration getActiveRecordingConfiguration() { return null; }
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public int getAudioFormat() { return 0; }
    public int getAudioSessionId() { return 0; }
    public int getAudioSource() { return 0; }
    public int getBufferSizeInFrames() { return 0; }
    public int getChannelConfiguration() { return 0; }
    public int getChannelCount() { return 0; }
    public android.media.AudioFormat getFormat() { return null; }
    public android.media.metrics.LogSessionId getLogSessionId() { return null; }
    public android.os.PersistableBundle getMetrics() { return null; }
    public int getNotificationMarkerPosition() { return 0; }
    public int getPortId() { return 0; }
    public int getPositionNotificationPeriod() { return 0; }
    public android.media.AudioDeviceInfo getPreferredDevice() { return null; }
    public int getRecordingState() { return 0; }
    public android.media.AudioDeviceInfo getRoutedDevice() { return null; }
    public java.util.List<android.media.AudioDeviceInfo> getRoutedDevices() { return null; }
    public int getSampleRate() { return 0; }
    public int getState() { return 0; }
    public int getTimestamp(android.media.AudioTimestamp p0, int p1) { return 0; }
    @android.annotation.SystemApi
    public boolean isHotwordLookbackStream() { return false; }
    @android.annotation.SystemApi
    public boolean isHotwordStream() { return false; }
    public boolean isPrivacySensitive() { return false; }
    public final native void native_release();
    public int read(java.nio.ByteBuffer p0, int p1) { return 0; }
    public int read(java.nio.ByteBuffer p0, int p1, int p2) { return 0; }
    public int read(byte[] p0, int p1, int p2) { return 0; }
    public int read(byte[] p0, int p1, int p2, int p3) { return 0; }
    public int read(float[] p0, int p1, int p2, int p3) { return 0; }
    public int read(short[] p0, int p1, int p2) { return 0; }
    public int read(short[] p0, int p1, int p2, int p3) { return 0; }
    public void registerAudioRecordingCallback(java.util.concurrent.Executor p0, android.media.AudioManager.AudioRecordingCallback p1) {}
    public void release() {}
    @java.lang.Deprecated
    public void removeOnRoutingChangedListener(android.media.AudioRecord.OnRoutingChangedListener p0) {}
    public void removeOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener p0) {}
    public void setLogSessionId(android.media.metrics.LogSessionId p0) {}
    public int setNotificationMarkerPosition(int p0) { return 0; }
    public int setPositionNotificationPeriod(int p0) { return 0; }
    public boolean setPreferredDevice(android.media.AudioDeviceInfo p0) { return false; }
    public boolean setPreferredMicrophoneDirection(int p0) { return false; }
    public boolean setPreferredMicrophoneFieldDimension(float p0) { return false; }
    public void setRecordPositionUpdateListener(android.media.AudioRecord.OnRecordPositionUpdateListener p0) {}
    public void setRecordPositionUpdateListener(android.media.AudioRecord.OnRecordPositionUpdateListener p0, android.os.Handler p1) {}
    @android.annotation.SystemApi
    public android.media.MediaSyncEvent shareAudioHistory(java.lang.String p0, long p1) { return null; }
    public void startRecording() throws java.lang.IllegalStateException {}
    public void startRecording(android.media.MediaSyncEvent p0) throws java.lang.IllegalStateException {}
    public void stop() throws java.lang.IllegalStateException {}
    public void unregisterAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback p0) {}

    public static class Builder {
        private static final java.lang.String ERROR_MESSAGE_SOURCE_MISMATCH = "Cannot both set audio source and set playback capture config";
        private static final int PRIVACY_SENSITIVE_DEFAULT = -1;
        private static final int PRIVACY_SENSITIVE_DISABLED = 0;
        private static final int PRIVACY_SENSITIVE_ENABLED = 1;
        private android.media.AudioAttributes mAttributes;
        private android.media.AudioPlaybackCaptureConfiguration mAudioPlaybackCaptureConfiguration;
        private int mBufferSizeInBytes;
        private int mCallRedirectionMode;
        private android.content.Context mContext;
        private android.media.AudioFormat mFormat;
        private boolean mIsHotwordLookback;
        private boolean mIsHotwordStream;
        private int mMaxSharedAudioHistoryMs;
        private int mPrivacySensitive;
        private int mSessionId;
        public Builder() {}
        private android.media.AudioRecord buildAudioPlaybackCaptureRecord() { return null; }
        private android.media.AudioRecord buildCallExtractionRecord() { return null; }
        public android.media.AudioRecord build() throws java.lang.UnsupportedOperationException { return null; }
        public android.media.AudioAttributes getAudioAttributes() { return null; }
        @android.annotation.SystemApi
        public android.media.AudioRecord.Builder setAudioAttributes(android.media.AudioAttributes p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.AudioRecord.Builder setAudioFormat(android.media.AudioFormat p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.AudioRecord.Builder setAudioPlaybackCaptureConfig(android.media.AudioPlaybackCaptureConfiguration p0) { return null; }
        public android.media.AudioRecord.Builder setAudioSource(int p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.AudioRecord.Builder setBufferSizeInBytes(int p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.AudioRecord.Builder setCallRedirectionMode(int p0) { return null; }
        public android.media.AudioRecord.Builder setContext(android.content.Context p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioRecord.Builder setMaxSharedAudioHistoryMillis(long p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.AudioRecord.Builder setPrivacySensitive(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioRecord.Builder setRequestHotwordLookbackStream(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioRecord.Builder setRequestHotwordStream(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioRecord.Builder setSessionId(int p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.SystemApi
        public android.media.AudioRecord.Builder setSharedAudioEvent(android.media.MediaSyncEvent p0) throws java.lang.IllegalArgumentException { return null; }
    }

    public static final class MetricsConstants {
        public static final java.lang.String ATTRIBUTES = "android.media.audiorecord.attributes";
        public static final java.lang.String CHANNELS = "android.media.audiorecord.channels";
        public static final java.lang.String CHANNEL_MASK = "android.media.audiorecord.channelMask";
        public static final java.lang.String DURATION_MS = "android.media.audiorecord.durationMs";
        public static final java.lang.String ENCODING = "android.media.audiorecord.encoding";
        public static final java.lang.String FRAME_COUNT = "android.media.audiorecord.frameCount";
        @java.lang.Deprecated
        public static final java.lang.String LATENCY = "android.media.audiorecord.latency";
        private static final java.lang.String MM_PREFIX = "android.media.audiorecord.";
        public static final java.lang.String PORT_ID = "android.media.audiorecord.portId";
        public static final java.lang.String SAMPLERATE = "android.media.audiorecord.samplerate";
        public static final java.lang.String SOURCE = "android.media.audiorecord.source";
        public static final java.lang.String START_COUNT = "android.media.audiorecord.startCount";
        private MetricsConstants() {}
    }

    private class NativeEventHandler extends android.os.Handler {
        private final android.media.AudioRecord mAudioRecord = null;
        NativeEventHandler(android.media.AudioRecord p0, android.media.AudioRecord p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface OnRecordPositionUpdateListener {
        public void onMarkerReached(android.media.AudioRecord p0);
        public void onPeriodicNotification(android.media.AudioRecord p0);
    }

    @java.lang.Deprecated
    public static interface OnRoutingChangedListener extends android.media.AudioRouting.OnRoutingChangedListener {
        public void onRoutingChanged(android.media.AudioRecord p0);
        default public void onRoutingChanged(android.media.AudioRouting p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ReadMode {
    }
}
