package com.android.internal.widget.remotecompose.core.operations.layout;

public class AnimatableValue implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    boolean mAnimate;
    float mAnimateDuration;
    long mAnimateTargetTime;
    boolean mAnimateValueChanges;
    int mId;
    boolean mIsVariable;
    long mLastUpdate;
    com.android.internal.widget.remotecompose.core.operations.utilities.easing.FloatAnimation mMotionEasing;
    int mMotionEasingType;
    float mStartRotationX;
    float mTargetRotationX;
    float mValue;
    public AnimatableValue(float p0) {}
    public AnimatableValue(float p0, boolean p1) {}
    public float evaluate(com.android.internal.widget.remotecompose.core.PaintContext p0) { return 0.0f; }
    public float getValue() { return 0.0f; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
}
