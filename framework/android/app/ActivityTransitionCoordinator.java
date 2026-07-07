package android.app;

abstract class ActivityTransitionCoordinator extends android.os.ResultReceiver {
    protected static final java.lang.String KEY_ELEVATION = "shared_element:elevation";
    protected static final java.lang.String KEY_IMAGE_MATRIX = "shared_element:imageMatrix";
    static final java.lang.String KEY_REMOTE_RECEIVER = "android:remoteReceiver";
    protected static final java.lang.String KEY_SCALE_TYPE = "shared_element:scaleType";
    protected static final java.lang.String KEY_SCREEN_BOTTOM = "shared_element:screenBottom";
    protected static final java.lang.String KEY_SCREEN_LEFT = "shared_element:screenLeft";
    protected static final java.lang.String KEY_SCREEN_RIGHT = "shared_element:screenRight";
    protected static final java.lang.String KEY_SCREEN_TOP = "shared_element:screenTop";
    protected static final java.lang.String KEY_SNAPSHOT = "shared_element:bitmap";
    protected static final java.lang.String KEY_TRANSLATION_Z = "shared_element:translationZ";
    public static final int MSG_ALLOW_RETURN_TRANSITION = 108;
    public static final int MSG_CANCEL = 106;
    public static final int MSG_EXIT_TRANSITION_COMPLETE = 104;
    public static final int MSG_HIDE_SHARED_ELEMENTS = 101;
    public static final int MSG_SET_REMOTE_RECEIVER = 100;
    public static final int MSG_SHARED_ELEMENT_DESTINATION = 107;
    public static final int MSG_START_EXIT_TRANSITION = 105;
    public static final int MSG_TAKE_SHARED_ELEMENTS = 103;
    protected static final android.widget.ImageView.ScaleType[] SCALE_TYPE_VALUES = null;
    private static final java.lang.String TAG = "ActivityTransitionCoordinator";
    protected final java.util.ArrayList<java.lang.String> mAllSharedElementNames = null;
    private boolean mBackgroundAnimatorComplete;
    private final android.app.ActivityTransitionCoordinator.FixedEpicenterCallback mEpicenterCallback = null;
    private java.util.ArrayList<android.app.ActivityTransitionCoordinator.GhostViewListeners> mGhostViewListeners;
    protected final boolean mIsReturning = false;
    private boolean mIsStartingTransition;
    protected android.app.SharedElementCallback mListener;
    private android.util.ArrayMap<android.view.View, java.lang.Float> mOriginalAlphas;
    private java.lang.Runnable mPendingTransition;
    protected android.os.ResultReceiver mResultReceiver;
    protected final java.util.ArrayList<java.lang.String> mSharedElementNames = null;
    private java.util.ArrayList<android.graphics.Matrix> mSharedElementParentMatrices;
    private boolean mSharedElementTransitionComplete;
    protected final java.util.ArrayList<android.view.View> mSharedElements = null;
    private java.util.ArrayList<android.view.View> mStrippedTransitioningViews;
    protected java.util.ArrayList<android.view.View> mTransitioningViews;
    private boolean mViewsTransitionComplete;
    private android.view.Window mWindow;
    public ActivityTransitionCoordinator(android.view.Window p0, java.util.ArrayList<java.lang.String> p1, android.app.SharedElementCallback p2, boolean p3) { super((android.os.Handler)null); }
    private static void findIncludedViews(android.transition.Transition p0, java.util.ArrayList<android.view.View> p1, android.util.ArraySet<android.view.View> p2) {}
    private static android.app.ActivityTransitionCoordinator.SharedElementOriginalState getOldSharedElementState(android.view.View p0, java.lang.String p1, android.os.Bundle p2) { return null; }
    private void getSharedElementParentMatrix(android.view.View p0, android.graphics.Matrix p1) {}
    public static boolean isInTransitionGroup(android.view.ViewParent p0, android.view.ViewGroup p1) { return false; }
    private static boolean isNested(android.view.View p0, android.util.ArrayMap<java.lang.String, android.view.View> p1) { return false; }
    protected static android.transition.Transition mergeTransitions(android.transition.Transition p0, android.transition.Transition p1) { return null; }
    private static void noLayoutSuppressionForVisibilityTransitions(android.transition.Transition p0) {}
    protected static void removeExcludedViews(android.transition.Transition p0, java.util.ArrayList<android.view.View> p1) {}
    private static int scaleTypeToInt(android.widget.ImageView.ScaleType p0) { return 0; }
    private void setEpicenter(android.view.View p0) {}
    protected static void setOriginalSharedElementState(java.util.ArrayList<android.view.View> p0, java.util.ArrayList<android.app.ActivityTransitionCoordinator.SharedElementOriginalState> p1) {}
    private void setSharedElementMatrices() {}
    private void setSharedElementState(android.view.View p0, java.lang.String p1, android.os.Bundle p2, android.graphics.Matrix p3, android.graphics.RectF p4, int[] p5) {}
    private void setSharedElements(android.util.ArrayMap<java.lang.String, android.view.View> p0) {}
    private void showView(android.view.View p0, boolean p1) {}
    private void startInputWhenTransitionsComplete() {}
    protected void backgroundAnimatorComplete() {}
    protected boolean cancelPendingTransitions() { return false; }
    protected android.os.Bundle captureSharedElementState() { return null; }
    protected void captureSharedElementState(android.view.View p0, java.lang.String p1, android.os.Bundle p2, android.graphics.Matrix p3, android.graphics.RectF p4) {}
    protected void clearState() {}
    protected android.transition.Transition configureTransition(android.transition.Transition p0, boolean p1) { return null; }
    public java.util.ArrayList<android.view.View> copyMappedViews() { return null; }
    protected java.util.ArrayList<android.view.View> createSnapshots(android.os.Bundle p0, java.util.Collection<java.lang.String> p1) { return null; }
    public java.util.ArrayList<java.lang.String> getAcceptedNames() { return null; }
    public android.view.ViewGroup getDecor() { return null; }
    protected long getFadeDuration() { return 0L; }
    public java.util.ArrayList<java.lang.String> getMappedNames() { return null; }
    protected abstract android.transition.Transition getViewsTransition();
    protected android.view.Window getWindow() { return null; }
    protected void hideViews(java.util.ArrayList<android.view.View> p0) {}
    public boolean isTransitionRunning() { return false; }
    protected boolean isViewsTransitionComplete() { return false; }
    protected android.util.ArrayMap<java.lang.String, android.view.View> mapSharedElements(java.util.ArrayList<java.lang.String> p0, java.util.ArrayList<android.view.View> p1) { return null; }
    protected boolean moveSharedElementWithParent() { return false; }
    protected void moveSharedElementsFromOverlay() {}
    protected void moveSharedElementsToOverlay() {}
    protected void notifySharedElementEnd(java.util.ArrayList<android.view.View> p0) {}
    protected void onTransitionsComplete() {}
    protected void pauseInput() {}
    protected void scheduleGhostVisibilityChange(int p0) {}
    protected void scheduleSetSharedElementEnd(java.util.ArrayList<android.view.View> p0) {}
    protected void setEpicenter() {}
    protected void setGhostVisibility(int p0) {}
    protected void setResultReceiver(android.os.ResultReceiver p0) {}
    protected java.util.ArrayList<android.app.ActivityTransitionCoordinator.SharedElementOriginalState> setSharedElementState(android.os.Bundle p0, java.util.ArrayList<android.view.View> p1) { return null; }
    protected android.transition.Transition setTargets(android.transition.Transition p0, boolean p1) { return null; }
    protected void setTransitioningViewsVisiblity(int p0, boolean p1) {}
    protected void sharedElementTransitionComplete() {}
    protected void showViews(java.util.ArrayList<android.view.View> p0, boolean p1) {}
    protected void startTransition(java.lang.Runnable p0) {}
    protected void stripOffscreenViews() {}
    protected void transitionStarted() {}
    protected void viewsReady(android.util.ArrayMap<java.lang.String, android.view.View> p0) {}
    protected void viewsTransitionComplete() {}

    protected class ContinueTransitionListener extends android.transition.TransitionListenerAdapter {
        protected ContinueTransitionListener(android.app.ActivityTransitionCoordinator p0) { super(); }
        public void onTransitionEnd(android.transition.Transition p0) {}
        public void onTransitionStart(android.transition.Transition p0) {}
    }

    private static class FixedEpicenterCallback extends android.transition.Transition.EpicenterCallback {
        private android.graphics.Rect mEpicenter;
        private FixedEpicenterCallback() { super(); }
        public android.graphics.Rect onGetEpicenter(android.transition.Transition p0) { return null; }
        public void setEpicenter(android.graphics.Rect p0) {}
    }

    private static class GhostViewListeners implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
        private android.view.ViewGroup mDecor;
        private android.graphics.Matrix mMatrix;
        private android.view.View mParent;
        private android.view.View mView;
        private android.view.ViewTreeObserver mViewTreeObserver;
        public GhostViewListeners(android.view.View p0, android.view.View p1, android.view.ViewGroup p2) {}
        public android.view.View getView() { return null; }
        public boolean onPreDraw() { return false; }
        public void onViewAttachedToWindow(android.view.View p0) {}
        public void onViewDetachedFromWindow(android.view.View p0) {}
        public void removeListener() {}
    }

    static class SharedElementOriginalState {
        int mBottom;
        float mElevation;
        int mLeft;
        android.graphics.Matrix mMatrix;
        int mMeasuredHeight;
        int mMeasuredWidth;
        int mRight;
        android.widget.ImageView.ScaleType mScaleType;
        int mTop;
        float mTranslationZ;
        SharedElementOriginalState() {}
    }
}
