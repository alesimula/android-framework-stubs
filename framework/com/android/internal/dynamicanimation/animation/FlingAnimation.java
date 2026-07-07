package com.android.internal.dynamicanimation.animation;

public final class FlingAnimation extends com.android.internal.dynamicanimation.animation.DynamicAnimation<com.android.internal.dynamicanimation.animation.FlingAnimation> {
    private final com.android.internal.dynamicanimation.animation.FlingAnimation.DragForce mFlingForce = null;
    public FlingAnimation(com.android.internal.dynamicanimation.animation.FloatValueHolder p0) { super((com.android.internal.dynamicanimation.animation.FloatValueHolder)null); }
    float getAcceleration(float p0, float p1) { return 0.0f; }
    public float getFriction() { return 0.0f; }
    boolean isAtEquilibrium(float p0, float p1) { return false; }
    public com.android.internal.dynamicanimation.animation.FlingAnimation setFriction(float p0) { return null; }
    public com.android.internal.dynamicanimation.animation.FlingAnimation setMaxValue(float p0) { return null; }
    public com.android.internal.dynamicanimation.animation.FlingAnimation setMinValue(float p0) { return null; }
    public com.android.internal.dynamicanimation.animation.FlingAnimation setStartVelocity(float p0) { return null; }
    void setValueThreshold(float p0) {}
    boolean updateValueAndVelocity(long p0) { return false; }

    private static final class DragForce implements com.android.internal.dynamicanimation.animation.Force {
        private static final float DEFAULT_FRICTION = -4.199999809265137f;
        private static final float VELOCITY_THRESHOLD_MULTIPLIER = 62.5f;
        private float mFriction;
        private final com.android.internal.dynamicanimation.animation.DynamicAnimation.MassState mMassState = null;
        private float mVelocityThreshold;
        private DragForce() {}
        public float getAcceleration(float p0, float p1) { return 0.0f; }
        float getFrictionScalar() { return 0.0f; }
        public boolean isAtEquilibrium(float p0, float p1) { return false; }
        void setFrictionScalar(float p0) {}
        void setValueThreshold(float p0) {}
        com.android.internal.dynamicanimation.animation.DynamicAnimation.MassState updateValueAndVelocity(float p0, float p1, long p2) { return null; }
    }
}
