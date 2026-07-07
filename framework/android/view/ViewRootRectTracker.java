package android.view;

public class ViewRootRectTracker {
    private final java.util.function.Function<android.view.View, java.util.List<android.graphics.Rect>> mRectCollector = null;
    private java.util.List<android.graphics.Rect> mRects;
    private java.util.List<android.graphics.Rect> mRootRects;
    private boolean mRootRectsChanged;
    private java.util.List<android.view.ViewRootRectTracker.ViewInfo> mViewInfos;
    private boolean mViewsChanged;
    private boolean mWaitingForComputeChanges;
    public ViewRootRectTracker(java.util.function.Function<android.view.View, java.util.List<android.graphics.Rect>> p0) {}
    private java.util.List<android.graphics.Rect> getTrackedRectsForView(android.view.View p0) { return null; }
    public java.util.List<android.graphics.Rect> computeChangedRects() { return null; }
    public boolean computeChanges() { return false; }
    public java.util.List<android.graphics.Rect> getLastComputedRects() { return null; }
    public java.util.List<android.graphics.Rect> getRootRects() { return null; }
    public boolean isWaitingForComputeChanges() { return false; }
    public void setRootRects(java.util.List<android.graphics.Rect> p0) {}
    public void updateRectsForView(android.view.View p0) {}

    private class ViewInfo {
        public static final int CHANGED = 0;
        public static final int GONE = 2;
        public static final int UNCHANGED = 1;
        boolean mDirty;
        java.util.List<android.graphics.Rect> mRects;
        private final java.lang.ref.WeakReference<android.view.View> mView = null;
        ViewInfo(android.view.ViewRootRectTracker p0, android.view.View p1) {}
        public android.view.View getView() { return null; }
        public int update() { return 0; }
    }
}
