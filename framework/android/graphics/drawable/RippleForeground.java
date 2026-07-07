package android.graphics.drawable;

class RippleForeground extends android.graphics.drawable.RippleComponent {
    private static final android.animation.TimeInterpolator DECELERATE_INTERPOLATOR = null;
    private static final android.animation.TimeInterpolator LINEAR_INTERPOLATOR = null;
    private static final android.util.FloatProperty<android.graphics.drawable.RippleForeground> OPACITY = null;
    private static final int OPACITY_ENTER_DURATION = 75;
    private static final int OPACITY_EXIT_DURATION = 150;
    private static final int OPACITY_HOLD_DURATION = 225;
    private static final int RIPPLE_ENTER_DURATION = 225;
    private static final int RIPPLE_ORIGIN_DURATION = 225;
    private static final android.util.FloatProperty<android.graphics.drawable.RippleForeground> TWEEN_ORIGIN = null;
    private static final android.util.FloatProperty<android.graphics.drawable.RippleForeground> TWEEN_RADIUS = null;
    private final android.animation.AnimatorListenerAdapter mAnimationListener = null;
    private float mClampedStartingX;
    private float mClampedStartingY;
    private long mEnterStartedAtMillis;
    private final boolean mForceSoftware = false;
    private boolean mHasFinishedExit;
    private float mOpacity;
    private java.util.ArrayList<android.graphics.animation.RenderNodeAnimator> mPendingHwAnimators;
    private android.graphics.CanvasProperty<android.graphics.Paint> mPropPaint;
    private android.graphics.CanvasProperty<java.lang.Float> mPropRadius;
    private android.graphics.CanvasProperty<java.lang.Float> mPropX;
    private android.graphics.CanvasProperty<java.lang.Float> mPropY;
    private java.util.ArrayList<android.graphics.animation.RenderNodeAnimator> mRunningHwAnimators;
    private java.util.ArrayList<android.animation.Animator> mRunningSwAnimators;
    private float mStartRadius;
    private float mStartingX;
    private float mStartingY;
    private float mTargetX;
    private float mTargetY;
    private float mTweenRadius;
    private float mTweenX;
    private float mTweenY;
    private boolean mUsingProperties;
    public RippleForeground(android.graphics.drawable.RippleDrawable p0, android.graphics.Rect p1, float p2, float p3, boolean p4) { super(null, null); }
    private void clampStartingPosition() {}
    private void clearHwProps() {}
    private long computeFadeOutDelay() { return 0L; }
    private void drawHardware(android.graphics.RecordingCanvas p0, android.graphics.Paint p1) {}
    private void drawSoftware(android.graphics.Canvas p0, android.graphics.Paint p1) {}
    private float getCurrentRadius() { return 0.0f; }
    private float getCurrentX() { return 0.0f; }
    private float getCurrentY() { return 0.0f; }
    private void onAnimationPropertyChanged() {}
    private void pruneHwFinished() {}
    private void pruneSwFinished() {}
    private void startHardwareEnter() {}
    private void startHardwareExit() {}
    private void startPending(android.graphics.RecordingCanvas p0) {}
    private void startSoftwareEnter() {}
    private void startSoftwareExit() {}
    private void switchToUiThreadAnimation() {}
    public void draw(android.graphics.Canvas p0, android.graphics.Paint p1) {}
    public void end() {}
    public final void enter() {}
    public final void exit() {}
    public void getBounds(android.graphics.Rect p0) {}
    public boolean hasFinishedExit() { return false; }
    public void move(float p0, float p1) {}
    protected void onTargetRadiusChanged(float p0) {}
}
