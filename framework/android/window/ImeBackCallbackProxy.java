package android.window;

public class ImeBackCallbackProxy {
    static final int RESULT_CODE_REGISTER = 0;
    static final int RESULT_CODE_UNREGISTER = 1;
    static final java.lang.String RESULT_KEY_CALLBACK = "callback";
    static final java.lang.String RESULT_KEY_ID = "id";
    static final java.lang.String RESULT_KEY_PRIORITY = "priority";
    private static final java.lang.String TAG = "ImeBackCallbackProxy";
    private final java.util.ArrayList<android.window.ImeBackCallbackProxy.ImeOnBackInvokedCallback> mImeCallbacks = null;
    private final java.util.ArrayDeque<android.util.Pair<java.lang.Integer, android.os.Bundle>> mQueuedReceive = null;
    private final android.os.ResultReceiver mResultReceiver = null;
    public ImeBackCallbackProxy(android.os.Handler p0) {}
    private void receive(int p0, android.os.Bundle p1, android.window.WindowOnBackInvokedDispatcher p2) {}
    private void registerReceivedCallback(android.window.IOnBackInvokedCallback p0, int p1, int p2, android.window.WindowOnBackInvokedDispatcher p3) {}
    private boolean unregisterCallback(int p0, android.window.OnBackInvokedDispatcher p1) { return false; }
    private void unregisterReceivedCallback(int p0, android.window.OnBackInvokedDispatcher p1) {}
    public void clear() {}
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    protected android.window.WindowOnBackInvokedDispatcher getReceivingDispatcher() { return null; }
    public android.os.ResultReceiver getResultReceiver() { return null; }
    public void preliminaryClear() {}
    public void switchRootView(android.view.ViewRootImpl p0, android.view.ViewRootImpl p1) {}
    public void undoPreliminaryClear() {}
    public void updateReceivingDispatcher(android.window.WindowOnBackInvokedDispatcher p0) {}

    public static class DefaultImeOnBackAnimationCallback extends android.window.ImeBackCallbackProxy.ImeOnBackInvokedCallback {
        DefaultImeOnBackAnimationCallback(android.window.IOnBackInvokedCallback p0, int p1, int p2) { super(null, 0, 0); }
        public java.lang.String toString() { return null; }
    }

    public static class ImeOnBackInvokedCallback implements android.window.OnBackAnimationCallback {
        protected final android.window.IOnBackInvokedCallback mIOnBackInvokedCallback = null;
        protected final int mId = 0;
        private final int mPriority = 0;
        ImeOnBackInvokedCallback(android.window.IOnBackInvokedCallback p0, int p1, int p2) {}
        private int getId() { return 0; }
        public void onBackCancelled() {}
        public void onBackInvoked() {}
        public void onBackProgressed(android.window.BackEvent p0) {}
        public void onBackStarted(android.window.BackEvent p0) {}
        public java.lang.String toString() { return null; }
    }
}
