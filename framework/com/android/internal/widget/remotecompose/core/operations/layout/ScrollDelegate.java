package com.android.internal.widget.remotecompose.core.operations.layout;

public interface ScrollDelegate {
    public void applyEdgeEffect(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, int p2);
    public float contentHeight();
    public float contentWidth();
    public float getScrollX(float p0);
    public float getScrollY(float p0);
    public boolean handlesHorizontalScroll();
    public boolean handlesVerticalScroll();
    public void reset();
}
