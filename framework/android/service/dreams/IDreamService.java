package android.service.dreams;

public interface IDreamService extends android.os.IInterface {
    public void attach(android.os.IBinder p0, boolean p1, boolean p2, android.os.IRemoteCallback p3) throws android.os.RemoteException;
    public void comeToFront() throws android.os.RemoteException;
    public void detach() throws android.os.RemoteException;
    public void wakeUp() throws android.os.RemoteException;

    public static class Default implements android.service.dreams.IDreamService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void attach(android.os.IBinder p0, boolean p1, boolean p2, android.os.IRemoteCallback p3) throws android.os.RemoteException {}
        public void comeToFront() throws android.os.RemoteException {}
        public void detach() throws android.os.RemoteException {}
        public void wakeUp() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.dreams.IDreamService {
        public static final java.lang.String DESCRIPTOR = "android.service.dreams.IDreamService";
        static final int TRANSACTION_attach = 1;
        static final int TRANSACTION_comeToFront = 4;
        static final int TRANSACTION_detach = 2;
        static final int TRANSACTION_wakeUp = 3;
        public Stub() { super(); }
        public static android.service.dreams.IDreamService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.dreams.IDreamService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void attach(android.os.IBinder p0, boolean p1, boolean p2, android.os.IRemoteCallback p3) throws android.os.RemoteException {}
            public void comeToFront() throws android.os.RemoteException {}
            public void detach() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void wakeUp() throws android.os.RemoteException {}
        }
    }
}
