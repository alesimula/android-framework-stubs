package android.accessibilityservice;

public final class AccessibilityButtonController {
    private static final java.lang.String LOG_TAG = "A11yButtonController";
    private android.util.ArrayMap<android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback, android.os.Handler> mCallbacks;
    private final java.lang.Object mLock = null;
    private final android.accessibilityservice.IAccessibilityServiceConnection mServiceConnection = null;
    AccessibilityButtonController(android.accessibilityservice.IAccessibilityServiceConnection p0) {}
    void dispatchAccessibilityButtonAvailabilityChanged(boolean p0) {}
    void dispatchAccessibilityButtonClicked() {}
    public boolean isAccessibilityButtonAvailable() { return false; }
    public void registerAccessibilityButtonCallback(android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback p0) {}
    public void registerAccessibilityButtonCallback(android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback p0, android.os.Handler p1) {}
    public void unregisterAccessibilityButtonCallback(android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback p0) {}

    public static abstract class AccessibilityButtonCallback {
        public AccessibilityButtonCallback() {}
        public void onAvailabilityChanged(android.accessibilityservice.AccessibilityButtonController p0, boolean p1) {}
        public void onClicked(android.accessibilityservice.AccessibilityButtonController p0) {}
    }
}
