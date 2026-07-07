package android.app;

public final class UiAutomation {
    public static final java.util.Set<java.lang.String> ALL_PERMISSIONS = null;
    private static final int CONNECTION_ID_UNDEFINED = -1;
    private static final long CONNECT_TIMEOUT_MILLIS = 5000L;
    private static final boolean DEBUG = false;
    public static final int FLAG_DONT_SUPPRESS_ACCESSIBILITY_SERVICES = 1;
    public static final int FLAG_DONT_USE_ACCESSIBILITY = 2;
    public static final int FLAG_NOT_ACCESSIBILITY_TOOL = 4;
    private static final java.lang.String LOG_TAG = null;
    public static final int ROTATION_FREEZE_0 = 0;
    public static final int ROTATION_FREEZE_180 = 2;
    public static final int ROTATION_FREEZE_270 = 3;
    public static final int ROTATION_FREEZE_90 = 1;
    public static final int ROTATION_FREEZE_CURRENT = -1;
    public static final int ROTATION_UNFREEZE = -2;
    private static final boolean VERBOSE = false;
    private android.accessibilityservice.IAccessibilityServiceClient mClient;
    private int mConnectionId;
    private int mConnectionState;
    private int mCurrentEventWatchersCount;
    private final int mDisplayId = 0;
    private final java.util.ArrayList<android.view.accessibility.AccessibilityEvent> mEventQueue = null;
    private int mFlags;
    private int mGenerationId;
    private boolean mIsDestroyed;
    private long mLastEventTimeMillis;
    private final android.os.Handler mLocalCallbackHandler = null;
    private final java.lang.Object mLock = null;
    private android.app.UiAutomation.OnAccessibilityEventListener mOnAccessibilityEventListener;
    private android.os.HandlerThread mRemoteCallbackThread;
    private final android.app.IUiAutomationConnection mUiAutomationConnection = null;
    private UiAutomation(int p0, android.os.Looper p1, android.app.IUiAutomationConnection p2) {}
    public UiAutomation(android.content.Context p0, android.app.IUiAutomationConnection p1) {}
    @java.lang.Deprecated
    public UiAutomation(android.os.Looper p0, android.app.IUiAutomationConnection p1) {}
    private android.os.ParcelFileDescriptor[] executeShellCommandInternal(java.lang.String p0, boolean p1) { return null; }
    private static int getDisplayId(android.content.Context p0) { return 0; }
    private static int getDisplayId$ravenwood(android.content.Context p0) { return 0; }
    private static int getMainDisplayIdAssignedToUser(android.content.Context p0, android.os.UserManager p1) { return 0; }
    private void throwIfConnectedLocked() {}
    private void throwIfNotConnectedLocked() {}
    private boolean useAccessibility() { return false; }
    private void warnIfBetterCommand(java.lang.String p0) {}
    public void addOverridePermissionState(int p0, java.lang.String p1, int p2) {}
    public void adoptShellPermissionIdentity() {}
    public void adoptShellPermissionIdentity(java.lang.String... p0) {}
    public void clearAllOverridePermissionStates() {}
    public boolean clearCache() { return false; }
    public void clearOverridePermissionStates(int p0) {}
    @java.lang.Deprecated
    public void clearWindowAnimationFrameStats() {}
    public boolean clearWindowContentFrameStats(int p0) { return false; }
    public void connect() {}
    public void connect(int p0) {}
    public void connectWithTimeout(int p0, long p1) throws java.util.concurrent.TimeoutException {}
    public void destroy() {}
    public void disconnect() {}
    public void dropShellPermissionIdentity() {}
    public android.view.accessibility.AccessibilityEvent executeAndWaitForEvent(java.lang.Runnable p0, android.app.UiAutomation.AccessibilityEventFilter p1, long p2) throws java.util.concurrent.TimeoutException { return null; }
    public android.os.ParcelFileDescriptor executeShellCommand(java.lang.String p0) { return null; }
    public android.os.ParcelFileDescriptor[] executeShellCommandRw(java.lang.String p0) { return null; }
    public android.os.ParcelFileDescriptor[] executeShellCommandRwe(java.lang.String p0) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int p0) { return null; }
    public java.util.Set<java.lang.String> getAdoptedShellPermissions() { return null; }
    public android.view.accessibility.AccessibilityCache getCache() { return null; }
    public int getConnectionId() { return 0; }
    public int getDisplayId() { return 0; }
    public int getFlags() { return 0; }
    public android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow(int p0) { return null; }
    public final android.accessibilityservice.AccessibilityServiceInfo getServiceInfo() { return null; }
    @java.lang.Deprecated
    public android.view.WindowAnimationFrameStats getWindowAnimationFrameStats() { return null; }
    public android.view.WindowContentFrameStats getWindowContentFrameStats(int p0) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindows() { return null; }
    public android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityWindowInfo>> getWindowsOnAllDisplays() { return null; }
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public boolean grantRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { return false; }
    public void grantRuntimePermissionAsUser(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) {}
    public boolean injectInputEvent(android.view.InputEvent p0, boolean p1) { return false; }
    @java.lang.Deprecated
    public boolean injectInputEvent(android.view.InputEvent p0, boolean p1, boolean p2) { return false; }
    @java.lang.Deprecated
    public void injectInputEventToInputFilter(android.view.InputEvent p0) {}
    public boolean isDestroyed() { return false; }
    public boolean isNodeInCache(android.view.accessibility.AccessibilityNodeInfo p0) { return false; }
    public final boolean performGlobalAction(int p0) { return false; }
    public void removeOverridePermissionState(int p0, java.lang.String p1) {}
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public boolean revokeRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { return false; }
    public void revokeRuntimePermissionAsUser(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) {}
    public void setAnimationScale(float p0) {}
    public void setOnAccessibilityEventListener(android.app.UiAutomation.OnAccessibilityEventListener p0) {}
    public boolean setRotation(int p0) { return false; }
    public void setRunAsMonkey(boolean p0) {}
    public final void setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo p0) {}
    public void syncInputTransactions() {}
    public void syncInputTransactions(boolean p0) {}
    public android.graphics.Bitmap takeScreenshot() { return null; }
    public android.graphics.Bitmap takeScreenshot(int p0) throws java.io.IOException { return null; }
    public android.graphics.Bitmap takeScreenshot(android.view.Window p0) { return null; }
    public java.lang.String toString() { return null; }
    public void waitForIdle(long p0, long p1) throws java.util.concurrent.TimeoutException {}

    public static interface AccessibilityEventFilter {
        public boolean accept(android.view.accessibility.AccessibilityEvent p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ConnectionState {
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
        public static final int FAILED = 3;
    }

    private class IAccessibilityServiceClientImpl extends android.accessibilityservice.AccessibilityService.IAccessibilityServiceClientWrapper {
        public IAccessibilityServiceClientImpl(android.app.UiAutomation p0, android.os.Looper p1, int p2) { super((android.content.Context)null, (android.os.Looper)null, (android.accessibilityservice.AccessibilityService.Callbacks)null); }
    }

    public static interface OnAccessibilityEventListener {
        public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
    }
}
