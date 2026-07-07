package android.hardware.lights;

public interface ILightsManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.lights.ILightsManager";
    public void closeSession(android.os.IBinder p0) throws android.os.RemoteException;
    public android.hardware.lights.ColorSequence getLightSequence(int p0) throws android.os.RemoteException;
    public android.hardware.lights.LightState getLightState(int p0) throws android.os.RemoteException;
    public java.util.List<android.hardware.lights.Light> getLights() throws android.os.RemoteException;
    public void openSession(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void setLightEffect(android.os.IBinder p0, android.hardware.lights.MultiLightEffect p1) throws android.os.RemoteException;
    public void setLightStates(android.os.IBinder p0, int[] p1, android.hardware.lights.LightState[] p2) throws android.os.RemoteException;

    public static class Default implements android.hardware.lights.ILightsManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void closeSession(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.hardware.lights.ColorSequence getLightSequence(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.lights.LightState getLightState(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.lights.Light> getLights() throws android.os.RemoteException { return null; }
        public void openSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void setLightEffect(android.os.IBinder p0, android.hardware.lights.MultiLightEffect p1) throws android.os.RemoteException {}
        public void setLightStates(android.os.IBinder p0, int[] p1, android.hardware.lights.LightState[] p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.lights.ILightsManager {
        static final int TRANSACTION_closeSession = 4;
        static final int TRANSACTION_getLightSequence = 7;
        static final int TRANSACTION_getLightState = 2;
        static final int TRANSACTION_getLights = 1;
        static final int TRANSACTION_openSession = 3;
        static final int TRANSACTION_setLightEffect = 6;
        static final int TRANSACTION_setLightStates = 5;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.hardware.lights.ILightsManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void closeSession_enforcePermission() throws java.lang.SecurityException {}
        protected void getLightSequence_enforcePermission() throws java.lang.SecurityException {}
        protected void getLightState_enforcePermission() throws java.lang.SecurityException {}
        protected void getLights_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void openSession_enforcePermission() throws java.lang.SecurityException {}
        protected void setLightEffect_enforcePermission() throws java.lang.SecurityException {}
        protected void setLightStates_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.hardware.lights.ILightsManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void closeSession(android.os.IBinder p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.lights.ColorSequence getLightSequence(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.lights.LightState getLightState(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.lights.Light> getLights() throws android.os.RemoteException { return null; }
            public void openSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void setLightEffect(android.os.IBinder p0, android.hardware.lights.MultiLightEffect p1) throws android.os.RemoteException {}
            public void setLightStates(android.os.IBinder p0, int[] p1, android.hardware.lights.LightState[] p2) throws android.os.RemoteException {}
        }
    }
}
