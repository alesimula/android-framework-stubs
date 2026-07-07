package android.companion;

public interface ICompanionDeviceService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.ICompanionDeviceService";
    public void onActionRequested(android.companion.AssociationInfo p0, android.companion.ActionRequest p1) throws android.os.RemoteException;
    public void onDeviceAppeared(android.companion.AssociationInfo p0) throws android.os.RemoteException;
    public void onDeviceDisappeared(android.companion.AssociationInfo p0) throws android.os.RemoteException;
    public void onDevicePresenceEvent(android.companion.DevicePresenceEvent p0) throws android.os.RemoteException;
    public void onDeviceTrusted(android.companion.AssociationInfo p0) throws android.os.RemoteException;
    public void onTrustPairingCanceledFromRemote(android.companion.AssociationInfo p0, android.content.IntentSender p1) throws android.os.RemoteException;
    public void onTrustPairingFailure(android.companion.AssociationInfo p0, int p1) throws android.os.RemoteException;
    public void onTrustPairingResponsePending(android.companion.AssociationInfo p0, android.content.IntentSender p1) throws android.os.RemoteException;

    public static class Default implements android.companion.ICompanionDeviceService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onActionRequested(android.companion.AssociationInfo p0, android.companion.ActionRequest p1) throws android.os.RemoteException {}
        public void onDeviceAppeared(android.companion.AssociationInfo p0) throws android.os.RemoteException {}
        public void onDeviceDisappeared(android.companion.AssociationInfo p0) throws android.os.RemoteException {}
        public void onDevicePresenceEvent(android.companion.DevicePresenceEvent p0) throws android.os.RemoteException {}
        public void onDeviceTrusted(android.companion.AssociationInfo p0) throws android.os.RemoteException {}
        public void onTrustPairingCanceledFromRemote(android.companion.AssociationInfo p0, android.content.IntentSender p1) throws android.os.RemoteException {}
        public void onTrustPairingFailure(android.companion.AssociationInfo p0, int p1) throws android.os.RemoteException {}
        public void onTrustPairingResponsePending(android.companion.AssociationInfo p0, android.content.IntentSender p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.ICompanionDeviceService {
        static final int TRANSACTION_onActionRequested = 4;
        static final int TRANSACTION_onDeviceAppeared = 1;
        static final int TRANSACTION_onDeviceDisappeared = 2;
        static final int TRANSACTION_onDevicePresenceEvent = 3;
        static final int TRANSACTION_onDeviceTrusted = 6;
        static final int TRANSACTION_onTrustPairingCanceledFromRemote = 7;
        static final int TRANSACTION_onTrustPairingFailure = 8;
        static final int TRANSACTION_onTrustPairingResponsePending = 5;
        public Stub() { super(); }
        public static android.companion.ICompanionDeviceService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.companion.ICompanionDeviceService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onActionRequested(android.companion.AssociationInfo p0, android.companion.ActionRequest p1) throws android.os.RemoteException {}
            public void onDeviceAppeared(android.companion.AssociationInfo p0) throws android.os.RemoteException {}
            public void onDeviceDisappeared(android.companion.AssociationInfo p0) throws android.os.RemoteException {}
            public void onDevicePresenceEvent(android.companion.DevicePresenceEvent p0) throws android.os.RemoteException {}
            public void onDeviceTrusted(android.companion.AssociationInfo p0) throws android.os.RemoteException {}
            public void onTrustPairingCanceledFromRemote(android.companion.AssociationInfo p0, android.content.IntentSender p1) throws android.os.RemoteException {}
            public void onTrustPairingFailure(android.companion.AssociationInfo p0, int p1) throws android.os.RemoteException {}
            public void onTrustPairingResponsePending(android.companion.AssociationInfo p0, android.content.IntentSender p1) throws android.os.RemoteException {}
        }
    }
}
