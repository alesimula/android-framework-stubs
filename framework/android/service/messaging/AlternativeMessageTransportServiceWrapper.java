package android.service.messaging;

public class AlternativeMessageTransportServiceWrapper implements java.lang.AutoCloseable {
    private static final int SERVICE_BIND_TIMEOUT = 10;
    private static final java.lang.String TAG = "AMTSWrapper";
    private volatile android.service.messaging.IAlternativeMessageTransportService mAlternativeMessageTransportService;
    private final android.content.Context mContext = null;
    private java.lang.Runnable mOnServiceReadyCallback;
    private java.util.concurrent.Executor mOnServiceReadyCallbackExecutor;
    private final java.util.concurrent.ScheduledExecutorService mScheduler = null;
    private java.util.concurrent.ScheduledFuture<?> mServiceCloseFuture;
    private volatile android.service.messaging.AlternativeMessageTransportServiceWrapper.MessageUpgradeServiceConnection mServiceConnection;
    private final java.lang.Object mServiceTimeoutLock = null;
    public AlternativeMessageTransportServiceWrapper(android.content.Context p0, java.util.concurrent.ScheduledExecutorService p1) {}
    private boolean bindToService(java.lang.String p0, java.util.concurrent.Executor p1, java.lang.Runnable p2) { return false; }
    private void disconnect() {}
    private void onServiceReady(android.service.messaging.IAlternativeMessageTransportService p0) {}
    private void scheduleServiceClose() {}
    private void upgradeMessageInternal(android.net.Uri p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    public void close() {}
    public void upgradeMessage(android.net.Uri p0, java.lang.String p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}

    private static final class MessageUpgradeCallbackInternal extends android.service.messaging.IMessageUpgradeCallback.Stub {
        private final java.util.function.Consumer<java.lang.Integer> mClientCallback = null;
        private final java.util.concurrent.Executor mClientCallbackExecutor = null;
        private MessageUpgradeCallbackInternal(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) { super(); }
        public void onUpgradeStatusAvailable(int p0) throws android.os.RemoteException {}
    }

    private final class MessageUpgradeServiceConnection implements android.content.ServiceConnection {
        private MessageUpgradeServiceConnection(android.service.messaging.AlternativeMessageTransportServiceWrapper p0) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
    }
}
