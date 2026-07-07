package android.hardware.input;

public interface IVirtualRotaryEncoder extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.input.IVirtualRotaryEncoder";
    public void close() throws android.os.RemoteException;
    public int getInputDeviceId() throws android.os.RemoteException;
    public boolean sendRotaryEncoderScrollEvent(android.hardware.input.VirtualRotaryEncoderScrollEvent p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.input.IVirtualRotaryEncoder {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void close() throws android.os.RemoteException {}
        public int getInputDeviceId() throws android.os.RemoteException { return 0; }
        public boolean sendRotaryEncoderScrollEvent(android.hardware.input.VirtualRotaryEncoderScrollEvent p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.IVirtualRotaryEncoder {
        static final int TRANSACTION_close = 1;
        static final int TRANSACTION_getInputDeviceId = 2;
        static final int TRANSACTION_sendRotaryEncoderScrollEvent = 3;
        public Stub() { super(); }
        public static android.hardware.input.IVirtualRotaryEncoder asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.input.IVirtualRotaryEncoder {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void close() throws android.os.RemoteException {}
            public int getInputDeviceId() throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean sendRotaryEncoderScrollEvent(android.hardware.input.VirtualRotaryEncoderScrollEvent p0) throws android.os.RemoteException { return false; }
        }
    }
}
