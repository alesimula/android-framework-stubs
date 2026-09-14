package android.app.privatecompute;

public interface IPccSandboxManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.privatecompute.IPccSandboxManager";
    public void batchWriteToAuditLog(java.util.List<android.os.PersistableBundle> p0, java.lang.String p1) throws android.os.RemoteException;
    public void clearAuditLogs(android.app.privatecompute.IResultCallback p0) throws android.os.RemoteException;
    public void egressData(android.app.privatecompute.EgressRequest p0, android.app.privatecompute.IEgressCallback p1) throws android.os.RemoteException;
    public void exportAuditLogData(android.os.ParcelFileDescriptor p0, android.app.privatecompute.IResultCallback p1) throws android.os.RemoteException;
    public void getAuditLogData(android.app.privatecompute.AuditLogDataQuery p0, android.app.privatecompute.IAuditLogDataCallback p1) throws android.os.RemoteException;
    public void getAuditLogMetadata(android.app.privatecompute.IAuditLogMetadataCallback p0) throws android.os.RemoteException;
    public int getAuditModeStatus() throws android.os.RemoteException;
    public boolean isPccTrustedSystemComponent(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isPrivateComputeServicesUid(int p0) throws android.os.RemoteException;
    public void registerAuditModeStatusListener(android.app.privatecompute.IAuditModeStatusListener p0) throws android.os.RemoteException;
    public void setAuditModeStatus(int p0, android.app.privatecompute.IResultCallback p1) throws android.os.RemoteException;
    public void startNonPccProcessForDataMigration(android.app.privatecompute.IMigrationRequestResultReceiver p0) throws android.os.RemoteException;
    public void unregisterAuditModeStatusListener(android.app.privatecompute.IAuditModeStatusListener p0) throws android.os.RemoteException;
    public void writeToAuditLog(android.os.PersistableBundle p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.app.privatecompute.IPccSandboxManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void batchWriteToAuditLog(java.util.List<android.os.PersistableBundle> p0, java.lang.String p1) throws android.os.RemoteException {}
        public void clearAuditLogs(android.app.privatecompute.IResultCallback p0) throws android.os.RemoteException {}
        public void egressData(android.app.privatecompute.EgressRequest p0, android.app.privatecompute.IEgressCallback p1) throws android.os.RemoteException {}
        public void exportAuditLogData(android.os.ParcelFileDescriptor p0, android.app.privatecompute.IResultCallback p1) throws android.os.RemoteException {}
        public void getAuditLogData(android.app.privatecompute.AuditLogDataQuery p0, android.app.privatecompute.IAuditLogDataCallback p1) throws android.os.RemoteException {}
        public void getAuditLogMetadata(android.app.privatecompute.IAuditLogMetadataCallback p0) throws android.os.RemoteException {}
        public int getAuditModeStatus() throws android.os.RemoteException { return 0; }
        public boolean isPccTrustedSystemComponent(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isPrivateComputeServicesUid(int p0) throws android.os.RemoteException { return false; }
        public void registerAuditModeStatusListener(android.app.privatecompute.IAuditModeStatusListener p0) throws android.os.RemoteException {}
        public void setAuditModeStatus(int p0, android.app.privatecompute.IResultCallback p1) throws android.os.RemoteException {}
        public void startNonPccProcessForDataMigration(android.app.privatecompute.IMigrationRequestResultReceiver p0) throws android.os.RemoteException {}
        public void unregisterAuditModeStatusListener(android.app.privatecompute.IAuditModeStatusListener p0) throws android.os.RemoteException {}
        public void writeToAuditLog(android.os.PersistableBundle p0, java.lang.String p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.privatecompute.IPccSandboxManager {
        static final int TRANSACTION_batchWriteToAuditLog = 4;
        static final int TRANSACTION_clearAuditLogs = 8;
        static final int TRANSACTION_egressData = 6;
        static final int TRANSACTION_exportAuditLogData = 13;
        static final int TRANSACTION_getAuditLogData = 7;
        static final int TRANSACTION_getAuditLogMetadata = 14;
        static final int TRANSACTION_getAuditModeStatus = 9;
        static final int TRANSACTION_isPccTrustedSystemComponent = 2;
        static final int TRANSACTION_isPrivateComputeServicesUid = 1;
        static final int TRANSACTION_registerAuditModeStatusListener = 11;
        static final int TRANSACTION_setAuditModeStatus = 10;
        static final int TRANSACTION_startNonPccProcessForDataMigration = 5;
        static final int TRANSACTION_unregisterAuditModeStatusListener = 12;
        static final int TRANSACTION_writeToAuditLog = 3;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.app.privatecompute.IPccSandboxManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void clearAuditLogs_enforcePermission() throws java.lang.SecurityException {}
        protected void exportAuditLogData_enforcePermission() throws java.lang.SecurityException {}
        protected void getAuditLogData_enforcePermission() throws java.lang.SecurityException {}
        protected void getAuditLogMetadata_enforcePermission() throws java.lang.SecurityException {}
        protected void getAuditModeStatus_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void registerAuditModeStatusListener_enforcePermission() throws java.lang.SecurityException {}
        protected void setAuditModeStatus_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterAuditModeStatusListener_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.app.privatecompute.IPccSandboxManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void batchWriteToAuditLog(java.util.List<android.os.PersistableBundle> p0, java.lang.String p1) throws android.os.RemoteException {}
            public void clearAuditLogs(android.app.privatecompute.IResultCallback p0) throws android.os.RemoteException {}
            public void egressData(android.app.privatecompute.EgressRequest p0, android.app.privatecompute.IEgressCallback p1) throws android.os.RemoteException {}
            public void exportAuditLogData(android.os.ParcelFileDescriptor p0, android.app.privatecompute.IResultCallback p1) throws android.os.RemoteException {}
            public void getAuditLogData(android.app.privatecompute.AuditLogDataQuery p0, android.app.privatecompute.IAuditLogDataCallback p1) throws android.os.RemoteException {}
            public void getAuditLogMetadata(android.app.privatecompute.IAuditLogMetadataCallback p0) throws android.os.RemoteException {}
            public int getAuditModeStatus() throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isPccTrustedSystemComponent(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isPrivateComputeServicesUid(int p0) throws android.os.RemoteException { return false; }
            public void registerAuditModeStatusListener(android.app.privatecompute.IAuditModeStatusListener p0) throws android.os.RemoteException {}
            public void setAuditModeStatus(int p0, android.app.privatecompute.IResultCallback p1) throws android.os.RemoteException {}
            public void startNonPccProcessForDataMigration(android.app.privatecompute.IMigrationRequestResultReceiver p0) throws android.os.RemoteException {}
            public void unregisterAuditModeStatusListener(android.app.privatecompute.IAuditModeStatusListener p0) throws android.os.RemoteException {}
            public void writeToAuditLog(android.os.PersistableBundle p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
