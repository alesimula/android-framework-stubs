package android.companion.datatransfer.continuity;

public interface ITaskContinuityManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.datatransfer.continuity.ITaskContinuityManager";
    public void registerHandoffFeatureStateListener(int p0, android.companion.datatransfer.continuity.IHandoffFeatureStateListener p1) throws android.os.RemoteException;
    public void registerRemoteTaskListener(int p0, android.companion.datatransfer.continuity.IRemoteTaskListener p1) throws android.os.RemoteException;
    public void requestHandoff(int p0, int p1, int p2, android.companion.datatransfer.continuity.IHandoffRequestCallback p3) throws android.os.RemoteException;
    public void setHandoffForDeviceEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void unregisterHandoffFeatureStateListener(int p0, android.companion.datatransfer.continuity.IHandoffFeatureStateListener p1) throws android.os.RemoteException;
    public void unregisterRemoteTaskListener(int p0, android.companion.datatransfer.continuity.IRemoteTaskListener p1) throws android.os.RemoteException;

    public static class Default implements android.companion.datatransfer.continuity.ITaskContinuityManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void registerHandoffFeatureStateListener(int p0, android.companion.datatransfer.continuity.IHandoffFeatureStateListener p1) throws android.os.RemoteException {}
        public void registerRemoteTaskListener(int p0, android.companion.datatransfer.continuity.IRemoteTaskListener p1) throws android.os.RemoteException {}
        public void requestHandoff(int p0, int p1, int p2, android.companion.datatransfer.continuity.IHandoffRequestCallback p3) throws android.os.RemoteException {}
        public void setHandoffForDeviceEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void unregisterHandoffFeatureStateListener(int p0, android.companion.datatransfer.continuity.IHandoffFeatureStateListener p1) throws android.os.RemoteException {}
        public void unregisterRemoteTaskListener(int p0, android.companion.datatransfer.continuity.IRemoteTaskListener p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.datatransfer.continuity.ITaskContinuityManager {
        static final int TRANSACTION_registerHandoffFeatureStateListener = 5;
        static final int TRANSACTION_registerRemoteTaskListener = 1;
        static final int TRANSACTION_requestHandoff = 3;
        static final int TRANSACTION_setHandoffForDeviceEnabled = 4;
        static final int TRANSACTION_unregisterHandoffFeatureStateListener = 6;
        static final int TRANSACTION_unregisterRemoteTaskListener = 2;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.companion.datatransfer.continuity.ITaskContinuityManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void registerHandoffFeatureStateListener_enforcePermission() throws java.lang.SecurityException {}
        protected void registerRemoteTaskListener_enforcePermission() throws java.lang.SecurityException {}
        protected void requestHandoff_enforcePermission() throws java.lang.SecurityException {}
        protected void setHandoffForDeviceEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterHandoffFeatureStateListener_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterRemoteTaskListener_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.companion.datatransfer.continuity.ITaskContinuityManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void registerHandoffFeatureStateListener(int p0, android.companion.datatransfer.continuity.IHandoffFeatureStateListener p1) throws android.os.RemoteException {}
            public void registerRemoteTaskListener(int p0, android.companion.datatransfer.continuity.IRemoteTaskListener p1) throws android.os.RemoteException {}
            public void requestHandoff(int p0, int p1, int p2, android.companion.datatransfer.continuity.IHandoffRequestCallback p3) throws android.os.RemoteException {}
            public void setHandoffForDeviceEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void unregisterHandoffFeatureStateListener(int p0, android.companion.datatransfer.continuity.IHandoffFeatureStateListener p1) throws android.os.RemoteException {}
            public void unregisterRemoteTaskListener(int p0, android.companion.datatransfer.continuity.IRemoteTaskListener p1) throws android.os.RemoteException {}
        }
    }
}
