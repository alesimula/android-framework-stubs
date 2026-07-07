package com.android.internal.app;

public class AppLockActivity extends android.app.Activity {
    private static final int APP_LOCK_STATE_CHANGE_RESULT_TOAST_DURATION = 0;
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final int REQUEST_CODE_APP_PERMISSION_REVIEW_DIALOG = 3;
    private static final int REQUEST_CODE_SET_SCREEN_LOCK = 1;
    private static final int REQUEST_CODE_USER_EDUCATION_DIALOG = 2;
    private static final java.lang.String SYSTEM_PACKAGE_NAME = "android";
    private static final java.lang.String TAG = "AppLockActivity";
    private static com.android.internal.app.AppLockActivity.Injector sInjector;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private final com.android.internal.app.AppLockActivity.Injector mInjector = null;
    private android.app.KeyguardManager mKeyguardManager;
    private java.lang.CharSequence mPackageLabel;
    private android.graphics.drawable.Drawable mPackageLogo;
    private android.app.AlertDialog mScreenLockDialog;
    private android.widget.ScrollView mScrollView;
    public AppLockActivity() { super(); }
    private boolean canPackageHandleMimeType(java.lang.String p0, java.lang.String p1) { return false; }
    public static android.content.Intent createAppLockActivityIntent(java.lang.String p0, boolean p1) { return null; }
    private java.lang.CharSequence getPackageLabel(java.lang.String p0) { return null; }
    private android.graphics.drawable.Drawable getPackageLogoAsDrawable(java.lang.String p0) { return null; }
    private boolean isFilesApp(java.lang.String p0) { return false; }
    private boolean isPhotoApp(java.lang.String p0) { return false; }
    public static void setInjectorForTesting(com.android.internal.app.AppLockActivity.Injector p0) {}
    private void showPermissionReviewDialog(java.lang.String p0, int p1) {}
    private void showResultToast(boolean p0, java.lang.String p1, java.lang.CharSequence p2, boolean p3) {}
    private void showSettingsPromoDialog() {}
    private boolean showSettingsPromoIfNeeded(boolean p0, boolean p1) { return false; }
    private void showSetupScreenLockDialog(java.lang.String p0) {}
    private void showUserEducationDialog(java.lang.String p0, java.lang.CharSequence p1) {}
    protected void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    public void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
    protected void onPause() {}
    protected void showBiometricPrompt(java.lang.String p0, java.lang.CharSequence p1, boolean p2) {}
    protected void showToast(java.lang.CharSequence p0, int p1) {}

    public static class Injector {
        public Injector() {}
        public android.hardware.biometrics.BiometricPrompt.Builder getBiometricPromptBuilder(android.app.Activity p0) { return null; }
    }
}
