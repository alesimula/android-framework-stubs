package android.view;

final class KinematicScrollerSystemImpl implements android.view.KinematicScrollerSystem {
    private static final float ACCUMULATION_VELOCITY_STABILITY_DELTA = 10.0f;
    private static final int SLOW_FLING_DECELERATION_MULTIPLIER = 7;
    private final float mAccumulationTimeConstant = 0.0f;
    private float mCurrentMaxAccumulatedVelocity;
    private float mCurrentPosition;
    private long mCurrentTimeMillis;
    private float mCurrentVelocity;
    private float mDragMultiplier;
    private final float mFinalApproachDeceleration = 0.0f;
    private float mFinalApproachFriction;
    private final float mLaminarDecelerationFactor = 0.0f;
    private final float mMaxAccumulatedVelocity = 0.0f;
    private final float mSlowFlingVelocityThreshold = 0.0f;
    private float mTargetAccumulationVelocity;
    private final float mVelocityAccumulationThreshold = 0.0f;
    private final float mVelocityDecelerationThreshold = 0.0f;
    KinematicScrollerSystemImpl(float p0, float p1, float p2, float p3, float p4, float p5, long p6) {}
    private boolean advanceWhileAccumulating(long p0) { return false; }
    private void advanceWhileDecelerating(long p0) {}
    private float getEffectiveFinalApproachDeceleration() { return 0.0f; }
    private float getEffectiveFinalApproachFriction() { return 0.0f; }
    private float getEffectiveLaminarDecelerationFactor() { return 0.0f; }
    private float getNextAccumulatedPosition(float p0, float p1) { return 0.0f; }
    private float getNextAccumulatedVelocityAbs(float p0) { return 0.0f; }
    private float getStableAccumulationPosition(long p0, float p1, float p2) { return 0.0f; }
    private float getStablePositionAboveThreshold(float p0, float p1) { return 0.0f; }
    private float getStablePositionBelowThreshold(float p0, float p1) { return 0.0f; }
    private long getStableTimeMillisAboveThreshold(long p0, float p1) { return 0L; }
    private long getStableTimeMillisBelowThreshold(long p0, float p1) { return 0L; }
    private void setFinalApproachFriction(boolean p0) {}
    public void accumulateVelocityOrRestart(float p0, float p1, long p2) {}
    public void advanceTo(long p0) {}
    public void copyFrom(android.view.KinematicScrollerSystem p0) throws java.lang.IllegalArgumentException {}
    public float estimateStablePosition() { return 0.0f; }
    public long estimateStableTimeMillis() { return 0L; }
    public float getCurrentMaxAccumulatedVelocity() { return 0.0f; }
    public float getCurrentPosition() { return 0.0f; }
    public long getCurrentTimeMillis() { return 0L; }
    public float getCurrentVelocity() { return 0.0f; }
    public float getDragMultiplier() { return 0.0f; }
    public float getFinalApproachFriction() { return 0.0f; }
    public long getStableAccumulationTimeMillis(long p0, float p1) { return 0L; }
    public float getTargetAccumulationVelocity() { return 0.0f; }
    public boolean isAccumulatingVelocity() { return false; }
    public boolean isStable() { return false; }
    public void reset() {}
    public void setDragMultiplier(float p0) {}
    public void setInitialState(float p0, float p1, long p2) {}
}
