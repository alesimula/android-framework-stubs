package android.view;

public class ImeBackAnimationController implements android.window.OnBackAnimationCallback {
    private static final android.view.animation.Interpolator BACK_GESTURE = null;
    private static final android.view.animation.Interpolator EMPHASIZED_DECELERATE = null;
    private static final float PEEK_FRACTION = 0.10000000149011612f;
    private static final int POST_COMMIT_CANCEL_DURATION_MS = 50;
    private static final java.lang.String TAG = "ImeBackAnimationController";
    private final android.view.InsetsController mInsetsController = null;
    private boolean mIsPreCommitAnimationInProgress;
    private float mLastProgress;
    private android.animation.ValueAnimator mPostCommitAnimator;
    private int mStartRootScrollY;
    private boolean mTriggerBack;
    private final android.view.ViewRootImpl mViewRoot = null;
    private android.view.WindowInsetsAnimationController mWindowInsetsAnimationController;
    public ImeBackAnimationController(android.view.ViewRootImpl p0, android.view.InsetsController p1) {}
    private boolean isAdjustPan() { return false; }
    private boolean isBackAnimationAllowed() { return false; }
    private boolean isHideAnimationInProgress() { return false; }
    private void reset() {}
    private void resetPostCommitAnimator() {}
    private void setInterpolatedProgress(float p0) {}
    private void setPreCommitProgress(float p0) {}
    private void startPostCommitAnim(boolean p0) {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    boolean isAnimationInProgress() { return false; }
    public void onBackCancelled() {}
    public void onBackInvoked() {}
    public void onBackProgressed(android.window.BackEvent p0) {}
    public void onBackStarted(android.window.BackEvent p0) {}
}
