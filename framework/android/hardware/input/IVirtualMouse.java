package android.hardware.input;

public interface IVirtualMouse extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.input.IVirtualMouse";
    public void close() throws android.os.RemoteException;
    public android.graphics.PointF getCursorPositionInLogicalDisplay() throws android.os.RemoteException;
    public android.graphics.PointF getCursorPositionInPhysicalDisplay() throws android.os.RemoteException;
    public int getInputDeviceId() throws android.os.RemoteException;
    public boolean sendMouseButtonEvent(android.hardware.input.VirtualMouseButtonEvent p0) throws android.os.RemoteException;
    public boolean sendMouseRelativeEvent(android.hardware.input.VirtualMouseRelativeEvent p0) throws android.os.RemoteException;
    public boolean sendMouseScrollEvent(android.hardware.input.VirtualMouseScrollEvent p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.input.IVirtualMouse {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void close() throws android.os.RemoteException {}
        public android.graphics.PointF getCursorPositionInLogicalDisplay() throws android.os.RemoteException { return null; }
        public android.graphics.PointF getCursorPositionInPhysicalDisplay() throws android.os.RemoteException { return null; }
        public int getInputDeviceId() throws android.os.RemoteException { return 0; }
        public boolean sendMouseButtonEvent(android.hardware.input.VirtualMouseButtonEvent p0) throws android.os.RemoteException { return false; }
        public boolean sendMouseRelativeEvent(android.hardware.input.VirtualMouseRelativeEvent p0) throws android.os.RemoteException { return false; }
        public boolean sendMouseScrollEvent(android.hardware.input.VirtualMouseScrollEvent p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.IVirtualMouse {
        static final int TRANSACTION_close = 1;
        static final int TRANSACTION_getCursorPositionInLogicalDisplay = 7;
        static final int TRANSACTION_getCursorPositionInPhysicalDisplay = 6;
        static final int TRANSACTION_getInputDeviceId = 2;
        static final int TRANSACTION_sendMouseButtonEvent = 3;
        static final int TRANSACTION_sendMouseRelativeEvent = 4;
        static final int TRANSACTION_sendMouseScrollEvent = 5;
        public Stub() { super(); }
        public static android.hardware.input.IVirtualMouse asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.input.IVirtualMouse {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void close() throws android.os.RemoteException {}
            public android.graphics.PointF getCursorPositionInLogicalDisplay() throws android.os.RemoteException { return null; }
            public android.graphics.PointF getCursorPositionInPhysicalDisplay() throws android.os.RemoteException { return null; }
            public int getInputDeviceId() throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean sendMouseButtonEvent(android.hardware.input.VirtualMouseButtonEvent p0) throws android.os.RemoteException { return false; }
            public boolean sendMouseRelativeEvent(android.hardware.input.VirtualMouseRelativeEvent p0) throws android.os.RemoteException { return false; }
            public boolean sendMouseScrollEvent(android.hardware.input.VirtualMouseScrollEvent p0) throws android.os.RemoteException { return false; }
        }
    }
}
