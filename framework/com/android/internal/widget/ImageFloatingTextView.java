package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class ImageFloatingTextView extends android.widget.TextView {
    private static final boolean TRACE_ONMEASURE = Boolean.valueOf(false);
    private boolean mHasImage;
    private int mImageEndMargin;
    private int mIndentLines;
    private int mLayoutMaxLines;
    private final int mMaxLineUpperLimit = 0;
    private int mMaxLinesForHeight;
    private int mResolvedDirection;
    private int mStaticLayoutCreationCountInOnMeasure;
    public ImageFloatingTextView(android.content.Context p0) { super((android.content.Context)null); }
    public ImageFloatingTextView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ImageFloatingTextView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ImageFloatingTextView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void invalidateTextIfIndenting() {}
    private int isTextAPrecomputedText() { return 0; }
    private void setHasImageAndNumIndentLines(boolean p0, int p1) {}
    private void trackMaxLines() {}
    private void trackParameters() {}
    protected android.text.Layout makeSingleLayout(int p0, android.text.BoringLayout.Metrics p1, int p2, android.text.Layout.Alignment p3, boolean p4, android.text.TextUtils.TruncateAt p5, boolean p6) { return null; }
    protected void onMeasure(int p0, int p1) {}
    public void onRtlPropertiesChanged(int p0) {}
    @android.view.RemotableViewMethod
    public void setHasImage(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setImageEndMargin(int p0) {}
    @android.view.RemotableViewMethod
    public void setImageEndMarginDp(float p0) {}
    @android.view.RemotableViewMethod
    public void setNumIndentLines(int p0) {}
}
