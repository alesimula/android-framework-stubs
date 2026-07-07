package com.android.internal.widget.remotecompose.core;

public abstract class PaintOperation extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public static final int PTR_DEREFERENCE = 1073741824;
    public static final int VALUE_MASK = 65535;
    public PaintOperation() { super(); }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    protected int getId(int p0, com.android.internal.widget.remotecompose.core.PaintContext p1) { return 0; }
    public abstract void paint(com.android.internal.widget.remotecompose.core.PaintContext p0);
    public boolean suitableForTransition(com.android.internal.widget.remotecompose.core.Operation p0) { return false; }
}
