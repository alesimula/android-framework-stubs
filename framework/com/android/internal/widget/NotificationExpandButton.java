package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class NotificationExpandButton extends android.widget.FrameLayout {
    private int mDefaultPillColor;
    private int mDefaultTextColor;
    private boolean mExpanded;
    private int mHighlightPillColor;
    private int mHighlightTextColor;
    private android.widget.ImageView mIconView;
    private int mNumber;
    private android.widget.TextView mNumberView;
    private android.graphics.drawable.Drawable mPillDrawable;
    private android.widget.LinearLayout mPillView;
    public NotificationExpandButton(android.content.Context p0) { super((android.content.Context)null); }
    public NotificationExpandButton(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationExpandButton(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationExpandButton(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private boolean shouldShowNumber() { return false; }
    private void updateColors() {}
    private void updateExpandedState() {}
    private void updateNumber() {}
    private void updatePadding() {}
    public void getBoundsOnScreen(android.graphics.Rect p0, boolean p1) {}
    public boolean hasOverlappingRendering() { return false; }
    protected void onFinishInflate() {}
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean pointInView(float p0, float p1, float p2) { return false; }
    @android.view.RemotableViewMethod
    public void setDefaultPillColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setDefaultTextColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setExpanded(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setHighlightPillColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setHighlightTextColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setNumber(int p0) {}
    @android.view.RemotableViewMethod
    public void setStartPadding(int p0) {}
}
