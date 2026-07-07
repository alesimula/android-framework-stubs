package android.permission;

public interface IPermissionChecker extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.permission.IPermissionChecker";
    public static final int PERMISSION_GRANTED = 0;
    public static final int PERMISSION_HARD_DENIED = 2;
    public static final int PERMISSION_SOFT_DENIED = 1;
    public int checkOp(int p0, android.content.AttributionSourceState p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException;
    public int checkPermission(java.lang.String p0, android.content.AttributionSourceState p1, java.lang.String p2, boolean p3, boolean p4, boolean p5, int p6) throws android.os.RemoteException;
    public void finishDataDelivery(int p0, android.content.AttributionSourceState p1, boolean p2) throws android.os.RemoteException;

    public static class Default implements android.permission.IPermissionChecker {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public int checkOp(int p0, android.content.AttributionSourceState p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException { return 0; }
        public int checkPermission(java.lang.String p0, android.content.AttributionSourceState p1, java.lang.String p2, boolean p3, boolean p4, boolean p5, int p6) throws android.os.RemoteException { return 0; }
        public void finishDataDelivery(int p0, android.content.AttributionSourceState p1, boolean p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.permission.IPermissionChecker {
        static final int TRANSACTION_checkOp = 3;
        static final int TRANSACTION_checkPermission = 1;
        static final int TRANSACTION_finishDataDelivery = 2;
        public Stub() { super(); }
        public static android.permission.IPermissionChecker asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.permission.IPermissionChecker {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public int checkOp(int p0, android.content.AttributionSourceState p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException { return 0; }
            public int checkPermission(java.lang.String p0, android.content.AttributionSourceState p1, java.lang.String p2, boolean p3, boolean p4, boolean p5, int p6) throws android.os.RemoteException { return 0; }
            public void finishDataDelivery(int p0, android.content.AttributionSourceState p1, boolean p2) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
