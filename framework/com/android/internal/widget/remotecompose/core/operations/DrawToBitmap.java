package com.android.internal.widget.remotecompose.core.operations;

public class DrawToBitmap extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "DrawToBitmap";
    public static final int MODE_NO_INITIALIZE = 1;
    private static final int OP_CODE = 190;
    private final int mBitmapId = 0;
    private final int mColor = 0;
    private final int mMode = 0;
    public DrawToBitmap(int p0, int p1, int p2) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
