package android.view;

public class ViewPropertyAnimator {
    static final int ALPHA = 2048;
    static final int NONE = 0;
    private static final java.lang.String[] PROPERTY_NAMES = null;
    static final int ROTATION = 32;
    static final int ROTATION_X = 64;
    static final int ROTATION_Y = 128;
    static final int SCALE_X = 8;
    static final int SCALE_Y = 16;
    private static final int TRANSFORM_MASK = 2047;
    static final int TRANSLATION_X = 1;
    static final int TRANSLATION_Y = 2;
    static final int TRANSLATION_Z = 4;
    static final int X = 256;
    static final int Y = 512;
    static final int Z = 1024;
    private java.lang.Runnable mAnimationStarter;
    private java.util.HashMap<android.animation.Animator, java.lang.Runnable> mAnimatorCleanupMap;
    private android.view.ViewPropertyAnimator.AnimatorEventListener mAnimatorEventListener;
    private java.util.HashMap<android.animation.Animator, android.view.ViewPropertyAnimator.PropertyBundle> mAnimatorMap;
    private java.util.HashMap<android.animation.Animator, java.lang.Runnable> mAnimatorOnEndMap;
    private java.util.HashMap<android.animation.Animator, java.lang.Runnable> mAnimatorOnStartMap;
    private java.util.HashMap<android.animation.Animator, java.lang.Runnable> mAnimatorSetupMap;
    private long mDuration;
    private boolean mDurationSet;
    private android.animation.TimeInterpolator mInterpolator;
    private boolean mInterpolatorSet;
    private android.animation.Animator.AnimatorListener mListener;
    java.util.ArrayList<android.view.ViewPropertyAnimator.NameValuesHolder> mPendingAnimations;
    private java.lang.Runnable mPendingCleanupAction;
    private java.lang.Runnable mPendingOnEndAction;
    private java.lang.Runnable mPendingOnStartAction;
    private java.lang.Runnable mPendingSetupAction;
    private long mStartDelay;
    private boolean mStartDelaySet;
    private android.animation.ValueAnimator mTempValueAnimator;
    private android.animation.ValueAnimator.AnimatorUpdateListener mUpdateListener;
    final android.view.View mView = null;
    ViewPropertyAnimator(android.view.View p0) {}
    private void animateProperty(int p0, float p1) {}
    private void animatePropertyBy(int p0, float p1) {}
    private void animatePropertyBy(int p0, float p1, float p2) {}
    private java.lang.String buildTraceName(int p0) { return null; }
    private float getValue(int p0) { return 0.0f; }
    static java.lang.String propertyMaskToString(int p0) { return null; }
    private void setValue(int p0, float p1) {}
    private void startAnimation() {}
    public android.view.ViewPropertyAnimator alpha(float p0) { return null; }
    public android.view.ViewPropertyAnimator alphaBy(float p0) { return null; }
    public void cancel() {}
    public long getDuration() { return 0L; }
    public android.animation.TimeInterpolator getInterpolator() { return null; }
    android.animation.Animator.AnimatorListener getListener() { return null; }
    public long getStartDelay() { return 0L; }
    android.animation.ValueAnimator.AnimatorUpdateListener getUpdateListener() { return null; }
    boolean hasActions() { return false; }
    public android.view.ViewPropertyAnimator rotation(float p0) { return null; }
    public android.view.ViewPropertyAnimator rotationBy(float p0) { return null; }
    public android.view.ViewPropertyAnimator rotationX(float p0) { return null; }
    public android.view.ViewPropertyAnimator rotationXBy(float p0) { return null; }
    public android.view.ViewPropertyAnimator rotationY(float p0) { return null; }
    public android.view.ViewPropertyAnimator rotationYBy(float p0) { return null; }
    public android.view.ViewPropertyAnimator scaleX(float p0) { return null; }
    public android.view.ViewPropertyAnimator scaleXBy(float p0) { return null; }
    public android.view.ViewPropertyAnimator scaleY(float p0) { return null; }
    public android.view.ViewPropertyAnimator scaleYBy(float p0) { return null; }
    public android.view.ViewPropertyAnimator setDuration(long p0) { return null; }
    public android.view.ViewPropertyAnimator setInterpolator(android.animation.TimeInterpolator p0) { return null; }
    public android.view.ViewPropertyAnimator setListener(android.animation.Animator.AnimatorListener p0) { return null; }
    public android.view.ViewPropertyAnimator setStartDelay(long p0) { return null; }
    public android.view.ViewPropertyAnimator setUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener p0) { return null; }
    public void start() {}
    public android.view.ViewPropertyAnimator translationX(float p0) { return null; }
    public android.view.ViewPropertyAnimator translationXBy(float p0) { return null; }
    public android.view.ViewPropertyAnimator translationY(float p0) { return null; }
    public android.view.ViewPropertyAnimator translationYBy(float p0) { return null; }
    public android.view.ViewPropertyAnimator translationZ(float p0) { return null; }
    public android.view.ViewPropertyAnimator translationZBy(float p0) { return null; }
    public android.view.ViewPropertyAnimator withEndAction(java.lang.Runnable p0) { return null; }
    public android.view.ViewPropertyAnimator withLayer() { return null; }
    public android.view.ViewPropertyAnimator withStartAction(java.lang.Runnable p0) { return null; }
    public android.view.ViewPropertyAnimator x(float p0) { return null; }
    public android.view.ViewPropertyAnimator xBy(float p0) { return null; }
    public android.view.ViewPropertyAnimator y(float p0) { return null; }
    public android.view.ViewPropertyAnimator yBy(float p0) { return null; }
    public android.view.ViewPropertyAnimator z(float p0) { return null; }
    public android.view.ViewPropertyAnimator zBy(float p0) { return null; }

    private class AnimatorEventListener implements android.animation.Animator.AnimatorListener, android.animation.ValueAnimator.AnimatorUpdateListener {
        private AnimatorEventListener(android.view.ViewPropertyAnimator p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
        public void onAnimationStart(android.animation.Animator p0) {}
        public void onAnimationUpdate(android.animation.ValueAnimator p0) {}
    }

    static class NameValuesHolder {
        float mDeltaValue;
        float mFromValue;
        int mNameConstant;
        NameValuesHolder(int p0, float p1, float p2) {}
    }

    private static class PropertyBundle {
        java.util.ArrayList<android.view.ViewPropertyAnimator.NameValuesHolder> mNameValuesHolder;
        int mPropertyMask;
        PropertyBundle(int p0, java.util.ArrayList<android.view.ViewPropertyAnimator.NameValuesHolder> p1) {}
        boolean cancel(int p0) { return false; }
    }
}
