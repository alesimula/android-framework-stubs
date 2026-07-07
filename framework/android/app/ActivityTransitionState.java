package android.app;

class ActivityTransitionState {
    private static final java.lang.String EXITING_MAPPED_FROM = "android:exitingMappedFrom";
    private static final java.lang.String EXITING_MAPPED_TO = "android:exitingMappedTo";
    private static final java.lang.String PENDING_EXIT_SHARED_ELEMENTS = "android:pendingExitSharedElements";
    private android.app.ExitTransitionCoordinator mCalledExitCoordinator;
    private android.app.ActivityOptions.SceneTransitionInfo mEnterSceneTransitionInfo;
    private android.app.EnterTransitionCoordinator mEnterTransitionCoordinator;
    private android.util.SparseArray<java.lang.ref.WeakReference<android.app.ExitTransitionCoordinator>> mExitTransitionCoordinators;
    private int mExitTransitionCoordinatorsKey;
    private java.util.ArrayList<java.lang.String> mExitingFrom;
    private java.util.ArrayList<java.lang.String> mExitingTo;
    private java.util.ArrayList<android.view.View> mExitingToView;
    private boolean mHasExited;
    private boolean mIsEnterPostponed;
    private boolean mIsEnterTriggered;
    private java.util.ArrayList<java.lang.String> mPendingExitNames;
    private android.app.ExitTransitionCoordinator mReturnExitCoordinator;
    public ActivityTransitionState() {}
    private java.util.ArrayList<java.lang.String> getPendingExitNames() { return null; }
    private void restoreExitedViews() {}
    private void restoreReenteringViews() {}
    private void startEnter() {}
    public int addExitTransitionCoordinator(android.app.ExitTransitionCoordinator p0) { return 0; }
    public void clear() {}
    public void enterReady(android.app.Activity p0) {}
    public boolean isTransitionRunning() { return false; }
    public void onResume(android.app.Activity p0) {}
    public void onStop(android.app.Activity p0) {}
    public void postponeEnterTransition() {}
    public void readState(android.os.Bundle p0) {}
    public void saveState(android.os.Bundle p0) {}
    public void setEnterSceneTransitionInfo(android.app.Activity p0, android.app.ActivityOptions.SceneTransitionInfo p1) {}
    public boolean startExitBackTransition(android.app.Activity p0) { return false; }
    public void startExitOutTransition(android.app.Activity p0, android.os.Bundle p1) {}
    public void startPostponedEnterTransition() {}
}
