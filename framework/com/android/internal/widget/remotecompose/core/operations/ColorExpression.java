package com.android.internal.widget.remotecompose.core.operations;

public class ColorExpression extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable, com.android.internal.widget.remotecompose.core.operations.ComponentData {
    public static final byte ARGB_MODE = 5;
    private static final java.lang.String CLASS_NAME = "ColorExpression";
    public static final byte COLOR_COLOR_INTERPOLATE = 0;
    public static final byte COLOR_ID_INTERPOLATE = 2;
    public static final byte HSV_MODE = 4;
    public static final byte IDARGB_MODE = 6;
    public static final byte ID_COLOR_INTERPOLATE = 1;
    public static final byte ID_ID_INTERPOLATE = 3;
    private static final int OP_CODE = 134;
    public int mAlpha;
    private float mArgbAlpha;
    private float mArgbBlue;
    private float mArgbGreen;
    private float mArgbRed;
    public int mColor1;
    public int mColor2;
    public float mHue;
    public int mId;
    int mMode;
    private float mOutArgbAlpha;
    private float mOutArgbBlue;
    private float mOutArgbGreen;
    private float mOutArgbRed;
    public int mOutColor1;
    public int mOutColor2;
    public float mOutHue;
    public float mOutSat;
    public float mOutTween;
    public float mOutValue;
    public float mSat;
    public float mTween;
    public float mValue;
    public ColorExpression(int p0, byte p1, float p2, float p3, float p4, float p5) { super(); }
    public ColorExpression(int p0, byte p1, int p2, float p3, float p4, float p5) { super(); }
    public ColorExpression(int p0, float p1, float p2, float p3) { super(); }
    public ColorExpression(int p0, int p1, int p2, int p3, float p4) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3, float p4, float p5) {}
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, float p5) {}
    private static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, int p5) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
