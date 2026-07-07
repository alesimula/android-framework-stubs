package android.hardware.contexthub;

@android.annotation.SystemApi
public class HubEndpoint {
    private static final int NATIVE_ADD_OFFLOAD_SINK_ARRAY_SIZE = 2;
    private static final int NATIVE_CREATE_DATA_FLOW_INFO_ARRAY_SIZE = 4;
    private static final int NATIVE_ELEMENT_SIZE_VARIABLE = -1;
    private static final int NATIVE_ENABLE_HOST_SINK_ARRAY_SIZE = 2;
    public static final int REASON_CLOSE_ENDPOINT_SESSION_REQUESTED = 4;
    public static final int REASON_ENDPOINT_INVALID = 5;
    public static final int REASON_ENDPOINT_STOPPED = 6;
    public static final int REASON_FAILURE = 0;
    public static final int REASON_OPEN_ENDPOINT_SESSION_REQUEST_REJECTED = 3;
    public static final int REASON_PERMISSION_DENIED = 9;
    private static final java.lang.String TAG = "HubEndpoint";
    private final android.util.SparseArray<android.hardware.contexthub.HubEndpointSession> mActiveSessions = null;
    private android.hardware.contexthub.HubEndpointInfo mAssignedHubEndpointInfo;
    private final android.hardware.contexthub.DataFlowCallback mDataFlowCallback = null;
    private final java.util.concurrent.Executor mDataFlowCallbackExecutor = null;
    private final android.os.Looper mEpollLooper = null;
    private android.hardware.contexthub.HubEndpoint.DataFlowJniCallback mJniCallback;
    private final android.hardware.contexthub.HubEndpointLifecycleCallback mLifecycleCallback = null;
    private final java.util.concurrent.Executor mLifecycleCallbackExecutor = null;
    private final java.lang.Object mLock = null;
    private final android.hardware.contexthub.HubEndpointMessageCallback mMessageCallback = null;
    private final java.util.concurrent.Executor mMessageCallbackExecutor = null;
    private long mNativeHandle;
    private final java.lang.Object mNativeLock = null;
    private final android.hardware.contexthub.HubEndpointInfo mPendingHubEndpointInfo = null;
    private final android.hardware.contexthub.IContextHubEndpointCallback mServiceCallback = null;
    private android.hardware.contexthub.IContextHubEndpoint mServiceToken;
    private final java.util.Map<android.hardware.contexthub.HubEndpoint.DataFlowIdWrapper, android.hardware.contexthub.DataFlowSink> mSinks = null;
    private final java.util.Map<java.lang.Integer, android.hardware.contexthub.DataFlowSource> mSources = null;
    private HubEndpoint(android.hardware.contexthub.HubEndpointInfo p0, android.hardware.contexthub.HubEndpointLifecycleCallback p1, java.util.concurrent.Executor p2, android.hardware.contexthub.HubEndpointMessageCallback p3, java.util.concurrent.Executor p4, android.hardware.contexthub.DataFlowCallback p5, java.util.concurrent.Executor p6, android.os.Looper p7) {}
    private static void closeDataFlowAlertFds(android.hardware.contexthub.DataFlowAlertFds p0) throws java.io.IOException {}
    private static void closeDataFlowInfoRegionFds(android.hardware.contexthub.DataFlowInfo p0) throws java.io.IOException {}
    private static void closeDataFlowSinkContextRegionFds(android.hardware.contexthub.DataFlowSinkContext p0) throws java.io.IOException {}
    private static void closeSharedDataRegionFd(android.hardware.contexthub.SharedDataRegion p0) throws java.io.IOException {}
    private android.hardware.contexthub.DataFlowSink createDataFlowSink(android.hardware.contexthub.DataFlowDataConfig p0, android.hardware.contexthub.DataFlowSinkContext p1) { return null; }
    private android.hardware.contexthub.DataFlowDataConfig enableHostSinkFromContext(android.hardware.contexthub.DataFlowSinkContext p0, android.hardware.contexthub.HubEndpointInfo.HubEndpointIdentifier p1) { return null; }
    private android.hardware.contexthub.HubEndpointSession getActiveSession(int p0) { return null; }
    private void handleSinkDisconnected(android.hardware.contexthub.DataFlowSink p0) {}
    private native boolean native_activateDataFlow(long p0, int p1, int p2);
    private native int[] native_addOffloadSink(long p0, int p1, long p2, long p3);
    private native int native_addOffloadSinkInPrimaryRegion(long p0, int p1, long p2, long p3, int p4, int p5, boolean p6);
    private native int[] native_createDataFlowInfo(long p0, int p1, long p2, int p3, int p4, int p5, int p6, int p7);
    private native void native_deinit(long p0);
    private native int[] native_enableHostSink(long p0, int p1, long p2, int p3, int p4, long p5, int p6, long p7, int p8, long p9, int p10, int p11, int p12, int p13, int p14, long p15, long p16);
    private static native int[] native_getSharedDataSupportVersion();
    private native long native_init(android.os.MessageQueue p0, android.hardware.contexthub.HubEndpoint.DataFlowJniCallback p1, long p2, long p3);
    private native int native_mapOffloadSinkRegion(long p0, int p1, int p2, long p3, long p4, int p5, long p6, int p7, int p8, int p9, boolean p10);
    private native void native_removeHostSink(long p0, long p1, int p2);
    private native void native_removeHostSource(long p0, int p1);
    private native void native_removeOffloadSink(long p0, int p1, long p2, long p3);
    private native byte[] native_sinkRequestData(long p0, long p1, int p2, int p3);
    private native int native_sinkSize(long p0, long p1, int p2);
    private native boolean native_sinkSourceCanOverwriteReadPosition(long p0, long p1, int p2);
    private native boolean native_sinkSyncToSource(long p0, long p1, int p2, int p3);
    private native boolean native_sourceFull(long p0, int p1);
    private native int native_sourcePush(long p0, int p1, byte[] p2, int p3, int p4, boolean p5);
    private native int native_sourceSize(long p0, int p1, boolean p2);
    private native void native_updateSinkPolicy(long p0, int p1, long p2, long p3, int p4, int p5, boolean p6);
    private native int native_variableDataSinkGetCount(long p0, long p1, int p2, int p3);
    private void reportHostSinkGone(android.hardware.contexthub.DataFlowId p0, java.lang.String p1) {}
    public void closeSession(android.hardware.contexthub.HubEndpointSession p0) {}
    public android.hardware.contexthub.DataFlowSource createDataFlowSource(java.util.Set<java.lang.Long> p0, android.hardware.contexthub.DataFlowDataConfig p1, int p2, int p3) { return null; }
    public android.hardware.contexthub.DataFlowCallback getDataFlowCallback() { return null; }
    java.util.concurrent.Executor getDataFlowCallbackExecutor() { return null; }
    public android.os.Looper getEpollLooper() { return null; }
    public android.hardware.contexthub.HubEndpointLifecycleCallback getLifecycleCallback() { return null; }
    public android.hardware.contexthub.HubEndpointMessageCallback getMessageCallback() { return null; }
    public java.util.Collection<android.hardware.contexthub.HubServiceInfo> getServiceInfoCollection() { return null; }
    public java.lang.String getTag() { return null; }
    public int getVersion() { return 0; }
    public void openSession(android.hardware.contexthub.HubEndpointInfo p0, java.lang.String p1) {}
    public void register(android.hardware.location.IContextHubService p0) {}
    void removeHostDataFlow(java.util.Optional<java.lang.Integer> p0, java.util.Optional<java.lang.Integer> p1) {}
    void removeOffloadSink(android.hardware.contexthub.SharedDataRegion p0, android.hardware.contexthub.HubEndpointInfo p1) {}
    void removeSink(android.hardware.contexthub.DataFlowId p0, boolean p1) {}
    void sendMessage(android.hardware.contexthub.HubEndpointSession p0, android.hardware.contexthub.HubMessage p1, android.hardware.location.IContextHubTransactionCallback p2) {}
    android.hardware.location.ContextHubTransaction<java.lang.Void> shareDataFlow(android.hardware.contexthub.SharedDataRegion p0, android.hardware.contexthub.DataFlowInfo p1, android.hardware.contexthub.DataFlowId p2, android.hardware.contexthub.HubEndpointInfo p3, android.hardware.contexthub.DataFlowNewDataAlertPolicy p4, boolean p5, android.hardware.contexthub.HubEndpointSession p6, android.hardware.contexthub.HubMessage p7) throws java.lang.IllegalStateException { return null; }
    android.hardware.contexthub.DataFlowData sinkRequestData(android.hardware.contexthub.DataFlowSink p0, int p1, boolean p2) { return null; }
    int sinkSize(android.hardware.contexthub.DataFlowSink p0) { return 0; }
    boolean sinkSourceCanOverwriteReadPosition(android.hardware.contexthub.DataFlowSink p0) { return false; }
    void sinkSyncToSource(android.hardware.contexthub.DataFlowSink p0, int p1) {}
    boolean sourceFull(android.hardware.contexthub.SharedDataRegion p0) { return false; }
    int sourcePush(android.hardware.contexthub.SharedDataRegion p0, android.hardware.contexthub.DataFlowData p1, boolean p2) { return 0; }
    int sourceSize(android.hardware.contexthub.SharedDataRegion p0) { return 0; }
    public void unregister() {}
    void updateSinkPolicy(android.hardware.contexthub.SharedDataRegion p0, android.hardware.contexthub.HubEndpointInfo p1, android.hardware.contexthub.DataFlowNewDataAlertPolicy p2, boolean p3) {}

    public static final class Builder {
        private android.hardware.contexthub.DataFlowCallback mDataFlowCallback;
        private java.util.concurrent.Executor mDataFlowCallbackExecutor;
        private android.os.Looper mEpollLooper;
        private android.hardware.contexthub.HubEndpointLifecycleCallback mLifecycleCallback;
        private java.util.concurrent.Executor mLifecycleCallbackExecutor;
        private final java.util.concurrent.Executor mMainExecutor = null;
        private android.hardware.contexthub.HubEndpointMessageCallback mMessageCallback;
        private java.util.concurrent.Executor mMessageCallbackExecutor;
        private final java.lang.String mPackageName = null;
        private java.util.List<android.hardware.contexthub.HubServiceInfo> mServiceInfos;
        private java.lang.String mTag;
        private int mVersion;
        public Builder(android.content.Context p0) {}
        public android.hardware.contexthub.HubEndpoint build() { return null; }
        public android.hardware.contexthub.HubEndpoint.Builder setDataFlowCallback(android.hardware.contexthub.DataFlowCallback p0) { return null; }
        public android.hardware.contexthub.HubEndpoint.Builder setDataFlowCallback(java.util.concurrent.Executor p0, android.hardware.contexthub.DataFlowCallback p1) { return null; }
        public android.hardware.contexthub.HubEndpoint.Builder setEpollLooper(android.os.Looper p0) { return null; }
        public android.hardware.contexthub.HubEndpoint.Builder setLifecycleCallback(android.hardware.contexthub.HubEndpointLifecycleCallback p0) { return null; }
        public android.hardware.contexthub.HubEndpoint.Builder setLifecycleCallback(java.util.concurrent.Executor p0, android.hardware.contexthub.HubEndpointLifecycleCallback p1) { return null; }
        public android.hardware.contexthub.HubEndpoint.Builder setMessageCallback(android.hardware.contexthub.HubEndpointMessageCallback p0) { return null; }
        public android.hardware.contexthub.HubEndpoint.Builder setMessageCallback(java.util.concurrent.Executor p0, android.hardware.contexthub.HubEndpointMessageCallback p1) { return null; }
        public android.hardware.contexthub.HubEndpoint.Builder setServiceInfoCollection(java.util.Collection<android.hardware.contexthub.HubServiceInfo> p0) { return null; }
        public android.hardware.contexthub.HubEndpoint.Builder setTag(java.lang.String p0) { return null; }
        public android.hardware.contexthub.HubEndpoint.Builder setVersion(int p0) { return null; }
    }

    private static final class CloseableDataFlowInfo implements java.lang.AutoCloseable {
        android.hardware.contexthub.DataFlowInfo info;
        CloseableDataFlowInfo(android.hardware.contexthub.DataFlowInfo p0) {}
        public void close() {}
    }

    private static final class CloseableDataFlowSinkContext implements java.lang.AutoCloseable {
        android.hardware.contexthub.DataFlowSinkContext context;
        CloseableDataFlowSinkContext(android.hardware.contexthub.DataFlowSinkContext p0) {}
        public void close() {}
    }

    private static final class DataFlowIdWrapper {
        private final android.hardware.contexthub.DataFlowId id = null;
        DataFlowIdWrapper(android.hardware.contexthub.DataFlowId p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static interface DataFlowJniCallback {
        public void onNotificationCallback(long p0, int p1, boolean p2);
    }

    static interface EndpointConsumer {
        public void accept(android.hardware.contexthub.IContextHubEndpoint p0) throws android.os.RemoteException;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Reason {
    }
}
