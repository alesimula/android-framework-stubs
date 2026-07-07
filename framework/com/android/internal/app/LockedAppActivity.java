package com.android.internal.app;

public final class LockedAppActivity extends android.app.Activity {
    private static final boolean DEBUG = Boolean.valueOf(false);
    public static final java.lang.String EXTRA_ACTIVITY_MODE = "com.android.internal.app.extra.ACTIVITY_MODE";
    public static final java.lang.String EXTRA_STATUS_RECEIVER = "com.android.internal.app.extra.STATUS_RECEIVER";
    public static final java.lang.String EXTRA_UNINSTALL_FLAGS = "com.android.internal.app.extra.UNINSTALL_FLAGS";
    public static final java.lang.String EXTRA_VERSIONED_PACKAGE = "com.android.internal.app.extra.VERSIONED_PACKAGE";
    private static final java.lang.String SYSTEM_PACKAGE_NAME = "android";
    private static final java.lang.String TAG = "LockedAppActivity";
    private static com.android.internal.app.LockedAppActivity.Injector sInjector;
    private com.android.internal.app.LockedAppActivity.ActivityMode mActivityMode;
    private final android.app.AppLockInternal mAppLockInternal = null;
    private final android.hardware.biometrics.BiometricPrompt.AuthenticationCallback mAuthenticationCallback = null;
    private android.os.CancellationSignal mCancellationSignal;
    private final com.android.internal.app.LockedAppActivity.Injector mInjector = null;
    private boolean mIsAuthFlowActive;
    private boolean mIsPackageUnlocked;
    private boolean mIsPromptPending;
    private final android.window.OnBackInvokedCallback mOnBackInvokedCallback = null;
    private java.lang.CharSequence mPackageLabel;
    private com.android.internal.app.LockedAppActivity.AppLockLockedStateListener mPackageLockedStateListener;
    private android.graphics.Bitmap mPackageLogo;
    private java.lang.String mPackageName;
    private android.content.IntentSender mTarget;
    private final java.util.concurrent.atomic.AtomicBoolean mTargetIntentSent = null;
    private int mUninstallFlags;
    private android.content.IntentSender mUninstallStatusReceiver;
    private android.content.pm.VersionedPackage mUninstallVersionedPackage;
    private int mUserId;
    public LockedAppActivity() { super(); }
    private void applyTheme() {}
    private void completeUnlockAndFinish() {}
    public static android.graphics.Bitmap convertDrawableToBitmap(android.graphics.drawable.Drawable p0) { return null; }
    public static android.content.Intent createClearStorageAuthIntent(java.lang.String p0, int p1) { return null; }
    public static android.content.Intent createLockedAppActivityIntent(java.lang.String p0, int p1, android.content.IntentSender p2) { return null; }
    public static android.content.Intent createLockedAppActivityUninstallIntent(android.content.pm.VersionedPackage p0, int p1, int p2, android.content.IntentSender p3) { return null; }
    private boolean finishIfUnlocked(java.lang.String p0, int p1) { return false; }
    private java.lang.CharSequence getPackageLabel(java.lang.String p0) { return null; }
    private android.graphics.drawable.Drawable getPackageLogo(java.lang.String p0) { return null; }
    private void initStateFromIntent() {}
    private boolean isClearStorageMode() { return false; }
    private boolean isInterceptMode() { return false; }
    private boolean isLockedTaskMode() { return false; }
    private boolean isOneShotAuthMode() { return false; }
    private boolean isUninstallMode() { return false; }
    private void maybeShowBiometricPromptForLockedTask() {}
    private void onKeyguardDismissFailed(java.lang.String p0) {}
    private void requestShowBiometricPromptForLockedTask() {}
    private void sendUninstallFailure(int p0, java.lang.String p1) {}
    public static void setInjectorForTesting(com.android.internal.app.LockedAppActivity.Injector p0) {}
    private boolean setupLockedTaskModeUi() { return false; }
    private boolean setupUi() { return false; }
    private void showBiometricPrompt() {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onCreate(android.os.Bundle p0) {}
    public void onDestroy() {}
    public void onResume() {}
    public void onWindowFocusChanged(boolean p0) {}

    protected static enum ActivityMode {
        CLEAR_STORAGE,
        INTERCEPT,
        LOCKED_TASK,
        UNINSTALL;
        private static final com.android.internal.app.LockedAppActivity.ActivityMode[] $VALUES = null;
        private static final com.android.internal.app.LockedAppActivity.ActivityMode[] VALUES = null;
        private ActivityMode() {}
        static com.android.internal.app.LockedAppActivity.ActivityMode fromInt(int p0) { return null; }
    }

    private class AppLockKeyguardDismissCallback extends android.app.KeyguardManager.KeyguardDismissCallback {
        private AppLockKeyguardDismissCallback(com.android.internal.app.LockedAppActivity p0) { super(); }
        public void onDismissCancelled() {}
        public void onDismissError() {}
        public void onDismissSucceeded() {}
    }

    private static class AppLockLockedStateListener implements android.app.AppLockInternal.PackageLockedStateListener {
        private final com.android.internal.app.LockedAppActivity mActivity = null;
        private final java.lang.String mPackageName = null;
        private final android.content.IntentSender mTarget = null;
        private final int mUserId = 0;
        AppLockLockedStateListener(com.android.internal.app.LockedAppActivity p0, java.lang.String p1, int p2, android.content.IntentSender p3) {}
        public void onPackageLockedStateChanged(java.lang.String p0, int p1, boolean p2) {}
    }

    public static class Injector {
        public Injector() {}
        public android.view.View findViewById(android.app.Activity p0, int p1) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder getBiometricPromptBuilder(android.app.Activity p0) { return null; }
        public int getDisplayId(android.app.Activity p0) { return 0; }
        public android.content.IntentSender getIntentSender(android.content.Intent p0) { return null; }
        public android.app.KeyguardManager getKeyguardManager(android.app.Activity p0) { return null; }
        public android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher(android.app.Activity p0) { return null; }
        public android.content.pm.PackageManager getPackageManager(android.app.Activity p0) { return null; }
        public android.content.IntentSender getUninstallStatusReceiver(android.content.Intent p0) { return null; }
        public boolean hasWindowFocus(android.app.Activity p0) { return false; }
        public void sendTargetIntent(android.app.Activity p0, android.content.IntentSender p1) {}
        public void setContentView(android.app.Activity p0, int p1) {}
        public void setTheme(android.app.Activity p0, int p1) {}
        public void setTranslucent(android.app.Activity p0, boolean p1) {}
    }
}
