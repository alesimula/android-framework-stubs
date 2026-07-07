package android.companion;

public final class CompanionDeviceManager {
    public static final java.lang.String EXTRA_ASSOCIATION = "android.companion.extra.ASSOCIATION";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_DEVICE = "android.companion.extra.DEVICE";
    public static final java.lang.String FEATURE_CROSS_DEVICE_SYNC = "cross_device_sync";
    public static final java.lang.String FEATURE_TASK_CONTINUITY = "task_continuity_manager";
    public static final int FLAG_AIRPLANE_MODE = 16;
    public static final int FLAG_CALL_METADATA = 1;
    public static final int FLAG_TASK_CONTINUITY = 2;
    @android.annotation.SystemApi
    public static final int FLAG_UNIVERSAL_CLIPBOARD = 8;
    public static final int FLAG_UNIVERSAL_MODES = 4;
    private static final int ICON_TARGET_SIZE = 24;
    public static final java.lang.String KEY_DEVICE_ID = "deviceId";
    public static final java.lang.String KEY_PAYLOAD = "payload";
    public static final int MESSAGE_ONEWAY_CROSS_DEVICE_SYNC = 1130850435;
    public static final int MESSAGE_ONEWAY_FROM_WEARABLE = 1131446919;
    public static final int MESSAGE_ONEWAY_INITIATE_CROSS_DEVICE_AUTHENTICATION = 1128875073;
    @android.annotation.SystemApi
    public static final int MESSAGE_ONEWAY_PCC = 1132488551;
    public static final int MESSAGE_ONEWAY_PING = 1132491640;
    public static final int MESSAGE_ONEWAY_TASK_CONTINUITY = 1130858628;
    public static final int MESSAGE_ONEWAY_TO_WEARABLE = 1132755335;
    public static final int MESSAGE_ONEWAY_TRUST_PAIRING = 1669624450;
    public static final int MESSAGE_REQUEST_CONTEXT_SYNC = 1667729539;
    public static final int MESSAGE_REQUEST_METADATA_UPDATE = 1668769925;
    public static final int MESSAGE_REQUEST_PERMISSION_RESTORE = 1669491075;
    public static final int MESSAGE_REQUEST_PING = 1669362552;
    public static final int MESSAGE_REQUEST_REMOTE_AUTHENTICATION = 1669494629;
    public static final int MESSAGE_REQUEST_TRUSTED_DEVICE = 1669621894;
    public static final java.lang.String REASON_CANCELED = "canceled";
    public static final java.lang.String REASON_DISCOVERY_TIMEOUT = "discovery_timeout";
    public static final java.lang.String REASON_INTERNAL_ERROR = "internal_error";
    public static final java.lang.String REASON_USER_REJECTED = "user_rejected";
    public static final int RESULT_CANCELED = 0;
    public static final int RESULT_DISCOVERY_TIMEOUT = 2;
    public static final int RESULT_INTERNAL_ERROR = 3;
    public static final int RESULT_OK = -1;
    public static final int RESULT_SECURITY_ERROR = 4;
    public static final int RESULT_USER_REJECTED = 1;
    private static final java.lang.String TAG = "CDM_CompanionDeviceManager";
    public static final int TRUST_PAIRING_ASSOCIATION_DOES_NOT_EXIST = 5;
    public static final int TRUST_PAIRING_CANCELED = 2;
    public static final int TRUST_PAIRING_FAILED_TO_CREATE_PAIRING_DIALOG = 3;
    public static final int TRUST_PAIRING_PIN_CODE_NOT_MATCHING = 4;
    public static final int TRUST_PAIRING_TRANSPORT_NOT_ATTACHED = 1;
    public static final int TRUST_PAIRING_UNKNOWN = 0;
    public static final int TRUST_TYPE_PROACTIVE_ASSISTANCE = 1;
    public static final int TRUST_TYPE_SCREEN_AUTOMATION = 0;
    private final android.content.Context mContext = null;
    private final java.util.ArrayList<android.companion.CompanionDeviceManager.OnAssociationsChangedListenerProxy> mListeners = null;
    private final android.util.SparseArray<java.util.Set<android.companion.CompanionDeviceManager.OnMessageReceivedListenerProxy>> mMessageReceivedListeners = null;
    private final android.companion.ICompanionDeviceManager mService = null;
    private final android.util.SparseArray<java.util.List<android.companion.CompanionDeviceManager.OnTransportEventListenerProxy>> mTransportEventListeners = null;
    private final android.util.SparseArray<android.companion.CompanionDeviceManager.Transport> mTransports = null;
    private final java.util.ArrayList<android.companion.CompanionDeviceManager.OnTransportsChangedListenerProxy> mTransportsChangedListeners = null;
    public CompanionDeviceManager(android.companion.ICompanionDeviceManager p0, android.content.Context p1) {}
    private android.graphics.drawable.Icon scaleIcon(android.graphics.drawable.Icon p0, android.content.Context p1) { return null; }
    @android.annotation.SystemApi
    public void addOnAssociationsChangedListener(java.util.concurrent.Executor p0, android.companion.CompanionDeviceManager.OnAssociationsChangedListener p1) {}
    public void addOnAssociationsChangedListener(java.util.concurrent.Executor p0, android.companion.CompanionDeviceManager.OnAssociationsChangedListener p1, int p2) {}
    @android.annotation.SystemApi
    public void addOnMessageReceivedListener(java.util.concurrent.Executor p0, int p1, java.util.function.BiConsumer<java.lang.Integer, byte[]> p2) {}
    public void addOnTransportEventListener(java.util.concurrent.Executor p0, int p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    public void addOnTransportsChangedListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.util.List<android.companion.AssociationInfo>> p1) {}
    public void associate(android.companion.AssociationRequest p0, android.companion.CompanionDeviceManager.Callback p1, android.os.Handler p2) {}
    public void associate(android.companion.AssociationRequest p0, java.util.concurrent.Executor p1, android.companion.CompanionDeviceManager.Callback p2) {}
    @android.annotation.SystemApi
    public void associate(java.lang.String p0, android.net.MacAddress p1, byte[] p2) {}
    public void attachSystemDataTransport(int p0, java.io.InputStream p1, java.io.OutputStream p2) throws android.companion.DeviceNotAssociatedException {}
    public android.content.IntentSender buildAssociationCancellationIntent() { return null; }
    public android.content.IntentSender buildPermissionTransferUserConsentIntent(int p0) throws android.companion.DeviceNotAssociatedException { return null; }
    @android.annotation.SystemApi
    public boolean canPairWithoutPrompt(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { return false; }
    @android.annotation.SystemApi
    public void clearOnActionResultListener(java.lang.String p0) {}
    public android.companion.DeviceId createAndSetDeviceId(int p0, android.companion.DeviceId p1) { return null; }
    public android.os.Bundle decryptPayload(byte[] p0) { return null; }
    public void detachSystemDataTransport(int p0) throws android.companion.DeviceNotAssociatedException {}
    public void disablePermissionsSync(int p0) {}
    public void disableSystemDataSyncForTypes(int p0, int p1) {}
    public void disassociate(int p0) {}
    @java.lang.Deprecated
    public void disassociate(java.lang.String p0) {}
    @java.lang.Deprecated
    public void dispatchMessage(int p0, int p1, byte[] p2) throws android.companion.DeviceNotAssociatedException {}
    public void enablePermissionsSync(int p0) {}
    public void enableSystemDataSyncForTypes(int p0, int p1) {}
    public byte[] encryptPayload(byte[] p0, android.companion.DeviceId p1) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.companion.AssociationInfo> getAllAssociations() { return null; }
    public java.util.List<android.companion.AssociationInfo> getAllAssociations(int p0) { return null; }
    public java.util.List<android.companion.AssociationInfo> getAllAssociationsWithTransports() { return null; }
    public android.companion.AssociationInfo getAssociationByDeviceId(int p0, android.companion.DeviceId p1) { return null; }
    @android.annotation.SystemApi
    public android.companion.AssociationInfo getAssociationByDeviceId(android.companion.DeviceId p0) { return null; }
    @java.lang.Deprecated
    public java.util.List<java.lang.String> getAssociations() { return null; }
    public android.os.PersistableBundle getLocalMetadata(int p0) { return null; }
    public java.util.List<android.companion.AssociationInfo> getMyAssociations() { return null; }
    public android.companion.datatransfer.PermissionSyncRequest getPermissionSyncRequest(int p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.companion.AssociationInfo> getTrustedAssociations() { return null; }
    @java.lang.Deprecated
    public boolean hasNotificationAccess(android.content.ComponentName p0) { return false; }
    public boolean isCompanionApplicationBound() { return false; }
    @android.annotation.SystemApi
    public boolean isDeviceAssociatedForWifiConnection(java.lang.String p0, android.net.MacAddress p1, android.os.UserHandle p2) { return false; }
    public boolean isDevicePresent(int p0) { return false; }
    public boolean isPermissionTransferUserConsented(int p0) { return false; }
    public boolean isSystemDataTransportAttached(int p0) { return false; }
    public void notifyActionResult(int p0, android.companion.ActionResult p1) {}
    @android.annotation.SystemApi
    public void notifyDeviceAppeared(int p0) {}
    @android.annotation.SystemApi
    public void notifyDeviceDisappeared(int p0) {}
    @android.annotation.SystemApi
    public void notifyDevicePresence(int p0, android.companion.DevicePresenceEvent p1) {}
    public void overrideTransportType(int p0) {}
    public boolean removeBond(int p0) { return false; }
    @android.annotation.SystemApi
    public void removeOnAssociationsChangedListener(android.companion.CompanionDeviceManager.OnAssociationsChangedListener p0) {}
    public void removeOnDevicePresenceEventListener(java.lang.String p0) {}
    @android.annotation.SystemApi
    public void removeOnMessageReceivedListener(int p0, java.util.function.BiConsumer<java.lang.Integer, byte[]> p1) {}
    public void removeOnTransportEventListener(int p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public void removeOnTransportsChangedListener(java.util.function.Consumer<java.util.List<android.companion.AssociationInfo>> p0) {}
    @android.annotation.SystemApi
    public void requestAction(android.companion.ActionRequest p0, java.lang.String p1, int[] p2) {}
    public void requestDeviceTrustPairing(int p0, android.companion.OutOfBandPairingRequest p1, int[] p2, java.util.concurrent.Executor p3, android.companion.CompanionDeviceManager.TrustPairingCallback p4) {}
    public void requestNotificationAccess(android.content.ComponentName p0) {}
    @android.annotation.SystemApi
    public void sendMessage(int p0, byte[] p1, int[] p2) {}
    @java.lang.Deprecated
    public void setDeviceId(int p0, android.companion.DeviceId p1) {}
    public void setLocalMetadata(int p0, java.lang.String p1, android.os.PersistableBundle p2) {}
    @android.annotation.SystemApi
    public void setOnActionResultListener(int[] p0, java.lang.String p1, java.util.concurrent.Executor p2, java.util.function.BiConsumer<java.lang.Integer, android.companion.ActionResult> p3) {}
    public void setOnDevicePresenceEventListener(int[] p0, java.lang.String p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.companion.DevicePresenceEvent> p3) {}
    public void setRequestActionAllowList(java.util.List<java.lang.String> p0) {}
    public void startObservingDevicePresence(android.companion.ObservingDevicePresenceRequest p0) {}
    @java.lang.Deprecated
    public void startObservingDevicePresence(java.lang.String p0) throws android.companion.DeviceNotAssociatedException {}
    @java.lang.Deprecated
    public void startSystemDataTransfer(int p0) throws android.companion.DeviceNotAssociatedException {}
    public void startSystemDataTransfer(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.companion.CompanionException> p2) throws android.companion.DeviceNotAssociatedException {}
    public void stopObservingDevicePresence(android.companion.ObservingDevicePresenceRequest p0) {}
    @java.lang.Deprecated
    public void stopObservingDevicePresence(java.lang.String p0) throws android.companion.DeviceNotAssociatedException {}

    private static class AssociationRequestCallbackProxy extends android.companion.IAssociationRequestCallback.Stub {
        private final android.companion.CompanionDeviceManager.Callback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.os.Handler mHandler = null;
        private AssociationRequestCallbackProxy(android.os.Handler p0, android.companion.CompanionDeviceManager.Callback p1) { super(); }
        private AssociationRequestCallbackProxy(java.util.concurrent.Executor p0, android.companion.CompanionDeviceManager.Callback p1) { super(); }
        private <T extends java.lang.Object, U extends java.lang.Object> void execute(java.util.function.BiConsumer<T, U> p0, T p1, U p2) {}
        private <T extends java.lang.Object> void execute(java.util.function.Consumer<T> p0, T p1) {}
        public void onAssociationCreated(android.companion.AssociationInfo p0) {}
        public void onAssociationPending(android.app.PendingIntent p0) {}
        public void onFailure(int p0, java.lang.CharSequence p1) {}
    }

    public static abstract class Callback {
        public Callback() {}
        public void onAssociationCreated(android.companion.AssociationInfo p0) {}
        public void onAssociationPending(android.content.IntentSender p0) {}
        @java.lang.Deprecated
        public void onDeviceFound(android.content.IntentSender p0) {}
        public void onFailure(int p0, java.lang.CharSequence p1) {}
        public abstract void onFailure(java.lang.CharSequence p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataSyncTypes {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FeatureName {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MessageType {
    }

    private static class OnActionResultListenerProxy extends android.companion.IOnActionResultListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.function.BiConsumer<java.lang.Integer, android.companion.ActionResult> mListener = null;
        private OnActionResultListenerProxy(java.util.concurrent.Executor p0, java.util.function.BiConsumer<java.lang.Integer, android.companion.ActionResult> p1) { super(); }
        public void onActionResult(int p0, android.companion.ActionResult p1) {}
    }

    @android.annotation.SystemApi
    public static interface OnAssociationsChangedListener {
        public void onAssociationsChanged(java.util.List<android.companion.AssociationInfo> p0);
    }

    private static class OnAssociationsChangedListenerProxy extends android.companion.IOnAssociationsChangedListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.companion.CompanionDeviceManager.OnAssociationsChangedListener mListener = null;
        private OnAssociationsChangedListenerProxy(java.util.concurrent.Executor p0, android.companion.CompanionDeviceManager.OnAssociationsChangedListener p1) { super(); }
        public void onAssociationsChanged(java.util.List<android.companion.AssociationInfo> p0) {}
    }

    private static class OnDevicePresenceEventListenerProxy extends android.companion.IOnDevicePresenceEventListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.function.Consumer<android.companion.DevicePresenceEvent> mListener = null;
        private OnDevicePresenceEventListenerProxy(java.util.concurrent.Executor p0, java.util.function.Consumer<android.companion.DevicePresenceEvent> p1) { super(); }
        public void onDevicePresence(android.companion.DevicePresenceEvent p0) {}
    }

    private static class OnMessageReceivedListenerProxy extends android.companion.IOnMessageReceivedListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.function.BiConsumer<java.lang.Integer, byte[]> mListener = null;
        private OnMessageReceivedListenerProxy(java.util.concurrent.Executor p0, java.util.function.BiConsumer<java.lang.Integer, byte[]> p1) { super(); }
        public void onMessageReceived(int p0, byte[] p1) {}
    }

    private static class OnTransportEventListenerProxy extends android.companion.IOnTransportEventListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.function.Consumer<java.lang.Integer> mListener = null;
        private OnTransportEventListenerProxy(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) { super(); }
        public void onTransportEvent(int p0) {}
    }

    private static class OnTransportsChangedListenerProxy extends android.companion.IOnTransportsChangedListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.function.Consumer<java.util.List<android.companion.AssociationInfo>> mListener = null;
        private OnTransportsChangedListenerProxy(java.util.concurrent.Executor p0, java.util.function.Consumer<java.util.List<android.companion.AssociationInfo>> p1) { super(); }
        public void onTransportsChanged(java.util.List<android.companion.AssociationInfo> p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }

    private static class SystemDataTransferCallbackProxy extends android.companion.ISystemDataTransferCallback.Stub {
        private final android.os.OutcomeReceiver<java.lang.Void, android.companion.CompanionException> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private SystemDataTransferCallbackProxy(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, android.companion.CompanionException> p1) { super(); }
        public void onError(java.lang.String p0) {}
        public void onResult() {}
    }

    private class Transport {
        private final int mAssociationId = 0;
        private java.io.InputStream mLocalIn;
        private java.io.OutputStream mLocalOut;
        private final java.io.InputStream mRemoteIn = null;
        private final java.io.OutputStream mRemoteOut = null;
        private volatile boolean mStopped;
        Transport(android.companion.CompanionDeviceManager p0, int p1, java.io.InputStream p2, java.io.OutputStream p3) {}
        private void copyWithFlushing(java.io.InputStream p0, java.io.OutputStream p1) throws java.io.IOException {}
        public void start() throws java.io.IOException {}
        public void stop() {}
    }

    public static abstract class TrustPairingCallback {
        public TrustPairingCallback() {}
        public abstract void onDeviceTrusted(android.companion.AssociationInfo p0);
        public abstract void onFailure(int p0);
        public abstract void onTrustPairingCanceledFromRemote(android.companion.AssociationInfo p0, android.content.IntentSender p1);
        public abstract void onTrustPairingPending(android.content.IntentSender p0);
    }

    private static class TrustPairingCallbackProxy extends android.companion.ITrustPairingCallback.Stub {
        private final android.companion.CompanionDeviceManager.TrustPairingCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        TrustPairingCallbackProxy(java.util.concurrent.Executor p0, android.companion.CompanionDeviceManager.TrustPairingCallback p1) { super(); }
        public void onDeviceTrusted(android.companion.AssociationInfo p0) {}
        public void onFailure(int p0) {}
        public void onTrustPairingCanceledFromRemote(android.companion.AssociationInfo p0, android.content.IntentSender p1) {}
        public void onTrustPairingPending(android.content.IntentSender p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TrustPairingErrorCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TrustType {
    }
}
