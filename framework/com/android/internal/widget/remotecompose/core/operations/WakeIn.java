package com.android.internal.widget.remotecompose.core.operations;

public class WakeIn extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public static final int ANCHOR_MONOSPACE_MEASURE = 2;
    public static final int ANCHOR_TEXT_RTL = 1;
    private static final java.lang.String CLASS_NAME = "WakeIn";
    public static final int MEASURE_EVERY_TIME = 4;
    private static final int OP_CODE = 191;
    java.lang.String mLastString;
    float mWake;
    float mWakeOut;
    public WakeIn(float p0) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
