package com.android.internal.widget.remotecompose.core.operations.layout.managers;

public class CanvasLayout extends com.android.internal.widget.remotecompose.core.operations.layout.managers.BoxLayout {
    private boolean mHasCanvasLayoutContent;
    public CanvasLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2) { super((com.android.internal.widget.remotecompose.core.operations.layout.Component)null, 0, 0, 0, 0); }
    public CanvasLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6) { super((com.android.internal.widget.remotecompose.core.operations.layout.Component)null, 0, 0, 0, 0); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private boolean hasCanvasContent() { return false; }
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    protected void getComponentsData(com.android.internal.widget.remotecompose.core.operations.layout.LayoutComponentContent p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    protected java.lang.String getSerializedName() { return null; }
    protected void handleOperations(com.android.internal.widget.remotecompose.core.RemoteContext p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void inflate() {}
    public void internalLayoutMeasure(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
