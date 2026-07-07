package com.android.internal.widget.remotecompose.core.operations.utilities.touch;

public class VelocityEasing {
    private static final boolean DEBUG = false;
    private float mDuration;
    private com.android.internal.widget.remotecompose.core.operations.utilities.touch.VelocityEasing.Easing mEasing;
    private double mEasingAdapterA;
    private double mEasingAdapterB;
    private double mEasingAdapterDistance;
    private float mEndPos;
    private int mNumberOfStages;
    private boolean mOneDimension;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.touch.VelocityEasing.Stage[] mStage = null;
    private float mStartPos;
    private float mStartV;
    private float mTotalEasingDuration;
    public VelocityEasing() {}
    private boolean cruseThenRampDown(float p0, float p1, float p2, float p3, float p4, float p5) { return false; }
    private double getEasingDiff(double p0) { return 0.0; }
    private boolean rampDown(float p0, float p1, float p2, float p3) { return false; }
    private void rampUpCruseRampDown(float p0, float p1, float p2, float p3, float p4, float p5) {}
    private boolean rampUpRampDown(float p0, float p1, float p2, float p3, float p4, float p5) { return false; }
    public void config(float p0, float p1, float p2, float p3, float p4, float p5, com.android.internal.widget.remotecompose.core.operations.utilities.touch.VelocityEasing.Easing p6) {}
    protected void configureEasingAdapter() {}
    public float getDuration() { return 0.0f; }
    double getEasing(double p0) { return 0.0; }
    public float getPos(float p0) { return 0.0f; }
    public float getV(float p0) { return 0.0f; }
    public java.lang.String toString() { return null; }

    public static interface Easing {
        public com.android.internal.widget.remotecompose.core.operations.utilities.touch.VelocityEasing.Easing clone();
        public double get(double p0);
        public double getDiff(double p0);
    }

    static class Stage {
        private float mDeltaT;
        private float mDeltaV;
        private float mEndPos;
        private float mEndTime;
        private float mEndV;
        final int mStage = 0;
        private float mStartPos;
        private float mStartTime;
        private float mStartV;
        Stage(int p0) {}
        float getPos(float p0) { return 0.0f; }
        float getVel(float p0) { return 0.0f; }
        void setUp(float p0, float p1, float p2, float p3, float p4, float p5) {}
    }
}
