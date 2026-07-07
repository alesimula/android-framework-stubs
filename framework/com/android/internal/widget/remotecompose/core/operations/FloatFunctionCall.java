package com.android.internal.widget.remotecompose.core.operations;

public class FloatFunctionCall extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport {
    private static final java.lang.String CLASS_NAME = "FunctionCall";
    private static final int MAX_FLOAT_ARRAY_SIZE = 80;
    private static final int OP_CODE = 166;
    private final float[] mArgs = null;
    com.android.internal.widget.remotecompose.core.operations.utilities.AnimatedFloatExpression mExp;
    com.android.internal.widget.remotecompose.core.operations.FloatFunctionDefine mFunction;
    private final int mId = 0;
    private final float[] mOutArgs = null;
    public FloatFunctionCall(int p0, float[] p1) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float[] p2) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
