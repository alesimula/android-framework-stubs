package com.android.internal.app;

public class AppLockPermissionReviewActivity extends android.app.Activity {
    private static final boolean DEBUG = Boolean.valueOf(false);
    public static final java.lang.String EXTRA_PERMISSION_REVIEW_TYPE = "android.intent.extra.app_lock_permission_review_type";
    private static final android.util.SparseArray<com.android.internal.app.AppLockPermissionReviewActivity.ReviewTypeConfig> REVIEW_CONFIGS = null;
    public static final int REVIEW_TYPE_FILES = 1;
    public static final int REVIEW_TYPE_INVALID = -1;
    public static final int REVIEW_TYPE_PHOTOS = 0;
    private static final java.lang.String TAG = "AppLockPermissionReview";
    private final java.util.concurrent.ExecutorService mBackgroundExecutor = null;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private android.widget.ScrollView mScrollView;
    public AppLockPermissionReviewActivity() { super(); }
    static android.content.Intent createIntent(android.content.Context p0, java.lang.String p1, int p2) { return null; }
    private boolean isUserFacingApp(android.content.pm.PackageManager p0, java.lang.String p1) { return false; }
    protected java.util.List<com.android.internal.app.AppLockPermissionReviewActivity.AppWithPermissionInfo> getAppsWithPermissions(com.android.internal.app.AppLockPermissionReviewActivity.ReviewTypeConfig p0) { return null; }
    public void onBackPressed() {}
    protected void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
    protected void onStop() {}
    protected void populateAppsList(com.android.internal.app.AppLockPermissionReviewAdapter p0, com.android.internal.app.AppLockPermissionReviewActivity.ReviewTypeConfig p1) {}
    protected void updateUiWithAppList(java.util.List<com.android.internal.app.AppLockPermissionReviewActivity.AppWithPermissionInfo> p0, com.android.internal.app.AppLockPermissionReviewAdapter p1) {}

    static class AppWithPermissionInfo {
        final android.graphics.drawable.Drawable mAppIcon = null;
        final java.lang.CharSequence mAppName = null;
        final java.lang.String mPackageName = null;
        AppWithPermissionInfo(java.lang.CharSequence p0, android.graphics.drawable.Drawable p1, java.lang.String p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ReviewType {
    }

    static final class ReviewTypeConfig {
        final java.lang.String[] mPermissions = null;
        final int mSubtitleResId = 0;
        final int mTitleResId = 0;
        ReviewTypeConfig(java.lang.String[] p0, int p1, int p2) {}
    }
}
