package android.hardware.radio.ims;

public interface IRadioImsResponse extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "2f451a440a404c0eda2001bd542876005bd3a5ac";
    public static final int VERSION = 4;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public void sendAnbrQueryResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setSrvccCallInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void startImsTrafficResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.ims.ConnectionFailureInfo p1) throws android.os.RemoteException;
    public void stopImsTrafficResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void triggerEpsFallbackResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void updateAllowedServicesResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void updateImsCallStatusResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void updateImsRegistrationInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.ims.IRadioImsResponse {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public void sendAnbrQueryResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setSrvccCallInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void startImsTrafficResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.ims.ConnectionFailureInfo p1) throws android.os.RemoteException {}
        public void stopImsTrafficResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void triggerEpsFallbackResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void updateAllowedServicesResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void updateImsCallStatusResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void updateImsRegistrationInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.ims.IRadioImsResponse {
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_sendAnbrQueryResponse = 6;
        static final int TRANSACTION_setSrvccCallInfoResponse = 1;
        static final int TRANSACTION_startImsTrafficResponse = 3;
        static final int TRANSACTION_stopImsTrafficResponse = 4;
        static final int TRANSACTION_triggerEpsFallbackResponse = 5;
        static final int TRANSACTION_updateAllowedServicesResponse = 8;
        static final int TRANSACTION_updateImsCallStatusResponse = 7;
        static final int TRANSACTION_updateImsRegistrationInfoResponse = 2;
        public Stub() { super(); }
        public static android.hardware.radio.ims.IRadioImsResponse asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.radio.ims.IRadioImsResponse {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public void sendAnbrQueryResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setSrvccCallInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void startImsTrafficResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.ims.ConnectionFailureInfo p1) throws android.os.RemoteException {}
            public void stopImsTrafficResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void triggerEpsFallbackResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void updateAllowedServicesResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void updateImsCallStatusResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void updateImsRegistrationInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        }
    }
}
