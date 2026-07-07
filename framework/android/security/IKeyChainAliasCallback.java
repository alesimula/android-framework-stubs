package android.security;

public interface IKeyChainAliasCallback extends android.os.IInterface {
    public void alias(java.lang.String p0) throws android.os.RemoteException;
    public void onError(int p0) throws android.os.RemoteException;

    public static class Default implements android.security.IKeyChainAliasCallback {
        public Default() {}
        public void alias(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void onError(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.security.IKeyChainAliasCallback {
        public static final java.lang.String DESCRIPTOR = "android.security.IKeyChainAliasCallback";
        static final int TRANSACTION_alias = 1;
        static final int TRANSACTION_onError = 2;
        public Stub() { super(); }
        public static android.security.IKeyChainAliasCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.security.IKeyChainAliasCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void alias(java.lang.String p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(int p0) throws android.os.RemoteException {}
        }
    }
}
