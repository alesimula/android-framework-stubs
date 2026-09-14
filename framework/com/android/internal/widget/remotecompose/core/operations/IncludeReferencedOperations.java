package com.android.internal.widget.remotecompose.core.operations;

public class IncludeReferencedOperations extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation {
    private static final int OP_CODE = 245;
    private int mId;
    public IncludeReferencedOperations(int p0) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1) {}
    private void flattenRecursive(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public int getReferenceId() { return 0; }
    public void materialize(com.android.internal.widget.remotecompose.core.operations.loom.ExpansionContext p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1, com.android.internal.widget.remotecompose.core.operations.loom.LoomManager p2) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
