package com.android.internal.app;

public class SuspendedAppActivity extends com.android.internal.app.AlertActivity implements android.content.DialogInterface.OnClickListener {
    private static final java.lang.String ACTION_MANAGE_SUPERVISION_APP_LIMITS = "android.settings.action.MANAGE_SUPERVISION_APP_LIMITS";
    public static final java.lang.String EXTRA_ACTIVITY_OPTIONS = "com.android.internal.app.extra.ACTIVITY_OPTIONS";
    public static final java.lang.String EXTRA_DIALOG_INFO = "com.android.internal.app.extra.DIALOG_INFO";
    public static final java.lang.String EXTRA_SUSPENDED_PACKAGE = "com.android.internal.app.extra.SUSPENDED_PACKAGE";
    public static final java.lang.String EXTRA_SUSPENDING_PACKAGE = "com.android.internal.app.extra.SUSPENDING_PACKAGE";
    public static final java.lang.String EXTRA_SUSPENDING_USER = "com.android.internal.app.extra.SUSPENDING_USER";
    public static final java.lang.String EXTRA_UNSUSPEND_INTENT = "com.android.internal.app.extra.UNSUSPEND_INTENT";
    private static final java.lang.String PACKAGE_NAME = "com.android.internal.app";
    private static final java.lang.String TAG = null;
    private android.content.Intent mMoreDetailsIntent;
    private int mNeutralButtonAction;
    private android.content.IntentSender mOnUnsuspend;
    private android.os.Bundle mOptions;
    private android.content.pm.PackageManager mPm;
    private android.content.pm.SuspendDialogInfo mSuppliedDialogInfo;
    private android.content.BroadcastReceiver mSuspendModifiedReceiver;
    private java.lang.String mSuspendedPackage;
    private android.content.res.Resources mSuspendingAppResources;
    private java.lang.String mSuspendingPackage;
    private int mSuspendingUserId;
    private int mUserId;
    private android.app.usage.UsageStatsManager mUsm;
    public SuspendedAppActivity() { super(); }
    public static android.content.Intent createSuspendedAppInterceptIntent(java.lang.String p0, android.content.pm.UserPackage p1, android.content.pm.SuspendDialogInfo p2, android.os.Bundle p3, android.content.IntentSender p4, int p5) { return null; }
    private java.lang.CharSequence getAppLabel(java.lang.String p0) { return null; }
    private android.content.Intent getFallbackIntent() { return null; }
    private android.content.Intent getMoreDetailsActivity() { return null; }
    private boolean isPackageSuspended(java.lang.String p0) { return false; }
    private static boolean isSystemEntity(java.lang.String p0) { return false; }
    private void requestDismissKeyguardIfNeeded(java.lang.CharSequence p0) {}
    private java.lang.String resolveDialogMessage() { return null; }
    private android.graphics.drawable.Drawable resolveIcon() { return null; }
    private java.lang.String resolveNeutralButtonText() { return null; }
    private java.lang.String resolveTitle() { return null; }
    public void onClick(android.content.DialogInterface p0, int p1) {}
    public void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
}
