package com.android.internal.widget.remotecompose.core.operations;

public class ParticlesLoop extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.operations.layout.Container {
    private static final java.lang.String CLASS_NAME = "ParticlesLoop";
    private static final int OP_CODE = 163;
    private final float[][] mEquations = null;
    com.android.internal.widget.remotecompose.core.operations.utilities.AnimatedFloatExpression mExp;
    private final int mId = 0;
    private final java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mList = null;
    private final float[][] mOutEquations = null;
    private final float[] mOutRestart = null;
    private float[][] mParticles;
    com.android.internal.widget.remotecompose.core.operations.ParticlesCreate mParticlesSource;
    private final float[] mRestart = null;
    private int[] mVarId;
    public ParticlesLoop(int p0, float[] p1, float[][] p2) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float[] p2, float[][] p3) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> getList() { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
