package android.service.games;

public interface IGameServiceController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.games.IGameServiceController";
    public void createGameSession(int p0) throws android.os.RemoteException;

    public static class Default implements android.service.games.IGameServiceController {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void createGameSession(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.games.IGameServiceController {
        static final int TRANSACTION_createGameSession = 1;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.service.games.IGameServiceController asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void createGameSession_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.games.IGameServiceController {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void createGameSession(int p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
