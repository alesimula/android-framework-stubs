package android.service.games;

public interface IGameSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.games.IGameSession";
    public void onDestroyed() throws android.os.RemoteException;
    public void onTaskFocusChanged(boolean p0) throws android.os.RemoteException;
    public void onTransientSystemBarVisibilityFromRevealGestureChanged(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.service.games.IGameSession {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onDestroyed() throws android.os.RemoteException {}
        public void onTaskFocusChanged(boolean p0) throws android.os.RemoteException {}
        public void onTransientSystemBarVisibilityFromRevealGestureChanged(boolean p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.games.IGameSession {
        static final int TRANSACTION_onDestroyed = 1;
        static final int TRANSACTION_onTaskFocusChanged = 3;
        static final int TRANSACTION_onTransientSystemBarVisibilityFromRevealGestureChanged = 2;
        public Stub() { super(); }
        public static android.service.games.IGameSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.games.IGameSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onDestroyed() throws android.os.RemoteException {}
            public void onTaskFocusChanged(boolean p0) throws android.os.RemoteException {}
            public void onTransientSystemBarVisibilityFromRevealGestureChanged(boolean p0) throws android.os.RemoteException {}
        }
    }
}
