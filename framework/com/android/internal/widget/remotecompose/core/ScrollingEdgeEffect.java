package com.android.internal.widget.remotecompose.core;

public interface ScrollingEdgeEffect {
    public static final int BOTTOM = 1;
    public static final int LEFT = 2;
    public static final int POST_DRAW = 1;
    public static final int PRE_DRAW = 0;
    public static final int RIGHT = 3;
    public static final int TOP = 0;
    public void apply(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, float p2, int p3);
    public void pull(float p0, float p1);
    public void release();
    public void reset();
    public void setSize(float p0, float p1);
}
