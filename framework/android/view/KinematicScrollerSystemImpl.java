package android.view;

final class KinematicScrollerSystemImpl implements android.view.KinematicScrollerSystem {
    private static final float ACCUMULATION_VELOCITY_STABILITY_DELTA = 10.0f;
    private final float mAccumulationTimeConstant = 0.0f;
    private float mCurrentMaxAccumulatedVelocity;
    private float mCurrentPosition;
    private long mCurrentTimeMillis;
    private float mCurrentVelocity;
    private final float mFinalApproachDeceleration = 0.0f;
    private final float mFinalApproachFriction = 0.0f;
    private final float mLaminarDecelerationFactor = 0.0f;
    private final float mMaxAccumulatedVelocity = 0.0f;
    private float mTargetAccumulationVelocity;
    private final float mVelocityAccumulationThreshold = 0.0f;
    private final float mVelocityDecelerationThreshold = 0.0f;
    KinematicScrollerSystemImpl(float p0, float p1, float p2, float p3, float p4, long p5) {}
    private boolean advanceWhileAccumulating(long p0) { return false; }
    private void advanceWhileDecelerating(long p0) {}
    private float getNextAccumulatedPosition(float p0, float p1) { return 0.0f; }
    private float getNextAccumulatedVelocityAbs(float p0) { return 0.0f; }
    private float getStableAccumulationPosition(long p0, float p1, float p2) { return 0.0f; }
    private float getStablePositionAboveThreshold(float p0, float p1) { return 0.0f; }
    private float getStablePositionBelowThreshold(float p0, float p1) { return 0.0f; }
    private long getStableTimeMillisAboveThreshold(long p0, float p1) { return 0L; }
    private long getStableTimeMillisBelowThreshold(long p0, float p1) { return 0L; }
    public void accumulateVelocityOrRestart(float p0, float p1, long p2) {}
    public void advanceTo(long p0) {}
    public void copyFrom(android.view.KinematicScrollerSystem p0) throws java.lang.IllegalArgumentException {}
    public float estimateStablePosition() { return 0.0f; }
    public long estimateStableTimeMillis() { return 0L; }
    public float getCurrentMaxAccumulatedVelocity() { return 0.0f; }
    public float getCurrentPosition() { return 0.0f; }
    public long getCurrentTimeMillis() { return 0L; }
    public float getCurrentVelocity() { return 0.0f; }
    public long getStableAccumulationTimeMillis(long p0, float p1) { return 0L; }
    public float getTargetAccumulationVelocity() { return 0.0f; }
    public boolean isAccumulatingVelocity() { return false; }
    public boolean isStable() { return false; }
    public void reset() {}
    public void setInitialState(float p0, float p1, long p2) {}
}
