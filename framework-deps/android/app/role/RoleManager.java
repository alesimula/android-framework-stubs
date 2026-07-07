package android.app.role;

public class RoleManager {
    public RoleManager() {}
    public java.lang.String getBrowserRoleHolder(int p0) { return null; }
    public boolean setBrowserRoleHolder(java.lang.String p0, int p1) { return false; }
    public java.util.List getRoleHoldersAsUser(java.lang.String p0, android.os.UserHandle p1) { return null; }
    public boolean isRoleAvailable(java.lang.String p0) { return false; }
    public boolean isRoleHeld(java.lang.String p0) { return false; }
    public android.os.UserHandle getActiveUserForRole(java.lang.String p0) { return null; }
    public java.lang.String getEmergencyRoleHolder(int p0) { return null; }
    public void addOnRoleHoldersChangedListenerAsUser(java.util.concurrent.Executor p0, android.app.role.OnRoleHoldersChangedListener p1, android.os.UserHandle p2) {}
    public java.lang.String getSmsRoleHolder(int p0) { return null; }
    public void addRoleHolderAsUser(java.lang.String p0, java.lang.String p1, int p2, android.os.UserHandle p3, java.util.concurrent.Executor p4, java.util.function.Consumer p5) {}
}
