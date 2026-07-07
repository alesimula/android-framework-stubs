package android.hardware.usb;

public interface IPowerProfileInfoListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.usb.IPowerProfileInfoListener";
    public void onPowerProfileInfoChanged(android.hardware.usb.ParcelableUsbPort p0, android.hardware.usb.UsbPortStatus p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.usb.IPowerProfileInfoListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onPowerProfileInfoChanged(android.hardware.usb.ParcelableUsbPort p0, android.hardware.usb.UsbPortStatus p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.usb.IPowerProfileInfoListener {
        static final int TRANSACTION_onPowerProfileInfoChanged = 1;
        public Stub() { super(); }
        public static android.hardware.usb.IPowerProfileInfoListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.usb.IPowerProfileInfoListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onPowerProfileInfoChanged(android.hardware.usb.ParcelableUsbPort p0, android.hardware.usb.UsbPortStatus p1) throws android.os.RemoteException {}
        }
    }
}
