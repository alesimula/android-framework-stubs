package android.hardware.tv.tuner;

public interface IDescrambler extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "b0d0067a930514438d7772c2e02069c7370f3620";
    public static final int VERSION = 3;
    public void addPid(android.hardware.tv.tuner.DemuxPid p0, android.hardware.tv.tuner.IFilter p1) throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public void removePid(android.hardware.tv.tuner.DemuxPid p0, android.hardware.tv.tuner.IFilter p1) throws android.os.RemoteException;
    public void setDemuxSource(int p0) throws android.os.RemoteException;
    public void setKeyToken(byte[] p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.tv.tuner.IDescrambler {
        public Default() {}
        public void addPid(android.hardware.tv.tuner.DemuxPid p0, android.hardware.tv.tuner.IFilter p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void close() throws android.os.RemoteException {}
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public void removePid(android.hardware.tv.tuner.DemuxPid p0, android.hardware.tv.tuner.IFilter p1) throws android.os.RemoteException {}
        public void setDemuxSource(int p0) throws android.os.RemoteException {}
        public void setKeyToken(byte[] p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.tv.tuner.IDescrambler {
        static final int TRANSACTION_addPid = 3;
        static final int TRANSACTION_close = 5;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_removePid = 4;
        static final int TRANSACTION_setDemuxSource = 1;
        static final int TRANSACTION_setKeyToken = 2;
        public Stub() { super(); }
        public static android.hardware.tv.tuner.IDescrambler asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.tv.tuner.IDescrambler {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addPid(android.hardware.tv.tuner.DemuxPid p0, android.hardware.tv.tuner.IFilter p1) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void close() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public void removePid(android.hardware.tv.tuner.DemuxPid p0, android.hardware.tv.tuner.IFilter p1) throws android.os.RemoteException {}
            public void setDemuxSource(int p0) throws android.os.RemoteException {}
            public void setKeyToken(byte[] p0) throws android.os.RemoteException {}
        }
    }
}
