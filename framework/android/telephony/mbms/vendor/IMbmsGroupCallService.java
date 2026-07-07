package android.telephony.mbms.vendor;

public interface IMbmsGroupCallService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.mbms.vendor.IMbmsGroupCallService";
    public void dispose(int p0) throws android.os.RemoteException;
    public int initialize(android.telephony.mbms.IMbmsGroupCallSessionCallback p0, int p1) throws android.os.RemoteException;
    public int startGroupCall(int p0, long p1, java.util.List p2, java.util.List p3, android.telephony.mbms.IGroupCallCallback p4) throws android.os.RemoteException;
    public void stopGroupCall(int p0, long p1) throws android.os.RemoteException;
    public void updateGroupCall(int p0, long p1, java.util.List p2, java.util.List p3) throws android.os.RemoteException;

    public static class Default implements android.telephony.mbms.vendor.IMbmsGroupCallService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void dispose(int p0) throws android.os.RemoteException {}
        public int initialize(android.telephony.mbms.IMbmsGroupCallSessionCallback p0, int p1) throws android.os.RemoteException { return 0; }
        public int startGroupCall(int p0, long p1, java.util.List p2, java.util.List p3, android.telephony.mbms.IGroupCallCallback p4) throws android.os.RemoteException { return 0; }
        public void stopGroupCall(int p0, long p1) throws android.os.RemoteException {}
        public void updateGroupCall(int p0, long p1, java.util.List p2, java.util.List p3) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.mbms.vendor.IMbmsGroupCallService {
        static final int TRANSACTION_dispose = 5;
        static final int TRANSACTION_initialize = 1;
        static final int TRANSACTION_startGroupCall = 4;
        static final int TRANSACTION_stopGroupCall = 2;
        static final int TRANSACTION_updateGroupCall = 3;
        public Stub() { super(); }
        public static android.telephony.mbms.vendor.IMbmsGroupCallService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.telephony.mbms.vendor.IMbmsGroupCallService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void dispose(int p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int initialize(android.telephony.mbms.IMbmsGroupCallSessionCallback p0, int p1) throws android.os.RemoteException { return 0; }
            public int startGroupCall(int p0, long p1, java.util.List p2, java.util.List p3, android.telephony.mbms.IGroupCallCallback p4) throws android.os.RemoteException { return 0; }
            public void stopGroupCall(int p0, long p1) throws android.os.RemoteException {}
            public void updateGroupCall(int p0, long p1, java.util.List p2, java.util.List p3) throws android.os.RemoteException {}
        }
    }
}
