package com.android.internal.widget.remotecompose.core.operations;

public class DataMapIds extends com.android.internal.widget.remotecompose.core.Operation {
    private static final java.lang.String CLASS_NAME = "DataMapIds";
    private static final int OP_CODE = 145;
    public static final byte TYPE_BOOLEAN = 4;
    public static final byte TYPE_FLOAT = 2;
    public static final byte TYPE_INT = 1;
    public static final byte TYPE_LONG = 3;
    public static final byte TYPE_STRING = 0;
    final com.android.internal.widget.remotecompose.core.operations.utilities.DataMap mDataMap = null;
    int mId;
    public DataMapIds(int p0, java.lang.String[] p1, byte[] p2, int[] p3) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, java.lang.String[] p2, byte[] p3, int[] p4) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    private java.lang.String typeString(byte p0) { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
