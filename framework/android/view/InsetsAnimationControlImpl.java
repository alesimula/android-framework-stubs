package android.view;

public class InsetsAnimationControlImpl implements android.view.InternalInsetsAnimationController, android.view.InsetsAnimationControlRunner {
    private final android.view.WindowInsetsAnimation mAnimation = null;
    private final int mAnimationType = 0;
    private boolean mCancelled;
    private boolean mCancelling;
    private final android.view.InsetsAnimationControlCallbacks mController = null;
    private int mControllingTypes;
    private final android.util.SparseArray<android.view.InsetsSourceControl> mControls = null;
    private float mCurrentAlpha;
    private android.graphics.Insets mCurrentInsets;
    private final long mDurationMs = 0L;
    private boolean mFinished;
    private final boolean mFromPredictiveBack = false;
    private final boolean mHasAnimationCallback = false;
    private final boolean mHasZeroInsetsIme = false;
    private final android.graphics.Insets mHiddenInsets = null;
    private final android.view.InsetsState mInitialInsetsState = null;
    private final android.view.animation.Interpolator mInterpolator = null;
    private int mLayoutInsetsDuringAnimation;
    private final android.view.WindowInsetsAnimationControlListener mListener = null;
    private float mPendingAlpha;
    private float mPendingFraction;
    private android.graphics.Insets mPendingInsets;
    private java.lang.Boolean mPerceptible;
    private boolean mReadyDispatched;
    private final android.graphics.Insets mShownInsets = null;
    private boolean mShownOnFinish;
    private final android.util.SparseSetArray<android.view.InsetsSourceControl> mSideControlsMap = null;
    private final android.view.inputmethod.ImeTracker.Token mStatsToken = null;
    private final android.view.InsetsAnimationControlRunner.SurfaceParamsApplier mSurfaceParamsApplier = null;
    private final android.graphics.Rect mTmpFrame = null;
    private final android.graphics.Matrix mTmpMatrix = null;
    private final android.graphics.Rect mTmpVisibleFrame = null;
    private final android.content.res.CompatibilityInfo.Translator mTranslator = null;
    private final int mTypes = 0;
    public InsetsAnimationControlImpl(android.util.SparseArray<android.view.InsetsSourceControl> p0, android.graphics.Rect p1, android.graphics.Rect p2, android.view.InsetsState p3, android.view.WindowInsetsAnimationControlListener p4, int p5, android.view.InsetsAnimationControlCallbacks p6, android.view.InsetsAnimationControlRunner.SurfaceParamsApplier p7, android.view.InsetsAnimationSpec p8, int p9, int p10, android.content.res.CompatibilityInfo.Translator p11, android.view.inputmethod.ImeTracker.Token p12, boolean p13, boolean p14) {}
    private void addTranslationToMatrix(int p0, int p1, android.graphics.Matrix p2, android.graphics.Rect p3, android.graphics.Rect p4) {}
    private static void buildSideControlsMap(android.util.SparseIntArray p0, android.util.SparseSetArray<android.view.InsetsSourceControl> p1, android.util.SparseArray<android.view.InsetsSourceControl> p2) {}
    private static void buildSideControlsMap(android.util.SparseSetArray<android.view.InsetsSourceControl> p0, android.util.SparseArray<android.view.InsetsSourceControl> p1) {}
    private android.graphics.Insets calculateInsets(android.view.InsetsState p0, android.graphics.Rect p1, android.graphics.Rect p2, android.util.SparseArray<android.view.InsetsSourceControl> p3, boolean p4, android.util.SparseIntArray p5) { return null; }
    private android.graphics.Insets calculateInsets(android.view.InsetsState p0, android.util.SparseArray<android.view.InsetsSourceControl> p1, boolean p2) { return null; }
    private boolean calculatePerceptible(android.graphics.Insets p0, float p1) { return false; }
    private android.graphics.Insets getInsetsFromState(android.view.InsetsState p0, android.graphics.Rect p1, android.graphics.Rect p2, android.util.SparseIntArray p3) { return null; }
    private void releaseLeashes() {}
    private static float sanitize(float p0) { return 0.0f; }
    private android.graphics.Insets sanitize(android.graphics.Insets p0) { return null; }
    private void setInsetsAndAlpha(android.graphics.Insets p0, float p1, float p2, boolean p3) {}
    private void updateLeashesForSide(int p0, int p1, java.util.List<android.view.SyncRtSurfaceTransactionApplier.SurfaceParams> p2, android.view.InsetsState p3, float p4) {}
    public boolean applyChangeInsets(android.view.InsetsState p0) { return false; }
    public void cancel() {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void finish(boolean p0) {}
    public android.view.WindowInsetsAnimation getAnimation() { return null; }
    public int getAnimationType() { return 0; }
    public int getControllingTypes() { return 0; }
    android.util.SparseArray<android.view.InsetsSourceControl> getControls() { return null; }
    public float getCurrentAlpha() { return 0.0f; }
    public float getCurrentFraction() { return 0.0f; }
    public android.graphics.Insets getCurrentInsets() { return null; }
    public long getDurationMs() { return 0L; }
    public android.graphics.Insets getHiddenStateInsets() { return null; }
    public android.view.animation.Interpolator getInsetsInterpolator() { return null; }
    public android.graphics.Insets getShownStateInsets() { return null; }
    public android.view.inputmethod.ImeTracker.Token getStatsToken() { return null; }
    public android.view.InsetsAnimationControlRunner.SurfaceParamsApplier getSurfaceParamsApplier() { return null; }
    public int getTypes() { return 0; }
    public boolean hasAnimationCallback() { return false; }
    public boolean hasZeroInsetsIme() { return false; }
    public boolean isCancelled() { return false; }
    public boolean isFinished() { return false; }
    public boolean isFromPredictiveBack() { return false; }
    public void notifyControlRevoked(int p0) {}
    public void setInsetsAndAlpha(android.graphics.Insets p0, float p1, float p2) {}
    public void setReadyDispatched(boolean p0) {}
    public void updateLayoutInsetsDuringAnimation(int p0) {}
    public void updateSurfacePosition(android.util.SparseArray<android.view.InsetsSourceControl> p0) {}
    public boolean willUpdateSurface() { return false; }
}
