package android.inputmethodservice;

final class SoftInputWindow extends android.app.Dialog {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "SoftInputWindow";
    private final android.view.KeyEvent.DispatcherState mDispatcherState = null;
    private final android.inputmethodservice.InputMethodService mService = null;
    private int mWindowState;
    SoftInputWindow(android.inputmethodservice.InputMethodService p0, int p1, android.view.KeyEvent.DispatcherState p2) { super((android.content.Context)null); }
    private static java.lang.String stateToString(int p0) { return null; }
    private void updateWindowState(int p0) {}
    protected boolean allowsRegisterDefaultOnBackInvokedCallback() { return false; }
    void dismissForDestroyIfNecessary() {}
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void onWindowFocusChanged(boolean p0) {}
    void setToken(android.os.IBinder p0) {}
    public void show() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface WindowState {
        public static final int DESTROYED = 4;
        public static final int REJECTED_AT_LEAST_ONCE = 3;
        public static final int SHOWN_AT_LEAST_ONCE = 2;
        public static final int TOKEN_PENDING = 0;
        public static final int TOKEN_SET = 1;
    }
}
