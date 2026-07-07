package android.window;

public class ImeBackCallbackSender implements android.window.OnBackInvokedDispatcher {
    private static final java.lang.String TAG = "ImeBackCallbackSender";
    private android.os.Handler mHandler;
    private final java.util.ArrayDeque<android.util.Pair<java.lang.Integer, android.window.OnBackInvokedCallback>> mNonSystemCallbacks = null;
    private android.os.ResultReceiver mResultReceiver;
    private boolean mSkipDefaultCallbackRegistration;
    private android.window.OnBackInvokedCallback mSystemCallback;
    private java.lang.String mTargetAppPackageName;
    public ImeBackCallbackSender() {}
    private void registerOnBackInvokedCallbackAtTarget(int p0, android.window.OnBackInvokedCallback p1) {}
    private void unregisterOnBackInvokedCallbackAtTarget(android.window.OnBackInvokedCallback p0) {}
    public void clear() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public void registerOnBackInvokedCallback(int p0, android.window.OnBackInvokedCallback p1) {}
    public void setHandler(android.os.Handler p0) {}
    public void setResultReceiver(android.os.ResultReceiver p0) {}
    public void setSkipDefaultCallbackRegistration(boolean p0) {}
    public void setTargetAppPackageName(java.lang.String p0) {}
    public void unregisterOnBackInvokedCallback(android.window.OnBackInvokedCallback p0) {}

    private static class ImeOnBackInvokedCallbackWrapper extends android.window.IOnBackInvokedCallback.Stub {
        private final android.window.OnBackInvokedCallback mCallback = null;
        private final android.os.Handler mHandler = null;
        ImeOnBackInvokedCallbackWrapper(android.window.OnBackInvokedCallback p0, android.os.Handler p1) { super(); }
        private void maybeRunOnAnimationCallback(java.util.function.Consumer<android.window.OnBackAnimationCallback> p0) {}
        public void onBackCancelled() {}
        public void onBackInvoked() {}
        public void onBackProgressed(android.window.BackMotionEvent p0) {}
        public void onBackStarted(android.window.BackMotionEvent p0, boolean p1) {}
        public void setHandoffHandler(android.window.IBackAnimationHandoffHandler p0) {}
        public void setTriggerBack(boolean p0) {}
    }
}
