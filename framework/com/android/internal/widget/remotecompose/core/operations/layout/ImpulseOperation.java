package com.android.internal.widget.remotecompose.core.operations.layout;

public class ImpulseOperation extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.operations.layout.Container {
    private static final java.lang.String CLASS_NAME = "ImpulseOperation";
    private static final int OP_CODE = 164;
    private float mDuration;
    int mIndexVariableId;
    private boolean mInitialPass;
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mList;
    private float mOutDuration;
    private float mOutStartAt;
    private com.android.internal.widget.remotecompose.core.operations.layout.ImpulseProcess mProcess;
    private float mStartAt;
    public ImpulseOperation(float p0, float p1) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, float p2) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public int estimateIterations() { return 0; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> getList() { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void setProcess(com.android.internal.widget.remotecompose.core.operations.layout.ImpulseProcess p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
