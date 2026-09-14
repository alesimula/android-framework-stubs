package com.android.internal.widget.remotecompose.core.operations.loom;

public class PatternForEach extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.Container {
    private static final int OP_CODE = 244;
    private byte[] mBodyBytes;
    private int mCollectionId;
    private java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mList;
    private int mLocalItemId;
    public PatternForEach(int p0, int p1) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public int getCollectionId() { return 0; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> getList() { return null; }
    public int getLocalItemId() { return 0; }
    public void materialize(com.android.internal.widget.remotecompose.core.operations.loom.ExpansionContext p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1, com.android.internal.widget.remotecompose.core.operations.loom.LoomManager p2) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
