package android.proximity;

public interface IProximityProviderService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.proximity.IProximityProviderService";
    public android.os.ICancellationSignal anyWatchNearby(android.proximity.RangingParams p0, android.proximity.IProximityResultCallback p1) throws android.os.RemoteException;
    public int isProximityCheckingAvailable() throws android.os.RemoteException;
    public boolean isProximityCheckingSupported() throws android.os.RemoteException;

    public static class Default implements android.proximity.IProximityProviderService {
        public Default() {}
        public android.os.ICancellationSignal anyWatchNearby(android.proximity.RangingParams p0, android.proximity.IProximityResultCallback p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
        public int isProximityCheckingAvailable() throws android.os.RemoteException { return 0; }
        public boolean isProximityCheckingSupported() throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.proximity.IProximityProviderService {
        static final int TRANSACTION_anyWatchNearby = 1;
        static final int TRANSACTION_isProximityCheckingAvailable = 3;
        static final int TRANSACTION_isProximityCheckingSupported = 2;
        public Stub() { super(); }
        public static android.proximity.IProximityProviderService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.proximity.IProximityProviderService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.ICancellationSignal anyWatchNearby(android.proximity.RangingParams p0, android.proximity.IProximityResultCallback p1) throws android.os.RemoteException { return null; }
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int isProximityCheckingAvailable() throws android.os.RemoteException { return 0; }
            public boolean isProximityCheckingSupported() throws android.os.RemoteException { return false; }
        }
    }
}
