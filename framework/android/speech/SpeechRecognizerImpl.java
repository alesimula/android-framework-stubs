package android.speech;

class SpeechRecognizerImpl extends android.speech.SpeechRecognizer {
    private static final boolean DBG = false;
    private static final int MSG_CANCEL = 3;
    private static final int MSG_CHANGE_LISTENER = 4;
    private static final int MSG_CHECK_RECOGNITION_SUPPORT = 6;
    private static final int MSG_DESTROY = 8;
    private static final int MSG_SET_TEMPORARY_ON_DEVICE_COMPONENT = 5;
    private static final int MSG_START = 1;
    private static final int MSG_STOP = 2;
    private static final int MSG_TRIGGER_MODEL_DOWNLOAD = 7;
    private static final java.lang.String TAG = "SpeechRecognizer";
    private final android.os.IBinder mClientToken = null;
    private final android.content.Context mContext = null;
    private final android.os.Handler mHandler = null;
    private final android.speech.SpeechRecognizerImpl.InternalRecognitionListener mListener = null;
    private android.speech.IRecognitionServiceManager mManagerService;
    private final boolean mOnDevice = false;
    private final java.util.Queue<android.os.Message> mPendingTasks = null;
    private android.speech.IRecognitionService mService;
    private final android.content.ComponentName mServiceComponent = null;
    SpeechRecognizerImpl(android.content.Context p0, android.content.ComponentName p1) { super(); }
    private SpeechRecognizerImpl(android.content.Context p0, android.content.ComponentName p1, boolean p2) { super(); }
    SpeechRecognizerImpl(android.content.Context p0, boolean p1) { super(); }
    static void checkIsCalledFromMainThread() {}
    private boolean checkOpenConnection() { return false; }
    private void connectToSystemService() {}
    private android.content.ComponentName getSpeechRecognizerComponentName() { return null; }
    private void handleCancelMessage() {}
    private void handleChangeListener(android.speech.RecognitionListener p0) {}
    private void handleCheckRecognitionSupport(android.content.Intent p0, java.util.concurrent.Executor p1, android.speech.RecognitionSupportCallback p2) {}
    private void handleDestroy() {}
    private void handleSetTemporaryComponent(android.content.ComponentName p0) {}
    private void handleStartListening(android.content.Intent p0) {}
    private void handleStopMessage() {}
    private void handleTriggerModelDownload(android.content.Intent p0, java.util.concurrent.Executor p1, android.speech.ModelDownloadListener p2) {}
    static android.speech.SpeechRecognizerImpl lenientlyCreateOnDeviceSpeechRecognizer(android.content.Context p0) { return null; }
    private boolean maybeInitializeManagerService() { return false; }
    private void putMessage(android.os.Message p0) {}
    public void cancel() {}
    public void checkRecognitionSupport(android.content.Intent p0, java.util.concurrent.Executor p1, android.speech.RecognitionSupportCallback p2) {}
    public void destroy() {}
    public void setRecognitionListener(android.speech.RecognitionListener p0) {}
    public void setTemporaryOnDeviceRecognizer(android.content.ComponentName p0) {}
    public void startListening(android.content.Intent p0) {}
    public void stopListening() {}
    public void triggerModelDownload(android.content.Intent p0) {}
    public void triggerModelDownload(android.content.Intent p0, java.util.concurrent.Executor p1, android.speech.ModelDownloadListener p2) {}

    private static class CheckRecognitionSupportArgs {
        final android.speech.RecognitionSupportCallback mCallback = null;
        final java.util.concurrent.Executor mCallbackExecutor = null;
        final android.content.Intent mIntent = null;
        private CheckRecognitionSupportArgs(android.content.Intent p0, java.util.concurrent.Executor p1, android.speech.RecognitionSupportCallback p2) {}
    }

    private static class InternalModelDownloadListener extends android.speech.IModelDownloadListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.speech.ModelDownloadListener mModelDownloadListener = null;
        private InternalModelDownloadListener(java.util.concurrent.Executor p0, android.speech.ModelDownloadListener p1) { super(); }
        public void onError(int p0) throws android.os.RemoteException {}
        public void onProgress(int p0) throws android.os.RemoteException {}
        public void onScheduled() throws android.os.RemoteException {}
        public void onSuccess() throws android.os.RemoteException {}
    }

    private static class InternalRecognitionListener extends android.speech.IRecognitionListener.Stub {
        private static final int MSG_BEGINNING_OF_SPEECH = 1;
        private static final int MSG_BUFFER_RECEIVED = 2;
        private static final int MSG_END_OF_SPEECH = 3;
        private static final int MSG_ERROR = 4;
        private static final int MSG_LANGUAGE_DETECTION = 12;
        private static final int MSG_ON_EVENT = 9;
        private static final int MSG_PARTIAL_RESULTS = 7;
        private static final int MSG_READY_FOR_SPEECH = 5;
        private static final int MSG_RESULTS = 6;
        private static final int MSG_RMS_CHANGED = 8;
        private static final int MSG_SEGMENT_END_SESSION = 11;
        private static final int MSG_SEGMENT_RESULTS = 10;
        private final android.os.Handler mInternalHandler = null;
        private android.speech.RecognitionListener mInternalListener;
        private InternalRecognitionListener() { super(); }
        public void onBeginningOfSpeech() {}
        public void onBufferReceived(byte[] p0) {}
        public void onEndOfSegmentedSession() {}
        public void onEndOfSpeech() {}
        public void onError(int p0) {}
        public void onEvent(int p0, android.os.Bundle p1) {}
        public void onLanguageDetection(android.os.Bundle p0) {}
        public void onPartialResults(android.os.Bundle p0) {}
        public void onReadyForSpeech(android.os.Bundle p0) {}
        public void onResults(android.os.Bundle p0) {}
        public void onRmsChanged(float p0) {}
        public void onSegmentResults(android.os.Bundle p0) {}
    }

    private static class InternalSupportCallback extends android.speech.IRecognitionSupportCallback.Stub {
        private final android.speech.RecognitionSupportCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private InternalSupportCallback(java.util.concurrent.Executor p0, android.speech.RecognitionSupportCallback p1) { super(); }
        public void onError(int p0) throws android.os.RemoteException {}
        public void onSupportResult(android.speech.RecognitionSupport p0) throws android.os.RemoteException {}
    }

    private static class ModelDownloadListenerArgs {
        final java.util.concurrent.Executor mExecutor = null;
        final android.content.Intent mIntent = null;
        final android.speech.ModelDownloadListener mModelDownloadListener = null;
        private ModelDownloadListenerArgs(android.content.Intent p0, java.util.concurrent.Executor p1, android.speech.ModelDownloadListener p2) {}
    }
}
