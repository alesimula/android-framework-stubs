package com.android.internal.widget.remotecompose.core.operations.loom;

public class PatternDefine extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.Container {
    private static final int OP_CODE = 246;
    private byte[] mBodyBytes;
    private final int mId = 0;
    private java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mList;
    private final int[] mParamIds = null;
    public PatternDefine(int p0, int[] p1) { super(); }
    public static int apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int[] p2) { return 0; }
    public static void applyEnd(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public byte[] getBody() { return null; }
    public int getId() { return 0; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> getList() { return null; }
    public int[] getParamIds() { return null; }
    public void materialize(com.android.internal.widget.remotecompose.core.operations.loom.ExpansionContext p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1, com.android.internal.widget.remotecompose.core.operations.loom.LoomManager p2) {}
    public void setBody(byte[] p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
