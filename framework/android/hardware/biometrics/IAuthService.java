package android.hardware.biometrics;

public interface IAuthService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IAuthService";
    public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException;
    public int canAuthenticate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException;
    public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException;
    public java.util.List<android.hardware.biometrics.StrongSensorStrengthInternal> getBiometricSensorStrengths(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.CharSequence getButtonLabel(int p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public long getCurrentAuthenticationRequestId() throws android.os.RemoteException;
    public android.os.Bundle getEmbeddedContentState(long p0) throws android.os.RemoteException;
    public java.util.List<android.hardware.biometrics.BiometricEnrollmentStatusInternal> getEnrollmentStatusList(int p0, java.lang.String p1) throws android.os.RemoteException;
    public long getLastAuthenticationTime(int p0, int p1) throws android.os.RemoteException;
    public java.lang.CharSequence getPromptMessage(int p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.CharSequence getSettingName(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.lang.String getUiPackage() throws android.os.RemoteException;
    public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException;
    public void onSurfacePackageAvailable(android.os.IBinder p0, long p1, android.view.SurfaceControlViewHost.SurfacePackage p2, int p3, int p4) throws android.os.RemoteException;
    public void pauseAuthentication(long p0) throws android.os.RemoteException;
    public void registerAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException;
    public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException;
    public void registerIdentityCheckStateListener(android.hardware.biometrics.IIdentityCheckStateListener p0) throws android.os.RemoteException;
    public void resetLockout(int p0, byte[] p1) throws android.os.RemoteException;
    public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException;
    public void resumeAuthentication(long p0) throws android.os.RemoteException;
    public void setEmbeddedContentState(long p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void setIdentityCheckTestStatus(android.hardware.biometrics.IdentityCheckStatus p0) throws android.os.RemoteException;
    public void setIsAuthenticationDelayed(long p0, boolean p1) throws android.os.RemoteException;
    public void setLastAuthenticationTimeForTest(long p0) throws android.os.RemoteException;
    public void unregisterAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException;
    public void unregisterIdentityCheckStateListener(android.hardware.biometrics.IIdentityCheckStateListener p0) throws android.os.RemoteException;
    public void updateClientReceiver(android.os.IBinder p0, android.hardware.biometrics.IBiometricServiceReceiver p1, long p2) throws android.os.RemoteException;
    public void updateNextTranslationOffset(long p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IAuthService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException { return 0L; }
        public int canAuthenticate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException { return 0; }
        public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
        public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.biometrics.StrongSensorStrengthInternal> getBiometricSensorStrengths(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getButtonLabel(int p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public long getCurrentAuthenticationRequestId() throws android.os.RemoteException { return 0L; }
        public android.os.Bundle getEmbeddedContentState(long p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.biometrics.BiometricEnrollmentStatusInternal> getEnrollmentStatusList(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public long getLastAuthenticationTime(int p0, int p1) throws android.os.RemoteException { return 0L; }
        public java.lang.CharSequence getPromptMessage(int p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getSettingName(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public java.lang.String getUiPackage() throws android.os.RemoteException { return null; }
        public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
        public void onSurfacePackageAvailable(android.os.IBinder p0, long p1, android.view.SurfaceControlViewHost.SurfacePackage p2, int p3, int p4) throws android.os.RemoteException {}
        public void pauseAuthentication(long p0) throws android.os.RemoteException {}
        public void registerAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException {}
        public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException {}
        public void registerIdentityCheckStateListener(android.hardware.biometrics.IIdentityCheckStateListener p0) throws android.os.RemoteException {}
        public void resetLockout(int p0, byte[] p1) throws android.os.RemoteException {}
        public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException {}
        public void resumeAuthentication(long p0) throws android.os.RemoteException {}
        public void setEmbeddedContentState(long p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void setIdentityCheckTestStatus(android.hardware.biometrics.IdentityCheckStatus p0) throws android.os.RemoteException {}
        public void setIsAuthenticationDelayed(long p0, boolean p1) throws android.os.RemoteException {}
        public void setLastAuthenticationTimeForTest(long p0) throws android.os.RemoteException {}
        public void unregisterAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException {}
        public void unregisterIdentityCheckStateListener(android.hardware.biometrics.IIdentityCheckStateListener p0) throws android.os.RemoteException {}
        public void updateClientReceiver(android.os.IBinder p0, android.hardware.biometrics.IBiometricServiceReceiver p1, long p2) throws android.os.RemoteException {}
        public void updateNextTranslationOffset(long p0, int p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IAuthService {
        static final int TRANSACTION_authenticate = 6;
        static final int TRANSACTION_canAuthenticate = 10;
        static final int TRANSACTION_cancelAuthentication = 9;
        static final int TRANSACTION_createTestSession = 1;
        static final int TRANSACTION_getAuthenticatorIds = 21;
        static final int TRANSACTION_getBiometricSensorStrengths = 14;
        static final int TRANSACTION_getButtonLabel = 24;
        static final int TRANSACTION_getCurrentAuthenticationRequestId = 8;
        static final int TRANSACTION_getEmbeddedContentState = 28;
        static final int TRANSACTION_getEnrollmentStatusList = 13;
        static final int TRANSACTION_getLastAuthenticationTime = 11;
        static final int TRANSACTION_getPromptMessage = 25;
        static final int TRANSACTION_getSensorProperties = 4;
        static final int TRANSACTION_getSettingName = 26;
        static final int TRANSACTION_getUiPackage = 5;
        static final int TRANSACTION_hasEnrolledBiometrics = 12;
        static final int TRANSACTION_invalidateAuthenticatorIds = 20;
        static final int TRANSACTION_onSurfacePackageAvailable = 29;
        static final int TRANSACTION_pauseAuthentication = 30;
        static final int TRANSACTION_registerAuthenticationStateListener = 16;
        static final int TRANSACTION_registerEnabledOnKeyguardCallback = 15;
        static final int TRANSACTION_registerIdentityCheckStateListener = 18;
        static final int TRANSACTION_resetLockout = 23;
        static final int TRANSACTION_resetLockoutTimeBound = 22;
        static final int TRANSACTION_resumeAuthentication = 31;
        static final int TRANSACTION_setEmbeddedContentState = 27;
        static final int TRANSACTION_setIdentityCheckTestStatus = 2;
        static final int TRANSACTION_setIsAuthenticationDelayed = 32;
        static final int TRANSACTION_setLastAuthenticationTimeForTest = 3;
        static final int TRANSACTION_unregisterAuthenticationStateListener = 17;
        static final int TRANSACTION_unregisterIdentityCheckStateListener = 19;
        static final int TRANSACTION_updateClientReceiver = 7;
        static final int TRANSACTION_updateNextTranslationOffset = 33;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.hardware.biometrics.IAuthService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void createTestSession_enforcePermission() throws java.lang.SecurityException {}
        protected void getSensorProperties_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void getUiPackage_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setIdentityCheckTestStatus_enforcePermission() throws java.lang.SecurityException {}
        protected void setLastAuthenticationTimeForTest_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.hardware.biometrics.IAuthService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public long authenticate(android.os.IBinder p0, long p1, int p2, android.hardware.biometrics.IBiometricServiceReceiver p3, java.lang.String p4, android.hardware.biometrics.PromptInfo p5) throws android.os.RemoteException { return 0L; }
            public int canAuthenticate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException { return 0; }
            public void cancelAuthentication(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
            public android.hardware.biometrics.ITestSession createTestSession(int p0, android.hardware.biometrics.ITestSessionCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public long[] getAuthenticatorIds(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.biometrics.StrongSensorStrengthInternal> getBiometricSensorStrengths(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getButtonLabel(int p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public long getCurrentAuthenticationRequestId() throws android.os.RemoteException { return 0L; }
            public android.os.Bundle getEmbeddedContentState(long p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.biometrics.BiometricEnrollmentStatusInternal> getEnrollmentStatusList(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public long getLastAuthenticationTime(int p0, int p1) throws android.os.RemoteException { return 0L; }
            public java.lang.CharSequence getPromptMessage(int p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.biometrics.SensorPropertiesInternal> getSensorProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getSettingName(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public java.lang.String getUiPackage() throws android.os.RemoteException { return null; }
            public boolean hasEnrolledBiometrics(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) throws android.os.RemoteException {}
            public void onSurfacePackageAvailable(android.os.IBinder p0, long p1, android.view.SurfaceControlViewHost.SurfacePackage p2, int p3, int p4) throws android.os.RemoteException {}
            public void pauseAuthentication(long p0) throws android.os.RemoteException {}
            public void registerAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException {}
            public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) throws android.os.RemoteException {}
            public void registerIdentityCheckStateListener(android.hardware.biometrics.IIdentityCheckStateListener p0) throws android.os.RemoteException {}
            public void resetLockout(int p0, byte[] p1) throws android.os.RemoteException {}
            public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException {}
            public void resumeAuthentication(long p0) throws android.os.RemoteException {}
            public void setEmbeddedContentState(long p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void setIdentityCheckTestStatus(android.hardware.biometrics.IdentityCheckStatus p0) throws android.os.RemoteException {}
            public void setIsAuthenticationDelayed(long p0, boolean p1) throws android.os.RemoteException {}
            public void setLastAuthenticationTimeForTest(long p0) throws android.os.RemoteException {}
            public void unregisterAuthenticationStateListener(android.hardware.biometrics.AuthenticationStateListener p0) throws android.os.RemoteException {}
            public void unregisterIdentityCheckStateListener(android.hardware.biometrics.IIdentityCheckStateListener p0) throws android.os.RemoteException {}
            public void updateClientReceiver(android.os.IBinder p0, android.hardware.biometrics.IBiometricServiceReceiver p1, long p2) throws android.os.RemoteException {}
            public void updateNextTranslationOffset(long p0, int p1) throws android.os.RemoteException {}
        }
    }
}
