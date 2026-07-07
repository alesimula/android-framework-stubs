package android.hardware.gnss.visibility_control;

public interface IGnssVisibilityControlCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final int VERSION = 2;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public boolean isInEmergencySession() throws android.os.RemoteException;
    public void nfwNotifyCb(android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback.NfwNotification p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public boolean isInEmergencySession() throws android.os.RemoteException { return false; }
        public void nfwNotifyCb(android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback.NfwNotification p0) throws android.os.RemoteException {}
    }

    public static class NfwNotification implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback.NfwNotification> CREATOR = null;
        public boolean inEmergencyMode;
        public boolean isCachedLocation;
        public java.lang.String otherProtocolStackName;
        public int protocolStack;
        public java.lang.String proxyAppPackageName;
        public int requestor;
        public java.lang.String requestorId;
        public int responseType;
        public NfwNotification() {}
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static @interface NfwProtocolStack {
        public static final int CTRL_PLANE = 0;
        public static final int IMS = 10;
        public static final int OTHER_PROTOCOL_STACK = 100;
        public static final int SIM = 11;
        public static final int SUPL = 1;
    }

    public static @interface NfwRequestor {
        public static final int AUTOMOBILE_CLIENT = 20;
        public static final int CARRIER = 0;
        public static final int GNSS_CHIPSET_VENDOR = 12;
        public static final int MODEM_CHIPSET_VENDOR = 11;
        public static final int OEM = 10;
        public static final int OTHER_CHIPSET_VENDOR = 13;
        public static final int OTHER_REQUESTOR = 100;
    }

    public static @interface NfwResponseType {
        public static final int ACCEPTED_LOCATION_PROVIDED = 2;
        public static final int ACCEPTED_NO_LOCATION_PROVIDED = 1;
        public static final int REJECTED = 0;
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback {
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_isInEmergencySession = 2;
        static final int TRANSACTION_nfwNotifyCb = 1;
        public Stub() { super(); }
        public static android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public boolean isInEmergencySession() throws android.os.RemoteException { return false; }
            public void nfwNotifyCb(android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback.NfwNotification p0) throws android.os.RemoteException {}
        }
    }
}
