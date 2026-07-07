package android.window;

public class WindowOnBackInvokedDispatcher implements android.window.OnBackInvokedDispatcher {
    private static final boolean ALWAYS_ENFORCE_PREDICTIVE_BACK = Boolean.valueOf(false);
    private static final boolean ENABLE_PREDICTIVE_BACK = Boolean.valueOf(false);
    private static final boolean PREDICTIVE_BACK_FALLBACK_WINDOW_ATTRIBUTE = Boolean.valueOf(false);
    private static final java.lang.String TAG = "WindowOnBackDispatcher";
    private final java.util.HashMap<android.window.OnBackInvokedCallback, java.lang.Integer> mAllCallbacks = null;
    private float mBackSwipeLinearThreshold;
    private android.window.WindowOnBackInvokedDispatcher.Checker mChecker;
    private final android.os.Handler mHandler = null;
    private android.view.ImeBackAnimationController mImeBackAnimationController;
    private android.window.ImeBackCallbackSender mImeBackCallbackSender;
    private final java.lang.Object mLock = null;
    private float mNonLinearProgressFactor;
    public final java.util.TreeMap<java.lang.Integer, java.util.ArrayList<android.window.OnBackInvokedCallback>> mOnBackInvokedCallbacks = null;
    public final android.window.BackProgressAnimator mProgressAnimator = null;
    private final java.lang.Runnable mScheduledOnBackInvokedCallbackUpdater = null;
    public java.util.Set<android.window.OnBackInvokedCallback> mSystemNavigationObserverCallbacks;
    public final android.window.BackTouchTracker mTouchTracker = null;
    private android.view.ViewRootImpl mViewRoot;
    private android.view.IWindow mWindow;
    private android.view.IWindowSession mWindowSession;
    public WindowOnBackInvokedDispatcher(android.content.Context p0, android.os.Looper p1) {}
    private boolean callOnKeyPreIme() { return false; }
    private android.window.OnBackInvokedCallbackInfo createCallbackInfo(android.window.OnBackInvokedCallback p0) { return null; }
    private void forEachObserverCallback(java.util.function.Consumer<android.window.OnBackInvokedCallback> p0) {}
    public static boolean isOnBackInvokedCallbackEnabled(android.content.Context p0) { return false; }
    public static boolean isOnBackInvokedCallbackEnabled(android.content.pm.ActivityInfo p0, android.content.pm.ApplicationInfo p1, java.util.function.Supplier<android.content.Context> p2) { return false; }
    private void registerSystemNavigationObserverCallback(android.window.OnBackInvokedCallback p0) {}
    private void removeCallbackInternal(android.window.OnBackInvokedCallback p0) {}
    private void sendCancelledIfInProgress(android.window.OnBackInvokedCallback p0) {}
    private void setTopOnBackInvokedCallback(android.window.OnBackInvokedCallback p0) {}
    public void attachToWindow(android.view.IWindowSession p0, android.view.IWindow p1, android.view.ViewRootImpl p2, android.view.ImeBackAnimationController p3) {}
    public void clear() {}
    public void detachFromWindow() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public android.window.OnBackInvokedCallback getTopCallback() { return null; }
    public boolean hasImeBackCallbackSender() { return false; }
    public boolean isBackGestureInProgress() { return false; }
    public boolean isInterceptedMotionEvent() { return false; }
    public boolean isOnBackInvokedCallbackEnabled() { return false; }
    public void onBackCancelled(android.window.OnBackInvokedCallback p0) {}
    public void onBackInvoked(android.window.OnBackInvokedCallback p0) {}
    public void onBackStarted(android.window.OnBackInvokedCallback p0, android.window.BackEvent p1, boolean p2) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onMotionEvent(android.view.MotionEvent p0) {}
    public void registerOnBackInvokedCallback(int p0, android.window.OnBackInvokedCallback p1) {}
    public void registerOnBackInvokedCallbackUnchecked(android.window.OnBackInvokedCallback p0, int p1) {}
    public void registerSystemOnBackInvokedCallback(android.window.OnBackInvokedCallback p0) {}
    public void setImeBackCallbackSender(android.window.ImeBackCallbackSender p0) {}
    public void setMotionEventIntercepted() {}
    public void unregisterOnBackInvokedCallback(android.window.OnBackInvokedCallback p0) {}
    public void updateContext(android.content.Context p0) {}

    public static class Checker {
        private java.lang.ref.WeakReference<android.content.Context> mContext;
        public Checker(android.content.Context p0) {}
        private android.content.Context getContext() { return null; }
        public boolean checkApplicationCallbackRegistration(int p0, android.window.OnBackInvokedCallback p1) { return false; }
    }

    private class OnBackInvokedCallbackWrapper extends android.window.IOnBackInvokedCallback.Stub {
        private final java.lang.ref.WeakReference<android.window.OnBackInvokedCallback> mCallback = null;
        private final android.os.Handler mHandler = null;
        private final java.util.function.BooleanSupplier mOnKeyPreIme = null;
        private final android.window.BackProgressAnimator mProgressAnimator = null;
        private final android.window.BackTouchTracker mTouchTracker = null;
        OnBackInvokedCallbackWrapper(java.lang.ref.WeakReference<android.window.OnBackInvokedCallback> p0, android.window.BackTouchTracker p1, android.window.BackProgressAnimator p2, android.os.Handler p3, java.util.function.BooleanSupplier p4) { super(); }
        private boolean consumedByOnKeyPreIme() { return false; }
        private android.window.OnBackAnimationCallback getBackAnimationCallback() { return null; }
        public void onBackCancelled() {}
        public void onBackInvoked() throws android.os.RemoteException {}
        public void onBackProgressed(android.window.BackMotionEvent p0) {}
        public void onBackStarted(android.window.BackMotionEvent p0, boolean p1) {}
        public void setHandoffHandler(android.window.IBackAnimationHandoffHandler p0) {}
        public void setTriggerBack(boolean p0) throws android.os.RemoteException {}
    }
}
