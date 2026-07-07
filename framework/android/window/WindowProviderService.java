package android.window;

public abstract class WindowProviderService extends android.app.Service implements android.window.WindowProvider, android.window.ConfigurationDispatcher {
    private static final java.lang.String TAG = null;
    private final android.content.ComponentCallbacksController mCallbacksController = null;
    private final android.window.WindowContextController mController = null;
    private boolean mInitialized;
    private final android.os.Bundle mOptions = null;
    private android.view.WindowManager mWindowManager;
    private final android.window.WindowTokenClient mWindowToken = null;
    public WindowProviderService() { super(); }
    public static boolean isWindowProviderService(android.os.Bundle p0) { return false; }
    protected void attachBaseContext(android.content.Context p0) {}
    public final void attachToWindowToken(android.os.IBinder p0) {}
    public final android.content.Context createServiceBaseContext(android.app.ActivityThread p0, android.app.LoadedApk p1) { return null; }
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}
    public int getInitialDisplayId() { return 0; }
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    public android.os.Bundle getWindowContextOptions() { return null; }
    public abstract int getWindowType();
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onDestroy() {}
    public void onLowMemory() {}
    public void onTrimMemory(int p0) {}
    public void registerComponentCallbacks(android.content.ComponentCallbacks p0) {}
    public void unregisterComponentCallbacks(android.content.ComponentCallbacks p0) {}
}
