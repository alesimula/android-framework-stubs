package android.app.privatecompute;

public interface IAuditLogMetadataCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.privatecompute.IAuditLogMetadataCallback";
    public void onFailure(android.os.ParcelableException p0) throws android.os.RemoteException;
    public void onResult(android.app.privatecompute.AuditLogMetadata p0) throws android.os.RemoteException;

    public static class Default implements android.app.privatecompute.IAuditLogMetadataCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onFailure(android.os.ParcelableException p0) throws android.os.RemoteException {}
        public void onResult(android.app.privatecompute.AuditLogMetadata p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.privatecompute.IAuditLogMetadataCallback {
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onResult = 1;
        public Stub() { super(); }
        public static android.app.privatecompute.IAuditLogMetadataCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.privatecompute.IAuditLogMetadataCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onFailure(android.os.ParcelableException p0) throws android.os.RemoteException {}
            public void onResult(android.app.privatecompute.AuditLogMetadata p0) throws android.os.RemoteException {}
        }
    }
}
