package android.app;

public interface IStopUserCallback extends android.os.IInterface {
    public void userStopAborted(int p0) throws android.os.RemoteException;
    public void userStopped(int p0) throws android.os.RemoteException;

    public static class Default implements android.app.IStopUserCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void userStopAborted(int p0) throws android.os.RemoteException {}
        public void userStopped(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IStopUserCallback {
        public static final java.lang.String DESCRIPTOR = "android.app.IStopUserCallback";
        static final int TRANSACTION_userStopAborted = 2;
        static final int TRANSACTION_userStopped = 1;
        public Stub() { super(); }
        public static android.app.IStopUserCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.IStopUserCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void userStopAborted(int p0) throws android.os.RemoteException {}
            public void userStopped(int p0) throws android.os.RemoteException {}
        }
    }
}
