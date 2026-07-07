package android.telephony.ims.aidl;

public interface IRcsConfigCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IRcsConfigCallback";
    public void onAutoConfigurationErrorReceived(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onConfigurationChanged(byte[] p0) throws android.os.RemoteException;
    public void onConfigurationReset() throws android.os.RemoteException;
    public void onPreProvisioningReceived(byte[] p0) throws android.os.RemoteException;
    public void onRemoved() throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IRcsConfigCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onAutoConfigurationErrorReceived(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onConfigurationChanged(byte[] p0) throws android.os.RemoteException {}
        public void onConfigurationReset() throws android.os.RemoteException {}
        public void onPreProvisioningReceived(byte[] p0) throws android.os.RemoteException {}
        public void onRemoved() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IRcsConfigCallback {
        static final int TRANSACTION_onAutoConfigurationErrorReceived = 2;
        static final int TRANSACTION_onConfigurationChanged = 1;
        static final int TRANSACTION_onConfigurationReset = 3;
        static final int TRANSACTION_onPreProvisioningReceived = 5;
        static final int TRANSACTION_onRemoved = 4;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IRcsConfigCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.telephony.ims.aidl.IRcsConfigCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onAutoConfigurationErrorReceived(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onConfigurationChanged(byte[] p0) throws android.os.RemoteException {}
            public void onConfigurationReset() throws android.os.RemoteException {}
            public void onPreProvisioningReceived(byte[] p0) throws android.os.RemoteException {}
            public void onRemoved() throws android.os.RemoteException {}
        }
    }
}
