package android.service.voice;

@android.annotation.SystemApi
public class VisualQueryDetector {
    private static final boolean DEBUG = false;
    private static final int SETTINGS_DISABLE_BIT = 0;
    private static final int SETTINGS_ENABLE_BIT = 1;
    private static final java.lang.String TAG = null;
    private android.service.voice.VisualQueryDetector.AccessibilityDetectionEnabledListenerWrapper mActiveAccessibilityListenerWrapper;
    private final java.lang.String mAttributionTag = null;
    private final android.service.voice.VisualQueryDetector.Callback mCallback = null;
    private final android.content.Context mContext = null;
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.service.voice.VisualQueryDetector.VisualQueryDetectorInitializationDelegate mInitializationDelegate = null;
    private final com.android.internal.app.IVoiceInteractionManagerService mManagerService = null;
    VisualQueryDetector(com.android.internal.app.IVoiceInteractionManagerService p0, java.util.concurrent.Executor p1, android.service.voice.VisualQueryDetector.Callback p2, android.content.Context p3, java.lang.String p4) {}
    @android.annotation.SystemApi
    public void clearAccessibilityDetectionEnabledListener() {}
    public void destroy() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public android.service.voice.HotwordDetector getInitializationDelegate() { return null; }
    void initialize(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}
    @android.annotation.SystemApi
    public boolean isAccessibilityDetectionEnabled() { return false; }
    void registerOnDestroyListener(java.util.function.Consumer<android.service.voice.AbstractDetector> p0) {}
    @android.annotation.SystemApi
    public void setAccessibilityDetectionEnabledListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    public boolean startRecognition() { return false; }
    public boolean stopRecognition() { return false; }
    public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}

    private final class AccessibilityDetectionEnabledListenerWrapper extends com.android.internal.app.IVoiceInteractionAccessibilitySettingsListener.Stub {
        private java.util.function.Consumer<java.lang.Boolean> mListener;
        AccessibilityDetectionEnabledListenerWrapper(java.util.function.Consumer<java.lang.Boolean> p0) { super(); }
        public void onAccessibilityDetectionChanged(boolean p0) {}
    }

    private static class BinderCallback extends android.service.voice.IVisualQueryDetectionVoiceInteractionCallback.Stub {
        private final android.service.voice.VisualQueryDetector.Callback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.lang.Object mLock = null;
        BinderCallback(java.util.concurrent.Executor p0, android.service.voice.VisualQueryDetector.Callback p1, java.lang.Object p2) { super(); }
        public void onQueryDetected(java.lang.String p0) {}
        public void onQueryFinished() {}
        public void onQueryRejected() {}
        public void onResultDetected(android.service.voice.VisualQueryDetectedResult p0) {}
        public void onVisualQueryDetectionServiceFailure(android.service.voice.VisualQueryDetectionServiceFailure p0) {}
    }

    public static interface Callback {
        public void onFailure(android.service.voice.VisualQueryDetectionServiceFailure p0);
        default public void onQueryDetected(android.service.voice.VisualQueryDetectedResult p0) {}
        public void onQueryDetected(java.lang.String p0);
        public void onQueryFinished();
        public void onQueryRejected();
        public void onUnknownFailure(java.lang.String p0);
        public void onVisualQueryDetectionServiceInitialized(int p0);
        public void onVisualQueryDetectionServiceRestarted();
    }

    private static class InitializationStateListener extends com.android.internal.app.IHotwordRecognitionStatusCallback.Stub {
        private final android.service.voice.VisualQueryDetector.Callback mCallback = null;
        private final android.content.Context mContext = null;
        private final java.util.concurrent.Executor mExecutor = null;
        InitializationStateListener(java.util.concurrent.Executor p0, android.service.voice.VisualQueryDetector.Callback p1, android.content.Context p2) { super(); }
        public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) throws android.os.RemoteException {}
        public void onHotwordDetectionServiceFailure(android.service.voice.HotwordDetectionServiceFailure p0) throws android.os.RemoteException {}
        public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.service.voice.HotwordDetectedResult p1) {}
        public void onKeyphraseDetectedFromExternalSource(android.service.voice.HotwordDetectedResult p0) {}
        public void onOpenFile(java.lang.String p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
        public void onProcessRestarted() throws android.os.RemoteException {}
        public void onRecognitionPaused() throws android.os.RemoteException {}
        public void onRecognitionResumed() throws android.os.RemoteException {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) throws android.os.RemoteException {}
        public void onSoundTriggerFailure(android.service.voice.SoundTriggerFailure p0) {}
        public void onStatusReported(int p0) {}
        public void onUnknownFailure(java.lang.String p0) throws android.os.RemoteException {}
        public void onVisualQueryDetectionServiceFailure(android.service.voice.VisualQueryDetectionServiceFailure p0) throws android.os.RemoteException {}
    }

    private class VisualQueryDetectorInitializationDelegate extends android.service.voice.AbstractDetector {
        VisualQueryDetectorInitializationDelegate(android.service.voice.VisualQueryDetector p0) { super(null, null, null); }
        private java.lang.Object getLock() { return null; }
        public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
        void initialize(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}
        public boolean isUsingSandboxedDetectionService() { return false; }
        public boolean startRecognition() { return false; }
        public final boolean startRecognition(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2) { return false; }
        public boolean stopRecognition() { return false; }
    }
}
