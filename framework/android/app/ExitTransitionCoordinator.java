package android.app;

public class ExitTransitionCoordinator extends android.app.ActivityTransitionCoordinator {
    private static final java.lang.String TAG = "ExitTransitionCoordinator";
    static long sMaxWaitMillis;
    private android.animation.ObjectAnimator mBackgroundAnimator;
    private android.app.ExitTransitionCoordinator.ExitTransitionCallbacks mExitCallbacks;
    private boolean mExitNotified;
    private android.os.Bundle mExitSharedElementBundle;
    private android.os.Handler mHandler;
    private boolean mIsBackgroundReady;
    private boolean mIsCanceled;
    private boolean mIsExitStarted;
    private boolean mIsHidden;
    private android.os.Bundle mSharedElementBundle;
    private boolean mSharedElementNotified;
    private boolean mSharedElementsHidden;
    public ExitTransitionCoordinator(android.app.ExitTransitionCoordinator.ExitTransitionCallbacks p0, android.view.Window p1, android.app.SharedElementCallback p2, java.util.ArrayList<java.lang.String> p3, java.util.ArrayList<java.lang.String> p4, java.util.ArrayList<android.view.View> p5, boolean p6) { super(null, null, null, false); }
    private void beginTransitions() {}
    private android.os.Bundle captureExitSharedElementsState() { return null; }
    private void delayCancel() {}
    private void fadeOutBackground() {}
    private void finish() {}
    private void finishIfNecessary() {}
    private android.transition.Transition getExitTransition() { return null; }
    private android.transition.Transition getSharedElementExitTransition() { return null; }
    private void hideSharedElements() {}
    private void notifyExitComplete() {}
    private void sharedElementExitBack() {}
    private void startExitTransition() {}
    private void startSharedElementExit(android.view.ViewGroup p0) {}
    private void stopCancel() {}
    protected void clearState() {}
    protected android.transition.Transition getSharedElementTransition() { return null; }
    protected android.transition.Transition getViewsTransition() { return null; }
    protected boolean isReadyToNotify() { return false; }
    protected boolean moveSharedElementWithParent() { return false; }
    protected void notifyComplete() {}
    protected void onReceiveResult(int p0, android.os.Bundle p1) {}
    protected void onTransitionsComplete() {}
    public void resetViews() {}
    protected void sharedElementTransitionComplete() {}
    public void startExit() {}
    public void startExit(android.app.Activity p0) {}
    public void stop(android.app.Activity p0) {}

    public static class ActivityExitTransitionCallbacks implements android.app.ExitTransitionCoordinator.ExitTransitionCallbacks {
        final android.app.Activity mActivity = null;
        ActivityExitTransitionCallbacks(android.app.Activity p0) {}
        public boolean isReturnTransitionAllowed() { return false; }
        public void onFinish() {}
    }

    public static interface ExitTransitionCallbacks {
        default public void hideSharedElements() {}
        public boolean isReturnTransitionAllowed();
        public void onFinish();
    }
}
