package android.animation;

public class TimeAnimator extends android.animation.ValueAnimator {
    private android.animation.TimeAnimator.TimeListener mListener;
    private long mPreviousTime;
    public TimeAnimator() { super(); }
    boolean animateBasedOnTime(long p0) { return false; }
    void animateValue(float p0) {}
    void initAnimation() {}
    public void setCurrentPlayTime(long p0) {}
    public void setTimeListener(android.animation.TimeAnimator.TimeListener p0) {}
    public void start() {}

    public static interface TimeListener {
        public void onTimeUpdate(android.animation.TimeAnimator p0, long p1, long p2);
    }
}
