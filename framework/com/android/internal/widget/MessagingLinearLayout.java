package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class MessagingLinearLayout extends android.view.ViewGroup {
    private static final boolean TRACE_ONMEASURE = Boolean.valueOf(false);
    private boolean mIgnorePaddingTop;
    private int mMaxDisplayedLines;
    private int mSpacing;
    public MessagingLinearLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public static boolean isGone(android.view.View p0) { return false; }
    private int maybeRemoveTopPadding(int p0, com.android.internal.widget.MessagingLinearLayout.MessagingChild p1) { return 0; }
    private void trackMeasureSpecs(int p0, int p1) {}
    protected boolean drawChild(android.graphics.Canvas p0, android.view.View p1, long p2) { return false; }
    protected com.android.internal.widget.MessagingLinearLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    public com.android.internal.widget.MessagingLinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected com.android.internal.widget.MessagingLinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public int getBaseline() { return 0; }
    public com.android.internal.widget.IMessagingLayout getMessagingLayout() { return null; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    @android.view.RemotableViewMethod
    public void setMaxDisplayedLines(int p0) {}
    public void setSpacing(int p0) {}

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public boolean hide;
        public int lastVisibleHeight;
        public boolean visibleBefore;
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
    }

    public static interface MessagingChild {
        public static final int MEASURED_NORMAL = 0;
        public static final int MEASURED_SHORTENED = 1;
        public static final int MEASURED_TOO_SMALL = 2;
        public int getConsumedLines();
        default public int getExtraSpacing() { return 0; }
        public int getMeasuredType();
        default public boolean hasDifferentHeightWhenFirst() { return false; }
        public void hideAnimated();
        public boolean isHidingAnimated();
        public void recycle();
        default public void setIsFirstInLayout(boolean p0) {}
        public void setMaxDisplayedLines(int p0);
    }
}
