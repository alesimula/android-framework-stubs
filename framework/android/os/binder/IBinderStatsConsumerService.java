package android.os.binder;

public interface IBinderStatsConsumerService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.binder.IBinderStatsConsumerService";
    public void reportCallStats(android.os.binder.BinderCallsStats[] p0) throws android.os.RemoteException;
    public void reportSecondGranularityStats(android.os.binder.SingleSecondBinderStats[] p0, android.os.binder.DroppedBinderStats p1) throws android.os.RemoteException;
    public void reportSpamStats(android.os.binder.BinderSpamStats[] p0) throws android.os.RemoteException;

    public static class Default implements android.os.binder.IBinderStatsConsumerService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void reportCallStats(android.os.binder.BinderCallsStats[] p0) throws android.os.RemoteException {}
        public void reportSecondGranularityStats(android.os.binder.SingleSecondBinderStats[] p0, android.os.binder.DroppedBinderStats p1) throws android.os.RemoteException {}
        public void reportSpamStats(android.os.binder.BinderSpamStats[] p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.binder.IBinderStatsConsumerService {
        static final int TRANSACTION_reportCallStats = 1;
        static final int TRANSACTION_reportSecondGranularityStats = 3;
        static final int TRANSACTION_reportSpamStats = 2;
        public Stub() { super(); }
        public static android.os.binder.IBinderStatsConsumerService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.binder.IBinderStatsConsumerService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void reportCallStats(android.os.binder.BinderCallsStats[] p0) throws android.os.RemoteException {}
            public void reportSecondGranularityStats(android.os.binder.SingleSecondBinderStats[] p0, android.os.binder.DroppedBinderStats p1) throws android.os.RemoteException {}
            public void reportSpamStats(android.os.binder.BinderSpamStats[] p0) throws android.os.RemoteException {}
        }
    }
}
