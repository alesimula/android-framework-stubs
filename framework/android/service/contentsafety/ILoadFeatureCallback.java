package android.service.contentsafety;

public interface ILoadFeatureCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.contentsafety.ILoadFeatureCallback";
    public void onError(int p0) throws android.os.RemoteException;
    public void onResult() throws android.os.RemoteException;

    public static class Default implements android.service.contentsafety.ILoadFeatureCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onError(int p0) throws android.os.RemoteException {}
        public void onResult() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.contentsafety.ILoadFeatureCallback {
        static final int TRANSACTION_onError = 3;
        static final int TRANSACTION_onResult = 2;
        public Stub() { super(); }
        public static android.service.contentsafety.ILoadFeatureCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.contentsafety.ILoadFeatureCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(int p0) throws android.os.RemoteException {}
            public void onResult() throws android.os.RemoteException {}
        }
    }
}
