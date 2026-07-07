package com.android.internal.widget.remotecompose.core.operations;

public class ColorTheme extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.serialize.Serializable, com.android.internal.widget.remotecompose.core.operations.ComponentData {
    private static final java.lang.String CLASS_NAME = "ColorTheme";
    private static final int OP_CODE = 196;
    public int mColorGroupId;
    public java.lang.String mColorGroupName;
    private int mCurrentTheme;
    public int mDarkMode;
    public int mDarkModeFallback;
    public short mDarkModeIndex;
    public final int mId = 0;
    public int mLightMode;
    public int mLightModeFallback;
    public short mLightModeIndex;
    public ColorTheme(int p0, int p1, short p2, short p3, int p4, int p5) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, short p3, short p4, int p5, int p6) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void setTheme(com.android.internal.widget.remotecompose.core.RemoteContext p0, int p1) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
