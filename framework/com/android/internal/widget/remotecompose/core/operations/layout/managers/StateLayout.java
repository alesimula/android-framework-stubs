package com.android.internal.widget.remotecompose.core.operations.layout.managers;

public class StateLayout extends com.android.internal.widget.remotecompose.core.operations.layout.managers.LayoutManager {
    private static final int OP_CODE = 217;
    public int MAX_CACHE_ELEMENTS;
    public int[] cacheListElementsId;
    public int currentLayoutIndex;
    public boolean inTransition;
    private int mIndexId;
    public int measuredLayoutIndex;
    public int previousLayoutIndex;
    public java.util.Map<java.lang.Integer, com.android.internal.widget.remotecompose.core.operations.layout.Component[]> statePaintedComponents;
    public StateLayout(int p0, int p1, int p2, int p3, int p4) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public StateLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6, int p7) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, int p5) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void checkEndOfTransition() {}
    public void collapsePaintedComponents() {}
    public void computeSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public void computeWrapSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, boolean p5, boolean p6, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p7, com.android.internal.widget.remotecompose.core.operations.layout.measure.Size p8) {}
    public void findAnimatedComponents() {}
    public com.android.internal.widget.remotecompose.core.operations.layout.managers.LayoutManager getLayout(int p0) { return null; }
    protected java.lang.String getSerializedName() { return null; }
    public void hideLayoutsOtherThan(int p0) {}
    public void inflate() {}
    public void internalLayoutMeasure(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public void measure(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public boolean onClick(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3) { return false; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
}
