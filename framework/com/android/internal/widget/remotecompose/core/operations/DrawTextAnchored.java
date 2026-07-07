package com.android.internal.widget.remotecompose.core.operations;

public class DrawTextAnchored extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public static final int ANCHOR_MONOSPACE_MEASURE = 2;
    public static final int ANCHOR_TEXT_RTL = 1;
    public static final int BASELINE_RELATIVE = 8;
    private static final java.lang.String CLASS_NAME = "DrawTextAnchored";
    public static final int MEASURE_EVERY_TIME = 4;
    private static final int OP_CODE = 133;
    float[] mBounds;
    int mFlags;
    java.lang.String mLastString;
    float mOutPanX;
    float mOutPanY;
    float mOutX;
    float mOutY;
    float mPanX;
    float mPanY;
    int mTextID;
    float mX;
    float mY;
    public DrawTextAnchored(int p0, float p1, float p2, float p3, float p4, int p5) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3, float p4, float p5, int p6) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private static java.lang.String floatToStr(float p0) { return null; }
    private float getHorizontalOffset() { return 0.0f; }
    private float getVerticalOffset(boolean p0) { return 0.0f; }
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
