package android.app.admin;

public interface IKeyguardCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.admin.IKeyguardCallback";
    public void onDismiss() throws android.os.RemoteException;
    public void onRemoteContentReady(android.view.SurfaceControlViewHost.SurfacePackage p0) throws android.os.RemoteException;

    public static class Default implements android.app.admin.IKeyguardCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onDismiss() throws android.os.RemoteException {}
        public void onRemoteContentReady(android.view.SurfaceControlViewHost.SurfacePackage p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.admin.IKeyguardCallback {
        static final int TRANSACTION_onDismiss = 2;
        static final int TRANSACTION_onRemoteContentReady = 1;
        public Stub() { super(); }
        public static android.app.admin.IKeyguardCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.admin.IKeyguardCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onDismiss() throws android.os.RemoteException {}
            public void onRemoteContentReady(android.view.SurfaceControlViewHost.SurfacePackage p0) throws android.os.RemoteException {}
        }
    }
}
