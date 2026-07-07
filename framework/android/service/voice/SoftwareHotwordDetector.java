package android.service.voice;

class SoftwareHotwordDetector extends android.service.voice.AbstractDetector {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = null;
    private final java.lang.String mAttributionTag = null;
    private final android.media.AudioFormat mAudioFormat = null;
    private final android.service.voice.HotwordDetector.Callback mCallback = null;
    private final java.util.concurrent.Executor mExecutor = null;
    private final com.android.internal.app.IVoiceInteractionManagerService mManagerService = null;
    SoftwareHotwordDetector(com.android.internal.app.IVoiceInteractionManagerService p0, android.media.AudioFormat p1, java.util.concurrent.Executor p2, android.service.voice.HotwordDetector.Callback p3, java.lang.String p4) { super(null, null, null); }
    private void maybeCloseExistingSession() {}
    public void destroy() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    void initialize(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}
    public boolean isUsingSandboxedDetectionService() { return false; }
    void onDetectorRemoteException() {}
    public boolean startRecognition() { return false; }
    public boolean stopRecognition() { return false; }

    private static class BinderCallback extends android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback.Stub {
        private final android.service.voice.HotwordDetector.Callback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        BinderCallback(java.util.concurrent.Executor p0, android.service.voice.HotwordDetector.Callback p1) { super(); }
        public void onDetected(android.service.voice.HotwordDetectedResult p0, android.media.AudioFormat p1, android.os.ParcelFileDescriptor p2) {}
        public void onHotwordDetectionServiceFailure(android.service.voice.HotwordDetectionServiceFailure p0) {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) {}
    }

    private static class InitializationStateListener extends com.android.internal.app.IHotwordRecognitionStatusCallback.Stub {
        private final android.service.voice.HotwordDetector.Callback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        InitializationStateListener(java.util.concurrent.Executor p0, android.service.voice.HotwordDetector.Callback p1) { super(); }
        public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) throws android.os.RemoteException {}
        public void onHotwordDetectionServiceFailure(android.service.voice.HotwordDetectionServiceFailure p0) throws android.os.RemoteException {}
        public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.service.voice.HotwordDetectedResult p1) {}
        public void onKeyphraseDetectedFromExternalSource(android.service.voice.HotwordDetectedResult p0) {}
        public void onOpenFile(java.lang.String p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
        public void onProcessRestarted() throws android.os.RemoteException {}
        public void onRecognitionPaused() throws android.os.RemoteException {}
        public void onRecognitionResumed() throws android.os.RemoteException {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) throws android.os.RemoteException {}
        public void onSoundTriggerFailure(android.service.voice.SoundTriggerFailure p0) throws android.os.RemoteException {}
        public void onStatusReported(int p0) {}
        public void onUnknownFailure(java.lang.String p0) throws android.os.RemoteException {}
        public void onVisualQueryDetectionServiceFailure(android.service.voice.VisualQueryDetectionServiceFailure p0) throws android.os.RemoteException {}
    }
}
