package com.android.internal.widget.remotecompose.core.operations.utilities.easing;

public class FloatAnimation extends com.android.internal.widget.remotecompose.core.operations.utilities.easing.Easing implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private int mDirectionalSnap;
    private float mDuration;
    com.android.internal.widget.remotecompose.core.operations.utilities.easing.Easing mEasingCurve;
    private float mInitialValue;
    float mOffset;
    private boolean mPropagate;
    float[] mSpec;
    private float mTargetValue;
    private float mWrap;
    public FloatAnimation(int p0, float p1, float[] p2, float p3, float p4) { super(); }
    public FloatAnimation(float... p0) { super(); }
    private void create(int p0, float[] p1, int p2, int p3) {}
    public static float[] packToFloatArray(float p0, int p1, float[] p2, float p3, float p4) { return null; }
    private void setScaleOffset() {}
    public static java.lang.String unpackAnimationToString(float[] p0) { return null; }
    private static float wrap(float p0, float p1) { return 0.0f; }
    public float get(float p0) { return 0.0f; }
    public float getDiff(float p0) { return 0.0f; }
    public float getDuration() { return 0.0f; }
    public float getInitialValue() { return 0.0f; }
    public float getTargetValue() { return 0.0f; }
    public boolean isPropagate() { return false; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void setAnimationDescription(float[] p0) {}
    public void setInitialValue(float p0) {}
    public void setTargetValue(float p0) {}
    public java.lang.String toString() { return null; }
    float wrapDistance(float p0, float p1, float p2) { return 0.0f; }
}
