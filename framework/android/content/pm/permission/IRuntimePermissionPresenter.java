package android.content.pm.permission;

@java.lang.Deprecated
public interface IRuntimePermissionPresenter extends android.os.IInterface {
    public void getAppPermissions(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException;

    @java.lang.Deprecated
    public static class Default implements android.content.pm.permission.IRuntimePermissionPresenter {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void getAppPermissions(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
    }

    @java.lang.Deprecated
    public static abstract class Stub extends android.os.Binder implements android.content.pm.permission.IRuntimePermissionPresenter {
        public static final java.lang.String DESCRIPTOR = "android.content.pm.permission.IRuntimePermissionPresenter";
        static final int TRANSACTION_getAppPermissions = 1;
        public Stub() { super(); }
        public static android.content.pm.permission.IRuntimePermissionPresenter asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        @java.lang.Deprecated
        private static final class Proxy implements android.content.pm.permission.IRuntimePermissionPresenter {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void getAppPermissions(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
