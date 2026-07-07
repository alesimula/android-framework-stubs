package android.hardware.biometrics;

public interface ITestSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.ITestSession";
    public void acceptAuthentication(int p0) throws android.os.RemoteException;
    public void cleanupInternalState(int p0) throws android.os.RemoteException;
    public void finishEnroll(int p0) throws android.os.RemoteException;
    public int getSensorId() throws android.os.RemoteException;
    public void notifyAcquired(int p0, int p1) throws android.os.RemoteException;
    public void notifyError(int p0, int p1) throws android.os.RemoteException;
    public void rejectAuthentication(int p0) throws android.os.RemoteException;
    public void setTestHalEnabled(boolean p0) throws android.os.RemoteException;
    public void startEnroll(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.ITestSession {
        public Default() {}
        public void acceptAuthentication(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void cleanupInternalState(int p0) throws android.os.RemoteException {}
        public void finishEnroll(int p0) throws android.os.RemoteException {}
        public int getSensorId() throws android.os.RemoteException { return 0; }
        public void notifyAcquired(int p0, int p1) throws android.os.RemoteException {}
        public void notifyError(int p0, int p1) throws android.os.RemoteException {}
        public void rejectAuthentication(int p0) throws android.os.RemoteException {}
        public void setTestHalEnabled(boolean p0) throws android.os.RemoteException {}
        public void startEnroll(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.ITestSession {
        static final int TRANSACTION_acceptAuthentication = 4;
        static final int TRANSACTION_cleanupInternalState = 8;
        static final int TRANSACTION_finishEnroll = 3;
        static final int TRANSACTION_getSensorId = 9;
        static final int TRANSACTION_notifyAcquired = 6;
        static final int TRANSACTION_notifyError = 7;
        static final int TRANSACTION_rejectAuthentication = 5;
        static final int TRANSACTION_setTestHalEnabled = 1;
        static final int TRANSACTION_startEnroll = 2;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.hardware.biometrics.ITestSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void acceptAuthentication_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        protected void cleanupInternalState_enforcePermission() throws java.lang.SecurityException {}
        protected void finishEnroll_enforcePermission() throws java.lang.SecurityException {}
        protected void getSensorId_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void notifyAcquired_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyError_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void rejectAuthentication_enforcePermission() throws java.lang.SecurityException {}
        protected void setTestHalEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void startEnroll_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.hardware.biometrics.ITestSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void acceptAuthentication(int p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void cleanupInternalState(int p0) throws android.os.RemoteException {}
            public void finishEnroll(int p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getSensorId() throws android.os.RemoteException { return 0; }
            public void notifyAcquired(int p0, int p1) throws android.os.RemoteException {}
            public void notifyError(int p0, int p1) throws android.os.RemoteException {}
            public void rejectAuthentication(int p0) throws android.os.RemoteException {}
            public void setTestHalEnabled(boolean p0) throws android.os.RemoteException {}
            public void startEnroll(int p0) throws android.os.RemoteException {}
        }
    }
}
