package android.window;

public class SystemUiContext extends android.content.ContextWrapper implements android.window.ConfigurationDispatcher {
    private final android.content.ComponentCallbacksController mCallbacksController = null;
    public SystemUiContext(android.content.Context p0) { super(null); }
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public void registerComponentCallbacks(android.content.ComponentCallbacks p0) {}
    public boolean shouldReportPrivateChanges() { return false; }
    public void unregisterComponentCallbacks(android.content.ComponentCallbacks p0) {}
}
