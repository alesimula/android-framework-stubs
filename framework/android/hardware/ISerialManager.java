package android.hardware;

public interface ISerialManager extends android.os.IInterface {
    public java.lang.String[] getSerialPorts() throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openSerialPort(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.ISerialManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String[] getSerialPorts() throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openSerialPort(java.lang.String p0) throws android.os.RemoteException { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.ISerialManager {
        public static final java.lang.String DESCRIPTOR = "android.hardware.ISerialManager";
        static final int TRANSACTION_getSerialPorts = 1;
        static final int TRANSACTION_openSerialPort = 2;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.hardware.ISerialManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void getSerialPorts_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void openSerialPort_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.hardware.ISerialManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String[] getSerialPorts() throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openSerialPort(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }
}
