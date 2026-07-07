package com.android.internal.dynamicanimation.animation;

public abstract class DynamicAnimation<T extends com.android.internal.dynamicanimation.animation.DynamicAnimation<T>> implements android.animation.AnimationHandler.AnimationFrameCallback {
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty ALPHA = null;
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.00390625f;
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.10000000149011612f;
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.0020000000949949026f;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION_X = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION_Y = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty SCALE_X = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty SCALE_Y = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty SCROLL_X = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty SCROLL_Y = null;
    private static final float THRESHOLD_MULTIPLIER = 0.75f;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_X = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_Y = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_Z = null;
    private static final float UNSET = 3.4028234663852886e+38f;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty X = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty Y = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty Z = null;
    private android.animation.AnimationHandler mAnimationHandler;
    private final java.util.ArrayList<com.android.internal.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener> mEndListeners = null;
    private long mLastFrameTime;
    float mMaxValue;
    float mMinValue;
    private float mMinVisibleChange;
    final android.util.FloatProperty mProperty = null;
    boolean mRunning;
    boolean mStartValueIsSet;
    final java.lang.Object mTarget = null;
    private final java.util.ArrayList<com.android.internal.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener> mUpdateListeners = null;
    float mValue;
    float mVelocity;
    DynamicAnimation(com.android.internal.dynamicanimation.animation.FloatValueHolder p0) {}
    <K extends java.lang.Object> DynamicAnimation(K p0, android.util.FloatProperty<K> p1) {}
    private void endAnimationInternal(boolean p0) {}
    private float getPropertyValue() { return 0.0f; }
    private static <T extends java.lang.Object> void removeEntry(java.util.ArrayList<T> p0, T p1) {}
    private static <T extends java.lang.Object> void removeNullEntries(java.util.ArrayList<T> p0) {}
    private void startAnimationInternal() {}
    public T addEndListener(com.android.internal.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener p0) { return null; }
    public T addUpdateListener(com.android.internal.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener p0) { return null; }
    public void cancel() {}
    public boolean doAnimationFrame(long p0) { return false; }
    abstract float getAcceleration(float p0, float p1);
    public android.animation.AnimationHandler getAnimationHandler() { return null; }
    public long getLastFrameTime() { return 0L; }
    public float getMinimumVisibleChange() { return 0.0f; }
    float getValueThreshold() { return 0.0f; }
    abstract boolean isAtEquilibrium(float p0, float p1);
    boolean isCurrentThread() { return false; }
    public boolean isRunning() { return false; }
    public void removeEndListener(com.android.internal.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener p0) {}
    public void removeUpdateListener(com.android.internal.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener p0) {}
    public T setMaxValue(float p0) { return null; }
    public T setMinValue(float p0) { return null; }
    public T setMinimumVisibleChange(float p0) { return null; }
    void setPropertyValue(float p0) {}
    public T setStartValue(float p0) { return null; }
    public T setStartVelocity(float p0) { return null; }
    abstract void setValueThreshold(float p0);
    public void start() {}
    abstract boolean updateValueAndVelocity(long p0);

    static class MassState {
        float mValue;
        float mVelocity;
        MassState() {}
    }

    public static interface OnAnimationEndListener {
        public void onAnimationEnd(com.android.internal.dynamicanimation.animation.DynamicAnimation p0, boolean p1, float p2, float p3);
    }

    public static interface OnAnimationUpdateListener {
        public void onAnimationUpdate(com.android.internal.dynamicanimation.animation.DynamicAnimation p0, float p1, float p2);
    }

    public static abstract class ViewProperty extends android.util.FloatProperty<android.view.View> {
        private ViewProperty(java.lang.String p0) { super(null); }
    }
}
