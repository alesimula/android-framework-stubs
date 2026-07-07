package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class SingleMetricNotificationFrameLayout extends android.widget.FrameLayout {
    private android.view.View mMetricLabelContainer;
    private android.view.View mMetricValueContainer;
    private float mValueContainerMaxFraction;
    public SingleMetricNotificationFrameLayout(android.content.Context p0) { super((android.content.Context)null); }
    public SingleMetricNotificationFrameLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SingleMetricNotificationFrameLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SingleMetricNotificationFrameLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private int getLabelContainerMarginEnd() { return 0; }
    private void init() {}
    protected void adjustEndMarginBeforeOnMeasure(int p0) {}
    protected android.view.View getMetricLabelContainer() { return null; }
    protected android.view.View getMetricValueContainer() { return null; }
    protected float getMetricValueMaxFraction() { return 0.0f; }
    protected void measureChildWithMargins(android.view.View p0, int p1, int p2, int p3, int p4) {}
    protected void onFinishInflate() {}
    protected void onMeasure(int p0, int p1) {}
}
