package android.hardware.gnss;

public interface IGnssMeasurementInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final int VERSION = 2;
    public void close() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public void setCallback(android.hardware.gnss.IGnssMeasurementCallback p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public void setCallbackWithOptions(android.hardware.gnss.IGnssMeasurementCallback p0, android.hardware.gnss.IGnssMeasurementInterface.Options p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.gnss.IGnssMeasurementInterface {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void close() throws android.os.RemoteException {}
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public void setCallback(android.hardware.gnss.IGnssMeasurementCallback p0, boolean p1, boolean p2) throws android.os.RemoteException {}
        public void setCallbackWithOptions(android.hardware.gnss.IGnssMeasurementCallback p0, android.hardware.gnss.IGnssMeasurementInterface.Options p1) throws android.os.RemoteException {}
    }

    public static class Options implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IGnssMeasurementInterface.Options> CREATOR = null;
        public boolean enableCorrVecOutputs;
        public boolean enableFullTracking;
        public int intervalMs;
        public Options() {}
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssMeasurementInterface {
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_setCallback = 1;
        static final int TRANSACTION_setCallbackWithOptions = 3;
        public Stub() { super(); }
        public static android.hardware.gnss.IGnssMeasurementInterface asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.gnss.IGnssMeasurementInterface {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void close() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public void setCallback(android.hardware.gnss.IGnssMeasurementCallback p0, boolean p1, boolean p2) throws android.os.RemoteException {}
            public void setCallbackWithOptions(android.hardware.gnss.IGnssMeasurementCallback p0, android.hardware.gnss.IGnssMeasurementInterface.Options p1) throws android.os.RemoteException {}
        }
    }
}
