package android.graphics.animation;

public class RenderNodeAnimator extends android.animation.Animator {
    public static final int ALPHA = 11;
    public static final int LAST_VALUE = 11;
    public static final int PAINT_ALPHA = 1;
    public static final int PAINT_STROKE_WIDTH = 0;
    public static final int ROTATION = 5;
    public static final int ROTATION_X = 6;
    public static final int ROTATION_Y = 7;
    public static final int SCALE_X = 3;
    public static final int SCALE_Y = 4;
    private static final int STATE_DELAYED = 1;
    private static final int STATE_FINISHED = 3;
    private static final int STATE_PREPARE = 0;
    private static final int STATE_RUNNING = 2;
    public static final int TRANSLATION_X = 0;
    public static final int TRANSLATION_Y = 1;
    public static final int TRANSLATION_Z = 2;
    public static final int X = 8;
    public static final int Y = 9;
    public static final int Z = 10;
    private static java.lang.ThreadLocal<android.graphics.animation.RenderNodeAnimator.DelayedAnimationHelper> sAnimationHelper;
    private float mFinalValue;
    private android.os.Handler mHandler;
    private android.animation.TimeInterpolator mInterpolator;
    private com.android.internal.util.VirtualRefBasePtr mNativePtr;
    private int mRenderProperty;
    private long mStartDelay;
    private long mStartTime;
    private int mState;
    private android.graphics.RenderNode mTarget;
    private final boolean mUiThreadHandlesDelay = false;
    private long mUnscaledDuration;
    private long mUnscaledStartDelay;
    private android.graphics.animation.RenderNodeAnimator.ViewListener mViewListener;
    public RenderNodeAnimator(int p0, float p1) { super(); }
    public RenderNodeAnimator(int p0, int p1, float p2, float p3) { super(); }
    public RenderNodeAnimator(android.graphics.CanvasProperty<java.lang.Float> p0, float p1) { super(); }
    public RenderNodeAnimator(android.graphics.CanvasProperty<android.graphics.Paint> p0, int p1, float p2) { super(); }
    private void applyInterpolator() {}
    private static void callOnFinished(android.graphics.animation.RenderNodeAnimator p0) {}
    private void checkMutable() {}
    private java.util.ArrayList<android.animation.Animator.AnimatorListener> cloneListeners() { return null; }
    private void doStart() {}
    private static android.graphics.animation.RenderNodeAnimator.DelayedAnimationHelper getHelper() { return null; }
    private void init(long p0) {}
    static boolean isNativeInterpolator(android.animation.TimeInterpolator p0) { return false; }
    private void moveToRunningState() {}
    private static native long nCreateAnimator(int p0, float p1);
    private static native long nCreateCanvasPropertyFloatAnimator(long p0, float p1);
    private static native long nCreateCanvasPropertyPaintAnimator(long p0, int p1, float p2);
    private static native long nCreateRevealAnimator(int p0, int p1, float p2, float p3);
    private static native void nEnd(long p0);
    private static native long nGetDuration(long p0);
    private static native void nSetAllowRunningAsync(long p0, boolean p1);
    private static native void nSetDuration(long p0, long p1);
    private static native void nSetInterpolator(long p0, long p1);
    private static native void nSetListener(long p0, android.graphics.animation.RenderNodeAnimator p1);
    private static native void nSetStartDelay(long p0, long p1);
    private static native void nSetStartValue(long p0, float p1);
    private static native void nStart(long p0);
    private void notifyStartListeners() {}
    private boolean processDelayed(long p0) { return false; }
    private void releaseNativePtr() {}
    public void cancel() {}
    public android.animation.Animator clone() { return null; }
    public void end() {}
    public long getDuration() { return 0L; }
    public android.animation.TimeInterpolator getInterpolator() { return null; }
    public long getNativeAnimator() { return 0L; }
    public long getStartDelay() { return 0L; }
    public long getTotalDuration() { return 0L; }
    public boolean isRunning() { return false; }
    public boolean isStarted() { return false; }
    protected void onFinished() {}
    public void pause() {}
    public void resume() {}
    public void setAllowRunningAsynchronously(boolean p0) {}
    public android.graphics.animation.RenderNodeAnimator setDuration(long p0) { return null; }
    public void setInterpolator(android.animation.TimeInterpolator p0) {}
    public void setStartDelay(long p0) {}
    public void setStartValue(float p0) {}
    public final void setTarget(android.graphics.RecordingCanvas p0) {}
    protected void setTarget(android.graphics.RenderNode p0) {}
    public void setViewListener(android.graphics.animation.RenderNodeAnimator.ViewListener p0) {}
    public void start() {}

    private static class DelayedAnimationHelper implements android.view.Choreographer.VsyncCallback {
        private boolean mCallbackScheduled;
        private final android.view.Choreographer mChoreographer = null;
        private java.util.ArrayList<android.graphics.animation.RenderNodeAnimator> mDelayedAnims;
        DelayedAnimationHelper() {}
        private void scheduleCallback() {}
        public void addDelayedAnimation(android.graphics.animation.RenderNodeAnimator p0) {}
        public void onVsync(android.view.Choreographer.FrameData p0) {}
        public void removeDelayedAnimation(android.graphics.animation.RenderNodeAnimator p0) {}
    }

    public static interface ViewListener {
        public void invalidateParent(boolean p0);
        public void onAlphaAnimationStart(float p0);
    }
}
