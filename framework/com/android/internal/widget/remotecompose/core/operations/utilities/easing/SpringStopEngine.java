package com.android.internal.widget.remotecompose.core.operations.utilities.easing;

public class SpringStopEngine {
    private static final double UNSET = 1.7976931348623157e+308;
    private int mBoundaryMode;
    double mDamping;
    private boolean mInitialized;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;
    private float mV;
    public SpringStopEngine() {}
    public SpringStopEngine(float[] p0) {}
    private void compute(double p0) {}
    public float get(float p0) { return 0.0f; }
    public float getAcceleration() { return 0.0f; }
    public float getTargetValue() { return 0.0f; }
    public float getVelocity() { return 0.0f; }
    public float getVelocity(float p0) { return 0.0f; }
    public boolean isStopped() { return false; }
    void log(java.lang.String p0) {}
    public void setInitialValue(float p0) {}
    public void setTargetValue(float p0) {}
    public void springParameters(float p0, float p1, float p2, float p3, int p4) {}
    public void springStart(float p0, float p1, float p2) {}
}
