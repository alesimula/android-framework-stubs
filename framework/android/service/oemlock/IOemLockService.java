package android.service.oemlock;

public interface IOemLockService extends android.os.IInterface {
    public java.lang.String getLockName() throws android.os.RemoteException;
    public boolean isDeviceOemUnlocked() throws android.os.RemoteException;
    public boolean isOemUnlockAllowed() throws android.os.RemoteException;
    public boolean isOemUnlockAllowedByCarrier() throws android.os.RemoteException;
    public boolean isOemUnlockAllowedByUser() throws android.os.RemoteException;
    public void setOemUnlockAllowedByCarrier(boolean p0, byte[] p1) throws android.os.RemoteException;
    public void setOemUnlockAllowedByUser(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.service.oemlock.IOemLockService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getLockName() throws android.os.RemoteException { return null; }
        public boolean isDeviceOemUnlocked() throws android.os.RemoteException { return false; }
        public boolean isOemUnlockAllowed() throws android.os.RemoteException { return false; }
        public boolean isOemUnlockAllowedByCarrier() throws android.os.RemoteException { return false; }
        public boolean isOemUnlockAllowedByUser() throws android.os.RemoteException { return false; }
        public void setOemUnlockAllowedByCarrier(boolean p0, byte[] p1) throws android.os.RemoteException {}
        public void setOemUnlockAllowedByUser(boolean p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.oemlock.IOemLockService {
        public static final java.lang.String DESCRIPTOR = "android.service.oemlock.IOemLockService";
        static final java.lang.String[] PERMISSIONS_isDeviceOemUnlocked = null;
        static final java.lang.String[] PERMISSIONS_isOemUnlockAllowed = null;
        static final int TRANSACTION_getLockName = 1;
        static final int TRANSACTION_isDeviceOemUnlocked = 7;
        static final int TRANSACTION_isOemUnlockAllowed = 6;
        static final int TRANSACTION_isOemUnlockAllowedByCarrier = 3;
        static final int TRANSACTION_isOemUnlockAllowedByUser = 5;
        static final int TRANSACTION_setOemUnlockAllowedByCarrier = 2;
        static final int TRANSACTION_setOemUnlockAllowedByUser = 4;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.service.oemlock.IOemLockService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void getLockName_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void isDeviceOemUnlocked_enforcePermission() throws java.lang.SecurityException {}
        protected void isOemUnlockAllowedByCarrier_enforcePermission() throws java.lang.SecurityException {}
        protected void isOemUnlockAllowedByUser_enforcePermission() throws java.lang.SecurityException {}
        protected void isOemUnlockAllowed_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setOemUnlockAllowedByCarrier_enforcePermission() throws java.lang.SecurityException {}
        protected void setOemUnlockAllowedByUser_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.service.oemlock.IOemLockService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getLockName() throws android.os.RemoteException { return null; }
            public boolean isDeviceOemUnlocked() throws android.os.RemoteException { return false; }
            public boolean isOemUnlockAllowed() throws android.os.RemoteException { return false; }
            public boolean isOemUnlockAllowedByCarrier() throws android.os.RemoteException { return false; }
            public boolean isOemUnlockAllowedByUser() throws android.os.RemoteException { return false; }
            public void setOemUnlockAllowedByCarrier(boolean p0, byte[] p1) throws android.os.RemoteException {}
            public void setOemUnlockAllowedByUser(boolean p0) throws android.os.RemoteException {}
        }
    }
}
