package com.android.internal.widget.remotecompose.core.operations;

public class TouchExpression extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.ComponentData, com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.TouchListener, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "TouchExpression";
    private static final int OP_CODE = 157;
    public static final int STOP_ABSOLUTE_POS = 6;
    public static final int STOP_ENDS = 2;
    public static final int STOP_GENTLY = 0;
    public static final int STOP_INSTANTLY = 1;
    public static final int STOP_NOTCHES_ABSOLUTE = 5;
    public static final int STOP_NOTCHES_EVEN = 3;
    public static final int STOP_NOTCHES_PERCENTS = 4;
    public static final int STOP_NOTCHES_SINGLE_EVEN = 7;
    com.android.internal.widget.remotecompose.core.operations.layout.Component mComponent;
    private float mCurrentValue;
    private float mDefValue;
    float mDownTouchValue;
    private boolean mEasingToStop;
    private com.android.internal.widget.remotecompose.core.operations.utilities.touch.VelocityEasing mEasyTouch;
    com.android.internal.widget.remotecompose.core.operations.utilities.AnimatedFloatExpression mExp;
    private int mId;
    private float mLastCalculatedValue;
    private float mLastChange;
    float mLastValue;
    float mMax;
    float mMaxAcceleration;
    float mMaxAtDown;
    float mMaxTime;
    float mMaxVelocity;
    float mMin;
    float mMinAtDown;
    int mMode;
    float[] mNotches;
    private float mOutDefValue;
    float mOutMax;
    float mOutMin;
    float[] mOutStopSpec;
    private float[] mPreCalcValue;
    float mScrBottom;
    float mScrLeft;
    float mScrRight;
    float mScrTop;
    public float[] mSrcExp;
    int mStopMode;
    float[] mStopSpec;
    private boolean mTouchDown;
    int mTouchEffects;
    private float mTouchUpTime;
    boolean mUnmodified;
    float mValue;
    float mValueAtDown;
    float mVelocityId;
    boolean mWrapMode;
    public TouchExpression(int p0, float[] p1, float p2, float p3, float p4, int p5, float p6, int p7, float[] p8, float[] p9) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3, float p4, float p5, int p6, float[] p7, int p8, float[] p9, float[] p10) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private float getStopPosition(float p0, float p1) { return 0.0f; }
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    private void updateBounds(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    private float wrap(float p0) { return 0.0f; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    void crossNotchCheck(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    void haptic(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void setComponent(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) {}
    public java.lang.String toString() { return null; }
    public void touchDown(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) {}
    public void touchDrag(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) {}
    public void touchUp(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2, float p3, float p4) {}
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
