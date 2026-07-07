package android.hardware.biometrics;

public interface IIdentityCheckStateListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IIdentityCheckStateListener";
    public void onWatchRangingStateChanged(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IIdentityCheckStateListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onWatchRangingStateChanged(int p0, int p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IIdentityCheckStateListener {
        static final int TRANSACTION_onWatchRangingStateChanged = 1;
        public Stub() { super(); }
        public static android.hardware.biometrics.IIdentityCheckStateListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.biometrics.IIdentityCheckStateListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onWatchRangingStateChanged(int p0, int p1) throws android.os.RemoteException {}
        }
    }

    public static @interface WatchRangingState {
        public static final int WATCH_RANGING_IDLE = 0;
        public static final int WATCH_RANGING_STARTED = 2;
        public static final int WATCH_RANGING_STOPPED = 3;
        public static final int WATCH_RANGING_SUCCESSFUL = 1;
    }
}
