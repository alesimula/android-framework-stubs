package com.android.internal.widget.remotecompose.core.operations;

public class ComponentValue extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.SerializableToString, com.android.internal.widget.remotecompose.core.serialize.Serializable, com.android.internal.widget.remotecompose.core.operations.ComponentData {
    private static final java.lang.String CLASS_NAME = "ComponentValue";
    public static final int CONTENT_HEIGHT = 7;
    public static final int CONTENT_WIDTH = 6;
    public static final int HEIGHT = 1;
    private static final int OP_CODE = 150;
    public static final int POS_ROOT_X = 4;
    public static final int POS_ROOT_Y = 5;
    public static final int POS_X = 2;
    public static final int POS_Y = 3;
    public static final int WIDTH = 0;
    private int mComponentID;
    private int mType;
    private int mValueId;
    public ComponentValue(int p0, int p1, int p2) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    private java.lang.String typeToString(int p0) { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public int getComponentId() { return 0; }
    public int getType() { return 0; }
    public int getValueId() { return 0; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void setComponentId(int p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
