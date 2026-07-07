package android.app.supervision;

@android.annotation.SystemApi
public class SupervisionManager {
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_CONFIRM_SUPERVISION_APPROVAL = "android.app.supervision.action.CONFIRM_SUPERVISION_APPROVAL";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_DISABLE_SUPERVISION = "android.app.supervision.action.DISABLE_SUPERVISION";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_ENABLE_SUPERVISION = "android.app.supervision.action.ENABLE_SUPERVISION";
    private static final java.lang.String GET_POLICIES_API = "get_supervision_policies";
    private static final java.lang.String GET_POLICIES_CACHE_NAME = "SupervisionManagerPolicies";
    private static final int GET_POLICIES_CACHE_SIZE = 8;
    public static final java.lang.String SUPERVISION_SYSTEM_ENTITY = null;
    private static final android.os.IpcDataCache.Config sSupervisionManagerCache = null;
    private final android.content.Context mContext = null;
    private final android.os.IpcDataCache<java.lang.Integer, java.util.List<android.app.supervision.Policy>> mGetPoliciesCache = null;
    private final android.app.supervision.ISupervisionManager mService = null;
    public SupervisionManager(android.content.Context p0, android.app.supervision.ISupervisionManager p1) {}
    public static void invalidateGetPoliciesCache() {}
    @android.annotation.SystemApi
    public android.content.Intent createConfirmSupervisionCredentialsIntent() { return null; }
    @java.lang.Deprecated
    public java.lang.String getActiveSupervisionAppPackage() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.app.supervision.Policy> getPolicies() { return null; }
    public android.app.supervision.SupervisionRecoveryInfo getSupervisionRecoveryInfo() { return null; }
    public boolean hasSupervisionCredentials() { return false; }
    @android.annotation.SystemApi
    public boolean isSupervisionEnabled() { return false; }
    public boolean isSupervisionEnabledForUser(int p0) { return false; }
    public void registerSupervisionListener(android.app.supervision.SupervisionManager.SupervisionListener p0) {}
    public void registerSupervisionListenerForUser(int p0, android.app.supervision.SupervisionManager.SupervisionListener p1) {}
    @android.annotation.SystemApi
    public void setPolicy(android.app.supervision.Policy p0) {}
    public void setShouldAllowBypassingSupervisionRoleQualification(boolean p0) {}
    public void setSupervisionEnabled(boolean p0) {}
    public void setSupervisionEnabledForUser(int p0, boolean p1) {}
    public void setSupervisionRecoveryInfo(android.app.supervision.SupervisionRecoveryInfo p0) {}
    @android.annotation.SystemApi
    public boolean shouldAllowBypassingSupervisionRoleQualification() { return false; }
    public void unregisterSupervisionListener(android.app.supervision.SupervisionManager.SupervisionListener p0) {}

    public static abstract class SupervisionListener {
        protected final android.app.supervision.ISupervisionListener mListener = null;
        public SupervisionListener() {}
        public void onPolicyChanged(android.app.supervision.Policy p0) {}
        public void onSupervisionDisabled(int p0) {}
        public void onSupervisionEnabled(int p0) {}
    }
}
