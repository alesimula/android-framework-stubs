package com.android.internal.widget.remotecompose.core.operations;

public class DataDynamicListFloat extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.operations.utilities.ArrayAccess, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "DataDynamicListFloat";
    private static final int MAX_FLOAT_ARRAY = 2000;
    private static final int OP_CODE = 197;
    private final float mArrayLength = 0.0f;
    private float mArrayLengthOut;
    public final int mId = 0;
    private float[] mValues;
    public DataDynamicListFloat(int p0, float p1) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public float getFloatValue(int p0) { return 0.0f; }
    public float[] getFloats() { return null; }
    public int getLength() { return 0; }
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void update(com.android.internal.widget.remotecompose.core.operations.DataDynamicListFloat p0) {}
    public void updateValues(float[] p0) {}
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
