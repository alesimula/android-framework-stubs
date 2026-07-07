package android.companion;

public abstract class CompanionDeviceService extends android.app.Service {
    private static final java.lang.String LOG_TAG = "CDM_CompanionDeviceService";
    public static final java.lang.String SERVICE_INTERFACE = "android.companion.CompanionDeviceService";
    private final android.companion.CompanionDeviceService.Stub mRemote = null;
    public CompanionDeviceService() { super(); }
    public final void attachSystemDataTransport(int p0, java.io.InputStream p1, java.io.OutputStream p2) throws android.companion.DeviceNotAssociatedException {}
    public final void detachSystemDataTransport(int p0) throws android.companion.DeviceNotAssociatedException {}
    @java.lang.Deprecated
    public final void dispatchMessageToSystem(int p0, int p1, byte[] p2) throws android.companion.DeviceNotAssociatedException {}
    public void onActionRequested(android.companion.AssociationInfo p0, android.companion.ActionRequest p1) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onBindCompanionDeviceService(android.content.Intent p0) {}
    @java.lang.Deprecated
    public void onDeviceAppeared(android.companion.AssociationInfo p0) {}
    @java.lang.Deprecated
    public void onDeviceAppeared(java.lang.String p0) {}
    @java.lang.Deprecated
    public void onDeviceDisappeared(android.companion.AssociationInfo p0) {}
    @java.lang.Deprecated
    public void onDeviceDisappeared(java.lang.String p0) {}
    public void onDevicePresenceEvent(android.companion.DevicePresenceEvent p0) {}
    public void onDeviceTrusted(android.companion.AssociationInfo p0) {}
    @java.lang.Deprecated
    public void onMessageDispatchedFromSystem(int p0, int p1, byte[] p2) {}
    public void onTrustPairingCanceledFromRemote(android.companion.AssociationInfo p0, android.content.IntentSender p1) {}
    public void onTrustPairingFailure(android.companion.AssociationInfo p0, int p1) {}
    public void onTrustPairingResponsePending(android.companion.AssociationInfo p0, android.content.IntentSender p1) {}

    private class Stub extends android.companion.ICompanionDeviceService.Stub {
        final android.os.Handler mMainHandler = null;
        final android.companion.CompanionDeviceService mService = null;
        private Stub(android.companion.CompanionDeviceService p0) { super(); }
        public void onActionRequested(android.companion.AssociationInfo p0, android.companion.ActionRequest p1) {}
        public void onDeviceAppeared(android.companion.AssociationInfo p0) {}
        public void onDeviceDisappeared(android.companion.AssociationInfo p0) {}
        public void onDevicePresenceEvent(android.companion.DevicePresenceEvent p0) {}
        public void onDeviceTrusted(android.companion.AssociationInfo p0) {}
        public void onTrustPairingCanceledFromRemote(android.companion.AssociationInfo p0, android.content.IntentSender p1) {}
        public void onTrustPairingFailure(android.companion.AssociationInfo p0, int p1) {}
        public void onTrustPairingResponsePending(android.companion.AssociationInfo p0, android.content.IntentSender p1) {}
    }
}
