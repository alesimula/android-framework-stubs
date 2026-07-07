package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class CollapsiblePriorityModifierOperation extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public static final java.lang.String CLASS_NAME = "CollapsiblePriorityModifierOperation";
    private static final int OP_CODE = 235;
    private int mOrientation;
    private float mPriority;
    public CollapsiblePriorityModifierOperation(int p0, float p1) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public int getOrientation() { return 0; }
    public float getPriority() { return 0.0f; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
