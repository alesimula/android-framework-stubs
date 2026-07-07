package com.android.internal.widget.remotecompose.core.operations;

public class FloatConstant extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "FloatConstant";
    private static final int OP_CODE = 80;
    public int mId;
    public float mValue;
    public FloatConstant(int p0, float p1) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void update(com.android.internal.widget.remotecompose.core.operations.FloatConstant p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
