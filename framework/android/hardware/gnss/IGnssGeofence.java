package android.hardware.gnss;

public interface IGnssGeofence extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final int VERSION = 2;
    public void addGeofence(int p0, double p1, double p2, double p3, int p4, int p5, int p6, int p7) throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public void pauseGeofence(int p0) throws android.os.RemoteException;
    public void removeGeofence(int p0) throws android.os.RemoteException;
    public void resumeGeofence(int p0, int p1) throws android.os.RemoteException;
    public void setCallback(android.hardware.gnss.IGnssGeofenceCallback p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.gnss.IGnssGeofence {
        public Default() {}
        public void addGeofence(int p0, double p1, double p2, double p3, int p4, int p5, int p6, int p7) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public void pauseGeofence(int p0) throws android.os.RemoteException {}
        public void removeGeofence(int p0) throws android.os.RemoteException {}
        public void resumeGeofence(int p0, int p1) throws android.os.RemoteException {}
        public void setCallback(android.hardware.gnss.IGnssGeofenceCallback p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssGeofence {
        static final int TRANSACTION_addGeofence = 2;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_pauseGeofence = 3;
        static final int TRANSACTION_removeGeofence = 5;
        static final int TRANSACTION_resumeGeofence = 4;
        static final int TRANSACTION_setCallback = 1;
        public Stub() { super(); }
        public static android.hardware.gnss.IGnssGeofence asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.gnss.IGnssGeofence {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addGeofence(int p0, double p1, double p2, double p3, int p4, int p5, int p6, int p7) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public void pauseGeofence(int p0) throws android.os.RemoteException {}
            public void removeGeofence(int p0) throws android.os.RemoteException {}
            public void resumeGeofence(int p0, int p1) throws android.os.RemoteException {}
            public void setCallback(android.hardware.gnss.IGnssGeofenceCallback p0) throws android.os.RemoteException {}
        }
    }
}
