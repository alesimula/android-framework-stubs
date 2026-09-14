package android.app.trust.crossdevice;

public interface ICrossDeviceTrustManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.trust.crossdevice.ICrossDeviceTrustManager";
    public void enroll(int p0) throws android.os.RemoteException;
    public void unenroll(int p0) throws android.os.RemoteException;

    public static class Default implements android.app.trust.crossdevice.ICrossDeviceTrustManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void enroll(int p0) throws android.os.RemoteException {}
        public void unenroll(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.trust.crossdevice.ICrossDeviceTrustManager {
        static final int TRANSACTION_enroll = 1;
        static final int TRANSACTION_unenroll = 2;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.app.trust.crossdevice.ICrossDeviceTrustManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void enroll_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void unenroll_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.app.trust.crossdevice.ICrossDeviceTrustManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void enroll(int p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void unenroll(int p0) throws android.os.RemoteException {}
        }
    }
}
