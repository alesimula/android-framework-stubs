package android.security;

public interface IKeyChainManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.IKeyChainManager";
    public byte[] getCaCertificates(java.lang.String p0, int p1) throws android.os.RemoteException;
    public byte[] getCertificate(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.security.GrantedKeyInfo> getGrantedKeyPairs(int p0) throws android.os.RemoteException;
    public java.lang.String getWifiKeyGrant(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean hasWifiKeyGrant(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public java.lang.String requestDevicePrivateKey(java.lang.String p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.security.IKeyChainManager {
        static final int TRANSACTION_getCaCertificates = 3;
        static final int TRANSACTION_getCertificate = 2;
        static final int TRANSACTION_getGrantedKeyPairs = 6;
        static final int TRANSACTION_getWifiKeyGrant = 4;
        static final int TRANSACTION_hasWifiKeyGrant = 5;
        static final int TRANSACTION_requestDevicePrivateKey = 1;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.security.IKeyChainManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void getWifiKeyGrant_enforcePermission() throws java.lang.SecurityException {}
        protected void hasWifiKeyGrant_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.security.IKeyChainManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public byte[] getCaCertificates(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public byte[] getCertificate(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice<android.security.GrantedKeyInfo> getGrantedKeyPairs(int p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getWifiKeyGrant(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public boolean hasWifiKeyGrant(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public java.lang.String requestDevicePrivateKey(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.security.IKeyChainManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public byte[] getCaCertificates(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public byte[] getCertificate(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice<android.security.GrantedKeyInfo> getGrantedKeyPairs(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getWifiKeyGrant(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public boolean hasWifiKeyGrant(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public java.lang.String requestDevicePrivateKey(java.lang.String p0) throws android.os.RemoteException { return null; }
    }
}
