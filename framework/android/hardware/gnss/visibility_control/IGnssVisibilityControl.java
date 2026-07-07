package android.hardware.gnss.visibility_control;

public interface IGnssVisibilityControl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final int VERSION = 2;
    public void enableNfwLocationAccess(java.lang.String[] p0) throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public void setCallback(android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.gnss.visibility_control.IGnssVisibilityControl {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void enableNfwLocationAccess(java.lang.String[] p0) throws android.os.RemoteException {}
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public void setCallback(android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.visibility_control.IGnssVisibilityControl {
        static final int TRANSACTION_enableNfwLocationAccess = 1;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_setCallback = 2;
        public Stub() { super(); }
        public static android.hardware.gnss.visibility_control.IGnssVisibilityControl asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.gnss.visibility_control.IGnssVisibilityControl {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void enableNfwLocationAccess(java.lang.String[] p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public void setCallback(android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback p0) throws android.os.RemoteException {}
        }
    }
}
