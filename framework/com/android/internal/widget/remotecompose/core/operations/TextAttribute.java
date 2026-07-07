package com.android.internal.widget.remotecompose.core.operations;

public class TextAttribute extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "TextMeasure";
    public static final short MEASURE_BOTTOM = 5;
    public static final short MEASURE_HEIGHT = 1;
    public static final short MEASURE_LEFT = 2;
    public static final int MEASURE_MAX_HEIGHT_FLAG = 512;
    public static final int MEASURE_MONOSPACE_FLAG = 256;
    public static final short MEASURE_RIGHT = 3;
    public static final short MEASURE_TOP = 4;
    public static final short MEASURE_WIDTH = 0;
    private static final int OP_CODE = 170;
    public static final short TEXT_LENGTH = 6;
    float[] mBounds;
    public int mId;
    public int mTextId;
    public short mType;
    public TextAttribute(int p0, int p1, short p2) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, short p3) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    private java.lang.String typeToString() { return null; }
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
