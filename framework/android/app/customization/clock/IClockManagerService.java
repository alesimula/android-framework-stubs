package android.app.customization.clock;

public interface IClockManagerService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.customization.clock.IClockManagerService";
    public android.app.customization.clock.ClockDescription getClockDescription(int p0) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getClockDescriptionFile(int p0) throws android.os.RemoteException;
    public android.app.customization.clock.ClockInstance getClockInstance(int p0) throws android.os.RemoteException;
    public void registerClockChangedListener(android.app.customization.clock.IClockManagerCallback p0, int p1) throws android.os.RemoteException;
    public java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> setClockWithAssets(android.app.customization.clock.ClockDescription p0, android.os.Bundle p1, android.app.customization.clock.IClockManagerCallback p2, int p3) throws android.os.RemoteException;
    public void unregisterClockChangedListener(android.app.customization.clock.IClockManagerCallback p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.app.customization.clock.IClockManagerService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.app.customization.clock.ClockDescription getClockDescription(int p0) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor getClockDescriptionFile(int p0) throws android.os.RemoteException { return null; }
        public android.app.customization.clock.ClockInstance getClockInstance(int p0) throws android.os.RemoteException { return null; }
        public void registerClockChangedListener(android.app.customization.clock.IClockManagerCallback p0, int p1) throws android.os.RemoteException {}
        public java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> setClockWithAssets(android.app.customization.clock.ClockDescription p0, android.os.Bundle p1, android.app.customization.clock.IClockManagerCallback p2, int p3) throws android.os.RemoteException { return null; }
        public void unregisterClockChangedListener(android.app.customization.clock.IClockManagerCallback p0, int p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.customization.clock.IClockManagerService {
        static final int TRANSACTION_getClockDescription = 3;
        static final int TRANSACTION_getClockDescriptionFile = 4;
        static final int TRANSACTION_getClockInstance = 2;
        static final int TRANSACTION_registerClockChangedListener = 5;
        static final int TRANSACTION_setClockWithAssets = 1;
        static final int TRANSACTION_unregisterClockChangedListener = 6;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.app.customization.clock.IClockManagerService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setClockWithAssets_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.app.customization.clock.IClockManagerService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public android.app.customization.clock.ClockDescription getClockDescription(int p0) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor getClockDescriptionFile(int p0) throws android.os.RemoteException { return null; }
            public android.app.customization.clock.ClockInstance getClockInstance(int p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void registerClockChangedListener(android.app.customization.clock.IClockManagerCallback p0, int p1) throws android.os.RemoteException {}
            public java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> setClockWithAssets(android.app.customization.clock.ClockDescription p0, android.os.Bundle p1, android.app.customization.clock.IClockManagerCallback p2, int p3) throws android.os.RemoteException { return null; }
            public void unregisterClockChangedListener(android.app.customization.clock.IClockManagerCallback p0, int p1) throws android.os.RemoteException {}
        }
    }
}
