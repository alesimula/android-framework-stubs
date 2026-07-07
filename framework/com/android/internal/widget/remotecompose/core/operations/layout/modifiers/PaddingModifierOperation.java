package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class PaddingModifierOperation extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation, com.android.internal.widget.remotecompose.core.VariableSupport {
    public static final java.lang.String CLASS_NAME = "PaddingModifierOperation";
    private static final int OP_CODE = 58;
    float mBottom;
    float mBottomValue;
    float mLeft;
    float mLeftValue;
    float mRight;
    float mRightValue;
    float mTop;
    float mTopValue;
    public PaddingModifierOperation(float p0, float p1, float p2, float p3) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, float p2, float p3, float p4) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public float getBottom() { return 0.0f; }
    public float getLeft() { return 0.0f; }
    public float getRight() { return 0.0f; }
    public float getTop() { return 0.0f; }
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void setBottom(float p0) {}
    public void setLeft(float p0) {}
    public void setRight(float p0) {}
    public void setTop(float p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
