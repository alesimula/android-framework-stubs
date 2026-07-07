package android.widget;

public class DifferentialMotionFlingHelper {
    private final android.content.Context mContext = null;
    private final int[] mFlingVelocityThresholds = null;
    private float mLastFlingVelocity;
    private int mLastProcessedAxis;
    private int mLastProcessedDeviceId;
    private int mLastProcessedSource;
    private final android.widget.DifferentialMotionFlingHelper.DifferentialMotionFlingTarget mTarget = null;
    private final android.widget.DifferentialMotionFlingHelper.DifferentialVelocityProvider mVelocityProvider = null;
    private final android.widget.DifferentialMotionFlingHelper.FlingVelocityThresholdCalculator mVelocityThresholdCalculator = null;
    private android.view.VelocityTracker mVelocityTracker;
    public DifferentialMotionFlingHelper(android.content.Context p0, android.widget.DifferentialMotionFlingHelper.DifferentialMotionFlingTarget p1) {}
    public DifferentialMotionFlingHelper(android.content.Context p0, android.widget.DifferentialMotionFlingHelper.DifferentialMotionFlingTarget p1, android.widget.DifferentialMotionFlingHelper.FlingVelocityThresholdCalculator p2, android.widget.DifferentialMotionFlingHelper.DifferentialVelocityProvider p3) {}
    private static void calculateFlingVelocityThresholds(android.content.Context p0, int[] p1, android.view.MotionEvent p2, int p3) {}
    private boolean calculateFlingVelocityThresholds(android.view.MotionEvent p0, int p1) { return false; }
    private float getCurrentVelocity(android.view.MotionEvent p0, int p1) { return 0.0f; }
    private static float getCurrentVelocity(android.view.VelocityTracker p0, android.view.MotionEvent p1, int p2) { return 0.0f; }
    private void recycleVelocityTracker() {}
    public void onMotionEvent(android.view.MotionEvent p0, int p1) {}

    public static interface DifferentialMotionFlingTarget {
        public float getScaledScrollFactor();
        public boolean startDifferentialMotionFling(float p0);
        public void stopDifferentialMotionFling();
    }

    public static interface DifferentialVelocityProvider {
        public float getCurrentVelocity(android.view.VelocityTracker p0, android.view.MotionEvent p1, int p2);
    }

    public static interface FlingVelocityThresholdCalculator {
        public void calculateFlingVelocityThresholds(android.content.Context p0, int[] p1, android.view.MotionEvent p2, int p3);
    }
}
