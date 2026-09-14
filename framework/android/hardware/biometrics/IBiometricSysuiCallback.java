package android.hardware.biometrics;

public interface IBiometricSysuiCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IBiometricSysuiCallback";
    public void onDeviceCredentialPressed() throws android.os.RemoteException;
    public void onDialogAnimatedIn(boolean p0) throws android.os.RemoteException;
    public void onDialogDismissed(int p0, byte[] p1) throws android.os.RemoteException;
    public void onHostTokenAvailable(int p0, android.os.IBinder p1, int p2, int p3) throws android.os.RemoteException;
    public void onPauseAuthentication() throws android.os.RemoteException;
    public void onResumeAuthentication() throws android.os.RemoteException;
    public void onStartFingerprintNow() throws android.os.RemoteException;
    public void onStyleUpdated(android.hardware.biometrics.BiometricPromptStyleSpec p0) throws android.os.RemoteException;
    public void onSystemEvent(int p0) throws android.os.RemoteException;
    public void onTryAgainPressed() throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IBiometricSysuiCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onDeviceCredentialPressed() throws android.os.RemoteException {}
        public void onDialogAnimatedIn(boolean p0) throws android.os.RemoteException {}
        public void onDialogDismissed(int p0, byte[] p1) throws android.os.RemoteException {}
        public void onHostTokenAvailable(int p0, android.os.IBinder p1, int p2, int p3) throws android.os.RemoteException {}
        public void onPauseAuthentication() throws android.os.RemoteException {}
        public void onResumeAuthentication() throws android.os.RemoteException {}
        public void onStartFingerprintNow() throws android.os.RemoteException {}
        public void onStyleUpdated(android.hardware.biometrics.BiometricPromptStyleSpec p0) throws android.os.RemoteException {}
        public void onSystemEvent(int p0) throws android.os.RemoteException {}
        public void onTryAgainPressed() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IBiometricSysuiCallback {
        static final int TRANSACTION_onDeviceCredentialPressed = 3;
        static final int TRANSACTION_onDialogAnimatedIn = 5;
        static final int TRANSACTION_onDialogDismissed = 1;
        static final int TRANSACTION_onHostTokenAvailable = 10;
        static final int TRANSACTION_onPauseAuthentication = 7;
        static final int TRANSACTION_onResumeAuthentication = 8;
        static final int TRANSACTION_onStartFingerprintNow = 6;
        static final int TRANSACTION_onStyleUpdated = 9;
        static final int TRANSACTION_onSystemEvent = 4;
        static final int TRANSACTION_onTryAgainPressed = 2;
        public Stub() { super(); }
        public static android.hardware.biometrics.IBiometricSysuiCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.biometrics.IBiometricSysuiCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onDeviceCredentialPressed() throws android.os.RemoteException {}
            public void onDialogAnimatedIn(boolean p0) throws android.os.RemoteException {}
            public void onDialogDismissed(int p0, byte[] p1) throws android.os.RemoteException {}
            public void onHostTokenAvailable(int p0, android.os.IBinder p1, int p2, int p3) throws android.os.RemoteException {}
            public void onPauseAuthentication() throws android.os.RemoteException {}
            public void onResumeAuthentication() throws android.os.RemoteException {}
            public void onStartFingerprintNow() throws android.os.RemoteException {}
            public void onStyleUpdated(android.hardware.biometrics.BiometricPromptStyleSpec p0) throws android.os.RemoteException {}
            public void onSystemEvent(int p0) throws android.os.RemoteException {}
            public void onTryAgainPressed() throws android.os.RemoteException {}
        }
    }
}
