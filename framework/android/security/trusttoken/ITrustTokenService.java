package android.security.trusttoken;

public interface ITrustTokenService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.trusttoken.ITrustTokenService";
    public void onRequestTrustTokens(android.security.trusttoken.TrustTokenRequest p0, android.security.trusttoken.ITrustTokenCallback p1) throws android.os.RemoteException;

    public static class Default implements android.security.trusttoken.ITrustTokenService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onRequestTrustTokens(android.security.trusttoken.TrustTokenRequest p0, android.security.trusttoken.ITrustTokenCallback p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.security.trusttoken.ITrustTokenService {
        static final int TRANSACTION_onRequestTrustTokens = 1;
        public Stub() { super(); }
        public static android.security.trusttoken.ITrustTokenService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.security.trusttoken.ITrustTokenService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onRequestTrustTokens(android.security.trusttoken.TrustTokenRequest p0, android.security.trusttoken.ITrustTokenCallback p1) throws android.os.RemoteException {}
        }
    }
}
