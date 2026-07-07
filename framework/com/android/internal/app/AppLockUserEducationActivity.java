package com.android.internal.app;

public class AppLockUserEducationActivity extends android.app.Activity {
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final java.lang.String TAG = "AppLockUserEducation";
    private static com.android.internal.app.AppLockUserEducationActivity.Injector sInjector;
    private android.view.View mAppLockLayout;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private final com.android.internal.app.AppLockUserEducationActivity.Injector mInjector = null;
    private android.widget.ScrollView mScrollView;
    private final int mUserId = 0;
    public AppLockUserEducationActivity() { super(); }
    static android.content.Intent createIntent(android.content.Context p0, java.lang.String p1, java.lang.CharSequence p2) { return null; }
    private int getDescriptionResId(int p0, boolean p1, boolean p2) { return 0; }
    public static void setInjectorForTesting(com.android.internal.app.AppLockUserEducationActivity.Injector p0) {}
    private void setupUiAndShowDialog(java.lang.CharSequence p0) {}
    public void onBackPressed() {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
    protected void onStop() {}

    public static class Injector {
        public Injector() {}
        public android.hardware.biometrics.BiometricManager getBiometricManager(android.content.Context p0) { return null; }
        public com.android.internal.widget.LockPatternUtils getLockPatternUtils(android.content.Context p0) { return null; }
    }
}
