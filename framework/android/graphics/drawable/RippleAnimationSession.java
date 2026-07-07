package android.graphics.drawable;

public final class RippleAnimationSession {
    private static final int ENTER_ANIM_DURATION = 450;
    private static final int EXIT_ANIM_DURATION = 375;
    private static final android.view.animation.Interpolator FAST_OUT_SLOW_IN = null;
    private static final android.animation.TimeInterpolator LINEAR_INTERPOLATOR = null;
    private static final long MAX_NOISE_PHASE = 32L;
    private static final long NOISE_ANIMATION_DURATION = 7000L;
    private static final java.lang.String TAG = "RippleAnimationSession";
    private android.graphics.drawable.RippleAnimationSession.AnimationProperties<android.graphics.CanvasProperty<java.lang.Float>, android.graphics.CanvasProperty<android.graphics.Paint>> mCanvasProperties;
    private android.animation.Animator mCurrentAnimation;
    private boolean mForceSoftware;
    private android.animation.Animator mLoopAnimation;
    private java.util.function.Consumer<android.graphics.drawable.RippleAnimationSession> mOnSessionEnd;
    private java.lang.Runnable mOnUpdate;
    private final android.graphics.drawable.RippleAnimationSession.AnimationProperties<java.lang.Float, android.graphics.Paint> mProperties = null;
    private long mStartTime;
    RippleAnimationSession(android.graphics.drawable.RippleAnimationSession.AnimationProperties<java.lang.Float, android.graphics.Paint> p0, boolean p1) {}
    private long computeDelay() { return 0L; }
    private void enterHardware(android.graphics.RecordingCanvas p0) {}
    private void enterSoftware() {}
    private void exitHardware(android.graphics.RecordingCanvas p0) {}
    private void exitSoftware() {}
    private void notifyUpdate() {}
    private void onAnimationEnd(android.animation.Animator p0) {}
    private void startAnimation(android.animation.Animator p0, android.animation.Animator p1) {}
    private boolean useRTAnimations(android.graphics.Canvas p0) { return false; }
    void end() {}
    android.graphics.drawable.RippleAnimationSession enter(android.graphics.Canvas p0) { return null; }
    android.graphics.drawable.RippleAnimationSession exit(android.graphics.Canvas p0) { return null; }
    android.graphics.drawable.RippleAnimationSession.AnimationProperties<android.graphics.CanvasProperty<java.lang.Float>, android.graphics.CanvasProperty<android.graphics.Paint>> getCanvasProperties() { return null; }
    android.graphics.drawable.RippleAnimationSession.AnimationProperties<java.lang.Float, android.graphics.Paint> getProperties() { return null; }
    boolean isForceSoftware() { return false; }
    android.graphics.drawable.RippleAnimationSession setForceSoftwareAnimation(boolean p0) { return null; }
    android.graphics.drawable.RippleAnimationSession setOnAnimationUpdated(java.lang.Runnable p0) { return null; }
    android.graphics.drawable.RippleAnimationSession setOnSessionEnd(java.util.function.Consumer<android.graphics.drawable.RippleAnimationSession> p0) { return null; }
    void setRadius(float p0) {}

    static class AnimationProperties<FloatType extends java.lang.Object, PaintType extends java.lang.Object> {
        private final int mColor = 0;
        private final android.graphics.drawable.RippleShader mShader = null;
        AnimationProperties(FloatType p0, FloatType p1, FloatType p2, FloatType p3, PaintType p4, FloatType p5, int p6, android.graphics.drawable.RippleShader p7) {}
        int getColor() { return 0; }
        FloatType getMaxRadius() { return null; }
        FloatType getNoisePhase() { return null; }
        PaintType getPaint() { return null; }
        FloatType getProgress() { return null; }
        android.graphics.drawable.RippleShader getShader() { return null; }
        FloatType getX() { return null; }
        FloatType getY() { return null; }
        void setOrigin(FloatType p0, FloatType p1) {}
        void setRadius(FloatType p0) {}
    }

    private static class AnimatorListener implements android.animation.Animator.AnimatorListener {
        private final android.graphics.drawable.RippleAnimationSession mSession = null;
        AnimatorListener(android.graphics.drawable.RippleAnimationSession p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
        public void onAnimationStart(android.animation.Animator p0) {}
    }
}
