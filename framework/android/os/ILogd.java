package android.os;

public interface ILogd extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.ILogd";
    public void approve(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void decline(int p0, int p1, int p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.os.ILogd {
        public Default() {}
        public void approve(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void decline(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.ILogd {
        static final int TRANSACTION_approve = 1;
        static final int TRANSACTION_decline = 2;
        public Stub() { super(); }
        public static android.os.ILogd asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.ILogd {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void approve(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void decline(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
