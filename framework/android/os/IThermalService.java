package android.os;

public interface IThermalService extends android.os.IInterface {
    public android.os.CoolingDevice[] getCurrentCoolingDevices() throws android.os.RemoteException;
    public android.os.CoolingDevice[] getCurrentCoolingDevicesWithType(int p0) throws android.os.RemoteException;
    public android.os.Temperature[] getCurrentTemperatures() throws android.os.RemoteException;
    public android.os.Temperature[] getCurrentTemperaturesWithType(int p0) throws android.os.RemoteException;
    public int getCurrentThermalStatus() throws android.os.RemoteException;
    public int getCurrentThermalStatusForDevice(int p0) throws android.os.RemoteException;
    public float getThermalHeadroom(int p0) throws android.os.RemoteException;
    public float[] getThermalHeadroomThresholds() throws android.os.RemoteException;
    public boolean registerThermalEventListener(android.os.IThermalEventListener p0) throws android.os.RemoteException;
    public boolean registerThermalEventListenerWithType(android.os.IThermalEventListener p0, int p1) throws android.os.RemoteException;
    public boolean registerThermalHeadroomListener(android.os.IThermalHeadroomListener p0) throws android.os.RemoteException;
    public boolean registerThermalStatusListener(android.os.IThermalStatusListener p0) throws android.os.RemoteException;
    public boolean registerThermalStatusListenerForDevice(int p0, android.os.IThermalStatusListener p1) throws android.os.RemoteException;
    public boolean unregisterThermalEventListener(android.os.IThermalEventListener p0) throws android.os.RemoteException;
    public boolean unregisterThermalHeadroomListener(android.os.IThermalHeadroomListener p0) throws android.os.RemoteException;
    public boolean unregisterThermalStatusListener(android.os.IThermalStatusListener p0) throws android.os.RemoteException;

    public static class Default implements android.os.IThermalService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.os.CoolingDevice[] getCurrentCoolingDevices() throws android.os.RemoteException { return null; }
        public android.os.CoolingDevice[] getCurrentCoolingDevicesWithType(int p0) throws android.os.RemoteException { return null; }
        public android.os.Temperature[] getCurrentTemperatures() throws android.os.RemoteException { return null; }
        public android.os.Temperature[] getCurrentTemperaturesWithType(int p0) throws android.os.RemoteException { return null; }
        public int getCurrentThermalStatus() throws android.os.RemoteException { return 0; }
        public int getCurrentThermalStatusForDevice(int p0) throws android.os.RemoteException { return 0; }
        public float getThermalHeadroom(int p0) throws android.os.RemoteException { return 0.0f; }
        public float[] getThermalHeadroomThresholds() throws android.os.RemoteException { return null; }
        public boolean registerThermalEventListener(android.os.IThermalEventListener p0) throws android.os.RemoteException { return false; }
        public boolean registerThermalEventListenerWithType(android.os.IThermalEventListener p0, int p1) throws android.os.RemoteException { return false; }
        public boolean registerThermalHeadroomListener(android.os.IThermalHeadroomListener p0) throws android.os.RemoteException { return false; }
        public boolean registerThermalStatusListener(android.os.IThermalStatusListener p0) throws android.os.RemoteException { return false; }
        public boolean registerThermalStatusListenerForDevice(int p0, android.os.IThermalStatusListener p1) throws android.os.RemoteException { return false; }
        public boolean unregisterThermalEventListener(android.os.IThermalEventListener p0) throws android.os.RemoteException { return false; }
        public boolean unregisterThermalHeadroomListener(android.os.IThermalHeadroomListener p0) throws android.os.RemoteException { return false; }
        public boolean unregisterThermalStatusListener(android.os.IThermalStatusListener p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IThermalService {
        public static final java.lang.String DESCRIPTOR = "android.os.IThermalService";
        static final int TRANSACTION_getCurrentCoolingDevices = 11;
        static final int TRANSACTION_getCurrentCoolingDevicesWithType = 12;
        static final int TRANSACTION_getCurrentTemperatures = 4;
        static final int TRANSACTION_getCurrentTemperaturesWithType = 5;
        static final int TRANSACTION_getCurrentThermalStatus = 9;
        static final int TRANSACTION_getCurrentThermalStatusForDevice = 10;
        static final int TRANSACTION_getThermalHeadroom = 13;
        static final int TRANSACTION_getThermalHeadroomThresholds = 14;
        static final int TRANSACTION_registerThermalEventListener = 1;
        static final int TRANSACTION_registerThermalEventListenerWithType = 2;
        static final int TRANSACTION_registerThermalHeadroomListener = 15;
        static final int TRANSACTION_registerThermalStatusListener = 6;
        static final int TRANSACTION_registerThermalStatusListenerForDevice = 7;
        static final int TRANSACTION_unregisterThermalEventListener = 3;
        static final int TRANSACTION_unregisterThermalHeadroomListener = 16;
        static final int TRANSACTION_unregisterThermalStatusListener = 8;
        public Stub() { super(); }
        public static android.os.IThermalService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.IThermalService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public android.os.CoolingDevice[] getCurrentCoolingDevices() throws android.os.RemoteException { return null; }
            public android.os.CoolingDevice[] getCurrentCoolingDevicesWithType(int p0) throws android.os.RemoteException { return null; }
            public android.os.Temperature[] getCurrentTemperatures() throws android.os.RemoteException { return null; }
            public android.os.Temperature[] getCurrentTemperaturesWithType(int p0) throws android.os.RemoteException { return null; }
            public int getCurrentThermalStatus() throws android.os.RemoteException { return 0; }
            public int getCurrentThermalStatusForDevice(int p0) throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public float getThermalHeadroom(int p0) throws android.os.RemoteException { return 0.0f; }
            public float[] getThermalHeadroomThresholds() throws android.os.RemoteException { return null; }
            public boolean registerThermalEventListener(android.os.IThermalEventListener p0) throws android.os.RemoteException { return false; }
            public boolean registerThermalEventListenerWithType(android.os.IThermalEventListener p0, int p1) throws android.os.RemoteException { return false; }
            public boolean registerThermalHeadroomListener(android.os.IThermalHeadroomListener p0) throws android.os.RemoteException { return false; }
            public boolean registerThermalStatusListener(android.os.IThermalStatusListener p0) throws android.os.RemoteException { return false; }
            public boolean registerThermalStatusListenerForDevice(int p0, android.os.IThermalStatusListener p1) throws android.os.RemoteException { return false; }
            public boolean unregisterThermalEventListener(android.os.IThermalEventListener p0) throws android.os.RemoteException { return false; }
            public boolean unregisterThermalHeadroomListener(android.os.IThermalHeadroomListener p0) throws android.os.RemoteException { return false; }
            public boolean unregisterThermalStatusListener(android.os.IThermalStatusListener p0) throws android.os.RemoteException { return false; }
        }
    }
}
