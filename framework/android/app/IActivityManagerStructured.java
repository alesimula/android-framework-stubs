package android.app;

public interface IActivityManagerStructured extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IActivityManagerStructured";
    public static final int SERVICE_DONE_EXECUTING_ANON = 0;
    public static final int SERVICE_DONE_EXECUTING_REBIND = 3;
    public static final int SERVICE_DONE_EXECUTING_START = 1;
    public static final int SERVICE_DONE_EXECUTING_STOP = 2;
    public static final int SERVICE_DONE_EXECUTING_UNBIND = 4;
    public void addUidToObserver(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void attachNativeApplication(android.os.IBinder p0, long p1) throws android.os.RemoteException;
    public int checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void finishAttachApplication(long p0, long p1) throws android.os.RemoteException;
    public int getCurrentUserId() throws android.os.RemoteException;
    public java.util.List<android.app.RunningAppProcessInfo> getRunningAppProcesses() throws android.os.RemoteException;
    public int getUidProcessState(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isUidActive(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void logFgsApiBegin(int p0, int p1, int p2) throws android.os.RemoteException;
    public void logFgsApiEnd(int p0, int p1, int p2) throws android.os.RemoteException;
    public void logFgsApiStateChanged(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openContentUri(java.lang.String p0) throws android.os.RemoteException;
    public void publishService(android.os.IBinder p0, android.os.IBinder p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void registerProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException;
    public void registerUidObserver(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public android.os.IBinder registerUidObserverForUids(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3, int[] p4) throws android.os.RemoteException;
    public void removeUidFromObserver(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void serviceDoneExecuting(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void unbindFinished(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void unregisterProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException;
    public void unregisterUidObserver(android.app.IUidObserver p0) throws android.os.RemoteException;

    public static class Default implements android.app.IActivityManagerStructured {
        public Default() {}
        public void addUidToObserver(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void attachNativeApplication(android.os.IBinder p0, long p1) throws android.os.RemoteException {}
        public int checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public void finishAttachApplication(long p0, long p1) throws android.os.RemoteException {}
        public int getCurrentUserId() throws android.os.RemoteException { return 0; }
        public java.util.List<android.app.RunningAppProcessInfo> getRunningAppProcesses() throws android.os.RemoteException { return null; }
        public int getUidProcessState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public boolean isUidActive(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void logFgsApiBegin(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void logFgsApiEnd(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void logFgsApiStateChanged(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public android.os.ParcelFileDescriptor openContentUri(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void publishService(android.os.IBinder p0, android.os.IBinder p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void registerProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException {}
        public void registerUidObserver(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public android.os.IBinder registerUidObserverForUids(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3, int[] p4) throws android.os.RemoteException { return null; }
        public void removeUidFromObserver(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void serviceDoneExecuting(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void unbindFinished(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void unregisterProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException {}
        public void unregisterUidObserver(android.app.IUidObserver p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IActivityManagerStructured {
        static final int TRANSACTION_addUidToObserver = 5;
        static final int TRANSACTION_attachNativeApplication = 19;
        static final int TRANSACTION_checkPermission = 9;
        static final int TRANSACTION_finishAttachApplication = 20;
        static final int TRANSACTION_getCurrentUserId = 21;
        static final int TRANSACTION_getRunningAppProcesses = 15;
        static final int TRANSACTION_getUidProcessState = 8;
        static final int TRANSACTION_isUidActive = 7;
        static final int TRANSACTION_logFgsApiBegin = 10;
        static final int TRANSACTION_logFgsApiEnd = 11;
        static final int TRANSACTION_logFgsApiStateChanged = 12;
        static final int TRANSACTION_openContentUri = 1;
        static final int TRANSACTION_publishService = 17;
        static final int TRANSACTION_registerProcessObserver = 13;
        static final int TRANSACTION_registerUidObserver = 2;
        static final int TRANSACTION_registerUidObserverForUids = 4;
        static final int TRANSACTION_removeUidFromObserver = 6;
        static final int TRANSACTION_serviceDoneExecuting = 16;
        static final int TRANSACTION_unbindFinished = 18;
        static final int TRANSACTION_unregisterProcessObserver = 14;
        static final int TRANSACTION_unregisterUidObserver = 3;
        public Stub() { super(); }
        public static android.app.IActivityManagerStructured asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.IActivityManagerStructured {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addUidToObserver(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void attachNativeApplication(android.os.IBinder p0, long p1) throws android.os.RemoteException {}
            public int checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public void finishAttachApplication(long p0, long p1) throws android.os.RemoteException {}
            public int getCurrentUserId() throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.app.RunningAppProcessInfo> getRunningAppProcesses() throws android.os.RemoteException { return null; }
            public int getUidProcessState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public boolean isUidActive(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void logFgsApiBegin(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void logFgsApiEnd(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void logFgsApiStateChanged(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public android.os.ParcelFileDescriptor openContentUri(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void publishService(android.os.IBinder p0, android.os.IBinder p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void registerProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException {}
            public void registerUidObserver(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public android.os.IBinder registerUidObserverForUids(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3, int[] p4) throws android.os.RemoteException { return null; }
            public void removeUidFromObserver(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void serviceDoneExecuting(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void unbindFinished(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void unregisterProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException {}
            public void unregisterUidObserver(android.app.IUidObserver p0) throws android.os.RemoteException {}
        }
    }
}
