package android.hardware.location;

public interface IGeofenceHardware extends android.os.IInterface {
    public boolean addCircularFence(int p0, android.hardware.location.GeofenceHardwareRequestParcelable p1, android.hardware.location.IGeofenceHardwareCallback p2) throws android.os.RemoteException;
    public int[] getMonitoringTypes() throws android.os.RemoteException;
    public int getStatusOfMonitoringType(int p0) throws android.os.RemoteException;
    public boolean pauseGeofence(int p0, int p1) throws android.os.RemoteException;
    public boolean registerForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) throws android.os.RemoteException;
    public boolean removeGeofence(int p0, int p1) throws android.os.RemoteException;
    public boolean resumeGeofence(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setFusedGeofenceHardware(android.location.IFusedGeofenceHardware p0) throws android.os.RemoteException;
    public void setGpsGeofenceHardware(android.location.IGpsGeofenceHardware p0) throws android.os.RemoteException;
    public boolean unregisterForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.location.IGeofenceHardware {
        public Default() {}
        public boolean addCircularFence(int p0, android.hardware.location.GeofenceHardwareRequestParcelable p1, android.hardware.location.IGeofenceHardwareCallback p2) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
        public int[] getMonitoringTypes() throws android.os.RemoteException { return null; }
        public int getStatusOfMonitoringType(int p0) throws android.os.RemoteException { return 0; }
        public boolean pauseGeofence(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean registerForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) throws android.os.RemoteException { return false; }
        public boolean removeGeofence(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean resumeGeofence(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void setFusedGeofenceHardware(android.location.IFusedGeofenceHardware p0) throws android.os.RemoteException {}
        public void setGpsGeofenceHardware(android.location.IGpsGeofenceHardware p0) throws android.os.RemoteException {}
        public boolean unregisterForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.location.IGeofenceHardware {
        public static final java.lang.String DESCRIPTOR = "android.hardware.location.IGeofenceHardware";
        static final int TRANSACTION_addCircularFence = 5;
        static final int TRANSACTION_getMonitoringTypes = 3;
        static final int TRANSACTION_getStatusOfMonitoringType = 4;
        static final int TRANSACTION_pauseGeofence = 7;
        static final int TRANSACTION_registerForMonitorStateChangeCallback = 9;
        static final int TRANSACTION_removeGeofence = 6;
        static final int TRANSACTION_resumeGeofence = 8;
        static final int TRANSACTION_setFusedGeofenceHardware = 2;
        static final int TRANSACTION_setGpsGeofenceHardware = 1;
        static final int TRANSACTION_unregisterForMonitorStateChangeCallback = 10;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.hardware.location.IGeofenceHardware asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void addCircularFence_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        protected void getMonitoringTypes_enforcePermission() throws java.lang.SecurityException {}
        protected void getStatusOfMonitoringType_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void pauseGeofence_enforcePermission() throws java.lang.SecurityException {}
        protected void registerForMonitorStateChangeCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void removeGeofence_enforcePermission() throws java.lang.SecurityException {}
        protected void resumeGeofence_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterForMonitorStateChangeCallback_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.hardware.location.IGeofenceHardware {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public boolean addCircularFence(int p0, android.hardware.location.GeofenceHardwareRequestParcelable p1, android.hardware.location.IGeofenceHardwareCallback p2) throws android.os.RemoteException { return false; }
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int[] getMonitoringTypes() throws android.os.RemoteException { return null; }
            public int getStatusOfMonitoringType(int p0) throws android.os.RemoteException { return 0; }
            public boolean pauseGeofence(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean registerForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) throws android.os.RemoteException { return false; }
            public boolean removeGeofence(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean resumeGeofence(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void setFusedGeofenceHardware(android.location.IFusedGeofenceHardware p0) throws android.os.RemoteException {}
            public void setGpsGeofenceHardware(android.location.IGpsGeofenceHardware p0) throws android.os.RemoteException {}
            public boolean unregisterForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) throws android.os.RemoteException { return false; }
        }
    }
}
