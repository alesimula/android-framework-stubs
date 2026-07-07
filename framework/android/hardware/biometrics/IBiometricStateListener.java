package android.hardware.biometrics;

public interface IBiometricStateListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IBiometricStateListener";
    public void onBiometricAction(int p0) throws android.os.RemoteException;
    public void onEnrollmentsChanged(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void onStateChanged(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IBiometricStateListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onBiometricAction(int p0) throws android.os.RemoteException {}
        public void onEnrollmentsChanged(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void onStateChanged(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IBiometricStateListener {
        static final int TRANSACTION_onBiometricAction = 2;
        static final int TRANSACTION_onEnrollmentsChanged = 3;
        static final int TRANSACTION_onStateChanged = 1;
        public Stub() { super(); }
        public static android.hardware.biometrics.IBiometricStateListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.biometrics.IBiometricStateListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onBiometricAction(int p0) throws android.os.RemoteException {}
            public void onEnrollmentsChanged(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void onStateChanged(int p0) throws android.os.RemoteException {}
        }
    }
}
