package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class BorderModifierOperation extends com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DecoratorModifierOperation implements com.android.internal.widget.remotecompose.core.VariableSupport {
    public static final java.lang.String CLASS_NAME = "BorderModifierOperation";
    public static final int COLOR_REF = 2;
    private static final int OP_CODE = 107;
    float mA;
    float mB;
    float mBorderWidth;
    float mBorderWidthValue;
    int mColorId;
    float mG;
    float mHeight;
    public com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle mPaint;
    float mR;
    float mRoundedCorner;
    int mShapeType;
    boolean mUseColorId;
    float mWidth;
    float mX;
    float mY;
    public BorderModifierOperation(int p0, int p1, int p2, int p3, float p4, float p5, float p6, float p7, float p8, float p9, int p10) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, float p5, float p6, float p7, float p8, float p9, float p10, int p11) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    private static boolean isAtLeastVersion7(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return false; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, float p2, float p3) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
