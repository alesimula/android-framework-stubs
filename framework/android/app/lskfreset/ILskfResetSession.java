package android.app.lskfreset;

public interface ILskfResetSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.lskfreset.ILskfResetSession";
    public void close() throws android.os.RemoteException;
    public void saveEscrowToken(android.app.lskfreset.EscrowToken p0) throws android.os.RemoteException;

    public static class Default implements android.app.lskfreset.ILskfResetSession {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void close() throws android.os.RemoteException {}
        public void saveEscrowToken(android.app.lskfreset.EscrowToken p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.lskfreset.ILskfResetSession {
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_saveEscrowToken = 1;
        public Stub() { super(); }
        public static android.app.lskfreset.ILskfResetSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.lskfreset.ILskfResetSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void close() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void saveEscrowToken(android.app.lskfreset.EscrowToken p0) throws android.os.RemoteException {}
        }
    }
}
