package android.security.authenticationpolicy;

public interface ISecureLockDeviceStatusListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.authenticationpolicy.ISecureLockDeviceStatusListener";
    public void onSecureLockDeviceAvailableStatusChanged(int p0) throws android.os.RemoteException;
    public void onSecureLockDeviceEnabledStatusChanged(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.security.authenticationpolicy.ISecureLockDeviceStatusListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onSecureLockDeviceAvailableStatusChanged(int p0) throws android.os.RemoteException {}
        public void onSecureLockDeviceEnabledStatusChanged(boolean p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.security.authenticationpolicy.ISecureLockDeviceStatusListener {
        static final int TRANSACTION_onSecureLockDeviceAvailableStatusChanged = 2;
        static final int TRANSACTION_onSecureLockDeviceEnabledStatusChanged = 1;
        public Stub() { super(); }
        public static android.security.authenticationpolicy.ISecureLockDeviceStatusListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.security.authenticationpolicy.ISecureLockDeviceStatusListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onSecureLockDeviceAvailableStatusChanged(int p0) throws android.os.RemoteException {}
            public void onSecureLockDeviceEnabledStatusChanged(boolean p0) throws android.os.RemoteException {}
        }
    }
}
