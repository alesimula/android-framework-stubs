package android.app.privatecompute;

public interface IAuditLogDataCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.privatecompute.IAuditLogDataCallback";
    public void onFailure(android.os.ParcelableException p0) throws android.os.RemoteException;
    public void onResult(android.content.pm.ParceledListSlice<android.app.privatecompute.AuditLogDataEntry> p0) throws android.os.RemoteException;

    public static class Default implements android.app.privatecompute.IAuditLogDataCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onFailure(android.os.ParcelableException p0) throws android.os.RemoteException {}
        public void onResult(android.content.pm.ParceledListSlice<android.app.privatecompute.AuditLogDataEntry> p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.privatecompute.IAuditLogDataCallback {
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onResult = 1;
        public Stub() { super(); }
        public static android.app.privatecompute.IAuditLogDataCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.privatecompute.IAuditLogDataCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onFailure(android.os.ParcelableException p0) throws android.os.RemoteException {}
            public void onResult(android.content.pm.ParceledListSlice<android.app.privatecompute.AuditLogDataEntry> p0) throws android.os.RemoteException {}
        }
    }
}
