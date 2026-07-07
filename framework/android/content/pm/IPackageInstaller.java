package android.content.pm;

public interface IPackageInstaller extends android.os.IInterface {
    public void abandonSession(int p0) throws android.os.RemoteException;
    public void addDeveloperVerificationExperiment(java.lang.String p0, int p1, int[] p2) throws android.os.RemoteException;
    public void bypassNextAllowedApexUpdateCheck(boolean p0) throws android.os.RemoteException;
    public void bypassNextStagedInstallerCheck(boolean p0) throws android.os.RemoteException;
    public void checkInstallConstraints(java.lang.String p0, java.util.List<java.lang.String> p1, android.content.pm.PackageInstaller.InstallConstraints p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public void clearDeveloperVerificationExperiment(java.lang.String p0) throws android.os.RemoteException;
    public int createSession(android.content.pm.PackageInstaller.SessionParams p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void disableVerificationForUid(int p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAllSessions(int p0) throws android.os.RemoteException;
    public int getDeveloperVerificationPolicy(int p0) throws android.os.RemoteException;
    public java.lang.String getDeveloperVerificationPolicyDelegatePackage(int p0) throws android.os.RemoteException;
    public android.content.ComponentName getDeveloperVerificationServiceProvider() throws android.os.RemoteException;
    public android.content.pm.PackageInstaller.DeveloperVerificationUserConfirmationInfo getDeveloperVerificationUserConfirmationInfo(int p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getMySessions(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.PackageInstaller.SessionInfo getSessionInfo(int p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getStagedSessions() throws android.os.RemoteException;
    public void installExistingPackage(java.lang.String p0, int p1, int p2, android.content.IntentSender p3, int p4, java.util.List<java.lang.String> p5) throws android.os.RemoteException;
    public void installPackageArchived(android.content.pm.ArchivedPackageParcel p0, android.content.pm.PackageInstaller.SessionParams p1, android.content.IntentSender p2, java.lang.String p3, android.os.UserHandle p4) throws android.os.RemoteException;
    public android.content.pm.IPackageInstallerSession openSession(int p0) throws android.os.RemoteException;
    public void registerCallback(android.content.pm.IPackageInstallerCallback p0, int p1) throws android.os.RemoteException;
    public void reportUnarchivalStatus(int p0, int p1, long p2, android.app.PendingIntent p3, android.os.UserHandle p4) throws android.os.RemoteException;
    public void requestArchive(java.lang.String p0, java.lang.String p1, int p2, android.content.IntentSender p3, android.os.UserHandle p4) throws android.os.RemoteException;
    public void requestUnarchive(java.lang.String p0, java.lang.String p1, android.content.IntentSender p2, android.os.UserHandle p3) throws android.os.RemoteException;
    public void setAllowUnlimitedSilentUpdates(java.lang.String p0) throws android.os.RemoteException;
    public boolean setDeveloperVerificationPolicy(int p0, int p1) throws android.os.RemoteException;
    public void setDeveloperVerificationUserResponse(int p0, int p1) throws android.os.RemoteException;
    public void setPermissionsResult(int p0, boolean p1) throws android.os.RemoteException;
    public void setSilentUpdatesThrottleTime(long p0) throws android.os.RemoteException;
    public void uninstall(android.content.pm.VersionedPackage p0, java.lang.String p1, int p2, android.content.IntentSender p3, int p4) throws android.os.RemoteException;
    public void uninstallExistingPackage(android.content.pm.VersionedPackage p0, java.lang.String p1, android.content.IntentSender p2, int p3) throws android.os.RemoteException;
    public void unregisterCallback(android.content.pm.IPackageInstallerCallback p0) throws android.os.RemoteException;
    public void updateSessionAppIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException;
    public void updateSessionAppLabel(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void waitForInstallConstraints(java.lang.String p0, java.util.List<java.lang.String> p1, android.content.pm.PackageInstaller.InstallConstraints p2, android.content.IntentSender p3, long p4) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IPackageInstaller {
        public Default() {}
        public void abandonSession(int p0) throws android.os.RemoteException {}
        public void addDeveloperVerificationExperiment(java.lang.String p0, int p1, int[] p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void bypassNextAllowedApexUpdateCheck(boolean p0) throws android.os.RemoteException {}
        public void bypassNextStagedInstallerCheck(boolean p0) throws android.os.RemoteException {}
        public void checkInstallConstraints(java.lang.String p0, java.util.List<java.lang.String> p1, android.content.pm.PackageInstaller.InstallConstraints p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public void clearDeveloperVerificationExperiment(java.lang.String p0) throws android.os.RemoteException {}
        public int createSession(android.content.pm.PackageInstaller.SessionParams p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
        public void disableVerificationForUid(int p0) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getAllSessions(int p0) throws android.os.RemoteException { return null; }
        public int getDeveloperVerificationPolicy(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getDeveloperVerificationPolicyDelegatePackage(int p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getDeveloperVerificationServiceProvider() throws android.os.RemoteException { return null; }
        public android.content.pm.PackageInstaller.DeveloperVerificationUserConfirmationInfo getDeveloperVerificationUserConfirmationInfo(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getMySessions(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.PackageInstaller.SessionInfo getSessionInfo(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getStagedSessions() throws android.os.RemoteException { return null; }
        public void installExistingPackage(java.lang.String p0, int p1, int p2, android.content.IntentSender p3, int p4, java.util.List<java.lang.String> p5) throws android.os.RemoteException {}
        public void installPackageArchived(android.content.pm.ArchivedPackageParcel p0, android.content.pm.PackageInstaller.SessionParams p1, android.content.IntentSender p2, java.lang.String p3, android.os.UserHandle p4) throws android.os.RemoteException {}
        public android.content.pm.IPackageInstallerSession openSession(int p0) throws android.os.RemoteException { return null; }
        public void registerCallback(android.content.pm.IPackageInstallerCallback p0, int p1) throws android.os.RemoteException {}
        public void reportUnarchivalStatus(int p0, int p1, long p2, android.app.PendingIntent p3, android.os.UserHandle p4) throws android.os.RemoteException {}
        public void requestArchive(java.lang.String p0, java.lang.String p1, int p2, android.content.IntentSender p3, android.os.UserHandle p4) throws android.os.RemoteException {}
        public void requestUnarchive(java.lang.String p0, java.lang.String p1, android.content.IntentSender p2, android.os.UserHandle p3) throws android.os.RemoteException {}
        public void setAllowUnlimitedSilentUpdates(java.lang.String p0) throws android.os.RemoteException {}
        public boolean setDeveloperVerificationPolicy(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setDeveloperVerificationUserResponse(int p0, int p1) throws android.os.RemoteException {}
        public void setPermissionsResult(int p0, boolean p1) throws android.os.RemoteException {}
        public void setSilentUpdatesThrottleTime(long p0) throws android.os.RemoteException {}
        public void uninstall(android.content.pm.VersionedPackage p0, java.lang.String p1, int p2, android.content.IntentSender p3, int p4) throws android.os.RemoteException {}
        public void uninstallExistingPackage(android.content.pm.VersionedPackage p0, java.lang.String p1, android.content.IntentSender p2, int p3) throws android.os.RemoteException {}
        public void unregisterCallback(android.content.pm.IPackageInstallerCallback p0) throws android.os.RemoteException {}
        public void updateSessionAppIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
        public void updateSessionAppLabel(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void waitForInstallConstraints(java.lang.String p0, java.util.List<java.lang.String> p1, android.content.pm.PackageInstaller.InstallConstraints p2, android.content.IntentSender p3, long p4) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageInstaller {
        public static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageInstaller";
        static final int TRANSACTION_abandonSession = 4;
        static final int TRANSACTION_addDeveloperVerificationExperiment = 33;
        static final int TRANSACTION_bypassNextAllowedApexUpdateCheck = 17;
        static final int TRANSACTION_bypassNextStagedInstallerCheck = 16;
        static final int TRANSACTION_checkInstallConstraints = 21;
        static final int TRANSACTION_clearDeveloperVerificationExperiment = 34;
        static final int TRANSACTION_createSession = 1;
        static final int TRANSACTION_disableVerificationForUid = 18;
        static final int TRANSACTION_getAllSessions = 7;
        static final int TRANSACTION_getDeveloperVerificationPolicy = 27;
        static final int TRANSACTION_getDeveloperVerificationPolicyDelegatePackage = 30;
        static final int TRANSACTION_getDeveloperVerificationServiceProvider = 29;
        static final int TRANSACTION_getDeveloperVerificationUserConfirmationInfo = 32;
        static final int TRANSACTION_getMySessions = 8;
        static final int TRANSACTION_getSessionInfo = 6;
        static final int TRANSACTION_getStagedSessions = 9;
        static final int TRANSACTION_installExistingPackage = 14;
        static final int TRANSACTION_installPackageArchived = 25;
        static final int TRANSACTION_openSession = 5;
        static final int TRANSACTION_registerCallback = 10;
        static final int TRANSACTION_reportUnarchivalStatus = 26;
        static final int TRANSACTION_requestArchive = 23;
        static final int TRANSACTION_requestUnarchive = 24;
        static final int TRANSACTION_setAllowUnlimitedSilentUpdates = 19;
        static final int TRANSACTION_setDeveloperVerificationPolicy = 28;
        static final int TRANSACTION_setDeveloperVerificationUserResponse = 31;
        static final int TRANSACTION_setPermissionsResult = 15;
        static final int TRANSACTION_setSilentUpdatesThrottleTime = 20;
        static final int TRANSACTION_uninstall = 12;
        static final int TRANSACTION_uninstallExistingPackage = 13;
        static final int TRANSACTION_unregisterCallback = 11;
        static final int TRANSACTION_updateSessionAppIcon = 2;
        static final int TRANSACTION_updateSessionAppLabel = 3;
        static final int TRANSACTION_waitForInstallConstraints = 22;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.content.pm.IPackageInstaller asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void getDeveloperVerificationPolicyDelegatePackage_enforcePermission() throws java.lang.SecurityException {}
        protected void getDeveloperVerificationUserConfirmationInfo_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setDeveloperVerificationUserResponse_enforcePermission() throws java.lang.SecurityException {}
        protected void setPermissionsResult_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.content.pm.IPackageInstaller {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void abandonSession(int p0) throws android.os.RemoteException {}
            public void addDeveloperVerificationExperiment(java.lang.String p0, int p1, int[] p2) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void bypassNextAllowedApexUpdateCheck(boolean p0) throws android.os.RemoteException {}
            public void bypassNextStagedInstallerCheck(boolean p0) throws android.os.RemoteException {}
            public void checkInstallConstraints(java.lang.String p0, java.util.List<java.lang.String> p1, android.content.pm.PackageInstaller.InstallConstraints p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
            public void clearDeveloperVerificationExperiment(java.lang.String p0) throws android.os.RemoteException {}
            public int createSession(android.content.pm.PackageInstaller.SessionParams p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
            public void disableVerificationForUid(int p0) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getAllSessions(int p0) throws android.os.RemoteException { return null; }
            public int getDeveloperVerificationPolicy(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getDeveloperVerificationPolicyDelegatePackage(int p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getDeveloperVerificationServiceProvider() throws android.os.RemoteException { return null; }
            public android.content.pm.PackageInstaller.DeveloperVerificationUserConfirmationInfo getDeveloperVerificationUserConfirmationInfo(int p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.content.pm.ParceledListSlice getMySessions(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.PackageInstaller.SessionInfo getSessionInfo(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getStagedSessions() throws android.os.RemoteException { return null; }
            public void installExistingPackage(java.lang.String p0, int p1, int p2, android.content.IntentSender p3, int p4, java.util.List<java.lang.String> p5) throws android.os.RemoteException {}
            public void installPackageArchived(android.content.pm.ArchivedPackageParcel p0, android.content.pm.PackageInstaller.SessionParams p1, android.content.IntentSender p2, java.lang.String p3, android.os.UserHandle p4) throws android.os.RemoteException {}
            public android.content.pm.IPackageInstallerSession openSession(int p0) throws android.os.RemoteException { return null; }
            public void registerCallback(android.content.pm.IPackageInstallerCallback p0, int p1) throws android.os.RemoteException {}
            public void reportUnarchivalStatus(int p0, int p1, long p2, android.app.PendingIntent p3, android.os.UserHandle p4) throws android.os.RemoteException {}
            public void requestArchive(java.lang.String p0, java.lang.String p1, int p2, android.content.IntentSender p3, android.os.UserHandle p4) throws android.os.RemoteException {}
            public void requestUnarchive(java.lang.String p0, java.lang.String p1, android.content.IntentSender p2, android.os.UserHandle p3) throws android.os.RemoteException {}
            public void setAllowUnlimitedSilentUpdates(java.lang.String p0) throws android.os.RemoteException {}
            public boolean setDeveloperVerificationPolicy(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setDeveloperVerificationUserResponse(int p0, int p1) throws android.os.RemoteException {}
            public void setPermissionsResult(int p0, boolean p1) throws android.os.RemoteException {}
            public void setSilentUpdatesThrottleTime(long p0) throws android.os.RemoteException {}
            public void uninstall(android.content.pm.VersionedPackage p0, java.lang.String p1, int p2, android.content.IntentSender p3, int p4) throws android.os.RemoteException {}
            public void uninstallExistingPackage(android.content.pm.VersionedPackage p0, java.lang.String p1, android.content.IntentSender p2, int p3) throws android.os.RemoteException {}
            public void unregisterCallback(android.content.pm.IPackageInstallerCallback p0) throws android.os.RemoteException {}
            public void updateSessionAppIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
            public void updateSessionAppLabel(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void waitForInstallConstraints(java.lang.String p0, java.util.List<java.lang.String> p1, android.content.pm.PackageInstaller.InstallConstraints p2, android.content.IntentSender p3, long p4) throws android.os.RemoteException {}
        }
    }
}
