package android.frameworks.location.altitude;

public interface IAltitudeService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "e47d23f579ff7a897fb03e7e7f1c3006cfc6036b";
    public static final int VERSION = 2;
    public android.frameworks.location.altitude.AddMslAltitudeToLocationResponse addMslAltitudeToLocation(android.frameworks.location.altitude.AddMslAltitudeToLocationRequest p0) throws android.os.RemoteException;
    public android.frameworks.location.altitude.GetGeoidHeightResponse getGeoidHeight(android.frameworks.location.altitude.GetGeoidHeightRequest p0) throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;

    public static class Default implements android.frameworks.location.altitude.IAltitudeService {
        public Default() {}
        public android.frameworks.location.altitude.AddMslAltitudeToLocationResponse addMslAltitudeToLocation(android.frameworks.location.altitude.AddMslAltitudeToLocationRequest p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
        public android.frameworks.location.altitude.GetGeoidHeightResponse getGeoidHeight(android.frameworks.location.altitude.GetGeoidHeightRequest p0) throws android.os.RemoteException { return null; }
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.frameworks.location.altitude.IAltitudeService {
        static final int TRANSACTION_addMslAltitudeToLocation = 1;
        static final int TRANSACTION_getGeoidHeight = 2;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        public Stub() { super(); }
        public static android.frameworks.location.altitude.IAltitudeService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.frameworks.location.altitude.IAltitudeService {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.frameworks.location.altitude.AddMslAltitudeToLocationResponse addMslAltitudeToLocation(android.frameworks.location.altitude.AddMslAltitudeToLocationRequest p0) throws android.os.RemoteException { return null; }
            public android.os.IBinder asBinder() { return null; }
            public android.frameworks.location.altitude.GetGeoidHeightResponse getGeoidHeight(android.frameworks.location.altitude.GetGeoidHeightRequest p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
        }
    }
}
