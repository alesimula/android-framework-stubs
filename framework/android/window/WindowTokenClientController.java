package android.window;

public class WindowTokenClientController {
    private static final java.lang.String TAG = null;
    private static android.window.WindowTokenClientController sController;
    private final android.app.IApplicationThread mAppThread = null;
    private final android.os.Handler mHandler = null;
    private final java.lang.Object mLock = null;
    private final android.util.ArraySet<android.window.WindowTokenClient> mWindowTokenClients = null;
    private WindowTokenClientController() {}
    public static android.window.WindowTokenClientController createInstanceForTesting() { return null; }
    public static android.window.WindowTokenClientController getInstance() { return null; }
    private android.window.WindowTokenClient getWindowTokenClientIfAttached(android.os.IBinder p0) { return null; }
    private void onWindowContextTokenAttached(android.window.WindowTokenClient p0, android.window.WindowContextInfo p1, boolean p2) {}
    public static void overrideForTesting(android.window.WindowTokenClientController p0) {}
    private void recordWindowContextToken(android.window.WindowTokenClient p0) {}
    public boolean attachToDisplayArea(android.window.WindowTokenClient p0, int p1, int p2, android.os.Bundle p3) { return false; }
    public boolean attachToDisplayContent(android.window.WindowTokenClient p0, int p1) { return false; }
    public boolean attachToWindowToken(android.window.WindowTokenClient p0, android.os.IBinder p1) { return false; }
    public void detachIfNeeded(android.window.WindowTokenClient p0) {}
    public android.content.Context getWindowContext(android.os.IBinder p0) { return null; }
    public android.view.IWindowManager getWindowManagerService() { return null; }
    public void onWindowConfigurationChanged(android.os.IBinder p0, android.content.res.Configuration p1, int p2) {}
    public void onWindowContextInfoChanged(android.os.IBinder p0, android.window.WindowContextInfo p1) {}
    public void onWindowContextWindowRemoved(android.os.IBinder p0) {}
    public void reparentToDisplayArea(android.window.WindowTokenClient p0, int p1) {}
}
