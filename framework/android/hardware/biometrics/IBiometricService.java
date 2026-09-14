package android.hardware.biometrics;

public interface IBiometricService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IBiometricService";
    public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException;
    public int canAuthenticate(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException;
    public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException;
    public long getCurrentAuthenticationRequestId() throws android.os.RemoteException;
    public int getCurrentModality(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public int getCurrentStrength(int p0) throws android.os.RemoteException;
    public android.os.Bundle getEmbeddedContentState(long p0) throws android.os.RemoteException;
    public long getLastAuthenticationTime(int p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException;
    public int getSupportedModalities(int p0) throws android.os.RemoteException;
    public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException;
    public void onReadyForAuthentication(long p0, int p1) throws android.os.RemoteException;
    public void onSurfacePackageAvailable(android.os.IBinder p0, long p1, android.view.SurfaceControlViewHost.SurfacePackage p2, int p3, int p4) throws android.os.RemoteException;
    public void pauseAuthentication(long p0) throws android.os.RemoteException;
    public void registerAuthenticator(int p0, int p1, int p2, android.hardware.biometrics.IBiometricAuthenticator p3) throws android.os.RemoteException;
    public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException;
    public void registerIdentityCheckStateListener(android.hardware.biometrics.IIdentityCheckStateListener p0) throws android.os.RemoteException;
    public void registerSysuiEvents(android.hardware.biometrics.IBiometricSysuiEvents p0) throws android.os.RemoteException;
    public void resetLockout(int p0, byte[] p1) throws android.os.RemoteException;
    public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException;
    public void resumeAuthentication(long p0) throws android.os.RemoteException;
    public void setEmbeddedContentState(long p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void setIdentityCheckTestStatus(android.hardware.biometrics.IdentityCheckStatus p0) throws android.os.RemoteException;
    public void setIsAuthenticationDelayed(long p0, boolean p1) throws android.os.RemoteException;
    public void unregisterIdentityCheckStateListener(android.hardware.biometrics.IIdentityCheckStateListener p0) throws android.os.RemoteException;
    public void updateClientReceiver(android.os.IBinder p0, android.hardware.biometrics.IBiometricServiceReceiver p1, long p2) throws android.os.RemoteException;
    public void updateNextTranslationOffset(long p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IBiometricService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException { return 0L; }
        public int canAuthenticate(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException { return 0; }
        public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
        public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException { return null; }
        public long getCurrentAuthenticationRequestId() throws android.os.RemoteException { return 0L; }
        public int getCurrentModality(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException { return 0; }
        public int getCurrentStrength(int p0) throws android.os.RemoteException { return 0; }
        public android.os.Bundle getEmbeddedContentState(long p0) throws android.os.RemoteException { return null; }
        public long getLastAuthenticationTime(int p0, int p1) throws android.os.RemoteException { return 0L; }
        public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getSupportedModalities(int p0) throws android.os.RemoteException { return 0; }
        public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
        public void onReadyForAuthentication(long p0, int p1) throws android.os.RemoteException {}
        public void onSurfacePackageAvailable(android.os.IBinder p0, long p1, android.view.SurfaceControlViewHost.SurfacePackage p2, int p3, int p4) throws android.os.RemoteException {}
        public void pauseAuthentication(long p0) throws android.os.RemoteException {}
        public void registerAuthenticator(int p0, int p1, int p2, android.hardware.biometrics.IBiometricAuthenticator p3) throws android.os.RemoteException {}
        public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException {}
        public void registerIdentityCheckStateListener(android.hardware.biometrics.IIdentityCheckStateListener p0) throws android.os.RemoteException {}
        public void registerSysuiEvents(android.hardware.biometrics.IBiometricSysuiEvents p0) throws android.os.RemoteException {}
        public void resetLockout(int p0, byte[] p1) throws android.os.RemoteException {}
        public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException {}
        public void resumeAuthentication(long p0) throws android.os.RemoteException {}
        public void setEmbeddedContentState(long p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void setIdentityCheckTestStatus(android.hardware.biometrics.IdentityCheckStatus p0) throws android.os.RemoteException {}
        public void setIsAuthenticationDelayed(long p0, boolean p1) throws android.os.RemoteException {}
        public void unregisterIdentityCheckStateListener(android.hardware.biometrics.IIdentityCheckStateListener p0) throws android.os.RemoteException {}
        public void updateClientReceiver(android.os.IBinder p0, android.hardware.biometrics.IBiometricServiceReceiver p1, long p2) throws android.os.RemoteException {}
        public void updateNextTranslationOffset(long p0, int p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IBiometricService {
        static final int TRANSACTION_authenticate = 4;
        static final int TRANSACTION_canAuthenticate = 8;
        static final int TRANSACTION_cancelAuthentication = 7;
        static final int TRANSACTION_createTestSession = 1;
        static final int TRANSACTION_getAuthenticatorIds = 17;
        static final int TRANSACTION_getCurrentAuthenticationRequestId = 6;
        static final int TRANSACTION_getCurrentModality = 21;
        static final int TRANSACTION_getCurrentStrength = 20;
        static final int TRANSACTION_getEmbeddedContentState = 24;
        static final int TRANSACTION_getLastAuthenticationTime = 9;
        static final int TRANSACTION_getSensorProperties = 3;
        static final int TRANSACTION_getSupportedModalities = 22;
        static final int TRANSACTION_hasEnrolledBiometrics = 10;
        static final int TRANSACTION_invalidateAuthenticatorIds = 16;
        static final int TRANSACTION_onReadyForAuthentication = 15;
        static final int TRANSACTION_onSurfacePackageAvailable = 25;
        static final int TRANSACTION_pauseAuthentication = 26;
        static final int TRANSACTION_registerAuthenticator = 11;
        static final int TRANSACTION_registerEnabledOnKeyguardCallback = 12;
        static final int TRANSACTION_registerIdentityCheckStateListener = 13;
        static final int TRANSACTION_registerSysuiEvents = 30;
        static final int TRANSACTION_resetLockout = 19;
        static final int TRANSACTION_resetLockoutTimeBound = 18;
        static final int TRANSACTION_resumeAuthentication = 27;
        static final int TRANSACTION_setEmbeddedContentState = 23;
        static final int TRANSACTION_setIdentityCheckTestStatus = 2;
        static final int TRANSACTION_setIsAuthenticationDelayed = 28;
        static final int TRANSACTION_unregisterIdentityCheckStateListener = 14;
        static final int TRANSACTION_updateClientReceiver = 5;
        static final int TRANSACTION_updateNextTranslationOffset = 29;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.hardware.biometrics.IBiometricService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void authenticate_enforcePermission() throws java.lang.SecurityException {}
        protected void canAuthenticate_enforcePermission() throws java.lang.SecurityException {}
        protected void cancelAuthentication_enforcePermission() throws java.lang.SecurityException {}
        protected void createTestSession_enforcePermission() throws java.lang.SecurityException {}
        protected void getAuthenticatorIds_enforcePermission() throws java.lang.SecurityException {}
        protected void getCurrentAuthenticationRequestId_enforcePermission() throws java.lang.SecurityException {}
        protected void getCurrentModality_enforcePermission() throws java.lang.SecurityException {}
        protected void getCurrentStrength_enforcePermission() throws java.lang.SecurityException {}
        protected void getEmbeddedContentState_enforcePermission() throws java.lang.SecurityException {}
        protected void getLastAuthenticationTime_enforcePermission() throws java.lang.SecurityException {}
        protected void getSensorProperties_enforcePermission() throws java.lang.SecurityException {}
        protected void getSupportedModalities_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void hasEnrolledBiometrics_enforcePermission() throws java.lang.SecurityException {}
        protected void invalidateAuthenticatorIds_enforcePermission() throws java.lang.SecurityException {}
        protected void onReadyForAuthentication_enforcePermission() throws java.lang.SecurityException {}
        protected void onSurfacePackageAvailable_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void pauseAuthentication_enforcePermission() throws java.lang.SecurityException {}
        protected void registerAuthenticator_enforcePermission() throws java.lang.SecurityException {}
        protected void registerEnabledOnKeyguardCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void registerIdentityCheckStateListener_enforcePermission() throws java.lang.SecurityException {}
        protected void registerSysuiEvents_enforcePermission() throws java.lang.SecurityException {}
        protected void resetLockoutTimeBound_enforcePermission() throws java.lang.SecurityException {}
        protected void resetLockout_enforcePermission() throws java.lang.SecurityException {}
        protected void resumeAuthentication_enforcePermission() throws java.lang.SecurityException {}
        protected void setEmbeddedContentState_enforcePermission() throws java.lang.SecurityException {}
        protected void setIdentityCheckTestStatus_enforcePermission() throws java.lang.SecurityException {}
        protected void setIsAuthenticationDelayed_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterIdentityCheckStateListener_enforcePermission() throws java.lang.SecurityException {}
        protected void updateClientReceiver_enforcePermission() throws java.lang.SecurityException {}
        protected void updateNextTranslationOffset_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.hardware.biometrics.IBiometricService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException { return 0L; }
            public int canAuthenticate(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException { return 0; }
            public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
            public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException { return null; }
            public long getCurrentAuthenticationRequestId() throws android.os.RemoteException { return 0L; }
            public int getCurrentModality(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException { return 0; }
            public int getCurrentStrength(int p0) throws android.os.RemoteException { return 0; }
            public android.os.Bundle getEmbeddedContentState(long p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public long getLastAuthenticationTime(int p0, int p1) throws android.os.RemoteException { return 0L; }
            public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getSupportedModalities(int p0) throws android.os.RemoteException { return 0; }
            public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
            public void onReadyForAuthentication(long p0, int p1) throws android.os.RemoteException {}
            public void onSurfacePackageAvailable(android.os.IBinder p0, long p1, android.view.SurfaceControlViewHost.SurfacePackage p2, int p3, int p4) throws android.os.RemoteException {}
            public void pauseAuthentication(long p0) throws android.os.RemoteException {}
            public void registerAuthenticator(int p0, int p1, int p2, android.hardware.biometrics.IBiometricAuthenticator p3) throws android.os.RemoteException {}
            public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException {}
            public void registerIdentityCheckStateListener(android.hardware.biometrics.IIdentityCheckStateListener p0) throws android.os.RemoteException {}
            public void registerSysuiEvents(android.hardware.biometrics.IBiometricSysuiEvents p0) throws android.os.RemoteException {}
            public void resetLockout(int p0, byte[] p1) throws android.os.RemoteException {}
            public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException {}
            public void resumeAuthentication(long p0) throws android.os.RemoteException {}
            public void setEmbeddedContentState(long p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void setIdentityCheckTestStatus(android.hardware.biometrics.IdentityCheckStatus p0) throws android.os.RemoteException {}
            public void setIsAuthenticationDelayed(long p0, boolean p1) throws android.os.RemoteException {}
            public void unregisterIdentityCheckStateListener(android.hardware.biometrics.IIdentityCheckStateListener p0) throws android.os.RemoteException {}
            public void updateClientReceiver(android.os.IBinder p0, android.hardware.biometrics.IBiometricServiceReceiver p1, long p2) throws android.os.RemoteException {}
            public void updateNextTranslationOffset(long p0, int p1) throws android.os.RemoteException {}
        }
    }
}
