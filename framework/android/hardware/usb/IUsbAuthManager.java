package android.hardware.usb;

public interface IUsbAuthManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.usb.IUsbAuthManager";
    public int getAuthorizationStatus(android.hardware.usb.UsbAuthDeviceInfo p0) throws android.os.RemoteException;
    public java.util.List<android.hardware.usb.UsbAuthDeviceInfo> getAuthorizedUsbDevices() throws android.os.RemoteException;
    public java.util.List<android.hardware.usb.UsbAuthDeviceInfo> getDeferredUsbDevices() throws android.os.RemoteException;
    public java.util.List<android.hardware.usb.UsbAuthDeviceInfo> getDevicesAwaitingAuthorization() throws android.os.RemoteException;
    public java.util.List<android.hardware.usb.UsbAuthDeviceInfo> getDevicesAwaitingPersistedAuthorization() throws android.os.RemoteException;
    public boolean registerForUsbAuthorizationEvents(android.hardware.usb.IUsbAuthEventsListener p0) throws android.os.RemoteException;
    public void setAuthorizationStatus(android.hardware.usb.UsbAuthDeviceInfo p0, int p1) throws android.os.RemoteException;
    public void setSystemState(int p0) throws android.os.RemoteException;
    public void unregisterForUsbAuthorizationEvents(android.hardware.usb.IUsbAuthEventsListener p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.usb.IUsbAuthManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public int getAuthorizationStatus(android.hardware.usb.UsbAuthDeviceInfo p0) throws android.os.RemoteException { return 0; }
        public java.util.List<android.hardware.usb.UsbAuthDeviceInfo> getAuthorizedUsbDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.usb.UsbAuthDeviceInfo> getDeferredUsbDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.usb.UsbAuthDeviceInfo> getDevicesAwaitingAuthorization() throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.usb.UsbAuthDeviceInfo> getDevicesAwaitingPersistedAuthorization() throws android.os.RemoteException { return null; }
        public boolean registerForUsbAuthorizationEvents(android.hardware.usb.IUsbAuthEventsListener p0) throws android.os.RemoteException { return false; }
        public void setAuthorizationStatus(android.hardware.usb.UsbAuthDeviceInfo p0, int p1) throws android.os.RemoteException {}
        public void setSystemState(int p0) throws android.os.RemoteException {}
        public void unregisterForUsbAuthorizationEvents(android.hardware.usb.IUsbAuthEventsListener p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.usb.IUsbAuthManager {
        static final int TRANSACTION_getAuthorizationStatus = 5;
        static final int TRANSACTION_getAuthorizedUsbDevices = 1;
        static final int TRANSACTION_getDeferredUsbDevices = 2;
        static final int TRANSACTION_getDevicesAwaitingAuthorization = 3;
        static final int TRANSACTION_getDevicesAwaitingPersistedAuthorization = 4;
        static final int TRANSACTION_registerForUsbAuthorizationEvents = 8;
        static final int TRANSACTION_setAuthorizationStatus = 6;
        static final int TRANSACTION_setSystemState = 7;
        static final int TRANSACTION_unregisterForUsbAuthorizationEvents = 9;
        public Stub() { super(); }
        public static android.hardware.usb.IUsbAuthManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.usb.IUsbAuthManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public int getAuthorizationStatus(android.hardware.usb.UsbAuthDeviceInfo p0) throws android.os.RemoteException { return 0; }
            public java.util.List<android.hardware.usb.UsbAuthDeviceInfo> getAuthorizedUsbDevices() throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.usb.UsbAuthDeviceInfo> getDeferredUsbDevices() throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.usb.UsbAuthDeviceInfo> getDevicesAwaitingAuthorization() throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.usb.UsbAuthDeviceInfo> getDevicesAwaitingPersistedAuthorization() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean registerForUsbAuthorizationEvents(android.hardware.usb.IUsbAuthEventsListener p0) throws android.os.RemoteException { return false; }
            public void setAuthorizationStatus(android.hardware.usb.UsbAuthDeviceInfo p0, int p1) throws android.os.RemoteException {}
            public void setSystemState(int p0) throws android.os.RemoteException {}
            public void unregisterForUsbAuthorizationEvents(android.hardware.usb.IUsbAuthEventsListener p0) throws android.os.RemoteException {}
        }
    }
}
