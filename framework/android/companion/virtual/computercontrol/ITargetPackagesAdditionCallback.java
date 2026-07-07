package android.companion.virtual.computercontrol;

public interface ITargetPackagesAdditionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.computercontrol.ITargetPackagesAdditionCallback";
    public void onTargetPackagesAdditionFailure(int p0) throws android.os.RemoteException;
    public void onTargetPackagesAdditionPending(android.app.PendingIntent p0) throws android.os.RemoteException;
    public void onTargetPackagesAdditionSuccess() throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.computercontrol.ITargetPackagesAdditionCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onTargetPackagesAdditionFailure(int p0) throws android.os.RemoteException {}
        public void onTargetPackagesAdditionPending(android.app.PendingIntent p0) throws android.os.RemoteException {}
        public void onTargetPackagesAdditionSuccess() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.computercontrol.ITargetPackagesAdditionCallback {
        static final int TRANSACTION_onTargetPackagesAdditionFailure = 3;
        static final int TRANSACTION_onTargetPackagesAdditionPending = 1;
        static final int TRANSACTION_onTargetPackagesAdditionSuccess = 2;
        public Stub() { super(); }
        public static android.companion.virtual.computercontrol.ITargetPackagesAdditionCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.companion.virtual.computercontrol.ITargetPackagesAdditionCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onTargetPackagesAdditionFailure(int p0) throws android.os.RemoteException {}
            public void onTargetPackagesAdditionPending(android.app.PendingIntent p0) throws android.os.RemoteException {}
            public void onTargetPackagesAdditionSuccess() throws android.os.RemoteException {}
        }
    }
}
