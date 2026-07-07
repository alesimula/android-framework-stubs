package android.net;

public interface INetworkScoreCache extends android.os.IInterface {
    public void clearScores() throws android.os.RemoteException;
    public void updateScores(java.util.List<android.net.ScoredNetwork> p0) throws android.os.RemoteException;

    public static class Default implements android.net.INetworkScoreCache {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void clearScores() throws android.os.RemoteException {}
        public void updateScores(java.util.List<android.net.ScoredNetwork> p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.net.INetworkScoreCache {
        public static final java.lang.String DESCRIPTOR = "android.net.INetworkScoreCache";
        static final int TRANSACTION_clearScores = 2;
        static final int TRANSACTION_updateScores = 1;
        public Stub() { super(); }
        public static android.net.INetworkScoreCache asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.net.INetworkScoreCache {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void clearScores() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void updateScores(java.util.List<android.net.ScoredNetwork> p0) throws android.os.RemoteException {}
        }
    }
}
