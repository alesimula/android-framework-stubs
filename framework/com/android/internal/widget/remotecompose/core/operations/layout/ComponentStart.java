package com.android.internal.widget.remotecompose.core.operations.layout;

public class ComponentStart extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.Container {
    public static final int BUTTON = 5;
    public static final int CHECKBOX = 6;
    public static final int CURVED_TEXT = 8;
    public static final int CUSTOM = 10;
    public static final int DEFAULT = 0;
    public static final int IMAGE = 12;
    public static final int LAYOUT = 2;
    public static final int LAYOUT_BOX = 14;
    public static final int LAYOUT_COLUMN = 16;
    public static final int LAYOUT_CONTENT = 3;
    public static final int LAYOUT_ROW = 15;
    public static final int LOTTIE = 11;
    public static final int ROOT_LAYOUT = 1;
    public static final int SCROLL_CONTENT = 4;
    public static final int STATE_BOX_CONTENT = 13;
    public static final int STATE_HOST = 9;
    public static final int TEXT = 7;
    public static final int UNKNOWN = -1;
    int mComponentId;
    float mHeight;
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mList;
    int mType;
    float mWidth;
    float mX;
    float mY;
    public ComponentStart(int p0, int p1, float p2, float p3) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, float p3, float p4) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static int size() { return 0; }
    public static java.lang.String typeDescription(int p0) { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public int getComponentId() { return 0; }
    public float getHeight() { return 0.0f; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> getList() { return null; }
    public int getType() { return 0; }
    public float getWidth() { return 0.0f; }
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
