package android.view;

public final class AccessibilityInteractionController {
    private static final boolean CONSIDER_REQUEST_PREPARERS = true;
    private static final boolean ENFORCE_NODE_TREE_CONSISTENT = false;
    private static final int FLAGS_AFFECTING_REPORTED_DATA = 896;
    private static final boolean IGNORE_REQUEST_PREPARERS = false;
    private static final java.lang.String LOG_TAG = "AccessibilityInteractionController";
    private static final long REQUEST_PREPARER_TIMEOUT_MS = 500L;
    private final android.view.accessibility.AccessibilityManager mA11yManager = null;
    private int mActiveRequestPreparerId;
    private android.view.AccessibilityInteractionController.AddNodeInfosForViewId mAddNodeInfosForViewId;
    private final android.view.AccessibilityInteractionController.PrivateHandler mHandler = null;
    private final java.lang.Object mLock = null;
    private java.util.List<android.view.AccessibilityInteractionController.MessageHolder> mMessagesWaitingForRequestPreparer;
    private final long mMyLooperThreadId = 0L;
    private final int mMyProcessId = 0;
    private int mNumActiveRequestPreparers;
    private java.util.ArrayList<android.os.Message> mPendingFindNodeByIdMessages;
    private final android.view.AccessibilityInteractionController.AccessibilityNodePrefetcher mPrefetcher = null;
    private final java.util.ArrayList<android.view.accessibility.AccessibilityNodeInfo> mTempAccessibilityNodeInfoList = null;
    private final java.util.ArrayList<android.view.View> mTempArrayList = null;
    private final android.graphics.Rect mTempRect = null;
    private final android.graphics.RectF mTempRectF = null;
    private final android.view.ViewRootImpl mViewRootImpl = null;
    public AccessibilityInteractionController(android.view.ViewRootImpl p0) {}
    private void adjustIsVisibleToUserIfNeeded(android.view.accessibility.AccessibilityNodeInfo p0, android.graphics.Region p1, android.view.MagnificationSpec p2) {}
    private void applyHostWindowMatrixIfNeeded(android.view.accessibility.AccessibilityNodeInfo p0) {}
    private void applyTransformMatrixToBoundsInParentIfNeeded(android.view.accessibility.AccessibilityNodeInfo p0, android.graphics.Matrix p1) {}
    private void associateEmbeddingHostWindowId(android.view.accessibility.AccessibilityNodeInfo p0) {}
    private void associateLeashedParentIfNeeded(android.view.accessibility.AccessibilityNodeInfo p0) {}
    private void attachAccessibilityOverlayToWindowUiThread(android.view.SurfaceControl p0, int p1, android.view.accessibility.IAccessibilityInteractionConnectionCallback p2) {}
    private void clearAccessibilityFocusUiThread() {}
    private void findAccessibilityNodeInfoByAccessibilityIdUiThread(android.os.Message p0) {}
    private void findAccessibilityNodeInfosByTextUiThread(android.os.Message p0) {}
    private void findAccessibilityNodeInfosByViewIdUiThread(android.os.Message p0) {}
    private void findFocusUiThread(android.os.Message p0) {}
    private android.view.View findViewByAccessibilityId(int p0) { return null; }
    private void focusSearchUiThread(android.os.Message p0) {}
    private android.view.AccessibilityInteractionController.SatisfiedFindAccessibilityNodeByAccessibilityIdRequest getSatisfiedRequestInPrefetch(android.view.accessibility.AccessibilityNodeInfo p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1, int p2) { return null; }
    private void getWindowSurfaceInfoUiThread(android.view.accessibility.IWindowSurfaceInfoCallback p0) {}
    private boolean handleClickableSpanActionUiThread(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
    private boolean holdOffMessageIfNeeded(android.os.Message p0, int p1, long p2) { return false; }
    private boolean isShown(android.view.View p0) { return false; }
    private boolean isVisibleToAccessibilityService(android.view.View p0) { return false; }
    private android.view.accessibility.AccessibilityNodeInfo nodeWithIdFromList(android.view.accessibility.AccessibilityNodeInfo p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1, long p2) { return null; }
    private void notifyOutsideTouchUiThread() {}
    private void performAccessibilityActionUiThread(android.os.Message p0) {}
    private android.view.accessibility.AccessibilityNodeInfo populateAccessibilityNodeInfoForView(android.view.View p0, android.os.Bundle p1, int p2) { return null; }
    private void prepareForExtraDataRequestUiThread(android.os.Message p0) {}
    private void queueMessageToHandleOncePrepared(android.os.Message p0, int p1, long p2) {}
    private void requestPreparerDoneUiThread(android.os.Message p0) {}
    private void requestPreparerTimeoutUiThread() {}
    private void resetAccessibilityFetchFlags() {}
    private void returnFindNodeResult(android.view.AccessibilityInteractionController.SatisfiedFindAccessibilityNodeByAccessibilityIdRequest p0) {}
    private void returnFindNodeResult(android.view.accessibility.AccessibilityNodeInfo p0, android.view.accessibility.IAccessibilityInteractionConnectionCallback p1, int p2) {}
    private void returnFindNodesResult(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, android.view.accessibility.IAccessibilityInteractionConnectionCallback p1, int p2) {}
    private void returnPrefetchResult(int p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1, android.view.accessibility.IAccessibilityInteractionConnectionCallback p2) {}
    private static void roundRectFToRect(android.graphics.RectF p0, android.graphics.Rect p1) {}
    private void scheduleAllMessagesWaitingForRequestPreparerLocked() {}
    private void scheduleMessage(android.os.Message p0, int p1, long p2, boolean p3) {}
    private void setAccessibilityFetchFlags(int p0) {}
    private boolean shouldApplyAppScaleAndMagnificationSpec(float p0, android.view.MagnificationSpec p1) { return false; }
    private boolean shouldBypassAdjustIsVisible() { return false; }
    private boolean shouldBypassApplyWindowMatrix() { return false; }
    private boolean shouldBypassAssociateLeashedParent() { return false; }
    private void takeScreenshotOfWindowUiThread(int p0, android.window.ScreenCaptureInternal.ScreenCaptureListener p1, android.view.accessibility.IAccessibilityInteractionConnectionCallback p2) {}
    private void transformBoundsWithScreenMatrix(android.view.accessibility.AccessibilityNodeInfo p0, float[] p1) {}
    private void updateInfoForViewPort(android.view.accessibility.AccessibilityNodeInfo p0, android.view.MagnificationSpec p1, float[] p2, android.graphics.Region p3) {}
    private void updateInfoForViewportAndReturnFindNodeResult(android.view.accessibility.AccessibilityNodeInfo p0, android.view.accessibility.IAccessibilityInteractionConnectionCallback p1, int p2, android.view.MagnificationSpec p3, float[] p4, android.graphics.Region p5) {}
    private void updateInfosForViewPort(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, android.view.MagnificationSpec p1, float[] p2, android.graphics.Region p3) {}
    private void updateInfosForViewportAndReturnFindNodeResult(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, android.view.accessibility.IAccessibilityInteractionConnectionCallback p1, int p2, android.view.MagnificationSpec p3, float[] p4, android.graphics.Region p5) {}
    public void attachAccessibilityOverlayToWindowClientThread(android.view.SurfaceControl p0, int p1, android.view.accessibility.IAccessibilityInteractionConnectionCallback p2) {}
    public void clearAccessibilityFocusClientThread() {}
    public void destroy() {}
    public void findAccessibilityNodeInfoByAccessibilityIdClientThread(long p0, android.graphics.Region p1, int p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3, int p4, int p5, long p6, android.view.MagnificationSpec p7, float[] p8, android.os.Bundle p9) {}
    public void findAccessibilityNodeInfosByTextClientThread(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
    public void findAccessibilityNodeInfosByViewIdClientThread(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
    public void findFocusClientThread(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
    public void focusSearchClientThread(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
    public android.view.View getRootView() { return null; }
    public void getWindowSurfaceInfoClientThread(android.view.accessibility.IWindowSurfaceInfoCallback p0) {}
    public void notifyOutsideTouchClientThread() {}
    public void performAccessibilityActionClientThread(long p0, int p1, android.os.Bundle p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7) {}
    public void takeScreenshotOfWindowClientThread(int p0, android.window.ScreenCaptureInternal.ScreenCaptureListener p1, android.view.accessibility.IAccessibilityInteractionConnectionCallback p2) {}

    private class AccessibilityNodePrefetcher {
        private int mFetchFlags;
        private boolean mInterruptPrefetch;
        private final java.util.ArrayList<android.view.View> mTempViewList = null;
        private AccessibilityNodePrefetcher(android.view.AccessibilityInteractionController p0) {}
        private void addChildrenOfRoot(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1, android.view.accessibility.AccessibilityNodeProvider p2, android.view.AccessibilityInteractionController.PrefetchDeque p3) {}
        private void enforceNodeTreeConsistent(android.view.accessibility.AccessibilityNodeInfo p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1) {}
        private boolean isFlagSet(int p0) { return false; }
        private void prefetchDescendantsOfRealNode(android.view.View p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1) {}
        private void prefetchDescendantsOfVirtualNode(android.view.accessibility.AccessibilityNodeInfo p0, android.view.accessibility.AccessibilityNodeProvider p1, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p2) {}
        private void prefetchPredecessorsOfRealNode(android.view.View p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1) {}
        private void prefetchPredecessorsOfVirtualNode(android.view.accessibility.AccessibilityNodeInfo p0, android.view.View p1, android.view.accessibility.AccessibilityNodeProvider p2, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p3) {}
        private void prefetchSiblingsOfRealNode(android.view.View p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1, boolean p2) {}
        private void prefetchSiblingsOfVirtualNode(android.view.accessibility.AccessibilityNodeInfo p0, android.view.View p1, android.view.accessibility.AccessibilityNodeProvider p2, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p3, boolean p4) {}
        public void prefetchAccessibilityNodeInfos(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p2) {}
        public boolean shouldStopPrefetching(java.util.List p0) { return false; }
    }

    private final class AddNodeInfosForViewId implements java.util.function.Predicate<android.view.View> {
        private java.util.List<android.view.accessibility.AccessibilityNodeInfo> mInfos;
        private int mViewId;
        private AddNodeInfosForViewId(android.view.AccessibilityInteractionController p0) {}
        public void init(int p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1) {}
        public void reset() {}
        public boolean test(android.view.View p0) { return false; }
    }

    static interface DequeNode {
        public void addChildren(android.view.accessibility.AccessibilityNodeInfo p0, android.view.AccessibilityInteractionController.PrefetchDeque p1);
        public android.view.accessibility.AccessibilityNodeInfo getA11yNodeInfo();
    }

    private static final class MessageHolder {
        final int mInterrogatingPid = 0;
        final long mInterrogatingTid = 0L;
        final android.os.Message mMessage = null;
        MessageHolder(android.os.Message p0, int p1, long p2) {}
    }

    private class PrefetchDeque<E extends android.view.AccessibilityInteractionController.DequeNode> extends java.util.ArrayDeque<E> {
        java.util.List<android.view.accessibility.AccessibilityNodeInfo> mPrefetchOutput;
        int mStrategy;
        PrefetchDeque(int p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1) { super(); }
        E getNext() { return null; }
        boolean isStack() { return false; }
        void performTraversalAndPrefetch() {}
    }

    private class PrivateHandler extends android.os.Handler {
        private static final int FIRST_NO_ACCESSIBILITY_CALLBACK_MSG = 100;
        private static final int MSG_APP_PREPARATION_FINISHED = 8;
        private static final int MSG_APP_PREPARATION_TIMEOUT = 9;
        private static final int MSG_CLEAR_ACCESSIBILITY_FOCUS = 101;
        private static final int MSG_FIND_ACCESSIBILITY_NODE_INFOS_BY_VIEW_ID = 3;
        private static final int MSG_FIND_ACCESSIBILITY_NODE_INFO_BY_ACCESSIBILITY_ID = 2;
        private static final int MSG_FIND_ACCESSIBILITY_NODE_INFO_BY_TEXT = 4;
        private static final int MSG_FIND_FOCUS = 5;
        private static final int MSG_FOCUS_SEARCH = 6;
        private static final int MSG_NOTIFY_OUTSIDE_TOUCH = 102;
        private static final int MSG_PERFORM_ACCESSIBILITY_ACTION = 1;
        private static final int MSG_PREPARE_FOR_EXTRA_DATA_REQUEST = 7;
        public PrivateHandler(android.view.AccessibilityInteractionController p0, android.os.Looper p1) { super(); }
        public java.lang.String getMessageName(android.os.Message p0) { return null; }
        public void handleMessage(android.os.Message p0) {}
        boolean hasAccessibilityCallback(android.os.Message p0) { return false; }
        boolean hasUserInteractiveMessagesWaiting() { return false; }
    }

    private static class SatisfiedFindAccessibilityNodeByAccessibilityIdRequest {
        final android.view.accessibility.IAccessibilityInteractionConnectionCallback mSatisfiedRequestCallback = null;
        final int mSatisfiedRequestInteractionId = 0;
        final android.view.accessibility.AccessibilityNodeInfo mSatisfiedRequestNode = null;
        SatisfiedFindAccessibilityNodeByAccessibilityIdRequest(android.view.accessibility.AccessibilityNodeInfo p0, android.view.accessibility.IAccessibilityInteractionConnectionCallback p1, int p2) {}
    }

    private class ViewNode implements android.view.AccessibilityInteractionController.DequeNode {
        private final java.util.ArrayList<android.view.View> mTempViewList = null;
        android.view.View mView;
        ViewNode(android.view.AccessibilityInteractionController p0, android.view.View p1) {}
        private void addChild(java.util.ArrayDeque p0, android.view.View p1) {}
        public void addChildren(android.view.accessibility.AccessibilityNodeInfo p0, android.view.AccessibilityInteractionController.PrefetchDeque p1) {}
        public android.view.accessibility.AccessibilityNodeInfo getA11yNodeInfo() { return null; }
    }

    private class VirtualNode implements android.view.AccessibilityInteractionController.DequeNode {
        long mInfoId;
        android.view.accessibility.AccessibilityNodeProvider mProvider;
        VirtualNode(android.view.AccessibilityInteractionController p0, long p1, android.view.accessibility.AccessibilityNodeProvider p2) {}
        public void addChildren(android.view.accessibility.AccessibilityNodeInfo p0, android.view.AccessibilityInteractionController.PrefetchDeque p1) {}
        public android.view.accessibility.AccessibilityNodeInfo getA11yNodeInfo() { return null; }
    }
}
