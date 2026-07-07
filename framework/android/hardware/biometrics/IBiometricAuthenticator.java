package android.hardware.biometrics;

public interface IBiometricAuthenticator extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.IBiometricAuthenticator";
    public void cancelAuthenticationFromService(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    public android.hardware.biometrics.ITestSession createTestSession(android.hardware.biometrics.ITestSessionCallback p0, java.lang.String p1) throws android.os.RemoteException;
    public byte[] dumpSensorServiceStateProto(boolean p0) throws android.os.RemoteException;
    public long getAuthenticatorId(int p0) throws android.os.RemoteException;
    public int getLockoutModeForUser(int p0) throws android.os.RemoteException;
    public android.hardware.biometrics.SensorPropertiesInternal getSensorProperties(java.lang.String p0) throws android.os.RemoteException;
    public boolean hasEnrolledTemplates(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void invalidateAuthenticatorId(int p0, android.hardware.biometrics.IInvalidationCallback p1) throws android.os.RemoteException;
    public boolean isHardwareDetected(java.lang.String p0) throws android.os.RemoteException;
    public void prepareForAuthentication(boolean p0, android.os.IBinder p1, long p2, int p3, android.hardware.biometrics.IBiometricSensorReceiver p4, java.lang.String p5, long p6, int p7, boolean p8, boolean p9, boolean p10) throws android.os.RemoteException;
    public void resetLockout(android.os.IBinder p0, java.lang.String p1, int p2, byte[] p3) throws android.os.RemoteException;
    public void startPreparedClient(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.IBiometricAuthenticator {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void cancelAuthenticationFromService(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
        public android.hardware.biometrics.ITestSession createTestSession(android.hardware.biometrics.ITestSessionCallback p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public byte[] dumpSensorServiceStateProto(boolean p0) throws android.os.RemoteException { return null; }
        public long getAuthenticatorId(int p0) throws android.os.RemoteException { return 0L; }
        public int getLockoutModeForUser(int p0) throws android.os.RemoteException { return 0; }
        public android.hardware.biometrics.SensorPropertiesInternal getSensorProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean hasEnrolledTemplates(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void invalidateAuthenticatorId(int p0, android.hardware.biometrics.IInvalidationCallback p1) throws android.os.RemoteException {}
        public boolean isHardwareDetected(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void prepareForAuthentication(boolean p0, android.os.IBinder p1, long p2, int p3, android.hardware.biometrics.IBiometricSensorReceiver p4, java.lang.String p5, long p6, int p7, boolean p8, boolean p9, boolean p10) throws android.os.RemoteException {}
        public void resetLockout(android.os.IBinder p0, java.lang.String p1, int p2, byte[] p3) throws android.os.RemoteException {}
        public void startPreparedClient(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.IBiometricAuthenticator {
        static final int TRANSACTION_cancelAuthenticationFromService = 6;
        static final int TRANSACTION_createTestSession = 1;
        static final int TRANSACTION_dumpSensorServiceStateProto = 3;
        static final int TRANSACTION_getAuthenticatorId = 11;
        static final int TRANSACTION_getLockoutModeForUser = 9;
        static final int TRANSACTION_getSensorProperties = 2;
        static final int TRANSACTION_hasEnrolledTemplates = 8;
        static final int TRANSACTION_invalidateAuthenticatorId = 10;
        static final int TRANSACTION_isHardwareDetected = 7;
        static final int TRANSACTION_prepareForAuthentication = 4;
        static final int TRANSACTION_resetLockout = 12;
        static final int TRANSACTION_startPreparedClient = 5;
        public Stub() { super(); }
        public static android.hardware.biometrics.IBiometricAuthenticator asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.biometrics.IBiometricAuthenticator {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void cancelAuthenticationFromService(android.os.IBinder p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
            public android.hardware.biometrics.ITestSession createTestSession(android.hardware.biometrics.ITestSessionCallback p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public byte[] dumpSensorServiceStateProto(boolean p0) throws android.os.RemoteException { return null; }
            public long getAuthenticatorId(int p0) throws android.os.RemoteException { return 0L; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getLockoutModeForUser(int p0) throws android.os.RemoteException { return 0; }
            public android.hardware.biometrics.SensorPropertiesInternal getSensorProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean hasEnrolledTemplates(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void invalidateAuthenticatorId(int p0, android.hardware.biometrics.IInvalidationCallback p1) throws android.os.RemoteException {}
            public boolean isHardwareDetected(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void prepareForAuthentication(boolean p0, android.os.IBinder p1, long p2, int p3, android.hardware.biometrics.IBiometricSensorReceiver p4, java.lang.String p5, long p6, int p7, boolean p8, boolean p9, boolean p10) throws android.os.RemoteException {}
            public void resetLockout(android.os.IBinder p0, java.lang.String p1, int p2, byte[] p3) throws android.os.RemoteException {}
            public void startPreparedClient(int p0) throws android.os.RemoteException {}
        }
    }
}
