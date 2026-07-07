package com.android.internal.widget.remotecompose.core.operations;

public class Skip extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.SerializableToString, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final java.lang.String CLASS_NAME = "Skip";
    private static final int OP_CODE = 241;
    public static final short SKIP_IF_API_EQUAL_TO = 3;
    public static final short SKIP_IF_API_GREATER_THAN = 2;
    public static final short SKIP_IF_API_LESS_THAN = 1;
    public static final short SKIP_IF_API_NOT_EQUAL_TO = 4;
    public static final short SKIP_IF_PROFILE_EXCLUDES = 6;
    public static final short SKIP_IF_PROFILE_INCLUDES = 5;
    public final short mConditionType = 0;
    private final int mLibraryApiLevel = 0;
    private final int mProfile = 0;
    public int mSkipLength;
    public int mValue;
    public Skip(short p0, int p1, int p2, com.android.internal.widget.remotecompose.core.SystemInfo p3) { super(); }
    public static int apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, short p1, int p2, int p3) { return 0; }
    public static void applyEndSkip(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private java.lang.String getSerializedName() { return null; }
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    private boolean needsToSkip() { return false; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
