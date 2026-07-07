package com.android.internal.widget.remotecompose.core.operations;

public class ShaderData extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "ShaderData";
    private static final int OP_CODE = 45;
    int mShaderID;
    int mShaderTextId;
    private boolean mShaderValid;
    java.util.HashMap<java.lang.String, java.lang.Integer> mUniformBitmapMap;
    java.util.HashMap<java.lang.String, float[]> mUniformFloatMap;
    java.util.HashMap<java.lang.String, int[]> mUniformIntMap;
    java.util.HashMap<java.lang.String, float[]> mUniformRawFloatMap;
    public ShaderData(int p0, int p1, java.util.HashMap<java.lang.String, float[]> p2, java.util.HashMap<java.lang.String, int[]> p3, java.util.HashMap<java.lang.String, java.lang.Integer> p4) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, java.util.HashMap<java.lang.String, float[]> p3, java.util.HashMap<java.lang.String, int[]> p4, java.util.HashMap<java.lang.String, java.lang.Integer> p5) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void enable(boolean p0) {}
    public int getShaderTextId() { return 0; }
    public int getUniformBitmapId(java.lang.String p0) { return 0; }
    public java.lang.String[] getUniformBitmapNames() { return null; }
    public java.lang.String[] getUniformFloatNames() { return null; }
    public float[] getUniformFloats(java.lang.String p0) { return null; }
    public java.lang.String[] getUniformIntegerNames() { return null; }
    public int[] getUniformInts(java.lang.String p0) { return null; }
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
