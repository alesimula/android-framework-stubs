package com.android.internal.widget.remotecompose.core.operations;

public class DrawBitmapFontTextOnPath extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport {
    private static final java.lang.String CLASS_NAME = "DrawBitmapFontTextOnPath";
    private static final int OP_CODE = 49;
    int mBitmapFontID;
    int mEnd;
    float mGlyphSpacing;
    float mOutGlyphSpacing;
    float mOutYAdj;
    int mPathID;
    int mStart;
    int mTextID;
    float mYAdj;
    public DrawBitmapFontTextOnPath(int p0, int p1, int p2, int p3, int p4, float p5, float p6) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, int p5, float p6, float p7) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    private int measureWidth(java.lang.String p0, com.android.internal.widget.remotecompose.core.operations.BitmapFontData p1) { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
