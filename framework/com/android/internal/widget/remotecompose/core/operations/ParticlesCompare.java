package com.android.internal.widget.remotecompose.core.operations;

public class ParticlesCompare extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.operations.layout.Container {
    private static final java.lang.String CLASS_NAME = "ParticlesCompare";
    private static final int MAX_EQU_LENGTH = 46;
    private static final int MAX_FLOAT_ARRAY = 2000;
    private static final int OP_CODE = 194;
    private final float[][] mEquations1 = null;
    private final float[][] mEquations2 = null;
    com.android.internal.widget.remotecompose.core.operations.utilities.AnimatedFloatExpression mExp;
    private final float[] mExpression = null;
    private final short mFlags = 0;
    private final int mId = 0;
    private final java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mList = null;
    private final float mMax = 0.0f;
    private final float mMin = 0.0f;
    private final float[][] mOutEquations1 = null;
    private final float[][] mOutEquations2 = null;
    private final float[] mOutExpression = null;
    private float mOutMax;
    private float mOutMin;
    private float[][] mParticles;
    com.android.internal.widget.remotecompose.core.operations.ParticlesCreate mParticlesSource;
    private int[] mVarId;
    public ParticlesCompare(int p0, short p1, float p2, float p3, float[] p4, float[][] p5, float[][] p6) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, short p2, float p3, float p4, float[] p5, float[][] p6, float[][] p7) {}
    private void condition1Body(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    private void condition2Body(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    private float[] copy(float[] p0) { return null; }
    private float[][] copy(float[][] p0) { return null; }
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    static float[] readFloats(com.android.internal.widget.remotecompose.core.WireBuffer p0) { return null; }
    private void register(com.android.internal.widget.remotecompose.core.RemoteContext p0, float[] p1) {}
    private void runChildren(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.RemoteContext p1) {}
    private void setupForParticle(com.android.internal.widget.remotecompose.core.RemoteContext p0, float[] p1) {}
    private void update(com.android.internal.widget.remotecompose.core.RemoteContext p0, float[] p1, float[] p2) {}
    private void update(com.android.internal.widget.remotecompose.core.RemoteContext p0, float[][] p1, float[][] p2) {}
    private void update2Body(com.android.internal.widget.remotecompose.core.RemoteContext p0, float[] p1, float[] p2, float[] p3, float[] p4) {}
    private void update2Body(com.android.internal.widget.remotecompose.core.RemoteContext p0, float[][] p1, float[][] p2, float[] p3, float[] p4, boolean p5) {}
    private static void writeFloats(com.android.internal.widget.remotecompose.core.WireBuffer p0, float[] p1) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> getList() { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
