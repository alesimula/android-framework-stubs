package com.android.internal.widget;

public class ScrollingTabContainerView extends android.widget.HorizontalScrollView implements android.widget.AdapterView.OnItemClickListener {
    private static final int FADE_DURATION = 200;
    private static final java.lang.String TAG = "ScrollingTabContainerView";
    private static final android.animation.TimeInterpolator sAlphaInterpolator = null;
    private boolean mAllowCollapse;
    private int mContentHeight;
    int mMaxTabWidth;
    private int mSelectedTabIndex;
    int mStackedTabMaxWidth;
    private com.android.internal.widget.ScrollingTabContainerView.TabClickListener mTabClickListener;
    private android.widget.LinearLayout mTabLayout;
    java.lang.Runnable mTabSelector;
    private android.widget.Spinner mTabSpinner;
    protected final com.android.internal.widget.ScrollingTabContainerView.VisibilityAnimListener mVisAnimListener = null;
    protected android.animation.Animator mVisibilityAnim;
    public ScrollingTabContainerView(android.content.Context p0) { super((android.content.Context)null); }
    private android.widget.Spinner createSpinner() { return null; }
    private android.widget.LinearLayout createTabLayout() { return null; }
    private com.android.internal.widget.ScrollingTabContainerView.TabView createTabView(android.content.Context p0, android.app.ActionBar.Tab p1, boolean p2) { return null; }
    private boolean isCollapsed() { return false; }
    private void performCollapse() {}
    private boolean performExpand() { return false; }
    public void addTab(android.app.ActionBar.Tab p0, int p1, boolean p2) {}
    public void addTab(android.app.ActionBar.Tab p0, boolean p1) {}
    public void animateToTab(int p0) {}
    public void animateToVisibility(int p0) {}
    public void onAttachedToWindow() {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onDetachedFromWindow() {}
    public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
    public void onMeasure(int p0, int p1) {}
    public void removeAllTabs() {}
    public void removeTabAt(int p0) {}
    public void setAllowCollapse(boolean p0) {}
    public void setContentHeight(int p0) {}
    public void setTabSelected(int p0) {}
    public void updateTab(int p0) {}

    private class TabAdapter extends android.widget.BaseAdapter {
        private android.content.Context mDropDownContext;
        public TabAdapter(com.android.internal.widget.ScrollingTabContainerView p0, android.content.Context p1) { super(); }
        public int getCount() { return 0; }
        public android.view.View getDropDownView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public java.lang.Object getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public void setDropDownViewContext(android.content.Context p0) {}
    }

    private class TabClickListener implements android.view.View.OnClickListener {
        private TabClickListener(com.android.internal.widget.ScrollingTabContainerView p0) {}
        public void onClick(android.view.View p0) {}
    }

    private class TabView extends android.widget.LinearLayout {
        private android.view.View mCustomView;
        private android.widget.ImageView mIconView;
        private android.app.ActionBar.Tab mTab;
        private android.widget.TextView mTextView;
        public TabView(com.android.internal.widget.ScrollingTabContainerView p0, android.content.Context p1, android.app.ActionBar.Tab p2, boolean p3) { super((android.content.Context)null); }
        public void bindTab(android.app.ActionBar.Tab p0) {}
        public java.lang.CharSequence getAccessibilityClassName() { return null; }
        public android.app.ActionBar.Tab getTab() { return null; }
        public void onMeasure(int p0, int p1) {}
        public void setSelected(boolean p0) {}
        public void update() {}
    }

    protected class VisibilityAnimListener implements android.animation.Animator.AnimatorListener {
        private boolean mCanceled;
        private int mFinalVisibility;
        protected VisibilityAnimListener(com.android.internal.widget.ScrollingTabContainerView p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
        public void onAnimationStart(android.animation.Animator p0) {}
        public com.android.internal.widget.ScrollingTabContainerView.VisibilityAnimListener withFinalVisibility(int p0) { return null; }
    }
}
