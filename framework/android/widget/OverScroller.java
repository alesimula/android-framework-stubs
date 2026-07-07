package android.widget;

public class OverScroller {
    private static final int DEFAULT_DURATION = 250;
    private static final int FLING_MODE = 1;
    private static final int SCROLL_MODE = 0;
    private final java.util.function.LongSupplier mClock = null;
    private final boolean mFlywheel = false;
    private android.view.animation.Interpolator mInterpolator;
    private int mMode;
    private final android.widget.OverScroller.SplineOverScroller mScrollerX = null;
    private final android.widget.OverScroller.SplineOverScroller mScrollerY = null;
    public OverScroller(android.content.Context p0) {}
    public OverScroller(android.content.Context p0, android.view.animation.Interpolator p1) {}
    @java.lang.Deprecated
    public OverScroller(android.content.Context p0, android.view.animation.Interpolator p1, float p2, float p3) {}
    @java.lang.Deprecated
    public OverScroller(android.content.Context p0, android.view.animation.Interpolator p1, float p2, float p3, boolean p4) {}
    public OverScroller(android.content.Context p0, android.view.animation.Interpolator p1, boolean p2) {}
    public OverScroller(android.content.Context p0, android.view.animation.Interpolator p1, boolean p2, java.util.function.LongSupplier p3) {}
    public void abortAnimation() {}
    public boolean computeScrollOffset() { return false; }
    public void extendDuration(int p0) {}
    public void fling(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {}
    public void fling(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) {}
    public final void forceFinished(boolean p0) {}
    public float getCurrVelocity() { return 0.0f; }
    public final int getCurrX() { return 0; }
    public final int getCurrY() { return 0; }
    public final int getDuration() { return 0; }
    public final int getFinalX() { return 0; }
    public final int getFinalY() { return 0; }
    double getSplineFlingDistance(int p0) { return 0.0; }
    public final int getStartX() { return 0; }
    public final int getStartY() { return 0; }
    public final boolean isFinished() { return false; }
    public boolean isOverScrolled() { return false; }
    public boolean isScrollingInDirection(float p0, float p1) { return false; }
    public void notifyHorizontalEdgeReached(int p0, int p1, int p2) {}
    public void notifyVerticalEdgeReached(int p0, int p1, int p2) {}
    public void setFinalX(int p0) {}
    public void setFinalY(int p0) {}
    public final void setFriction(float p0) {}
    void setInterpolator(android.view.animation.Interpolator p0) {}
    public boolean springBack(int p0, int p1, int p2, int p3, int p4, int p5) { return false; }
    public void startScroll(int p0, int p1, int p2, int p3) {}
    public void startScroll(int p0, int p1, int p2, int p3, int p4) {}
    public int timePassed() { return 0; }

    static class SplineOverScroller {
        private static final int BALLISTIC = 2;
        private static final int CUBIC = 1;
        private static float DECELERATION_RATE;
        private static final float END_TENSION = 1.0f;
        private static final float GRAVITY = 2000.0f;
        private static final float INFLEXION = 0.3499999940395355f;
        private static final int KINEMATIC_FLING = 3;
        private static final int NB_SAMPLES = 100;
        private static final float P1 = 0.17499999701976776f;
        private static final float P2 = 0.3500000238418579f;
        private static final int SPLINE = 0;
        private static final float[] SPLINE_POSITION = null;
        private static final float[] SPLINE_TIME = null;
        private static final float START_TENSION = 0.5f;
        private final java.util.function.LongSupplier mClock = null;
        private float mCurrVelocity;
        private int mCurrentPosition;
        private float mDeceleration;
        private int mDuration;
        private int mFinal;
        private boolean mFinished;
        private long mFinishedTime;
        private long mFlingAccumulationTimeoutMillis;
        private float mFlingFriction;
        private boolean mFlywheel;
        private android.view.KinematicScrollerSystem mKinematicScrollerSystem;
        private int mMax;
        private int mMin;
        private int mOver;
        private float mPhysicalCoeff;
        private int mSplineDistance;
        private int mSplineDuration;
        private int mStart;
        private long mStartTime;
        private int mState;
        private int mVelocity;
        SplineOverScroller(android.content.Context p0, java.util.function.LongSupplier p1, boolean p2) {}
        private void adjustDuration(int p0, int p1, int p2) {}
        private void fitOnBounceCurve(int p0, int p1, int p2) {}
        private static float getDeceleration(int p0) { return 0.0f; }
        private double getSplineDeceleration(int p0) { return 0.0; }
        private double getSplineFlingDistance(int p0) { return 0.0; }
        private int getSplineFlingDuration(int p0) { return 0; }
        private void onEdgeReached() {}
        private void startAfterEdge(int p0, int p1, int p2, int p3) {}
        private void startBounceAfterEdge(int p0, int p1, int p2) {}
        private void startSpringback(int p0, int p1, int p2) {}
        boolean continueWhenFinished() { return false; }
        void extendDuration(int p0) {}
        void finish() {}
        void fling(int p0, int p1, int p2, int p3, int p4) {}
        void notifyEdgeReached(int p0, int p1, int p2) {}
        void setFinalPosition(int p0) {}
        void setFriction(float p0) {}
        boolean springback(int p0, int p1, int p2) { return false; }
        void startScroll(int p0, int p1, int p2) {}
        boolean update() { return false; }
        void updateScroll(float p0, float p1) {}
    }
}
