package android.security.trusttoken;

public interface ITrustTokenManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.trusttoken.ITrustTokenManager";
    public android.security.trusttoken.TrustTokenIdentitySet acquirePreparedIdentitySet(byte[] p0) throws android.os.RemoteException;
    public android.security.trusttoken.TrustTokenWithChallenge acquireVerifiedDeviceToken(byte[] p0) throws android.os.RemoteException;
    public void updatePreparedIdentities(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public int[] verifyIdentityTokens(android.security.trusttoken.TrustToken p0, android.security.trusttoken.TrustToken[] p1) throws android.os.RemoteException;
    public int verifyTrustTokenAndChallenge(android.security.trusttoken.TrustToken p0, byte[] p1, byte[] p2) throws android.os.RemoteException;

    public static class Default implements android.security.trusttoken.ITrustTokenManager {
        public Default() {}
        public android.security.trusttoken.TrustTokenIdentitySet acquirePreparedIdentitySet(byte[] p0) throws android.os.RemoteException { return null; }
        public android.security.trusttoken.TrustTokenWithChallenge acquireVerifiedDeviceToken(byte[] p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
        public void updatePreparedIdentities(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public int[] verifyIdentityTokens(android.security.trusttoken.TrustToken p0, android.security.trusttoken.TrustToken[] p1) throws android.os.RemoteException { return null; }
        public int verifyTrustTokenAndChallenge(android.security.trusttoken.TrustToken p0, byte[] p1, byte[] p2) throws android.os.RemoteException { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.trusttoken.ITrustTokenManager {
        static final java.lang.String[] PERMISSIONS_acquireVerifiedDeviceToken = null;
        static final int TRANSACTION_acquirePreparedIdentitySet = 2;
        static final int TRANSACTION_acquireVerifiedDeviceToken = 1;
        static final int TRANSACTION_updatePreparedIdentities = 5;
        static final int TRANSACTION_verifyIdentityTokens = 4;
        static final int TRANSACTION_verifyTrustTokenAndChallenge = 3;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.security.trusttoken.ITrustTokenManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void acquireVerifiedDeviceToken_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void verifyTrustTokenAndChallenge_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.security.trusttoken.ITrustTokenManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.security.trusttoken.TrustTokenIdentitySet acquirePreparedIdentitySet(byte[] p0) throws android.os.RemoteException { return null; }
            public android.security.trusttoken.TrustTokenWithChallenge acquireVerifiedDeviceToken(byte[] p0) throws android.os.RemoteException { return null; }
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void updatePreparedIdentities(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public int[] verifyIdentityTokens(android.security.trusttoken.TrustToken p0, android.security.trusttoken.TrustToken[] p1) throws android.os.RemoteException { return null; }
            public int verifyTrustTokenAndChallenge(android.security.trusttoken.TrustToken p0, byte[] p1, byte[] p2) throws android.os.RemoteException { return 0; }
        }
    }
}
