package android.hardware.radio.config;

public interface IRadioConfigIndication extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "b9f08521b4288bc71112cdeb47220af1ff758383";
    public static final int VERSION = 5;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public void onSimultaneousCallingSupportChanged(int[] p0) throws android.os.RemoteException;
    public void simSlotsStatusChanged(int p0, android.hardware.radio.config.SimSlotStatus[] p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.config.IRadioConfigIndication {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public void onSimultaneousCallingSupportChanged(int[] p0) throws android.os.RemoteException {}
        public void simSlotsStatusChanged(int p0, android.hardware.radio.config.SimSlotStatus[] p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.config.IRadioConfigIndication {
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_onSimultaneousCallingSupportChanged = 2;
        static final int TRANSACTION_simSlotsStatusChanged = 1;
        public Stub() { super(); }
        public static android.hardware.radio.config.IRadioConfigIndication asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.radio.config.IRadioConfigIndication {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public void onSimultaneousCallingSupportChanged(int[] p0) throws android.os.RemoteException {}
            public void simSlotsStatusChanged(int p0, android.hardware.radio.config.SimSlotStatus[] p1) throws android.os.RemoteException {}
        }
    }
}
