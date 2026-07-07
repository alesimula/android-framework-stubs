package android.inputmethodservice.navigationbar;

final class KeyButtonRipple extends android.graphics.drawable.Drawable {
    private static final android.view.animation.Interpolator ALPHA_OUT_INTERPOLATOR = null;
    private static final int ANIMATION_DURATION_FADE = 450;
    private static final int ANIMATION_DURATION_SCALE = 350;
    private static final float GLOW_MAX_ALPHA = 0.20000000298023224f;
    private static final float GLOW_MAX_ALPHA_DARK = 0.10000000149011612f;
    private static final float GLOW_MAX_SCALE_FACTOR = 1.350000023841858f;
    private final android.animation.AnimatorListenerAdapter mAnimatorListener = null;
    private android.graphics.CanvasProperty<java.lang.Float> mBottomProp;
    private boolean mDark;
    private boolean mDelayTouchFeedback;
    private boolean mDrawingHardwareGlow;
    private final android.inputmethodservice.navigationbar.KeyButtonRipple.TraceAnimatorListener mEnterHwTraceAnimator = null;
    private final android.inputmethodservice.navigationbar.KeyButtonRipple.TraceAnimatorListener mExitHwTraceAnimator = null;
    private float mGlowAlpha;
    private float mGlowScale;
    private final android.os.Handler mHandler = null;
    private final android.view.animation.Interpolator mInterpolator = null;
    private boolean mLastDark;
    private android.graphics.CanvasProperty<java.lang.Float> mLeftProp;
    private int mMaxWidth;
    private final int mMaxWidthResource = 0;
    private android.graphics.CanvasProperty<android.graphics.Paint> mPaintProp;
    private boolean mPressed;
    private android.graphics.CanvasProperty<java.lang.Float> mRightProp;
    private android.graphics.Paint mRipplePaint;
    private final java.util.HashSet<android.animation.Animator> mRunningAnimations = null;
    private android.graphics.CanvasProperty<java.lang.Float> mRxProp;
    private android.graphics.CanvasProperty<java.lang.Float> mRyProp;
    private boolean mSupportHardware;
    private final int mTapTimeoutMillis = 0;
    private final android.view.View mTargetView = null;
    private final java.util.ArrayList<android.animation.Animator> mTmpArray = null;
    private android.graphics.CanvasProperty<java.lang.Float> mTopProp;
    private android.inputmethodservice.navigationbar.KeyButtonRipple.Type mType;
    private boolean mVisible;
    KeyButtonRipple(android.content.Context p0, android.view.View p1, int p2) { super(); }
    private void drawHardware(android.graphics.RecordingCanvas p0) {}
    private void drawSoftware(android.graphics.Canvas p0) {}
    private void endAnimations(java.lang.String p0, boolean p1) {}
    private void enterHardware() {}
    private void enterSoftware() {}
    private void exitHardware() {}
    private void exitSoftware() {}
    private android.graphics.CanvasProperty<java.lang.Float> getExtendEnd() { return null; }
    private int getExtendSize() { return 0; }
    private android.graphics.CanvasProperty<java.lang.Float> getExtendStart() { return null; }
    private float getMaxGlowAlpha() { return 0.0f; }
    private android.graphics.Paint getRipplePaint() { return null; }
    private int getRippleSize() { return 0; }
    private boolean isHorizontal() { return false; }
    private void setExtendEnd(android.graphics.CanvasProperty<java.lang.Float> p0) {}
    private void setExtendStart(android.graphics.CanvasProperty<java.lang.Float> p0) {}
    private void setPressedHardware(boolean p0) {}
    private void setPressedSoftware(boolean p0) {}
    public void abortDelayedRipple() {}
    public void draw(android.graphics.Canvas p0) {}
    public float getGlowAlpha() { return 0.0f; }
    public float getGlowScale() { return 0.0f; }
    public int getOpacity() { return 0; }
    public boolean hasFocusStateSpecified() { return false; }
    public boolean isStateful() { return false; }
    public void jumpToCurrentState() {}
    protected boolean onStateChange(int[] p0) { return false; }
    public void setAlpha(int p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setDarkIntensity(float p0) {}
    public void setDelayTouchFeedback(boolean p0) {}
    public void setGlowAlpha(float p0) {}
    public void setGlowScale(float p0) {}
    public void setPressed(boolean p0) {}
    public void setType(android.inputmethodservice.navigationbar.KeyButtonRipple.Type p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void updateResources() {}

    private static final class LogInterpolator implements android.view.animation.Interpolator {
        private LogInterpolator() {}
        public float getInterpolation(float p0) { return 0.0f; }
    }

    private static final class TraceAnimatorListener extends android.animation.AnimatorListenerAdapter {
        private final java.lang.String mName = null;
        TraceAnimatorListener(java.lang.String p0) { super(); }
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationStart(android.animation.Animator p0) {}
    }

    public static enum Type {
        OVAL,
        ROUNDED_RECT;
        private static final android.inputmethodservice.navigationbar.KeyButtonRipple.Type[] $VALUES = null;
        private Type() {}
    }
}
