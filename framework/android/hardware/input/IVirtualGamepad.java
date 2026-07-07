package android.hardware.input;

public interface IVirtualGamepad extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.input.IVirtualGamepad";
    public void close() throws android.os.RemoteException;
    public boolean sendGamepadKeyEvent(android.hardware.input.VirtualKeyEvent p0) throws android.os.RemoteException;
    public boolean sendGamepadMotionEvent(android.hardware.input.VirtualGamepadMotionEvent p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.input.IVirtualGamepad {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void close() throws android.os.RemoteException {}
        public boolean sendGamepadKeyEvent(android.hardware.input.VirtualKeyEvent p0) throws android.os.RemoteException { return false; }
        public boolean sendGamepadMotionEvent(android.hardware.input.VirtualGamepadMotionEvent p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.IVirtualGamepad {
        static final int TRANSACTION_close = 1;
        static final int TRANSACTION_sendGamepadKeyEvent = 2;
        static final int TRANSACTION_sendGamepadMotionEvent = 3;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.hardware.input.IVirtualGamepad asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void close_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void sendGamepadKeyEvent_enforcePermission() throws java.lang.SecurityException {}
        protected void sendGamepadMotionEvent_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.hardware.input.IVirtualGamepad {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void close() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean sendGamepadKeyEvent(android.hardware.input.VirtualKeyEvent p0) throws android.os.RemoteException { return false; }
            public boolean sendGamepadMotionEvent(android.hardware.input.VirtualGamepadMotionEvent p0) throws android.os.RemoteException { return false; }
        }
    }
}
