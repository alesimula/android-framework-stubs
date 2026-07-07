package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class WidthModifierOperation extends com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation {
    public static final java.lang.String CLASS_NAME = "WidthModifierOperation";
    private static final int OP_CODE = 16;
    private com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionInModifierOperation mWidthIn;
    public WidthModifierOperation(float p0) { super(0.0f); }
    public WidthModifierOperation(com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation.Type p0) { super(0.0f); }
    public WidthModifierOperation(com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation.Type p0, float p1) { super(0.0f); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionInModifierOperation getWidthIn() { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String serializedName() { return null; }
    public void setWidthIn(com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionInModifierOperation p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
