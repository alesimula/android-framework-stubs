package com.android.internal.widget.remotecompose.core.operations;

public class ParticlesCreate extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport {
    private static final java.lang.String CLASS_NAME = "ParticlesCreate";
    private static final int MAX_EQU_LENGTH = 32;
    private static final int MAX_FLOAT_ARRAY = 2000;
    private static final int OP_CODE = 161;
    private final float[][] mEquations = null;
    com.android.internal.widget.remotecompose.core.operations.utilities.AnimatedFloatExpression mExp;
    private final int mId = 0;
    private final int[] mIndexeVars = null;
    private final float[][] mOutEquations = null;
    private final int mParticleCount = 0;
    private final float[][] mParticles = null;
    private final int[] mVarId = null;
    public ParticlesCreate(int p0, int[] p1, float[][] p2, int p3) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int[] p2, float[][] p3, int p4) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public float[][] getEquations() { return null; }
    public float[][] getParticles() { return null; }
    public int[] getVariableIds() { return null; }
    void initializeParticle(int p0) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
