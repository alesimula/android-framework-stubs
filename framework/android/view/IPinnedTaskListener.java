package android.view;

public interface IPinnedTaskListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.IPinnedTaskListener";
    public void onImeVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException;
    public void onMovementBoundsChanged(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.view.IPinnedTaskListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onImeVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException {}
        public void onMovementBoundsChanged(boolean p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IPinnedTaskListener {
        static final int TRANSACTION_onImeVisibilityChanged = 2;
        static final int TRANSACTION_onMovementBoundsChanged = 1;
        public Stub() { super(); }
        public static android.view.IPinnedTaskListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.view.IPinnedTaskListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onImeVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException {}
            public void onMovementBoundsChanged(boolean p0) throws android.os.RemoteException {}
        }
    }
}
