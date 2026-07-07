package android.service.voice;

@android.annotation.SystemApi
public abstract class VisualQueryDetectionService extends android.app.Service implements android.service.voice.SandboxedDetectionInitializer {
    static final boolean $assertionsDisabled = false;
    public static final java.lang.String KEY_INITIALIZATION_STATUS = "initialization_status";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.voice.VisualQueryDetectionService";
    private static final java.lang.String TAG = null;
    private static final long UPDATE_TIMEOUT_MILLIS = 20000L;
    private android.view.contentcapture.ContentCaptureManager mContentCaptureManager;
    private android.service.voice.IDetectorSessionStorageService mDetectorSessionStorageService;
    private android.speech.IRecognitionServiceManager mIRecognitionServiceManager;
    private final android.service.voice.ISandboxedDetectionService mInterface = null;
    private android.service.voice.IDetectorSessionVisualQueryDetectionCallback mRemoteCallback;
    public VisualQueryDetectionService() { super(); }
    private void onUpdateStateInternal(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.IRemoteCallback p2) {}
    public final void finishQuery() throws java.lang.IllegalStateException {}
    public final void gainedAttention() {}
    public final void gainedAttention(android.service.voice.VisualQueryAttentionResult p0) {}
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    public final void lostAttention() {}
    public final void lostAttention(int p0) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onStartDetection() {}
    public void onStopDetection() {}
    @android.annotation.SystemApi
    public void onUpdateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, long p2, java.util.function.IntConsumer p3) {}
    public java.io.FileInputStream openFileInput(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    public final void rejectQuery() throws java.lang.IllegalStateException {}
    public final void streamQuery(android.service.voice.VisualQueryDetectedResult p0) {}
    public final void streamQuery(java.lang.String p0) throws java.lang.IllegalStateException {}
}
