package android.view;

public interface ISurfaceControlViewHostParent extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.ISurfaceControlViewHostParent";
    public void forwardBackKeyToParent(android.view.KeyEvent p0) throws android.os.RemoteException;
    public void transferFocusToParent(int p0) throws android.os.RemoteException;
    public void updateParams(android.view.WindowManager.LayoutParams[] p0) throws android.os.RemoteException;

    public static class Default implements android.view.ISurfaceControlViewHostParent {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void forwardBackKeyToParent(android.view.KeyEvent p0) throws android.os.RemoteException {}
        public void transferFocusToParent(int p0) throws android.os.RemoteException {}
        public void updateParams(android.view.WindowManager.LayoutParams[] p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.view.ISurfaceControlViewHostParent {
        static final int TRANSACTION_forwardBackKeyToParent = 2;
        static final int TRANSACTION_transferFocusToParent = 3;
        static final int TRANSACTION_updateParams = 1;
        public Stub() { super(); }
        public static android.view.ISurfaceControlViewHostParent asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.view.ISurfaceControlViewHostParent {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void forwardBackKeyToParent(android.view.KeyEvent p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void transferFocusToParent(int p0) throws android.os.RemoteException {}
            public void updateParams(android.view.WindowManager.LayoutParams[] p0) throws android.os.RemoteException {}
        }
    }
}
