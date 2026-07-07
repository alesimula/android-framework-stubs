package android.view.selectiontoolbar;

public interface ISelectionToolbarManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.selectiontoolbar.ISelectionToolbarManager";
    public void dismissToolbar() throws android.os.RemoteException;
    public void hideToolbar() throws android.os.RemoteException;
    public void showToolbar(android.view.selectiontoolbar.ShowInfo p0, android.view.selectiontoolbar.ISelectionToolbarCallback p1) throws android.os.RemoteException;

    public static class Default implements android.view.selectiontoolbar.ISelectionToolbarManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void dismissToolbar() throws android.os.RemoteException {}
        public void hideToolbar() throws android.os.RemoteException {}
        public void showToolbar(android.view.selectiontoolbar.ShowInfo p0, android.view.selectiontoolbar.ISelectionToolbarCallback p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.view.selectiontoolbar.ISelectionToolbarManager {
        static final int TRANSACTION_dismissToolbar = 3;
        static final int TRANSACTION_hideToolbar = 2;
        static final int TRANSACTION_showToolbar = 1;
        public Stub() { super(); }
        public static android.view.selectiontoolbar.ISelectionToolbarManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.view.selectiontoolbar.ISelectionToolbarManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void dismissToolbar() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void hideToolbar() throws android.os.RemoteException {}
            public void showToolbar(android.view.selectiontoolbar.ShowInfo p0, android.view.selectiontoolbar.ISelectionToolbarCallback p1) throws android.os.RemoteException {}
        }
    }
}
