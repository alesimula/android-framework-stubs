package android.service.search;

@android.annotation.SystemApi
public abstract class SearchUiService extends android.app.Service {
    private static final boolean DEBUG = false;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.search.SearchUiService";
    private static final java.lang.String TAG = "SearchUiService";
    private android.os.Handler mHandler;
    private final android.service.search.ISearchUiService mInterface = null;
    private final android.util.ArrayMap<android.app.search.SearchSessionId, java.util.ArrayList<android.service.search.SearchUiService.CallbackWrapper>> mSessionEmptyQueryResultCallbacks = null;
    public SearchUiService() { super(); }
    private void doDestroy(android.app.search.SearchSessionId p0) {}
    private void doRegisterEmptyQueryResultUpdateCallback(android.app.search.SearchSessionId p0, android.app.search.ISearchCallback p1) {}
    private void doUnregisterEmptyQueryResultUpdateCallback(android.app.search.SearchSessionId p0, android.app.search.ISearchCallback p1) {}
    private android.service.search.SearchUiService.CallbackWrapper findCallbackWrapper(java.util.ArrayList<android.service.search.SearchUiService.CallbackWrapper> p0, android.app.search.ISearchCallback p1) { return null; }
    private void removeCallbackWrapper(java.util.ArrayList<android.service.search.SearchUiService.CallbackWrapper> p0, android.service.search.SearchUiService.CallbackWrapper p1) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onCreate() {}
    @java.lang.Deprecated
    public void onCreateSearchSession(android.app.search.SearchContext p0, android.app.search.SearchSessionId p1) {}
    public abstract void onDestroy(android.app.search.SearchSessionId p0);
    public abstract void onNotifyEvent(android.app.search.SearchSessionId p0, android.app.search.Query p1, android.app.search.SearchTargetEvent p2);
    public abstract void onQuery(android.app.search.SearchSessionId p0, android.app.search.Query p1, java.util.function.Consumer<java.util.List<android.app.search.SearchTarget>> p2);
    public void onSearchSessionCreated(android.app.search.SearchContext p0, android.app.search.SearchSessionId p1) {}
    public void onStartUpdateEmptyQueryResult() {}
    public void onStopUpdateEmptyQueryResult() {}
    public final void updateEmptyQueryResult(android.app.search.SearchSessionId p0, java.util.List<android.app.search.SearchTarget> p1) {}

    private static final class CallbackWrapper implements java.util.function.Consumer<java.util.List<android.app.search.SearchTarget>>, android.os.IBinder.DeathRecipient {
        private android.app.search.ISearchCallback mCallback;
        private final java.util.function.Consumer<android.service.search.SearchUiService.CallbackWrapper> mOnBinderDied = null;
        CallbackWrapper(android.app.search.ISearchCallback p0, java.util.function.Consumer<android.service.search.SearchUiService.CallbackWrapper> p1) {}
        public void accept(java.util.List<android.app.search.SearchTarget> p0) {}
        public void binderDied() {}
        public void destroy() {}
        public boolean isCallback(android.app.search.ISearchCallback p0) { return false; }
    }
}
