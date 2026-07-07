package com.android.internal.widget.remotecompose.core.operations;

public class IntegerExpression extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.operations.ComponentData, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "IntegerExpression";
    public static final int MAX_SIZE = 320;
    private static final int OP_CODE = 144;
    com.android.internal.widget.remotecompose.core.operations.utilities.IntegerExpressionEvaluator mExp;
    public int mId;
    private float mLastChange;
    private int mMask;
    public int[] mPreCalcValue;
    private int mPreMask;
    public final int[] mSrcValue = null;
    public IntegerExpression(int p0, int p1, int[] p2) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int[] p3) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static boolean isId(int p0, int p1, int p2) { return false; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public int evaluate(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0; }
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
