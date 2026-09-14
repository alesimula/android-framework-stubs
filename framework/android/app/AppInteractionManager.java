package android.app;

public final class AppInteractionManager {
    @android.annotation.SystemApi
    public static final int ACCESS_FLAG_COMPAT_GRANTED = 8;
    public static final int ACCESS_FLAG_MASK_ALL = 503;
    public static final int ACCESS_FLAG_MASK_OTHER = 3;
    public static final int ACCESS_FLAG_MASK_USER = 48;
    @android.annotation.SystemApi
    public static final int ACCESS_FLAG_ONE_TIME = 64;
    @android.annotation.SystemApi
    public static final int ACCESS_FLAG_OTHER_GRANTED = 1;
    @android.annotation.SystemApi
    public static final int ACCESS_FLAG_OTHER_REVOKED = 2;
    public static final int ACCESS_FLAG_PREGRANTED = 256;
    @android.annotation.SystemApi
    public static final int ACCESS_FLAG_UNREQUESTABLE = 128;
    @android.annotation.SystemApi
    public static final int ACCESS_FLAG_UPGRADE_GRANTED = 4;
    @android.annotation.SystemApi
    public static final int ACCESS_FLAG_USER_GRANTED = 16;
    @android.annotation.SystemApi
    public static final int ACCESS_FLAG_USER_REVOKED = 32;
    public static final java.lang.String ACTION_MANAGE_APP_INTERACTION_ACCESS = "android.app.action.MANAGE_APP_INTERACTION_ACCESS";
    public static final java.lang.String ACTION_MANAGE_INTERACTOR_ACCESS = "android.app.action.MANAGE_INTERACTOR_ACCESS";
    public static final java.lang.String ACTION_MANAGE_INTERACTOR_TARGET_ACCESS = "android.app.action.MANAGE_INTERACTOR_TARGET_ACCESS";
    public static final java.lang.String ACTION_MANAGE_TARGET_ACCESS = "android.app.action.MANAGE_TARGET_ACCESS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_REQUEST_APP_INTERACTION_ACCESS = "android.app.action.REQUEST_APP_INTERACTION_ACCESS";
    public static final java.lang.String EXTRA_INTERACTOR_PACKAGE_NAME = "android.app.extra.INTERACTOR_PACKAGE_NAME";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_REQUEST_APP_INTERACTION_ACCESS_RESULT = "android.app.extra.REQUEST_APP_INTERACTION_ACCESS_RESULT";
    public static final java.lang.String EXTRA_TARGET_PACKAGE_NAME = "android.app.extra.TARGET_PACKAGE_NAME";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_TARGET_PACKAGE_NAMES = "android.app.extra.TARGET_PACKAGE_NAMES";
    @android.annotation.SystemApi
    public static final int REQUEST_ACCESS_RESULT_ALLOWED = 1;
    @android.annotation.SystemApi
    public static final int REQUEST_ACCESS_RESULT_DENIED = 0;
    @android.annotation.SystemApi
    public static final int REQUEST_ACCESS_RESULT_ONE_TIME = 2;
    private static final java.lang.String TAG = "AppInteractionManager";
    private final android.content.Context mContext = null;
    private final android.util.ArrayMap<android.app.OnAppInteractionAccessChangedListener, android.app.AppInteractionManager.OnAppInteractionAccessChangeListenerDelegate> mListeners = null;
    private final android.app.IAppInteractionManager mService = null;
    public AppInteractionManager(android.app.IAppInteractionManager p0, android.content.Context p1) {}
    @android.annotation.SystemApi
    public void addAccessChangedListener(java.util.concurrent.Executor p0, android.app.OnAppInteractionAccessChangedListener p1) {}
    public void createSession(android.app.AppInteractionSession.CreateParams p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.app.AppInteractionSession, android.app.AppInteractionException> p2) {}
    @android.annotation.SystemApi
    public int getAccessFlags(java.lang.String p0, java.lang.String p1) { return 0; }
    @android.annotation.SystemApi
    public android.app.AppInteractionAccessInfo getAccessInfo(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.SystemApi
    public java.util.Map<java.lang.String, java.lang.Integer> getInteractorAccessFlags(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getInteractorPackageNames() { return null; }
    @android.annotation.SystemApi
    public java.util.Map<java.lang.String, java.lang.Integer> getTargetAccessFlags(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public void removeAccessChangedListener(android.app.OnAppInteractionAccessChangedListener p0) {}
    @android.annotation.SystemApi
    public void updateAccessFlags(java.lang.String p0, java.lang.String p1, int p2, int p3) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface AppInteractionAccessFlags {
    }

    private static final class OnAppInteractionAccessChangeListenerDelegate extends android.app.IOnAppInteractionAccessChangeListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.app.OnAppInteractionAccessChangedListener mListener = null;
        private final int mUserId = 0;
        private OnAppInteractionAccessChangeListenerDelegate(android.app.OnAppInteractionAccessChangedListener p0, java.util.concurrent.Executor p1, int p2) { super(); }
        public void onAppInteractionAccessChanged(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER})
    public static @interface RequestAccessResult {
    }
}
