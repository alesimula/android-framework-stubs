package android.media.projection;

public interface IAppContentProjectionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.projection.IAppContentProjectionCallback";
    public void onContentRequest(android.os.RemoteCallback p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void onContentRequestCanceled() throws android.os.RemoteException;
    public void onLoopbackProjectionStarted(android.media.projection.IAppContentProjectionSession p0, int p1, boolean p2) throws android.os.RemoteException;
    public void onSessionStopped() throws android.os.RemoteException;

    public static class Default implements android.media.projection.IAppContentProjectionCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onContentRequest(android.os.RemoteCallback p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void onContentRequestCanceled() throws android.os.RemoteException {}
        public void onLoopbackProjectionStarted(android.media.projection.IAppContentProjectionSession p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void onSessionStopped() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.projection.IAppContentProjectionCallback {
        static final java.lang.String[] PERMISSIONS_onContentRequest = null;
        static final java.lang.String[] PERMISSIONS_onContentRequestCanceled = null;
        static final java.lang.String[] PERMISSIONS_onLoopbackProjectionStarted = null;
        static final java.lang.String[] PERMISSIONS_onSessionStopped = null;
        static final int TRANSACTION_onContentRequest = 1;
        static final int TRANSACTION_onContentRequestCanceled = 4;
        static final int TRANSACTION_onLoopbackProjectionStarted = 2;
        static final int TRANSACTION_onSessionStopped = 3;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.media.projection.IAppContentProjectionCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void onContentRequestCanceled_enforcePermission() throws java.lang.SecurityException {}
        protected void onContentRequest_enforcePermission() throws java.lang.SecurityException {}
        protected void onLoopbackProjectionStarted_enforcePermission() throws java.lang.SecurityException {}
        protected void onSessionStopped_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.projection.IAppContentProjectionCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onContentRequest(android.os.RemoteCallback p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void onContentRequestCanceled() throws android.os.RemoteException {}
            public void onLoopbackProjectionStarted(android.media.projection.IAppContentProjectionSession p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void onSessionStopped() throws android.os.RemoteException {}
        }
    }
}
