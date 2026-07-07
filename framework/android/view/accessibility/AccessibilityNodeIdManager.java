package android.view.accessibility;

public final class AccessibilityNodeIdManager {
    private static android.view.accessibility.AccessibilityNodeIdManager sIdManager;
    private android.view.accessibility.WeakSparseArray<android.view.View> mIdsToViews;
    private AccessibilityNodeIdManager() {}
    public static android.view.accessibility.AccessibilityNodeIdManager getInstance() { return null; }
    public android.view.View findView(int p0) { return null; }
    public void registerViewWithId(android.view.View p0, int p1) {}
    public void unregisterViewWithId(int p0) {}
}
