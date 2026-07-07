package com.android.internal.widget.remotecompose.core.operations;

public class BitmapTextMeasure extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport {
    private static final java.lang.String CLASS_NAME = "BitmapTextMeasure";
    public static final int MEASURE_BOTTOM = 5;
    public static final int MEASURE_HEIGHT = 1;
    public static final int MEASURE_LEFT = 2;
    public static final int MEASURE_MAX_HEIGHT_FLAG = 512;
    public static final int MEASURE_MONOSPACE_FLAG = 256;
    public static final int MEASURE_RIGHT = 3;
    public static final int MEASURE_TOP = 4;
    public static final int MEASURE_WIDTH = 0;
    private static final int OP_CODE = 183;
    private final int mBitmapFontId = 0;
    float[] mBounds;
    float mGlyphSpacing;
    public int mId;
    float mOutGlyphSpacing;
    public int mTextId;
    public int mType;
    public BitmapTextMeasure(int p0, int p1, int p2, int p3, float p4) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, float p5) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    private void measure(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    private java.lang.String typeToString() { return null; }
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
