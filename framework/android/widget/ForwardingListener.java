package android.widget;

public abstract class ForwardingListener implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {
    private int mActivePointerId;
    private java.lang.Runnable mDisallowIntercept;
    private boolean mForwarding;
    private final int mLongPressTimeout = 0;
    private final float mScaledTouchSlop = 0.0f;
    private final android.view.View mSrc = null;
    private final int mTapTimeout = 0;
    private java.lang.Runnable mTriggerLongPress;
    public ForwardingListener(android.view.View p0) {}
    private void clearCallbacks() {}
    private void onLongPress() {}
    private boolean onTouchForwarded(android.view.MotionEvent p0) { return false; }
    private boolean onTouchObserved(android.view.MotionEvent p0) { return false; }
    public abstract com.android.internal.view.menu.ShowableListMenu getPopup();
    protected boolean onForwardingStarted() { return false; }
    protected boolean onForwardingStopped() { return false; }
    public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
    public void onViewAttachedToWindow(android.view.View p0) {}
    public void onViewDetachedFromWindow(android.view.View p0) {}

    private class DisallowIntercept implements java.lang.Runnable {
        private DisallowIntercept(android.widget.ForwardingListener p0) {}
        public void run() {}
    }

    private class TriggerLongPress implements java.lang.Runnable {
        private TriggerLongPress(android.widget.ForwardingListener p0) {}
        public void run() {}
    }
}
