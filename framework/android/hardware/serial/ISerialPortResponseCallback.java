package android.hardware.serial;

public interface ISerialPortResponseCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.serial.ISerialPortResponseCallback";
    public void onError(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onResult(android.hardware.serial.SerialPortInfo p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.serial.ISerialPortResponseCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onResult(android.hardware.serial.SerialPortInfo p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
    }

    public static @interface ErrorCode {
        public static final int ERROR_ACCESS_DENIED = 1;
        public static final int ERROR_OPENING_PORT = 2;
        public static final int ERROR_PORT_NOT_FOUND = 0;
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.serial.ISerialPortResponseCallback {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onResult = 1;
        public Stub() { super(); }
        public static android.hardware.serial.ISerialPortResponseCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.serial.ISerialPortResponseCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onResult(android.hardware.serial.SerialPortInfo p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
        }
    }
}
