package com.android.internal.widget.remotecompose.core.operations;

public class Header extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.RemoteComposeOperation {
    private static final java.lang.String CLASS_NAME = "Header";
    private static final short DATA_TYPE_FLOAT = 1;
    private static final short DATA_TYPE_INT = 0;
    private static final short DATA_TYPE_LONG = 2;
    private static final short DATA_TYPE_STRING = 3;
    public static final short DEBUG = 16;
    public static final short DOC_CONTENT_DESCRIPTION = 9;
    public static final short DOC_DATA_UPDATE = 12;
    public static final short DOC_DENSITY_AT_GENERATION = 7;
    public static final short DOC_DENSITY_BEHAVIOR = 27;
    public static final short DOC_DESIRED_FPS = 8;
    public static final short DOC_HEIGHT = 6;
    public static final short DOC_PROFILES = 14;
    public static final short DOC_SOURCE = 11;
    public static final short DOC_WIDTH = 5;
    public static final short FEATURE_ARRAY_LISTENERS = 25;
    public static final short FEATURE_CLICK_VERSION = 26;
    public static final short FEATURE_LT_RESIZE = 24;
    public static final short FEATURE_MEASURE_VERSION = 17;
    public static final short FEATURE_PAINT_MEASURE = 15;
    public static final short FEATURE_PRIORITY_FIX = 23;
    public static final short FEATURE_TOUCH_VERSION = 18;
    public static final short HOST_EXCEPTION_HANDLER = 13;
    private static final short[] KEYS = null;
    private static final java.lang.String[] KEY_NAMES = null;
    private static final int MAGIC_NUMBER = 76283904;
    private static final int OP_CODE = 0;
    public static final short TEST_ACTIONS = 22;
    public static final short TEST_AFTER = 20;
    public static final short TEST_COLOR_THEME = 21;
    public static final short TEST_TIME = 19;
    long mCapabilities;
    float mDensity;
    int mHeight;
    int mMajorVersion;
    int mMinorVersion;
    int mPatchVersion;
    int mProfiles;
    private com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.Object> mProperties;
    int mWidth;
    public Header(int p0, int p1, int p2, int p3, int p4, float p5, long p6) { super(); }
    public Header(int p0, int p1, int p2, com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.Object> p3) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, float p3, long p4) {}
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, short[] p2, java.lang.Object[] p3) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private float getFloat(int p0, float p1) { return 0.0f; }
    private static int getInt(short[] p0, java.lang.Object[] p1, int p2) { return 0; }
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static int peekApiLevel(com.android.internal.widget.remotecompose.core.WireBuffer p0) { return 0; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static com.android.internal.widget.remotecompose.core.operations.Header readDirect(com.android.internal.widget.remotecompose.core.WireBuffer p0) throws java.io.IOException { return null; }
    public static com.android.internal.widget.remotecompose.core.operations.Header readDirect(java.io.InputStream p0) throws java.io.IOException { return null; }
    private static void readMap(com.android.internal.widget.remotecompose.core.WireBuffer p0, short[] p1, java.lang.Object[] p2) {}
    private static void readMap(java.io.DataInputStream p0, short[] p1, java.lang.Object[] p2) throws java.io.IOException {}
    private static void writeMap(com.android.internal.widget.remotecompose.core.WireBuffer p0, short[] p1, java.lang.Object[] p2) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public java.lang.Object get(short p0) { return null; }
    public float getDensity() { return 0.0f; }
    public int getInt(int p0, int p1) { return 0; }
    public int getProfiles() { return 0; }
    public void setVersion(com.android.internal.widget.remotecompose.core.CoreDocument p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
