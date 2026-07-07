package android.window;

public class WindowContext extends android.content.ContextWrapper implements android.window.WindowProvider, android.window.ConfigurationDispatcher {
    private final android.content.ComponentCallbacksController mCallbacksController = null;
    private final android.window.WindowContextController mController = null;
    private int mFallbackWindowType;
    private final android.os.Bundle mOptions = null;
    private final int mType = 0;
    private android.view.Window mWindow;
    private final android.view.WindowManager mWindowManager = null;
    public WindowContext(android.content.Context p0, int p1, android.os.Bundle p2) { super(null); }
    public static boolean shouldFallbackToDefaultDisplay(android.os.Bundle p0) { return false; }
    public void attachToDisplayArea() {}
    public void attachWindow(android.view.View p0) {}
    public void destroy() {}
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public int getFallbackWindowType() { return 0; }
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    public android.os.Bundle getWindowContextOptions() { return null; }
    public int getWindowType() { return 0; }
    public void registerComponentCallbacks(android.content.ComponentCallbacks p0) {}
    public void release() {}
    public void reparentToDisplay(int p0) {}
    public void setFallbackWindowType(int p0) {}
    public boolean shouldReportPrivateChanges() { return false; }
    public void unregisterComponentCallbacks(android.content.ComponentCallbacks p0) {}

    private static class WindowWrapper extends android.window.WindowBase {
        private final android.view.View mDecorView = null;
        WindowWrapper(android.content.Context p0, android.view.View p1) { super(null); }
        public android.view.View getDecorView() { return null; }
        public android.view.LayoutInflater getLayoutInflater() { return null; }
        public android.view.View peekDecorView() { return null; }
    }
}
