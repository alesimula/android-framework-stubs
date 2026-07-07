package android.service.games;

public interface IGameSessionController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.games.IGameSessionController";
    public void restartGame(int p0) throws android.os.RemoteException;
    public void takeScreenshot(int p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException;

    public static class Default implements android.service.games.IGameSessionController {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void restartGame(int p0) throws android.os.RemoteException {}
        public void takeScreenshot(int p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.games.IGameSessionController {
        static final int TRANSACTION_restartGame = 2;
        static final int TRANSACTION_takeScreenshot = 1;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.service.games.IGameSessionController asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void restartGame_enforcePermission() throws java.lang.SecurityException {}
        protected void takeScreenshot_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.service.games.IGameSessionController {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void restartGame(int p0) throws android.os.RemoteException {}
            public void takeScreenshot(int p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
        }
    }
}
