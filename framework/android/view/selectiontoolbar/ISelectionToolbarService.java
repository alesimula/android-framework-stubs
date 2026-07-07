package android.view.selectiontoolbar;

public interface ISelectionToolbarService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.selectiontoolbar.ISelectionToolbarService";
    public void closeSession(android.view.selectiontoolbar.ISelectionToolbarClient p0) throws android.os.RemoteException;
    public void hideSession(android.view.selectiontoolbar.ISelectionToolbarClient p0) throws android.os.RemoteException;
    public void openSession(android.view.selectiontoolbar.SelectionToolbarRequest p0, android.view.selectiontoolbar.ISelectionToolbarClient p1) throws android.os.RemoteException;
    public void updateSession(android.view.selectiontoolbar.ISelectionToolbarClient p0, boolean p1, java.util.List<android.view.selectiontoolbar.ToolbarMenuItem> p2, android.graphics.Rect p3, int p4) throws android.os.RemoteException;

    public static class Default implements android.view.selectiontoolbar.ISelectionToolbarService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void closeSession(android.view.selectiontoolbar.ISelectionToolbarClient p0) throws android.os.RemoteException {}
        public void hideSession(android.view.selectiontoolbar.ISelectionToolbarClient p0) throws android.os.RemoteException {}
        public void openSession(android.view.selectiontoolbar.SelectionToolbarRequest p0, android.view.selectiontoolbar.ISelectionToolbarClient p1) throws android.os.RemoteException {}
        public void updateSession(android.view.selectiontoolbar.ISelectionToolbarClient p0, boolean p1, java.util.List<android.view.selectiontoolbar.ToolbarMenuItem> p2, android.graphics.Rect p3, int p4) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.view.selectiontoolbar.ISelectionToolbarService {
        static final int TRANSACTION_closeSession = 4;
        static final int TRANSACTION_hideSession = 3;
        static final int TRANSACTION_openSession = 1;
        static final int TRANSACTION_updateSession = 2;
        public Stub() { super(); }
        public static android.view.selectiontoolbar.ISelectionToolbarService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.view.selectiontoolbar.ISelectionToolbarService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void closeSession(android.view.selectiontoolbar.ISelectionToolbarClient p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void hideSession(android.view.selectiontoolbar.ISelectionToolbarClient p0) throws android.os.RemoteException {}
            public void openSession(android.view.selectiontoolbar.SelectionToolbarRequest p0, android.view.selectiontoolbar.ISelectionToolbarClient p1) throws android.os.RemoteException {}
            public void updateSession(android.view.selectiontoolbar.ISelectionToolbarClient p0, boolean p1, java.util.List<android.view.selectiontoolbar.ToolbarMenuItem> p2, android.graphics.Rect p3, int p4) throws android.os.RemoteException {}
        }
    }
}
