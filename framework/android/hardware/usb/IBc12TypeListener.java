package android.hardware.usb;

public interface IBc12TypeListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.usb.IBc12TypeListener";
    public void onPartnerBc12TypeChanged(android.hardware.usb.ParcelableUsbPort p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.usb.IBc12TypeListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onPartnerBc12TypeChanged(android.hardware.usb.ParcelableUsbPort p0, int p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.usb.IBc12TypeListener {
        static final int TRANSACTION_onPartnerBc12TypeChanged = 1;
        public Stub() { super(); }
        public static android.hardware.usb.IBc12TypeListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.usb.IBc12TypeListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onPartnerBc12TypeChanged(android.hardware.usb.ParcelableUsbPort p0, int p1) throws android.os.RemoteException {}
        }
    }
}
