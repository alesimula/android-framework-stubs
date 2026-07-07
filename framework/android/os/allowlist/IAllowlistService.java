package android.os.allowlist;

public interface IAllowlistService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.allowlist.IAllowlistService";
    public void addOnAllowlistChangedListener(android.os.allowlist.AllowlistRequest p0, android.os.allowlist.IOnAllowlistChangedListener p1) throws android.os.RemoteException;
    public void notifyAllowlistChangedListenersForTestProvider(java.util.List<android.os.allowlist.AllowlistRequest> p0) throws android.os.RemoteException;
    public void queryAllowlist(android.os.allowlist.AllowlistRequest p0, android.os.RemoteCallback p1) throws android.os.RemoteException;
    public void removeOnAllowlistChangedListener(android.os.allowlist.IOnAllowlistChangedListener p0) throws android.os.RemoteException;
    public void setTestAllowlistProvider(java.lang.String p0) throws android.os.RemoteException;
    public void setTestProviderEnabled(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.os.allowlist.IAllowlistService {
        public Default() {}
        public void addOnAllowlistChangedListener(android.os.allowlist.AllowlistRequest p0, android.os.allowlist.IOnAllowlistChangedListener p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void notifyAllowlistChangedListenersForTestProvider(java.util.List<android.os.allowlist.AllowlistRequest> p0) throws android.os.RemoteException {}
        public void queryAllowlist(android.os.allowlist.AllowlistRequest p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void removeOnAllowlistChangedListener(android.os.allowlist.IOnAllowlistChangedListener p0) throws android.os.RemoteException {}
        public void setTestAllowlistProvider(java.lang.String p0) throws android.os.RemoteException {}
        public void setTestProviderEnabled(boolean p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.allowlist.IAllowlistService {
        static final int TRANSACTION_addOnAllowlistChangedListener = 1;
        static final int TRANSACTION_notifyAllowlistChangedListenersForTestProvider = 5;
        static final int TRANSACTION_queryAllowlist = 3;
        static final int TRANSACTION_removeOnAllowlistChangedListener = 2;
        static final int TRANSACTION_setTestAllowlistProvider = 6;
        static final int TRANSACTION_setTestProviderEnabled = 4;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.os.allowlist.IAllowlistService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void addOnAllowlistChangedListener_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void notifyAllowlistChangedListenersForTestProvider_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void queryAllowlist_enforcePermission() throws java.lang.SecurityException {}
        protected void removeOnAllowlistChangedListener_enforcePermission() throws java.lang.SecurityException {}
        protected void setTestAllowlistProvider_enforcePermission() throws java.lang.SecurityException {}
        protected void setTestProviderEnabled_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.os.allowlist.IAllowlistService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addOnAllowlistChangedListener(android.os.allowlist.AllowlistRequest p0, android.os.allowlist.IOnAllowlistChangedListener p1) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyAllowlistChangedListenersForTestProvider(java.util.List<android.os.allowlist.AllowlistRequest> p0) throws android.os.RemoteException {}
            public void queryAllowlist(android.os.allowlist.AllowlistRequest p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
            public void removeOnAllowlistChangedListener(android.os.allowlist.IOnAllowlistChangedListener p0) throws android.os.RemoteException {}
            public void setTestAllowlistProvider(java.lang.String p0) throws android.os.RemoteException {}
            public void setTestProviderEnabled(boolean p0) throws android.os.RemoteException {}
        }
    }
}
