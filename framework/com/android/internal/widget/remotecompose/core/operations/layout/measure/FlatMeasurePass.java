package com.android.internal.widget.remotecompose.core.operations.layout.measure;

public class FlatMeasurePass extends com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass {
    private int mFallbackLayoutIndex;
    private int mGeneration;
    private com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure[] mMetrics;
    public FlatMeasurePass(int p0) { super(); }
    private int getLayoutIndex(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return 0; }
    public void add(com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p0) throws java.lang.Exception {}
    public void clear() {}
    public boolean contains(int p0) { return false; }
    public com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure get(int p0) { return null; }
    public com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure get(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return null; }
    public com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure obtain(int p0, float p1, float p2, float p3, float p4, int p5) { return null; }
    public com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure obtain(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, float p1, float p2, float p3, float p4, int p5) { return null; }
    public void recycle(com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p0) {}
    public void setContext(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
}
