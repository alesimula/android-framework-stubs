package android.os.allowlist;

public interface IAllowlistProviderService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.allowlist.IAllowlistProviderService";
    public void addRequestForAllowlistChange(android.os.allowlist.AllowlistRequest p0, android.os.allowlist.IProviderOnAllowlistChangedListener p1) throws android.os.RemoteException;
    public void notifyAllowlistChangedListenersForTestProvider(java.util.List<android.os.allowlist.AllowlistRequest> p0) throws android.os.RemoteException;
    public void queryAllowlist(android.os.allowlist.AllowlistRequest p0, android.os.RemoteCallback p1) throws android.os.RemoteException;
    public void removeRequestForAllowlistChange(android.os.allowlist.AllowlistRequest p0) throws android.os.RemoteException;

    public static class Default implements android.os.allowlist.IAllowlistProviderService {
        public Default() {}
        public void addRequestForAllowlistChange(android.os.allowlist.AllowlistRequest p0, android.os.allowlist.IProviderOnAllowlistChangedListener p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void notifyAllowlistChangedListenersForTestProvider(java.util.List<android.os.allowlist.AllowlistRequest> p0) throws android.os.RemoteException {}
        public void queryAllowlist(android.os.allowlist.AllowlistRequest p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void removeRequestForAllowlistChange(android.os.allowlist.AllowlistRequest p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.allowlist.IAllowlistProviderService {
        static final int TRANSACTION_addRequestForAllowlistChange = 1;
        static final int TRANSACTION_notifyAllowlistChangedListenersForTestProvider = 4;
        static final int TRANSACTION_queryAllowlist = 3;
        static final int TRANSACTION_removeRequestForAllowlistChange = 2;
        public Stub() { super(); }
        public static android.os.allowlist.IAllowlistProviderService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.allowlist.IAllowlistProviderService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addRequestForAllowlistChange(android.os.allowlist.AllowlistRequest p0, android.os.allowlist.IProviderOnAllowlistChangedListener p1) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyAllowlistChangedListenersForTestProvider(java.util.List<android.os.allowlist.AllowlistRequest> p0) throws android.os.RemoteException {}
            public void queryAllowlist(android.os.allowlist.AllowlistRequest p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
            public void removeRequestForAllowlistChange(android.os.allowlist.AllowlistRequest p0) throws android.os.RemoteException {}
        }
    }
}
