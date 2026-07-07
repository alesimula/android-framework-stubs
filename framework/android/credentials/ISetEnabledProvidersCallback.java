package android.credentials;

public interface ISetEnabledProvidersCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.credentials.ISetEnabledProvidersCallback";
    public void onError(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void onResponse() throws android.os.RemoteException;

    public static class Default implements android.credentials.ISetEnabledProvidersCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onError(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onResponse() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.credentials.ISetEnabledProvidersCallback {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onResponse = 1;
        public Stub() { super(); }
        public static android.credentials.ISetEnabledProvidersCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.credentials.ISetEnabledProvidersCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onResponse() throws android.os.RemoteException {}
        }
    }
}
