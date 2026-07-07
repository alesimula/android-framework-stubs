package android.inputmethodservice;

final class InkWindow extends com.android.internal.policy.PhoneWindow {
    private android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private android.view.View mInkView;
    private android.inputmethodservice.InkWindow.InkVisibilityListener mInkViewVisibilityListener;
    private boolean mIsViewAdded;
    private final android.view.WindowManager mWindowManager = null;
    public InkWindow(android.content.Context p0) { super((android.content.Context)null); }
    private void show(boolean p0) {}
    public void addContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void clearContentView() {}
    void dispatchHandwritingEvent(android.view.MotionEvent p0) {}
    void hide(boolean p0) {}
    void initInkViewVisibilityListener() {}
    void initOnly() {}
    boolean isInkViewVisible() { return false; }
    public void setContentView(android.view.View p0) {}
    public void setContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    void setInkViewVisibilityListener(android.inputmethodservice.InkWindow.InkVisibilityListener p0) {}
    void setToken(android.os.IBinder p0) {}
    void show() {}

    static interface InkVisibilityListener {
        public void onInkViewVisible();
    }
}
