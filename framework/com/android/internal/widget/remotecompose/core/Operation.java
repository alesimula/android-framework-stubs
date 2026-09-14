package com.android.internal.widget.remotecompose.core;

public abstract class Operation {
    private static final boolean ENABLE_DIRTY_FLAG_OPTIMIZATION = true;
    private boolean mDirty;
    public Operation() {}
    public static void writeRecursive(com.android.internal.widget.remotecompose.core.Operation p0, com.android.internal.widget.remotecompose.core.WireBuffer p1) {}
    public abstract void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0);
    public abstract java.lang.String deepToString(java.lang.String p0);
    public boolean isDirty() { return false; }
    public void markDirty() {}
    public void markNotDirty() {}
    public void materialize(com.android.internal.widget.remotecompose.core.operations.loom.ExpansionContext p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1, com.android.internal.widget.remotecompose.core.operations.loom.LoomManager p2) {}
    public abstract void write(com.android.internal.widget.remotecompose.core.WireBuffer p0);
}
