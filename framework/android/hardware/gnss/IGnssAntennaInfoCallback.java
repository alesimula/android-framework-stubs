package android.hardware.gnss;

public interface IGnssAntennaInfoCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final int VERSION = 2;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public void gnssAntennaInfoCb(android.hardware.gnss.IGnssAntennaInfoCallback.GnssAntennaInfo[] p0) throws android.os.RemoteException;

    public static class Coord implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IGnssAntennaInfoCallback.Coord> CREATOR = null;
        public double x;
        public double xUncertainty;
        public double y;
        public double yUncertainty;
        public double z;
        public double zUncertainty;
        public Coord() {}
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class Default implements android.hardware.gnss.IGnssAntennaInfoCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public void gnssAntennaInfoCb(android.hardware.gnss.IGnssAntennaInfoCallback.GnssAntennaInfo[] p0) throws android.os.RemoteException {}
    }

    public static class GnssAntennaInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IGnssAntennaInfoCallback.GnssAntennaInfo> CREATOR = null;
        public long carrierFrequencyHz;
        public android.hardware.gnss.IGnssAntennaInfoCallback.Coord phaseCenterOffsetCoordinateMillimeters;
        public android.hardware.gnss.IGnssAntennaInfoCallback.Row[] phaseCenterVariationCorrectionMillimeters;
        public android.hardware.gnss.IGnssAntennaInfoCallback.Row[] phaseCenterVariationCorrectionUncertaintyMillimeters;
        public android.hardware.gnss.IGnssAntennaInfoCallback.Row[] signalGainCorrectionDbi;
        public android.hardware.gnss.IGnssAntennaInfoCallback.Row[] signalGainCorrectionUncertaintyDbi;
        public GnssAntennaInfo() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class Row implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IGnssAntennaInfoCallback.Row> CREATOR = null;
        public double[] row;
        public Row() {}
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssAntennaInfoCallback {
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_gnssAntennaInfoCb = 1;
        public Stub() { super(); }
        public static android.hardware.gnss.IGnssAntennaInfoCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.gnss.IGnssAntennaInfoCallback {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public void gnssAntennaInfoCb(android.hardware.gnss.IGnssAntennaInfoCallback.GnssAntennaInfo[] p0) throws android.os.RemoteException {}
        }
    }
}
