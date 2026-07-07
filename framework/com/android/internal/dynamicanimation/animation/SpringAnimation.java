package com.android.internal.dynamicanimation.animation;

public final class SpringAnimation extends com.android.internal.dynamicanimation.animation.DynamicAnimation<com.android.internal.dynamicanimation.animation.SpringAnimation> {
    private static final float UNSET = 3.4028234663852886e+38f;
    private boolean mEndRequested;
    private float mPendingPosition;
    private com.android.internal.dynamicanimation.animation.SpringForce mSpring;
    public SpringAnimation(com.android.internal.dynamicanimation.animation.FloatValueHolder p0) { super((com.android.internal.dynamicanimation.animation.FloatValueHolder)null); }
    public SpringAnimation(com.android.internal.dynamicanimation.animation.FloatValueHolder p0, float p1) { super((com.android.internal.dynamicanimation.animation.FloatValueHolder)null); }
    public <K extends java.lang.Object> SpringAnimation(K p0, android.util.FloatProperty<K> p1) { super((com.android.internal.dynamicanimation.animation.FloatValueHolder)null); }
    public <K extends java.lang.Object> SpringAnimation(K p0, android.util.FloatProperty<K> p1, float p2) { super((com.android.internal.dynamicanimation.animation.FloatValueHolder)null); }
    private void sanityCheck() {}
    public void animateToFinalPosition(float p0) {}
    public boolean canSkipToEnd() { return false; }
    public void cancel() {}
    float getAcceleration(float p0, float p1) { return 0.0f; }
    public com.android.internal.dynamicanimation.animation.SpringForce getSpring() { return null; }
    boolean isAtEquilibrium(float p0, float p1) { return false; }
    public com.android.internal.dynamicanimation.animation.SpringAnimation setSpring(com.android.internal.dynamicanimation.animation.SpringForce p0) { return null; }
    void setValueThreshold(float p0) {}
    public void skipToEnd() {}
    public void start() {}
    boolean updateValueAndVelocity(long p0) { return false; }
}
