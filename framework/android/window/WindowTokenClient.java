package android.window;

public class WindowTokenClient extends android.os.Binder {
    private static final java.lang.String TAG = null;
    private final android.content.res.Configuration mConfiguration = null;
    private java.lang.ref.WeakReference<android.content.Context> mContextRef;
    private final android.os.Handler mHandler = null;
    private final android.app.ResourcesManager mResourcesManager = null;
    private boolean mShouldDumpConfigForIme;
    public WindowTokenClient() { super(); }
    public void attachContext(android.content.Context p0) {}
    public android.app.servertransaction.ClientTransactionListenerController getClientTransactionListenerController() { return null; }
    public android.content.Context getContext() { return null; }
    public void onConfigurationChanged(android.content.res.Configuration p0, int p1) {}
    public void onConfigurationChanged(android.content.res.Configuration p0, int p1, boolean p2) {}
    public void onConfigurationChangedInner(android.content.Context p0, android.content.res.Configuration p1, int p2, boolean p3) {}
    public void onWindowTokenRemoved() {}
    public void postOnConfigurationChanged(android.content.res.Configuration p0, int p1) {}
}
