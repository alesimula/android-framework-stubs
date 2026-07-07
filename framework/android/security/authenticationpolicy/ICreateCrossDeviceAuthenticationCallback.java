package android.security.authenticationpolicy;

public interface ICreateCrossDeviceAuthenticationCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.authenticationpolicy.ICreateCrossDeviceAuthenticationCallback";
    public void onError(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onSuccess(byte[] p0) throws android.os.RemoteException;

    public static class Default implements android.security.authenticationpolicy.ICreateCrossDeviceAuthenticationCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onSuccess(byte[] p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.security.authenticationpolicy.ICreateCrossDeviceAuthenticationCallback {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;
        public Stub() { super(); }
        public static android.security.authenticationpolicy.ICreateCrossDeviceAuthenticationCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.security.authenticationpolicy.ICreateCrossDeviceAuthenticationCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onSuccess(byte[] p0) throws android.os.RemoteException {}
        }
    }
}
