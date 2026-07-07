package android.app.backup;

public interface IRestoreSession extends android.os.IInterface {
    public void endRestoreSession() throws android.os.RemoteException;
    public int getAvailableRestoreSets(android.app.backup.IRestoreObserver p0, android.app.backup.IBackupManagerMonitor p1) throws android.os.RemoteException;
    public int restoreAll(long p0, android.app.backup.IRestoreObserver p1, android.app.backup.IBackupManagerMonitor p2) throws android.os.RemoteException;
    public int restorePackage(java.lang.String p0, android.app.backup.IRestoreObserver p1, android.app.backup.IBackupManagerMonitor p2) throws android.os.RemoteException;
    public int restorePackages(long p0, android.app.backup.IRestoreObserver p1, java.lang.String[] p2, android.app.backup.IBackupManagerMonitor p3) throws android.os.RemoteException;

    public static class Default implements android.app.backup.IRestoreSession {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void endRestoreSession() throws android.os.RemoteException {}
        public int getAvailableRestoreSets(android.app.backup.IRestoreObserver p0, android.app.backup.IBackupManagerMonitor p1) throws android.os.RemoteException { return 0; }
        public int restoreAll(long p0, android.app.backup.IRestoreObserver p1, android.app.backup.IBackupManagerMonitor p2) throws android.os.RemoteException { return 0; }
        public int restorePackage(java.lang.String p0, android.app.backup.IRestoreObserver p1, android.app.backup.IBackupManagerMonitor p2) throws android.os.RemoteException { return 0; }
        public int restorePackages(long p0, android.app.backup.IRestoreObserver p1, java.lang.String[] p2, android.app.backup.IBackupManagerMonitor p3) throws android.os.RemoteException { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.backup.IRestoreSession {
        public static final java.lang.String DESCRIPTOR = "android.app.backup.IRestoreSession";
        static final int TRANSACTION_endRestoreSession = 5;
        static final int TRANSACTION_getAvailableRestoreSets = 1;
        static final int TRANSACTION_restoreAll = 2;
        static final int TRANSACTION_restorePackage = 4;
        static final int TRANSACTION_restorePackages = 3;
        public Stub() { super(); }
        public static android.app.backup.IRestoreSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.backup.IRestoreSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void endRestoreSession() throws android.os.RemoteException {}
            public int getAvailableRestoreSets(android.app.backup.IRestoreObserver p0, android.app.backup.IBackupManagerMonitor p1) throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int restoreAll(long p0, android.app.backup.IRestoreObserver p1, android.app.backup.IBackupManagerMonitor p2) throws android.os.RemoteException { return 0; }
            public int restorePackage(java.lang.String p0, android.app.backup.IRestoreObserver p1, android.app.backup.IBackupManagerMonitor p2) throws android.os.RemoteException { return 0; }
            public int restorePackages(long p0, android.app.backup.IRestoreObserver p1, java.lang.String[] p2, android.app.backup.IBackupManagerMonitor p3) throws android.os.RemoteException { return 0; }
        }
    }
}
