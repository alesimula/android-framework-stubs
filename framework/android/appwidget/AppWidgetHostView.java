package android.appwidget;

public class AppWidgetHostView extends android.widget.FrameLayout implements android.appwidget.AppWidgetHost.AppWidgetHostListener {
    private static final java.lang.String KEY_INFLATION_ID = "inflation_id";
    private static final java.lang.String KEY_JAILED_ARRAY = "jail";
    static final boolean LOGD = false;
    static final java.lang.String TAG = "AppWidgetHostView";
    static final int VIEW_MODE_CONTENT = 1;
    static final int VIEW_MODE_DEFAULT = 3;
    static final int VIEW_MODE_ERROR = 2;
    static final int VIEW_MODE_NOINIT = 0;
    int mAppWidgetId;
    private java.util.concurrent.Executor mAsyncExecutor;
    boolean mColorMappingChanged;
    private android.widget.RemoteViews.ColorResources mColorResources;
    private android.util.SizeF mCurrentSize;
    private long mDelayedRestoredInflationId;
    private android.util.SparseArray<android.os.Parcelable> mDelayedRestoredState;
    android.appwidget.AppWidgetProviderInfo mInfo;
    private android.appwidget.AppWidgetHostView.InteractionLogger mInteractionLogger;
    private android.os.CancellationSignal mLastExecutionSignal;
    private android.widget.RemoteViews mLastInflatedRemoteViews;
    private long mLastInflatedRemoteViewsId;
    private boolean mOnLightBackground;
    android.view.View mView;
    int mViewMode;
    public AppWidgetHostView(android.content.Context p0) { super((android.content.Context)null); }
    public AppWidgetHostView(android.content.Context p0, int p1, int p2) { super((android.content.Context)null); }
    public AppWidgetHostView(android.content.Context p0, android.widget.RemoteViews.InteractionHandler p1) { super((android.content.Context)null); }
    private void applyContent(android.view.View p0, boolean p1, java.lang.Exception p2) {}
    private android.util.SizeF computeSizeFromLayout(int p0, int p1, int p2, int p3) { return null; }
    private int generateId() { return 0; }
    private android.graphics.Rect getDefaultPadding() { return null; }
    public static android.graphics.Rect getDefaultPaddingForWidget(android.content.Context p0, android.content.ComponentName p1, android.graphics.Rect p2) { return null; }
    private static android.graphics.Rect getDefaultPaddingForWidget(android.content.Context p0, android.graphics.Rect p1) { return null; }
    private void handleViewError() {}
    private void inflateAsync(android.widget.RemoteViews p0) {}
    private boolean isSameColorMapping(android.util.SparseIntArray p0, android.util.SparseIntArray p1) { return false; }
    private void reapplyLastRemoteViews() {}
    private void setColorResourcesStates(android.widget.RemoteViews.ColorResources p0) {}
    protected void applyRemoteViews(android.widget.RemoteViews p0, boolean p1) {}
    public android.appwidget.AppWidgetEvent collectWidgetEvent() { return null; }
    public android.app.ActivityOptions createSharedElementActivityOptions(int[] p0, java.lang.String[] p1, android.content.Intent p2) { return null; }
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.content.Context p0, android.util.AttributeSet p1) { return null; }
    public int getAppWidgetId() { return 0; }
    public android.appwidget.AppWidgetProviderInfo getAppWidgetInfo() { return null; }
    protected android.view.View getDefaultView() { return null; }
    protected android.view.View getErrorView() { return null; }
    public android.appwidget.AppWidgetHostView.InteractionLogger getInteractionLogger() { return null; }
    protected boolean isVisibilityTrackingPermitted() { return false; }
    protected void onDefaultViewClicked(android.view.View p0) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void onUpdateProviderInfo(android.appwidget.AppWidgetProviderInfo p0) {}
    public void onViewDataChanged(int p0) {}
    public void onVisibilityAggregated(boolean p0) {}
    public void onWindowFocusChanged(boolean p0) {}
    protected void prepareView(android.view.View p0) {}
    public void resetColorResources() {}
    void restoreInstanceState() {}
    public void setAppWidget(int p0, android.appwidget.AppWidgetProviderInfo p1) {}
    public void setColorResources(android.util.SparseIntArray p0) {}
    public void setColorResources(android.widget.RemoteViews.ColorResources p0) {}
    public void setColorResourcesNoReapply(android.widget.RemoteViews.ColorResources p0) {}
    public void setExecutor(java.util.concurrent.Executor p0) {}
    public void setInteractionHandler(android.widget.RemoteViews.InteractionHandler p0) {}
    public void setOnLightBackground(boolean p0) {}
    public void startVisibilityTracking() {}
    public void stopVisibilityTracking() {}
    public void updateAppWidget(android.widget.RemoteViews p0) {}
    public void updateAppWidgetOptions(android.os.Bundle p0) {}
    @java.lang.Deprecated
    public void updateAppWidgetSize(android.os.Bundle p0, int p1, int p2, int p3, int p4) {}
    public void updateAppWidgetSize(android.os.Bundle p0, int p1, int p2, int p3, int p4, boolean p5) {}
    public void updateAppWidgetSize(android.os.Bundle p0, java.util.List<android.util.SizeF> p1) {}

    public static class AdapterChildHostView extends android.appwidget.AppWidgetHostView {
        public AdapterChildHostView(android.content.Context p0) { super((android.content.Context)null); }
        protected boolean isVisibilityTrackingPermitted() { return false; }
    }

    public class InteractionLogger implements android.widget.RemoteViews.InteractionHandler {
        private final android.appwidget.AppWidgetEvent.Builder mEvent = null;
        private android.widget.RemoteViews.InteractionHandler mInteractionHandler;
        private boolean mIsTracking;
        private boolean mIsVisible;
        InteractionLogger(android.appwidget.AppWidgetHostView p0) {}
        InteractionLogger(android.appwidget.AppWidgetHostView p0, android.widget.RemoteViews.InteractionHandler p1) {}
        private void applyScrollOffset(android.graphics.Rect p0) {}
        private android.appwidget.AppWidgetEvent collectWidgetEvent() { return null; }
        private int getMetricsId(android.view.View p0) { return 0; }
        private java.lang.String logName() { return null; }
        private void onPositionChanged() {}
        private void onTrackingChanged(boolean p0) {}
        private void onVisibilityAggregated() {}
        private void onWindowFocusChanged() {}
        private void updateVisibilityLocked(boolean p0) {}
        public android.appwidget.AppWidgetEvent getEvent() { return null; }
        public boolean onInteraction(android.view.View p0, android.app.PendingIntent p1, android.widget.RemoteViews.RemoteResponse p2) { return false; }
        public void onScroll(android.widget.AbsListView p0) {}
    }

    private static class RemoteViewsWrapper extends android.widget.RemoteViews {
        RemoteViewsWrapper(android.content.pm.ApplicationInfo p0, int p1) { super((android.os.Parcel)null); }
    }

    private class ViewApplyListener implements android.widget.RemoteViews.OnViewAppliedListener {
        private final boolean mIsReapply = false;
        private final int mLayoutId = 0;
        private final android.widget.RemoteViews mViews = null;
        ViewApplyListener(android.appwidget.AppWidgetHostView p0, android.widget.RemoteViews p1, int p2, boolean p3) {}
        public void onError(java.lang.Exception p0) {}
        public void onViewApplied(android.view.View p0) {}
    }
}
