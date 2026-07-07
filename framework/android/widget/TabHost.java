package android.widget;

@java.lang.Deprecated
public class TabHost extends android.widget.FrameLayout implements android.view.ViewTreeObserver.OnTouchModeChangeListener {
    private static final int TABWIDGET_LOCATION_BOTTOM = 3;
    private static final int TABWIDGET_LOCATION_LEFT = 0;
    private static final int TABWIDGET_LOCATION_RIGHT = 2;
    private static final int TABWIDGET_LOCATION_TOP = 1;
    protected int mCurrentTab;
    private android.view.View mCurrentView;
    protected android.app.LocalActivityManager mLocalActivityManager;
    private android.widget.TabHost.OnTabChangeListener mOnTabChangeListener;
    private android.widget.FrameLayout mTabContent;
    private android.view.View.OnKeyListener mTabKeyListener;
    private int mTabLayoutId;
    private java.util.List<android.widget.TabHost.TabSpec> mTabSpecs;
    private android.widget.TabWidget mTabWidget;
    public TabHost(android.content.Context p0) { super((android.content.Context)null); }
    public TabHost(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TabHost(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TabHost(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private int getTabWidgetLocation() { return 0; }
    private void initTabHost() {}
    private void invokeOnTabChangeListener() {}
    public void addTab(android.widget.TabHost.TabSpec p0) {}
    public void clearAllTabs() {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public void dispatchWindowFocusChanged(boolean p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public int getCurrentTab() { return 0; }
    public java.lang.String getCurrentTabTag() { return null; }
    public android.view.View getCurrentTabView() { return null; }
    public android.view.View getCurrentView() { return null; }
    public android.widget.FrameLayout getTabContentView() { return null; }
    public android.widget.TabWidget getTabWidget() { return null; }
    public android.widget.TabHost.TabSpec newTabSpec(java.lang.String p0) { return null; }
    public void onTouchModeChanged(boolean p0) {}
    public void sendAccessibilityEventInternal(int p0) {}
    public void setCurrentTab(int p0) {}
    public void setCurrentTabByTag(java.lang.String p0) {}
    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener p0) {}
    public void setup() {}
    public void setup(android.app.LocalActivityManager p0) {}

    private static interface ContentStrategy {
        public android.view.View getContentView();
        public void tabClosed();
    }

    private class FactoryContentStrategy implements android.widget.TabHost.ContentStrategy {
        private android.widget.TabHost.TabContentFactory mFactory;
        private android.view.View mTabContent;
        private final java.lang.CharSequence mTag = null;
        public FactoryContentStrategy(android.widget.TabHost p0, java.lang.CharSequence p1, android.widget.TabHost.TabContentFactory p2) {}
        public android.view.View getContentView() { return null; }
        public void tabClosed() {}
    }

    private static interface IndicatorStrategy {
        public android.view.View createIndicatorView();
    }

    private class IntentContentStrategy implements android.widget.TabHost.ContentStrategy {
        private final android.content.Intent mIntent = null;
        private android.view.View mLaunchedView;
        private final java.lang.String mTag = null;
        private IntentContentStrategy(android.widget.TabHost p0, java.lang.String p1, android.content.Intent p2) {}
        public android.view.View getContentView() { return null; }
        public void tabClosed() {}
    }

    private class LabelAndIconIndicatorStrategy implements android.widget.TabHost.IndicatorStrategy {
        private final android.graphics.drawable.Drawable mIcon = null;
        private final java.lang.CharSequence mLabel = null;
        private LabelAndIconIndicatorStrategy(android.widget.TabHost p0, java.lang.CharSequence p1, android.graphics.drawable.Drawable p2) {}
        public android.view.View createIndicatorView() { return null; }
    }

    private class LabelIndicatorStrategy implements android.widget.TabHost.IndicatorStrategy {
        private final java.lang.CharSequence mLabel = null;
        private LabelIndicatorStrategy(android.widget.TabHost p0, java.lang.CharSequence p1) {}
        public android.view.View createIndicatorView() { return null; }
    }

    public static interface OnTabChangeListener {
        public void onTabChanged(java.lang.String p0);
    }

    public static interface TabContentFactory {
        public android.view.View createTabContent(java.lang.String p0);
    }

    public class TabSpec {
        private android.widget.TabHost.ContentStrategy mContentStrategy;
        private android.widget.TabHost.IndicatorStrategy mIndicatorStrategy;
        private final java.lang.String mTag = null;
        private TabSpec(android.widget.TabHost p0, java.lang.String p1) {}
        public java.lang.String getTag() { return null; }
        public android.widget.TabHost.TabSpec setContent(int p0) { return null; }
        public android.widget.TabHost.TabSpec setContent(android.content.Intent p0) { return null; }
        public android.widget.TabHost.TabSpec setContent(android.widget.TabHost.TabContentFactory p0) { return null; }
        public android.widget.TabHost.TabSpec setIndicator(android.view.View p0) { return null; }
        public android.widget.TabHost.TabSpec setIndicator(java.lang.CharSequence p0) { return null; }
        public android.widget.TabHost.TabSpec setIndicator(java.lang.CharSequence p0, android.graphics.drawable.Drawable p1) { return null; }
    }

    private class ViewIdContentStrategy implements android.widget.TabHost.ContentStrategy {
        private final android.view.View mView = null;
        private ViewIdContentStrategy(android.widget.TabHost p0, int p1) {}
        public android.view.View getContentView() { return null; }
        public void tabClosed() {}
    }

    private class ViewIndicatorStrategy implements android.widget.TabHost.IndicatorStrategy {
        private final android.view.View mView = null;
        private ViewIndicatorStrategy(android.widget.TabHost p0, android.view.View p1) {}
        public android.view.View createIndicatorView() { return null; }
    }
}
