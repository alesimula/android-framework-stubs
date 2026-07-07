package com.android.internal.util;

public class LatencyTracker {
    private static final int[] ACTIONS_ALL = null;
    public static final int ACTION_BACK_SYSTEM_ANIMATION = 25;
    public static final int ACTION_CHECK_CREDENTIAL = 3;
    public static final int ACTION_CHECK_CREDENTIAL_UNLOCKED = 4;
    public static final int ACTION_DESKTOP_MODE_ENTER_APP_HANDLE_DRAG = 30;
    public static final int ACTION_DESKTOP_MODE_ENTER_APP_HANDLE_MENU = 31;
    public static final int ACTION_DESKTOP_MODE_EXIT_MODE = 32;
    public static final int ACTION_DESKTOP_MODE_EXIT_MODE_ON_LAST_WINDOW_CLOSE = 33;
    public static final int ACTION_EXPAND_PANEL = 0;
    public static final int ACTION_FACE_WAKE_AND_UNLOCK = 7;
    public static final int ACTION_FINGERPRINT_WAKE_AND_UNLOCK = 2;
    public static final int ACTION_FOLD_TO_AOD = 18;
    public static final int ACTION_KEYGUARD_FACE_UNLOCK_TO_HOME = 28;
    public static final int ACTION_KEYGUARD_FPS_UNLOCK_TO_HOME = 24;
    public static final int ACTION_LOAD_SHARE_SHEET = 16;
    public static final int ACTION_LOCATION_BUTTON_OPEN_SESSION = 36;
    public static final int ACTION_LOCKSCREEN_UNLOCK = 11;
    public static final int ACTION_NOTIFICATIONS_HIDDEN_FOR_MEASURE = 26;
    public static final int ACTION_NOTIFICATIONS_HIDDEN_FOR_MEASURE_WITH_SHADE_OPEN = 27;
    public static final int ACTION_NOTIFICATION_BIG_PICTURE_LOADED = 23;
    public static final int ACTION_REQUEST_IME_HIDDEN = 21;
    public static final int ACTION_REQUEST_IME_SHOWN = 20;
    public static final int ACTION_ROTATE_SCREEN = 6;
    public static final int ACTION_ROTATE_SCREEN_CAMERA_CHECK = 9;
    public static final int ACTION_ROTATE_SCREEN_SENSOR = 10;
    public static final int ACTION_SHADE_WINDOW_DISPLAY_CHANGE = 29;
    public static final int ACTION_SHOW_BACK_ARROW = 15;
    public static final int ACTION_SHOW_SELECTION_TOOLBAR = 17;
    public static final int ACTION_SHOW_VOICE_INTERACTION = 19;
    public static final int ACTION_SMARTSPACE_DOORBELL = 22;
    public static final int ACTION_START_RECENTS_ANIMATION = 8;
    public static final int ACTION_SWITCH_DISPLAY_FOLD = 34;
    public static final int ACTION_SWITCH_DISPLAY_UNFOLD = 13;
    public static final int ACTION_TOGGLE_RECENTS = 1;
    public static final int ACTION_TURN_ON_SCREEN = 5;
    public static final int ACTION_UDFPS_ILLUMINATE = 14;
    public static final int ACTION_UDFPS_OVERLAY_ATTACHED_AFTER_GOING_TO_SLEEP = 35;
    public static final int ACTION_USER_SWITCH = 12;
    private static final boolean DEBUG = false;
    private static final boolean DEFAULT_ENABLED = Boolean.valueOf(false);
    private static final int DEFAULT_SAMPLING_INTERVAL = 5;
    public static final java.lang.String SETTINGS_ENABLED_KEY = "enabled";
    private static final java.lang.String SETTINGS_SAMPLING_INTERVAL_KEY = "sampling_interval";
    public static final int[] STATSD_ACTION = null;
    private static final java.lang.String TAG = "LatencyTracker";
    private final android.util.SparseArray<com.android.internal.util.LatencyTracker.ActionProperties> mActionPropertiesMap = null;
    private boolean mEnabled;
    private com.android.internal.jank.InteractionMonitorDebugOverlay mInteractionMonitorDebugOverlay;
    private final java.lang.Object mLock = null;
    private final android.util.SparseArray<com.android.internal.util.LatencyTracker.Session> mSessions = null;
    public LatencyTracker() {}
    public static com.android.internal.util.LatencyTracker getInstance(android.content.Context p0) { return null; }
    public static java.lang.String getNameOfAction(int p0) { return null; }
    private static java.lang.String getTraceNameOfAction(int p0, java.lang.String p1) { return null; }
    private static java.lang.String getTraceTriggerNameForAction(int p0) { return null; }
    @java.lang.Deprecated
    public static boolean isEnabled(android.content.Context p0) { return false; }
    public static boolean isEnabled(android.content.Context p0, int p1) { return false; }
    private void updateProperties(android.provider.DeviceConfig.Properties p0) {}
    public long getActiveActionStartTime(int p0) { return 0L; }
    @java.lang.Deprecated
    public boolean isEnabled() { return false; }
    public boolean isEnabled(int p0) { return false; }
    public void logAction(int p0, int p1) {}
    public void onActionCancel(int p0) {}
    public void onActionEnd(int p0) {}
    public void onActionStart(int p0) {}
    public void onActionStart(int p0, java.lang.String p1) {}
    public void onDeviceConfigPropertiesUpdated(android.util.SparseArray<com.android.internal.util.LatencyTracker.ActionProperties> p0) {}
    public void onLogToFrameworkStats(com.android.internal.util.LatencyTracker.FrameworkStatsLogEvent p0) {}
    public void onTriggerPerfetto(java.lang.String p0) {}
    public void setDebugOverlay(com.android.internal.jank.InteractionMonitorDebugOverlay p0) {}
    public void startListeningForLatencyTrackerConfigChanges(java.util.concurrent.Executor p0) {}
    public void stopListeningForLatencyTrackerConfigChanges() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Action {
    }

    public static class ActionProperties {
        static final java.lang.String ENABLE_SUFFIX = "_enable";
        static final java.lang.String LEGACY_TRACE_THRESHOLD_SUFFIX = "";
        static final java.lang.String SAMPLE_INTERVAL_SUFFIX = "_sample_interval";
        static final java.lang.String TRACE_THRESHOLD_SUFFIX = "_trace_threshold";
        private final int mAction = 0;
        private final boolean mEnabled = false;
        private final int mSamplingInterval = 0;
        private final int mTraceThreshold = 0;
        public ActionProperties(int p0, boolean p1, int p2, int p3) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int getAction() { return 0; }
        public int getSamplingInterval() { return 0; }
        public int getTraceThreshold() { return 0; }
        public int hashCode() { return 0; }
        public boolean isEnabled() { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class FrameworkStatsLogEvent {
        public final int action = 0;
        public final int durationMillis = 0;
        public final int logCode = 0;
        public final int statsdAction = 0;
        private FrameworkStatsLogEvent(int p0, int p1, int p2, int p3) {}
        public java.lang.String toString() { return null; }
    }

    static class Session {
        private final int mAction = 0;
        private long mEndRtc;
        private final java.lang.String mName = null;
        private long mStartRtc;
        private final java.lang.String mTag = null;
        private java.lang.Runnable mTimeoutRunnable;
        Session(int p0, java.lang.String p1) {}
        void begin(java.lang.Runnable p0) {}
        void cancel() {}
        int duration() { return 0; }
        void end() {}
        java.lang.String name() { return null; }
        java.lang.String traceName() { return null; }
    }

    private static final class SLatencyTrackerHolder {
        private static final com.android.internal.util.LatencyTracker sLatencyTracker = null;
        private SLatencyTrackerHolder() {}
    }
}
