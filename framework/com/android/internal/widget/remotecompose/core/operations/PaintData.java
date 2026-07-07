package com.android.internal.widget.remotecompose.core.operations;

public class PaintData extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.operations.ComponentData, com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "PaintData";
    private static final int OP_CODE = 40;
    public com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle mPaintData;
    public PaintData() { super(); }
    public PaintData(com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle p0) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
