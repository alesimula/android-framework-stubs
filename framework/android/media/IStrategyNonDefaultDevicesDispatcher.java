package android.media;

public interface IStrategyNonDefaultDevicesDispatcher extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IStrategyNonDefaultDevicesDispatcher";
    public void dispatchNonDefDevicesChanged(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) throws android.os.RemoteException;

    public static class Default implements android.media.IStrategyNonDefaultDevicesDispatcher {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void dispatchNonDefDevicesChanged(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IStrategyNonDefaultDevicesDispatcher {
        static final int TRANSACTION_dispatchNonDefDevicesChanged = 1;
        public Stub() { super(); }
        public static android.media.IStrategyNonDefaultDevicesDispatcher asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.IStrategyNonDefaultDevicesDispatcher {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void dispatchNonDefDevicesChanged(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
