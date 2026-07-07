package android.service.chooser;

public interface IChooserControllerCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.chooser.IChooserControllerCallback";
    public void onBoundsChanged(android.graphics.Rect p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public void onClosed() throws android.os.RemoteException;
    public void registerChooserController(android.service.chooser.IChooserController p0) throws android.os.RemoteException;

    public static class Default implements android.service.chooser.IChooserControllerCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onBoundsChanged(android.graphics.Rect p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void onClosed() throws android.os.RemoteException {}
        public void registerChooserController(android.service.chooser.IChooserController p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.chooser.IChooserControllerCallback {
        static final int TRANSACTION_onBoundsChanged = 2;
        static final int TRANSACTION_onClosed = 3;
        static final int TRANSACTION_registerChooserController = 1;
        public Stub() { super(); }
        public static android.service.chooser.IChooserControllerCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.chooser.IChooserControllerCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onBoundsChanged(android.graphics.Rect p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void onClosed() throws android.os.RemoteException {}
            public void registerChooserController(android.service.chooser.IChooserController p0) throws android.os.RemoteException {}
        }
    }
}
