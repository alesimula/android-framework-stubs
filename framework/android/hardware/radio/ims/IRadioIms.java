package android.hardware.radio.ims;

public interface IRadioIms extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "2f451a440a404c0eda2001bd542876005bd3a5ac";
    public static final int VERSION = 4;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public void sendAnbrQuery(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void setResponseFunctions(android.hardware.radio.ims.IRadioImsResponse p0, android.hardware.radio.ims.IRadioImsIndication p1) throws android.os.RemoteException;
    public void setSrvccCallInfo(int p0, android.hardware.radio.ims.SrvccCall[] p1) throws android.os.RemoteException;
    public void startImsTraffic(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void stopImsTraffic(int p0, int p1) throws android.os.RemoteException;
    public void triggerEpsFallback(int p0, int p1) throws android.os.RemoteException;
    public void updateAllowedServices(int p0, android.hardware.radio.ims.ImsService[] p1) throws android.os.RemoteException;
    public void updateImsCallStatus(int p0, android.hardware.radio.ims.ImsCall[] p1) throws android.os.RemoteException;
    public void updateImsRegistrationInfo(int p0, android.hardware.radio.ims.ImsRegistration p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.ims.IRadioIms {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public void sendAnbrQuery(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void setResponseFunctions(android.hardware.radio.ims.IRadioImsResponse p0, android.hardware.radio.ims.IRadioImsIndication p1) throws android.os.RemoteException {}
        public void setSrvccCallInfo(int p0, android.hardware.radio.ims.SrvccCall[] p1) throws android.os.RemoteException {}
        public void startImsTraffic(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void stopImsTraffic(int p0, int p1) throws android.os.RemoteException {}
        public void triggerEpsFallback(int p0, int p1) throws android.os.RemoteException {}
        public void updateAllowedServices(int p0, android.hardware.radio.ims.ImsService[] p1) throws android.os.RemoteException {}
        public void updateImsCallStatus(int p0, android.hardware.radio.ims.ImsCall[] p1) throws android.os.RemoteException {}
        public void updateImsRegistrationInfo(int p0, android.hardware.radio.ims.ImsRegistration p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.ims.IRadioIms {
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_sendAnbrQuery = 7;
        static final int TRANSACTION_setResponseFunctions = 6;
        static final int TRANSACTION_setSrvccCallInfo = 1;
        static final int TRANSACTION_startImsTraffic = 3;
        static final int TRANSACTION_stopImsTraffic = 4;
        static final int TRANSACTION_triggerEpsFallback = 5;
        static final int TRANSACTION_updateAllowedServices = 9;
        static final int TRANSACTION_updateImsCallStatus = 8;
        static final int TRANSACTION_updateImsRegistrationInfo = 2;
        public Stub() { super(); }
        public static android.hardware.radio.ims.IRadioIms asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.radio.ims.IRadioIms {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public void sendAnbrQuery(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void setResponseFunctions(android.hardware.radio.ims.IRadioImsResponse p0, android.hardware.radio.ims.IRadioImsIndication p1) throws android.os.RemoteException {}
            public void setSrvccCallInfo(int p0, android.hardware.radio.ims.SrvccCall[] p1) throws android.os.RemoteException {}
            public void startImsTraffic(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void stopImsTraffic(int p0, int p1) throws android.os.RemoteException {}
            public void triggerEpsFallback(int p0, int p1) throws android.os.RemoteException {}
            public void updateAllowedServices(int p0, android.hardware.radio.ims.ImsService[] p1) throws android.os.RemoteException {}
            public void updateImsCallStatus(int p0, android.hardware.radio.ims.ImsCall[] p1) throws android.os.RemoteException {}
            public void updateImsRegistrationInfo(int p0, android.hardware.radio.ims.ImsRegistration p1) throws android.os.RemoteException {}
        }
    }
}
