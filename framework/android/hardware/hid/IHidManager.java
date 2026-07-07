package android.hardware.hid;

public interface IHidManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.hid.IHidManager";
    public static final int ERROR_DEVICE_MISMATCH = 2;
    public static final int ERROR_DEVICE_NOT_FOUND = 1;
    public static final int ERROR_INTERNAL_ERROR = 6;
    public static final int ERROR_INVALID_ARGUMENT = 3;
    public static final int ERROR_INVALID_STATE = 4;
    public static final int ERROR_IO_ERROR = 5;
    public void close(android.hardware.hid.HidDeviceInfo p0) throws android.os.RemoteException;
    public java.util.List<android.hardware.hid.HidDeviceInfo> getDevices() throws android.os.RemoteException;
    public android.hardware.hid.AidlReport getFeatureReport(android.hardware.hid.HidDeviceInfo p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.hardware.hid.HidDevicePermission> getGrantedPermissions(java.lang.String p0) throws android.os.RemoteException;
    public void open(android.hardware.hid.HidDeviceInfo p0, java.lang.String p1, android.os.IBinder p2) throws android.os.RemoteException;
    public java.util.List<android.hardware.hid.HidDeviceInfo> registerListener(android.hardware.hid.IHidDeviceListener p0) throws android.os.RemoteException;
    public void sendFeatureReport(android.hardware.hid.HidDeviceInfo p0, android.hardware.hid.AidlReport p1) throws android.os.RemoteException;
    public void sendOutputReport(android.hardware.hid.HidDeviceInfo p0, android.hardware.hid.AidlReport p1) throws android.os.RemoteException;
    public void unregisterListener(android.hardware.hid.IHidDeviceListener p0) throws android.os.RemoteException;
    public void updatePermission(android.hardware.hid.HidDevicePermission p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.hid.IHidManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void close(android.hardware.hid.HidDeviceInfo p0) throws android.os.RemoteException {}
        public java.util.List<android.hardware.hid.HidDeviceInfo> getDevices() throws android.os.RemoteException { return null; }
        public android.hardware.hid.AidlReport getFeatureReport(android.hardware.hid.HidDeviceInfo p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.hid.HidDevicePermission> getGrantedPermissions(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void open(android.hardware.hid.HidDeviceInfo p0, java.lang.String p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public java.util.List<android.hardware.hid.HidDeviceInfo> registerListener(android.hardware.hid.IHidDeviceListener p0) throws android.os.RemoteException { return null; }
        public void sendFeatureReport(android.hardware.hid.HidDeviceInfo p0, android.hardware.hid.AidlReport p1) throws android.os.RemoteException {}
        public void sendOutputReport(android.hardware.hid.HidDeviceInfo p0, android.hardware.hid.AidlReport p1) throws android.os.RemoteException {}
        public void unregisterListener(android.hardware.hid.IHidDeviceListener p0) throws android.os.RemoteException {}
        public void updatePermission(android.hardware.hid.HidDevicePermission p0, boolean p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.hid.IHidManager {
        static final int TRANSACTION_close = 5;
        static final int TRANSACTION_getDevices = 1;
        static final int TRANSACTION_getFeatureReport = 7;
        static final int TRANSACTION_getGrantedPermissions = 9;
        static final int TRANSACTION_open = 4;
        static final int TRANSACTION_registerListener = 2;
        static final int TRANSACTION_sendFeatureReport = 6;
        static final int TRANSACTION_sendOutputReport = 8;
        static final int TRANSACTION_unregisterListener = 3;
        static final int TRANSACTION_updatePermission = 10;
        public Stub() { super(); }
        public static android.hardware.hid.IHidManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.hid.IHidManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void close(android.hardware.hid.HidDeviceInfo p0) throws android.os.RemoteException {}
            public java.util.List<android.hardware.hid.HidDeviceInfo> getDevices() throws android.os.RemoteException { return null; }
            public android.hardware.hid.AidlReport getFeatureReport(android.hardware.hid.HidDeviceInfo p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.hid.HidDevicePermission> getGrantedPermissions(java.lang.String p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void open(android.hardware.hid.HidDeviceInfo p0, java.lang.String p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public java.util.List<android.hardware.hid.HidDeviceInfo> registerListener(android.hardware.hid.IHidDeviceListener p0) throws android.os.RemoteException { return null; }
            public void sendFeatureReport(android.hardware.hid.HidDeviceInfo p0, android.hardware.hid.AidlReport p1) throws android.os.RemoteException {}
            public void sendOutputReport(android.hardware.hid.HidDeviceInfo p0, android.hardware.hid.AidlReport p1) throws android.os.RemoteException {}
            public void unregisterListener(android.hardware.hid.IHidDeviceListener p0) throws android.os.RemoteException {}
            public void updatePermission(android.hardware.hid.HidDevicePermission p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
