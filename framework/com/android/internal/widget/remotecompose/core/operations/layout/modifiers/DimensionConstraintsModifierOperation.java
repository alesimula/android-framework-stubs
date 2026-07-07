package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class DimensionConstraintsModifierOperation extends com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionInModifierOperation {
    public static final java.lang.String CLASS_NAME = "DimensionConstraintsModifierOperation";
    public static final int HORIZONTAL_CONSTRAINTS = 0;
    private static final int OP_CODE = 243;
    public static final int REQUIRED_HORIZONTAL_CONSTRAINTS = 2;
    public static final int REQUIRED_VERTICAL_CONSTRAINTS = 3;
    public static final int VERTICAL_CONSTRAINTS = 1;
    private final int mType = 0;
    public DimensionConstraintsModifierOperation(int p0, float p1, float p2) { super(0, 0.0f, 0.0f); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public float applyHeightConstraint(float p0) { return 0.0f; }
    public float applyWidthConstraint(float p0) { return 0.0f; }
    public int getType() { return 0; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    java.lang.String typeToString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
