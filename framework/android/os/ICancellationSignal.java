package android.os;

public interface ICancellationSignal extends android.os.IInterface {
    public void cancel() throws android.os.RemoteException;

    public static class Default implements android.os.ICancellationSignal {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void cancel() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.ICancellationSignal {
        public static final java.lang.String DESCRIPTOR = "android.os.ICancellationSignal";
        static final int TRANSACTION_cancel = 1;
        public Stub() { super(); }
        public static android.os.ICancellationSignal asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.ICancellationSignal {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void cancel() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
