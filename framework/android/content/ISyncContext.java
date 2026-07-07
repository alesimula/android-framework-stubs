package android.content;

public interface ISyncContext extends android.os.IInterface {
    public void onFinished(android.content.SyncResult p0) throws android.os.RemoteException;
    public void sendHeartbeat() throws android.os.RemoteException;

    public static class Default implements android.content.ISyncContext {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onFinished(android.content.SyncResult p0) throws android.os.RemoteException {}
        public void sendHeartbeat() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.content.ISyncContext {
        public static final java.lang.String DESCRIPTOR = "android.content.ISyncContext";
        static final int TRANSACTION_onFinished = 2;
        static final int TRANSACTION_sendHeartbeat = 1;
        public Stub() { super(); }
        public static android.content.ISyncContext asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.content.ISyncContext {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onFinished(android.content.SyncResult p0) throws android.os.RemoteException {}
            public void sendHeartbeat() throws android.os.RemoteException {}
        }
    }
}
