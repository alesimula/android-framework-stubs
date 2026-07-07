package com.android.internal.app;

public class ChooserGridLayoutManager extends com.android.internal.widget.GridLayoutManager {
    private java.lang.CharSequence mAllAppListGroupTitle;
    private com.android.internal.widget.RecyclerView mRecyclerView;
    private java.lang.CharSequence mShortcutGroupTitle;
    private java.lang.CharSequence mSuggestedAppsGroupTitle;
    private boolean mVerticalScrollEnabled;
    public ChooserGridLayoutManager(android.content.Context p0, int p1) { super((android.content.Context)null, 0); }
    public ChooserGridLayoutManager(android.content.Context p0, int p1, int p2, boolean p3) { super((android.content.Context)null, 0); }
    public ChooserGridLayoutManager(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null, 0); }
    private android.view.accessibility.AccessibilityNodeInfo.CollectionInfo createShortcutsA11yCollectionInfo(android.view.ViewGroup p0) { return null; }
    private android.view.accessibility.AccessibilityNodeInfo.CollectionInfo createSuggestedAppsA11yCollectionInfo(android.view.ViewGroup p0) { return null; }
    private void readGroupTitles(android.content.Context p0) {}
    public boolean canScrollVertically() { return false; }
    public int getRowCountForAccessibility(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return 0; }
    public boolean isLayoutHierarchical(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return false; }
    public void onAttachedToWindow(com.android.internal.widget.RecyclerView p0) {}
    public void onDetachedFromWindow(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
    public void onInitializeAccessibilityNodeInfo(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, android.view.accessibility.AccessibilityNodeInfo p2) {}
    public void onInitializeAccessibilityNodeInfoForItem(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, android.view.View p2, android.view.accessibility.AccessibilityNodeInfo p3) {}
    void setVerticalScrollEnabled(boolean p0) {}
}
