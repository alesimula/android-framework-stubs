package android.hardware.serial;

public interface ISerialPortListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.serial.ISerialPortListener";
    public void onSerialPortConnected(android.hardware.serial.SerialPortInfo p0) throws android.os.RemoteException;
    public void onSerialPortDisconnected(android.hardware.serial.SerialPortInfo p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.serial.ISerialPortListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onSerialPortConnected(android.hardware.serial.SerialPortInfo p0) throws android.os.RemoteException {}
        public void onSerialPortDisconnected(android.hardware.serial.SerialPortInfo p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.serial.ISerialPortListener {
        static final int TRANSACTION_onSerialPortConnected = 1;
        static final int TRANSACTION_onSerialPortDisconnected = 2;
        public Stub() { super(); }
        public static android.hardware.serial.ISerialPortListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.serial.ISerialPortListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onSerialPortConnected(android.hardware.serial.SerialPortInfo p0) throws android.os.RemoteException {}
            public void onSerialPortDisconnected(android.hardware.serial.SerialPortInfo p0) throws android.os.RemoteException {}
        }
    }
}
