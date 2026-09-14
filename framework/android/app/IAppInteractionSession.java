package android.app;

public interface IAppInteractionSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IAppInteractionSession";
    public void addLifecycleListener(android.app.IAppInteractionLifecycleListener p0) throws android.os.RemoteException;
    public boolean checkAccess(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public void removeLifecycleListener(android.app.IAppInteractionLifecycleListener p0) throws android.os.RemoteException;
    public void update(java.util.List<java.lang.String> p0, android.app.IAppInteractionSessionUpdateCallback p1) throws android.os.RemoteException;

    public static class Default implements android.app.IAppInteractionSession {
        public Default() {}
        public void addLifecycleListener(android.app.IAppInteractionLifecycleListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public boolean checkAccess(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public void close() throws android.os.RemoteException {}
        public void removeLifecycleListener(android.app.IAppInteractionLifecycleListener p0) throws android.os.RemoteException {}
        public void update(java.util.List<java.lang.String> p0, android.app.IAppInteractionSessionUpdateCallback p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IAppInteractionSession {
        static final int TRANSACTION_addLifecycleListener = 2;
        static final int TRANSACTION_checkAccess = 5;
        static final int TRANSACTION_close = 1;
        static final int TRANSACTION_removeLifecycleListener = 3;
        static final int TRANSACTION_update = 4;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.app.IAppInteractionSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void checkAccess_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.IAppInteractionSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addLifecycleListener(android.app.IAppInteractionLifecycleListener p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public boolean checkAccess(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public void close() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void removeLifecycleListener(android.app.IAppInteractionLifecycleListener p0) throws android.os.RemoteException {}
            public void update(java.util.List<java.lang.String> p0, android.app.IAppInteractionSessionUpdateCallback p1) throws android.os.RemoteException {}
        }
    }
}
