package android.view.animation;

public abstract class Animation implements java.lang.Cloneable {
    public static final int ABSOLUTE = 0;
    public static final int INFINITE = -1;
    public static final int RELATIVE_TO_PARENT = 2;
    public static final int RELATIVE_TO_SELF = 1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    public static final int START_ON_FIRST_FRAME = -1;
    public static final int ZORDER_BOTTOM = -1;
    public static final int ZORDER_NORMAL = 0;
    public static final int ZORDER_TOP = 1;
    private int mBackdropColor;
    boolean mCycleFlip;
    long mDuration;
    boolean mEnded;
    boolean mFillAfter;
    boolean mFillBefore;
    boolean mFillEnabled;
    private boolean mHasRoundedCorners;
    boolean mInitialized;
    android.view.animation.Interpolator mInterpolator;
    private android.view.animation.Animation.AnimationListener mListener;
    private android.os.Handler mListenerHandler;
    private boolean mMore;
    private java.lang.Runnable mOnEnd;
    private java.lang.Runnable mOnRepeat;
    private java.lang.Runnable mOnStart;
    private boolean mOneMoreTime;
    android.graphics.RectF mPreviousRegion;
    android.view.animation.Transformation mPreviousTransformation;
    android.graphics.RectF mRegion;
    int mRepeatCount;
    int mRepeatMode;
    int mRepeated;
    private float mScaleFactor;
    private boolean mShowBackdrop;
    private boolean mShowWallpaper;
    long mStartOffset;
    long mStartTime;
    boolean mStarted;
    android.view.animation.Transformation mTransformation;
    private int mZAdjustment;
    public Animation() {}
    public Animation(android.content.Context p0, android.util.AttributeSet p1) {}
    private void fireAnimationEnd() {}
    private void fireAnimationRepeat() {}
    private void fireAnimationStart() {}
    private boolean hasAnimationListener() { return false; }
    private boolean isCanceled() { return false; }
    protected void applyTransformation(float p0, android.view.animation.Transformation p1) {}
    public void cancel() {}
    protected android.view.animation.Animation clone() throws java.lang.CloneNotSupportedException { return null; }
    public long computeDurationHint() { return 0L; }
    public void detach() {}
    void dispatchAnimationEnd() {}
    void dispatchAnimationRepeat() {}
    void dispatchAnimationStart() {}
    protected void ensureInterpolator() {}
    protected void finalize() throws java.lang.Throwable {}
    public int getBackdropColor() { return 0; }
    @java.lang.Deprecated
    public int getBackgroundColor() { return 0; }
    @java.lang.Deprecated
    public boolean getDetachWallpaper() { return false; }
    public long getDuration() { return 0L; }
    public int getExtensionEdges() { return 0; }
    public boolean getFillAfter() { return false; }
    public boolean getFillBefore() { return false; }
    public android.view.animation.Interpolator getInterpolator() { return null; }
    public void getInvalidateRegion(int p0, int p1, int p2, int p3, android.graphics.RectF p4, android.view.animation.Transformation p5) {}
    public int getRepeatCount() { return 0; }
    public int getRepeatMode() { return 0; }
    protected float getScaleFactor() { return 0.0f; }
    public boolean getShowBackdrop() { return false; }
    public boolean getShowWallpaper() { return false; }
    public long getStartOffset() { return 0L; }
    public long getStartTime() { return 0L; }
    public boolean getTransformation(long p0, android.view.animation.Transformation p1) { return false; }
    public boolean getTransformation(long p0, android.view.animation.Transformation p1, float p2) { return false; }
    public void getTransformationAt(float p0, android.view.animation.Transformation p1) {}
    public int getZAdjustment() { return 0; }
    public boolean hasAlpha() { return false; }
    public boolean hasEnded() { return false; }
    public boolean hasRoundedCorners() { return false; }
    public boolean hasStarted() { return false; }
    public void initialize(int p0, int p1, int p2, int p3) {}
    public void initializeInvalidateRegion(int p0, int p1, int p2, int p3) {}
    public boolean isFillEnabled() { return false; }
    public boolean isInitialized() { return false; }
    public void reset() {}
    protected float resolveSize(int p0, float p1, int p2, int p3) { return 0.0f; }
    public void restrictDuration(long p0) {}
    public void scaleCurrentDuration(float p0) {}
    public void setAnimationListener(android.view.animation.Animation.AnimationListener p0) {}
    public void setBackdropColor(int p0) {}
    @java.lang.Deprecated
    public void setBackgroundColor(int p0) {}
    @java.lang.Deprecated
    public void setDetachWallpaper(boolean p0) {}
    public void setDuration(long p0) {}
    public void setFillAfter(boolean p0) {}
    public void setFillBefore(boolean p0) {}
    public void setFillEnabled(boolean p0) {}
    public void setHasRoundedCorners(boolean p0) {}
    public void setInterpolator(android.content.Context p0, int p1) {}
    public void setInterpolator(android.view.animation.Interpolator p0) {}
    public void setListenerHandler(android.os.Handler p0) {}
    public void setRepeatCount(int p0) {}
    public void setRepeatMode(int p0) {}
    public void setShowBackdrop(boolean p0) {}
    public void setShowWallpaper(boolean p0) {}
    public void setStartOffset(long p0) {}
    public void setStartTime(long p0) {}
    public void setZAdjustment(int p0) {}
    public void start() {}
    public void startNow() {}
    public boolean willChangeBounds() { return false; }
    public boolean willChangeTransformationMatrix() { return false; }

    public static interface AnimationListener {
        public void onAnimationEnd(android.view.animation.Animation p0);
        public void onAnimationRepeat(android.view.animation.Animation p0);
        public void onAnimationStart(android.view.animation.Animation p0);
    }

    protected static class Description {
        public int type;
        public float value;
        protected Description() {}
        static android.view.animation.Animation.Description parseValue(android.util.TypedValue p0, android.content.Context p1) { return null; }
    }

    private static class NoImagePreloadHolder {
        public static final boolean USE_CLOSEGUARD = Boolean.valueOf(false);
        private NoImagePreloadHolder() {}
    }
}
