package android.hardware.input;

public interface IVirtualKeyboard extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.input.IVirtualKeyboard";
    public void close() throws android.os.RemoteException;
    public int getInputDeviceId() throws android.os.RemoteException;
    public boolean sendKeyEvent(android.hardware.input.VirtualKeyEvent p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.input.IVirtualKeyboard {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void close() throws android.os.RemoteException {}
        public int getInputDeviceId() throws android.os.RemoteException { return 0; }
        public boolean sendKeyEvent(android.hardware.input.VirtualKeyEvent p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.IVirtualKeyboard {
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_getInputDeviceId = 3;
        static final int TRANSACTION_sendKeyEvent = 1;
        public Stub() { super(); }
        public static android.hardware.input.IVirtualKeyboard asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.input.IVirtualKeyboard {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void close() throws android.os.RemoteException {}
            public int getInputDeviceId() throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean sendKeyEvent(android.hardware.input.VirtualKeyEvent p0) throws android.os.RemoteException { return false; }
        }
    }
}
