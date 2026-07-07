package android.view;

public class InsetsResizeAnimationRunner implements android.view.InsetsAnimationControlRunner, android.view.InternalInsetsAnimationController, android.view.WindowInsetsAnimationControlListener {
    private final android.view.WindowInsetsAnimation mAnimation = null;
    private android.animation.ValueAnimator mAnimator;
    private boolean mCancelled;
    private final android.view.InsetsAnimationControlCallbacks mController = null;
    private boolean mFinished;
    private final android.view.InsetsState mFromState = null;
    private final android.view.InsetsState mToState = null;
    private final int mTypes = 0;
    public InsetsResizeAnimationRunner(android.graphics.Rect p0, android.graphics.Rect p1, android.view.InsetsState p2, android.view.InsetsState p3, android.view.animation.Interpolator p4, long p5, int p6, android.view.InsetsAnimationControlCallbacks p7) {}
    public boolean applyChangeInsets(android.view.InsetsState p0) { return false; }
    public void cancel() {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void finish(boolean p0) {}
    public android.view.WindowInsetsAnimation getAnimation() { return null; }
    public int getAnimationType() { return 0; }
    public int getControllingTypes() { return 0; }
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
    public void notifyControlRevoked(int p0) {}
    public void onCancelled(android.view.WindowInsetsAnimationController p0) {}
    public void onFinished(android.view.WindowInsetsAnimationController p0) {}
    public void onReady(android.view.WindowInsetsAnimationController p0, int p1) {}
    public void setInsetsAndAlpha(android.graphics.Insets p0, float p1, float p2) {}
    public void setReadyDispatched(boolean p0) {}
    public void updateLayoutInsetsDuringAnimation(int p0) {}
    public void updateSurfacePosition(android.util.SparseArray<android.view.InsetsSourceControl> p0) {}
    public boolean willUpdateSurface() { return false; }
}
