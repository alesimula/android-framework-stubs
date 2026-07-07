package android.service.autofill;

public interface IConvertCredentialCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.autofill.IConvertCredentialCallback";
    public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException;
    public void onSuccess(android.service.autofill.ConvertCredentialResponse p0) throws android.os.RemoteException;

    public static class Default implements android.service.autofill.IConvertCredentialCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException {}
        public void onSuccess(android.service.autofill.ConvertCredentialResponse p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.autofill.IConvertCredentialCallback {
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;
        public Stub() { super(); }
        public static android.service.autofill.IConvertCredentialCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.autofill.IConvertCredentialCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException {}
            public void onSuccess(android.service.autofill.ConvertCredentialResponse p0) throws android.os.RemoteException {}
        }
    }
}
