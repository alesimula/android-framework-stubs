package android.hardware.input;

public interface IVirtualTouchpad extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.input.IVirtualTouchpad";
    public void close() throws android.os.RemoteException;
    public boolean sendButtonEvent(android.hardware.input.AidlVirtualTouchpadButtonEvent p0) throws android.os.RemoteException;
    public boolean sendTouchEvents(android.hardware.input.VirtualTouchEvent[] p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.IVirtualTouchpad {
        static final int TRANSACTION_close = 3;
        static final int TRANSACTION_sendButtonEvent = 2;
        static final int TRANSACTION_sendTouchEvents = 1;
        public Stub() { super(); }
        public static android.hardware.input.IVirtualTouchpad asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.input.IVirtualTouchpad {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void close() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean sendButtonEvent(android.hardware.input.AidlVirtualTouchpadButtonEvent p0) throws android.os.RemoteException { return false; }
            public boolean sendTouchEvents(android.hardware.input.VirtualTouchEvent[] p0) throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.hardware.input.IVirtualTouchpad {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void close() throws android.os.RemoteException {}
        public boolean sendButtonEvent(android.hardware.input.AidlVirtualTouchpadButtonEvent p0) throws android.os.RemoteException { return false; }
        public boolean sendTouchEvents(android.hardware.input.VirtualTouchEvent[] p0) throws android.os.RemoteException { return false; }
    }
}
