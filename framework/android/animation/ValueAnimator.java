package android.animation;

public class ValueAnimator extends android.animation.Animator implements android.animation.AnimationHandler.AnimationFrameCallback {
    private static final boolean DEBUG = false;
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    private static final java.lang.String TAG = "ValueAnimator";
    private static final boolean TRACE_ANIMATION_FRACTION = Boolean.valueOf(false);
    private static final android.animation.TimeInterpolator sDefaultInterpolator = null;
    private static float sDurationScale;
    private static final java.util.ArrayList<java.lang.ref.WeakReference<android.animation.ValueAnimator.DurationScaleChangeListener>> sDurationScaleChangeListeners = null;
    private boolean mAnimationEndRequested;
    private android.animation.AnimationHandler mAnimationHandler;
    private float mCurrentFraction;
    private long mDuration;
    private float mDurationScale;
    private long mFirstFrameTime;
    boolean mInitialized;
    private android.animation.TimeInterpolator mInterpolator;
    private long mLastFrameTime;
    private float mOverallFraction;
    private long mPauseTime;
    private int mRepeatCount;
    private int mRepeatMode;
    private boolean mResumed;
    private boolean mReversing;
    private boolean mRunning;
    float mSeekFraction;
    private boolean mSelfPulse;
    private long mStartDelay;
    long mStartTime;
    private boolean mStarted;
    private boolean mSuppressSelfPulseRequested;
    private java.lang.String mTraceName;
    java.util.ArrayList<android.animation.ValueAnimator.AnimatorUpdateListener> mUpdateListeners;
    android.animation.PropertyValuesHolder[] mValues;
    java.util.HashMap<java.lang.String, android.animation.PropertyValuesHolder> mValuesMap;
    public ValueAnimator() { super(); }
    private void addAnimationCallback(long p0) {}
    public static boolean areAnimatorsEnabled() { return false; }
    private float clampFraction(float p0) { return 0.0f; }
    private void endAnimation() {}
    private void endAnimation(boolean p0) {}
    public static int getCurrentAnimationsCount() { return 0; }
    private int getCurrentIteration(float p0) { return 0; }
    private float getCurrentIterationFraction(float p0, boolean p1) { return 0.0f; }
    public static float getDurationScale() { return 0.0f; }
    public static long getFrameDelay() { return 0L; }
    private long getScaledDuration() { return 0L; }
    private boolean isPulsingInternal() { return false; }
    public static android.animation.ValueAnimator ofArgb(int... p0) { return null; }
    public static android.animation.ValueAnimator ofFloat(float... p0) { return null; }
    public static android.animation.ValueAnimator ofInt(int... p0) { return null; }
    public static android.animation.ValueAnimator ofObject(android.animation.TypeEvaluator p0, java.lang.Object... p1) { return null; }
    public static android.animation.ValueAnimator ofPropertyValuesHolder(android.animation.PropertyValuesHolder... p0) { return null; }
    public static boolean registerDurationScaleChangeListener(android.animation.ValueAnimator.DurationScaleChangeListener p0) { return false; }
    private void removeAnimationCallback() {}
    private float resolveDurationScale() { return 0.0f; }
    public static void setDurationScale(float p0) {}
    public static void setFrameDelay(long p0) {}
    private boolean shouldPlayBackward(int p0, boolean p1) { return false; }
    private void start(boolean p0) {}
    private void startAnimation() {}
    public static boolean unregisterDurationScaleChangeListener(android.animation.ValueAnimator.DurationScaleChangeListener p0) { return false; }
    public void addUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener p0) {}
    boolean animateBasedOnTime(long p0) { return false; }
    void animateSkipToEnds(long p0, long p1) {}
    void animateValue(float p0) {}
    void animateValuesInRange(long p0, long p1) {}
    public boolean canReverse() { return false; }
    public void cancel() {}
    public android.animation.ValueAnimator clone() { return null; }
    void completeEndAnimation(boolean p0, java.lang.String p1) {}
    public final boolean doAnimationFrame(long p0) { return false; }
    public void end() {}
    public float getAnimatedFraction() { return 0.0f; }
    public java.lang.Object getAnimatedValue() { return null; }
    public java.lang.Object getAnimatedValue(java.lang.String p0) { return null; }
    public android.animation.AnimationHandler getAnimationHandler() { return null; }
    public long getCurrentPlayTime() { return 0L; }
    public long getDuration() { return 0L; }
    public android.animation.TimeInterpolator getInterpolator() { return null; }
    java.lang.String getNameForTrace() { return null; }
    public int getRepeatCount() { return 0; }
    public int getRepeatMode() { return 0; }
    public long getStartDelay() { return 0L; }
    public long getTotalDuration() { return 0L; }
    public android.animation.PropertyValuesHolder[] getValues() { return null; }
    void initAnimation() {}
    boolean isInitialized() { return false; }
    public boolean isRunning() { return false; }
    public boolean isStarted() { return false; }
    public void overrideDurationScale(float p0) {}
    public void pause() {}
    boolean pulseAnimationFrame(long p0) { return false; }
    public void removeAllUpdateListeners() {}
    public void removeUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener p0) {}
    public void resume() {}
    public void reverse() {}
    public void setAllowRunningAsynchronously(boolean p0) {}
    public void setAnimationHandler(android.animation.AnimationHandler p0) {}
    public void setCurrentFraction(float p0) {}
    public void setCurrentPlayTime(long p0) {}
    public android.animation.ValueAnimator setDuration(long p0) { return null; }
    public void setEvaluator(android.animation.TypeEvaluator p0) {}
    public void setFloatValues(float... p0) {}
    public void setIntValues(int... p0) {}
    public void setInterpolator(android.animation.TimeInterpolator p0) {}
    public void setObjectValues(java.lang.Object... p0) {}
    public void setRepeatCount(int p0) {}
    public void setRepeatMode(int p0) {}
    public void setStartDelay(long p0) {}
    public void setTraceName(java.lang.String p0) {}
    public void setValues(android.animation.PropertyValuesHolder... p0) {}
    void skipToEndValue(boolean p0) {}
    public void start() {}
    void startWithoutPulsing(boolean p0) {}
    public java.lang.String toString() { return null; }

    public static interface AnimatorUpdateListener {
        public void onAnimationUpdate(android.animation.ValueAnimator p0);
    }

    public static interface DurationScaleChangeListener {
        public void onChanged(float p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RepeatMode {
    }
}
