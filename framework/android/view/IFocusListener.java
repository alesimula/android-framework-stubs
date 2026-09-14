package android.view;

public interface IFocusListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.IFocusListener";
    public void onFocusChanged(int p0, int p1, int p2) throws android.os.RemoteException;
    public void onFocusedDisplayChanged(int p0) throws android.os.RemoteException;

    public static class Default implements android.view.IFocusListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onFocusChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onFocusedDisplayChanged(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IFocusListener {
        static final int TRANSACTION_onFocusChanged = 1;
        static final int TRANSACTION_onFocusedDisplayChanged = 2;
        public Stub() { super(); }
        public static android.view.IFocusListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.view.IFocusListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onFocusChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void onFocusedDisplayChanged(int p0) throws android.os.RemoteException {}
        }
    }
}
