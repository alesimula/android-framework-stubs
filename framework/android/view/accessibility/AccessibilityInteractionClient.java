package android.view.accessibility;

public final class AccessibilityInteractionClient extends android.view.accessibility.IAccessibilityInteractionConnectionCallback.Stub {
    public static final java.lang.String CALL_STACK = "call_stack";
    private static final boolean CHECK_INTEGRITY = true;
    private static final boolean DEBUG = false;
    private static final long DISABLE_PREFETCHING_FOR_SCROLLING_MILLIS = Long.valueOf(0L);
    public static final java.lang.String IGNORE_CALL_STACK = "ignore_call_stack";
    private static final java.lang.String LOG_TAG = "AccessibilityInteractionClient";
    public static final int NO_ID = -1;
    private static final long TIMEOUT_INTERACTION_MILLIS = 5000L;
    private static android.util.SparseArray<android.view.accessibility.AccessibilityCache> sCaches;
    private static final android.util.LongSparseArray<android.view.accessibility.AccessibilityInteractionClient> sClients = null;
    private static final android.util.SparseArray<android.accessibilityservice.IAccessibilityServiceConnection> sConnectionCache = null;
    private static int sDirectConnectionCount;
    private static int sDirectConnectionIdCounter;
    private static final android.util.SparseLongArray sScrollingWindows = null;
    private static final java.lang.Object sStaticLock = null;
    private final android.view.accessibility.AccessibilityManager mAccessibilityManager = null;
    private final android.util.SparseArray<android.view.accessibility.AccessibilityInteractionClient.InteractionState> mActiveInteractions = null;
    private final java.lang.Object mInstanceLock = null;
    private final java.util.concurrent.atomic.AtomicInteger mInteractionIdCounter = null;
    private android.os.Handler mMainHandler;
    private android.view.accessibility.AccessibilityInteractionClient.InteractionState mPrefetchInteraction;
    private android.os.Message mSameThreadMessage;
    private final android.util.SparseArray<android.util.Pair<java.util.concurrent.Executor, android.accessibilityservice.AccessibilityService.TakeScreenshotCallback>> mTakeScreenshotOfWindowCallbacks = null;
    private AccessibilityInteractionClient() { super(); }
    private AccessibilityInteractionClient(android.content.Context p0) { super(); }
    public static void addConnection(int p0, android.accessibilityservice.IAccessibilityServiceConnection p1, boolean p2) {}
    public static int addDirectConnection(android.view.accessibility.IAccessibilityInteractionConnection p0, android.view.accessibility.AccessibilityManager p1) { return 0; }
    private void checkFindAccessibilityNodeInfoResultIntegrity(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0) {}
    private void clearInteraction(int p0) {}
    private void clearInteraction(android.view.accessibility.AccessibilityInteractionClient.InteractionState p0) {}
    private void deleteScrollingWindow(int p0) {}
    private void finalizeAndCacheAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0, int p1, boolean p2, java.lang.String[] p3) {}
    private void finalizeAndCacheAccessibilityNodeInfos(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, int p1, boolean p2, java.lang.String[] p3) {}
    public static android.view.accessibility.AccessibilityCache getCache(int p0) { return null; }
    public static android.accessibilityservice.IAccessibilityServiceConnection getConnection(int p0) { return null; }
    private android.view.accessibility.AccessibilityNodeInfo getFindAccessibilityNodeInfoResultAndClear(android.view.accessibility.AccessibilityInteractionClient.InteractionState p0, boolean p1) { return null; }
    private java.util.List<android.view.accessibility.AccessibilityNodeInfo> getFindAccessibilityNodeInfosResultAndClear(android.view.accessibility.AccessibilityInteractionClient.InteractionState p0) { return null; }
    public static android.view.accessibility.AccessibilityInteractionClient getInstance() { return null; }
    public static android.view.accessibility.AccessibilityInteractionClient getInstance(android.content.Context p0) { return null; }
    public static android.view.accessibility.AccessibilityInteractionClient getInstanceForThread(long p0) { return null; }
    public static android.view.accessibility.AccessibilityInteractionClient getInstanceForThread(long p0, android.content.Context p1) { return null; }
    private boolean getPerformAccessibilityActionResultAndClear(android.view.accessibility.AccessibilityInteractionClient.InteractionState p0) { return false; }
    private android.os.Message getSameProcessMessageAndClear() { return null; }
    public static boolean hasAnyDirectConnection() { return false; }
    private static java.lang.String idToString(int p0, long p1) { return null; }
    private boolean isCurrentPrefetchInteractionOlderLocked(int p0) { return false; }
    private boolean isWindowScrolling(int p0) { return false; }
    private void logTrace(android.accessibilityservice.IAccessibilityServiceConnection p0, java.lang.String p1, java.lang.String p2, int p3, java.util.List<java.lang.StackTraceElement> p4, java.util.HashSet<java.lang.String> p5, long p6) {}
    private void logTraceCallback(android.view.accessibility.AccessibilityInteractionClient.InteractionState p0, java.lang.String p1) {}
    private void logTraceClient(android.accessibilityservice.IAccessibilityServiceConnection p0, java.lang.String p1, java.lang.String p2) {}
    private void processPrefetchAccessibilityNodeInfoResult(android.view.accessibility.AccessibilityInteractionClient.InteractionState p0) {}
    public static void removeConnection(int p0) {}
    private void sendWindowScreenshotSuccess(android.window.ScreenCaptureInternal.ScreenshotHardwareBuffer p0, int p1) {}
    public static void setCache(int p0, android.view.accessibility.AccessibilityCache p1) {}
    private boolean shouldTraceCallback() { return false; }
    private boolean shouldTraceClient() { return false; }
    private android.view.accessibility.AccessibilityInteractionClient.InteractionState startNewInteraction(int p0, android.accessibilityservice.IAccessibilityServiceConnection p1, java.lang.String p2, boolean p3) { return null; }
    private void updateScrollingWindow(int p0, long p1) {}
    private boolean waitForResultTimedLocked(int p0) { return false; }
    public void attachAccessibilityOverlayToDisplay(int p0, int p1, android.view.SurfaceControl p2, java.util.concurrent.Executor p3, java.util.function.IntConsumer p4) {}
    public void attachAccessibilityOverlayToWindow(int p0, int p1, android.view.SurfaceControl p2, java.util.concurrent.Executor p3, java.util.function.IntConsumer p4) {}
    public void clearCache(int p0) {}
    public android.view.accessibility.AccessibilityNodeInfo findAccessibilityNodeInfoByAccessibilityId(int p0, int p1, long p2, boolean p3, int p4, android.os.Bundle p5) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo findAccessibilityNodeInfoByAccessibilityId(int p0, android.os.IBinder p1, long p2, boolean p3, int p4, android.os.Bundle p5) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(int p0, int p1, long p2, java.lang.String p3) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId(int p0, int p1, long p2, java.lang.String p3) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int p0, int p1, long p2, int p3) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo focusSearch(int p0, int p1, long p2, int p3) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow(int p0, int p1) { return null; }
    public android.view.accessibility.AccessibilityWindowInfo getWindow(int p0, int p1) { return null; }
    public android.view.accessibility.AccessibilityWindowInfo getWindow(int p0, int p1, boolean p2) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindows(int p0) { return null; }
    public android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityWindowInfo>> getWindowsOnAllDisplays(int p0) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindowsOnDisplay(int p0, int p1) { return null; }
    public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, int p1) {}
    public boolean performAccessibilityAction(int p0, int p1, long p2, int p3, android.os.Bundle p4) { return false; }
    public void sendAttachOverlayResult(int p0, int p1) {}
    public void sendTakeScreenshotOfWindowError(int p0, int p1) {}
    public void setFindAccessibilityNodeInfoResult(android.view.accessibility.AccessibilityNodeInfo p0, int p1) {}
    public void setFindAccessibilityNodeInfosResult(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, int p1) {}
    public void setPerformAccessibilityActionResult(boolean p0, int p1) {}
    public void setPrefetchAccessibilityNodeInfoResult(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, int p1) {}
    public void setSameThreadMessage(android.os.Message p0) {}
    public void takeScreenshotOfWindow(int p0, int p1, java.util.concurrent.Executor p2, android.accessibilityservice.AccessibilityService.TakeScreenshotCallback p3) {}

    private static class InteractionState {
        android.util.Pair<java.util.concurrent.Executor, java.util.function.IntConsumer> mAttachA11yOverlayCallback;
        final boolean mBypassCache = false;
        java.util.List<java.lang.StackTraceElement> mCallStackOfCallback;
        int mCallingUid;
        final android.accessibilityservice.IAccessibilityServiceConnection mConnection = null;
        final int mConnectionId = 0;
        android.view.accessibility.AccessibilityNodeInfo mFindA11yNodeInfoResult;
        java.util.List<android.view.accessibility.AccessibilityNodeInfo> mFindA11yNodeInfosResult;
        final int mInteractionId = 0;
        boolean mIsCompleted;
        final java.lang.String mLoggingMethod = null;
        java.lang.String[] mPackageNames;
        boolean mPerformA11yActionResult;
        java.util.List<android.view.accessibility.AccessibilityNodeInfo> mPrefetchResult;
        android.util.Pair<java.util.concurrent.Executor, android.accessibilityservice.AccessibilityService.TakeScreenshotCallback> mTakeScreenshotCallback;
        InteractionState(int p0, int p1, android.accessibilityservice.IAccessibilityServiceConnection p2, java.lang.String p3, boolean p4) {}
        void configureForFindAccessibilityNodeInfoResult(java.lang.String[] p0) {}
    }
}
