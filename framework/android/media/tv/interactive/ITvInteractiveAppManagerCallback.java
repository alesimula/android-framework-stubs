package android.media.tv.interactive;

public interface ITvInteractiveAppManagerCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.interactive.ITvInteractiveAppManagerCallback";
    public void onInteractiveAppServiceAdded(java.lang.String p0) throws android.os.RemoteException;
    public void onInteractiveAppServiceRemoved(java.lang.String p0) throws android.os.RemoteException;
    public void onInteractiveAppServiceUpdated(java.lang.String p0) throws android.os.RemoteException;
    public void onOperatorAppPackageStatus(java.lang.String p0, android.media.tv.interactive.OperatorAppServiceInfo p1, int p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void onStateChanged(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onTvInteractiveAppServiceInfoUpdated(android.media.tv.interactive.TvInteractiveAppServiceInfo p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.interactive.ITvInteractiveAppManagerCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onInteractiveAppServiceAdded(java.lang.String p0) throws android.os.RemoteException {}
        public void onInteractiveAppServiceRemoved(java.lang.String p0) throws android.os.RemoteException {}
        public void onInteractiveAppServiceUpdated(java.lang.String p0) throws android.os.RemoteException {}
        public void onOperatorAppPackageStatus(java.lang.String p0, android.media.tv.interactive.OperatorAppServiceInfo p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void onStateChanged(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onTvInteractiveAppServiceInfoUpdated(android.media.tv.interactive.TvInteractiveAppServiceInfo p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.interactive.ITvInteractiveAppManagerCallback {
        static final int TRANSACTION_onInteractiveAppServiceAdded = 1;
        static final int TRANSACTION_onInteractiveAppServiceRemoved = 2;
        static final int TRANSACTION_onInteractiveAppServiceUpdated = 3;
        static final int TRANSACTION_onOperatorAppPackageStatus = 6;
        static final int TRANSACTION_onStateChanged = 5;
        static final int TRANSACTION_onTvInteractiveAppServiceInfoUpdated = 4;
        public Stub() { super(); }
        public static android.media.tv.interactive.ITvInteractiveAppManagerCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.interactive.ITvInteractiveAppManagerCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onInteractiveAppServiceAdded(java.lang.String p0) throws android.os.RemoteException {}
            public void onInteractiveAppServiceRemoved(java.lang.String p0) throws android.os.RemoteException {}
            public void onInteractiveAppServiceUpdated(java.lang.String p0) throws android.os.RemoteException {}
            public void onOperatorAppPackageStatus(java.lang.String p0, android.media.tv.interactive.OperatorAppServiceInfo p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void onStateChanged(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onTvInteractiveAppServiceInfoUpdated(android.media.tv.interactive.TvInteractiveAppServiceInfo p0) throws android.os.RemoteException {}
        }
    }
}
