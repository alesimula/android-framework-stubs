package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class NotificationActionListLayout extends android.widget.LinearLayout {
    public static final java.util.Comparator<com.android.internal.widget.NotificationActionListLayout.TextViewInfo> MEASURE_ORDER_COMPARATOR = null;
    private static final java.lang.String TAG = "NotificationActionListLayout";
    private int mCollapsibleIndentDimen;
    private boolean mEvenlyDividedMode;
    private int mExtraStartPadding;
    private final int mGravity = 0;
    private java.util.ArrayList<android.view.View> mMeasureOrderOther;
    private java.util.ArrayList<com.android.internal.widget.NotificationActionListLayout.TextViewInfo> mMeasureOrderTextViews;
    int mNumNotGoneChildren;
    int mNumPriorityChildren;
    private int mTotalWidth;
    public NotificationActionListLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationActionListLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationActionListLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void clearMeasureOrder() {}
    private void countAndRebuildMeasureOrder() {}
    private static boolean isPriority(android.view.View p0) { return false; }
    private int measureAndGetUsedWidth(int p0, int p1, int p2, boolean p3) { return 0; }
    private int measureAndReturnEvenlyDividedWidth(int p0, int p1) { return 0; }
    private void rebuildMeasureOrder(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public void onViewAdded(android.view.View p0) {}
    public void onViewRemoved(android.view.View p0) {}
    @android.view.RemotableViewMethod
    public void setEvenlyDividedMode(boolean p0) {}

    private static final class TextViewInfo {
        final boolean mIsPriority = false;
        final int mTextLength = 0;
        final android.widget.TextView mTextView = null;
        TextViewInfo(android.widget.TextView p0) {}
        boolean needsRebuild() { return false; }
    }
}
