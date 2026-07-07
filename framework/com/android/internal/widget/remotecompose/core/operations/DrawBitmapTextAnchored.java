package com.android.internal.widget.remotecompose.core.operations;

public class DrawBitmapTextAnchored extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport {
    private static final java.lang.String CLASS_NAME = "DrawBitmapTextAnchored";
    private static final int OP_CODE = 184;
    int mBitmapFontID;
    float[] mBounds;
    float mEnd;
    float mGlyphSpacing;
    float mOutEnd;
    float mOutGlyphSpacing;
    float mOutPanX;
    float mOutPanY;
    float mOutStart;
    float mOutX;
    float mOutY;
    float mPanX;
    float mPanY;
    float mStart;
    int mTextID;
    float mX;
    float mY;
    public DrawBitmapTextAnchored(int p0, int p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private float getHorizontalOffset() { return 0.0f; }
    private float getVerticalOffset() { return 0.0f; }
    public static int id() { return 0; }
    private void measure(com.android.internal.widget.remotecompose.core.operations.BitmapFontData p0, java.lang.String p1) {}
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
