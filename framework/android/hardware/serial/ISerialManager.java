package android.hardware.serial;

public interface ISerialManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.serial.ISerialManager";
    public java.util.List<android.hardware.serial.SerialPortInfo> getSerialPorts() throws android.os.RemoteException;
    public java.lang.String[] getSerialPortsInConfig() throws android.os.RemoteException;
    public void grantSerialPortAccess(java.lang.String p0, int p1, boolean p2, android.os.IBinder p3) throws android.os.RemoteException;
    public void registerSerialPortListener(android.hardware.serial.ISerialPortListener p0) throws android.os.RemoteException;
    public void requestOpen(java.lang.String p0, int p1, boolean p2, java.lang.String p3, android.hardware.serial.ISerialPortResponseCallback p4) throws android.os.RemoteException;
    public void revokeSerialPortAccess(java.lang.String p0, int p1, boolean p2, android.os.IBinder p3) throws android.os.RemoteException;
    public void unregisterSerialPortListener(android.hardware.serial.ISerialPortListener p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.serial.ISerialManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public java.util.List<android.hardware.serial.SerialPortInfo> getSerialPorts() throws android.os.RemoteException { return null; }
        public java.lang.String[] getSerialPortsInConfig() throws android.os.RemoteException { return null; }
        public void grantSerialPortAccess(java.lang.String p0, int p1, boolean p2, android.os.IBinder p3) throws android.os.RemoteException {}
        public void registerSerialPortListener(android.hardware.serial.ISerialPortListener p0) throws android.os.RemoteException {}
        public void requestOpen(java.lang.String p0, int p1, boolean p2, java.lang.String p3, android.hardware.serial.ISerialPortResponseCallback p4) throws android.os.RemoteException {}
        public void revokeSerialPortAccess(java.lang.String p0, int p1, boolean p2, android.os.IBinder p3) throws android.os.RemoteException {}
        public void unregisterSerialPortListener(android.hardware.serial.ISerialPortListener p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.serial.ISerialManager {
        static final int TRANSACTION_getSerialPorts = 1;
        static final int TRANSACTION_getSerialPortsInConfig = 2;
        static final int TRANSACTION_grantSerialPortAccess = 5;
        static final int TRANSACTION_registerSerialPortListener = 3;
        static final int TRANSACTION_requestOpen = 7;
        static final int TRANSACTION_revokeSerialPortAccess = 6;
        static final int TRANSACTION_unregisterSerialPortListener = 4;
        public Stub() { super(); }
        public static android.hardware.serial.ISerialManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.serial.ISerialManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.hardware.serial.SerialPortInfo> getSerialPorts() throws android.os.RemoteException { return null; }
            public java.lang.String[] getSerialPortsInConfig() throws android.os.RemoteException { return null; }
            public void grantSerialPortAccess(java.lang.String p0, int p1, boolean p2, android.os.IBinder p3) throws android.os.RemoteException {}
            public void registerSerialPortListener(android.hardware.serial.ISerialPortListener p0) throws android.os.RemoteException {}
            public void requestOpen(java.lang.String p0, int p1, boolean p2, java.lang.String p3, android.hardware.serial.ISerialPortResponseCallback p4) throws android.os.RemoteException {}
            public void revokeSerialPortAccess(java.lang.String p0, int p1, boolean p2, android.os.IBinder p3) throws android.os.RemoteException {}
            public void unregisterSerialPortListener(android.hardware.serial.ISerialPortListener p0) throws android.os.RemoteException {}
        }
    }
}
