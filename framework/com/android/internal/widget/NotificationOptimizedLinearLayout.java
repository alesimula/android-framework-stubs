package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class NotificationOptimizedLinearLayout extends android.widget.LinearLayout {
    private static final boolean DEBUG_LAYOUT = false;
    private static final java.lang.String TAG = "NotifOptimizedLinearLayout";
    private static final boolean TRACE_ONMEASURE = Boolean.valueOf(false);
    private boolean mShouldUseOptimizedLayout;
    public NotificationOptimizedLinearLayout(android.content.Context p0) { super((android.content.Context)null); }
    public NotificationOptimizedLinearLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationOptimizedLinearLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationOptimizedLinearLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private java.util.List<android.view.View> getActiveChildren() { return null; }
    private int getDividerHeight() { return 0; }
    private android.view.View getSingleWeightedChild() { return null; }
    private boolean isOptimizationPossible(int p0, int p1) { return false; }
    private void layoutVerticalOptimized(int p0, int p1, int p2, int p3) {}
    private void logSkipOptimizedOnMeasure(java.lang.String p0) {}
    private void measureVerticalOptimized(android.view.View p0, int p1, int p2) {}
    private void onLayoutOptimized(boolean p0, int p1, int p2, int p3, int p4) {}
    private void onMeasureOptimized(android.view.View p0, int p1, int p2) {}
    private boolean requiresBaselineAlignmentForHorizontalLinearLayout() { return false; }
    private boolean requiresMatchParentRemeasureForVerticalLinearLayout(int p0) { return false; }
    private boolean requiresNegativeMarginHandlingForHorizontalLinearLayout() { return false; }
    private void trackShouldUseOptimizedLayout() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
}
