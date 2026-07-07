package android.service.voice;

@android.annotation.SystemApi
public abstract class HotwordDetectionService extends android.app.Service implements android.service.voice.SandboxedDetectionInitializer {
    public static final int AUDIO_SOURCE_EXTERNAL = 2;
    public static final int AUDIO_SOURCE_MICROPHONE = 1;
    private static final boolean DBG = false;
    public static final boolean ENABLE_PROXIMITY_RESULT = true;
    @java.lang.Deprecated
    public static final int INITIALIZATION_STATUS_SUCCESS = 0;
    @java.lang.Deprecated
    public static final int INITIALIZATION_STATUS_UNKNOWN = 100;
    public static final java.lang.String KEY_SYSTEM_WILL_CLOSE_AUDIO_STREAM_AFTER_CALLBACK = "android.service.voice.HotwordDetectionService.KEY_SYSTEM_WILL_CLOSE_AUDIO_STREAM_AFTER_CALLBACK";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.voice.HotwordDetectionService";
    private static final java.lang.String TAG = "HotwordDetectionService";
    private static final long UPDATE_TIMEOUT_MILLIS = 20000L;
    private android.view.contentcapture.ContentCaptureManager mContentCaptureManager;
    private android.speech.IRecognitionServiceManager mIRecognitionServiceManager;
    private final android.service.voice.ISandboxedDetectionService mInterface = null;
    public HotwordDetectionService() { super(); }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static int getMaxCustomInitializationStatus() { return 0; }
    private void onUpdateStateInternal(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.IRemoteCallback p2) {}
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onDetect(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2, android.service.voice.HotwordDetectionService.Callback p3) {}
    @android.annotation.SystemApi
    public void onDetect(android.service.voice.AlwaysOnHotwordDetector.EventPayload p0, long p1, android.service.voice.HotwordDetectionService.Callback p2) {}
    public void onDetect(android.service.voice.HotwordDetectionService.Callback p0) {}
    public void onStopDetection() {}
    @android.annotation.SystemApi
    public void onUpdateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, long p2, java.util.function.IntConsumer p3) {}

    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface AudioSource {
    }

    @android.annotation.SystemApi
    public static final class Callback {
        private final android.service.voice.IDspHotwordDetectionCallback mRemoteCallback = null;
        private Callback(android.service.voice.IDspHotwordDetectionCallback p0) {}
        public void onDetected(android.service.voice.HotwordDetectedResult p0) {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) {}
    }
}
