package android.view;

public class HandwritingInitiator {
    private java.lang.ref.WeakReference<android.view.View> mCachedHoverTarget;
    public java.lang.ref.WeakReference<android.view.View> mConnectedView;
    private int mConnectionCount;
    public java.lang.ref.WeakReference<android.view.View> mFocusedView;
    private final android.view.HandwritingInitiator.HandwritingAreaTracker mHandwritingAreasTracker = null;
    private final int mHandwritingSlop = 0;
    private final long mHandwritingTimeoutInMillis = 0L;
    private final android.view.inputmethod.InputMethodManager mImm = null;
    private final boolean mInitiateWithoutConnection = false;
    private boolean mShowHoverIconForConnectedView;
    private android.view.HandwritingInitiator.State mState;
    private final int[] mTempLocation = null;
    private final android.graphics.Matrix mTempMatrix = null;
    private final android.graphics.Rect mTempRect = null;
    private final android.graphics.RectF mTempRectF = null;
    private final android.graphics.Region mTempRegion = null;
    public HandwritingInitiator(android.view.ViewConfiguration p0, android.view.inputmethod.InputMethodManager p1) {}
    private void clearConnectedView() {}
    private static boolean contains(android.graphics.Rect p0, float p1, float p2, float p3, float p4, float p5, float p6) { return false; }
    private static float distance(android.graphics.Rect p0, float p1, float p2) { return 0.0f; }
    private android.view.View findBestCandidateView(float p0, float p1, boolean p2) { return null; }
    private static android.widget.TextView findFirstTextViewDescendent(android.view.View p0) { return null; }
    private android.view.View findHoverView(android.view.MotionEvent p0) { return null; }
    private android.view.View getCachedHoverTarget() { return null; }
    private android.view.View getConnectedOrFocusedView() { return null; }
    private android.view.View getConnectedView() { return null; }
    private android.view.inputmethod.CursorAnchorInfo getCursorAnchorInfoForConnectionless(android.view.View p0) { return null; }
    private android.view.View getFocusedView() { return null; }
    private static boolean getViewHandwritingArea(android.view.View p0, android.graphics.Rect p1) { return false; }
    private boolean isInHandwritingArea(android.graphics.Rect p0, float p1, float p2, android.view.View p3, boolean p4) { return false; }
    private static boolean isViewActive(android.view.View p0) { return false; }
    private boolean largerThanTouchSlop(float p0, float p1, float p2, float p3) { return false; }
    private void onDelegationAccepted(android.view.View p0) {}
    private void prepareDelegation(android.view.View p0) {}
    private void requestFocusWithoutReveal(android.view.View p0) {}
    private static boolean shouldShowHandwritingUnavailableMessageForView(android.view.View p0) { return false; }
    private static boolean shouldTriggerHandwritingOrShowUnavailableMessageForView(android.view.View p0) { return false; }
    private static boolean shouldTriggerStylusHandwritingForView(android.view.View p0) { return false; }
    public void clearFocusedView(android.view.View p0) {}
    public void onDelegateViewFocused(android.view.View p0) {}
    public void onEditorFocused(android.view.View p0) {}
    public void onInputConnectionClosed(android.view.View p0) {}
    public void onInputConnectionCreated(android.view.View p0) {}
    public android.view.PointerIcon onResolvePointerIcon(android.content.Context p0, android.view.MotionEvent p1) { return null; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void startHandwriting(android.view.View p0) {}
    public void tryAcceptStylusHandwritingDelegation(android.view.View p0) {}
    public boolean updateFocusedView(android.view.View p0) { return false; }
    public void updateHandwritingAreasForView(android.view.View p0) {}

    private class DelegationCallback implements android.view.inputmethod.ConnectionlessHandwritingCallback {
        private final java.lang.String mDelegatePackageName = null;
        private final android.view.View mView = null;
        private DelegationCallback(android.view.HandwritingInitiator p0, android.view.View p1, java.lang.String p2) {}
        public void onError(int p0) {}
        public void onResult(java.lang.CharSequence p0) {}
    }

    public static class HandwritableViewInfo {
        android.graphics.Rect mHandwritingArea;
        public boolean mIsDirty;
        final java.lang.ref.WeakReference<android.view.View> mViewRef = null;
        public HandwritableViewInfo(android.view.View p0) {}
        public android.graphics.Rect getHandwritingArea() { return null; }
        public android.view.View getView() { return null; }
        public boolean update() { return false; }
    }

    public static class HandwritingAreaTracker {
        private final java.util.List<android.view.HandwritingInitiator.HandwritableViewInfo> mHandwritableViewInfos = null;
        public HandwritingAreaTracker() {}
        public java.util.List<android.view.HandwritingInitiator.HandwritableViewInfo> computeViewInfos() { return null; }
        public void updateHandwritingAreaForView(android.view.View p0) {}
    }

    private static class State {
        private boolean mExceedHandwritingSlop;
        private boolean mHandled;
        private java.lang.ref.WeakReference<android.view.View> mPendingConnectedView;
        private java.lang.ref.WeakReference<android.view.View> mPendingFocusedView;
        private boolean mShouldInitHandwriting;
        private final long mStylusDownTimeInMillis = 0L;
        private boolean mStylusDownWithinEditorBounds;
        private final float mStylusDownX = 0.0f;
        private final float mStylusDownY = 0.0f;
        private final int mStylusPointerId = 0;
        private State(android.view.MotionEvent p0) {}
    }
}
