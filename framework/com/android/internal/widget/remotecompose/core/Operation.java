package com.android.internal.widget.remotecompose.core;

public abstract class Operation {
    private static final boolean ENABLE_DIRTY_FLAG_OPTIMIZATION = true;
    private boolean mDirty;
    public Operation() {}
    public abstract void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0);
    public abstract java.lang.String deepToString(java.lang.String p0);
    public boolean isDirty() { return false; }
    public void markDirty() {}
    public void markNotDirty() {}
    public abstract void write(com.android.internal.widget.remotecompose.core.WireBuffer p0);
}
