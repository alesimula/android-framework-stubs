package android.companion;

public interface ICompanionMessageService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.ICompanionMessageService";
    public void onMessageReceived(int p0, int p1, byte[] p2) throws android.os.RemoteException;

    public static class Default implements android.companion.ICompanionMessageService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onMessageReceived(int p0, int p1, byte[] p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.ICompanionMessageService {
        static final int TRANSACTION_onMessageReceived = 1;
        public Stub() { super(); }
        public static android.companion.ICompanionMessageService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.companion.ICompanionMessageService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onMessageReceived(int p0, int p1, byte[] p2) throws android.os.RemoteException {}
        }
    }
}
