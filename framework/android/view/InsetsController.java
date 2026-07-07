package android.view;

public class InsetsController implements android.view.WindowInsetsController, android.view.InsetsAnimationControlCallbacks, android.view.InsetsAnimationControlRunner.SurfaceParamsApplier {
    private static final int ANIMATION_DELAY_DIM_MS = 500;
    private static final int ANIMATION_DURATION_FADE_IN_MS = 500;
    private static final int ANIMATION_DURATION_FADE_OUT_MS = 1500;
    private static final int ANIMATION_DURATION_MOVE_IN_MS = 275;
    private static final int ANIMATION_DURATION_MOVE_OUT_MS = 340;
    public static final int ANIMATION_DURATION_RESIZE = 300;
    static final int ANIMATION_DURATION_SYNC_IME_MS = 285;
    static final int ANIMATION_DURATION_UNSYNC_IME_MS = 200;
    public static final int ANIMATION_TYPE_HIDE = 1;
    public static final int ANIMATION_TYPE_NONE = -1;
    public static final int ANIMATION_TYPE_RESIZE = 3;
    public static final int ANIMATION_TYPE_SHOW = 0;
    public static final int ANIMATION_TYPE_USER = 2;
    static final boolean DEBUG = false;
    static final android.view.animation.Interpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = null;
    private static final int FLOATING_IME_BOTTOM_INSET_DP = -80;
    public static final int LAYOUT_INSETS_DURING_ANIMATION_HIDDEN = 1;
    public static final int LAYOUT_INSETS_DURING_ANIMATION_SHOWN = 0;
    private static final android.view.animation.Interpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = null;
    private static final int PENDING_CONTROL_TIMEOUT_MS = 2000;
    public static final android.view.animation.Interpolator RESIZE_INTERPOLATOR = null;
    static final android.view.animation.Interpolator SYNC_IME_INTERPOLATOR = null;
    private static final android.view.animation.Interpolator SYSTEM_BARS_ALPHA_INTERPOLATOR = null;
    private static final android.view.animation.Interpolator SYSTEM_BARS_DIM_INTERPOLATOR = null;
    private static final android.view.animation.Interpolator SYSTEM_BARS_INSETS_INTERPOLATOR = null;
    private static final java.lang.String TAG = "InsetsController";
    static final boolean WARN = false;
    private static final android.animation.TypeEvaluator<android.graphics.Insets> sEvaluator = null;
    private int mActivityType;
    private final java.lang.Runnable mAnimCallback = null;
    private boolean mAnimCallbackScheduled;
    private int mAnimatingTypes;
    private boolean mAnimationsDisabled;
    private int mAppearanceControlled;
    private int mAppearanceFromResource;
    private boolean mBehaviorControlled;
    private final android.graphics.Rect mBounds = null;
    private int mCancelledForNewAnimationTypes;
    private boolean mCompatSysUiVisibilityStaled;
    private final java.util.ArrayList<android.view.WindowInsetsController.OnControllableInsetsChangedListener> mControllableInsetsChangedListeners = null;
    private int mControllableTypes;
    private int mExistingTypes;
    private final android.graphics.Rect mFrame = null;
    private final android.os.Handler mHandler = null;
    private final android.view.InsetsController.Host mHost = null;
    private int mImeCaptionBarInsetsHeight;
    private final android.view.InsetsSourceConsumer mImeSourceConsumer = null;
    private boolean mIsPredictiveBackImeHideAnimInProgress;
    private final android.view.inputmethod.ImeTracker.InputMethodJankContext mJankContext = null;
    private final android.view.InsetsState mLastDispatchedState = null;
    private int mLastStartedAnimTypes;
    private int mLegacySoftInputMode;
    private int mLegacySystemUiFlags;
    private int mLegacyWindowFlags;
    private android.view.WindowInsetsAnimationControlListener mLoggingListener;
    private final java.lang.Runnable mPendingControlTimeout = null;
    private android.view.InsetsController.PendingControlRequest mPendingImeControlRequest;
    private final android.view.InsetsState.OnTraverseCallbacks mRemoveGoneSources = null;
    private int mReportedRequestedVisibleTypes;
    private int mRequestedVisibleTypes;
    private final java.util.ArrayList<android.view.InsetsController.RunningAnimation> mRunningAnimations = null;
    private boolean mScreenRound;
    private final android.util.SparseArray<android.view.InsetsSourceConsumer> mSourceConsumers = null;
    private final android.view.InsetsState.OnTraverseCallbacks mStartResizingAnimationIfNeeded = null;
    private boolean mStartingAnimation;
    private final android.view.InsetsState mState = null;
    private final android.util.SparseArray<android.view.InsetsSourceControl> mTmpControlArray = null;
    private int mTypesBeingCancelled;
    private int mVisibleTypes;
    private int mWindowType;
    public InsetsController(android.view.InsetsController.Host p0) {}
    public InsetsController(android.view.InsetsController.Host p0, android.os.Handler p1) {}
    private void abortPendingImeControlRequest() {}
    private void applyLocalVisibilityOverride() {}
    private int calculateControllableTypes() { return 0; }
    private void cancelAnimation(android.view.InsetsAnimationControlRunner p0, boolean p1) {}
    private void cancelExistingControllers(int p0) {}
    private android.util.Pair<java.lang.Integer, java.lang.Integer> collectSourceControls(int p0, android.util.SparseArray<android.view.InsetsSourceControl> p1) { return null; }
    private void controlAnimationUnchecked(int p0, android.os.CancellationSignal p1, android.view.WindowInsetsAnimationControlListener p2, android.graphics.Rect p3, android.graphics.Rect p4, android.view.InsetsAnimationSpec p5, int p6, int p7, boolean p8, android.view.inputmethod.ImeTracker.Token p9, boolean p10, boolean p11) {}
    private void controlAnimationUncheckedInner(int p0, android.os.CancellationSignal p1, android.view.WindowInsetsAnimationControlListener p2, android.graphics.Rect p3, android.graphics.Rect p4, android.view.InsetsAnimationSpec p5, int p6, int p7, boolean p8, android.view.inputmethod.ImeTracker.Token p9, boolean p10, boolean p11) {}
    private void dispatchAnimationEnd(android.view.WindowInsetsAnimation p0, boolean p1, boolean p2, boolean p3) {}
    private int getLayoutInsetsDuringAnimationMode(int p0, boolean p1, boolean p2) { return 0; }
    private void handlePendingControlRequest(android.view.InsetsController.PendingControlRequest p0, android.view.inputmethod.ImeTracker.Token p1) {}
    private int invokeControllableInsetsChangedListeners() { return 0; }
    private static boolean isRealUserAnimation(android.view.InsetsAnimationControlRunner p0) { return false; }
    static void releaseControls(android.util.SparseArray<android.view.InsetsSourceControl> p0) {}
    private void reportRequestedVisibleTypes(android.view.inputmethod.ImeTracker.Token p0) {}
    private void updateState(android.view.InsetsState p0) {}
    public void addOnControllableInsetsChangedListener(android.view.WindowInsetsController.OnControllableInsetsChangedListener p0) {}
    public void applyAnimation(int p0, boolean p1, boolean p2, android.view.inputmethod.ImeTracker.Token p3) {}
    public void applyAnimation(int p0, boolean p1, boolean p2, boolean p3, android.view.inputmethod.ImeTracker.Token p4) {}
    public void applySurfaceParams(android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p0) {}
    public android.view.WindowInsets calculateInsets(boolean p0, int p1, int p2, int p3, int p4, int p5) { return null; }
    public android.graphics.Insets calculateVisibleInsets(android.view.InsetsState p0, int p1, int p2, int p3, int p4, int p5) { return null; }
    public void cancelExistingAnimations() {}
    public int computeUserAnimatingTypes() { return 0; }
    public void controlWindowInsetsAnimation(int p0, long p1, android.view.animation.Interpolator p2, android.os.CancellationSignal p3, android.view.WindowInsetsAnimationControlListener p4) {}
    public void controlWindowInsetsAnimation(int p0, android.os.CancellationSignal p1, android.view.WindowInsetsAnimationControlListener p2, long p3, android.view.animation.Interpolator p4, int p5, boolean p6) {}
    void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public int getAnimationType(int p0) { return 0; }
    public int getAppearanceControlled() { return 0; }
    int getCancelledForNewAnimationTypes() { return 0; }
    public android.view.InsetsController.Host getHost() { return null; }
    public android.view.InsetsSourceConsumer getImeSourceConsumer() { return null; }
    public android.view.InsetsState getLastDispatchedState() { return null; }
    public int getRequestedVisibleTypes() { return 0; }
    public final android.view.InsetsSourceConsumer getSourceConsumer(int p0, int p1) { return null; }
    public android.view.InsetsState getState() { return null; }
    public int getSystemBarsAppearance() { return 0; }
    public int getSystemBarsBehavior() { return 0; }
    boolean hasSurfaceAnimation(int p0) { return false; }
    public void hide(int p0) {}
    public void hide(int p0, android.view.inputmethod.ImeTracker.Token p1) {}
    public boolean isBehaviorControlled() { return false; }
    public boolean isPredictiveBackImeHideAnimInProgress() { return false; }
    void notifyControlRevoked(android.view.InsetsSourceConsumer p0) {}
    public void notifyFinished(android.view.InsetsAnimationControlRunner p0, boolean p1) {}
    void notifyVisibilityChanged() {}
    void onAnimationStateChanged(int p0, boolean p1) {}
    public void onBoundsChanged(android.graphics.Rect p0) {}
    public void onControlsChanged(android.view.InsetsSourceControl[] p0) {}
    public void onFrameChanged(android.graphics.Rect p0) {}
    public boolean onStateChanged(android.view.InsetsState p0) { return false; }
    public void onWindowFocusGained(boolean p0) {}
    public void onWindowFocusLost() {}
    public void releaseSurfaceControlFromRt(android.view.SurfaceControl p0) {}
    public void removeOnControllableInsetsChangedListener(android.view.WindowInsetsController.OnControllableInsetsChangedListener p0) {}
    public void reportPerceptible(int p0, boolean p1) {}
    public void scheduleApplyChangeInsets(android.view.InsetsAnimationControlRunner p0) {}
    public void setAnimationsDisabled(boolean p0) {}
    public void setImeCaptionBarInsetsHeight(int p0) {}
    public void setPredictiveBackImeHideAnimInProgress(boolean p0) {}
    public void setRequestedVisibleTypes(int p0, int p1) {}
    public void setSystemBarsAppearance(int p0, int p1) {}
    public void setSystemBarsAppearanceFromResource(int p0, int p1) {}
    public void setSystemBarsBehavior(int p0) {}
    public void setSystemDrivenInsetsAnimationLoggingListener(android.view.WindowInsetsAnimationControlListener p0) {}
    public void setWindowInsetsInfo(boolean p0, int p1, int p2, int p3, int p4, int p5) {}
    public void show(int p0) {}
    public void show(int p0, android.view.inputmethod.ImeTracker.Token p1) {}
    public <T extends android.view.InsetsAnimationControlRunner & android.view.InternalInsetsAnimationController> void startAnimation(T p0, android.view.WindowInsetsAnimationControlListener p1, int p2, android.view.WindowInsetsAnimation p3, android.view.WindowInsetsAnimation.Bounds p4) {}
    public void updateCompatSysUiVisibility() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AnimationType {
    }

    public static interface Host {
        public void addOnPreDrawRunnable(java.lang.Runnable p0);
        public void applySurfaceParams(android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p0);
        public int dipToPx(int p0);
        public void dispatchWindowInsetsAnimationEnd(android.view.WindowInsetsAnimation p0, boolean p1, boolean p2, boolean p3);
        public void dispatchWindowInsetsAnimationPrepare(android.view.WindowInsetsAnimation p0, boolean p1, boolean p2, boolean p3);
        public android.view.WindowInsets dispatchWindowInsetsAnimationProgress(android.view.WindowInsets p0, android.view.InsetsState p1, java.util.List<android.view.WindowInsetsAnimation> p2, boolean p3, boolean p4, boolean p5, int p6);
        public android.view.WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(android.view.WindowInsetsAnimation p0, android.view.WindowInsetsAnimation.Bounds p1, boolean p2, boolean p3, boolean p4);
        public android.os.Handler getHandler();
        public android.view.inputmethod.InputMethodManager getInputMethodManager();
        default public android.content.Context getRootViewContext() { return null; }
        public java.lang.String getRootViewTitle();
        public int getSystemBarsAppearance();
        public int getSystemBarsBehavior();
        default public android.content.res.CompatibilityInfo.Translator getTranslator() { return null; }
        public android.os.IBinder getWindowToken();
        public boolean hasAnimationCallbacks();
        default public boolean isHandlingPointerEvent() { return false; }
        public void notifyInsetsChanged();
        public void postInsetsAnimationCallback(java.lang.Runnable p0);
        public void releaseSurfaceControlFromRt(android.view.SurfaceControl p0);
        public void setSystemBarsAppearance(int p0, int p1);
        public void setSystemBarsBehavior(int p0);
        default public void updateAnimatingTypes(int p0, android.view.inputmethod.ImeTracker.Token p1) {}
        default public void updateCompatSysUiVisibility(int p0, int p1, int p2) {}
        public void updateRequestedVisibleTypes(int p0, android.view.inputmethod.ImeTracker.Token p1);
        default public void updateWindowInsetsInfo() {}
        default public boolean usesSyncedInsetsAnimationByDefault() { return false; }
    }

    public static final class InternalAnimationControlListener implements android.view.WindowInsetsAnimationControlListener, android.view.InsetsAnimationSpec {
        private android.animation.ValueAnimator mAnimator;
        private final int mBehavior = 0;
        private android.view.WindowInsetsAnimationController mController;
        private final boolean mDisable = false;
        private final int mFloatingImeBottomInset = 0;
        private final boolean mHasAnimationCallbacks = false;
        private final android.view.inputmethod.ImeTracker.InputMethodJankContext mInputMethodJankContext = null;
        private final android.view.WindowInsetsAnimationControlListener mLoggingListener = null;
        private final int mRequestedTypes = 0;
        private final boolean mShow = false;
        private final boolean mUsesSyncedInsetsAnimationByDefault = false;
        public InternalAnimationControlListener(boolean p0, boolean p1, int p2, int p3, boolean p4, int p5, android.view.WindowInsetsAnimationControlListener p6, android.view.inputmethod.ImeTracker.InputMethodJankContext p7, boolean p8) {}
        private int getAnimationType() { return 0; }
        android.view.animation.Interpolator getAlphaInterpolator() { return null; }
        public long getDurationMs(boolean p0) { return 0L; }
        public android.view.animation.Interpolator getInsetsInterpolator(boolean p0) { return null; }
        public boolean hasAnimationCallbacks() { return false; }
        void onAnimationFinish() {}
        public void onCancelled(android.view.WindowInsetsAnimationController p0) {}
        public void onFinished(android.view.WindowInsetsAnimationController p0) {}
        public void onReady(android.view.WindowInsetsAnimationController p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface LayoutInsetsDuringAnimation {
    }

    private static final class PendingControlRequest {
        final int mAnimationType = 0;
        final android.os.CancellationSignal mCancellationSignal = null;
        final boolean mHasAnimationCallbacks = false;
        final android.view.InsetsAnimationSpec mInsetsAnimationSpec = null;
        final android.view.WindowInsetsAnimationControlListener mListener = null;
        int mTypes;
        PendingControlRequest(int p0, android.view.WindowInsetsAnimationControlListener p1, android.view.InsetsAnimationSpec p2, int p3, android.os.CancellationSignal p4, boolean p5) {}
    }

    private static final class RunningAnimation {
        final android.view.InsetsAnimationControlRunner mRunner = null;
        boolean mStartDispatched;
        final int mType = 0;
        RunningAnimation(android.view.InsetsAnimationControlRunner p0, int p1) {}
    }
}
