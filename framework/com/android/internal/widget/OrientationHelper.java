package com.android.internal.widget;

public abstract class OrientationHelper {
    public static final int HORIZONTAL = 0;
    private static final int INVALID_SIZE = -2147483648;
    public static final int VERTICAL = 1;
    private int mLastTotalSpace;
    protected final com.android.internal.widget.RecyclerView.LayoutManager mLayoutManager = null;
    final android.graphics.Rect mTmpRect = null;
    private OrientationHelper(com.android.internal.widget.RecyclerView.LayoutManager p0) {}
    public static com.android.internal.widget.OrientationHelper createHorizontalHelper(com.android.internal.widget.RecyclerView.LayoutManager p0) { return null; }
    public static com.android.internal.widget.OrientationHelper createOrientationHelper(com.android.internal.widget.RecyclerView.LayoutManager p0, int p1) { return null; }
    public static com.android.internal.widget.OrientationHelper createVerticalHelper(com.android.internal.widget.RecyclerView.LayoutManager p0) { return null; }
    public abstract int getDecoratedEnd(android.view.View p0);
    public abstract int getDecoratedMeasurement(android.view.View p0);
    public abstract int getDecoratedMeasurementInOther(android.view.View p0);
    public abstract int getDecoratedStart(android.view.View p0);
    public abstract int getEnd();
    public abstract int getEndAfterPadding();
    public abstract int getEndPadding();
    public abstract int getMode();
    public abstract int getModeInOther();
    public abstract int getStartAfterPadding();
    public abstract int getTotalSpace();
    public int getTotalSpaceChange() { return 0; }
    public abstract int getTransformedEndWithDecoration(android.view.View p0);
    public abstract int getTransformedStartWithDecoration(android.view.View p0);
    public abstract void offsetChild(android.view.View p0, int p1);
    public abstract void offsetChildren(int p0);
    public void onLayoutComplete() {}
}
