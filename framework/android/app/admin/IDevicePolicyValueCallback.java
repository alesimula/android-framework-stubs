package android.app.admin;

public interface IDevicePolicyValueCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.admin.IDevicePolicyValueCallback";
    public void onPolicyValueUpdated(java.lang.String p0, android.app.admin.PolicyValueTransport p1, android.app.admin.PolicyValueTransport p2) throws android.os.RemoteException;

    public static class Default implements android.app.admin.IDevicePolicyValueCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onPolicyValueUpdated(java.lang.String p0, android.app.admin.PolicyValueTransport p1, android.app.admin.PolicyValueTransport p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.admin.IDevicePolicyValueCallback {
        static final int TRANSACTION_onPolicyValueUpdated = 1;
        public Stub() { super(); }
        public static android.app.admin.IDevicePolicyValueCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.admin.IDevicePolicyValueCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onPolicyValueUpdated(java.lang.String p0, android.app.admin.PolicyValueTransport p1, android.app.admin.PolicyValueTransport p2) throws android.os.RemoteException {}
        }
    }
}
