package android.app.permissionui;

public class LocationButtonProviderFactory {
    private static final java.lang.String TAG = "LocationButtonProvider";
    private LocationButtonProviderFactory() {}
    public static android.app.permissionui.LocationButtonProvider create(android.content.Context p0) { return null; }

    static final class LocationButtonProviderImpl implements android.app.permissionui.LocationButtonProvider {
        private static final boolean DEBUG = Boolean.valueOf(false);
        private static final int OPEN_SESSION_ATTEMPTS_LIMIT = 5;
        private static final long UNBIND_SERVICE_DELAY_MILLIS = 5000L;
        private android.app.permissionui.LocationButtonProviderFactory.LocationButtonProviderImpl.ServiceConnectionHandler mConnection;
        private final android.content.Context mContext = null;
        private final android.os.Handler mHandler = null;
        private final java.util.Map<android.app.permissionui.LocationButtonClient, android.app.permissionui.LocationButtonProviderFactory.LocationButtonSessionRecord> mOpenSessions = null;
        private final java.lang.String mPackageName = null;
        private final java.util.Queue<android.app.permissionui.LocationButtonProviderFactory.LocationButtonProviderImpl.OpenSessionRequest> mPendingOpenSessionRequests = null;
        private final android.app.permissionui.LocationButtonProviderFactory.SerialExecutor mSerialExecutor = null;
        private android.app.permissionui.ILocationButtonService mService;
        private final java.lang.Runnable mUnbindRunnable = null;
        LocationButtonProviderImpl(android.content.Context p0) {}
        private void bindServiceAndSaveRequestSerialized(android.app.permissionui.LocationButtonProviderFactory.LocationButtonProviderImpl.OpenSessionRequest p0) {}
        private void closeActiveSessionsAndNotifyClients(java.lang.Throwable p0) {}
        private void ensureValidServiceConnectionExistsSerialized() {}
        private void onBindingDiedSerialized() {}
        private void onServiceConnectedSerialized(android.os.IBinder p0) {}
        private void onServiceDisconnectedSerialized() {}
        private void onServiceNullBindingSerialized() {}
        private void onSessionClosedSerialized(android.app.permissionui.LocationButtonClient p0) {}
        private void openSessionInternalSerialized(android.app.permissionui.LocationButtonProviderFactory.LocationButtonProviderImpl.OpenSessionRequest p0) {}
        private void openSessionSerialized(android.app.Activity p0, android.os.IBinder p1, int p2, android.app.permissionui.LocationButtonRequest p3, java.util.concurrent.Executor p4, android.app.permissionui.LocationButtonClient p5) {}
        private boolean performBindServiceSerialized(android.content.Intent p0) { return false; }
        private void removePendingRequestsAndNotifyClients(java.lang.Throwable p0) {}
        private void reportSessionErrorSerialized(android.app.permissionui.LocationButtonProviderFactory.LocationButtonProviderImpl.OpenSessionRequest p0, java.lang.Throwable p1) {}
        private void unbindServiceInternalSerialized() {}
        void addActiveSessionRecord(android.app.permissionui.LocationButtonClient p0, android.app.permissionui.LocationButtonProviderFactory.LocationButtonSessionRecord p1) {}
        void onSessionClosed(android.app.permissionui.LocationButtonClient p0) {}
        public void openSession(android.app.Activity p0, android.os.IBinder p1, int p2, android.app.permissionui.LocationButtonRequest p3, java.util.concurrent.Executor p4, android.app.permissionui.LocationButtonClient p5) {}

        private static class OpenSessionRequest {
            private final android.app.permissionui.LocationButtonClient mClientCallback = null;
            private final android.app.permissionui.LocationButtonClientWrapper mClientCallbackWrapper = null;
            private final java.util.concurrent.Executor mClientExecutor = null;
            private final int mDisplayId = 0;
            private final android.os.IBinder mHostToken = null;
            private final android.app.permissionui.LocationButtonRequest mRequest = null;
            private int mTotalOpenSessionAttempts;
            private OpenSessionRequest(android.os.IBinder p0, int p1, android.app.permissionui.LocationButtonRequest p2, android.app.permissionui.LocationButtonClient p3, android.app.permissionui.LocationButtonClientWrapper p4, java.util.concurrent.Executor p5) {}
            public java.lang.String toString() { return null; }
        }

        private static class ServiceConnectionHandler implements android.content.ServiceConnection {
            private android.content.Context mContext;
            private final android.content.Intent mIntent = null;
            private boolean mIsBindRequested;
            private boolean mIsConnected;
            private boolean mIsConnectionValid;
            private android.app.permissionui.LocationButtonProviderFactory.LocationButtonProviderImpl mProvider;
            ServiceConnectionHandler(android.content.Context p0, android.app.permissionui.LocationButtonProviderFactory.LocationButtonProviderImpl p1) {}
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

    static final class LocationButtonSessionRecord {
        private final java.util.concurrent.Executor clientExecutor = null;
        private final android.app.permissionui.ILocationButtonSession locationButtonSession = null;
        LocationButtonSessionRecord(android.app.permissionui.ILocationButtonSession p0, java.util.concurrent.Executor p1) {}
        public java.util.concurrent.Executor clientExecutor() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public android.app.permissionui.ILocationButtonSession locationButtonSession() { return null; }
        public final java.lang.String toString() { return null; }
    }

    private static class SerialExecutor implements java.util.concurrent.Executor {
        java.lang.Runnable mActive;
        final java.util.concurrent.Executor mExecutor = null;
        final java.util.Queue<java.lang.Runnable> mTasks = null;
        SerialExecutor(java.util.concurrent.Executor p0) {}
        private void scheduleNext() {}
        public void execute(java.lang.Runnable p0) {}
    }
}
