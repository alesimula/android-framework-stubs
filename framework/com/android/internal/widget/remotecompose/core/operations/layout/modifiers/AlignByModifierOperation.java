package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class AlignByModifierOperation extends com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DecoratorModifierOperation {
    public static final java.lang.String CLASS_NAME = "AlignByModifierOperation";
    public static final float FIRST_BASELINE = Float.valueOf(0.0f);
    public static final int ID_FIRST_BASELINE = 1;
    public static final int ID_LAST_BASELINE = 2;
    public static final float LAST_BASELINE = Float.valueOf(0.0f);
    private static final int OP_CODE = 237;
    private int mFlags;
    private float mLine;
    private com.android.internal.widget.remotecompose.core.operations.layout.Component mParent;
    public AlignByModifierOperation(float p0, int p1) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, int p2) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public float getValue(com.android.internal.widget.remotecompose.core.PaintContext p0) { return 0.0f; }
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, float p2, float p3) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void setParent(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
