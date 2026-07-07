package android.companion;

public interface ITrustPairingCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.ITrustPairingCallback";
    public void onDeviceTrusted(android.companion.AssociationInfo p0) throws android.os.RemoteException;
    public void onFailure(int p0) throws android.os.RemoteException;
    public void onTrustPairingCanceledFromRemote(android.companion.AssociationInfo p0, android.content.IntentSender p1) throws android.os.RemoteException;
    public void onTrustPairingPending(android.content.IntentSender p0) throws android.os.RemoteException;

    public static class Default implements android.companion.ITrustPairingCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onDeviceTrusted(android.companion.AssociationInfo p0) throws android.os.RemoteException {}
        public void onFailure(int p0) throws android.os.RemoteException {}
        public void onTrustPairingCanceledFromRemote(android.companion.AssociationInfo p0, android.content.IntentSender p1) throws android.os.RemoteException {}
        public void onTrustPairingPending(android.content.IntentSender p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.ITrustPairingCallback {
        static final int TRANSACTION_onDeviceTrusted = 3;
        static final int TRANSACTION_onFailure = 4;
        static final int TRANSACTION_onTrustPairingCanceledFromRemote = 2;
        static final int TRANSACTION_onTrustPairingPending = 1;
        public Stub() { super(); }
        public static android.companion.ITrustPairingCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.companion.ITrustPairingCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onDeviceTrusted(android.companion.AssociationInfo p0) throws android.os.RemoteException {}
            public void onFailure(int p0) throws android.os.RemoteException {}
            public void onTrustPairingCanceledFromRemote(android.companion.AssociationInfo p0, android.content.IntentSender p1) throws android.os.RemoteException {}
            public void onTrustPairingPending(android.content.IntentSender p0) throws android.os.RemoteException {}
        }
    }
}
