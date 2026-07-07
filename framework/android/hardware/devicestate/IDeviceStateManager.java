package android.hardware.devicestate;

public interface IDeviceStateManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.devicestate.IDeviceStateManager";
    public void cancelBaseStateOverride() throws android.os.RemoteException;
    public void cancelStateRequest() throws android.os.RemoteException;
    public android.hardware.devicestate.DeviceStateInfo getDeviceStateInfo() throws android.os.RemoteException;
    public void onStateRequestOverlayDismissed(boolean p0) throws android.os.RemoteException;
    public android.hardware.devicestate.DeviceStateInfo registerCallback(android.hardware.devicestate.IDeviceStateManagerCallback p0) throws android.os.RemoteException;
    public void requestBaseStateOverride(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public void requestState(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.hardware.devicestate.IDeviceStateManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void cancelBaseStateOverride() throws android.os.RemoteException {}
        public void cancelStateRequest() throws android.os.RemoteException {}
        public android.hardware.devicestate.DeviceStateInfo getDeviceStateInfo() throws android.os.RemoteException { return null; }
        public void onStateRequestOverlayDismissed(boolean p0) throws android.os.RemoteException {}
        public android.hardware.devicestate.DeviceStateInfo registerCallback(android.hardware.devicestate.IDeviceStateManagerCallback p0) throws android.os.RemoteException { return null; }
        public void requestBaseStateOverride(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        public void requestState(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.devicestate.IDeviceStateManager {
        static final int TRANSACTION_cancelBaseStateOverride = 6;
        static final int TRANSACTION_cancelStateRequest = 4;
        static final int TRANSACTION_getDeviceStateInfo = 1;
        static final int TRANSACTION_onStateRequestOverlayDismissed = 7;
        static final int TRANSACTION_registerCallback = 2;
        static final int TRANSACTION_requestBaseStateOverride = 5;
        static final int TRANSACTION_requestState = 3;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.hardware.devicestate.IDeviceStateManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void onStateRequestOverlayDismissed_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.devicestate.IDeviceStateManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void cancelBaseStateOverride() throws android.os.RemoteException {}
            public void cancelStateRequest() throws android.os.RemoteException {}
            public android.hardware.devicestate.DeviceStateInfo getDeviceStateInfo() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onStateRequestOverlayDismissed(boolean p0) throws android.os.RemoteException {}
            public android.hardware.devicestate.DeviceStateInfo registerCallback(android.hardware.devicestate.IDeviceStateManagerCallback p0) throws android.os.RemoteException { return null; }
            public void requestBaseStateOverride(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
            public void requestState(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        }
    }
}
