package android.uilatencystats;

public interface IUiLatencyStats extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.uilatencystats.IUiLatencyStats";
    public void reportEvent(int p0, long p1) throws android.os.RemoteException;

    public static class Default implements android.uilatencystats.IUiLatencyStats {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void reportEvent(int p0, long p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.uilatencystats.IUiLatencyStats {
        static final int TRANSACTION_reportEvent = 1;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.uilatencystats.IUiLatencyStats asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void reportEvent_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.uilatencystats.IUiLatencyStats {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void reportEvent(int p0, long p1) throws android.os.RemoteException {}
        }
    }
}
