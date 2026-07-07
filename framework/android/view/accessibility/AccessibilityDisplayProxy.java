package android.view.accessibility;

@android.annotation.SystemApi
public abstract class AccessibilityDisplayProxy {
    private static final int INVALID_CONNECTION_ID = -1;
    private static final java.lang.String LOG_TAG = "AccessibilityDisplayProxy";
    private int mConnectionId;
    private int mDisplayId;
    private java.util.concurrent.Executor mExecutor;
    private java.util.List<android.accessibilityservice.AccessibilityServiceInfo> mInstalledAndEnabledServices;
    private int mLastSentConnectionId;
    android.accessibilityservice.IAccessibilityServiceClient mServiceClient;
    public AccessibilityDisplayProxy(int p0, java.util.concurrent.Executor p1, java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p2) {}
    private void sendServiceInfos() {}
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int p0) { return null; }
    public int getDisplayId() { return 0; }
    public final java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAndEnabledServices() { return null; }
    public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindows() { return null; }
    public void interrupt() {}
    public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public void onProxyConnected() {}
    public void setAccessibilityFocusAppearance(int p0, int p1) {}
    public void setInstalledAndEnabledServices(java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p0) {}

    private class IAccessibilityServiceClientImpl extends android.accessibilityservice.AccessibilityService.IAccessibilityServiceClientWrapper {
        IAccessibilityServiceClientImpl(android.view.accessibility.AccessibilityDisplayProxy p0, android.content.Context p1, java.util.concurrent.Executor p2) { super((android.content.Context)null, (android.os.Looper)null, (android.accessibilityservice.AccessibilityService.Callbacks)null); }
    }
}
