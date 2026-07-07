package com.android.internal.widget.remotecompose.core.operations;

public class Theme extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.RemoteComposeOperation {
    private static final java.lang.String CLASS_NAME = "Theme";
    public static final int DARK = -2;
    public static final int LIGHT = -3;
    private static final int OP_CODE = 63;
    public static final int SYSTEM = 0;
    public static final int UNSPECIFIED = -1;
    int mTheme;
    public Theme(int p0) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
