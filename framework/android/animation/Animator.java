package android.animation;

public abstract class Animator implements java.lang.Cloneable {
    public static final long DURATION_INFINITE = -1L;
    private static long sBackgroundPauseDelay;
    static boolean sPostNotifyEndListenerEnabled;
    private java.util.concurrent.atomic.AtomicReference<java.lang.Object[]> mCachedList;
    int mChangingConfigurations;
    private android.animation.Animator.AnimatorConstantState mConstantState;
    java.util.ArrayList<android.animation.Animator.AnimatorListener> mListeners;
    java.util.ArrayList<android.animation.Animator.AnimatorPauseListener> mPauseListeners;
    boolean mPaused;
    private java.lang.Runnable mPendingEndCallback;
    boolean mStartListenersCalled;
    public Animator() {}
    public static long getBackgroundPauseDelay() { return 0L; }
    public static boolean isPostNotifyEndListenerEnabled() { return false; }
    public static void setAnimatorPausingEnabled(boolean p0) {}
    public static void setBackgroundPauseDelay(long p0) {}
    public static void setPostNotifyEndListenerEnabled(boolean p0) {}
    public void addListener(android.animation.Animator.AnimatorListener p0) {}
    public void addPauseListener(android.animation.Animator.AnimatorPauseListener p0) {}
    void animateSkipToEnds(long p0, long p1) {}
    void animateValuesInRange(long p0, long p1) {}
    public void appendChangingConfigurations(int p0) {}
    <T extends java.lang.Object, A extends java.lang.Object> void callOnList(java.util.ArrayList<T> p0, android.animation.Animator.AnimatorCaller<T, A> p1, A p2, boolean p3) {}
    public boolean canReverse() { return false; }
    public void cancel() {}
    public android.animation.Animator clone() { return null; }
    void completeEndAnimation(boolean p0, java.lang.String p1) {}
    boolean consumePendingEndListeners(boolean p0) { return false; }
    public android.content.res.ConstantState<android.animation.Animator> createConstantState() { return null; }
    public void end() {}
    public int getChangingConfigurations() { return 0; }
    public abstract long getDuration();
    public android.animation.TimeInterpolator getInterpolator() { return null; }
    public java.util.ArrayList<android.animation.Animator.AnimatorListener> getListeners() { return null; }
    void getStartAndEndTimes(android.util.LongArray p0, long p1) {}
    public abstract long getStartDelay();
    public long getTotalDuration() { return 0L; }
    boolean isInitialized() { return false; }
    public boolean isPaused() { return false; }
    public abstract boolean isRunning();
    public boolean isStarted() { return false; }
    void notifyEndListeners(boolean p0) {}
    void notifyEndListenersFromEndAnimation(boolean p0, boolean p1) {}
    void notifyListeners(android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorListener, android.animation.Animator> p0, boolean p1) {}
    void notifyPauseListeners(android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorPauseListener, android.animation.Animator> p0) {}
    void notifyStartListeners(boolean p0) {}
    public void pause() {}
    boolean pulseAnimationFrame(long p0) { return false; }
    public void removeAllListeners() {}
    public void removeListener(android.animation.Animator.AnimatorListener p0) {}
    public void removePauseListener(android.animation.Animator.AnimatorPauseListener p0) {}
    public void resume() {}
    public void reverse() {}
    public void setAllowRunningAsynchronously(boolean p0) {}
    public void setChangingConfigurations(int p0) {}
    public abstract android.animation.Animator setDuration(long p0);
    public abstract void setInterpolator(android.animation.TimeInterpolator p0);
    public abstract void setStartDelay(long p0);
    public void setTarget(java.lang.Object p0) {}
    public void setupEndValues() {}
    public void setupStartValues() {}
    void skipToEndValue(boolean p0) {}
    public void start() {}
    void startWithoutPulsing(boolean p0) {}

    static interface AnimatorCaller<T extends java.lang.Object, A extends java.lang.Object> {
        public static final android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorListener, android.animation.Animator> ON_CANCEL = null;
        public static final android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorListener, android.animation.Animator> ON_END = null;
        public static final android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorPauseListener, android.animation.Animator> ON_PAUSE = null;
        public static final android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorListener, android.animation.Animator> ON_REPEAT = null;
        public static final android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorPauseListener, android.animation.Animator> ON_RESUME = null;
        public static final android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorListener, android.animation.Animator> ON_START = null;
        public static final android.animation.Animator.AnimatorCaller<android.animation.ValueAnimator.AnimatorUpdateListener, android.animation.ValueAnimator> ON_UPDATE = null;
        public void call(T p0, A p1, boolean p2);
    }

    private static class AnimatorConstantState extends android.content.res.ConstantState<android.animation.Animator> {
        final android.animation.Animator mAnimator = null;
        int mChangingConf;
        public AnimatorConstantState(android.animation.Animator p0) { super(); }
        public int getChangingConfigurations() { return 0; }
        public android.animation.Animator newInstance() { return null; }
    }

    public static interface AnimatorListener {
        public void onAnimationCancel(android.animation.Animator p0);
        public void onAnimationEnd(android.animation.Animator p0);
        default public void onAnimationEnd(android.animation.Animator p0, boolean p1) {}
        public void onAnimationRepeat(android.animation.Animator p0);
        public void onAnimationStart(android.animation.Animator p0);
        default public void onAnimationStart(android.animation.Animator p0, boolean p1) {}
    }

    public static interface AnimatorPauseListener {
        public void onAnimationPause(android.animation.Animator p0);
        public void onAnimationResume(android.animation.Animator p0);
    }
}
