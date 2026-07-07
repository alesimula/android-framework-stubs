package android.appwidget;

public class AppWidgetHost {
    static final int HANDLE_APP_WIDGET_REMOVED = 4;
    static final int HANDLE_PROVIDERS_CHANGED = 3;
    static final int HANDLE_PROVIDER_CHANGED = 2;
    static final int HANDLE_UPDATE = 1;
    static final int HANDLE_VIEW_UPDATE_DEFERRED = 5;
    private static final java.lang.String TAG = "AppWidgetHost";
    static com.android.internal.appwidget.IAppWidgetService sService;
    private static final java.util.function.Function<android.content.Context, com.android.internal.appwidget.IAppWidgetService> sServiceFactory = null;
    private final android.appwidget.AppWidgetHost.Callbacks mCallbacks = null;
    private java.lang.String mContextOpPackageName;
    private android.util.DisplayMetrics mDisplayMetrics;
    private final android.os.Handler mHandler = null;
    private final int mHostId = 0;
    private android.widget.RemoteViews.InteractionHandler mInteractionHandler;
    private final android.util.SparseArray<android.appwidget.AppWidgetHost.AppWidgetHostListener> mListeners = null;
    private final com.android.internal.appwidget.IAppWidgetService mService = null;
    public AppWidgetHost(android.content.Context p0, int p1) {}
    public AppWidgetHost(android.content.Context p0, int p1, android.widget.RemoteViews.InteractionHandler p2, android.os.Looper p3) {}
    public AppWidgetHost(android.content.Context p0, int p1, android.widget.RemoteViews.InteractionHandler p2, android.os.Looper p3, java.util.function.Function<android.content.Context, com.android.internal.appwidget.IAppWidgetService> p4) {}
    public static void deleteAllHosts() {}
    private android.appwidget.AppWidgetHost.AppWidgetHostListener getListener(int p0) { return null; }
    private void updateAppWidgetDeferred(int p0) {}
    public int allocateAppWidgetId() { return 0; }
    protected void clearViews() {}
    public final android.appwidget.AppWidgetHostView createView(android.content.Context p0, int p1, android.appwidget.AppWidgetProviderInfo p2) { return null; }
    public void deleteAppWidgetId(int p0) {}
    public void deleteHost() {}
    void dispatchOnAppWidgetRemoved(int p0) {}
    public int[] getAppWidgetIds() { return null; }
    public final android.content.IntentSender getIntentSenderForConfigureActivity(int p0, int p1) { return null; }
    public void onAppWidgetRemoved(int p0) {}
    protected android.appwidget.AppWidgetHostView onCreateView(android.content.Context p0, int p1, android.appwidget.AppWidgetProviderInfo p2) { return null; }
    protected void onProviderChanged(int p0, android.appwidget.AppWidgetProviderInfo p1) {}
    protected void onProvidersChanged() {}
    public void removeListener(int p0) {}
    public void reportAllWidgetEvents() {}
    public void reportEventForWidget(int p0) {}
    public void setAppWidgetHidden() {}
    public void setInteractionHandler(android.widget.RemoteViews.InteractionHandler p0) {}
    public void setListener(int p0, android.appwidget.AppWidgetHost.AppWidgetHostListener p1) {}
    public final void startAppWidgetConfigureActivityForResult(android.app.Activity p0, int p1, int p2, int p3, android.os.Bundle p4) {}
    public void startListening() {}
    public void stopListening() {}
    void updateAppWidgetView(int p0, android.widget.RemoteViews p1) {}

    public static interface AppWidgetHostListener {
        default public android.appwidget.AppWidgetEvent collectWidgetEvent() { return null; }
        public void onUpdateProviderInfo(android.appwidget.AppWidgetProviderInfo p0);
        public void onViewDataChanged(int p0);
        public void updateAppWidget(android.widget.RemoteViews p0);
        default public void updateAppWidgetDeferred(java.lang.String p0, int p1) {}
    }

    static class Callbacks extends com.android.internal.appwidget.IAppWidgetHost.Stub {
        private final java.lang.ref.WeakReference<android.os.Handler> mWeakHandler = null;
        public Callbacks(android.os.Handler p0) { super(); }
        private static boolean isLocalBinder() { return false; }
        public void appWidgetRemoved(int p0) {}
        public void providerChanged(int p0, android.appwidget.AppWidgetProviderInfo p1) {}
        public void providersChanged() {}
        public void updateAppWidget(int p0, android.widget.RemoteViews p1) {}
        public void updateAppWidgetDeferred(int p0) {}
    }

    class UpdateHandler extends android.os.Handler {
        public UpdateHandler(android.appwidget.AppWidgetHost p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
