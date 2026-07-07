package android.service.attention;

public interface IAttentionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.attention.IAttentionService";
    public void cancelAttentionCheck(android.service.attention.IAttentionCallback p0) throws android.os.RemoteException;
    public void checkAttention(android.service.attention.IAttentionCallback p0) throws android.os.RemoteException;
    public void onStartProximityUpdates(android.service.attention.IProximityUpdateCallback p0) throws android.os.RemoteException;
    public void onStopProximityUpdates() throws android.os.RemoteException;

    public static class Default implements android.service.attention.IAttentionService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void cancelAttentionCheck(android.service.attention.IAttentionCallback p0) throws android.os.RemoteException {}
        public void checkAttention(android.service.attention.IAttentionCallback p0) throws android.os.RemoteException {}
        public void onStartProximityUpdates(android.service.attention.IProximityUpdateCallback p0) throws android.os.RemoteException {}
        public void onStopProximityUpdates() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.attention.IAttentionService {
        static final int TRANSACTION_cancelAttentionCheck = 2;
        static final int TRANSACTION_checkAttention = 1;
        static final int TRANSACTION_onStartProximityUpdates = 3;
        static final int TRANSACTION_onStopProximityUpdates = 4;
        public Stub() { super(); }
        public static android.service.attention.IAttentionService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.attention.IAttentionService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void cancelAttentionCheck(android.service.attention.IAttentionCallback p0) throws android.os.RemoteException {}
            public void checkAttention(android.service.attention.IAttentionCallback p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onStartProximityUpdates(android.service.attention.IProximityUpdateCallback p0) throws android.os.RemoteException {}
            public void onStopProximityUpdates() throws android.os.RemoteException {}
        }
    }
}
