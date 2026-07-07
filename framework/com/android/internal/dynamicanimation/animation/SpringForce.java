package com.android.internal.dynamicanimation.animation;

public final class SpringForce implements com.android.internal.dynamicanimation.animation.Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.20000000298023224f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = 1.7976931348623157e+308;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5;
    private double mDampedFreq;
    double mDampingRatio;
    private double mFinalPosition;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized;
    private final com.android.internal.dynamicanimation.animation.DynamicAnimation.MassState mMassState = null;
    double mNaturalFreq;
    private double mValueThreshold;
    private double mVelocityThreshold;
    public SpringForce() {}
    public SpringForce(float p0) {}
    private void init() {}
    public float getAcceleration(float p0, float p1) { return 0.0f; }
    public float getDampingRatio() { return 0.0f; }
    public float getFinalPosition() { return 0.0f; }
    public float getStiffness() { return 0.0f; }
    public boolean isAtEquilibrium(float p0, float p1) { return false; }
    public com.android.internal.dynamicanimation.animation.SpringForce setDampingRatio(float p0) { return null; }
    public com.android.internal.dynamicanimation.animation.SpringForce setFinalPosition(float p0) { return null; }
    public com.android.internal.dynamicanimation.animation.SpringForce setStiffness(float p0) { return null; }
    void setValueThreshold(double p0) {}
    com.android.internal.dynamicanimation.animation.DynamicAnimation.MassState updateValues(double p0, double p1, long p2) { return null; }
}
