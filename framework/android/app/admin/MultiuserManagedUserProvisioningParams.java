package android.app.admin;

@android.annotation.SystemApi
public final class MultiuserManagedUserProvisioningParams {
    private static final java.lang.String LEAVE_ALL_SYSTEM_APPS_ENABLED_PARAM = "LEAVE_ALL_SYSTEM_APPS_ENABLED";
    private final android.app.admin.MultiuserManagedUserProvisioningParamsTransport mTransport = null;
    public MultiuserManagedUserProvisioningParams(android.app.admin.MultiuserManagedUserProvisioningParamsTransport p0) {}
    private void logParam(java.lang.String p0, java.lang.String p1, boolean p2) {}
    public android.content.ComponentName getProfileAdminComponentName() { return null; }
    public android.app.admin.MultiuserManagedUserProvisioningParamsTransport getTransportParams() { return null; }
    public boolean isLeaveAllSystemAppsEnabled() { return false; }
    public void logParams(java.lang.String p0) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private final android.app.admin.MultiuserManagedUserProvisioningParamsTransport mTransport = null;
        public Builder(android.content.ComponentName p0) {}
        public android.app.admin.MultiuserManagedUserProvisioningParams build() { return null; }
        public android.app.admin.MultiuserManagedUserProvisioningParams.Builder setLeaveAllSystemAppsEnabled(boolean p0) { return null; }
    }
}
