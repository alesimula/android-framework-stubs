package com.android.internal.widget;

public abstract class ExploreByTouchHelper extends android.view.View.AccessibilityDelegate {
    private static final java.lang.String DEFAULT_CLASS_NAME = null;
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = -2147483648;
    private static final android.graphics.Rect INVALID_PARENT_BOUNDS = null;
    private final android.content.Context mContext = null;
    private int mFocusedVirtualViewId;
    private int mHoveredVirtualViewId;
    private final android.view.accessibility.AccessibilityManager mManager = null;
    private com.android.internal.widget.ExploreByTouchHelper.ExploreByTouchNodeProvider mNodeProvider;
    private android.util.IntArray mTempArray;
    private int[] mTempGlobalRect;
    private android.graphics.Rect mTempParentRect;
    private android.graphics.Rect mTempScreenRect;
    private android.graphics.Rect mTempVisibleRect;
    private final android.view.View mView = null;
    public ExploreByTouchHelper(android.view.View p0) { super(); }
    private boolean clearAccessibilityFocus(int p0) { return false; }
    private android.view.accessibility.AccessibilityEvent createEvent(int p0, int p1) { return null; }
    private android.view.accessibility.AccessibilityEvent createEventForChild(int p0, int p1) { return null; }
    private android.view.accessibility.AccessibilityEvent createEventForHost(int p0) { return null; }
    private android.view.accessibility.AccessibilityNodeInfo createNode(int p0) { return null; }
    private android.view.accessibility.AccessibilityNodeInfo createNodeForChild(int p0) { return null; }
    private android.view.accessibility.AccessibilityNodeInfo createNodeForHost() { return null; }
    private void ensureTempRects() {}
    private boolean intersectVisibleToUser(android.graphics.Rect p0) { return false; }
    private boolean isAccessibilityFocused(int p0) { return false; }
    private boolean manageFocusForChild(int p0, int p1) { return false; }
    private boolean performAction(int p0, int p1, android.os.Bundle p2) { return false; }
    private boolean performActionForChild(int p0, int p1, android.os.Bundle p2) { return false; }
    private boolean performActionForHost(int p0, android.os.Bundle p1) { return false; }
    private boolean requestAccessibilityFocus(int p0) { return false; }
    private void updateHoveredVirtualView(int p0) {}
    public boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View p0) { return null; }
    public int getFocusedVirtualView() { return 0; }
    protected abstract int getVirtualViewAt(float p0, float p1);
    protected abstract void getVisibleVirtualViews(android.util.IntArray p0);
    public void invalidateRoot() {}
    public void invalidateVirtualView(int p0) {}
    public void invalidateVirtualView(int p0, int p1) {}
    protected abstract boolean onPerformActionForVirtualView(int p0, int p1, android.os.Bundle p2);
    protected void onPopulateEventForHost(android.view.accessibility.AccessibilityEvent p0) {}
    protected abstract void onPopulateEventForVirtualView(int p0, android.view.accessibility.AccessibilityEvent p1);
    protected void onPopulateNodeForHost(android.view.accessibility.AccessibilityNodeInfo p0) {}
    protected abstract void onPopulateNodeForVirtualView(int p0, android.view.accessibility.AccessibilityNodeInfo p1);
    public boolean sendEventForVirtualView(int p0, int p1) { return false; }

    private class ExploreByTouchNodeProvider extends android.view.accessibility.AccessibilityNodeProvider {
        private ExploreByTouchNodeProvider(com.android.internal.widget.ExploreByTouchHelper p0) { super(); }
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int p0) { return null; }
        public boolean performAction(int p0, int p1, android.os.Bundle p2) { return false; }
    }
}
