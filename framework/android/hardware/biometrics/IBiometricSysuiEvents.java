package android.hardware.biometrics;

public interface IBiometricSysuiEvents extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IBiometricSysuiEvents";
    public void hideAuthenticationDialog(long p0) throws android.os.RemoteException;
    public void onBiometricAuthenticated(int p0) throws android.os.RemoteException;
    public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException;
    public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onNextTranslationOffsetUpdated(long p0, int p1) throws android.os.RemoteException;
    public void onSurfacePackageAvailable(long p0, android.view.SurfaceControlViewHost.SurfacePackage p1, int p2, int p3) throws android.os.RemoteException;
    public void pauseAuthentication(long p0) throws android.os.RemoteException;
    public void resumeAuthentication(long p0) throws android.os.RemoteException;
    public void setIsAuthenticationDelayed(long p0, boolean p1) throws android.os.RemoteException;
    public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiCallback p1, int[] p2, boolean p3, boolean p4, int p5, long p6, java.lang.String p7, long p8) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IBiometricSysuiEvents {
        static final int TRANSACTION_hideAuthenticationDialog = 5;
        static final int TRANSACTION_onBiometricAuthenticated = 2;
        static final int TRANSACTION_onBiometricError = 4;
        static final int TRANSACTION_onBiometricHelp = 3;
        static final int TRANSACTION_onNextTranslationOffsetUpdated = 10;
        static final int TRANSACTION_onSurfacePackageAvailable = 6;
        static final int TRANSACTION_pauseAuthentication = 8;
        static final int TRANSACTION_resumeAuthentication = 7;
        static final int TRANSACTION_setIsAuthenticationDelayed = 9;
        static final int TRANSACTION_showAuthenticationDialog = 1;
        public Stub() { super(); }
        public static android.hardware.biometrics.IBiometricSysuiEvents asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.biometrics.IBiometricSysuiEvents {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void hideAuthenticationDialog(long p0) throws android.os.RemoteException {}
            public void onBiometricAuthenticated(int p0) throws android.os.RemoteException {}
            public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onNextTranslationOffsetUpdated(long p0, int p1) throws android.os.RemoteException {}
            public void onSurfacePackageAvailable(long p0, android.view.SurfaceControlViewHost.SurfacePackage p1, int p2, int p3) throws android.os.RemoteException {}
            public void pauseAuthentication(long p0) throws android.os.RemoteException {}
            public void resumeAuthentication(long p0) throws android.os.RemoteException {}
            public void setIsAuthenticationDelayed(long p0, boolean p1) throws android.os.RemoteException {}
            public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiCallback p1, int[] p2, boolean p3, boolean p4, int p5, long p6, java.lang.String p7, long p8) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.hardware.biometrics.IBiometricSysuiEvents {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void hideAuthenticationDialog(long p0) throws android.os.RemoteException {}
        public void onBiometricAuthenticated(int p0) throws android.os.RemoteException {}
        public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onNextTranslationOffsetUpdated(long p0, int p1) throws android.os.RemoteException {}
        public void onSurfacePackageAvailable(long p0, android.view.SurfaceControlViewHost.SurfacePackage p1, int p2, int p3) throws android.os.RemoteException {}
        public void pauseAuthentication(long p0) throws android.os.RemoteException {}
        public void resumeAuthentication(long p0) throws android.os.RemoteException {}
        public void setIsAuthenticationDelayed(long p0, boolean p1) throws android.os.RemoteException {}
        public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiCallback p1, int[] p2, boolean p3, boolean p4, int p5, long p6, java.lang.String p7, long p8) throws android.os.RemoteException {}
    }
}
