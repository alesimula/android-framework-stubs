package android.hardware.biometrics.common;

public interface ICancellationSignal extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "8a6cd86630181a4df6f20056259ec200ffe39209";
    public static final int VERSION = 4;
    public void cancel() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.common.ICancellationSignal {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void cancel() throws android.os.RemoteException {}
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.common.ICancellationSignal {
        static final int TRANSACTION_cancel = 1;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        public Stub() { super(); }
        public static android.hardware.biometrics.common.ICancellationSignal asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.biometrics.common.ICancellationSignal {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void cancel() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
        }
    }
}
