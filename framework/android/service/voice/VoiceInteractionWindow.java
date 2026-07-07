package android.service.voice;

final class VoiceInteractionWindow extends android.app.Dialog {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "VoiceInteractionWindow";
    private final android.graphics.Rect mBounds = null;
    private final android.service.voice.VoiceInteractionWindow.Callback mCallback = null;
    private final android.view.KeyEvent.DispatcherState mDispatcherState = null;
    private final int mGravity = 0;
    private final android.view.KeyEvent.Callback mKeyEventCallback = null;
    private final java.lang.String mName = null;
    private final boolean mTakesFocus = false;
    private int mWindowState;
    private final int mWindowType = 0;
    VoiceInteractionWindow(android.content.Context p0, java.lang.String p1, int p2, android.service.voice.VoiceInteractionWindow.Callback p3, android.view.KeyEvent.Callback p4, android.view.KeyEvent.DispatcherState p5, int p6, int p7, boolean p8) { super((android.content.Context)null); }
    private void initDockWindow() {}
    private static java.lang.String stateToString(int p0) { return null; }
    private void updateWidthHeight(android.view.WindowManager.LayoutParams p0) {}
    private void updateWindowState(int p0) {}
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public void onBackPressed() {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public void onWindowFocusChanged(boolean p0) {}
    void setToken(android.os.IBinder p0) {}
    public void show() {}

    static interface Callback {
        public void onBackPressed();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface WindowState {
        public static final int DESTROYED = 4;
        public static final int REJECTED_AT_LEAST_ONCE = 3;
        public static final int SHOWN_AT_LEAST_ONCE = 2;
        public static final int TOKEN_PENDING = 0;
        public static final int TOKEN_SET = 1;
    }
}
