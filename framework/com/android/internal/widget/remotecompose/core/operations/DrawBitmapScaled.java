package com.android.internal.widget.remotecompose.core.operations;

public class DrawBitmapScaled extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent {
    private static final java.lang.String CLASS_NAME = "DrawBitmapScaled";
    private static final int OP_CODE = 149;
    public static final int SCALE_CROP = 5;
    public static final int SCALE_FILL_BOUNDS = 6;
    public static final int SCALE_FILL_HEIGHT = 3;
    public static final int SCALE_FILL_WIDTH = 2;
    public static final int SCALE_FIT = 4;
    public static final int SCALE_FIXED_SCALE = 7;
    public static final int SCALE_INSIDE = 1;
    public static final int SCALE_NONE = 0;
    int mContentDescId;
    float mDstBottom;
    float mDstLeft;
    float mDstRight;
    float mDstTop;
    int mImageId;
    float mOutDstBottom;
    float mOutDstLeft;
    float mOutDstRight;
    float mOutDstTop;
    float mOutScaleFactor;
    float mOutSrcBottom;
    float mOutSrcLeft;
    float mOutSrcRight;
    float mOutSrcTop;
    float mScaleFactor;
    int mScaleType;
    com.android.internal.widget.remotecompose.core.operations.utilities.ImageScaling mScaling;
    float mSrcBottom;
    float mSrcLeft;
    float mSrcRight;
    float mSrcTop;
    public DrawBitmapScaled(int p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, int p9, float p10, int p11) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, int p10, float p11, int p12) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private java.lang.String getScaleTypeString() { return null; }
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    private void register(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1) {}
    static java.lang.String str(float p0) { return null; }
    public java.lang.Integer getContentDescriptionId() { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    void print(java.lang.String p0, float p1, float p2, float p3, float p4) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
