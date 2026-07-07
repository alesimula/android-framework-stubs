package com.android.internal.app;

public class IntentForwarderActivity extends android.app.Activity {
    private static final java.util.Set<java.lang.String> ALLOWED_TEXT_MESSAGE_SCHEMES = null;
    public static final java.lang.String EXTRA_SKIP_USER_CONFIRMATION = "com.android.internal.app.EXTRA_SKIP_USER_CONFIRMATION";
    public static java.lang.String FORWARD_INTENT_TO_MANAGED_PROFILE;
    public static java.lang.String FORWARD_INTENT_TO_PARENT;
    private static final android.content.ComponentName RESOLVER_COMPONENT_NAME = null;
    public static java.lang.String TAG;
    private static final java.lang.String TEL_SCHEME = "tel";
    protected java.util.concurrent.ExecutorService mExecutorService;
    private com.android.internal.app.IntentForwarderActivity.Injector mInjector;
    private com.android.internal.logging.MetricsLogger mMetricsLogger;
    public IntentForwarderActivity() { super(); }
    private void buildAndExecute(java.util.concurrent.CompletableFuture<android.content.pm.ResolveInfo> p0, android.content.Intent p1, java.lang.String p2, android.content.Intent p3, int p4, int p5, java.lang.String p6, android.content.pm.UserInfo p7) {}
    private void buildAndExecuteForPrivateProfile(android.content.Intent p0, java.lang.String p1, android.content.Intent p2, int p3, int p4) {}
    private void buildMiniResolver(android.content.pm.ResolveInfo p0, android.content.Intent p1, int p2, java.lang.String p3, android.content.pm.PackageManager p4) {}
    public static android.content.Intent canForward(android.content.Intent p0, int p1, int p2, android.content.pm.IPackageManager p3, java.lang.String p4) { return null; }
    private static boolean canForwardInner(android.content.Intent p0, int p1, int p2, android.content.pm.IPackageManager p3, java.lang.String p4) { return false; }
    private int findSelectedProfile(java.lang.String p0) { return 0; }
    private android.graphics.drawable.Drawable getAppIcon(android.content.pm.ResolveInfo p0, android.content.Intent p1, int p2, android.content.pm.PackageManager p3) { return null; }
    private java.lang.String getForwardToPersonalMessage() { return null; }
    private java.lang.String getForwardToWorkMessage() { return null; }
    private android.content.pm.UserInfo getManagedProfile() { return null; }
    private int getOpenInWorkButtonString(android.content.Intent p0) { return 0; }
    private java.lang.String getOpenInWorkMessage(android.content.Intent p0, java.lang.CharSequence p1) { return null; }
    private android.content.pm.UserInfo getPrivateProfile() { return null; }
    private int getProfileParent() { return 0; }
    private java.lang.String getWorkTelephonyInfoSectionMessage(android.content.Intent p0) { return null; }
    private boolean isDeviceProvisioned() { return false; }
    private boolean isDialerIntent(android.content.Intent p0) { return false; }
    private boolean isIntentForwarderResolveInfo(android.content.pm.ResolveInfo p0) { return false; }
    private boolean isPrivateProfile(int p0) { return false; }
    private boolean isResolverActivityResolveInfo(android.content.pm.ResolveInfo p0) { return false; }
    private boolean isTargetResolverOrChooserActivity(android.content.pm.ActivityInfo p0) { return false; }
    private boolean isTextMessageIntent(android.content.Intent p0) { return false; }
    private boolean isViewActionIntent(android.content.Intent p0) { return false; }
    private void launchChooserActivityWithCorrectTab(android.content.Intent p0, java.lang.String p1) {}
    private void launchResolverActivityWithCorrectTab(android.content.Intent p0, java.lang.String p1, android.content.Intent p2, int p3, int p4, boolean p5) {}
    private void maybeShowDisclosure(android.content.Intent p0, android.content.pm.ResolveInfo p1, java.lang.String p2) {}
    private void maybeShowUserConsentMiniResolver(android.content.pm.ResolveInfo p0, android.content.Intent p1, android.content.pm.UserInfo p2) {}
    private void maybeShowUserConsentMiniResolverPrivate(android.content.pm.ResolveInfo p0, android.content.Intent p1, int p2) {}
    private static void sanitizeIntent(android.content.Intent p0) {}
    private void setMiniresolverPadding() {}
    private boolean shouldShowDisclosure(android.content.pm.ResolveInfo p0, android.content.Intent p1) { return false; }
    private void startActivityAsCaller(android.content.Intent p0, int p1) {}
    protected com.android.internal.app.IntentForwarderActivity.Injector createInjector() { return null; }
    protected com.android.internal.logging.MetricsLogger getMetricsLogger() { return null; }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    protected void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}

    public static interface Injector {
        public java.util.concurrent.ExecutorService getExecutorService();
        public android.content.pm.IPackageManager getIPackageManager();
        public android.content.pm.PackageManager getPackageManager();
        public android.os.UserManager getUserManager();
        public boolean isDeviceProvisioned();
        public java.util.concurrent.CompletableFuture<android.content.pm.ResolveInfo> resolveActivityAsUser(android.content.Intent p0, int p1, int p2);
        public java.util.concurrent.CompletableFuture<android.content.pm.ResolveInfo> resolveActivityAsUser(android.content.Intent p0, java.lang.String p1, int p2, int p3);
        public void showToast(java.lang.String p0, int p1);
    }

    private class InjectorImpl implements com.android.internal.app.IntentForwarderActivity.Injector {
        private InjectorImpl(com.android.internal.app.IntentForwarderActivity p0) {}
        public java.util.concurrent.ExecutorService getExecutorService() { return null; }
        public android.content.pm.IPackageManager getIPackageManager() { return null; }
        public android.content.pm.PackageManager getPackageManager() { return null; }
        public android.os.UserManager getUserManager() { return null; }
        public boolean isDeviceProvisioned() { return false; }
        public java.util.concurrent.CompletableFuture<android.content.pm.ResolveInfo> resolveActivityAsUser(android.content.Intent p0, int p1, int p2) { return null; }
        public java.util.concurrent.CompletableFuture<android.content.pm.ResolveInfo> resolveActivityAsUser(android.content.Intent p0, java.lang.String p1, int p2, int p3) { return null; }
        public void showToast(java.lang.String p0, int p1) {}
    }
}
