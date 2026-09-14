package android.app;

public interface IAppInteractionSessionUpdateCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IAppInteractionSessionUpdateCallback";
    public void onError(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onUpdatePending(android.content.IntentSender p0) throws android.os.RemoteException;
    public void onUpdated() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.IAppInteractionSessionUpdateCallback {
        static final int TRANSACTION_onError = 3;
        static final int TRANSACTION_onUpdatePending = 1;
        static final int TRANSACTION_onUpdated = 2;
        public Stub() { super(); }
        public static android.app.IAppInteractionSessionUpdateCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.IAppInteractionSessionUpdateCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onUpdatePending(android.content.IntentSender p0) throws android.os.RemoteException {}
            public void onUpdated() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.IAppInteractionSessionUpdateCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onUpdatePending(android.content.IntentSender p0) throws android.os.RemoteException {}
        public void onUpdated() throws android.os.RemoteException {}
    }
}
