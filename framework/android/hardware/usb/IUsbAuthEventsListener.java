package android.hardware.usb;

public interface IUsbAuthEventsListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.usb.IUsbAuthEventsListener";
    public void onDeviceAskForAuthorization(android.hardware.usb.UsbAuthDeviceInfo p0) throws android.os.RemoteException;
    public void onDeviceAuthorizationStatusChanged(android.hardware.usb.UsbAuthDeviceInfo p0, int p1, int p2) throws android.os.RemoteException;
    public void onDeviceCheckPersistedAuthorization(android.hardware.usb.UsbAuthDeviceInfo p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.usb.IUsbAuthEventsListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onDeviceAskForAuthorization(android.hardware.usb.UsbAuthDeviceInfo p0) throws android.os.RemoteException {}
        public void onDeviceAuthorizationStatusChanged(android.hardware.usb.UsbAuthDeviceInfo p0, int p1, int p2) throws android.os.RemoteException {}
        public void onDeviceCheckPersistedAuthorization(android.hardware.usb.UsbAuthDeviceInfo p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.usb.IUsbAuthEventsListener {
        static final int TRANSACTION_onDeviceAskForAuthorization = 1;
        static final int TRANSACTION_onDeviceAuthorizationStatusChanged = 3;
        static final int TRANSACTION_onDeviceCheckPersistedAuthorization = 2;
        public Stub() { super(); }
        public static android.hardware.usb.IUsbAuthEventsListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.usb.IUsbAuthEventsListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onDeviceAskForAuthorization(android.hardware.usb.UsbAuthDeviceInfo p0) throws android.os.RemoteException {}
            public void onDeviceAuthorizationStatusChanged(android.hardware.usb.UsbAuthDeviceInfo p0, int p1, int p2) throws android.os.RemoteException {}
            public void onDeviceCheckPersistedAuthorization(android.hardware.usb.UsbAuthDeviceInfo p0) throws android.os.RemoteException {}
        }
    }
}
