package android.service.settings.preferences;

public interface ISetValueCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.settings.preferences.ISetValueCallback";
    public void onFailure() throws android.os.RemoteException;
    public void onSuccess(android.service.settings.preferences.SetValueResult p0) throws android.os.RemoteException;

    public static class Default implements android.service.settings.preferences.ISetValueCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onFailure() throws android.os.RemoteException {}
        public void onSuccess(android.service.settings.preferences.SetValueResult p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.settings.preferences.ISetValueCallback {
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;
        public Stub() { super(); }
        public static android.service.settings.preferences.ISetValueCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.settings.preferences.ISetValueCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onFailure() throws android.os.RemoteException {}
            public void onSuccess(android.service.settings.preferences.SetValueResult p0) throws android.os.RemoteException {}
        }
    }
}
