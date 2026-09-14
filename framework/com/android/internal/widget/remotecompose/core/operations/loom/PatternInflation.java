package com.android.internal.widget.remotecompose.core.operations.loom;

public class PatternInflation extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.Container, com.android.internal.widget.remotecompose.core.operations.ComponentData {
    private static final int OP_CODE = 247;
    private final int[] mArgIds = null;
    private int mId;
    private java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mList;
    public PatternInflation(int p0, int[] p1) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int[] p2) {}
    private static int argCount(int[] p0) { return 0; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public int[] getArgIds() { return null; }
    public int getId() { return 0; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> getList() { return null; }
    public void materialize(com.android.internal.widget.remotecompose.core.operations.loom.ExpansionContext p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1, com.android.internal.widget.remotecompose.core.operations.loom.LoomManager p2) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
