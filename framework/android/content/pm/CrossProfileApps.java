package android.content.pm;

@android.annotation.RestrictedForEnvironment(environments="SDK Runtime", from=34)
public class CrossProfileApps {
    public static final java.lang.String ACTION_CAN_INTERACT_ACROSS_PROFILES_CHANGED = "android.content.pm.action.CAN_INTERACT_ACROSS_PROFILES_CHANGED";
    private final android.content.Context mContext = null;
    private final android.content.res.Resources mResources = null;
    private final android.content.pm.ICrossProfileApps mService = null;
    private final android.os.UserManager mUserManager = null;
    public CrossProfileApps(android.content.Context p0, android.content.pm.ICrossProfileApps p1) {}
    private java.lang.CharSequence getCallingApplicationLabel() { return null; }
    private java.lang.CharSequence getDefaultCallingApplicationLabel() { return null; }
    private java.lang.String getDefaultProfileSwitchingLabel(boolean p0, java.lang.String p1) { return null; }
    private java.lang.String getUpdatableProfileSwitchingLabelId(boolean p0) { return null; }
    private void verifyCanAccessUser(android.os.UserHandle p0) {}
    public boolean canConfigureInteractAcrossProfiles(java.lang.String p0) { return false; }
    public boolean canInteractAcrossProfiles() { return false; }
    public boolean canRequestInteractAcrossProfiles() { return false; }
    public boolean canUserAttemptToConfigureInteractAcrossProfiles(java.lang.String p0) { return false; }
    public void clearInteractAcrossProfilesAppOps() {}
    public android.content.Intent createRequestInteractAcrossProfilesIntent() { return null; }
    public android.graphics.drawable.Drawable getProfileSwitchingIconDrawable(android.os.UserHandle p0) { return null; }
    public java.lang.CharSequence getProfileSwitchingLabel(android.os.UserHandle p0) { return null; }
    public java.util.List<android.os.UserHandle> getTargetUserProfiles() { return null; }
    public boolean isManagedProfile(android.os.UserHandle p0) { return false; }
    public boolean isProfile(android.os.UserHandle p0) { return false; }
    public void resetInteractAcrossProfilesAppOps(java.util.Collection<java.lang.String> p0, java.util.Set<java.lang.String> p1) {}
    public void setInteractAcrossProfilesAppOp(java.lang.String p0, int p1) {}
    @android.annotation.SystemApi
    public void startActivity(android.content.ComponentName p0, android.os.UserHandle p1) {}
    @android.annotation.SystemApi
    public void startActivity(android.content.ComponentName p0, android.os.UserHandle p1, android.app.Activity p2, android.os.Bundle p3) {}
    public void startActivity(android.content.Intent p0, android.os.UserHandle p1, android.app.Activity p2) {}
    public void startActivity(android.content.Intent p0, android.os.UserHandle p1, android.app.Activity p2, android.os.Bundle p3) {}
    public void startMainActivity(android.content.ComponentName p0, android.os.UserHandle p1) {}
    public void startMainActivity(android.content.ComponentName p0, android.os.UserHandle p1, android.app.Activity p2, android.os.Bundle p3) {}
}
