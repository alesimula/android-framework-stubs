package android.widget;

public class ToastPresenter {
    private static final long LONG_DURATION_TIMEOUT = 7000L;
    private static final long SHORT_DURATION_TIMEOUT = 4000L;
    private static final java.lang.String TAG = "ToastPresenter";
    public static final int TEXT_TOAST_LAYOUT = 17367397;
    public static final int TEXT_TOAST_LAYOUT_WITH_ICON = 17367398;
    private static final java.lang.String WINDOW_TITLE = "Toast";
    private final android.view.accessibility.IAccessibilityManager mAccessibilityManagerService = null;
    private final java.lang.ref.WeakReference<android.content.Context> mContext = null;
    private final java.lang.String mContextPackageName = null;
    private final android.app.INotificationManager mNotificationManager = null;
    private final java.lang.String mPackageName = null;
    private final android.view.WindowManager.LayoutParams mParams = null;
    private final android.content.res.Resources mResources = null;
    private android.os.IBinder mToken;
    private android.view.View mView;
    public ToastPresenter(android.content.Context p0, android.view.accessibility.IAccessibilityManager p1, android.app.INotificationManager p2, java.lang.String p3) {}
    private void addToastView() {}
    private void adjustLayoutParams(android.view.WindowManager.LayoutParams p0, android.os.IBinder p1, int p2, int p3, int p4, int p5, float p6, float p7, boolean p8) {}
    private android.view.WindowManager.LayoutParams createLayoutParams() { return null; }
    public static android.view.View getTextToastView(android.content.Context p0, java.lang.CharSequence p1) { return null; }
    public static android.view.View getTextToastViewWithIcon(android.content.Context p0, java.lang.CharSequence p1, android.graphics.drawable.Drawable p2) { return null; }
    private android.view.WindowManager getWindowManager(android.view.View p0) { return null; }
    private boolean isCrossUserPackage(java.lang.String p0) { return false; }
    private void setShowForAllUsersIfApplicable(android.view.WindowManager.LayoutParams p0, java.lang.String p1) {}
    public android.view.WindowManager.LayoutParams getLayoutParams() { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.os.IBinder getToken() { return null; }
    public android.view.View getView() { return null; }
    public void hide(android.app.ITransientNotificationCallback p0) {}
    public void show(android.view.View p0, android.os.IBinder p1, android.os.IBinder p2, int p3, int p4, int p5, int p6, float p7, float p8, android.app.ITransientNotificationCallback p9) {}
    public void show(android.view.View p0, android.os.IBinder p1, android.os.IBinder p2, int p3, int p4, int p5, int p6, float p7, float p8, android.app.ITransientNotificationCallback p9, boolean p10) {}
    public void trySendAccessibilityEvent(android.view.View p0, java.lang.String p1) {}
    public void updateLayoutParams(int p0, int p1, float p2, float p3, int p4) {}
}
