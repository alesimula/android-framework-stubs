package com.android.internal.widget.remotecompose.core.operations.layout.managers;

public class FlowLayout extends com.android.internal.widget.remotecompose.core.operations.layout.managers.RowLayout {
    public static final int BOTTOM = 5;
    public static final int CENTER = 2;
    public static final int END = 3;
    public static final int SPACE_AROUND = 8;
    public static final int SPACE_BETWEEN = 6;
    public static final int SPACE_EVENLY = 7;
    public static final int START = 1;
    public static final int TOP = 4;
    public int mMaxItemsInEachRow;
    public int mMaxLines;
    public FlowLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6, int p7, int p8, float p9, int p10, int p11) { super((com.android.internal.widget.remotecompose.core.operations.layout.Component)null, 0, 0, 0, 0, 0.0f); }
    public FlowLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, int p3, int p4, float p5, int p6, int p7) { super((com.android.internal.widget.remotecompose.core.operations.layout.Component)null, 0, 0, 0, 0, 0.0f); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, float p5, int p6, int p7) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private boolean hasWeight(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return false; }
    public static int id() { return 0; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    private java.util.ArrayList<java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.layout.Component>> segmentComponents(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p3) { return null; }
    public void computeSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public void computeWrapSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, boolean p5, boolean p6, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p7, com.android.internal.widget.remotecompose.core.operations.layout.measure.Size p8) {}
    protected java.lang.String getSerializedName() { return null; }
    public void internalLayoutMeasure(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
