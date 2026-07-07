package android.hardware.radio.data;

public interface IRadioDataIndication extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "6acb69b7e1400ebd9d4e169667e93f778d3ec27c";
    public static final int VERSION = 5;
    @java.lang.Deprecated
    public void dataCallListChanged(int p0, android.hardware.radio.data.SetupDataCallResult[] p1) throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public void keepaliveStatus(int p0, android.hardware.radio.data.KeepaliveStatus p1) throws android.os.RemoteException;
    public void pcoData(int p0, android.hardware.radio.data.PcoDataInfo p1) throws android.os.RemoteException;
    public void slicingConfigChanged(int p0, android.hardware.radio.data.SlicingConfig p1) throws android.os.RemoteException;
    public void unthrottleApn(int p0, android.hardware.radio.data.DataProfileInfo p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.data.IRadioDataIndication {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        @java.lang.Deprecated
        public void dataCallListChanged(int p0, android.hardware.radio.data.SetupDataCallResult[] p1) throws android.os.RemoteException {}
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public void keepaliveStatus(int p0, android.hardware.radio.data.KeepaliveStatus p1) throws android.os.RemoteException {}
        public void pcoData(int p0, android.hardware.radio.data.PcoDataInfo p1) throws android.os.RemoteException {}
        public void slicingConfigChanged(int p0, android.hardware.radio.data.SlicingConfig p1) throws android.os.RemoteException {}
        public void unthrottleApn(int p0, android.hardware.radio.data.DataProfileInfo p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.data.IRadioDataIndication {
        static final int TRANSACTION_dataCallListChanged = 1;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_keepaliveStatus = 2;
        static final int TRANSACTION_pcoData = 3;
        static final int TRANSACTION_slicingConfigChanged = 5;
        static final int TRANSACTION_unthrottleApn = 4;
        public Stub() { super(); }
        public static android.hardware.radio.data.IRadioDataIndication asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.radio.data.IRadioDataIndication {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            @java.lang.Deprecated
            public void dataCallListChanged(int p0, android.hardware.radio.data.SetupDataCallResult[] p1) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public void keepaliveStatus(int p0, android.hardware.radio.data.KeepaliveStatus p1) throws android.os.RemoteException {}
            public void pcoData(int p0, android.hardware.radio.data.PcoDataInfo p1) throws android.os.RemoteException {}
            public void slicingConfigChanged(int p0, android.hardware.radio.data.SlicingConfig p1) throws android.os.RemoteException {}
            public void unthrottleApn(int p0, android.hardware.radio.data.DataProfileInfo p1) throws android.os.RemoteException {}
        }
    }
}
