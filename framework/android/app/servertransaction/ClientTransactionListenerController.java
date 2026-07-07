package android.app.servertransaction;

public class ClientTransactionListenerController {
    private static final java.lang.String TAG = "ClientTransactionListenerController";
    private static android.app.servertransaction.ClientTransactionListenerController sController;
    private final android.util.ArraySet<java.util.function.BiConsumer<android.os.IBinder, android.window.ActivityWindowInfo>> mActivityWindowInfoChangedListeners = null;
    private final android.util.ArrayMap<android.content.Context, android.content.res.Configuration> mContextToPreChangedConfigMap = null;
    private final android.hardware.display.DisplayManagerGlobal mDisplayManager = null;
    private boolean mIsClientTransactionExecuting;
    private final java.lang.Object mLock = null;
    private ClientTransactionListenerController(android.hardware.display.DisplayManagerGlobal p0) {}
    public static android.app.servertransaction.ClientTransactionListenerController createInstanceForTesting(android.hardware.display.DisplayManagerGlobal p0) { return null; }
    public static android.app.servertransaction.ClientTransactionListenerController getInstance() { return null; }
    private boolean shouldReportDisplayChange(android.content.Context p0, android.content.res.Configuration p1) { return false; }
    public void onActivityWindowInfoChanged(android.os.IBinder p0, android.window.ActivityWindowInfo p1) {}
    public void onClientTransactionFinished() {}
    public void onClientTransactionStarted() {}
    public void onContextConfigurationPostChanged(android.content.Context p0) {}
    public void onContextConfigurationPreChanged(android.content.Context p0) {}
    public void onDisplayChanged(int p0) throws java.util.concurrent.RejectedExecutionException {}
    public void registerActivityWindowInfoChangedListener(java.util.function.BiConsumer<android.os.IBinder, android.window.ActivityWindowInfo> p0) {}
    public void unregisterActivityWindowInfoChangedListener(java.util.function.BiConsumer<android.os.IBinder, android.window.ActivityWindowInfo> p0) {}
}
