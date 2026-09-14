package android.security.applock;

public interface IAppLockManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.applock.IAppLockManager";
    public java.util.List<java.lang.String> getPackagesWithVisibleAppLockOverlay(int p0) throws android.os.RemoteException;
    public boolean isAppLockSupportedForDevice() throws android.os.RemoteException;
    public boolean isAppLockSupportedForUser(int p0) throws android.os.RemoteException;
    public boolean isPackageLocked(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void registerPackageLockedStateListener(android.security.applock.IPackageLockedStateListener p0) throws android.os.RemoteException;
    public void setAppLockEnabledPackageSuccessfullyAuthenticated(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void unregisterPackageLockedStateListener(android.security.applock.IPackageLockedStateListener p0) throws android.os.RemoteException;

    public static class Default implements android.security.applock.IAppLockManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public java.util.List<java.lang.String> getPackagesWithVisibleAppLockOverlay(int p0) throws android.os.RemoteException { return null; }
        public boolean isAppLockSupportedForDevice() throws android.os.RemoteException { return false; }
        public boolean isAppLockSupportedForUser(int p0) throws android.os.RemoteException { return false; }
        public boolean isPackageLocked(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void registerPackageLockedStateListener(android.security.applock.IPackageLockedStateListener p0) throws android.os.RemoteException {}
        public void setAppLockEnabledPackageSuccessfullyAuthenticated(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void unregisterPackageLockedStateListener(android.security.applock.IPackageLockedStateListener p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.security.applock.IAppLockManager {
        static final int TRANSACTION_getPackagesWithVisibleAppLockOverlay = 7;
        static final int TRANSACTION_isAppLockSupportedForDevice = 5;
        static final int TRANSACTION_isAppLockSupportedForUser = 6;
        static final int TRANSACTION_isPackageLocked = 1;
        static final int TRANSACTION_registerPackageLockedStateListener = 3;
        static final int TRANSACTION_setAppLockEnabledPackageSuccessfullyAuthenticated = 2;
        static final int TRANSACTION_unregisterPackageLockedStateListener = 4;
        public Stub() { super(); }
        public static android.security.applock.IAppLockManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.security.applock.IAppLockManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<java.lang.String> getPackagesWithVisibleAppLockOverlay(int p0) throws android.os.RemoteException { return null; }
            public boolean isAppLockSupportedForDevice() throws android.os.RemoteException { return false; }
            public boolean isAppLockSupportedForUser(int p0) throws android.os.RemoteException { return false; }
            public boolean isPackageLocked(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void registerPackageLockedStateListener(android.security.applock.IPackageLockedStateListener p0) throws android.os.RemoteException {}
            public void setAppLockEnabledPackageSuccessfullyAuthenticated(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void unregisterPackageLockedStateListener(android.security.applock.IPackageLockedStateListener p0) throws android.os.RemoteException {}
        }
    }
}
