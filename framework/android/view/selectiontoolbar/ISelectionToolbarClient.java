package android.view.selectiontoolbar;

public interface ISelectionToolbarClient extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.selectiontoolbar.ISelectionToolbarClient";
    public void onMenuItemClicked(int p0) throws android.os.RemoteException;
    public void onSessionError(android.os.ParcelableException p0) throws android.os.RemoteException;
    public void onSessionOpened() throws android.os.RemoteException;
    public void onUpdated(android.view.SurfaceControlViewHost.SurfacePackage p0, android.graphics.Rect p1, android.graphics.Region p2) throws android.os.RemoteException;
    public void onVisibilityChanged(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.view.selectiontoolbar.ISelectionToolbarClient {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onMenuItemClicked(int p0) throws android.os.RemoteException {}
        public void onSessionError(android.os.ParcelableException p0) throws android.os.RemoteException {}
        public void onSessionOpened() throws android.os.RemoteException {}
        public void onUpdated(android.view.SurfaceControlViewHost.SurfacePackage p0, android.graphics.Rect p1, android.graphics.Region p2) throws android.os.RemoteException {}
        public void onVisibilityChanged(boolean p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.view.selectiontoolbar.ISelectionToolbarClient {
        static final int TRANSACTION_onMenuItemClicked = 5;
        static final int TRANSACTION_onSessionError = 2;
        static final int TRANSACTION_onSessionOpened = 1;
        static final int TRANSACTION_onUpdated = 3;
        static final int TRANSACTION_onVisibilityChanged = 4;
        public Stub() { super(); }
        public static android.view.selectiontoolbar.ISelectionToolbarClient asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.view.selectiontoolbar.ISelectionToolbarClient {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onMenuItemClicked(int p0) throws android.os.RemoteException {}
            public void onSessionError(android.os.ParcelableException p0) throws android.os.RemoteException {}
            public void onSessionOpened() throws android.os.RemoteException {}
            public void onUpdated(android.view.SurfaceControlViewHost.SurfacePackage p0, android.graphics.Rect p1, android.graphics.Region p2) throws android.os.RemoteException {}
            public void onVisibilityChanged(boolean p0) throws android.os.RemoteException {}
        }
    }
}
