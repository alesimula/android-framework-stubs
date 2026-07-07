package android.view;

public final class ScreenRecordingCallbacks {
    private static android.view.ScreenRecordingCallbacks sInstance;
    private static final java.lang.Object sLock = null;
    private android.window.IScreenRecordingCallback mCallbackNotifier;
    private final android.util.ArrayMap<java.util.function.Consumer<java.lang.Integer>, java.util.concurrent.Executor> mCallbacks = null;
    private int mState;
    private ScreenRecordingCallbacks() {}
    static android.view.ScreenRecordingCallbacks getInstance() { return null; }
    private static android.view.IWindowManager getWindowManagerService() { return null; }
    private void notifyCallbacks(int p0) {}
    int addCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) { return 0; }
    void removeCallback(java.util.function.Consumer<java.lang.Integer> p0) {}
}
