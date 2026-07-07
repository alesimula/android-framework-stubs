package android.accounts;

public interface IAccountAuthenticatorResponse extends android.os.IInterface {
    public void onError(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onRequestContinued() throws android.os.RemoteException;
    public void onResult(android.os.Bundle p0) throws android.os.RemoteException;

    public static class Default implements android.accounts.IAccountAuthenticatorResponse {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onRequestContinued() throws android.os.RemoteException {}
        public void onResult(android.os.Bundle p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.accounts.IAccountAuthenticatorResponse {
        public static final java.lang.String DESCRIPTOR = "android.accounts.IAccountAuthenticatorResponse";
        static final int TRANSACTION_onError = 3;
        static final int TRANSACTION_onRequestContinued = 2;
        static final int TRANSACTION_onResult = 1;
        public Stub() { super(); }
        public static android.accounts.IAccountAuthenticatorResponse asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.accounts.IAccountAuthenticatorResponse {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onRequestContinued() throws android.os.RemoteException {}
            public void onResult(android.os.Bundle p0) throws android.os.RemoteException {}
        }
    }
}
