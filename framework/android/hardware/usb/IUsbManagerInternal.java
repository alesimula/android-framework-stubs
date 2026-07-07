package android.hardware.usb;

public interface IUsbManagerInternal extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.usb.IUsbManagerInternal";
    public boolean allowPciTunnelControl(boolean p0, int p1) throws android.os.RemoteException;
    public boolean enableUsbDataSignal(boolean p0, int p1) throws android.os.RemoteException;
    public boolean pinAuthorizationMode(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.usb.IUsbManagerInternal {
        public Default() {}
        public boolean allowPciTunnelControl(boolean p0, int p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
        public boolean enableUsbDataSignal(boolean p0, int p1) throws android.os.RemoteException { return false; }
        public boolean pinAuthorizationMode(int p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.usb.IUsbManagerInternal {
        static final int TRANSACTION_allowPciTunnelControl = 2;
        static final int TRANSACTION_enableUsbDataSignal = 1;
        static final int TRANSACTION_pinAuthorizationMode = 3;
        public Stub() { super(); }
        public static android.hardware.usb.IUsbManagerInternal asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.usb.IUsbManagerInternal {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public boolean allowPciTunnelControl(boolean p0, int p1) throws android.os.RemoteException { return false; }
            public android.os.IBinder asBinder() { return null; }
            public boolean enableUsbDataSignal(boolean p0, int p1) throws android.os.RemoteException { return false; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean pinAuthorizationMode(int p0) throws android.os.RemoteException { return false; }
        }
    }
}
