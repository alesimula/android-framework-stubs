package com.android.internal.widget;

public class ActionBarContextView extends com.android.internal.widget.AbsActionBarView {
    private static final java.lang.String TAG = "ActionBarContextView";
    private android.view.View mClose;
    private int mCloseItemLayout;
    private android.view.View mCustomView;
    private final int mInternalVerticalPadding = 0;
    private android.graphics.drawable.Drawable mSplitBackground;
    private java.lang.CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private android.widget.TextView mSubtitleView;
    private java.lang.CharSequence mTitle;
    private android.widget.LinearLayout mTitleLayout;
    private boolean mTitleOptional;
    private int mTitleStyleRes;
    private android.widget.TextView mTitleView;
    public ActionBarContextView(android.content.Context p0) { super((android.content.Context)null); }
    public ActionBarContextView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ActionBarContextView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ActionBarContextView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void initTitle() {}
    public void closeMode() {}
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public boolean hideOverflowMenu() { return false; }
    public void initForMode(android.view.ActionMode p0) {}
    public boolean isOverflowMenuShowing() { return false; }
    public boolean isTitleOptional() { return false; }
    public void killMode() {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onDetachedFromWindow() {}
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public void setContentHeight(int p0) {}
    public void setCustomView(android.view.View p0) {}
    public void setSplitToolbar(boolean p0) {}
    public void setSubtitle(java.lang.CharSequence p0) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public void setTitleOptional(boolean p0) {}
    public boolean shouldDelayChildPressedState() { return false; }
    public boolean showOverflowMenu() { return false; }
}
