package android.app.search;

@android.annotation.SystemApi
public final class SearchSession implements java.lang.AutoCloseable {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = null;
    private final android.app.search.ISearchUiManager mInterface = null;
    private final java.util.concurrent.atomic.AtomicBoolean mIsClosed = null;
    private final android.util.ArrayMap<android.app.search.SearchSession.Callback, android.app.search.SearchSession.CallbackWrapper> mRegisteredCallbacks = null;
    private final android.app.search.SearchSessionId mSessionId = null;
    private final android.os.IBinder mToken = null;
    SearchSession(android.content.Context p0, android.app.search.SearchContext p1) {}
    public void close() {}
    @java.lang.Deprecated
    public void destroy() {}
    protected void finalize() {}
    public void notifyEvent(android.app.search.Query p0, android.app.search.SearchTargetEvent p1) {}
    public void query(android.app.search.Query p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.util.List<android.app.search.SearchTarget>> p2) {}
    public void registerEmptyQueryResultUpdateCallback(java.util.concurrent.Executor p0, android.app.search.SearchSession.Callback p1) {}
    public void unregisterEmptyQueryResultUpdateCallback(android.app.search.SearchSession.Callback p0) {}

    public static interface Callback {
        public void onTargetsAvailable(java.util.List<android.app.search.SearchTarget> p0);
    }

    static class CallbackWrapper extends android.app.search.ISearchCallback.Stub {
        private final java.util.function.Consumer<java.util.List<android.app.search.SearchTarget>> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        CallbackWrapper(java.util.concurrent.Executor p0, java.util.function.Consumer<java.util.List<android.app.search.SearchTarget>> p1) { super(); }
        public void onResult(android.content.pm.ParceledListSlice p0) {}
    }
}
