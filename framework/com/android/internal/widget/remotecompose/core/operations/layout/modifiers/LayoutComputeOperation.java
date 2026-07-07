package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class LayoutComputeOperation extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation, com.android.internal.widget.remotecompose.core.operations.layout.Container, com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.LayoutCompute {
    private static final java.lang.String CLASS_NAME = "LayoutComputeOperation";
    private static final boolean DEBUG = false;
    private static final int OP_CODE = 238;
    public static final int TYPE_MEASURE = 0;
    public static final int TYPE_POSITION = 1;
    private final boolean mAnimateChanges = false;
    float[] mBounds;
    private final int mBoundsId = 0;
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mList;
    private com.android.internal.widget.remotecompose.core.operations.layout.LayoutComponent mParent;
    private final int mType = 0;
    public LayoutComputeOperation(int p0, int p1, boolean p2) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, boolean p3) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private boolean isAnimating() { return false; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public boolean applyToMeasure(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p1, com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p2) { return false; }
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public boolean evaluateInLayout(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return false; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> getList() { return null; }
    public int getType() { return 0; }
    public void markDirty() {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public java.lang.String serializedName() { return null; }
    public void setParent(com.android.internal.widget.remotecompose.core.operations.layout.LayoutComponent p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
