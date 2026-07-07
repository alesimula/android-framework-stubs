package com.android.internal.widget.remotecompose.core.operations;

public class DrawBitmapInt extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent {
    private static final java.lang.String CLASS_NAME = "DrawBitmapInt";
    private static final int OP_CODE = 66;
    int mContentDescId;
    int mDstBottom;
    int mDstLeft;
    int mDstRight;
    int mDstTop;
    int mImageId;
    int mSrcBottom;
    int mSrcLeft;
    int mSrcRight;
    int mSrcTop;
    public DrawBitmapInt(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public java.lang.Integer getContentDescriptionId() { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
