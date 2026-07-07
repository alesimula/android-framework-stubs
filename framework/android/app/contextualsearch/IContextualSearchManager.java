package android.app.contextualsearch;

public interface IContextualSearchManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.contextualsearch.IContextualSearchManager";
    public void getContextualSearchState(android.os.IBinder p0, android.app.contextualsearch.IContextualSearchCallback p1) throws android.os.RemoteException;
    public boolean isContextualSearchAvailable() throws android.os.RemoteException;
    public void startContextualSearch(int p0, android.app.contextualsearch.ContextualSearchConfig p1) throws android.os.RemoteException;
    public void startContextualSearchForApp(android.app.contextualsearch.ContextualSearchConfig p0) throws android.os.RemoteException;

    public static class Default implements android.app.contextualsearch.IContextualSearchManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void getContextualSearchState(android.os.IBinder p0, android.app.contextualsearch.IContextualSearchCallback p1) throws android.os.RemoteException {}
        public boolean isContextualSearchAvailable() throws android.os.RemoteException { return false; }
        public void startContextualSearch(int p0, android.app.contextualsearch.ContextualSearchConfig p1) throws android.os.RemoteException {}
        public void startContextualSearchForApp(android.app.contextualsearch.ContextualSearchConfig p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.contextualsearch.IContextualSearchManager {
        static final int TRANSACTION_getContextualSearchState = 4;
        static final int TRANSACTION_isContextualSearchAvailable = 1;
        static final int TRANSACTION_startContextualSearch = 3;
        static final int TRANSACTION_startContextualSearchForApp = 2;
        public Stub() { super(); }
        public static android.app.contextualsearch.IContextualSearchManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.contextualsearch.IContextualSearchManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void getContextualSearchState(android.os.IBinder p0, android.app.contextualsearch.IContextualSearchCallback p1) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isContextualSearchAvailable() throws android.os.RemoteException { return false; }
            public void startContextualSearch(int p0, android.app.contextualsearch.ContextualSearchConfig p1) throws android.os.RemoteException {}
            public void startContextualSearchForApp(android.app.contextualsearch.ContextualSearchConfig p0) throws android.os.RemoteException {}
        }
    }
}
