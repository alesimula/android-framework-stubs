package android.os.vibrator;

public interface IHapticChannelStream extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.vibrator.IHapticChannelStream";
    public static final int READ_STATUS_EOF = -1;
    public static final int READ_STATUS_ERROR_CLOSED = -32;
    public static final int READ_STATUS_ERROR_IO = -5;
    public boolean close() throws android.os.RemoteException;
    public int read(byte[] p0) throws android.os.RemoteException;

    public static class Default implements android.os.vibrator.IHapticChannelStream {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public boolean close() throws android.os.RemoteException { return false; }
        public int read(byte[] p0) throws android.os.RemoteException { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.vibrator.IHapticChannelStream {
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_read = 1;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.os.vibrator.IHapticChannelStream asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void close_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void read_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.os.vibrator.IHapticChannelStream {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public boolean close() throws android.os.RemoteException { return false; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int read(byte[] p0) throws android.os.RemoteException { return 0; }
        }
    }
}
