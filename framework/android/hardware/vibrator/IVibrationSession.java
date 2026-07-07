package android.hardware.vibrator;

public interface IVibrationSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "dec155403ea3aa5395b0226de399873712b16082";
    public static final int VERSION = 4;
    public void abort() throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;

    public static class Default implements android.hardware.vibrator.IVibrationSession {
        public Default() {}
        public void abort() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void close() throws android.os.RemoteException {}
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.vibrator.IVibrationSession {
        static final int TRANSACTION_abort = 2;
        static final int TRANSACTION_close = 1;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        public Stub() { super(); }
        public static android.hardware.vibrator.IVibrationSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.vibrator.IVibrationSession {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void abort() throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void close() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
        }
    }
}
