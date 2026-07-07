package android.speech;

public abstract class RecognitionService extends android.app.Service {
    private static final boolean DBG = false;
    private static final int DEFAULT_MAX_CONCURRENT_SESSIONS_COUNT = 1;
    private static final int MSG_CANCEL = 3;
    private static final int MSG_CHECK_RECOGNITION_SUPPORT = 5;
    private static final int MSG_RESET = 4;
    private static final int MSG_START_LISTENING = 1;
    private static final int MSG_STOP_LISTENING = 2;
    private static final int MSG_TRIGGER_MODEL_DOWNLOAD = 6;
    public static final java.lang.String SERVICE_INTERFACE = "android.speech.RecognitionService";
    public static final java.lang.String SERVICE_META_DATA = "android.speech";
    private static final java.lang.String TAG = "RecognitionService";
    private final android.speech.RecognitionService.RecognitionServiceBinder mBinder = null;
    private final android.os.Handler mHandler = null;
    private final java.util.Map<android.os.IBinder, android.speech.RecognitionService.SessionState> mSessions = null;
    public RecognitionService() { super(); }
    private boolean checkPermissionAndStartDataDelivery(android.speech.RecognitionService.SessionState p0) { return false; }
    private boolean checkPermissionForPreflightNotHardDenied(android.content.AttributionSource p0) { return false; }
    private void dispatchCancel(android.speech.IRecognitionListener p0) {}
    private void dispatchCheckRecognitionSupport(android.content.Intent p0, android.speech.IRecognitionSupportCallback p1, android.content.AttributionSource p2) {}
    private void dispatchClearCallback(android.speech.IRecognitionListener p0) {}
    private void dispatchStartListening(android.content.Intent p0, android.speech.IRecognitionListener p1, android.content.AttributionSource p2) {}
    private void dispatchStopListening(android.speech.IRecognitionListener p0) {}
    private void dispatchTriggerModelDownload(android.content.Intent p0, android.content.AttributionSource p1, android.speech.IModelDownloadListener p2) {}
    private void handleAttributionContextCreation(android.content.AttributionSource p0) {}
    public android.content.Context createContext(android.content.ContextParams p0) { return null; }
    void finishDataDelivery(android.speech.RecognitionService.SessionState p0) {}
    public int getMaxConcurrentSessionsCount() { return 0; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onBindInternal() {}
    protected abstract void onCancel(android.speech.RecognitionService.Callback p0);
    public void onCheckRecognitionSupport(android.content.Intent p0, android.content.AttributionSource p1, android.speech.RecognitionService.SupportCallback p2) {}
    public void onCheckRecognitionSupport(android.content.Intent p0, android.speech.RecognitionService.SupportCallback p1) {}
    public void onDestroy() {}
    protected abstract void onStartListening(android.content.Intent p0, android.speech.RecognitionService.Callback p1);
    protected abstract void onStopListening(android.speech.RecognitionService.Callback p0);
    public void onTriggerModelDownload(android.content.Intent p0) {}
    public void onTriggerModelDownload(android.content.Intent p0, android.content.AttributionSource p1) {}
    public void onTriggerModelDownload(android.content.Intent p0, android.content.AttributionSource p1, android.speech.ModelDownloadListener p2) {}

    public class Callback {
        private android.content.Context mAttributionContext;
        private boolean mAttributionContextCreated;
        private final android.content.AttributionSource mCallingAttributionSource = null;
        private final android.speech.IRecognitionListener mListener = null;
        private Callback(android.speech.RecognitionService p0, android.speech.IRecognitionListener p1, android.content.AttributionSource p2) {}
        public void beginningOfSpeech() throws android.os.RemoteException {}
        public void bufferReceived(byte[] p0) throws android.os.RemoteException {}
        public void endOfSegmentedSession() throws android.os.RemoteException {}
        public void endOfSpeech() throws android.os.RemoteException {}
        public void error(int p0) throws android.os.RemoteException {}
        android.content.Context getAttributionContextForCaller() { return null; }
        public android.content.AttributionSource getCallingAttributionSource() { return null; }
        public int getCallingUid() { return 0; }
        public void languageDetection(android.os.Bundle p0) {}
        public void partialResults(android.os.Bundle p0) throws android.os.RemoteException {}
        public void readyForSpeech(android.os.Bundle p0) throws android.os.RemoteException {}
        public void results(android.os.Bundle p0) throws android.os.RemoteException {}
        public void rmsChanged(float p0) throws android.os.RemoteException {}
        public void segmentResults(android.os.Bundle p0) throws android.os.RemoteException {}
    }

    private static class CheckRecognitionSupportArgs {
        public final android.speech.IRecognitionSupportCallback callback = null;
        public final android.content.AttributionSource mAttributionSource = null;
        public final android.content.Intent mIntent = null;
        private CheckRecognitionSupportArgs(android.content.Intent p0, android.speech.IRecognitionSupportCallback p1, android.content.AttributionSource p2) {}
    }

    private static class ModelDownloadArgs {
        final android.content.AttributionSource mAttributionSource = null;
        final android.content.Intent mIntent = null;
        final android.speech.IModelDownloadListener mListener = null;
        private ModelDownloadArgs(android.content.Intent p0, android.content.AttributionSource p1, android.speech.IModelDownloadListener p2) {}
    }

    private static final class RecognitionServiceBinder extends android.speech.IRecognitionService.Stub {
        private final java.lang.ref.WeakReference<android.speech.RecognitionService> mServiceRef = null;
        public RecognitionServiceBinder(android.speech.RecognitionService p0) { super(); }
        public void cancel(android.speech.IRecognitionListener p0, boolean p1) {}
        public void checkRecognitionSupport(android.content.Intent p0, android.content.AttributionSource p1, android.speech.IRecognitionSupportCallback p2) {}
        public void clearReference() {}
        public void startListening(android.content.Intent p0, android.speech.IRecognitionListener p1, android.content.AttributionSource p2) {}
        public void stopListening(android.speech.IRecognitionListener p0) {}
        public void triggerModelDownload(android.content.Intent p0, android.content.AttributionSource p1, android.speech.IModelDownloadListener p2) {}
    }

    private static class SessionState {
        private android.speech.RecognitionService.Callback mCallback;
        private boolean mStartedDataDelivery;
        SessionState(android.speech.RecognitionService.Callback p0) {}
        SessionState(android.speech.RecognitionService.Callback p0, boolean p1) {}
        void reset() {}
    }

    private static class StartListeningArgs {
        public final android.content.AttributionSource mAttributionSource = null;
        public final android.content.Intent mIntent = null;
        public final android.speech.IRecognitionListener mListener = null;
        public StartListeningArgs(android.content.Intent p0, android.speech.IRecognitionListener p1, android.content.AttributionSource p2) {}
    }

    public static class SupportCallback {
        private final android.speech.IRecognitionSupportCallback mCallback = null;
        private SupportCallback(android.speech.IRecognitionSupportCallback p0) {}
        public void onError(int p0) {}
        public void onSupportResult(android.speech.RecognitionSupport p0) {}
    }
}
