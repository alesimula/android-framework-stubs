package android.telephony.data;

@android.annotation.SystemApi
public abstract class QualifiedNetworksService extends android.app.Service {
    private static final int QNS_APN_THROTTLE_STATUS_CHANGED = 5;
    private static final int QNS_CREATE_NETWORK_AVAILABILITY_PROVIDER = 1;
    private static final int QNS_EMERGENCY_DATA_NETWORK_PREFERRED_TRANSPORT_CHANGED = 6;
    private static final int QNS_RECONNECT_QUALIFIED_NETWORK = 8;
    private static final int QNS_REMOVE_ALL_NETWORK_AVAILABILITY_PROVIDERS = 3;
    private static final int QNS_REMOVE_NETWORK_AVAILABILITY_PROVIDER = 2;
    private static final int QNS_REQUEST_NETWORK_VALIDATION = 7;
    private static final int QNS_UPDATE_QUALIFIED_NETWORKS = 4;
    public static final java.lang.String QUALIFIED_NETWORKS_SERVICE_INTERFACE = "android.telephony.data.QualifiedNetworksService";
    private static final java.lang.String TAG = null;
    public final android.telephony.data.QualifiedNetworksService.IQualifiedNetworksServiceWrapper mBinder = null;
    private final android.telephony.data.QualifiedNetworksService.QualifiedNetworksServiceHandler mHandler = null;
    private final android.os.HandlerThread mHandlerThread = null;
    private final android.util.SparseArray<android.telephony.data.QualifiedNetworksService.NetworkAvailabilityProvider> mProviders = null;
    public QualifiedNetworksService() { super(); }
    private void log(java.lang.String p0) {}
    private void loge(java.lang.String p0) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract android.telephony.data.QualifiedNetworksService.NetworkAvailabilityProvider onCreateNetworkAvailabilityProvider(int p0);
    public void onDestroy() {}
    public boolean onUnbind(android.content.Intent p0) { return false; }

    private class IQualifiedNetworksServiceWrapper extends android.telephony.data.IQualifiedNetworksService.Stub {
        private IQualifiedNetworksServiceWrapper(android.telephony.data.QualifiedNetworksService p0) { super(); }
        public void createNetworkAvailabilityProvider(int p0, android.telephony.data.IQualifiedNetworksServiceCallback p1) {}
        public void removeNetworkAvailabilityProvider(int p0) {}
        public void reportEmergencyDataNetworkPreferredTransportChanged(int p0, int p1) {}
        public void reportThrottleStatusChanged(int p0, java.util.List<android.telephony.data.ThrottleStatus> p1) {}
    }

    public abstract class NetworkAvailabilityProvider implements java.lang.AutoCloseable {
        private android.telephony.data.IQualifiedNetworksServiceCallback mCallback;
        private android.util.SparseArray<int[]> mQualifiedNetworkTypesList;
        private final int mSlotIndex = 0;
        public NetworkAvailabilityProvider(android.telephony.data.QualifiedNetworksService p0, int p1) {}
        private void onReconnectQualifiedNetworkType(int p0, int p1) {}
        private void onRequestNetworkValidation(android.telephony.data.QualifiedNetworksService.NetworkValidationRequestData p0) {}
        private void onUpdateQualifiedNetworkTypes(int p0, int[] p1) {}
        private void registerForQualifiedNetworkTypesChanged(android.telephony.data.IQualifiedNetworksServiceCallback p0) {}
        public abstract void close();
        public final int getSlotIndex() { return 0; }
        public final void reconnectQualifiedNetworkType(int p0, int p1) {}
        public void reportEmergencyDataNetworkPreferredTransportChanged(int p0) {}
        public void reportThrottleStatusChanged(java.util.List<android.telephony.data.ThrottleStatus> p0) {}
        public void requestNetworkValidation(int p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
        public final void updateQualifiedNetworkTypes(int p0, java.util.List<java.lang.Integer> p1) {}
    }

    private static final class NetworkValidationRequestData {
        final com.android.internal.telephony.IIntegerConsumer mCallback = null;
        final int mNetworkCapability = 0;
        private NetworkValidationRequestData(int p0, com.android.internal.telephony.IIntegerConsumer p1) {}
    }

    private class QualifiedNetworksServiceHandler extends android.os.Handler {
        QualifiedNetworksServiceHandler(android.telephony.data.QualifiedNetworksService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
