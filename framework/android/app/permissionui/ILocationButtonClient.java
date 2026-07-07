package android.app.permissionui;

public interface ILocationButtonClient extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.permissionui.ILocationButtonClient";
    public void onPermissionsResult(boolean p0) throws android.os.RemoteException;
    public void onRequestPermissions(android.app.PendingIntent p0) throws android.os.RemoteException;
    public void onSessionError(android.os.ParcelableException p0) throws android.os.RemoteException;
    public void onSessionOpened(android.app.permissionui.LocationButtonSessionResponse p0) throws android.os.RemoteException;

    public static class Default implements android.app.permissionui.ILocationButtonClient {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onPermissionsResult(boolean p0) throws android.os.RemoteException {}
        public void onRequestPermissions(android.app.PendingIntent p0) throws android.os.RemoteException {}
        public void onSessionError(android.os.ParcelableException p0) throws android.os.RemoteException {}
        public void onSessionOpened(android.app.permissionui.LocationButtonSessionResponse p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.permissionui.ILocationButtonClient {
        static final int TRANSACTION_onPermissionsResult = 2;
        static final int TRANSACTION_onRequestPermissions = 4;
        static final int TRANSACTION_onSessionError = 3;
        static final int TRANSACTION_onSessionOpened = 1;
        public Stub() { super(); }
        public static android.app.permissionui.ILocationButtonClient asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.permissionui.ILocationButtonClient {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onPermissionsResult(boolean p0) throws android.os.RemoteException {}
            public void onRequestPermissions(android.app.PendingIntent p0) throws android.os.RemoteException {}
            public void onSessionError(android.os.ParcelableException p0) throws android.os.RemoteException {}
            public void onSessionOpened(android.app.permissionui.LocationButtonSessionResponse p0) throws android.os.RemoteException {}
        }
    }
}
