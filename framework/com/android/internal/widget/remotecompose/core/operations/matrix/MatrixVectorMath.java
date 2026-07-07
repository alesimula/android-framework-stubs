package com.android.internal.widget.remotecompose.core.operations.matrix;

public class MatrixVectorMath extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "MatrixVectorMath";
    private static final int OP_CODE = 188;
    private final float[] mInputs = null;
    com.android.internal.widget.remotecompose.core.operations.utilities.Matrix mMatrix;
    public int mMatrixId;
    private final float[] mOutInputs = null;
    private final int[] mOutputs = null;
    private final float[] mTempOut = null;
    private final short mType = 0;
    public MatrixVectorMath(short p0, int[] p1, int p2, float[] p3) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, short p1, int[] p2, int p3, float[] p4) {}
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
