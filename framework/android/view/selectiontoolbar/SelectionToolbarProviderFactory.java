package android.view.selectiontoolbar;

public class SelectionToolbarProviderFactory {
    private static final java.lang.String LOG_TAG = "SelectionToolbar";
    private SelectionToolbarProviderFactory() {}
    public static android.view.selectiontoolbar.SelectionToolbarProvider create(android.content.Context p0) { return null; }

    static final class SelectionToolbarProviderImpl extends android.view.selectiontoolbar.SelectionToolbarProviderFactory implements android.view.selectiontoolbar.SelectionToolbarProvider {
        private static final boolean DEBUG = Boolean.valueOf(false);
        private static final int OPEN_SESSION_ATTEMPTS_LIMIT = 5;
        private static final long UNBIND_SERVICE_DELAY_MILLIS = 5000L;
        private android.view.selectiontoolbar.SelectionToolbarProviderFactory.SelectionToolbarProviderImpl.ServiceConnectionHandler mConnection;
        private final android.content.Context mContext = null;
        private final android.os.Handler mHandler = null;
        private final android.util.ArrayMap<android.view.selectiontoolbar.SelectionToolbarClient, android.view.selectiontoolbar.SelectionToolbarProviderFactory.SelectionToolbarSessionRecord> mOpenSessions = null;
        private final java.util.ArrayDeque<android.view.selectiontoolbar.SelectionToolbarProviderFactory.SelectionToolbarProviderImpl.OpenSessionRequest> mPendingOpenSessionRequests = null;
        private final android.view.selectiontoolbar.SelectionToolbarProviderFactory.SerialExecutor mSerialExecutor = null;
        private android.view.selectiontoolbar.ISelectionToolbarService mService;
        private final java.lang.Runnable mUnbindRunnable = null;
        SelectionToolbarProviderImpl(android.content.Context p0) { super(); }
        private void bindServiceAndSaveRequestSerialized(android.view.selectiontoolbar.SelectionToolbarProviderFactory.SelectionToolbarProviderImpl.OpenSessionRequest p0) {}
        private void closeActiveSessionsAndNotifyClients(java.lang.Throwable p0) {}
        private void ensureValidServiceConnectionExistsSerialized() {}
        private void onBindingDiedSerialized() {}
        private void onServiceConnectedSerialized(android.os.IBinder p0) {}
        private void onServiceDisconnectedSerialized() {}
        private void onServiceNullBindingSerialized() {}
        private void onSessionClosedSerialized(android.view.selectiontoolbar.SelectionToolbarClient p0) {}
        private void openSessionInternalSerialized(android.view.selectiontoolbar.SelectionToolbarProviderFactory.SelectionToolbarProviderImpl.OpenSessionRequest p0) {}
        private void openSessionSerialized(android.view.selectiontoolbar.SelectionToolbarRequest p0, java.util.concurrent.Executor p1, android.view.selectiontoolbar.SelectionToolbarClient p2) {}
        private boolean performBindServiceSerialized(android.content.Intent p0) { return false; }
        private void removePendingRequestsAndNotifyClients(java.lang.Throwable p0) {}
        private void reportSessionErrorSerialized(android.view.selectiontoolbar.SelectionToolbarProviderFactory.SelectionToolbarProviderImpl.OpenSessionRequest p0, java.lang.Throwable p1) {}
        private void unbindServiceInternalSerialized() {}
        void addActiveSessionRecord(android.view.selectiontoolbar.SelectionToolbarClient p0, android.view.selectiontoolbar.SelectionToolbarProviderFactory.SelectionToolbarSessionRecord p1) {}
        void closeSession(android.view.selectiontoolbar.SelectionToolbarClientWrapper p0) {}
        void hideSession(android.view.selectiontoolbar.SelectionToolbarClientWrapper p0) {}
        void onSessionClosed(android.view.selectiontoolbar.SelectionToolbarClient p0) {}
        public void openSession(android.view.selectiontoolbar.SelectionToolbarRequest p0, java.util.concurrent.Executor p1, android.view.selectiontoolbar.SelectionToolbarClient p2) {}
        void updateSession(android.view.selectiontoolbar.SelectionToolbarClientWrapper p0, boolean p1, java.util.List<android.view.selectiontoolbar.ToolbarMenuItem> p2, android.graphics.Rect p3, int p4) {}

        private static class OpenSessionRequest {
            private final android.view.selectiontoolbar.SelectionToolbarClient mClientCallback = null;
            private final android.view.selectiontoolbar.SelectionToolbarClientWrapper mClientCallbackWrapper = null;
            private final java.util.concurrent.Executor mClientExecutor = null;
            private final android.view.selectiontoolbar.SelectionToolbarRequest mRequest = null;
            private int mTotalOpenSessionAttempts;
            private OpenSessionRequest(android.view.selectiontoolbar.SelectionToolbarRequest p0, android.view.selectiontoolbar.SelectionToolbarClient p1, android.view.selectiontoolbar.SelectionToolbarClientWrapper p2, java.util.concurrent.Executor p3) {}
            public java.lang.String toString() { return null; }
        }

        private static class ServiceConnectionHandler implements android.content.ServiceConnection {
            private android.content.Context mContext;
            private final android.content.Intent mIntent = null;
            private boolean mIsBindRequested;
            private boolean mIsConnected;
            private boolean mIsConnectionValid;
            private android.view.selectiontoolbar.SelectionToolbarProviderFactory.SelectionToolbarProviderImpl mProvider;
            ServiceConnectionHandler(android.content.Context p0, android.view.selectiontoolbar.SelectionToolbarProviderFactory.SelectionToolbarProviderImpl p1) {}
            private void bindServiceSerialized() {}
            private void disposeSerialized() {}
            private boolean isBindRequested() { return false; }
            private boolean isConnected() { return false; }
            private boolean isConnectionValid() { return false; }
            private void unbindAndDisposeConnectionSerialized() {}
            public void onBindingDied(android.content.ComponentName p0) {}
            public void onNullBinding(android.content.ComponentName p0) {}
            public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
            public void onServiceDisconnected(android.content.ComponentName p0) {}
        }
    }

    static final class SelectionToolbarSessionRecord {
        private final java.util.concurrent.Executor clientExecutor = null;
        SelectionToolbarSessionRecord(java.util.concurrent.Executor p0) {}
        public java.util.concurrent.Executor clientExecutor() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
    }

    private static class SerialExecutor implements java.util.concurrent.Executor {
        java.lang.Runnable mActive;
        final java.util.concurrent.Executor mExecutor = null;
        final java.util.ArrayDeque<java.lang.Runnable> mTasks = null;
        SerialExecutor(java.util.concurrent.Executor p0) {}
        private void scheduleNext() {}
        public void execute(java.lang.Runnable p0) {}
    }
}
