package android.accessibilityservice;

public interface IBrailleDisplayConnection extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.accessibilityservice.IBrailleDisplayConnection";
    public void disconnect() throws android.os.RemoteException;
    public void write(byte[] p0) throws android.os.RemoteException;

    public static class Default implements android.accessibilityservice.IBrailleDisplayConnection {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void disconnect() throws android.os.RemoteException {}
        public void write(byte[] p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.accessibilityservice.IBrailleDisplayConnection {
        static final int TRANSACTION_disconnect = 1;
        static final int TRANSACTION_write = 2;
        public Stub() { super(); }
        public static android.accessibilityservice.IBrailleDisplayConnection asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.accessibilityservice.IBrailleDisplayConnection {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void disconnect() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void write(byte[] p0) throws android.os.RemoteException {}
        }
    }
}
