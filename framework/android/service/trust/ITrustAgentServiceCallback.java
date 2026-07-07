package android.service.trust;

public interface ITrustAgentServiceCallback extends android.os.IInterface {
    public void addEscrowToken(byte[] p0, int p1) throws android.os.RemoteException;
    public void grantTrust(java.lang.CharSequence p0, long p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException;
    public void isEscrowTokenActive(long p0, int p1) throws android.os.RemoteException;
    public void lockUser() throws android.os.RemoteException;
    public void onConfigureCompleted(boolean p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void removeEscrowToken(long p0, int p1) throws android.os.RemoteException;
    public void revokeTrust() throws android.os.RemoteException;
    public void setManagingTrust(boolean p0) throws android.os.RemoteException;
    public void showKeyguardErrorMessage(java.lang.CharSequence p0) throws android.os.RemoteException;
    public void unlockUserWithToken(long p0, byte[] p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.service.trust.ITrustAgentServiceCallback {
        public Default() {}
        public void addEscrowToken(byte[] p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void grantTrust(java.lang.CharSequence p0, long p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
        public void isEscrowTokenActive(long p0, int p1) throws android.os.RemoteException {}
        public void lockUser() throws android.os.RemoteException {}
        public void onConfigureCompleted(boolean p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void removeEscrowToken(long p0, int p1) throws android.os.RemoteException {}
        public void revokeTrust() throws android.os.RemoteException {}
        public void setManagingTrust(boolean p0) throws android.os.RemoteException {}
        public void showKeyguardErrorMessage(java.lang.CharSequence p0) throws android.os.RemoteException {}
        public void unlockUserWithToken(long p0, byte[] p1, int p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.trust.ITrustAgentServiceCallback {
        public static final java.lang.String DESCRIPTOR = "android.service.trust.ITrustAgentServiceCallback";
        static final int TRANSACTION_addEscrowToken = 6;
        static final int TRANSACTION_grantTrust = 1;
        static final int TRANSACTION_isEscrowTokenActive = 7;
        static final int TRANSACTION_lockUser = 3;
        static final int TRANSACTION_onConfigureCompleted = 5;
        static final int TRANSACTION_removeEscrowToken = 8;
        static final int TRANSACTION_revokeTrust = 2;
        static final int TRANSACTION_setManagingTrust = 4;
        static final int TRANSACTION_showKeyguardErrorMessage = 10;
        static final int TRANSACTION_unlockUserWithToken = 9;
        public Stub() { super(); }
        public static android.service.trust.ITrustAgentServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.trust.ITrustAgentServiceCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addEscrowToken(byte[] p0, int p1) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void grantTrust(java.lang.CharSequence p0, long p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
            public void isEscrowTokenActive(long p0, int p1) throws android.os.RemoteException {}
            public void lockUser() throws android.os.RemoteException {}
            public void onConfigureCompleted(boolean p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void removeEscrowToken(long p0, int p1) throws android.os.RemoteException {}
            public void revokeTrust() throws android.os.RemoteException {}
            public void setManagingTrust(boolean p0) throws android.os.RemoteException {}
            public void showKeyguardErrorMessage(java.lang.CharSequence p0) throws android.os.RemoteException {}
            public void unlockUserWithToken(long p0, byte[] p1, int p2) throws android.os.RemoteException {}
        }
    }
}
