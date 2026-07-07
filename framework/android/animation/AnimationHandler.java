package android.animation;

public class AnimationHandler {
    private static final boolean LOCAL_LOGV = false;
    private static final java.lang.String TAG = "AnimationHandler";
    public static final java.lang.ThreadLocal<android.animation.AnimationHandler> sAnimatorHandler = null;
    private static boolean sAnimatorPausingEnabled;
    private static boolean sOverrideAnimatorPausingSystemProperty;
    private static android.animation.AnimationHandler sTestHandler;
    private final java.util.ArrayList<android.animation.AnimationHandler.AnimationFrameCallback> mAnimationCallbacks = null;
    private final java.util.ArrayList<java.lang.ref.WeakReference<java.lang.Object>> mAnimatorRequestors = null;
    private final android.util.ArrayMap<android.animation.AnimationHandler.AnimationFrameCallback, java.lang.Long> mDelayedCallbackStartTime = null;
    private long mEndAnimationFrameVsyncId;
    private final android.view.Choreographer.FrameCallback mFrameCallback = null;
    private long mLastAnimationFrameVsyncId;
    private boolean mListDirty;
    private final java.util.ArrayList<android.animation.Animator> mPausedAnimators = null;
    private android.view.Choreographer.FrameCallback mPauser;
    private java.util.ArrayList<java.lang.Runnable> mPendingEndAnimationListeners;
    private android.animation.AnimationHandler.AnimationFrameCallbackProvider mProvider;
    public AnimationHandler() {}
    private void cleanUpList() {}
    private void doAnimationFrame(long p0) {}
    public static int getAnimationCount() { return 0; }
    private int getCallbackSize() { return 0; }
    public static long getFrameDelay() { return 0L; }
    public static android.animation.AnimationHandler getInstance() { return null; }
    private android.animation.AnimationHandler.AnimationFrameCallbackProvider getProvider() { return null; }
    private boolean isCallbackDue(android.animation.AnimationHandler.AnimationFrameCallback p0, long p1) { return false; }
    private static boolean isPauseBgAnimationsEnabledInSystemProperties() { return false; }
    public static void removeRequestor(java.lang.Object p0) {}
    public static void requestAnimatorsEnabled(boolean p0, java.lang.Object p1) {}
    private void requestAnimatorsEnabledImpl(boolean p0, java.lang.Object p1) {}
    private void resumeAnimators() {}
    public static void setAnimatorPausingEnabled(boolean p0) {}
    public static void setFrameDelay(long p0) {}
    public static void setOverrideAnimatorPausingSystemProperty(boolean p0) {}
    public static android.animation.AnimationHandler setTestHandler(android.animation.AnimationHandler p0) { return null; }
    public void addAnimationFrameCallback(android.animation.AnimationHandler.AnimationFrameCallback p0, long p1) {}
    void autoCancelBasedOn(android.animation.ObjectAnimator p0) {}
    public long getLastAnimationFrameVsyncId(long p0) { return 0L; }
    public void postEndAnimationCallback(java.lang.Runnable p0) {}
    public void removeCallback(android.animation.AnimationHandler.AnimationFrameCallback p0) {}
    void removePendingEndAnimationCallback(java.lang.Runnable p0) {}
    public void setProvider(android.animation.AnimationHandler.AnimationFrameCallbackProvider p0) {}

    public static interface AnimationFrameCallback {
        public boolean doAnimationFrame(long p0);
    }

    public static interface AnimationFrameCallbackProvider {
        public long getFrameDelay();
        public void postFrameCallback(android.view.Choreographer.FrameCallback p0);
        public void setFrameDelay(long p0);
    }

    private class MyFrameCallbackProvider implements android.animation.AnimationHandler.AnimationFrameCallbackProvider {
        final android.view.Choreographer mChoreographer = null;
        private MyFrameCallbackProvider(android.animation.AnimationHandler p0) {}
        public long getFrameDelay() { return 0L; }
        public void postFrameCallback(android.view.Choreographer.FrameCallback p0) {}
        public void setFrameDelay(long p0) {}
    }
}
