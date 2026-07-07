package com.android.internal.compat;

public interface IPlatformCompat extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.compat.IPlatformCompat";
    public boolean clearOverride(long p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean clearOverrideForTest(long p0, java.lang.String p1) throws android.os.RemoteException;
    public void clearOverrides(java.lang.String p0) throws android.os.RemoteException;
    public void clearOverridesForTest(java.lang.String p0) throws android.os.RemoteException;
    public int disableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int enableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException;
    public com.android.internal.compat.CompatibilityChangeConfig getAppConfig(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException;
    public com.android.internal.compat.IOverrideValidator getOverrideValidator() throws android.os.RemoteException;
    public boolean isChangeEnabled(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException;
    public boolean isChangeEnabledByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean isChangeEnabledByUid(long p0, int p1) throws android.os.RemoteException;
    public boolean isLogChangeChecksToStatsd() throws android.os.RemoteException;
    public com.android.internal.compat.CompatibilityChangeInfo[] listAllChanges() throws android.os.RemoteException;
    public com.android.internal.compat.CompatibilityChangeInfo[] listUIChanges() throws android.os.RemoteException;
    public void putAllOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesByPackageConfig p0) throws android.os.RemoteException;
    public void putOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverrideConfig p0, java.lang.String p1) throws android.os.RemoteException;
    public void removeAllOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesToRemoveByPackageConfig p0) throws android.os.RemoteException;
    public void removeOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesToRemoveConfig p0, java.lang.String p1) throws android.os.RemoteException;
    public void reportChange(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException;
    public void reportChangeByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void reportChangeByUid(long p0, int p1) throws android.os.RemoteException;
    public void setLogChangeChecksToStatsd(boolean p0) throws android.os.RemoteException;
    public void setOverrides(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException;
    public void setOverridesForTest(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.compat.IPlatformCompat {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public boolean clearOverride(long p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean clearOverrideForTest(long p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void clearOverrides(java.lang.String p0) throws android.os.RemoteException {}
        public void clearOverridesForTest(java.lang.String p0) throws android.os.RemoteException {}
        public int disableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int enableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public com.android.internal.compat.CompatibilityChangeConfig getAppConfig(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException { return null; }
        public com.android.internal.compat.IOverrideValidator getOverrideValidator() throws android.os.RemoteException { return null; }
        public boolean isChangeEnabled(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException { return false; }
        public boolean isChangeEnabledByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isChangeEnabledByUid(long p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isLogChangeChecksToStatsd() throws android.os.RemoteException { return false; }
        public com.android.internal.compat.CompatibilityChangeInfo[] listAllChanges() throws android.os.RemoteException { return null; }
        public com.android.internal.compat.CompatibilityChangeInfo[] listUIChanges() throws android.os.RemoteException { return null; }
        public void putAllOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesByPackageConfig p0) throws android.os.RemoteException {}
        public void putOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverrideConfig p0, java.lang.String p1) throws android.os.RemoteException {}
        public void removeAllOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesToRemoveByPackageConfig p0) throws android.os.RemoteException {}
        public void removeOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesToRemoveConfig p0, java.lang.String p1) throws android.os.RemoteException {}
        public void reportChange(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException {}
        public void reportChangeByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void reportChangeByUid(long p0, int p1) throws android.os.RemoteException {}
        public void setLogChangeChecksToStatsd(boolean p0) throws android.os.RemoteException {}
        public void setOverrides(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setOverridesForTest(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.compat.IPlatformCompat {
        static final java.lang.String[] PERMISSIONS_getAppConfig = null;
        static final java.lang.String[] PERMISSIONS_isChangeEnabled = null;
        static final java.lang.String[] PERMISSIONS_isChangeEnabledByPackageName = null;
        static final java.lang.String[] PERMISSIONS_isChangeEnabledByUid = null;
        static final int TRANSACTION_clearOverride = 11;
        static final int TRANSACTION_clearOverrideForTest = 12;
        static final int TRANSACTION_clearOverrides = 17;
        static final int TRANSACTION_clearOverridesForTest = 18;
        static final int TRANSACTION_disableTargetSdkChanges = 16;
        static final int TRANSACTION_enableTargetSdkChanges = 15;
        static final int TRANSACTION_getAppConfig = 19;
        static final int TRANSACTION_getOverrideValidator = 22;
        static final int TRANSACTION_isChangeEnabled = 4;
        static final int TRANSACTION_isChangeEnabledByPackageName = 5;
        static final int TRANSACTION_isChangeEnabledByUid = 6;
        static final int TRANSACTION_isLogChangeChecksToStatsd = 23;
        static final int TRANSACTION_listAllChanges = 20;
        static final int TRANSACTION_listUIChanges = 21;
        static final int TRANSACTION_putAllOverridesOnReleaseBuilds = 8;
        static final int TRANSACTION_putOverridesOnReleaseBuilds = 9;
        static final int TRANSACTION_removeAllOverridesOnReleaseBuilds = 13;
        static final int TRANSACTION_removeOverridesOnReleaseBuilds = 14;
        static final int TRANSACTION_reportChange = 1;
        static final int TRANSACTION_reportChangeByPackageName = 2;
        static final int TRANSACTION_reportChangeByUid = 3;
        static final int TRANSACTION_setLogChangeChecksToStatsd = 24;
        static final int TRANSACTION_setOverrides = 7;
        static final int TRANSACTION_setOverridesForTest = 10;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static com.android.internal.compat.IPlatformCompat asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void clearOverrideForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void clearOverride_enforcePermission() throws java.lang.SecurityException {}
        protected void clearOverridesForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void clearOverrides_enforcePermission() throws java.lang.SecurityException {}
        protected void disableTargetSdkChanges_enforcePermission() throws java.lang.SecurityException {}
        protected void enableTargetSdkChanges_enforcePermission() throws java.lang.SecurityException {}
        protected void getAppConfig_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void isChangeEnabledByPackageName_enforcePermission() throws java.lang.SecurityException {}
        protected void isChangeEnabledByUid_enforcePermission() throws java.lang.SecurityException {}
        protected void isChangeEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void listAllChanges_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void putAllOverridesOnReleaseBuilds_enforcePermission() throws java.lang.SecurityException {}
        protected void putOverridesOnReleaseBuilds_enforcePermission() throws java.lang.SecurityException {}
        protected void removeAllOverridesOnReleaseBuilds_enforcePermission() throws java.lang.SecurityException {}
        protected void removeOverridesOnReleaseBuilds_enforcePermission() throws java.lang.SecurityException {}
        protected void reportChangeByPackageName_enforcePermission() throws java.lang.SecurityException {}
        protected void reportChangeByUid_enforcePermission() throws java.lang.SecurityException {}
        protected void reportChange_enforcePermission() throws java.lang.SecurityException {}
        protected void setOverridesForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void setOverrides_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements com.android.internal.compat.IPlatformCompat {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public boolean clearOverride(long p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean clearOverrideForTest(long p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void clearOverrides(java.lang.String p0) throws android.os.RemoteException {}
            public void clearOverridesForTest(java.lang.String p0) throws android.os.RemoteException {}
            public int disableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int enableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public com.android.internal.compat.CompatibilityChangeConfig getAppConfig(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public com.android.internal.compat.IOverrideValidator getOverrideValidator() throws android.os.RemoteException { return null; }
            public boolean isChangeEnabled(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException { return false; }
            public boolean isChangeEnabledByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isChangeEnabledByUid(long p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isLogChangeChecksToStatsd() throws android.os.RemoteException { return false; }
            public com.android.internal.compat.CompatibilityChangeInfo[] listAllChanges() throws android.os.RemoteException { return null; }
            public com.android.internal.compat.CompatibilityChangeInfo[] listUIChanges() throws android.os.RemoteException { return null; }
            public void putAllOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesByPackageConfig p0) throws android.os.RemoteException {}
            public void putOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverrideConfig p0, java.lang.String p1) throws android.os.RemoteException {}
            public void removeAllOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesToRemoveByPackageConfig p0) throws android.os.RemoteException {}
            public void removeOverridesOnReleaseBuilds(com.android.internal.compat.CompatibilityOverridesToRemoveConfig p0, java.lang.String p1) throws android.os.RemoteException {}
            public void reportChange(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException {}
            public void reportChangeByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void reportChangeByUid(long p0, int p1) throws android.os.RemoteException {}
            public void setLogChangeChecksToStatsd(boolean p0) throws android.os.RemoteException {}
            public void setOverrides(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setOverridesForTest(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
