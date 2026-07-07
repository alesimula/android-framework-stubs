package android.app;

public class StatusBarManager {
    public static final java.lang.String ACTION_AGENT_TASK_MAIN = "android.app.action.AGENT_TASK_MAIN";
    public static final java.lang.String ACTION_KEYGUARD_PRIVATE_NOTIFICATIONS_CHANGED = "android.app.action.KEYGUARD_PRIVATE_NOTIFICATIONS_CHANGED";
    public static final java.util.Set<java.lang.Integer> ALL_SESSIONS = null;
    public static final int CAMERA_LAUNCH_SOURCE_LIFT_TRIGGER = 2;
    public static final int CAMERA_LAUNCH_SOURCE_POWER_DOUBLE_TAP = 1;
    public static final int CAMERA_LAUNCH_SOURCE_QUICK_AFFORDANCE = 3;
    public static final int CAMERA_LAUNCH_SOURCE_WIGGLE = 0;
    public static final int DEFAULT_SETUP_DISABLE2_FLAGS = 0;
    public static final int DEFAULT_SETUP_DISABLE_FLAGS = 61145088;
    private static final int DEFAULT_SIM_LOCKED_DISABLED_FLAGS = 65536;
    public static final int DISABLE2_GLOBAL_ACTIONS = 8;
    public static final int DISABLE2_MASK = 31;
    public static final int DISABLE2_NONE = 0;
    public static final int DISABLE2_NOTIFICATION_SHADE = 4;
    public static final int DISABLE2_QUICK_SETTINGS = 1;
    public static final int DISABLE2_ROTATE_SUGGESTIONS = 16;
    public static final int DISABLE2_SYSTEM_ICONS = 2;
    public static final int DISABLE_BACK = 4194304;
    public static final int DISABLE_CLOCK = 8388608;
    public static final int DISABLE_EXPAND = 65536;
    public static final int DISABLE_HOME = 2097152;
    public static final int DISABLE_MASK = 134152192;
    @java.lang.Deprecated
    public static final int DISABLE_NAVIGATION = 18874368;
    public static final int DISABLE_NONE = 0;
    public static final int DISABLE_NOTIFICATION_ALERTS = 262144;
    public static final int DISABLE_NOTIFICATION_ICONS = 131072;
    @java.lang.Deprecated
    public static final int DISABLE_NOTIFICATION_TICKER = 524288;
    public static final int DISABLE_ONGOING_CALL_CHIP = 67108864;
    public static final int DISABLE_RECENT = 16777216;
    public static final int DISABLE_SEARCH = 33554432;
    public static final int DISABLE_SYSTEM_INFO = 1048576;
    public static final java.lang.String EXTRA_KM_PRIVATE_NOTIFS_ALLOWED = "android.app.extra.KM_PRIVATE_NOTIFS_ALLOWED";
    private static final long MEDIA_CONTROL_BLANK_TITLE = 274775190L;
    private static final long MEDIA_CONTROL_MEDIA3_ACTIONS = 360196209L;
    private static final long MEDIA_CONTROL_SESSION_ACTIONS = 203800354L;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_RECEIVER_STATE_CLOSE_TO_SENDER = 0;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_RECEIVER_STATE_FAR_FROM_SENDER = 1;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_RECEIVER_STATE_TRANSFER_TO_RECEIVER_FAILED = 3;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_RECEIVER_STATE_TRANSFER_TO_RECEIVER_SUCCEEDED = 2;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_ALMOST_CLOSE_TO_END_CAST = 1;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_ALMOST_CLOSE_TO_START_CAST = 0;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_FAR_FROM_RECEIVER = 8;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_TRANSFER_TO_RECEIVER_FAILED = 6;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_TRANSFER_TO_RECEIVER_SUCCEEDED = 4;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_TRANSFER_TO_RECEIVER_TRIGGERED = 2;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_TRANSFER_TO_THIS_DEVICE_FAILED = 7;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_TRANSFER_TO_THIS_DEVICE_SUCCEEDED = 5;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_TRANSFER_TO_THIS_DEVICE_TRIGGERED = 3;
    public static final int NAVBAR_BACK_DISMISS_IME = 1;
    public static final int NAVBAR_IME_SWITCHER_BUTTON_VISIBLE = 4;
    public static final int NAVBAR_IME_VISIBLE = 2;
    @android.annotation.SystemApi
    public static final int NAV_BAR_MODE_DEFAULT = 0;
    @android.annotation.SystemApi
    public static final int NAV_BAR_MODE_KIDS = 1;
    public static final int SESSION_BIOMETRIC_PROMPT = 2;
    public static final int SESSION_KEYGUARD = 1;
    public static final int SHOW_POWER_MENU_RESULT_DISABLED = 1;
    public static final int SHOW_POWER_MENU_RESULT_SHOWING = 0;
    public static final int SHOW_POWER_MENU_RESULT_UNKNOWN = -1;
    private static final long SHOW_POWER_MENU_TIMEOUT_MILLIS = 5000L;
    private static final java.lang.String TAG = "StatusBarManager";
    public static final int TILE_ADD_REQUEST_ERROR_APP_NOT_IN_FOREGROUND = 1004;
    public static final int TILE_ADD_REQUEST_ERROR_BAD_COMPONENT = 1002;
    public static final int TILE_ADD_REQUEST_ERROR_MISMATCHED_PACKAGE = 1000;
    public static final int TILE_ADD_REQUEST_ERROR_NOT_CURRENT_USER = 1003;
    public static final int TILE_ADD_REQUEST_ERROR_NO_STATUS_BAR_SERVICE = 1005;
    public static final int TILE_ADD_REQUEST_ERROR_REQUEST_IN_PROGRESS = 1001;
    private static final int TILE_ADD_REQUEST_FIRST_ERROR_CODE = 1000;
    public static final int TILE_ADD_REQUEST_RESULT_DIALOG_DISMISSED = 3;
    public static final int TILE_ADD_REQUEST_RESULT_TILE_ADDED = 2;
    public static final int TILE_ADD_REQUEST_RESULT_TILE_ALREADY_ADDED = 1;
    public static final int TILE_ADD_REQUEST_RESULT_TILE_NOT_ADDED = 0;
    public static final int WINDOW_NAVIGATION_BAR = 2;
    public static final int WINDOW_STATE_HIDDEN = 2;
    public static final int WINDOW_STATE_HIDING = 1;
    public static final int WINDOW_STATE_SHOWING = 0;
    public static final int WINDOW_STATUS_BAR = 1;
    private android.content.Context mContext;
    private final com.android.internal.compat.IPlatformCompat mPlatformCompat = null;
    private com.android.internal.statusbar.IStatusBarService mService;
    private android.os.IBinder mToken;
    private final java.util.Map<android.media.NearbyMediaDevicesProvider, android.app.StatusBarManager.NearbyMediaDevicesProviderWrapper> nearbyMediaDevicesProviderMap = null;
    StatusBarManager(android.content.Context p0) {}
    private void clickNotificationInternal(java.lang.String p0, int p1, int p2, boolean p3) {}
    private com.android.internal.statusbar.IStatusBarService getService() { return null; }
    public static java.lang.String navbarFlagsToString(int p0) { return null; }
    public static boolean useMedia3ControllerForApp(java.lang.String p0, android.os.UserHandle p1) { return false; }
    public static boolean useMediaSessionActionsForApp(java.lang.String p0, android.os.UserHandle p1) { return false; }
    public static java.lang.String windowStateToString(int p0) { return null; }
    public boolean canLaunchCaptureContentActivityForNote(android.app.Activity p0) { return false; }
    public boolean canSetAgentTask() { return false; }
    public void cancelRequestAddTile(java.lang.String p0) {}
    public void clickNotification(java.lang.String p0, int p1, int p2, boolean p3) {}
    public void collapsePanels() {}
    public void disable(int p0) {}
    public void disable2(int p0) {}
    @android.annotation.SystemApi
    public void endMotionCuesSession() {}
    public void expandNotificationsPanel() {}
    public void expandSettingsPanel() {}
    public void expandSettingsPanel(java.lang.String p0) {}
    @android.annotation.SystemApi
    public android.app.StatusBarManager.DisableInfo getDisableInfo() { return null; }
    public int getIcon(java.lang.String p0) { return 0; }
    public int getLastSystemKey() { return 0; }
    @android.annotation.SystemApi
    public int getNavBarMode() { return 0; }
    public void handleSystemKey(android.view.KeyEvent p0) {}
    public boolean isAgentTaskFeatureSupported() { return false; }
    public void logBlankMediaTitle(java.lang.String p0, int p1) throws java.lang.RuntimeException {}
    @android.annotation.SystemApi
    public void registerNearbyMediaDevicesProvider(android.media.NearbyMediaDevicesProvider p0) {}
    @android.annotation.SystemApi
    public void removeIcon(java.lang.String p0) {}
    public void requestAddTileService(android.content.ComponentName p0, java.lang.CharSequence p1, android.graphics.drawable.Icon p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Integer> p4) {}
    public void requestTileServiceListeningState(android.content.ComponentName p0) {}
    public void sendNotificationFeedback(java.lang.String p0, android.os.Bundle p1) {}
    public void setAgentTask(android.agenticon.AgentTaskUpdate p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.agenticon.AgentTaskOutcome, java.lang.Throwable> p2) {}
    @android.annotation.SystemApi
    public void setDisabledForSetup(boolean p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void setExpansionDisabledForSimNetworkLock(boolean p0) {}
    @android.annotation.SystemApi
    public void setIcon(java.lang.String p0, int p1, int p2, java.lang.String p3) {}
    public void setIconVisibility(java.lang.String p0, boolean p1) {}
    @android.annotation.SystemApi
    public void setNavBarMode(int p0) {}
    public void showPowerMenu(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Integer, java.lang.Throwable> p1) {}
    @android.annotation.SystemApi
    public void startMotionCuesSession(android.content.ComponentName p0, android.app.motioncues.MotionCuesSettings p1) {}
    public void togglePanel() {}
    @android.annotation.SystemApi
    public void unregisterNearbyMediaDevicesProvider(android.media.NearbyMediaDevicesProvider p0) {}
    @android.annotation.SystemApi
    public void updateMediaTapToTransferReceiverDisplay(int p0, android.media.MediaRoute2Info p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3) {}
    @android.annotation.SystemApi
    public void updateMediaTapToTransferSenderDisplay(int p0, android.media.MediaRoute2Info p1, java.util.concurrent.Executor p2, java.lang.Runnable p3) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface Disable2Flags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface DisableFlags {
    }

    @android.annotation.SystemApi
    public static final class DisableInfo {
        private boolean mClock;
        private boolean mNavigateHome;
        private boolean mNotificationIcons;
        private boolean mNotificationPeeking;
        private boolean mQuickSettings;
        private boolean mRecents;
        private boolean mRotationSuggestion;
        private boolean mSearch;
        private boolean mStatusBarExpansion;
        private boolean mSystemIcons;
        public DisableInfo() {}
        public DisableInfo(int p0, int p1) {}
        public boolean areAllComponentsDisabled() { return false; }
        @android.annotation.SystemApi
        public boolean areAllComponentsEnabled() { return false; }
        public boolean areNotificationIconsDisabled() { return false; }
        public boolean areSystemIconsDisabled() { return false; }
        public boolean isClockDisabled() { return false; }
        @android.annotation.SystemApi
        public boolean isNavigateToHomeDisabled() { return false; }
        @android.annotation.SystemApi
        public boolean isNotificationPeekingDisabled() { return false; }
        public boolean isQuickSettingsDisabled() { return false; }
        @android.annotation.SystemApi
        public boolean isRecentsDisabled() { return false; }
        public boolean isRotationSuggestionDisabled() { return false; }
        @android.annotation.SystemApi
        public boolean isSearchDisabled() { return false; }
        @android.annotation.SystemApi
        public boolean isStatusBarExpansionDisabled() { return false; }
        public void setClockDisabled(boolean p0) {}
        public void setDisableAll() {}
        public void setEnableAll() {}
        public void setNagivationHomeDisabled(boolean p0) {}
        public void setNotificationIconsDisabled(boolean p0) {}
        public void setNotificationPeekingDisabled(boolean p0) {}
        public void setQuickSettingsDisabled(boolean p0) {}
        public void setRecentsDisabled(boolean p0) {}
        public void setSearchDisabled(boolean p0) {}
        public void setStatusBarExpansionDisabled(boolean p0) {}
        public void setSystemIconsDisabled(boolean p0) {}
        public android.util.Pair<java.lang.Integer, java.lang.Integer> toFlags() { return null; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MediaTransferReceiverState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MediaTransferSenderState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NavbarFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NavBarMode {
    }

    static final class NearbyMediaDevicesProviderWrapper extends android.media.INearbyMediaDevicesProvider.Stub {
        private final android.media.NearbyMediaDevicesProvider mProvider = null;
        private final java.util.Map<android.media.INearbyMediaDevicesUpdateCallback, java.util.function.Consumer<java.util.List<android.media.NearbyDevice>>> mRegisteredCallbacks = null;
        NearbyMediaDevicesProviderWrapper(android.media.NearbyMediaDevicesProvider p0) { super(); }
        public void registerNearbyDevicesCallback(android.media.INearbyMediaDevicesUpdateCallback p0) {}
        public void unregisterNearbyDevicesCallback(android.media.INearbyMediaDevicesUpdateCallback p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestResult {
    }

    static final class RequestResultCallback extends com.android.internal.statusbar.IAddTileResultCallback.Stub {
        private final java.util.function.Consumer<java.lang.Integer> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        RequestResultCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) { super(); }
        public void onTileRequest(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SessionFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShowPowerMenuResult {
    }

    static final class UndoCallback extends com.android.internal.statusbar.IUndoMediaTransferCallback.Stub {
        private final java.lang.Runnable mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        UndoCallback(java.util.concurrent.Executor p0, java.lang.Runnable p1) { super(); }
        public void onUndoTriggered() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WindowType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WindowVisibleState {
    }
}
