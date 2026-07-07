package android.hardware.contexthub;

@android.annotation.SystemApi
public final class DataFlowSource implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "DataFlowSource";
    private android.hardware.contexthub.DataFlowSource.AsyncState mAsyncState;
    private java.util.concurrent.atomic.AtomicBoolean mCancellationStarted;
    private java.util.concurrent.atomic.AtomicBoolean mCancelled;
    private final android.util.CloseGuard mCloseGuard = null;
    private boolean mClosed;
    private final android.hardware.contexthub.DataFlowDataConfig mConfig = null;
    private final android.hardware.contexthub.DataFlowId mDataFlowId = null;
    private final android.hardware.contexthub.DataFlowInfo mDataFlowInfo = null;
    private final android.hardware.contexthub.HubEndpoint mEndpoint = null;
    private java.util.concurrent.atomic.AtomicBoolean mIsBusy;
    private java.util.concurrent.CompletableFuture<java.lang.Void> mNotificationFuture;
    private final java.lang.Object mNotificationLock = null;
    private final android.hardware.contexthub.SharedDataRegion mRegion = null;
    private final java.util.Set<android.hardware.contexthub.HubEndpointInfo> mSinks = null;
    DataFlowSource(android.hardware.contexthub.DataFlowDataConfig p0, android.hardware.contexthub.HubEndpoint p1, android.hardware.contexthub.SharedDataRegion p2, android.hardware.contexthub.DataFlowInfo p3, android.hardware.contexthub.DataFlowId p4) {}
    private android.hardware.contexthub.DataFlowSource.ApiGuard acquireApiGuard() { return null; }
    private void checkCancelled() {}
    private void pushDataAsyncRunnable(android.hardware.contexthub.DataFlowSource.AsyncState p0) {}
    void cancel() {}
    public void close() {}
    void closeInternal() {}
    public java.util.List<android.hardware.contexthub.HubEndpointInfo> getCurrentSinks() { return null; }
    public android.hardware.contexthub.DataFlowDataConfig getDataFlowConfig() { return null; }
    int getRegionId() { return 0; }
    public boolean isFull() { return false; }
    boolean onNotificationCallback(int p0) { return false; }
    public int push(android.hardware.contexthub.DataFlowData p0, boolean p1) { return 0; }
    public void pushAsync(android.hardware.contexthub.DataFlowData p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Void, java.lang.Throwable> p3) {}
    public void pushBlocking(android.hardware.contexthub.DataFlowData p0, java.time.Duration p1) throws java.util.concurrent.TimeoutException {}
    void removeSink(android.hardware.contexthub.HubEndpointInfo p0) {}
    public void shareDataFlow(android.hardware.contexthub.HubEndpointInfo p0, android.hardware.contexthub.DataFlowNewDataAlertPolicy p1, boolean p2) {}
    public android.hardware.location.ContextHubTransaction<java.lang.Void> shareDataFlowOverSession(android.hardware.contexthub.HubEndpointInfo p0, android.hardware.contexthub.DataFlowNewDataAlertPolicy p1, boolean p2, android.hardware.contexthub.HubEndpointSession p3, android.hardware.contexthub.HubMessage p4) { return null; }
    public int size() { return 0; }
    public void updateSinkPolicy(android.hardware.contexthub.HubEndpointInfo p0, android.hardware.contexthub.DataFlowNewDataAlertPolicy p1, boolean p2) {}

    private final class ApiGuard implements java.lang.AutoCloseable {
        private ApiGuard(android.hardware.contexthub.DataFlowSource p0) {}
        public void close() {}
    }

    private static final class AsyncState {
        final android.hardware.contexthub.DataFlowData mData = null;
        final java.util.concurrent.Executor mExecutor = null;
        final android.hardware.contexthub.DataFlowSource.ApiGuard mGuard = null;
        final android.os.OutcomeReceiver<java.lang.Void, java.lang.Throwable> mReceiver = null;
        AsyncState(android.hardware.contexthub.DataFlowData p0, android.hardware.contexthub.DataFlowSource.ApiGuard p1, android.os.OutcomeReceiver<java.lang.Void, java.lang.Throwable> p2, java.util.concurrent.Executor p3) {}
    }
}
