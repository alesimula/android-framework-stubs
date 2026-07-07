package android.content.pm;

public class PackageInstaller {
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_CONFIRM_DEVELOPER_VERIFICATION = "android.content.pm.action.CONFIRM_DEVELOPER_VERIFICATION";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_CONFIRM_INSTALL = "android.content.pm.action.CONFIRM_INSTALL";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_CONFIRM_PRE_APPROVAL = "android.content.pm.action.CONFIRM_PRE_APPROVAL";
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final java.lang.String ACTION_INSTALL_DEPENDENCY = "android.content.pm.action.INSTALL_DEPENDENCY";
    public static final java.lang.String ACTION_SESSION_COMMITTED = "android.content.pm.action.SESSION_COMMITTED";
    public static final java.lang.String ACTION_SESSION_DETAILS = "android.content.pm.action.SESSION_DETAILS";
    public static final java.lang.String ACTION_SESSION_UPDATED = "android.content.pm.action.SESSION_UPDATED";
    private static final java.lang.String ACTION_WAIT_INSTALL_CONSTRAINTS = "android.content.pm.action.WAIT_INSTALL_CONSTRAINTS";
    @android.annotation.SystemApi
    public static final int DATA_LOADER_TYPE_INCREMENTAL = 2;
    @android.annotation.SystemApi
    public static final int DATA_LOADER_TYPE_NONE = 0;
    @android.annotation.SystemApi
    public static final int DATA_LOADER_TYPE_STREAMING = 1;
    private static final int DEFAULT_CHECKSUMS = 127;
    public static final int DEVELOPER_VERIFICATION_FAILED_REASON_DEVELOPER_BLOCKED = 2;
    public static final int DEVELOPER_VERIFICATION_FAILED_REASON_NETWORK_UNAVAILABLE = 1;
    public static final int DEVELOPER_VERIFICATION_FAILED_REASON_UNKNOWN = 0;
    @android.annotation.SystemApi
    public static final int DEVELOPER_VERIFICATION_POLICY_BLOCK_FAIL_CLOSED = 3;
    @android.annotation.SystemApi
    public static final int DEVELOPER_VERIFICATION_POLICY_BLOCK_FAIL_OPEN = 1;
    @android.annotation.SystemApi
    public static final int DEVELOPER_VERIFICATION_POLICY_BLOCK_FAIL_WARN = 2;
    @android.annotation.SystemApi
    public static final int DEVELOPER_VERIFICATION_POLICY_NONE = 0;
    @android.annotation.SystemApi
    public static final int DEVELOPER_VERIFICATION_USER_RESPONSE_ABORT = 1;
    @android.annotation.SystemApi
    public static final int DEVELOPER_VERIFICATION_USER_RESPONSE_ERROR = 0;
    @android.annotation.SystemApi
    public static final int DEVELOPER_VERIFICATION_USER_RESPONSE_INSTALL_ANYWAY = 3;
    @android.annotation.SystemApi
    public static final int DEVELOPER_VERIFICATION_USER_RESPONSE_RETRY = 2;
    public static final boolean ENABLE_REVOCABLE_FD = Boolean.valueOf(false);
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CALLBACK = "android.content.pm.extra.CALLBACK";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_DATA_LOADER_TYPE = "android.content.pm.extra.DATA_LOADER_TYPE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_DELETE_FLAGS = "android.content.pm.extra.DELETE_FLAGS";
    public static final java.lang.String EXTRA_DEVELOPER_VERIFICATION_EXTENSION_RESPONSE = "android.content.pm.extra.DEVELOPER_VERIFICATION_EXTENSION_RESPONSE";
    public static final java.lang.String EXTRA_DEVELOPER_VERIFICATION_FAILURE_REASON = "android.content.pm.extra.DEVELOPER_VERIFICATION_FAILURE_REASON";
    public static final java.lang.String EXTRA_DEVELOPER_VERIFICATION_LITE_PERFORMED = "android.content.pm.extra.DEVELOPER_VERIFICATION_LITE_PERFORMED";
    public static final java.lang.String EXTRA_INSTALL_CONSTRAINTS = "android.content.pm.extra.INSTALL_CONSTRAINTS";
    public static final java.lang.String EXTRA_INSTALL_CONSTRAINTS_RESULT = "android.content.pm.extra.INSTALL_CONSTRAINTS_RESULT";
    public static final java.lang.String EXTRA_LEGACY_BUNDLE = "android.content.pm.extra.LEGACY_BUNDLE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_LEGACY_STATUS = "android.content.pm.extra.LEGACY_STATUS";
    public static final java.lang.String EXTRA_OTHER_PACKAGE_NAME = "android.content.pm.extra.OTHER_PACKAGE_NAME";
    public static final java.lang.String EXTRA_PACKAGE_NAME = "android.content.pm.extra.PACKAGE_NAME";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PACKAGE_NAMES = "android.content.pm.extra.PACKAGE_NAMES";
    public static final java.lang.String EXTRA_PRE_APPROVAL = "android.content.pm.extra.PRE_APPROVAL";
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_RESOLVED_BASE_PATH = "android.content.pm.extra.RESOLVED_BASE_PATH";
    public static final java.lang.String EXTRA_SESSION = "android.content.pm.extra.SESSION";
    public static final java.lang.String EXTRA_SESSION_ID = "android.content.pm.extra.SESSION_ID";
    public static final java.lang.String EXTRA_STATUS = "android.content.pm.extra.STATUS";
    public static final java.lang.String EXTRA_STATUS_MESSAGE = "android.content.pm.extra.STATUS_MESSAGE";
    public static final java.lang.String EXTRA_STORAGE_PATH = "android.content.pm.extra.STORAGE_PATH";
    public static final java.lang.String EXTRA_UNARCHIVE_ALL_USERS = "android.content.pm.extra.UNARCHIVE_ALL_USERS";
    public static final java.lang.String EXTRA_UNARCHIVE_ID = "android.content.pm.extra.UNARCHIVE_ID";
    public static final java.lang.String EXTRA_UNARCHIVE_PACKAGE_NAME = "android.content.pm.extra.UNARCHIVE_PACKAGE_NAME";
    public static final java.lang.String EXTRA_UNARCHIVE_STATUS = "android.content.pm.extra.UNARCHIVE_STATUS";
    public static final java.lang.String EXTRA_WARNINGS = "android.content.pm.extra.WARNINGS";
    @android.annotation.SystemApi
    public static final int LOCATION_DATA_APP = 0;
    @android.annotation.SystemApi
    public static final int LOCATION_MEDIA_DATA = 2;
    @android.annotation.SystemApi
    public static final int LOCATION_MEDIA_OBB = 1;
    public static final int PACKAGE_SOURCE_DOWNLOADED_FILE = 4;
    public static final int PACKAGE_SOURCE_LOCAL_FILE = 3;
    public static final int PACKAGE_SOURCE_OTHER = 1;
    public static final int PACKAGE_SOURCE_STORE = 2;
    public static final int PACKAGE_SOURCE_UNSPECIFIED = 0;
    @android.annotation.SystemApi
    public static final int REASON_CONFIRM_PACKAGE_CHANGE = 0;
    @android.annotation.SystemApi
    public static final int REASON_OWNERSHIP_CHANGED = 1;
    @android.annotation.SystemApi
    public static final int REASON_REMIND_OWNERSHIP = 2;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_FAILURE_ABORTED = 3;
    public static final int STATUS_FAILURE_BLOCKED = 2;
    public static final int STATUS_FAILURE_CONFLICT = 5;
    public static final int STATUS_FAILURE_INCOMPATIBLE = 7;
    public static final int STATUS_FAILURE_INVALID = 4;
    public static final int STATUS_FAILURE_STORAGE = 6;
    public static final int STATUS_FAILURE_TIMEOUT = 8;
    public static final int STATUS_PENDING_STREAMING = -2;
    public static final int STATUS_PENDING_USER_ACTION = -1;
    public static final int STATUS_SUCCESS = 0;
    private static final java.lang.String TAG = "PackageInstaller";
    public static final int UNARCHIVAL_ERROR_INSTALLER_DISABLED = 4;
    public static final int UNARCHIVAL_ERROR_INSTALLER_UNINSTALLED = 5;
    public static final int UNARCHIVAL_ERROR_INSUFFICIENT_STORAGE = 2;
    public static final int UNARCHIVAL_ERROR_NO_CONNECTIVITY = 3;
    public static final int UNARCHIVAL_ERROR_USER_ACTION_NEEDED = 1;
    public static final int UNARCHIVAL_GENERIC_ERROR = 100;
    public static final int UNARCHIVAL_OK = 0;
    public static final int UNARCHIVAL_STATUS_UNSET = -1;
    private final java.lang.String mAttributionTag = null;
    private final java.util.ArrayList<android.content.pm.PackageInstaller.SessionCallbackDelegate> mDelegates = null;
    private final android.content.pm.IPackageInstaller mInstaller = null;
    private final java.lang.String mInstallerPackageName = null;
    private final int mUserId = 0;
    public PackageInstaller(android.content.pm.IPackageInstaller p0, java.lang.String p1, java.lang.String p2, int p3) {}
    public void abandonSession(int p0) {}
    @java.lang.Deprecated
    public void addSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0) {}
    @java.lang.Deprecated
    public void addSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0, android.os.Handler p1) {}
    public void checkInstallConstraints(java.util.List<java.lang.String> p0, android.content.pm.PackageInstaller.InstallConstraints p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.content.pm.PackageInstaller.InstallConstraintsResult> p3) {}
    public void commitSessionAfterInstallConstraintsAreMet(int p0, android.content.IntentSender p1, android.content.pm.PackageInstaller.InstallConstraints p2, long p3) {}
    public int createSession(android.content.pm.PackageInstaller.SessionParams p0) throws java.io.IOException { return 0; }
    @java.lang.Deprecated
    public android.content.pm.PackageInstaller.SessionInfo getActiveStagedSession() { return null; }
    public java.util.List<android.content.pm.PackageInstaller.SessionInfo> getActiveStagedSessions() { return null; }
    public java.util.List<android.content.pm.PackageInstaller.SessionInfo> getAllSessions() { return null; }
    @android.annotation.SystemApi
    public final int getDeveloperVerificationPolicy() { return 0; }
    @android.annotation.SystemApi
    public java.lang.String getDeveloperVerificationPolicyDelegatePackage() { return null; }
    public final android.content.ComponentName getDeveloperVerificationServiceProvider() { return null; }
    @android.annotation.SystemApi
    public android.content.pm.PackageInstaller.DeveloperVerificationUserConfirmationInfo getDeveloperVerificationUserConfirmationInfo(int p0) { return null; }
    public java.util.List<android.content.pm.PackageInstaller.SessionInfo> getMySessions() { return null; }
    public android.content.pm.PackageInstaller.SessionInfo getSessionInfo(int p0) { return null; }
    public java.util.List<android.content.pm.PackageInstaller.SessionInfo> getStagedSessions() { return null; }
    public void installExistingPackage(java.lang.String p0, int p1, android.content.IntentSender p2) {}
    public void installPackageArchived(android.content.pm.ArchivedPackageInfo p0, android.content.pm.PackageInstaller.SessionParams p1, android.content.IntentSender p2) {}
    public android.content.pm.PackageInstaller.Session openSession(int p0) throws java.io.IOException { return null; }
    @android.annotation.SystemApi
    public android.content.pm.PackageInstaller.InstallInfo readInstallInfo(android.os.ParcelFileDescriptor p0, java.lang.String p1, int p2) throws android.content.pm.PackageInstaller.PackageParsingException { return null; }
    @android.annotation.SystemApi
    public android.content.pm.PackageInstaller.InstallInfo readInstallInfo(java.io.File p0, int p1) throws android.content.pm.PackageInstaller.PackageParsingException { return null; }
    public void registerSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0) {}
    public void registerSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0, android.os.Handler p1) {}
    @java.lang.Deprecated
    public void removeSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0) {}
    public void reportUnarchivalState(android.content.pm.PackageInstaller.UnarchivalState p0) throws android.content.pm.PackageManager.NameNotFoundException {}
    public void reportUnarchivalStatus(int p0, int p1, long p2, android.app.PendingIntent p3) throws android.content.pm.PackageManager.NameNotFoundException {}
    public void requestArchive(java.lang.String p0, android.content.IntentSender p1) throws android.content.pm.PackageManager.NameNotFoundException {}
    public void requestUnarchive(java.lang.String p0, android.content.IntentSender p1) throws java.io.IOException, android.content.pm.PackageManager.NameNotFoundException {}
    @android.annotation.SystemApi
    public final boolean setDeveloperVerificationPolicy(int p0) { return false; }
    @android.annotation.SystemApi
    public void setDeveloperVerificationUserResponse(int p0, int p1) {}
    @android.annotation.SystemApi
    public void setPermissionsResult(int p0, boolean p1) {}
    public void uninstall(android.content.pm.VersionedPackage p0, int p1, android.content.IntentSender p2) {}
    public void uninstall(android.content.pm.VersionedPackage p0, android.content.IntentSender p1) {}
    public void uninstall(java.lang.String p0, int p1, android.content.IntentSender p2) {}
    public void uninstall(java.lang.String p0, android.content.IntentSender p1) {}
    public void uninstallExistingPackage(java.lang.String p0, android.content.IntentSender p1) {}
    public void unregisterSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0) {}
    public void updateSessionAppIcon(int p0, android.graphics.Bitmap p1) {}
    public void updateSessionAppLabel(int p0, java.lang.CharSequence p1) {}
    public void waitForInstallConstraints(java.util.List<java.lang.String> p0, android.content.pm.PackageInstaller.InstallConstraints p1, android.content.IntentSender p2, long p3) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeveloperVerificationFailedReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeveloperVerificationPolicy {
    }

    @android.annotation.SystemApi
    public static final class DeveloperVerificationUserConfirmationInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.content.pm.PackageInstaller.DeveloperVerificationUserConfirmationInfo> CREATOR = null;
        public static final int DEVELOPER_VERIFICATION_USER_ACTION_NEEDED_REASON_DEVELOPER_BLOCKED = 2;
        public static final int DEVELOPER_VERIFICATION_USER_ACTION_NEEDED_REASON_LITE_VERIFICATION = 3;
        public static final int DEVELOPER_VERIFICATION_USER_ACTION_NEEDED_REASON_NETWORK_UNAVAILABLE = 1;
        public static final int DEVELOPER_VERIFICATION_USER_ACTION_NEEDED_REASON_UNKNOWN = 0;
        private final int mUserActionNeededReason = 0;
        private final int mVerificationPolicy = 0;
        public DeveloperVerificationUserConfirmationInfo(int p0, int p1) {}
        private DeveloperVerificationUserConfirmationInfo(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public int getUserActionNeededReason() { return 0; }
        public int getVerificationPolicy() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface UserActionNeededReason {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeveloperVerificationUserResponse {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FileLocation {
    }

    public static final class InstallConstraints implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.content.pm.PackageInstaller.InstallConstraints> CREATOR = null;
        public static final android.content.pm.PackageInstaller.InstallConstraints GENTLE_UPDATE = null;
        private final boolean mAppNotForegroundRequired = false;
        private final boolean mAppNotInteractingRequired = false;
        private final boolean mAppNotTopVisibleRequired = false;
        private final boolean mDeviceIdleRequired = false;
        private final boolean mNotInCallRequired = false;
        InstallConstraints(android.os.Parcel p0) {}
        public InstallConstraints(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4) {}
        @java.lang.Deprecated
        private void __metadata() {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public boolean isAppNotForegroundRequired() { return false; }
        public boolean isAppNotInteractingRequired() { return false; }
        public boolean isAppNotTopVisibleRequired() { return false; }
        public boolean isDeviceIdleRequired() { return false; }
        public boolean isNotInCallRequired() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private boolean mAppNotForegroundRequired;
            private boolean mAppNotInteractingRequired;
            private boolean mAppNotTopVisibleRequired;
            private boolean mDeviceIdleRequired;
            private boolean mNotInCallRequired;
            public Builder() {}
            public android.content.pm.PackageInstaller.InstallConstraints build() { return null; }
            public android.content.pm.PackageInstaller.InstallConstraints.Builder setAppNotForegroundRequired() { return null; }
            public android.content.pm.PackageInstaller.InstallConstraints.Builder setAppNotInteractingRequired() { return null; }
            public android.content.pm.PackageInstaller.InstallConstraints.Builder setAppNotTopVisibleRequired() { return null; }
            public android.content.pm.PackageInstaller.InstallConstraints.Builder setDeviceIdleRequired() { return null; }
            public android.content.pm.PackageInstaller.InstallConstraints.Builder setNotInCallRequired() { return null; }
        }
    }

    public static final class InstallConstraintsResult implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.content.pm.PackageInstaller.InstallConstraintsResult> CREATOR = null;
        private boolean mAllConstraintsSatisfied;
        InstallConstraintsResult(android.os.Parcel p0) {}
        public InstallConstraintsResult(boolean p0) {}
        @java.lang.Deprecated
        private void __metadata() {}
        public boolean areAllConstraintsSatisfied() { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @android.annotation.SystemApi
    public static class InstallInfo {
        private android.content.pm.parsing.PackageLite mPkg;
        InstallInfo(android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.PackageLite> p0) {}
        public long calculateInstalledSize(android.content.pm.PackageInstaller.SessionParams p0) throws java.io.IOException { return 0L; }
        public long calculateInstalledSize(android.content.pm.PackageInstaller.SessionParams p0, android.os.ParcelFileDescriptor p1) throws java.io.IOException { return 0L; }
        public int getInstallLocation() { return 0; }
        public java.lang.String getPackageName() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface InstallLocation {
        }
    }

    private static final class LocalIntentSender extends android.content.BroadcastReceiver {
        private final android.content.Context mContext = null;
        private final android.content.pm.IPackageInstallerSession mSession = null;
        private final int mSessionId = 0;
        private final android.content.IntentSender mStatusReceiver = null;
        LocalIntentSender(android.content.Context p0, int p1, android.content.pm.IPackageInstallerSession p2, android.content.IntentSender p3) { super(); }
        private android.content.IntentSender getIntentSender() { return null; }
        private void unregisterReceiver() {}
        public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    }

    @android.annotation.SystemApi
    public static class PackageParsingException extends java.lang.Exception {
        private final int mErrorCode = 0;
        public PackageParsingException(int p0, java.lang.String p1) { super(); }
        public int getErrorCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface PackageSourceType {
    }

    public static final class PreapprovalDetails implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.content.pm.PackageInstaller.PreapprovalDetails> CREATOR = null;
        private final android.graphics.Bitmap mIcon = null;
        private final java.lang.CharSequence mLabel = null;
        private final java.lang.String mPackageName = null;
        public PreapprovalDetails(android.graphics.Bitmap p0, java.lang.CharSequence p1, android.icu.util.ULocale p2, java.lang.String p3) {}
        PreapprovalDetails(android.os.Parcel p0) {}
        @java.lang.Deprecated
        private void __metadata() {}
        public int describeContents() { return 0; }
        public android.graphics.Bitmap getIcon() { return null; }
        public java.lang.CharSequence getLabel() { return null; }
        public android.icu.util.ULocale getLocale() { return null; }
        public java.lang.String getPackageName() { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private long mBuilderFieldsSet;
            private android.graphics.Bitmap mIcon;
            private java.lang.CharSequence mLabel;
            private java.lang.String mPackageName;
            public Builder() {}
            private void checkNotUsed() {}
            public android.content.pm.PackageInstaller.PreapprovalDetails build() { return null; }
            public android.content.pm.PackageInstaller.PreapprovalDetails.Builder setIcon(android.graphics.Bitmap p0) { return null; }
            public android.content.pm.PackageInstaller.PreapprovalDetails.Builder setLabel(java.lang.CharSequence p0) { return null; }
            public android.content.pm.PackageInstaller.PreapprovalDetails.Builder setLocale(android.icu.util.ULocale p0) { return null; }
            public android.content.pm.PackageInstaller.PreapprovalDetails.Builder setPackageName(java.lang.String p0) { return null; }
        }
    }

    public static class Session implements java.io.Closeable {
        protected final android.content.pm.IPackageInstallerSession mSession = null;
        public Session(android.content.pm.IPackageInstallerSession p0) {}
        private static java.util.List<byte[]> encodeCertificates(java.util.List<java.security.cert.Certificate> p0) throws java.security.cert.CertificateEncodingException { return null; }
        private java.io.OutputStream openWriteAppMetadata() throws java.io.IOException { return null; }
        public void abandon() {}
        public void addChildSessionId(int p0) {}
        @android.annotation.SystemApi
        public void addFile(int p0, java.lang.String p1, long p2, byte[] p3, byte[] p4) {}
        public void addProgress(float p0) {}
        public void close() {}
        public void commit(android.content.IntentSender p0) {}
        @android.annotation.SystemApi
        public void commitTransferred(android.content.IntentSender p0) {}
        public void fsync(java.io.OutputStream p0) throws java.io.IOException {}
        public android.os.PersistableBundle getAppMetadata() { return null; }
        public int[] getChildSessionIds() { return null; }
        @android.annotation.SystemApi
        public android.content.pm.DataLoaderParams getDataLoaderParams() { return null; }
        public int getInstallFlags() { return 0; }
        public java.lang.String[] getNames() throws java.io.IOException { return null; }
        public int getParentSessionId() { return 0; }
        @android.annotation.SystemApi
        public java.util.Set<java.lang.String> getPreVerifiedDomains() { return null; }
        public boolean isApplicationEnabledSettingPersistent() { return false; }
        public boolean isMultiPackage() { return false; }
        public boolean isRequestUpdateOwnership() { return false; }
        public boolean isStaged() { return false; }
        public java.io.InputStream openRead(java.lang.String p0) throws java.io.IOException { return null; }
        public java.io.OutputStream openWrite(java.lang.String p0, long p1, long p2) throws java.io.IOException { return null; }
        public void removeChildSessionId(int p0) {}
        @android.annotation.SystemApi
        public void removeFile(int p0, java.lang.String p1) {}
        public void removeSplit(java.lang.String p0) throws java.io.IOException {}
        public void requestChecksums(java.lang.String p0, int p1, java.util.List<java.security.cert.Certificate> p2, java.util.concurrent.Executor p3, android.content.pm.PackageManager.OnChecksumsReadyListener p4) throws java.security.cert.CertificateEncodingException, java.io.FileNotFoundException {}
        public void requestUserPreapproval(android.content.pm.PackageInstaller.PreapprovalDetails p0, android.content.IntentSender p1) {}
        public void setAppMetadata(android.os.PersistableBundle p0) throws java.io.IOException {}
        @java.lang.Deprecated
        public void setChecksums(java.lang.String p0, java.util.List<android.content.pm.Checksum> p1, byte[] p2) throws java.io.IOException {}
        @android.annotation.SystemApi
        public void setPreVerifiedDomains(java.util.Set<java.lang.String> p0) {}
        @java.lang.Deprecated
        public void setProgress(float p0) {}
        public void setStagingProgress(float p0) {}
        public void stageViaHardLink(java.lang.String p0) throws java.io.IOException {}
        public void transfer(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException {}
        public void write(java.lang.String p0, long p1, long p2, android.os.ParcelFileDescriptor p3) throws java.io.IOException {}
    }

    public static abstract class SessionCallback {
        public SessionCallback() {}
        public abstract void onActiveChanged(int p0, boolean p1);
        public abstract void onBadgingChanged(int p0);
        public abstract void onCreated(int p0);
        public abstract void onFinished(int p0, boolean p1);
        public abstract void onProgressChanged(int p0, float p1);
    }

    static class SessionCallbackDelegate extends android.content.pm.IPackageInstallerCallback.Stub {
        private static final int MSG_SESSION_ACTIVE_CHANGED = 3;
        private static final int MSG_SESSION_BADGING_CHANGED = 2;
        private static final int MSG_SESSION_CREATED = 1;
        private static final int MSG_SESSION_FINISHED = 5;
        private static final int MSG_SESSION_PROGRESS_CHANGED = 4;
        final android.content.pm.PackageInstaller.SessionCallback mCallback = null;
        final java.util.concurrent.Executor mExecutor = null;
        SessionCallbackDelegate(android.content.pm.PackageInstaller.SessionCallback p0, java.util.concurrent.Executor p1) { super(); }
        public void onSessionActiveChanged(int p0, boolean p1) {}
        public void onSessionBadgingChanged(int p0) {}
        public void onSessionCreated(int p0) {}
        public void onSessionFinished(int p0, boolean p1) {}
        public void onSessionProgressChanged(int p0, float p1) {}
    }

    public static class SessionInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.content.pm.PackageInstaller.SessionInfo> CREATOR = null;
        public static final int INVALID_ID = -1;
        private static final int[] NO_SESSIONS = null;
        public static final int SESSION_ACTIVATION_FAILED = 2;
        public static final int SESSION_CONFLICT = 4;
        public static final int SESSION_NO_ERROR = 0;
        public static final int SESSION_UNKNOWN_ERROR = 3;
        public static final int SESSION_VERIFICATION_FAILED = 1;
        @java.lang.Deprecated
        public static final int STAGED_SESSION_ACTIVATION_FAILED = 2;
        @java.lang.Deprecated
        public static final int STAGED_SESSION_CONFLICT = 4;
        @java.lang.Deprecated
        public static final int STAGED_SESSION_NO_ERROR = 0;
        @java.lang.Deprecated
        public static final int STAGED_SESSION_UNKNOWN = 3;
        @java.lang.Deprecated
        public static final int STAGED_SESSION_VERIFICATION_FAILED = 1;
        public boolean active;
        public android.graphics.Bitmap appIcon;
        public java.lang.CharSequence appLabel;
        public java.lang.String appPackageName;
        public boolean applicationEnabledSettingPersistent;
        public int autoRevokePermissionsMode;
        public int[] childSessionIds;
        public long createdMillis;
        public boolean forceQueryable;
        public java.lang.String[] grantedRuntimePermissions;
        public int installFlags;
        public int installLocation;
        public int installReason;
        public int installScenario;
        public java.lang.String installerAttributionTag;
        public java.lang.String installerPackageName;
        public int installerUid;
        public boolean isAutoInstallingDependenciesEnabled;
        public boolean isCommitted;
        public boolean isMultiPackage;
        public boolean isPreapprovalRequested;
        public boolean isSessionApplied;
        public boolean isSessionFailed;
        public boolean isSessionReady;
        public boolean isStaged;
        private int mSessionErrorCode;
        private java.lang.String mSessionErrorMessage;
        public int mode;
        public int originatingUid;
        public android.net.Uri originatingUri;
        public int packageSource;
        public int parentSessionId;
        public int pendingUserActionReason;
        public float progress;
        public android.net.Uri referrerUri;
        public int requireUserAction;
        public java.lang.String resolvedBaseCodePath;
        public int rollbackDataPolicy;
        public int rollbackImpactLevel;
        public long rollbackLifetimeMillis;
        public boolean sealed;
        public int sessionId;
        public long sizeBytes;
        public long updatedMillis;
        public int userId;
        public java.util.List<java.lang.String> whitelistedRestrictedPermissions;
        public SessionInfo() {}
        public SessionInfo(android.os.Parcel p0) {}
        private void checkSessionIsStaged() {}
        private static java.lang.String userActionToString(int p0) { return null; }
        public android.content.Intent createDetailsIntent() { return null; }
        public int describeContents() { return 0; }
        @android.annotation.SystemApi
        public boolean getAllocateAggressive() { return false; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public boolean getAllowDowngrade() { return false; }
        public android.graphics.Bitmap getAppIcon() { return null; }
        public java.lang.CharSequence getAppLabel() { return null; }
        public java.lang.String getAppPackageName() { return null; }
        @android.annotation.SystemApi
        public int getAutoRevokePermissionsMode() { return 0; }
        public int[] getChildSessionIds() { return null; }
        public long getCreatedMillis() { return 0L; }
        @java.lang.Deprecated
        public android.content.Intent getDetailsIntent() { return null; }
        public boolean getDontKillApp() { return false; }
        @android.annotation.SystemApi
        public boolean getEnableRollback() { return false; }
        @android.annotation.SystemApi
        public java.lang.String[] getGrantedRuntimePermissions() { return null; }
        @android.annotation.SystemApi
        public boolean getInstallAsFullApp(boolean p0) { return false; }
        @android.annotation.SystemApi
        public boolean getInstallAsInstantApp(boolean p0) { return false; }
        @android.annotation.SystemApi
        public boolean getInstallAsVirtualPreload() { return false; }
        public int getInstallLocation() { return 0; }
        public int getInstallReason() { return 0; }
        public java.lang.String getInstallerAttributionTag() { return null; }
        public java.lang.String getInstallerPackageName() { return null; }
        public int getInstallerUid() { return 0; }
        public int getMode() { return 0; }
        public int getOriginatingUid() { return 0; }
        public android.net.Uri getOriginatingUri() { return null; }
        public int getPackageSource() { return 0; }
        public int getParentSessionId() { return 0; }
        @android.annotation.SystemApi
        public int getPendingUserActionReason() { return 0; }
        public float getProgress() { return 0.0f; }
        public android.net.Uri getReferrerUri() { return null; }
        @android.annotation.SystemApi
        public boolean getRequestDowngrade() { return false; }
        public int getRequireUserAction() { return 0; }
        @android.annotation.SystemApi
        public java.lang.String getResolvedBaseApkPath() { return null; }
        @android.annotation.SystemApi
        public int getRollbackDataPolicy() { return 0; }
        public int getSessionId() { return 0; }
        public long getSize() { return 0L; }
        public int getStagedSessionErrorCode() { return 0; }
        public java.lang.String getStagedSessionErrorMessage() { return null; }
        public long getUpdatedMillis() { return 0L; }
        public android.os.UserHandle getUser() { return null; }
        @android.annotation.SystemApi
        public java.util.Set<java.lang.String> getWhitelistedRestrictedPermissions() { return null; }
        public boolean hasParentSessionId() { return false; }
        public boolean isActive() { return false; }
        public boolean isApplicationEnabledSettingPersistent() { return false; }
        @java.lang.Deprecated
        public boolean isAutoInstallDependenciesEnabled() { return false; }
        public boolean isCommitted() { return false; }
        public boolean isForceQueryable() { return false; }
        public boolean isMultiPackage() { return false; }
        @java.lang.Deprecated
        public boolean isOpen() { return false; }
        public boolean isPreApprovalRequested() { return false; }
        public boolean isRequestUpdateOwnership() { return false; }
        public boolean isSealed() { return false; }
        public boolean isStaged() { return false; }
        public boolean isStagedSessionActive() { return false; }
        public boolean isStagedSessionApplied() { return false; }
        public boolean isStagedSessionFailed() { return false; }
        public boolean isStagedSessionReady() { return false; }
        public boolean isUnarchival() { return false; }
        public void setSessionErrorCode(int p0, java.lang.String p1) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class SessionParams implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.content.pm.PackageInstaller.SessionParams> CREATOR = null;
        public static final int MAX_PACKAGE_NAME_LENGTH = 255;
        public static final int MAX_PERMISSION_STATES_SIZE = 16384;
        public static final int MAX_URI_LENGTH = 2048;
        public static final int MODE_FULL_INSTALL = 1;
        public static final int MODE_INHERIT_EXISTING = 2;
        public static final int MODE_INVALID = -1;
        public static final int PERMISSION_STATE_DEFAULT = 0;
        public static final int PERMISSION_STATE_DENIED = 2;
        public static final int PERMISSION_STATE_GRANTED = 1;
        public static final java.util.Set<java.lang.String> RESTRICTED_PERMISSIONS_ALL = null;
        public static final int UID_UNKNOWN = -1;
        public static final int USER_ACTION_NOT_REQUIRED = 2;
        public static final int USER_ACTION_REQUIRED = 1;
        public static final int USER_ACTION_UNSPECIFIED = 0;
        public java.lang.String abiOverride;
        public android.graphics.Bitmap appIcon;
        public long appIconLastModified;
        public java.lang.String appLabel;
        public java.lang.String appPackageName;
        public boolean applicationEnabledSettingPersistent;
        public int autoRevokePermissionsMode;
        public android.content.pm.DataLoaderParams dataLoaderParams;
        public int developmentInstallFlags;
        public java.lang.String dexoptCompilerFilter;
        public android.os.PersistableBundle extensionParams;
        public boolean forceQueryableOverride;
        public boolean forceVerification;
        public int installFlags;
        public int installLocation;
        public int installReason;
        public int installScenario;
        public java.lang.String installerPackageName;
        public boolean isAutoInstallDependenciesEnabled;
        public boolean isMultiPackage;
        public boolean isStaged;
        private final android.util.ArrayMap<java.lang.String, java.lang.Integer> mPermissionStates = null;
        public int mode;
        public int originatingUid;
        public android.net.Uri originatingUri;
        public int packageSource;
        public android.net.Uri referrerUri;
        public int requireUserAction;
        public long requiredInstalledVersionCode;
        public int rollbackDataPolicy;
        public int rollbackImpactLevel;
        public long rollbackLifetimeMillis;
        public long sizeBytes;
        public int unarchiveId;
        public java.lang.String volumeUuid;
        public java.util.List<java.lang.String> whitelistedRestrictedPermissions;
        public SessionParams(int p0) {}
        public SessionParams(android.os.Parcel p0) {}
        private boolean validatePermissionStates(java.util.Collection<java.lang.String> p0) { return false; }
        public boolean areHiddenOptionsSet() { return false; }
        public android.content.pm.PackageInstaller.SessionParams copy() { return null; }
        public int describeContents() { return 0; }
        public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
        public boolean getEnableRollback() { return false; }
        public java.lang.String[] getLegacyGrantedRuntimePermissions() { return null; }
        public android.util.ArrayMap<java.lang.String, java.lang.Integer> getPermissionStates() { return null; }
        @android.annotation.SystemApi
        public void setAllocateAggressive(boolean p0) {}
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public void setAllowDowngrade(boolean p0) {}
        public void setAppIcon(android.graphics.Bitmap p0) {}
        public void setAppLabel(java.lang.CharSequence p0) {}
        public void setAppPackageName(java.lang.String p0) {}
        public void setApplicationEnabledSettingPersistent() {}
        @java.lang.Deprecated
        public void setAutoInstallDependenciesEnabled(boolean p0) {}
        @java.lang.Deprecated
        public void setAutoRevokePermissionsMode(boolean p0) {}
        @android.annotation.SystemApi
        public void setDataLoaderParams(android.content.pm.DataLoaderParams p0) {}
        public void setDexoptCompilerFilter(java.lang.String p0) {}
        public void setDontKillApp(boolean p0) {}
        @android.annotation.SystemApi
        public void setEnableRollback(boolean p0) {}
        @android.annotation.SystemApi
        public void setEnableRollback(boolean p0, int p1) {}
        public void setExtensionParams(android.os.PersistableBundle p0) {}
        public void setForceQueryable() {}
        public void setForceVerification() {}
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public void setGrantedRuntimePermissions(java.lang.String[] p0) {}
        @android.annotation.SystemApi
        public void setInstallAsApex() {}
        @android.annotation.SystemApi
        public void setInstallAsInstantApp(boolean p0) {}
        @android.annotation.SystemApi
        public void setInstallAsVirtualPreload() {}
        public void setInstallFlagAllowTest() {}
        public void setInstallFlagsForcePermissionPrompt() {}
        public void setInstallLocation(int p0) {}
        public void setInstallReason(int p0) {}
        public void setInstallScenario(int p0) {}
        public void setInstallerPackageName(java.lang.String p0) {}
        public void setMultiPackage() {}
        public void setOriginatingUid(int p0) {}
        public void setOriginatingUri(android.net.Uri p0) {}
        public void setPackageSource(int p0) {}
        public android.content.pm.PackageInstaller.SessionParams setPermissionState(java.lang.String p0, int p1) { return null; }
        public void setPermissionStates(java.util.Collection<java.lang.String> p0, java.util.Collection<java.lang.String> p1) {}
        public void setReferrerUri(android.net.Uri p0) {}
        @android.annotation.SystemApi
        public void setRequestDowngrade(boolean p0) {}
        public void setRequestUpdateOwnership(boolean p0) {}
        public void setRequireUserAction(int p0) {}
        public void setRequiredInstalledVersionCode(long p0) {}
        @android.annotation.SystemApi
        public void setRollbackImpactLevel(int p0) {}
        @android.annotation.SystemApi
        public void setRollbackLifetimeMillis(long p0) {}
        public void setSize(long p0) {}
        @android.annotation.SystemApi
        public void setStaged() {}
        public void setUnarchiveId(int p0) {}
        public void setWhitelistedRestrictedPermissions(java.util.Set<java.lang.String> p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PermissionState {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface UserActionRequirement {
        }
    }

    public static final class UnarchivalState {
        private final long mRequiredStorageBytes = 0L;
        private final int mStatus = 0;
        private final int mUnarchiveId = 0;
        private final android.app.PendingIntent mUserActionIntent = null;
        private UnarchivalState(int p0, int p1, long p2, android.app.PendingIntent p3) {}
        public static android.content.pm.PackageInstaller.UnarchivalState createGenericErrorState(int p0) { return null; }
        public static android.content.pm.PackageInstaller.UnarchivalState createInsufficientStorageState(int p0, long p1, android.app.PendingIntent p2) { return null; }
        public static android.content.pm.PackageInstaller.UnarchivalState createNoConnectivityState(int p0) { return null; }
        public static android.content.pm.PackageInstaller.UnarchivalState createOkState(int p0) { return null; }
        public static android.content.pm.PackageInstaller.UnarchivalState createUserActionRequiredState(int p0, android.app.PendingIntent p1) { return null; }
        long getRequiredStorageBytes() { return 0L; }
        int getStatus() { return 0; }
        int getUnarchiveId() { return 0; }
        android.app.PendingIntent getUserActionIntent() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UnarchivalStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserActionReason {
    }
}
