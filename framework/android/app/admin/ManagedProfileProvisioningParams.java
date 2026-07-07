package android.app.admin;

@android.annotation.SystemApi
public final class ManagedProfileProvisioningParams implements android.os.Parcelable {
    private static final java.lang.String ACCOUNT_TO_MIGRATE_PROVIDED_PARAM = "ACCOUNT_TO_MIGRATE_PROVIDED";
    public static final android.os.Parcelable.Creator<android.app.admin.ManagedProfileProvisioningParams> CREATOR = null;
    private static final java.lang.String KEEP_MIGRATED_ACCOUNT_PARAM = "KEEP_MIGRATED_ACCOUNT";
    private static final java.lang.String LEAVE_ALL_SYSTEM_APPS_ENABLED_PARAM = "LEAVE_ALL_SYSTEM_APPS_ENABLED";
    private static final java.lang.String ORGANIZATION_OWNED_PROVISIONING_PARAM = "ORGANIZATION_OWNED_PROVISIONING";
    private final android.accounts.Account mAccountToMigrate = null;
    private final android.os.PersistableBundle mAdminExtras = null;
    private final boolean mKeepAccountOnMigration = false;
    private final boolean mLeaveAllSystemAppsEnabled = false;
    private final boolean mOrganizationOwnedProvisioning = false;
    private final java.lang.String mOwnerName = null;
    private final android.content.ComponentName mProfileAdminComponentName = null;
    private final java.lang.String mProfileName = null;
    private ManagedProfileProvisioningParams(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.accounts.Account p3, boolean p4, boolean p5, boolean p6, android.os.PersistableBundle p7) {}
    private void logParam(java.lang.String p0, java.lang.String p1, boolean p2) {}
    public int describeContents() { return 0; }
    public android.accounts.Account getAccountToMigrate() { return null; }
    public android.os.PersistableBundle getAdminExtras() { return null; }
    public java.lang.String getOwnerName() { return null; }
    public android.content.ComponentName getProfileAdminComponentName() { return null; }
    public java.lang.String getProfileName() { return null; }
    public boolean isKeepingAccountOnMigration() { return false; }
    public boolean isLeaveAllSystemAppsEnabled() { return false; }
    public boolean isOrganizationOwnedProvisioning() { return false; }
    public void logParams(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.accounts.Account mAccountToMigrate;
        private android.os.PersistableBundle mAdminExtras;
        private boolean mKeepingAccountOnMigration;
        private boolean mLeaveAllSystemAppsEnabled;
        private boolean mOrganizationOwnedProvisioning;
        private final java.lang.String mOwnerName = null;
        private final android.content.ComponentName mProfileAdminComponentName = null;
        private java.lang.String mProfileName;
        public Builder(android.content.ComponentName p0, java.lang.String p1) {}
        public android.app.admin.ManagedProfileProvisioningParams build() { return null; }
        public android.app.admin.ManagedProfileProvisioningParams.Builder setAccountToMigrate(android.accounts.Account p0) { return null; }
        public android.app.admin.ManagedProfileProvisioningParams.Builder setAdminExtras(android.os.PersistableBundle p0) { return null; }
        public android.app.admin.ManagedProfileProvisioningParams.Builder setKeepingAccountOnMigration(boolean p0) { return null; }
        public android.app.admin.ManagedProfileProvisioningParams.Builder setLeaveAllSystemAppsEnabled(boolean p0) { return null; }
        public android.app.admin.ManagedProfileProvisioningParams.Builder setOrganizationOwnedProvisioning(boolean p0) { return null; }
        public android.app.admin.ManagedProfileProvisioningParams.Builder setProfileName(java.lang.String p0) { return null; }
    }
}
