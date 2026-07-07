package com.android.internal.widget.remotecompose.core.operations.layout.managers;

public class FitBoxLayout extends com.android.internal.widget.remotecompose.core.operations.layout.managers.LayoutManager {
    public static final int BOTTOM = 5;
    public static final int CENTER = 2;
    public static final int END = 3;
    public static final int START = 1;
    public static final int TOP = 4;
    int mHorizontalPositioning;
    int mVerticalPositioning;
    public FitBoxLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6, int p7, int p8) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public FitBoxLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, int p3, int p4) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4) {}
    private void computeSizeOriginal(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    private void computeSizePriorityFix(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    private void computeWrapSizeOriginal(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, boolean p5, boolean p6, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p7, com.android.internal.widget.remotecompose.core.operations.layout.measure.Size p8) {}
    private void computeWrapSizePriorityFix(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, boolean p5, boolean p6, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p7, com.android.internal.widget.remotecompose.core.operations.layout.measure.Size p8) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private java.lang.String getPositioningString(int p0) { return null; }
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void computeSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public void computeWrapSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, boolean p5, boolean p6, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p7, com.android.internal.widget.remotecompose.core.operations.layout.measure.Size p8) {}
    protected java.lang.String getSerializedName() { return null; }
    public void internalLayoutMeasure(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
