package android.app.privatecompute;

public interface IPccSandboxManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.privatecompute.IPccSandboxManager";
    public void batchWriteToAuditLog(java.util.List<android.os.PersistableBundle> p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isPccTrustedSystemComponent(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isPrivateComputeServicesUid(int p0) throws android.os.RemoteException;
    public void startNonPccProcessForDataMigration(android.app.privatecompute.IMigrationRequestResultReceiver p0) throws android.os.RemoteException;
    public void writeToAuditLog(android.os.PersistableBundle p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.app.privatecompute.IPccSandboxManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void batchWriteToAuditLog(java.util.List<android.os.PersistableBundle> p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean isPccTrustedSystemComponent(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isPrivateComputeServicesUid(int p0) throws android.os.RemoteException { return false; }
        public void startNonPccProcessForDataMigration(android.app.privatecompute.IMigrationRequestResultReceiver p0) throws android.os.RemoteException {}
        public void writeToAuditLog(android.os.PersistableBundle p0, java.lang.String p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.privatecompute.IPccSandboxManager {
        static final int TRANSACTION_batchWriteToAuditLog = 4;
        static final int TRANSACTION_isPccTrustedSystemComponent = 2;
        static final int TRANSACTION_isPrivateComputeServicesUid = 1;
        static final int TRANSACTION_startNonPccProcessForDataMigration = 5;
        static final int TRANSACTION_writeToAuditLog = 3;
        public Stub() { super(); }
        public static android.app.privatecompute.IPccSandboxManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.privatecompute.IPccSandboxManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void batchWriteToAuditLog(java.util.List<android.os.PersistableBundle> p0, java.lang.String p1) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isPccTrustedSystemComponent(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isPrivateComputeServicesUid(int p0) throws android.os.RemoteException { return false; }
            public void startNonPccProcessForDataMigration(android.app.privatecompute.IMigrationRequestResultReceiver p0) throws android.os.RemoteException {}
            public void writeToAuditLog(android.os.PersistableBundle p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
