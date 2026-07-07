package com.android.internal.widget.remotecompose.core.operations;

public class ConditionalOperations extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.operations.layout.Container, com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "ConditionalOperations";
    private static final int OP_CODE = 178;
    public static final byte TYPE_EQ = 0;
    public static final byte TYPE_GT = 4;
    public static final byte TYPE_GTE = 5;
    public static final byte TYPE_LT = 2;
    public static final byte TYPE_LTE = 3;
    public static final byte TYPE_NEQ = 1;
    private static final java.lang.String[] TYPE_STR = null;
    int mIndexVariableId;
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mList;
    byte mType;
    float mVarA;
    float mVarAOut;
    float mVarB;
    float mVarBOut;
    public ConditionalOperations(byte p0, float p1, float p2) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, byte p1, float p2, float p3) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public int estimateIterations() { return 0; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> getList() { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
