package android.hardware.radio.config;

public interface IRadioConfig extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "b9f08521b4288bc71112cdeb47220af1ff758383";
    public static final int VERSION = 5;
    public void getHalDeviceCapabilities(int p0) throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public void getNumOfLiveModems(int p0) throws android.os.RemoteException;
    public void getPhoneCapability(int p0) throws android.os.RemoteException;
    public void getSimSlotsStatus(int p0) throws android.os.RemoteException;
    public void getSimTypeInfo(int p0) throws android.os.RemoteException;
    public void getSimultaneousCallingSupport(int p0) throws android.os.RemoteException;
    public void rebootModem(int p0) throws android.os.RemoteException;
    public void setNumOfLiveModems(int p0, byte p1) throws android.os.RemoteException;
    public void setPreferredDataModem(int p0, byte p1) throws android.os.RemoteException;
    public void setResponseFunctions(android.hardware.radio.config.IRadioConfigResponse p0, android.hardware.radio.config.IRadioConfigIndication p1) throws android.os.RemoteException;
    public void setSimSlotsMapping(int p0, android.hardware.radio.config.SlotPortMapping[] p1) throws android.os.RemoteException;
    public void setSimType(int p0, int[] p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.config.IRadioConfig {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void getHalDeviceCapabilities(int p0) throws android.os.RemoteException {}
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public void getNumOfLiveModems(int p0) throws android.os.RemoteException {}
        public void getPhoneCapability(int p0) throws android.os.RemoteException {}
        public void getSimSlotsStatus(int p0) throws android.os.RemoteException {}
        public void getSimTypeInfo(int p0) throws android.os.RemoteException {}
        public void getSimultaneousCallingSupport(int p0) throws android.os.RemoteException {}
        public void rebootModem(int p0) throws android.os.RemoteException {}
        public void setNumOfLiveModems(int p0, byte p1) throws android.os.RemoteException {}
        public void setPreferredDataModem(int p0, byte p1) throws android.os.RemoteException {}
        public void setResponseFunctions(android.hardware.radio.config.IRadioConfigResponse p0, android.hardware.radio.config.IRadioConfigIndication p1) throws android.os.RemoteException {}
        public void setSimSlotsMapping(int p0, android.hardware.radio.config.SlotPortMapping[] p1) throws android.os.RemoteException {}
        public void setSimType(int p0, int[] p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.config.IRadioConfig {
        static final int TRANSACTION_getHalDeviceCapabilities = 1;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getNumOfLiveModems = 2;
        static final int TRANSACTION_getPhoneCapability = 3;
        static final int TRANSACTION_getSimSlotsStatus = 4;
        static final int TRANSACTION_getSimTypeInfo = 10;
        static final int TRANSACTION_getSimultaneousCallingSupport = 9;
        static final int TRANSACTION_rebootModem = 12;
        static final int TRANSACTION_setNumOfLiveModems = 5;
        static final int TRANSACTION_setPreferredDataModem = 6;
        static final int TRANSACTION_setResponseFunctions = 7;
        static final int TRANSACTION_setSimSlotsMapping = 8;
        static final int TRANSACTION_setSimType = 11;
        public Stub() { super(); }
        public static android.hardware.radio.config.IRadioConfig asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.radio.config.IRadioConfig {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void getHalDeviceCapabilities(int p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public void getNumOfLiveModems(int p0) throws android.os.RemoteException {}
            public void getPhoneCapability(int p0) throws android.os.RemoteException {}
            public void getSimSlotsStatus(int p0) throws android.os.RemoteException {}
            public void getSimTypeInfo(int p0) throws android.os.RemoteException {}
            public void getSimultaneousCallingSupport(int p0) throws android.os.RemoteException {}
            public void rebootModem(int p0) throws android.os.RemoteException {}
            public void setNumOfLiveModems(int p0, byte p1) throws android.os.RemoteException {}
            public void setPreferredDataModem(int p0, byte p1) throws android.os.RemoteException {}
            public void setResponseFunctions(android.hardware.radio.config.IRadioConfigResponse p0, android.hardware.radio.config.IRadioConfigIndication p1) throws android.os.RemoteException {}
            public void setSimSlotsMapping(int p0, android.hardware.radio.config.SlotPortMapping[] p1) throws android.os.RemoteException {}
            public void setSimType(int p0, int[] p1) throws android.os.RemoteException {}
        }
    }
}
