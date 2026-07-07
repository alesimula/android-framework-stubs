package android.system.keystore2;

public interface IKeystoreOperation extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "b115fcb5d111eb616a65f0f32e0c2cef131575ec";
    public static final int VERSION = 6;
    public void abort() throws android.os.RemoteException;
    public byte[] finish(byte[] p0, byte[] p1) throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public byte[] update(byte[] p0) throws android.os.RemoteException;
    public void updateAad(byte[] p0) throws android.os.RemoteException;

    public static class Default implements android.system.keystore2.IKeystoreOperation {
        public Default() {}
        public void abort() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public byte[] finish(byte[] p0, byte[] p1) throws android.os.RemoteException { return null; }
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public byte[] update(byte[] p0) throws android.os.RemoteException { return null; }
        public void updateAad(byte[] p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.system.keystore2.IKeystoreOperation {
        static final int TRANSACTION_abort = 4;
        static final int TRANSACTION_finish = 3;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_update = 2;
        static final int TRANSACTION_updateAad = 1;
        public Stub() { super(); }
        public static android.system.keystore2.IKeystoreOperation asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.system.keystore2.IKeystoreOperation {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void abort() throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public byte[] finish(byte[] p0, byte[] p1) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public byte[] update(byte[] p0) throws android.os.RemoteException { return null; }
            public void updateAad(byte[] p0) throws android.os.RemoteException {}
        }
    }
}
