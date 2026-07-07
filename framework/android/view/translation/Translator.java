package android.view.translation;

public class Translator {
    public static final java.lang.String EXTRA_SERVICE_BINDER = "binder";
    public static final java.lang.String EXTRA_SESSION_ID = "sessionId";
    private static final java.lang.String TAG = "Translator";
    private final android.content.Context mContext = null;
    private boolean mDestroyed;
    private android.view.translation.ITranslationDirectManager mDirectServiceBinder;
    private final android.os.Handler mHandler = null;
    private int mId;
    private final java.lang.Object mLock = null;
    private final android.view.translation.TranslationManager mManager = null;
    private final android.view.translation.Translator.ServiceBinderReceiver mServiceBinderReceiver = null;
    private android.view.translation.ITranslationManager mSystemServerBinder;
    private final android.view.translation.TranslationContext mTranslationContext = null;
    public Translator(android.content.Context p0, android.view.translation.TranslationContext p1, int p2, android.view.translation.TranslationManager p3, android.os.Handler p4, android.view.translation.ITranslationManager p5) {}
    public Translator(android.content.Context p0, android.view.translation.TranslationContext p1, int p2, android.view.translation.TranslationManager p3, android.os.Handler p4, android.view.translation.ITranslationManager p5, java.util.function.Consumer<android.view.translation.Translator> p6) {}
    private int getNextRequestId() { return 0; }
    private void setServiceBinder(android.os.IBinder p0) {}
    public void destroy() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public android.view.translation.TranslationContext getTranslationContext() { return null; }
    public int getTranslatorId() { return 0; }
    public boolean isDestroyed() { return false; }
    boolean isSessionCreated() throws android.view.translation.Translator.ServiceBinderReceiver.TimeoutException { return false; }
    public void requestUiTranslate(android.view.translation.TranslationRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.view.translation.TranslationResponse> p2) {}
    void start() {}
    public void translate(android.view.translation.TranslationRequest p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.view.translation.TranslationResponse> p3) {}
    @java.lang.Deprecated
    public void translate(android.view.translation.TranslationRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.view.translation.TranslationResponse> p2) {}

    static class ServiceBinderReceiver extends com.android.internal.os.IResultReceiver.Stub {
        private java.util.function.Consumer<android.view.translation.Translator> mCallback;
        private final java.util.concurrent.CountDownLatch mLatch = null;
        private int mSessionId;
        private final android.view.translation.Translator mTranslator = null;
        ServiceBinderReceiver(android.view.translation.Translator p0) { super(); }
        ServiceBinderReceiver(android.view.translation.Translator p0, java.util.function.Consumer<android.view.translation.Translator> p1) { super(); }
        int getSessionStateResult() throws android.view.translation.Translator.ServiceBinderReceiver.TimeoutException { return 0; }
        public void send(int p0, android.os.Bundle p1) {}

        static final class TimeoutException extends java.lang.Exception {
            private TimeoutException(java.lang.String p0) { super(); }
        }
    }

    private static class TranslationResponseCallbackImpl extends android.service.translation.ITranslationCallback.Stub {
        private final java.util.function.Consumer<android.view.translation.TranslationResponse> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        TranslationResponseCallbackImpl(java.util.function.Consumer<android.view.translation.TranslationResponse> p0, java.util.concurrent.Executor p1) { super(); }
        public void onTranslationResponse(android.view.translation.TranslationResponse p0) throws android.os.RemoteException {}
    }
}
