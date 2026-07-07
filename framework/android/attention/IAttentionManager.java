package android.attention;

public interface IAttentionManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.attention.IAttentionManager";
    public void clearListener() throws android.os.RemoteException;
    public void setListener(int p0, long p1, android.attention.IInteractionListener p2) throws android.os.RemoteException;

    public static class Default implements android.attention.IAttentionManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void clearListener() throws android.os.RemoteException {}
        public void setListener(int p0, long p1, android.attention.IInteractionListener p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.attention.IAttentionManager {
        static final int TRANSACTION_clearListener = 2;
        static final int TRANSACTION_setListener = 1;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.attention.IAttentionManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void clearListener_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setListener_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.attention.IAttentionManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void clearListener() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void setListener(int p0, long p1, android.attention.IInteractionListener p2) throws android.os.RemoteException {}
        }
    }
}
