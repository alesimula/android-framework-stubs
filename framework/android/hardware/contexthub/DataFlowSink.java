package android.hardware.contexthub;

@android.annotation.SystemApi
public final class DataFlowSink implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "DataFlowSink";
    private android.hardware.contexthub.DataFlowSink.AsyncState mAsyncState;
    private java.util.concurrent.atomic.AtomicBoolean mCancellationStarted;
    private java.util.concurrent.atomic.AtomicBoolean mCancelled;
    private final android.util.CloseGuard mCloseGuard = null;
    private boolean mClosed;
    private final android.hardware.contexthub.DataFlowDataConfig mConfig = null;
    private final android.hardware.contexthub.DataFlowSinkContext mContext = null;
    private final android.hardware.contexthub.HubEndpoint mEndpoint = null;
    private java.util.concurrent.atomic.AtomicBoolean mIsBusy;
    private java.util.concurrent.CompletableFuture<java.lang.Void> mNotificationFuture;
    private final java.lang.Object mNotificationLock = null;
    DataFlowSink(android.hardware.contexthub.DataFlowDataConfig p0, android.hardware.contexthub.DataFlowSinkContext p1, android.hardware.contexthub.HubEndpoint p2) {}
    private android.hardware.contexthub.DataFlowSink.ApiGuard acquireApiGuard() { return null; }
    private void awaitDataAsyncRunnable(android.hardware.contexthub.DataFlowSink.AsyncState p0) {}
    private void checkCancelled() {}
    private android.hardware.contexthub.DataFlowData requestDataInternal(int p0, boolean p1) { return null; }
    public android.hardware.contexthub.DataFlowData awaitData(int p0, java.time.Duration p1) throws java.util.concurrent.TimeoutException { return null; }
    public void awaitDataAsync(int p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.hardware.contexthub.DataFlowData, java.lang.Throwable> p3) {}
    public boolean canSourceOverwriteReadPosition() { return false; }
    void cancel() {}
    public void close() {}
    void closeInternal(boolean p0) {}
    public android.hardware.contexthub.DataFlowDataConfig getDataFlowConfig() { return null; }
    android.hardware.contexthub.DataFlowId getDataFlowId() { return null; }
    public boolean isEmpty() { return false; }
    boolean onNotificationCallback(int p0) { return false; }
    public android.hardware.contexthub.DataFlowData readData(int p0, boolean p1) { return null; }
    public void seekToSource(int p0) {}
    public int size() { return 0; }

    private final class ApiGuard implements java.lang.AutoCloseable {
        private ApiGuard(android.hardware.contexthub.DataFlowSink p0) {}
        public void close() {}
    }

    private static final class AsyncState {
        final int mElementCount = 0;
        final java.util.concurrent.Executor mExecutor = null;
        final android.hardware.contexthub.DataFlowSink.ApiGuard mGuard = null;
        final android.os.OutcomeReceiver<android.hardware.contexthub.DataFlowData, java.lang.Throwable> mReceiver = null;
        AsyncState(int p0, android.hardware.contexthub.DataFlowSink.ApiGuard p1, android.os.OutcomeReceiver<android.hardware.contexthub.DataFlowData, java.lang.Throwable> p2, java.util.concurrent.Executor p3) {}
    }
}
