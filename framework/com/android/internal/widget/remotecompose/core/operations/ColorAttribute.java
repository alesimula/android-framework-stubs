package com.android.internal.widget.remotecompose.core.operations;

public class ColorAttribute extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable, com.android.internal.widget.remotecompose.core.operations.ComponentData {
    private static final java.lang.String CLASS_NAME = "ColorAttribute";
    public static final short COLOR_ALPHA = 6;
    public static final short COLOR_BLUE = 5;
    public static final short COLOR_BRIGHTNESS = 2;
    public static final short COLOR_GREEN = 4;
    public static final short COLOR_HUE = 0;
    public static final short COLOR_RED = 3;
    public static final short COLOR_SATURATION = 1;
    private static final int OP_CODE = 180;
    public int mColorId;
    public int mId;
    public short mType;
    public ColorAttribute(int p0, int p1, short p2) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, short p3) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private java.lang.String getTypeString() { return null; }
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
