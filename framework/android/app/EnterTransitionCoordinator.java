package android.app;

class EnterTransitionCoordinator extends android.app.ActivityTransitionCoordinator {
    private static final int MIN_ANIMATION_FRAMES = 2;
    private static final java.lang.String TAG = "EnterTransitionCoordinator";
    private android.app.Activity mActivity;
    private boolean mAreViewsReady;
    private android.animation.ObjectAnimator mBackgroundAnimator;
    private android.transition.Transition mEnterViewsTransition;
    private boolean mHasStopped;
    private boolean mIsCanceled;
    private final boolean mIsCrossTask = false;
    private boolean mIsExitTransitionComplete;
    private boolean mIsReadyForTransition;
    private boolean mIsTaskRoot;
    private boolean mIsViewsTransitionStarted;
    private java.lang.Runnable mOnTransitionComplete;
    private java.util.ArrayList<java.lang.String> mPendingExitNames;
    private android.graphics.drawable.Drawable mReplacedBackground;
    private boolean mSharedElementTransitionStarted;
    private android.os.Bundle mSharedElementsBundle;
    private com.android.internal.view.OneShotPreDrawListener mViewsReadyListener;
    private boolean mWasOpaque;
    EnterTransitionCoordinator(android.app.Activity p0, android.os.ResultReceiver p1, java.util.ArrayList<java.lang.String> p2, boolean p3, boolean p4) { super(null, null, null, false); }
    private boolean allowOverlappingTransitions() { return false; }
    private android.transition.Transition beginTransition(android.view.ViewGroup p0, boolean p1, boolean p2) { return null; }
    private void cancel() {}
    private static android.app.SharedElementCallback getListener(android.app.Activity p0, boolean p1) { return null; }
    private void makeOpaque() {}
    private android.util.ArrayMap<java.lang.String, android.view.View> mapNamedElements(java.util.ArrayList<java.lang.String> p0, java.util.ArrayList<java.lang.String> p1) { return null; }
    private void onTakeSharedElements() {}
    private static void removeNullViews(java.util.ArrayList<android.view.View> p0) {}
    private void requestLayoutForSharedElements() {}
    private void sendSharedElementDestination() {}
    private void sharedElementTransitionStarted() {}
    private void startEnterTransition(android.transition.Transition p0) {}
    private void startEnterTransitionOnly() {}
    private void startRejectedAnimations(java.util.ArrayList<android.view.View> p0) {}
    private void startSharedElementTransition(android.os.Bundle p0) {}
    private void triggerViewsReady(android.util.ArrayMap<java.lang.String, android.view.View> p0) {}
    public boolean cancelEnter() { return false; }
    protected void clearState() {}
    public void forceViewsToAppear() {}
    public android.transition.Transition getEnterViewsTransition() { return null; }
    public java.util.ArrayList<java.lang.String> getPendingExitSharedElementNames() { return null; }
    protected android.transition.Transition getSharedElementTransition() { return null; }
    protected android.transition.Transition getViewsTransition() { return null; }
    boolean isCrossTask() { return false; }
    public boolean isReturning() { return false; }
    public boolean isWaitingForRemoteExit() { return false; }
    public void namedViewsReady(java.util.ArrayList<java.lang.String> p0, java.util.ArrayList<java.lang.String> p1) {}
    protected void onReceiveResult(int p0, android.os.Bundle p1) {}
    protected void onRemoteExitTransitionComplete() {}
    protected void onTransitionsComplete() {}
    protected void prepareEnter() {}
    public void runAfterTransitionsComplete(java.lang.Runnable p0) {}
    public void stop() {}
    public void viewInstancesReady(java.util.ArrayList<java.lang.String> p0, java.util.ArrayList<java.lang.String> p1, java.util.ArrayList<android.view.View> p2) {}
    protected void viewsReady(android.util.ArrayMap<java.lang.String, android.view.View> p0) {}
}
