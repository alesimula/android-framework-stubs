package com.android.internal.widget;

public class RecyclerViewAccessibilityDelegate extends android.view.View.AccessibilityDelegate {
    final android.view.View.AccessibilityDelegate mItemDelegate = null;
    final com.android.internal.widget.RecyclerView mRecyclerView = null;
    public RecyclerViewAccessibilityDelegate(com.android.internal.widget.RecyclerView p0) { super(); }
    public android.view.View.AccessibilityDelegate getItemDelegate() { return null; }
    public void onInitializeAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) {}
    public void onInitializeAccessibilityNodeInfo(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
    public boolean performAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
    boolean shouldIgnore() { return false; }
}
