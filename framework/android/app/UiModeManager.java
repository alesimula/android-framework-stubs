package android.app;

public class UiModeManager {
    public static java.lang.String ACTION_ENTER_CAR_MODE;
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_ENTER_CAR_MODE_PRIORITIZED = "android.app.action.ENTER_CAR_MODE_PRIORITIZED";
    public static java.lang.String ACTION_ENTER_DESK_MODE;
    public static java.lang.String ACTION_EXIT_CAR_MODE;
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_EXIT_CAR_MODE_PRIORITIZED = "android.app.action.EXIT_CAR_MODE_PRIORITIZED";
    public static java.lang.String ACTION_EXIT_DESK_MODE;
    private static final java.lang.String CURRENT_MODE_TYPE_API = "getCurrentModeType";
    @android.annotation.SystemApi
    public static final int DEFAULT_PRIORITY = 0;
    public static final int DISABLE_CAR_MODE_ALL_PRIORITIES = 2;
    public static final int DISABLE_CAR_MODE_GO_HOME = 1;
    public static final int ENABLE_CAR_MODE_ALLOW_SLEEP = 2;
    public static final int ENABLE_CAR_MODE_GO_CAR_HOME = 1;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CALLING_PACKAGE = "android.app.extra.CALLING_PACKAGE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PRIORITY = "android.app.extra.PRIORITY";
    public static final int FORCE_INVERT_PACKAGE_ALLOWED = 0;
    public static final int FORCE_INVERT_PACKAGE_ALWAYS_DISABLE = 2;
    public static final int FORCE_INVERT_PACKAGE_ALWAYS_ENABLE = 1;
    public static final int FORCE_INVERT_TYPE_DARK = 1;
    public static final int FORCE_INVERT_TYPE_LIGHT = 2;
    public static final int FORCE_INVERT_TYPE_OFF = 0;
    public static final int MODE_ATTENTION_THEME_OVERLAY_DAY = 1002;
    public static final int MODE_ATTENTION_THEME_OVERLAY_NIGHT = 1001;
    public static final int MODE_ATTENTION_THEME_OVERLAY_OFF = 1000;
    public static final int MODE_ATTENTION_THEME_OVERLAY_UNKNOWN = -1;
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_CUSTOM = 3;
    @android.annotation.SystemApi
    public static final int MODE_NIGHT_CUSTOM_TYPE_BEDTIME = 1;
    @android.annotation.SystemApi
    public static final int MODE_NIGHT_CUSTOM_TYPE_SCHEDULE = 0;
    @android.annotation.SystemApi
    public static final int MODE_NIGHT_CUSTOM_TYPE_UNKNOWN = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_YES = 2;
    private static final java.lang.String NIGHT_MODE_API = "getNightMode";
    @android.annotation.SystemApi
    public static final int PROJECTION_TYPE_ALL = -1;
    @android.annotation.SystemApi
    public static final int PROJECTION_TYPE_AUTOMOTIVE = 1;
    @android.annotation.SystemApi
    public static final int PROJECTION_TYPE_NONE = 0;
    private static final java.lang.String TAG = "UiModeManager";
    private static android.app.UiModeManager.Globals sGlobals;
    private final android.content.Context mContext = null;
    private final android.os.IpcDataCache<java.lang.Integer, java.lang.Integer> mCurrentModeTypeCache = null;
    private final android.os.IpcDataCache.QueryHandler<java.lang.Integer, java.lang.Integer> mCurrentModeTypeQuery = null;
    private final java.lang.Object mLock = null;
    private final android.os.IpcDataCache<java.lang.Integer, java.lang.Integer> mNightModeCache = null;
    private final android.os.IpcDataCache.QueryHandler<java.lang.Integer, java.lang.Integer> mNightModeQuery = null;
    private final android.app.UiModeManager.OnProjectionStateChangedListenerResourceManager mOnProjectionStateChangedListenerResourceManager = null;
    private final java.util.Map<android.app.UiModeManager.OnProjectionStateChangedListener, android.app.UiModeManager.InnerListener> mProjectionStateListenerMap = null;
    UiModeManager() throws android.os.ServiceManager.ServiceNotFoundException {}
    UiModeManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    private java.lang.Integer getCurrentModeTypeFromServer(int p0) { return null; }
    private int getDisplayId() { return 0; }
    private java.lang.Integer getNightModeFromServer(int p0) { return null; }
    private int getUserId() { return 0; }
    public static void invalidateCurrentModeTypeCache() {}
    public static void invalidateNightModeCache() {}
    public void addContrastChangeListener(java.util.concurrent.Executor p0, android.app.UiModeManager.ContrastChangeListener p1) {}
    public void addForceInvertStateChangeListener(java.util.concurrent.Executor p0, android.app.UiModeManager.ForceInvertStateChangeListener p1) {}
    @android.annotation.SystemApi
    public void addOnProjectionStateChangedListener(int p0, java.util.concurrent.Executor p1, android.app.UiModeManager.OnProjectionStateChangedListener p2) {}
    public void disableCarMode(int p0) {}
    public void enableCarMode(int p0) {}
    @android.annotation.SystemApi
    public void enableCarMode(int p0, int p1) {}
    @android.annotation.SystemApi
    public int getActiveProjectionTypes() { return 0; }
    public java.util.List<java.lang.String> getAllForceInvertAlwaysDisableApps(int p0) { return null; }
    public int getAttentionModeThemeOverlay() { return 0; }
    public float getContrast() { return 0.0f; }
    public int getCurrentModeType() { return 0; }
    public java.time.LocalTime getCustomNightModeEnd() { return null; }
    public java.time.LocalTime getCustomNightModeStart() { return null; }
    public int getForceInvertOverrideState() { return 0; }
    public int getForceInvertState() { return 0; }
    public int getNightMode() { return 0; }
    @android.annotation.SystemApi
    public int getNightModeCustomType() { return 0; }
    @android.annotation.SystemApi
    public java.util.Set<java.lang.String> getProjectingPackages(int p0) { return null; }
    public boolean isNightModeLocked() { return false; }
    public boolean isUiModeLocked() { return false; }
    @android.annotation.SystemApi
    public boolean releaseProjection(int p0) { return false; }
    public void removeContrastChangeListener(android.app.UiModeManager.ContrastChangeListener p0) {}
    public void removeForceInvertStateChangeListener(android.app.UiModeManager.ForceInvertStateChangeListener p0) {}
    @android.annotation.SystemApi
    public void removeOnProjectionStateChangedListener(android.app.UiModeManager.OnProjectionStateChangedListener p0) {}
    @android.annotation.SystemApi
    public boolean requestProjection(int p0) { return false; }
    public void setApplicationNightMode(int p0) {}
    public void setAttentionModeThemeOverlay(int p0) {}
    public void setCustomNightModeEnd(java.time.LocalTime p0) {}
    public void setCustomNightModeStart(java.time.LocalTime p0) {}
    public boolean setForceInvertOverrideStateForApp(java.lang.String p0, int p1, int p2) { return false; }
    public void setNightMode(int p0) {}
    public boolean setNightModeActivated(boolean p0) { return false; }
    @android.annotation.SystemApi
    public boolean setNightModeActivatedForCustomMode(int p0, boolean p1) { return false; }
    @android.annotation.SystemApi
    public void setNightModeCustomType(int p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttentionModeThemeOverlayReturnType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttentionModeThemeOverlayType {
    }

    public static interface ContrastChangeListener {
        public void onContrastChanged(float p0);
    }

    public static class ContrastUtils {
        public static final float CONTRAST_DEFAULT_VALUE = 0.0f;
        public static final int CONTRAST_LEVEL_HIGH = 2;
        public static final int CONTRAST_LEVEL_MEDIUM = 1;
        public static final int CONTRAST_LEVEL_STANDARD = 0;
        private static final float CONTRAST_MAX_VALUE = 1.0f;
        private static final float CONTRAST_MIN_VALUE = -1.0f;
        public ContrastUtils() {}
        private static java.util.stream.Stream<java.lang.Integer> allContrastLevels() { return null; }
        public static float fromContrastLevel(int p0) { return 0.0f; }
        public static int toContrastLevel(float p0) { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ContrastLevel {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisableCarMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnableCarMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ForceInvertPackageOverrideState {
    }

    public static interface ForceInvertStateChangeListener {
        public void onForceInvertStateChanged(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ForceInvertType {
    }

    private static class Globals {
        private final java.lang.Object mGlobalsLock = null;
        private final android.app.IUiModeManager mService = null;
        private final android.util.SparseArray<android.app.UiModeManager.UserCallback> mUserCallbacks = null;
        Globals(android.app.IUiModeManager p0) {}
        private void addContrastChangeListener(android.app.UiModeManager.ContrastChangeListener p0, java.util.concurrent.Executor p1, int p2) {}
        private void addForceInvertStateChangeListener(android.app.UiModeManager.ForceInvertStateChangeListener p0, java.util.concurrent.Executor p1, int p2) {}
        private java.util.List<java.lang.String> getAllForceInvertAlwaysDisableApps(int p0) { return null; }
        private float getContrast(int p0) { return 0.0f; }
        private int getForceInvertOverrideState(int p0, java.lang.String p1) { return 0; }
        private int getForceInvertState(int p0) { return 0; }
        private android.app.UiModeManager.UserCallback getUserCallbackOrCreate(int p0) { return null; }
        private void removeCallbackIfUnusedLocked(int p0) {}
        private void removeContrastChangeListener(android.app.UiModeManager.ContrastChangeListener p0, int p1) {}
        private void removeForceInvertStateChangeListener(android.app.UiModeManager.ForceInvertStateChangeListener p0, int p1) {}
        private boolean setForceInvertOverrideState(int p0, java.lang.String p1, int p2) { return false; }
    }

    private static class InnerListener extends android.app.IOnProjectionStateChangedListener.Stub {
        private final java.lang.ref.WeakReference<android.app.UiModeManager.OnProjectionStateChangedListenerResourceManager> mResourceManager = null;
        private InnerListener(java.util.concurrent.Executor p0, android.app.UiModeManager.OnProjectionStateChangedListener p1, android.app.UiModeManager.OnProjectionStateChangedListenerResourceManager p2) { super(); }
        public void onProjectionStateChanged(int p0, java.util.List<java.lang.String> p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NightMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NightModeCustomReturnType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NightModeCustomType {
    }

    @android.annotation.SystemApi
    public static interface OnProjectionStateChangedListener {
        public void onProjectionStateChanged(int p0, java.util.Set<java.lang.String> p1);
    }

    private static class OnProjectionStateChangedListenerResourceManager {
        private final java.util.Map<android.app.UiModeManager.InnerListener, java.util.concurrent.Executor> mExecutorMap = null;
        private final java.util.Map<android.app.UiModeManager.InnerListener, android.app.UiModeManager.OnProjectionStateChangedListener> mOuterListenerMap = null;
        private OnProjectionStateChangedListenerResourceManager() {}
        java.util.concurrent.Executor getExecutor(android.app.UiModeManager.InnerListener p0) { return null; }
        android.app.UiModeManager.OnProjectionStateChangedListener getOuterListener(android.app.UiModeManager.InnerListener p0) { return null; }
        void put(android.app.UiModeManager.InnerListener p0, java.util.concurrent.Executor p1, android.app.UiModeManager.OnProjectionStateChangedListener p2) {}
        void remove(android.app.UiModeManager.InnerListener p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProjectionType {
    }

    private static class UserCallback extends android.app.IUiModeManagerCallback.Stub {
        private float mContrast;
        private final android.util.ArrayMap<android.app.UiModeManager.ContrastChangeListener, java.util.concurrent.Executor> mContrastChangeListeners = null;
        private int mForceInvertState;
        private final android.util.ArrayMap<android.app.UiModeManager.ForceInvertStateChangeListener, java.util.concurrent.Executor> mForceInvertStateChangeListeners = null;
        private UserCallback(int p0) { super(); }
        private void notifyForceInvertStateChanged(int p0, boolean p1) throws android.os.RemoteException {}
        public void notifyContrastChanged(float p0) throws android.os.RemoteException {}
        public void notifyForceInvertOverrideStateChanged() throws android.os.RemoteException {}
        public void notifyForceInvertStateChanged(int p0) throws android.os.RemoteException {}
    }
}
