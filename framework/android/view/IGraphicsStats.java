package android.view;

public interface IGraphicsStats extends android.os.IInterface {
    public android.os.ParcelFileDescriptor requestBufferForProcess(java.lang.String p0, android.view.IGraphicsStatsCallback p1) throws android.os.RemoteException;

    public static class Default implements android.view.IGraphicsStats {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.os.ParcelFileDescriptor requestBufferForProcess(java.lang.String p0, android.view.IGraphicsStatsCallback p1) throws android.os.RemoteException { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IGraphicsStats {
        public static final java.lang.String DESCRIPTOR = "android.view.IGraphicsStats";
        static final int TRANSACTION_requestBufferForProcess = 1;
        public Stub() { super(); }
        public static android.view.IGraphicsStats asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.view.IGraphicsStats {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.ParcelFileDescriptor requestBufferForProcess(java.lang.String p0, android.view.IGraphicsStatsCallback p1) throws android.os.RemoteException { return null; }
        }
    }
}
