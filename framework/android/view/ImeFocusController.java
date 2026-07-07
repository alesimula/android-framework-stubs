package android.view;

public final class ImeFocusController {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ImeFocusController";
    private android.view.ImeFocusController.InputMethodManagerDelegate mDelegate;
    private boolean mHasImeFocus;
    private final android.view.ViewRootImpl mViewRootImpl = null;
    ImeFocusController(android.view.ViewRootImpl p0) {}
    private android.view.ImeFocusController.InputMethodManagerDelegate getImmDelegate() { return null; }
    private static boolean isInLocalFocusMode(android.view.WindowManager.LayoutParams p0) { return false; }
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    boolean hasImeFocus() { return false; }
    void onMovedToDisplay() {}
    void onPostWindowFocus(android.view.View p0, boolean p1, android.view.WindowManager.LayoutParams p2) {}
    void onPreWindowFocus(boolean p0, android.view.WindowManager.LayoutParams p1) {}
    int onProcessImeInputStage(java.lang.Object p0, android.view.InputEvent p1, android.view.WindowManager.LayoutParams p2, android.view.inputmethod.InputMethodManager.FinishedInputEventCallback p3) { return 0; }
    void onScheduledCheckFocus() {}
    void onTraversal(boolean p0, android.view.WindowManager.LayoutParams p1) {}
    void onViewDetachedFromWindow(android.view.View p0) {}
    void onViewFocusChanged(android.view.View p0, boolean p1) {}
    void onWindowDismissed() {}
    public void setImmDelegate(android.view.ImeFocusController.InputMethodManagerDelegate p0) {}

    public static interface InputMethodManagerDelegate {
        public void onPostWindowGainedFocus(android.view.View p0, android.view.WindowManager.LayoutParams p1);
        public void onPreWindowGainedFocus(android.view.ViewRootImpl p0);
        public void onScheduledCheckFocus(android.view.ViewRootImpl p0);
        public void onViewDetachedFromWindow(android.view.View p0, android.view.ViewRootImpl p1);
        public void onViewFocusChanged(android.view.View p0, boolean p1);
        public void onWindowDismissed(android.view.ViewRootImpl p0);
        public void onWindowLostFocus(android.view.ViewRootImpl p0);
    }
}
