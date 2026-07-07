package android.telephony.ims.aidl;

public interface IImsRegistrationCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsRegistrationCallback";
    public void onDeregistered(android.telephony.ims.ImsReasonInfo p0, int p1, int p2) throws android.os.RemoteException;
    public void onDeregisteredWithDetails(android.telephony.ims.ImsReasonInfo p0, int p1, int p2, android.telephony.ims.SipDetails p3) throws android.os.RemoteException;
    public void onDeregisteredWithTime(android.telephony.ims.ImsReasonInfo p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onRegistered(android.telephony.ims.ImsRegistrationAttributes p0) throws android.os.RemoteException;
    public void onRegistering(android.telephony.ims.ImsRegistrationAttributes p0) throws android.os.RemoteException;
    public void onSubscriberAssociatedUriChanged(android.net.Uri[] p0) throws android.os.RemoteException;
    public void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsRegistrationCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onDeregistered(android.telephony.ims.ImsReasonInfo p0, int p1, int p2) throws android.os.RemoteException {}
        public void onDeregisteredWithDetails(android.telephony.ims.ImsReasonInfo p0, int p1, int p2, android.telephony.ims.SipDetails p3) throws android.os.RemoteException {}
        public void onDeregisteredWithTime(android.telephony.ims.ImsReasonInfo p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onRegistered(android.telephony.ims.ImsRegistrationAttributes p0) throws android.os.RemoteException {}
        public void onRegistering(android.telephony.ims.ImsRegistrationAttributes p0) throws android.os.RemoteException {}
        public void onSubscriberAssociatedUriChanged(android.net.Uri[] p0) throws android.os.RemoteException {}
        public void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsRegistrationCallback {
        static final int TRANSACTION_onDeregistered = 3;
        static final int TRANSACTION_onDeregisteredWithDetails = 5;
        static final int TRANSACTION_onDeregisteredWithTime = 4;
        static final int TRANSACTION_onRegistered = 1;
        static final int TRANSACTION_onRegistering = 2;
        static final int TRANSACTION_onSubscriberAssociatedUriChanged = 7;
        static final int TRANSACTION_onTechnologyChangeFailed = 6;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsRegistrationCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.telephony.ims.aidl.IImsRegistrationCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onDeregistered(android.telephony.ims.ImsReasonInfo p0, int p1, int p2) throws android.os.RemoteException {}
            public void onDeregisteredWithDetails(android.telephony.ims.ImsReasonInfo p0, int p1, int p2, android.telephony.ims.SipDetails p3) throws android.os.RemoteException {}
            public void onDeregisteredWithTime(android.telephony.ims.ImsReasonInfo p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onRegistered(android.telephony.ims.ImsRegistrationAttributes p0) throws android.os.RemoteException {}
            public void onRegistering(android.telephony.ims.ImsRegistrationAttributes p0) throws android.os.RemoteException {}
            public void onSubscriberAssociatedUriChanged(android.net.Uri[] p0) throws android.os.RemoteException {}
            public void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        }
    }
}
