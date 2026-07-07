package android.companion;

public interface ICompanionDeviceManager extends android.os.IInterface {
    public void addOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException;
    public void addOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException;
    public void addOnTransportEventListener(int p0, android.companion.IOnTransportEventListener p1) throws android.os.RemoteException;
    public void addOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException;
    public void applyRestoredPayload(byte[] p0, int p1) throws android.os.RemoteException;
    public void associate(android.companion.AssociationRequest p0, android.companion.IAssociationRequestCallback p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void attachSystemDataTransport(java.lang.String p0, int p1, int p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException;
    public android.app.PendingIntent buildAssociationCancellationIntent(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.app.PendingIntent buildPermissionTransferUserConsentIntent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean canPairWithoutPrompt(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void clearOnActionResultListener(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void createAssociation(java.lang.String p0, java.lang.String p1, int p2, byte[] p3) throws android.os.RemoteException;
    public android.os.Bundle decryptPayload(byte[] p0) throws android.os.RemoteException;
    public void detachSystemDataTransport(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void disablePermissionsSync(int p0) throws android.os.RemoteException;
    public void disableSystemDataSync(int p0, int p1) throws android.os.RemoteException;
    public void disassociate(int p0) throws android.os.RemoteException;
    public void enablePermissionsSync(int p0) throws android.os.RemoteException;
    public void enableSystemDataSync(int p0, int p1) throws android.os.RemoteException;
    public byte[] encryptPayload(byte[] p0, android.companion.DeviceId p1) throws android.os.RemoteException;
    public java.util.List<android.companion.AssociationInfo> getAllAssociationsForUser(int p0) throws android.os.RemoteException;
    public java.util.List<android.companion.AssociationInfo> getAllAssociationsWithTransports() throws android.os.RemoteException;
    public android.companion.AssociationInfo getAssociationByDeviceId(int p0, android.companion.DeviceId p1) throws android.os.RemoteException;
    public java.util.List<android.companion.AssociationInfo> getAssociations(java.lang.String p0, int p1) throws android.os.RemoteException;
    public byte[] getBackupPayload(int p0) throws android.os.RemoteException;
    public android.os.PersistableBundle getLocalMetadata(int p0) throws android.os.RemoteException;
    public android.companion.datatransfer.PermissionSyncRequest getPermissionSyncRequest(int p0) throws android.os.RemoteException;
    public java.util.List<android.companion.AssociationInfo> getTrustedAssociationsForUser(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public boolean hasNotificationAccess(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isCompanionApplicationBound(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isDeviceAssociatedForWifiConnection(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean isDevicePresent(int p0) throws android.os.RemoteException;
    public boolean isPermissionTransferUserConsented(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isSystemDataTransportAttached(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void legacyDisassociate(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void legacyStartObservingDevicePresence(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void legacyStopObservingDevicePresence(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void notifyActionResult(int p0, android.companion.ActionResult p1) throws android.os.RemoteException;
    public void notifyDevicePresence(int p0, android.companion.DevicePresenceEvent p1) throws android.os.RemoteException;
    public void notifySelfManagedDeviceAppeared(int p0) throws android.os.RemoteException;
    public void notifySelfManagedDeviceDisappeared(int p0) throws android.os.RemoteException;
    public void overrideTransportType(int p0) throws android.os.RemoteException;
    public boolean removeBond(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void removeOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException;
    public void removeOnDevicePresenceEventListener(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void removeOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException;
    public void removeOnTransportEventListener(int p0, android.companion.IOnTransportEventListener p1) throws android.os.RemoteException;
    public void removeOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException;
    public void requestAction(android.companion.ActionRequest p0, java.lang.String p1, java.lang.String p2, int[] p3) throws android.os.RemoteException;
    public void requestDeviceTrustPairing(int p0, android.companion.OutOfBandPairingRequest p1, int[] p2, android.companion.ITrustPairingCallback p3) throws android.os.RemoteException;
    public android.app.PendingIntent requestNotificationAccess(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void sendMessage(int p0, byte[] p1, int[] p2) throws android.os.RemoteException;
    public android.companion.DeviceId setDeviceId(int p0, android.companion.DeviceId p1) throws android.os.RemoteException;
    public void setLocalMetadata(int p0, java.lang.String p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public void setOnActionResultListener(int[] p0, java.lang.String p1, java.lang.String p2, android.companion.IOnActionResultListener p3) throws android.os.RemoteException;
    public void setOnDevicePresenceEventListener(int[] p0, java.lang.String p1, android.companion.IOnDevicePresenceEventListener p2, int p3) throws android.os.RemoteException;
    public void setRequestActionAllowList(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void startObservingDevicePresence(android.companion.ObservingDevicePresenceRequest p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void startSystemDataTransfer(java.lang.String p0, int p1, int p2, android.companion.ISystemDataTransferCallback p3) throws android.os.RemoteException;
    public void stopObservingDevicePresence(android.companion.ObservingDevicePresenceRequest p0, java.lang.String p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.companion.ICompanionDeviceManager {
        public Default() {}
        public void addOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException {}
        public void addOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException {}
        public void addOnTransportEventListener(int p0, android.companion.IOnTransportEventListener p1) throws android.os.RemoteException {}
        public void addOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException {}
        public void applyRestoredPayload(byte[] p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void associate(android.companion.AssociationRequest p0, android.companion.IAssociationRequestCallback p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void attachSystemDataTransport(java.lang.String p0, int p1, int p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
        public android.app.PendingIntent buildAssociationCancellationIntent(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.app.PendingIntent buildPermissionTransferUserConsentIntent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public boolean canPairWithoutPrompt(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public void clearOnActionResultListener(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void createAssociation(java.lang.String p0, java.lang.String p1, int p2, byte[] p3) throws android.os.RemoteException {}
        public android.os.Bundle decryptPayload(byte[] p0) throws android.os.RemoteException { return null; }
        public void detachSystemDataTransport(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void disablePermissionsSync(int p0) throws android.os.RemoteException {}
        public void disableSystemDataSync(int p0, int p1) throws android.os.RemoteException {}
        public void disassociate(int p0) throws android.os.RemoteException {}
        public void enablePermissionsSync(int p0) throws android.os.RemoteException {}
        public void enableSystemDataSync(int p0, int p1) throws android.os.RemoteException {}
        public byte[] encryptPayload(byte[] p0, android.companion.DeviceId p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.companion.AssociationInfo> getAllAssociationsForUser(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.companion.AssociationInfo> getAllAssociationsWithTransports() throws android.os.RemoteException { return null; }
        public android.companion.AssociationInfo getAssociationByDeviceId(int p0, android.companion.DeviceId p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.companion.AssociationInfo> getAssociations(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public byte[] getBackupPayload(int p0) throws android.os.RemoteException { return null; }
        public android.os.PersistableBundle getLocalMetadata(int p0) throws android.os.RemoteException { return null; }
        public android.companion.datatransfer.PermissionSyncRequest getPermissionSyncRequest(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.companion.AssociationInfo> getTrustedAssociationsForUser(int p0) throws android.os.RemoteException { return null; }
        @java.lang.Deprecated
        public boolean hasNotificationAccess(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isCompanionApplicationBound(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isDeviceAssociatedForWifiConnection(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isDevicePresent(int p0) throws android.os.RemoteException { return false; }
        public boolean isPermissionTransferUserConsented(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isSystemDataTransportAttached(int p0) throws android.os.RemoteException { return false; }
        @java.lang.Deprecated
        public void legacyDisassociate(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void legacyStartObservingDevicePresence(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void legacyStopObservingDevicePresence(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void notifyActionResult(int p0, android.companion.ActionResult p1) throws android.os.RemoteException {}
        public void notifyDevicePresence(int p0, android.companion.DevicePresenceEvent p1) throws android.os.RemoteException {}
        public void notifySelfManagedDeviceAppeared(int p0) throws android.os.RemoteException {}
        public void notifySelfManagedDeviceDisappeared(int p0) throws android.os.RemoteException {}
        public void overrideTransportType(int p0) throws android.os.RemoteException {}
        public boolean removeBond(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public void removeOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException {}
        public void removeOnDevicePresenceEventListener(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void removeOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException {}
        public void removeOnTransportEventListener(int p0, android.companion.IOnTransportEventListener p1) throws android.os.RemoteException {}
        public void removeOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException {}
        public void requestAction(android.companion.ActionRequest p0, java.lang.String p1, java.lang.String p2, int[] p3) throws android.os.RemoteException {}
        public void requestDeviceTrustPairing(int p0, android.companion.OutOfBandPairingRequest p1, int[] p2, android.companion.ITrustPairingCallback p3) throws android.os.RemoteException {}
        public android.app.PendingIntent requestNotificationAccess(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
        public void sendMessage(int p0, byte[] p1, int[] p2) throws android.os.RemoteException {}
        public android.companion.DeviceId setDeviceId(int p0, android.companion.DeviceId p1) throws android.os.RemoteException { return null; }
        public void setLocalMetadata(int p0, java.lang.String p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public void setOnActionResultListener(int[] p0, java.lang.String p1, java.lang.String p2, android.companion.IOnActionResultListener p3) throws android.os.RemoteException {}
        public void setOnDevicePresenceEventListener(int[] p0, java.lang.String p1, android.companion.IOnDevicePresenceEventListener p2, int p3) throws android.os.RemoteException {}
        public void setRequestActionAllowList(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public void startObservingDevicePresence(android.companion.ObservingDevicePresenceRequest p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void startSystemDataTransfer(java.lang.String p0, int p1, int p2, android.companion.ISystemDataTransferCallback p3) throws android.os.RemoteException {}
        public void stopObservingDevicePresence(android.companion.ObservingDevicePresenceRequest p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.ICompanionDeviceManager {
        public static final java.lang.String DESCRIPTOR = "android.companion.ICompanionDeviceManager";
        static final java.lang.String[] PERMISSIONS_clearOnActionResultListener = null;
        static final java.lang.String[] PERMISSIONS_requestAction = null;
        static final java.lang.String[] PERMISSIONS_setOnActionResultListener = null;
        static final int TRANSACTION_addOnAssociationsChangedListener = 16;
        static final int TRANSACTION_addOnMessageReceivedListener = 22;
        static final int TRANSACTION_addOnTransportEventListener = 24;
        static final int TRANSACTION_addOnTransportsChangedListener = 18;
        static final int TRANSACTION_applyRestoredPayload = 42;
        static final int TRANSACTION_associate = 1;
        static final int TRANSACTION_attachSystemDataTransport = 31;
        static final int TRANSACTION_buildAssociationCancellationIntent = 34;
        static final int TRANSACTION_buildPermissionTransferUserConsentIntent = 28;
        static final int TRANSACTION_canPairWithoutPrompt = 14;
        static final int TRANSACTION_clearOnActionResultListener = 54;
        static final int TRANSACTION_createAssociation = 15;
        static final int TRANSACTION_decryptPayload = 59;
        static final int TRANSACTION_detachSystemDataTransport = 32;
        static final int TRANSACTION_disablePermissionsSync = 38;
        static final int TRANSACTION_disableSystemDataSync = 36;
        static final int TRANSACTION_disassociate = 6;
        static final int TRANSACTION_enablePermissionsSync = 37;
        static final int TRANSACTION_enableSystemDataSync = 35;
        static final int TRANSACTION_encryptPayload = 58;
        static final int TRANSACTION_getAllAssociationsForUser = 3;
        static final int TRANSACTION_getAllAssociationsWithTransports = 20;
        static final int TRANSACTION_getAssociationByDeviceId = 44;
        static final int TRANSACTION_getAssociations = 2;
        static final int TRANSACTION_getBackupPayload = 41;
        static final int TRANSACTION_getLocalMetadata = 47;
        static final int TRANSACTION_getPermissionSyncRequest = 39;
        static final int TRANSACTION_getTrustedAssociationsForUser = 4;
        static final int TRANSACTION_hasNotificationAccess = 7;
        static final int TRANSACTION_isCompanionApplicationBound = 33;
        static final int TRANSACTION_isDeviceAssociatedForWifiConnection = 9;
        static final int TRANSACTION_isDevicePresent = 57;
        static final int TRANSACTION_isPermissionTransferUserConsented = 29;
        static final int TRANSACTION_isSystemDataTransportAttached = 55;
        static final int TRANSACTION_legacyDisassociate = 5;
        static final int TRANSACTION_legacyStartObservingDevicePresence = 10;
        static final int TRANSACTION_legacyStopObservingDevicePresence = 11;
        static final int TRANSACTION_notifyActionResult = 52;
        static final int TRANSACTION_notifyDevicePresence = 50;
        static final int TRANSACTION_notifySelfManagedDeviceAppeared = 26;
        static final int TRANSACTION_notifySelfManagedDeviceDisappeared = 27;
        static final int TRANSACTION_overrideTransportType = 40;
        static final int TRANSACTION_removeBond = 43;
        static final int TRANSACTION_removeOnAssociationsChangedListener = 17;
        static final int TRANSACTION_removeOnDevicePresenceEventListener = 49;
        static final int TRANSACTION_removeOnMessageReceivedListener = 23;
        static final int TRANSACTION_removeOnTransportEventListener = 25;
        static final int TRANSACTION_removeOnTransportsChangedListener = 19;
        static final int TRANSACTION_requestAction = 51;
        static final int TRANSACTION_requestDeviceTrustPairing = 60;
        static final int TRANSACTION_requestNotificationAccess = 8;
        static final int TRANSACTION_sendMessage = 21;
        static final int TRANSACTION_setDeviceId = 45;
        static final int TRANSACTION_setLocalMetadata = 46;
        static final int TRANSACTION_setOnActionResultListener = 53;
        static final int TRANSACTION_setOnDevicePresenceEventListener = 48;
        static final int TRANSACTION_setRequestActionAllowList = 56;
        static final int TRANSACTION_startObservingDevicePresence = 12;
        static final int TRANSACTION_startSystemDataTransfer = 30;
        static final int TRANSACTION_stopObservingDevicePresence = 13;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.companion.ICompanionDeviceManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void addOnAssociationsChangedListener_enforcePermission() throws java.lang.SecurityException {}
        protected void addOnTransportEventListener_enforcePermission() throws java.lang.SecurityException {}
        protected void addOnTransportsChangedListener_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        protected void attachSystemDataTransport_enforcePermission() throws java.lang.SecurityException {}
        protected void clearOnActionResultListener_enforcePermission() throws java.lang.SecurityException {}
        protected void createAssociation_enforcePermission() throws java.lang.SecurityException {}
        protected void detachSystemDataTransport_enforcePermission() throws java.lang.SecurityException {}
        protected void getAllAssociationsForUser_enforcePermission() throws java.lang.SecurityException {}
        protected void getAllAssociationsWithTransports_enforcePermission() throws java.lang.SecurityException {}
        protected void getAssociationByDeviceId_enforcePermission() throws java.lang.SecurityException {}
        protected void getLocalMetadata_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void getTrustedAssociationsForUser_enforcePermission() throws java.lang.SecurityException {}
        protected void isDeviceAssociatedForWifiConnection_enforcePermission() throws java.lang.SecurityException {}
        protected void isDevicePresent_enforcePermission() throws java.lang.SecurityException {}
        protected void legacyStartObservingDevicePresence_enforcePermission() throws java.lang.SecurityException {}
        protected void legacyStopObservingDevicePresence_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyDevicePresence_enforcePermission() throws java.lang.SecurityException {}
        protected void notifySelfManagedDeviceAppeared_enforcePermission() throws java.lang.SecurityException {}
        protected void notifySelfManagedDeviceDisappeared_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void overrideTransportType_enforcePermission() throws java.lang.SecurityException {}
        protected void removeBond_enforcePermission() throws java.lang.SecurityException {}
        protected void removeOnAssociationsChangedListener_enforcePermission() throws java.lang.SecurityException {}
        protected void removeOnDevicePresenceEventListener_enforcePermission() throws java.lang.SecurityException {}
        protected void removeOnTransportEventListener_enforcePermission() throws java.lang.SecurityException {}
        protected void removeOnTransportsChangedListener_enforcePermission() throws java.lang.SecurityException {}
        protected void requestAction_enforcePermission() throws java.lang.SecurityException {}
        protected void setLocalMetadata_enforcePermission() throws java.lang.SecurityException {}
        protected void setOnActionResultListener_enforcePermission() throws java.lang.SecurityException {}
        protected void setOnDevicePresenceEventListener_enforcePermission() throws java.lang.SecurityException {}
        protected void setRequestActionAllowList_enforcePermission() throws java.lang.SecurityException {}
        protected void startObservingDevicePresence_enforcePermission() throws java.lang.SecurityException {}
        protected void stopObservingDevicePresence_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.companion.ICompanionDeviceManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException {}
            public void addOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException {}
            public void addOnTransportEventListener(int p0, android.companion.IOnTransportEventListener p1) throws android.os.RemoteException {}
            public void addOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException {}
            public void applyRestoredPayload(byte[] p0, int p1) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void associate(android.companion.AssociationRequest p0, android.companion.IAssociationRequestCallback p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void attachSystemDataTransport(java.lang.String p0, int p1, int p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
            public android.app.PendingIntent buildAssociationCancellationIntent(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.app.PendingIntent buildPermissionTransferUserConsentIntent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public boolean canPairWithoutPrompt(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public void clearOnActionResultListener(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void createAssociation(java.lang.String p0, java.lang.String p1, int p2, byte[] p3) throws android.os.RemoteException {}
            public android.os.Bundle decryptPayload(byte[] p0) throws android.os.RemoteException { return null; }
            public void detachSystemDataTransport(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void disablePermissionsSync(int p0) throws android.os.RemoteException {}
            public void disableSystemDataSync(int p0, int p1) throws android.os.RemoteException {}
            public void disassociate(int p0) throws android.os.RemoteException {}
            public void enablePermissionsSync(int p0) throws android.os.RemoteException {}
            public void enableSystemDataSync(int p0, int p1) throws android.os.RemoteException {}
            public byte[] encryptPayload(byte[] p0, android.companion.DeviceId p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.companion.AssociationInfo> getAllAssociationsForUser(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.companion.AssociationInfo> getAllAssociationsWithTransports() throws android.os.RemoteException { return null; }
            public android.companion.AssociationInfo getAssociationByDeviceId(int p0, android.companion.DeviceId p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.companion.AssociationInfo> getAssociations(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public byte[] getBackupPayload(int p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.PersistableBundle getLocalMetadata(int p0) throws android.os.RemoteException { return null; }
            public android.companion.datatransfer.PermissionSyncRequest getPermissionSyncRequest(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.companion.AssociationInfo> getTrustedAssociationsForUser(int p0) throws android.os.RemoteException { return null; }
            @java.lang.Deprecated
            public boolean hasNotificationAccess(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isCompanionApplicationBound(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isDeviceAssociatedForWifiConnection(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isDevicePresent(int p0) throws android.os.RemoteException { return false; }
            public boolean isPermissionTransferUserConsented(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isSystemDataTransportAttached(int p0) throws android.os.RemoteException { return false; }
            @java.lang.Deprecated
            public void legacyDisassociate(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void legacyStartObservingDevicePresence(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void legacyStopObservingDevicePresence(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void notifyActionResult(int p0, android.companion.ActionResult p1) throws android.os.RemoteException {}
            public void notifyDevicePresence(int p0, android.companion.DevicePresenceEvent p1) throws android.os.RemoteException {}
            public void notifySelfManagedDeviceAppeared(int p0) throws android.os.RemoteException {}
            public void notifySelfManagedDeviceDisappeared(int p0) throws android.os.RemoteException {}
            public void overrideTransportType(int p0) throws android.os.RemoteException {}
            public boolean removeBond(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public void removeOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException {}
            public void removeOnDevicePresenceEventListener(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void removeOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException {}
            public void removeOnTransportEventListener(int p0, android.companion.IOnTransportEventListener p1) throws android.os.RemoteException {}
            public void removeOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException {}
            public void requestAction(android.companion.ActionRequest p0, java.lang.String p1, java.lang.String p2, int[] p3) throws android.os.RemoteException {}
            public void requestDeviceTrustPairing(int p0, android.companion.OutOfBandPairingRequest p1, int[] p2, android.companion.ITrustPairingCallback p3) throws android.os.RemoteException {}
            public android.app.PendingIntent requestNotificationAccess(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
            public void sendMessage(int p0, byte[] p1, int[] p2) throws android.os.RemoteException {}
            public android.companion.DeviceId setDeviceId(int p0, android.companion.DeviceId p1) throws android.os.RemoteException { return null; }
            public void setLocalMetadata(int p0, java.lang.String p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public void setOnActionResultListener(int[] p0, java.lang.String p1, java.lang.String p2, android.companion.IOnActionResultListener p3) throws android.os.RemoteException {}
            public void setOnDevicePresenceEventListener(int[] p0, java.lang.String p1, android.companion.IOnDevicePresenceEventListener p2, int p3) throws android.os.RemoteException {}
            public void setRequestActionAllowList(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public void startObservingDevicePresence(android.companion.ObservingDevicePresenceRequest p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void startSystemDataTransfer(java.lang.String p0, int p1, int p2, android.companion.ISystemDataTransferCallback p3) throws android.os.RemoteException {}
            public void stopObservingDevicePresence(android.companion.ObservingDevicePresenceRequest p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        }
    }
}
