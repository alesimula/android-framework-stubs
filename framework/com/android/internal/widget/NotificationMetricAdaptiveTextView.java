package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class NotificationMetricAdaptiveTextView extends com.android.internal.widget.NotificationMetricTextView {
    private static final int VARIANT_NONE = -1;
    private final com.android.internal.widget.NotificationMetricAdaptiveTextHelper mHelper = null;
    private boolean mReplacingText;
    private java.util.List<java.lang.CharSequence> mTextVariants;
    private int mVariantIndex;
    public NotificationMetricAdaptiveTextView(android.content.Context p0) { super((android.content.Context)null); }
    public NotificationMetricAdaptiveTextView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationMetricAdaptiveTextView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationMetricAdaptiveTextView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void replaceTextBy(int p0) {}
    protected void onMeasure(int p0, int p1) {}
    public void setText(java.lang.CharSequence p0, android.widget.TextView.BufferType p1) {}
    @android.view.RemotableViewMethod(asyncImpl="setTextVariantsAsync")
    public void setTextVariants(java.util.List<java.lang.CharSequence> p0) {}
    public java.lang.Runnable setTextVariantsAsync(java.util.List<java.lang.CharSequence> p0) { return null; }
}
