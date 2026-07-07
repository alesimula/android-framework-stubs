package android.telephony.satellite;

public interface ISatelliteTransmissionUpdateCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.satellite.ISatelliteTransmissionUpdateCallback";
    public void onReceiveDatagramStateChanged(int p0, int p1, int p2) throws android.os.RemoteException;
    public void onSatellitePositionChanged(android.telephony.satellite.PointingInfo p0) throws android.os.RemoteException;
    public void onSendDatagramRequested(int p0) throws android.os.RemoteException;
    public void onSendDatagramStateChanged(int p0, int p1, int p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.telephony.satellite.ISatelliteTransmissionUpdateCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onReceiveDatagramStateChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onSatellitePositionChanged(android.telephony.satellite.PointingInfo p0) throws android.os.RemoteException {}
        public void onSendDatagramRequested(int p0) throws android.os.RemoteException {}
        public void onSendDatagramStateChanged(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.satellite.ISatelliteTransmissionUpdateCallback {
        static final int TRANSACTION_onReceiveDatagramStateChanged = 2;
        static final int TRANSACTION_onSatellitePositionChanged = 3;
        static final int TRANSACTION_onSendDatagramRequested = 4;
        static final int TRANSACTION_onSendDatagramStateChanged = 1;
        public Stub() { super(); }
        public static android.telephony.satellite.ISatelliteTransmissionUpdateCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.telephony.satellite.ISatelliteTransmissionUpdateCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onReceiveDatagramStateChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void onSatellitePositionChanged(android.telephony.satellite.PointingInfo p0) throws android.os.RemoteException {}
            public void onSendDatagramRequested(int p0) throws android.os.RemoteException {}
            public void onSendDatagramStateChanged(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        }
    }
}
