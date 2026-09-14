package android.security.authenticationpolicy;

public interface IAuthenticationPolicyService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.authenticationpolicy.IAuthenticationPolicyService";
    public void applyRestoredPayload(byte[] p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public void cancelWatchRangingForRequestId(long p0) throws android.os.RemoteException;
    public void createCrossDeviceAuthenticationRequestForCaller(android.os.ParcelUuid p0, android.security.authenticationpolicy.ICreateCrossDeviceAuthenticationCallback p1) throws android.os.RemoteException;
    public void createTestCrossDeviceAuthenticationRequest(android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo p0, android.companion.DeviceId p1, boolean p2, android.security.authenticationpolicy.ICreateCrossDeviceAuthenticationCallback p3) throws android.os.RemoteException;
    public int disableSecureLockDevice(android.os.UserHandle p0, android.security.authenticationpolicy.DisableSecureLockDeviceParams p1) throws android.os.RemoteException;
    public int enableSecureLockDevice(android.os.UserHandle p0, android.security.authenticationpolicy.EnableSecureLockDeviceParams p1) throws android.os.RemoteException;
    public byte[] getBackupPayload(android.os.UserHandle p0) throws android.os.RemoteException;
    public int getCrossDeviceLastStrongAuthenticationIntervalMinutes(android.os.UserHandle p0) throws android.os.RemoteException;
    public int getCrossDeviceMessageValidityIntervalMinutes(android.os.UserHandle p0) throws android.os.RemoteException;
    public int getSecureLockDeviceAvailability(android.os.UserHandle p0) throws android.os.RemoteException;
    public boolean isSecureLockDeviceEnabled() throws android.os.RemoteException;
    public void isWatchRangingAvailable(android.proximity.IProximityResultCallback p0) throws android.os.RemoteException;
    public void parseCrossDeviceAuthenticationRequest(byte[] p0, java.lang.String p1, android.security.authenticationpolicy.IParseCrossDeviceAuthenticationCallback p2) throws android.os.RemoteException;
    public void registerSecureLockDeviceStatusListener(android.os.UserHandle p0, android.security.authenticationpolicy.ISecureLockDeviceStatusListener p1) throws android.os.RemoteException;
    public void setCrossDeviceLastStrongAuthenticationIntervalMinutes(android.os.UserHandle p0, int p1) throws android.os.RemoteException;
    public void setCrossDeviceMessageValidityIntervalMinutes(android.os.UserHandle p0, int p1) throws android.os.RemoteException;
    public void setSecureLockDeviceTestStatus(boolean p0) throws android.os.RemoteException;
    public void startWatchRangingForIdentityCheck(long p0, android.proximity.IProximityResultCallback p1) throws android.os.RemoteException;
    public void unregisterSecureLockDeviceStatusListener(android.security.authenticationpolicy.ISecureLockDeviceStatusListener p0) throws android.os.RemoteException;

    public static class Default implements android.security.authenticationpolicy.IAuthenticationPolicyService {
        public Default() {}
        public void applyRestoredPayload(byte[] p0, android.os.UserHandle p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void cancelWatchRangingForRequestId(long p0) throws android.os.RemoteException {}
        public void createCrossDeviceAuthenticationRequestForCaller(android.os.ParcelUuid p0, android.security.authenticationpolicy.ICreateCrossDeviceAuthenticationCallback p1) throws android.os.RemoteException {}
        public void createTestCrossDeviceAuthenticationRequest(android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo p0, android.companion.DeviceId p1, boolean p2, android.security.authenticationpolicy.ICreateCrossDeviceAuthenticationCallback p3) throws android.os.RemoteException {}
        public int disableSecureLockDevice(android.os.UserHandle p0, android.security.authenticationpolicy.DisableSecureLockDeviceParams p1) throws android.os.RemoteException { return 0; }
        public int enableSecureLockDevice(android.os.UserHandle p0, android.security.authenticationpolicy.EnableSecureLockDeviceParams p1) throws android.os.RemoteException { return 0; }
        public byte[] getBackupPayload(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
        public int getCrossDeviceLastStrongAuthenticationIntervalMinutes(android.os.UserHandle p0) throws android.os.RemoteException { return 0; }
        public int getCrossDeviceMessageValidityIntervalMinutes(android.os.UserHandle p0) throws android.os.RemoteException { return 0; }
        public int getSecureLockDeviceAvailability(android.os.UserHandle p0) throws android.os.RemoteException { return 0; }
        public boolean isSecureLockDeviceEnabled() throws android.os.RemoteException { return false; }
        public void isWatchRangingAvailable(android.proximity.IProximityResultCallback p0) throws android.os.RemoteException {}
        public void parseCrossDeviceAuthenticationRequest(byte[] p0, java.lang.String p1, android.security.authenticationpolicy.IParseCrossDeviceAuthenticationCallback p2) throws android.os.RemoteException {}
        public void registerSecureLockDeviceStatusListener(android.os.UserHandle p0, android.security.authenticationpolicy.ISecureLockDeviceStatusListener p1) throws android.os.RemoteException {}
        public void setCrossDeviceLastStrongAuthenticationIntervalMinutes(android.os.UserHandle p0, int p1) throws android.os.RemoteException {}
        public void setCrossDeviceMessageValidityIntervalMinutes(android.os.UserHandle p0, int p1) throws android.os.RemoteException {}
        public void setSecureLockDeviceTestStatus(boolean p0) throws android.os.RemoteException {}
        public void startWatchRangingForIdentityCheck(long p0, android.proximity.IProximityResultCallback p1) throws android.os.RemoteException {}
        public void unregisterSecureLockDeviceStatusListener(android.security.authenticationpolicy.ISecureLockDeviceStatusListener p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.security.authenticationpolicy.IAuthenticationPolicyService {
        static final java.lang.String[] PERMISSIONS_createTestCrossDeviceAuthenticationRequest = null;
        static final int TRANSACTION_applyRestoredPayload = 19;
        static final int TRANSACTION_cancelWatchRangingForRequestId = 9;
        static final int TRANSACTION_createCrossDeviceAuthenticationRequestForCaller = 11;
        static final int TRANSACTION_createTestCrossDeviceAuthenticationRequest = 13;
        static final int TRANSACTION_disableSecureLockDevice = 2;
        static final int TRANSACTION_enableSecureLockDevice = 1;
        static final int TRANSACTION_getBackupPayload = 18;
        static final int TRANSACTION_getCrossDeviceLastStrongAuthenticationIntervalMinutes = 17;
        static final int TRANSACTION_getCrossDeviceMessageValidityIntervalMinutes = 15;
        static final int TRANSACTION_getSecureLockDeviceAvailability = 3;
        static final int TRANSACTION_isSecureLockDeviceEnabled = 4;
        static final int TRANSACTION_isWatchRangingAvailable = 10;
        static final int TRANSACTION_parseCrossDeviceAuthenticationRequest = 12;
        static final int TRANSACTION_registerSecureLockDeviceStatusListener = 5;
        static final int TRANSACTION_setCrossDeviceLastStrongAuthenticationIntervalMinutes = 16;
        static final int TRANSACTION_setCrossDeviceMessageValidityIntervalMinutes = 14;
        static final int TRANSACTION_setSecureLockDeviceTestStatus = 7;
        static final int TRANSACTION_startWatchRangingForIdentityCheck = 8;
        static final int TRANSACTION_unregisterSecureLockDeviceStatusListener = 6;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.security.authenticationpolicy.IAuthenticationPolicyService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void applyRestoredPayload_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        protected void cancelWatchRangingForRequestId_enforcePermission() throws java.lang.SecurityException {}
        protected void createTestCrossDeviceAuthenticationRequest_enforcePermission() throws java.lang.SecurityException {}
        protected void disableSecureLockDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void enableSecureLockDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void getBackupPayload_enforcePermission() throws java.lang.SecurityException {}
        protected void getCrossDeviceLastStrongAuthenticationIntervalMinutes_enforcePermission() throws java.lang.SecurityException {}
        protected void getCrossDeviceMessageValidityIntervalMinutes_enforcePermission() throws java.lang.SecurityException {}
        protected void getSecureLockDeviceAvailability_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void isSecureLockDeviceEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void isWatchRangingAvailable_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void parseCrossDeviceAuthenticationRequest_enforcePermission() throws java.lang.SecurityException {}
        protected void registerSecureLockDeviceStatusListener_enforcePermission() throws java.lang.SecurityException {}
        protected void setCrossDeviceLastStrongAuthenticationIntervalMinutes_enforcePermission() throws java.lang.SecurityException {}
        protected void setCrossDeviceMessageValidityIntervalMinutes_enforcePermission() throws java.lang.SecurityException {}
        protected void setSecureLockDeviceTestStatus_enforcePermission() throws java.lang.SecurityException {}
        protected void startWatchRangingForIdentityCheck_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterSecureLockDeviceStatusListener_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.security.authenticationpolicy.IAuthenticationPolicyService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void applyRestoredPayload(byte[] p0, android.os.UserHandle p1) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void cancelWatchRangingForRequestId(long p0) throws android.os.RemoteException {}
            public void createCrossDeviceAuthenticationRequestForCaller(android.os.ParcelUuid p0, android.security.authenticationpolicy.ICreateCrossDeviceAuthenticationCallback p1) throws android.os.RemoteException {}
            public void createTestCrossDeviceAuthenticationRequest(android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo p0, android.companion.DeviceId p1, boolean p2, android.security.authenticationpolicy.ICreateCrossDeviceAuthenticationCallback p3) throws android.os.RemoteException {}
            public int disableSecureLockDevice(android.os.UserHandle p0, android.security.authenticationpolicy.DisableSecureLockDeviceParams p1) throws android.os.RemoteException { return 0; }
            public int enableSecureLockDevice(android.os.UserHandle p0, android.security.authenticationpolicy.EnableSecureLockDeviceParams p1) throws android.os.RemoteException { return 0; }
            public byte[] getBackupPayload(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
            public int getCrossDeviceLastStrongAuthenticationIntervalMinutes(android.os.UserHandle p0) throws android.os.RemoteException { return 0; }
            public int getCrossDeviceMessageValidityIntervalMinutes(android.os.UserHandle p0) throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getSecureLockDeviceAvailability(android.os.UserHandle p0) throws android.os.RemoteException { return 0; }
            public boolean isSecureLockDeviceEnabled() throws android.os.RemoteException { return false; }
            public void isWatchRangingAvailable(android.proximity.IProximityResultCallback p0) throws android.os.RemoteException {}
            public void parseCrossDeviceAuthenticationRequest(byte[] p0, java.lang.String p1, android.security.authenticationpolicy.IParseCrossDeviceAuthenticationCallback p2) throws android.os.RemoteException {}
            public void registerSecureLockDeviceStatusListener(android.os.UserHandle p0, android.security.authenticationpolicy.ISecureLockDeviceStatusListener p1) throws android.os.RemoteException {}
            public void setCrossDeviceLastStrongAuthenticationIntervalMinutes(android.os.UserHandle p0, int p1) throws android.os.RemoteException {}
            public void setCrossDeviceMessageValidityIntervalMinutes(android.os.UserHandle p0, int p1) throws android.os.RemoteException {}
            public void setSecureLockDeviceTestStatus(boolean p0) throws android.os.RemoteException {}
            public void startWatchRangingForIdentityCheck(long p0, android.proximity.IProximityResultCallback p1) throws android.os.RemoteException {}
            public void unregisterSecureLockDeviceStatusListener(android.security.authenticationpolicy.ISecureLockDeviceStatusListener p0) throws android.os.RemoteException {}
        }
    }
}
