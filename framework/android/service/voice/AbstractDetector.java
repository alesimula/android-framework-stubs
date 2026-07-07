package android.service.voice;

abstract class AbstractDetector implements android.service.voice.HotwordDetector {
    private static final boolean DEBUG = false;
    static final boolean IS_IDENTITY_WITH_ATTRIBUTION_TAG = false;
    private static final java.lang.String TAG = null;
    private final android.service.voice.HotwordDetector.Callback mCallback = null;
    private final java.util.concurrent.Executor mExecutor = null;
    private final java.util.concurrent.atomic.AtomicBoolean mIsDetectorActive = null;
    protected final java.lang.Object mLock = null;
    private final com.android.internal.app.IVoiceInteractionManagerService mManagerService = null;
    private java.util.function.Consumer<android.service.voice.AbstractDetector> mOnDestroyListener;
    private final android.os.IBinder mToken = null;
    AbstractDetector(com.android.internal.app.IVoiceInteractionManagerService p0, java.util.concurrent.Executor p1, android.service.voice.HotwordDetector.Callback p2) {}
    public void destroy() {}
    protected void initAndVerifyDetector(android.os.PersistableBundle p0, android.os.SharedMemory p1, com.android.internal.app.IHotwordRecognitionStatusCallback p2, int p3, java.lang.String p4) {}
    abstract void initialize(android.os.PersistableBundle p0, android.os.SharedMemory p1);
    boolean isSameToken(android.os.IBinder p0) { return false; }
    void registerOnDestroyListener(java.util.function.Consumer<android.service.voice.AbstractDetector> p0) {}
    public boolean startRecognition(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2) { return false; }
    protected void throwIfDetectorIsNoLongerActive() {}
    public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}

    private static class BinderCallback extends android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback.Stub {
        private final android.service.voice.HotwordDetector.Callback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        BinderCallback(java.util.concurrent.Executor p0, android.service.voice.HotwordDetector.Callback p1) { super(); }
        public void onDetected(android.service.voice.HotwordDetectedResult p0, android.media.AudioFormat p1, android.os.ParcelFileDescriptor p2) {}
        public void onHotwordDetectionServiceFailure(android.service.voice.HotwordDetectionServiceFailure p0) {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) {}
    }
}
