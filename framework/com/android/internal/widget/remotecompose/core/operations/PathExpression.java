package com.android.internal.widget.remotecompose.core.operations;

public class PathExpression extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "PathExpression";
    public static final int CLOSE = 15;
    public static final float CLOSE_NAN = Float.valueOf(0.0f);
    public static final int CONIC = 13;
    public static final float CONIC_NAN = Float.valueOf(0.0f);
    public static final int CUBIC = 14;
    public static final float CUBIC_NAN = Float.valueOf(0.0f);
    public static final int DONE = 16;
    public static final float DONE_NAN = Float.valueOf(0.0f);
    public static final int LINE = 11;
    public static final int LINEAR = 4;
    public static final float LINE_NAN = Float.valueOf(0.0f);
    public static final int LOOP = 1;
    private static final int MASK = -8388608;
    public static final int MONOTONIC = 2;
    public static final int MOVE = 10;
    public static final float MOVE_NAN = Float.valueOf(0.0f);
    private static final int OP_CODE = 193;
    public static final int POLAR = 8;
    public static final int QUADRATIC = 12;
    public static final float QUADRATIC_NAN = Float.valueOf(0.0f);
    public static final int WINDING_MASK = 50331648;
    private float mCount;
    private final float[] mExpressionX = null;
    private final float[] mExpressionY = null;
    private final int mFlags = 0;
    private final int mInstanceId = 0;
    private final float mMax = 0.0f;
    private final float mMin = 0.0f;
    private float mOutCount;
    private final float[] mOutExpressionX = null;
    private final float[] mOutExpressionY = null;
    private float mOutMax;
    private float mOutMin;
    private float[] mOutputPath;
    private boolean mPathChanged;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.PathGenerator mPathGenerator = null;
    private final int mWinding = 0;
    public PathExpression(int p0, float[] p1, float[] p2, float p3, float p4, float p5, int p6) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float[] p2, float[] p3, float p4, float p5, float p6, int p7) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
