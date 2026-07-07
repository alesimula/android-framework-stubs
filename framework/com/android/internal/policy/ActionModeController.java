package com.android.internal.policy;

public class ActionModeController {
    private static final java.lang.String TAG = "ActionMode";
    private int mActionModeViewInternalPaddingBottom;
    private int mActionModeViewInternalPaddingLeft;
    private int mActionModeViewInternalPaddingRight;
    private int mActionModeViewInternalPaddingTop;
    private final android.view.ViewGroup mContainerView = null;
    private final android.content.Context mContext = null;
    private android.animation.ObjectAnimator mFadeAnim;
    private android.view.ActionMode mFloatingActionMode;
    private android.view.View mFloatingActionModeOriginatingView;
    private com.android.internal.widget.floatingtoolbar.FloatingToolbar mFloatingToolbar;
    private android.view.ViewTreeObserver.OnPreDrawListener mFloatingToolbarPreDrawListener;
    private android.view.ActionMode mPrimaryActionMode;
    private android.widget.PopupWindow mPrimaryActionModePopup;
    private com.android.internal.widget.ActionBarContextView mPrimaryActionModeView;
    private java.lang.Runnable mShowPrimaryActionModePopup;
    private final int mStubViewId = 0;
    private android.graphics.Rect mTempRect;
    private com.android.internal.policy.PhoneWindow mWindow;
    public ActionModeController(android.view.ViewGroup p0, android.content.Context p1, int p2) {}
    private void cleanupFloatingActionModeViews() {}
    private void cleanupPrimaryActionMode() {}
    private android.view.ActionMode createActionMode(int p0, android.view.ActionMode.Callback2 p1, android.view.View p2) { return null; }
    private android.view.ActionMode createFloatingActionMode(android.view.View p0, android.view.ActionMode.Callback2 p1) { return null; }
    private android.view.ActionMode createStandaloneActionMode(android.view.ActionMode.Callback p0) { return null; }
    private void endOnGoingFadeAnimation() {}
    private android.view.Window.Callback getWindowCallback() { return null; }
    private void initializeActionModeViewInternalPadding() {}
    private void setHandledActionMode(android.view.ActionMode p0) {}
    private void setHandledFloatingActionMode(android.view.ActionMode p0) {}
    private void setHandledPrimaryActionMode(android.view.ActionMode p0) {}
    private boolean shouldAnimatePrimaryActionModeView() { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean hasPrimaryActionMode() { return false; }
    public void onDetachedFromWindow() {}
    public void onWindowFocusChanged(boolean p0) {}
    public void setWindow(com.android.internal.policy.PhoneWindow p0) {}
    public android.view.ActionMode startActionMode(android.view.View p0, android.view.ActionMode.Callback p1, int p2) { return null; }
    public android.view.WindowInsets updateActionModeInsets(android.view.WindowInsets p0) { return null; }

    private class ActionModeCallback2Wrapper extends android.view.ActionMode.Callback2 {
        private final android.view.ActionMode.Callback mWrapped = null;
        public ActionModeCallback2Wrapper(com.android.internal.policy.ActionModeController p0, android.view.ActionMode.Callback p1) { super(); }
        public boolean onActionItemClicked(android.view.ActionMode p0, android.view.MenuItem p1) { return false; }
        public boolean onCreateActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
        public void onDestroyActionMode(android.view.ActionMode p0) {}
        public void onGetContentRect(android.view.ActionMode p0, android.view.View p1, android.graphics.Rect p2) {}
        public boolean onPrepareActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
    }
}
