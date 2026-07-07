package android.view.accessibility;

public class AccessibilityCache {
    public static final int CACHE_CRITICAL_EVENTS_MASK = 4307005;
    private static final boolean CHECK_INTEGRITY = Boolean.valueOf(false);
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final java.lang.String LOG_TAG = "AccessibilityCache";
    private static final boolean VERBOSE = Boolean.valueOf(false);
    private long mAccessibilityFocus;
    private int mAccessibilityFocusedWindow;
    private final android.view.accessibility.AccessibilityCache.AccessibilityNodeRefresher mAccessibilityNodeRefresher = null;
    private boolean mEnabled;
    private long mInputFocus;
    private int mInputFocusWindow;
    private boolean mIsAllWindowsCached;
    private final java.lang.Object mLock = null;
    private final android.util.SparseArray<android.util.LongSparseArray<android.view.accessibility.AccessibilityNodeInfo>> mNodeCache = null;
    private android.view.accessibility.AccessibilityCache.OnNodeAddedListener mOnNodeAddedListener;
    private final android.util.SparseArray<android.view.accessibility.AccessibilityWindowInfo> mTempWindowArray = null;
    private long mValidWindowCacheTimeStamp;
    private final android.util.SparseArray<android.util.SparseArray<android.view.accessibility.AccessibilityWindowInfo>> mWindowCacheByDisplay = null;
    private final android.util.SparseArray<java.lang.String> mWindowIdToEventSourceClassName = null;
    public AccessibilityCache(android.view.accessibility.AccessibilityCache.AccessibilityNodeRefresher p0) {}
    private void addWindowByDisplayLocked(int p0, android.view.accessibility.AccessibilityWindowInfo p1) {}
    private void clearNodesForWindowLocked(int p0) {}
    private void clearSubTreeLocked(int p0, long p1) {}
    private boolean clearSubTreeRecursiveLocked(android.util.LongSparseArray<android.view.accessibility.AccessibilityNodeInfo> p0, long p1) { return false; }
    private void clearWindowCacheLocked() {}
    private boolean isCachedNodeOrDescendantLocked(long p0, long p1, android.util.LongSparseArray<android.view.accessibility.AccessibilityNodeInfo> p2) { return false; }
    private android.view.accessibility.AccessibilityNodeInfo removeCachedNodeLocked(int p0, long p1) { return null; }
    public void add(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void addWindow(android.view.accessibility.AccessibilityWindowInfo p0) {}
    public void checkIntegrity() {}
    public void clear() {}
    public void clearOnNodeAddedListener() {}
    public boolean clearSubTree(android.view.accessibility.AccessibilityNodeInfo p0) { return false; }
    public java.lang.String getEventSourceClassName(int p0) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getFocus(int p0, long p1, int p2) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getNode(int p0, long p1) { return null; }
    public android.view.accessibility.AccessibilityWindowInfo getWindow(int p0) { return null; }
    public android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityWindowInfo>> getWindowsOnAllDisplays() { return null; }
    public boolean isEnabled() { return false; }
    public boolean isNodeInCache(android.view.accessibility.AccessibilityNodeInfo p0) { return false; }
    public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public void registerOnNodeAddedListener(android.view.accessibility.AccessibilityCache.OnNodeAddedListener p0) {}
    public void setEnabled(boolean p0) {}
    public void setWindowsOnAllDisplays(android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityWindowInfo>> p0, long p1) {}

    public static class AccessibilityNodeRefresher {
        public AccessibilityNodeRefresher() {}
        public boolean refreshNode(android.view.accessibility.AccessibilityNodeInfo p0, boolean p1) { return false; }
        public boolean refreshWindow(android.view.accessibility.AccessibilityWindowInfo p0) { return false; }
    }

    public static interface OnNodeAddedListener {
        public void onNodeAdded(android.view.accessibility.AccessibilityNodeInfo p0);
    }
}
