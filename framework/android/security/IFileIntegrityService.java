package android.security;

public interface IFileIntegrityService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.IFileIntegrityService";
    public android.os.IInstalld.IFsveritySetupAuthToken createAuthToken(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    public int setupFsverity(android.os.IInstalld.IFsveritySetupAuthToken p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;

    public static class Default implements android.security.IFileIntegrityService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.os.IInstalld.IFsveritySetupAuthToken createAuthToken(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException { return null; }
        public int setupFsverity(android.os.IInstalld.IFsveritySetupAuthToken p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.IFileIntegrityService {
        static final int TRANSACTION_createAuthToken = 1;
        static final int TRANSACTION_setupFsverity = 2;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.security.IFileIntegrityService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setupFsverity_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.security.IFileIntegrityService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public android.os.IInstalld.IFsveritySetupAuthToken createAuthToken(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int setupFsverity(android.os.IInstalld.IFsveritySetupAuthToken p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        }
    }
}
