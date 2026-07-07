package android.app.admin;

public class PolicyEnforcementInfo {
    private static final java.lang.String PLATFORM_PACKAGE_NAME = "android";
    private final java.util.List<android.app.admin.EnforcingAdmin> mAllAdmins = null;
    public PolicyEnforcementInfo(java.util.List<android.app.admin.EnforcingAdmin> p0) {}
    private static boolean isDpcAdmin(android.app.admin.EnforcingAdmin p0) { return false; }
    private boolean isEnforcedAsBaseRestriction() { return false; }
    private static boolean isSupervisionAdmin(android.app.admin.EnforcingAdmin p0) { return false; }
    private static boolean isSupervisionRole(android.app.admin.EnforcingAdmin p0) { return false; }
    private static boolean isSupervisionSystemEntity(android.app.admin.EnforcingAdmin p0) { return false; }
    private static boolean isSystemAuthority(android.app.admin.EnforcingAdmin p0) { return false; }
    public java.util.List<android.app.admin.EnforcingAdmin> getAllAdmins() { return null; }
    public android.app.admin.EnforcingAdmin getMostImportantEnforcingAdmin() { return null; }
    public boolean isEnforced() { return false; }
    public boolean isEnforcedBySystem() { return false; }
    public boolean isOnlyEnforcedBySupervision() { return false; }
    public boolean isOnlyEnforcedBySupervisionSystemEntity() { return false; }
    public boolean isOnlyEnforcedBySystem() { return false; }
    public boolean shouldShowEnforcingAdminDetails() { return false; }
}
