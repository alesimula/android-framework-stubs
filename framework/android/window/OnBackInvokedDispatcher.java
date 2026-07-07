package android.window;

public interface OnBackInvokedDispatcher {
    public static final boolean DEBUG = false;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_OVERLAY = 1000000;
    public static final int PRIORITY_SYSTEM = -1;
    public static final int PRIORITY_SYSTEM_NAVIGATION_OBSERVER = -2;
    public static final java.lang.String TAG = "OnBackInvokedDispatcher";
    public void registerOnBackInvokedCallback(int p0, android.window.OnBackInvokedCallback p1);
    default public void registerSystemOnBackInvokedCallback(android.window.OnBackInvokedCallback p0) {}
    default public void setImeBackCallbackSender(android.window.ImeBackCallbackSender p0) {}
    public void unregisterOnBackInvokedCallback(android.window.OnBackInvokedCallback p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Priority {
    }
}
