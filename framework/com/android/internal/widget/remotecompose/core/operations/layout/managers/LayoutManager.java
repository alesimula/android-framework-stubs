package com.android.internal.widget.remotecompose.core.operations.layout.managers;

public abstract class LayoutManager extends com.android.internal.widget.remotecompose.core.operations.layout.LayoutComponent implements com.android.internal.widget.remotecompose.core.operations.layout.measure.Measurable {
    public static final int DEFAULT_MEASURE_TYPE = 3;
    public static final int DEFAULT_TOUCH_VERSION = 1;
    private static final int ENFORCE_CONSTRAINTS = 4;
    public static final int FIX_TOUCH_EVENT = 1;
    private static final int INLINE_EXPRESSION_MEASURE = 3;
    private static final int INSET_WRAP_MEASURE = 2;
    com.android.internal.widget.remotecompose.core.operations.layout.measure.Size mCachedWrapSize;
    public LayoutManager(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    private boolean hasHorizontalScroll() { return false; }
    private boolean hasVerticalScroll() { return false; }
    private void measure_v0_4_0(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    private void measure_v1_1_0(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    private void updateComponentValues(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2) {}
    public boolean applyVisibility(float p0, float p1, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p2) { return false; }
    protected boolean childrenHaveHorizontalWeights() { return false; }
    protected boolean childrenHaveVerticalWeights() { return false; }
    public void computeSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public void computeWrapSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, boolean p5, boolean p6, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p7, com.android.internal.widget.remotecompose.core.operations.layout.measure.Size p8) {}
    protected boolean hasHorizontalIntrinsicDimension() { return false; }
    protected boolean hasVerticalIntrinsicDimension() { return false; }
    public void internalLayoutMeasure(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public boolean isInFillParentMaxHeight() { return false; }
    public boolean isInFillParentMaxWidth() { return false; }
    public boolean isInHorizontalFill() { return false; }
    public boolean isInVerticalFill() { return false; }
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public void measure(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public float minIntrinsicHeight(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float minIntrinsicWidth(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public void selfLayout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
}
