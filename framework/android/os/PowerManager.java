package android.os;

public final class PowerManager {
    @java.lang.Deprecated
    public static final int ACQUIRE_CAUSES_WAKEUP = 268435456;
    public static final java.lang.String ACTION_DEVICE_IDLE_MODE_CHANGED = "android.os.action.DEVICE_IDLE_MODE_CHANGED";
    public static final java.lang.String ACTION_DEVICE_LIGHT_IDLE_MODE_CHANGED = "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED";
    public static final java.lang.String ACTION_ENHANCED_DISCHARGE_PREDICTION_CHANGED = "android.os.action.ENHANCED_DISCHARGE_PREDICTION_CHANGED";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_LIGHT_DEVICE_IDLE_MODE_CHANGED = "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED";
    public static final java.lang.String ACTION_LOW_POWER_STANDBY_ENABLED_CHANGED = "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED";
    public static final java.lang.String ACTION_LOW_POWER_STANDBY_POLICY_CHANGED = "android.os.action.LOW_POWER_STANDBY_POLICY_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_LOW_POWER_STANDBY_PORTS_CHANGED = "android.os.action.LOW_POWER_STANDBY_PORTS_CHANGED";
    public static final java.lang.String ACTION_POWER_SAVE_MODE_CHANGED = "android.os.action.POWER_SAVE_MODE_CHANGED";
    public static final java.lang.String ACTION_POWER_SAVE_MODE_CHANGED_INTERNAL = "android.os.action.POWER_SAVE_MODE_CHANGED_INTERNAL";
    public static final java.lang.String ACTION_POWER_SAVE_WHITELIST_CHANGED = "android.os.action.POWER_SAVE_WHITELIST_CHANGED";
    public static final int BRIGHTNESS_CONSTRAINT_TYPE_DEFAULT = 2;
    public static final int BRIGHTNESS_CONSTRAINT_TYPE_DIM = 3;
    public static final int BRIGHTNESS_CONSTRAINT_TYPE_MAXIMUM = 1;
    public static final int BRIGHTNESS_CONSTRAINT_TYPE_MINIMUM = 0;
    public static final int BRIGHTNESS_DEFAULT = -1;
    public static final int BRIGHTNESS_INVALID = -1;
    public static final float BRIGHTNESS_INVALID_FLOAT = Float.NaN;
    public static final float BRIGHTNESS_MAX = 1.0f;
    public static final float BRIGHTNESS_MIN = 0.0f;
    public static final int BRIGHTNESS_OFF = 0;
    public static final float BRIGHTNESS_OFF_FLOAT = -1.0f;
    public static final int BRIGHTNESS_ON = 255;
    private static final java.lang.String CACHE_KEY_IS_INTERACTIVE_API = "is_interactive";
    private static final java.lang.String CACHE_KEY_IS_POWER_SAVE_MODE_API = "is_power_save_mode";
    public static final int DOZE_WAKE_LOCK = 64;
    public static final int DRAW_WAKE_LOCK = 128;
    public static final java.lang.String FEATURE_WAKE_ON_LAN_IN_LOW_POWER_STANDBY = "com.android.lowpowerstandby.WAKE_ON_LAN";
    public static final int FLAG_AMBIENT_SUPPRESSION_ALL = 3;
    public static final int FLAG_AMBIENT_SUPPRESSION_AOD = 2;
    public static final int FLAG_AMBIENT_SUPPRESSION_DREAM = 1;
    public static final int FLAG_AMBIENT_SUPPRESSION_NONE = 0;
    @java.lang.Deprecated
    public static final int FULL_WAKE_LOCK = 26;
    public static final int GO_TO_SLEEP_FLAG_NO_DOZE = 1;
    public static final int GO_TO_SLEEP_FLAG_SOFT_SLEEP = 2;
    public static final int GO_TO_SLEEP_REASON_ACCESSIBILITY = 7;
    public static final int GO_TO_SLEEP_REASON_APPLICATION = 0;
    public static final int GO_TO_SLEEP_REASON_DEVICE_ADMIN = 1;
    public static final int GO_TO_SLEEP_REASON_DEVICE_FOLD = 13;
    public static final int GO_TO_SLEEP_REASON_DISPLAY_GROUPS_TURNED_OFF = 12;
    public static final int GO_TO_SLEEP_REASON_DISPLAY_GROUP_REMOVED = 11;
    public static final int GO_TO_SLEEP_REASON_DREAM_FAILED = 15;
    public static final int GO_TO_SLEEP_REASON_FORCE_SUSPEND = 8;
    public static final int GO_TO_SLEEP_REASON_HDMI = 5;
    public static final int GO_TO_SLEEP_REASON_INATTENTIVE = 9;
    public static final int GO_TO_SLEEP_REASON_LID_SWITCH = 3;
    public static final int GO_TO_SLEEP_REASON_MAX = 15;
    public static final int GO_TO_SLEEP_REASON_MIN = 0;
    public static final int GO_TO_SLEEP_REASON_POWER_BUTTON = 4;
    public static final int GO_TO_SLEEP_REASON_QUIESCENT = 10;
    public static final int GO_TO_SLEEP_REASON_SLEEP_BUTTON = 6;
    public static final int GO_TO_SLEEP_REASON_TIMEOUT = 2;
    public static final int GO_TO_SLEEP_REASON_UNKNOWN = 14;
    public static final int LOCATION_MODE_ALL_DISABLED_WHEN_SCREEN_OFF = 2;
    public static final int LOCATION_MODE_FOREGROUND_ONLY = 3;
    public static final int LOCATION_MODE_GPS_DISABLED_WHEN_SCREEN_OFF = 1;
    public static final int LOCATION_MODE_NO_CHANGE = 0;
    public static final int LOCATION_MODE_THROTTLE_REQUESTS_WHEN_SCREEN_OFF = 4;
    public static final int LOW_POWER_STANDBY_ALLOWED_REASON_ONGOING_CALL = 4;
    public static final int LOW_POWER_STANDBY_ALLOWED_REASON_TEMP_POWER_SAVE_ALLOWLIST = 2;
    public static final int LOW_POWER_STANDBY_ALLOWED_REASON_VOICE_INTERACTION = 1;
    private static final int MAX_CACHE_ENTRIES = 1;
    public static final int MAX_LOCATION_MODE = 4;
    public static final int MAX_SOUND_TRIGGER_MODE = 2;
    public static final int MIN_LOCATION_MODE = 0;
    public static final int MIN_SOUND_TRIGGER_MODE = 0;
    public static final int ON_AFTER_RELEASE = 536870912;
    public static final int PARTIAL_SLEEP_WAKE_LOCK = 512;
    public static final int PARTIAL_WAKE_LOCK = 1;
    @android.annotation.SystemApi
    public static final int POWER_SAVE_MODE_TRIGGER_DYNAMIC = 1;
    @android.annotation.SystemApi
    public static final int POWER_SAVE_MODE_TRIGGER_PERCENTAGE = 0;
    public static final int PROXIMITY_SCREEN_OFF_WAKE_LOCK = 32;
    public static final java.lang.String REBOOT_QUIESCENT = "quiescent";
    public static final java.lang.String REBOOT_RECOVERY = "recovery";
    public static final java.lang.String REBOOT_RECOVERY_UPDATE = "recovery-update";
    public static final java.lang.String REBOOT_REQUESTED_BY_DEVICE_OWNER = "deviceowner";
    public static final java.lang.String REBOOT_SAFE_MODE = "safemode";
    @android.annotation.SystemApi
    public static final java.lang.String REBOOT_USERSPACE = "userspace";
    public static final int RELEASE_FLAG_TIMEOUT = 65536;
    public static final int RELEASE_FLAG_WAIT_FOR_NO_PROXIMITY = 1;
    @java.lang.Deprecated
    public static final int SCREEN_BRIGHT_WAKE_LOCK = 10;
    @java.lang.Deprecated
    public static final int SCREEN_DIM_WAKE_LOCK = 6;
    public static final int SCREEN_TIMEOUT_ACTIVE = 0;
    public static final int SCREEN_TIMEOUT_KEEP_DISPLAY_ON = 1;
    public static final int SCREEN_TIMEOUT_OVERRIDE_WAKE_LOCK = 256;
    public static final java.lang.String SHUTDOWN_BATTERY_THERMAL_STATE = "thermal,battery";
    public static final java.lang.String SHUTDOWN_LOW_BATTERY = "battery";
    public static final int SHUTDOWN_REASON_BATTERY_THERMAL = 6;
    public static final int SHUTDOWN_REASON_LOW_BATTERY = 5;
    public static final int SHUTDOWN_REASON_REBOOT = 2;
    public static final int SHUTDOWN_REASON_SHUTDOWN = 1;
    public static final int SHUTDOWN_REASON_THERMAL_SHUTDOWN = 4;
    public static final int SHUTDOWN_REASON_UNKNOWN = 0;
    public static final int SHUTDOWN_REASON_USER_REQUESTED = 3;
    public static final java.lang.String SHUTDOWN_SERVICE_CALL = "service";
    public static final java.lang.String SHUTDOWN_THERMAL_STATE = "thermal";
    public static final java.lang.String SHUTDOWN_USER_REQUESTED = "userrequested";
    @android.annotation.SystemApi
    public static final int SOUND_TRIGGER_MODE_ALL_DISABLED = 2;
    @android.annotation.SystemApi
    public static final int SOUND_TRIGGER_MODE_ALL_ENABLED = 0;
    @android.annotation.SystemApi
    public static final int SOUND_TRIGGER_MODE_CRITICAL_ONLY = 1;
    public static final int SYSTEM_WAKELOCK = -2147483648;
    private static final java.lang.String TAG = "PowerManager";
    public static final int THERMAL_STATUS_CRITICAL = 4;
    public static final int THERMAL_STATUS_EMERGENCY = 5;
    public static final int THERMAL_STATUS_INVALID = -1;
    public static final int THERMAL_STATUS_LIGHT = 1;
    public static final int THERMAL_STATUS_MODERATE = 2;
    public static final int THERMAL_STATUS_NONE = 0;
    public static final int THERMAL_STATUS_SEVERE = 3;
    public static final int THERMAL_STATUS_SHUTDOWN = 6;
    public static final int UNIMPORTANT_FOR_LOGGING = 1073741824;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_EVENT_ACCESSIBILITY = 3;
    public static final int USER_ACTIVITY_EVENT_ATTENTION = 4;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_EVENT_BUTTON = 1;
    public static final int USER_ACTIVITY_EVENT_DEVICE_STATE = 6;
    public static final int USER_ACTIVITY_EVENT_FACE_DOWN = 5;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_EVENT_OTHER = 0;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_EVENT_TOUCH = 2;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_FLAG_INDIRECT = 2;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_FLAG_NO_CHANGE_LIGHTS = 1;
    public static final int WAKE_LOCK_LEVEL_MASK = 65535;
    public static final int WAKE_REASON_APPLICATION = 2;
    public static final int WAKE_REASON_BIOMETRIC = 17;
    public static final int WAKE_REASON_CAMERA_LAUNCH = 5;
    public static final int WAKE_REASON_DISPLAY_GROUP_ADDED = 10;
    public static final int WAKE_REASON_DISPLAY_GROUP_TURNED_ON = 11;
    public static final int WAKE_REASON_DOCK = 18;
    public static final int WAKE_REASON_DOZE_STOPPED = 19;
    public static final int WAKE_REASON_DREAM_FINISHED = 13;
    public static final int WAKE_REASON_GESTURE = 4;
    public static final int WAKE_REASON_HDMI = 8;
    public static final int WAKE_REASON_LID = 9;
    public static final int WAKE_REASON_LIFT = 16;
    public static final int WAKE_REASON_PLUGGED_IN = 3;
    public static final int WAKE_REASON_POWER_BUTTON = 1;
    public static final int WAKE_REASON_TAP = 15;
    public static final int WAKE_REASON_TILT = 14;
    public static final int WAKE_REASON_UNFOLD_DEVICE = 12;
    public static final int WAKE_REASON_UNKNOWN = 0;
    public static final int WAKE_REASON_WAKE_KEY = 6;
    public static final int WAKE_REASON_WAKE_MOTION = 7;
    final android.content.Context mContext = null;
    final android.os.Handler mHandler = null;
    private final android.app.PropertyInvalidatedCache<java.lang.Integer, java.lang.Boolean> mInteractiveCache = null;
    private android.os.PowerExemptionManager mPowerExemptionManager;
    private final android.app.PropertyInvalidatedCache<java.lang.Void, java.lang.Boolean> mPowerSaveModeCache = null;
    private final android.util.ArrayMap<android.os.PowerManager.ScreenTimeoutPolicyListener, android.os.IScreenTimeoutPolicyListener> mScreenTimeoutPolicyListeners = null;
    final android.os.IPowerManager mService = null;
    private final android.util.ArrayMap<android.os.PowerManager.OnThermalHeadroomChangedListener, android.os.IThermalHeadroomListener> mThermalHeadroomListenerMap = null;
    final android.os.IThermalService mThermalService = null;
    private final android.util.ArrayMap<android.os.PowerManager.OnThermalStatusChangedListener, android.os.IThermalStatusListener> mThermalStatusListenerMap = null;
    private android.companion.virtual.VirtualDeviceManager mVirtualDeviceManager;
    public PowerManager(android.content.Context p0, android.os.IPowerManager p1, android.os.IThermalService p2, android.os.Handler p3) {}
    private java.util.Map<java.lang.Integer, java.lang.Float> convertThresholdsToMap(float[] p0) { return null; }
    private static android.app.PropertyInvalidatedCache.Args getCacheArgs(java.lang.String p0) { return null; }
    private android.os.PowerExemptionManager getPowerExemptionManager() { return null; }
    private boolean hasCustomDeviceThermalPolicy() { return false; }
    public static void invalidateIsInteractiveCaches() {}
    public static void invalidatePowerSaveModeCaches() {}
    public static boolean isRebootingUserspaceSupportedImpl() { return false; }
    public static java.lang.String locationPowerSaveModeToString(int p0) { return null; }
    public static java.lang.String lowPowerStandbyAllowedReasonsToString(int p0) { return null; }
    public static java.lang.String sleepReasonToString(int p0) { return null; }
    public static java.lang.String userActivityEventToString(int p0) { return null; }
    public static void validateWakeLockParameters(int p0, java.lang.String p1) {}
    public static java.lang.String wakeReasonToString(int p0) { return null; }
    public void addScreenTimeoutPolicyListener(int p0, java.util.concurrent.Executor p1, android.os.PowerManager.ScreenTimeoutPolicyListener p2) {}
    public void addThermalHeadroomListener(android.os.PowerManager.OnThermalHeadroomChangedListener p0) {}
    public void addThermalHeadroomListener(java.util.concurrent.Executor p0, android.os.PowerManager.OnThermalHeadroomChangedListener p1) {}
    public void addThermalStatusListener(android.os.PowerManager.OnThermalStatusChangedListener p0) {}
    public void addThermalStatusListener(java.util.concurrent.Executor p0, android.os.PowerManager.OnThermalStatusChangedListener p1) {}
    public boolean areAutoPowerSaveModesEnabled() { return false; }
    public void boostScreenBrightness(long p0) {}
    @android.annotation.SystemApi
    public void dream(long p0) {}
    public void forceLowPowerStandbyActive(boolean p0) {}
    @android.annotation.SystemApi
    public boolean forceSuspend() { return false; }
    @android.annotation.SystemApi
    public java.util.List<android.os.PowerManager.LowPowerStandbyPortDescription> getActiveLowPowerStandbyPorts() { return null; }
    public java.time.Duration getBatteryDischargePrediction() { return null; }
    public float getBrightnessConstraint(int p0) { return 0.0f; }
    public float getBrightnessConstraint(int p0, int p1) { return 0.0f; }
    public int getCurrentThermalStatus() { return 0; }
    public int getDefaultScreenBrightnessSetting() { return 0; }
    @android.annotation.SystemApi
    public android.os.BatterySaverPolicyConfig getFullPowerSavePolicy() { return null; }
    public int getLastShutdownReason() { return 0; }
    public int getLastSleepReason() { return 0; }
    public int getLocationPowerSaveMode() { return 0; }
    @android.annotation.SystemApi
    public android.os.PowerManager.LowPowerStandbyPolicy getLowPowerStandbyPolicy() { return null; }
    public int getMaximumScreenBrightnessSetting() { return 0; }
    public int getMinimumScreenBrightnessSetting() { return 0; }
    @android.annotation.SystemApi
    public int getPowerSaveModeTrigger() { return 0; }
    public android.os.PowerSaveState getPowerSaveState(int p0) { return null; }
    public int getSoundTriggerPowerSaveMode() { return 0; }
    public float getThermalHeadroom(int p0) { return 0.0f; }
    public java.util.Map<java.lang.Integer, java.lang.Float> getThermalHeadroomThresholds() { return null; }
    public void goToSleep(int p0, long p1, int p2, int p3) {}
    public void goToSleep(long p0) {}
    public void goToSleep(long p0, int p1, int p2) {}
    public boolean isAllowedInLowPowerStandby(int p0) { return false; }
    public boolean isAllowedInLowPowerStandby(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public boolean isAmbientDisplayAvailable() { return false; }
    @android.annotation.SystemApi
    public boolean isAmbientDisplaySuppressed() { return false; }
    @android.annotation.SystemApi
    public boolean isAmbientDisplaySuppressedForToken(java.lang.String p0) { return false; }
    public boolean isAmbientDisplaySuppressedForTokenByApp(java.lang.String p0, int p1) { return false; }
    public boolean isBatteryDischargePredictionPersonalized() { return false; }
    public boolean isBatterySaverSupported() { return false; }
    public boolean isDeviceIdleMode() { return false; }
    public boolean isDeviceLightIdleMode() { return false; }
    public boolean isExemptFromLowPowerStandby() { return false; }
    public boolean isIgnoringBatteryOptimizations(java.lang.String p0) { return false; }
    public boolean isInteractive() { return false; }
    public boolean isInteractive(int p0) { return false; }
    @java.lang.Deprecated
    public boolean isLightDeviceIdleMode() { return false; }
    public boolean isLowPowerStandbyEnabled() { return false; }
    @android.annotation.SystemApi
    public boolean isLowPowerStandbySupported() { return false; }
    public boolean isPowerSaveMode() { return false; }
    public boolean isRebootingUserspaceSupported() { return false; }
    @java.lang.Deprecated
    public boolean isScreenOn() { return false; }
    public boolean isSustainedPerformanceModeSupported() { return false; }
    public boolean isWakeLockLevelSupported(int p0) { return false; }
    public void nap(long p0) {}
    @android.annotation.SystemApi
    public android.os.PowerManager.LowPowerStandbyPortsLock newLowPowerStandbyPortsLock(java.util.List<android.os.PowerManager.LowPowerStandbyPortDescription> p0) { return null; }
    public android.os.PowerManager.SleepLock newSleepLock(int p0, java.lang.String p1) throws java.lang.RuntimeException { return null; }
    public android.os.PowerManager.WakeLock newWakeLock(int p0, java.lang.String p1) { return null; }
    public android.os.PowerManager.WakeLock newWakeLock(int p0, java.lang.String p1, int p2) { return null; }
    public void reboot(java.lang.String p0) {}
    public void rebootSafeMode() {}
    public void removeScreenTimeoutPolicyListener(int p0, android.os.PowerManager.ScreenTimeoutPolicyListener p1) {}
    public void removeThermalHeadroomListener(android.os.PowerManager.OnThermalHeadroomChangedListener p0) {}
    public void removeThermalStatusListener(android.os.PowerManager.OnThermalStatusChangedListener p0) {}
    @android.annotation.SystemApi
    public boolean setAdaptivePowerSaveEnabled(boolean p0) { return false; }
    @android.annotation.SystemApi
    public boolean setAdaptivePowerSavePolicy(android.os.BatterySaverPolicyConfig p0) { return false; }
    @android.annotation.SystemApi
    public void setBatteryDischargePrediction(java.time.Duration p0, boolean p1) {}
    public void setDozeAfterScreenOff(boolean p0) {}
    @android.annotation.SystemApi
    public boolean setDynamicPowerSaveHint(boolean p0, int p1) { return false; }
    @android.annotation.SystemApi
    public boolean setFullPowerSavePolicy(android.os.BatterySaverPolicyConfig p0) { return false; }
    @android.annotation.SystemApi
    public void setLowPowerStandbyActiveDuringMaintenance(boolean p0) {}
    @android.annotation.SystemApi
    public void setLowPowerStandbyEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public void setLowPowerStandbyPolicy(android.os.PowerManager.LowPowerStandbyPolicy p0) {}
    @android.annotation.SystemApi
    public boolean setPowerSaveModeEnabled(boolean p0) { return false; }
    @android.annotation.SystemApi
    public void shutdown(boolean p0) {}
    public void shutdown(boolean p0, java.lang.String p1, boolean p2) {}
    public void suppressAmbientDisplay(java.lang.String p0, int p1) {}
    @android.annotation.SystemApi
    public void suppressAmbientDisplay(java.lang.String p0, boolean p1) {}
    @android.annotation.SystemApi
    public void userActivity(long p0, int p1, int p2) {}
    @java.lang.Deprecated
    public void userActivity(long p0, boolean p1) {}
    @java.lang.Deprecated
    public void wakeUp(long p0) {}
    public void wakeUp(long p0, int p1, java.lang.String p2) {}
    public void wakeUp(long p0, int p1, java.lang.String p2, int p3) {}
    @java.lang.Deprecated
    public void wakeUp(long p0, java.lang.String p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutoPowerSaveModeTriggers {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BrightnessConstraint {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FlagAmbientSuppression {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GoToSleepReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LocationPowerSaveMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LowPowerStandbyAllowedReason {
    }

    @android.annotation.SystemApi
    public static final class LowPowerStandbyPolicy {
        private final java.util.Set<java.lang.String> mAllowedFeatures = null;
        private final int mAllowedReasons = 0;
        private final java.util.Set<java.lang.String> mExemptPackages = null;
        private final java.lang.String mIdentifier = null;
        public LowPowerStandbyPolicy(java.lang.String p0, java.util.Set<java.lang.String> p1, int p2, java.util.Set<java.lang.String> p3) {}
        public static android.os.PowerManager.LowPowerStandbyPolicy fromParcelable(android.os.IPowerManager.LowPowerStandbyPolicy p0) { return null; }
        public static android.os.IPowerManager.LowPowerStandbyPolicy toParcelable(android.os.PowerManager.LowPowerStandbyPolicy p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.util.Set<java.lang.String> getAllowedFeatures() { return null; }
        public int getAllowedReasons() { return 0; }
        public java.util.Set<java.lang.String> getExemptPackages() { return null; }
        public java.lang.String getIdentifier() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    @android.annotation.SystemApi
    public static final class LowPowerStandbyPortDescription {
        public static final int MATCH_PORT_LOCAL = 1;
        public static final int MATCH_PORT_REMOTE = 2;
        public static final int PROTOCOL_TCP = 6;
        public static final int PROTOCOL_UDP = 17;
        private final java.net.InetAddress mLocalAddress = null;
        private final int mPortMatcher = 0;
        private final int mPortNumber = 0;
        private final int mProtocol = 0;
        public LowPowerStandbyPortDescription(int p0, int p1, int p2) {}
        public LowPowerStandbyPortDescription(int p0, int p1, int p2, java.net.InetAddress p3) {}
        public static android.os.PowerManager.LowPowerStandbyPortDescription fromParcelable(android.os.IPowerManager.LowPowerStandbyPortDescription p0) { return null; }
        public static java.util.List<android.os.PowerManager.LowPowerStandbyPortDescription> fromParcelable(java.util.List<android.os.IPowerManager.LowPowerStandbyPortDescription> p0) { return null; }
        private java.lang.String portMatcherToString(int p0) { return null; }
        private java.lang.String protocolToString(int p0) { return null; }
        public static android.os.IPowerManager.LowPowerStandbyPortDescription toParcelable(android.os.PowerManager.LowPowerStandbyPortDescription p0) { return null; }
        public static java.util.List<android.os.IPowerManager.LowPowerStandbyPortDescription> toParcelable(java.util.List<android.os.PowerManager.LowPowerStandbyPortDescription> p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.net.InetAddress getLocalAddress() { return null; }
        public int getPortMatcher() { return 0; }
        public int getPortNumber() { return 0; }
        public int getProtocol() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PortMatcher {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Protocol {
        }
    }

    @android.annotation.SystemApi
    public final class LowPowerStandbyPortsLock {
        private boolean mHeld;
        private final java.util.List<android.os.PowerManager.LowPowerStandbyPortDescription> mPorts = null;
        private final android.os.IBinder mToken = null;
        LowPowerStandbyPortsLock(java.util.List<android.os.PowerManager.LowPowerStandbyPortDescription> p0) {}
        public void acquire() {}
        protected void finalize() {}
        public void release() {}
    }

    public static interface OnThermalHeadroomChangedListener {
        public void onThermalHeadroomChanged(float p0, float p1, int p2, java.util.Map<java.lang.Integer, java.lang.Float> p3);
    }

    public static interface OnThermalStatusChangedListener {
        public void onThermalStatusChanged(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScreenTimeoutPolicy {
    }

    public static interface ScreenTimeoutPolicyListener {
        public void onScreenTimeoutPolicyChanged(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceType {
        public static final int ANIMATION = 3;
        public static final int AOD = 14;
        public static final int BATTERY_STATS = 9;
        public static final int DATA_SAVER = 10;
        public static final int FORCE_ALL_APPS_STANDBY = 11;
        public static final int FORCE_BACKGROUND_CHECK = 12;
        public static final int FULL_BACKUP = 4;
        public static final int KEYVALUE_BACKUP = 5;
        public static final int LOCATION = 1;
        public static final int NETWORK_FIREWALL = 6;
        public static final int NIGHT_MODE = 16;
        public static final int NULL = 0;
        public static final int OPTIONAL_SENSORS = 13;
        public static final int QUICK_DOZE = 15;
        public static final int SCREEN_BRIGHTNESS = 7;
        public static final int SOUND = 8;
        public static final int VIBRATION = 2;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShutdownReason {
    }

    public static class SleepData {
        public final int goToSleepReason = 0;
        public final long goToSleepUptimeMillis = 0L;
        public SleepData(long p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public final class SleepLock {
        private static final int SLEEP_LOCK = 512;
        private final int mDefaultTimeoutMillis = 0;
        private final int mDisplayId = 0;
        private final java.lang.String mTag = null;
        private final android.os.PowerManager.WakeLock mWakelock = null;
        public SleepLock(android.os.PowerManager p0, int p1, java.lang.String p2) {}
        public void acquire(long p0) {}
        public boolean isHeld() { return false; }
        public void release() {}
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SoundTriggerPowerSaveMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface ThermalStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserActivityEvent {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserActivityFlag {
    }

    public static class WakeData {
        public final long sleepDurationRealtime = 0L;
        public final int wakeReason = 0;
        public final long wakeTime = 0L;
        public WakeData(long p0, int p1, long p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public final class WakeLock {
        private android.os.IWakeLockCallback mCallback;
        private final int mDisplayId = 0;
        private int mExternalCount;
        private int mFlags;
        private boolean mHeld;
        private java.lang.String mHistoryTag;
        private int mInternalCount;
        private android.os.PowerManager.WakeLockStateListener mListener;
        private final java.lang.String mPackageName = null;
        private boolean mRefCounted;
        private final java.lang.Runnable mReleaser = null;
        private java.lang.String mTag;
        private int mTagHash;
        private final android.os.IBinder mToken = null;
        private android.os.WorkSource mWorkSource;
        WakeLock(android.os.PowerManager p0, int p1, java.lang.String p2, java.lang.String p3, int p4) {}
        private void acquireLocked() {}
        public void acquire() {}
        public void acquire(long p0) {}
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
        protected void finalize() throws java.lang.Throwable {}
        public java.lang.String getTag() { return null; }
        public boolean isHeld() { return false; }
        public void release() {}
        public void release(int p0) {}
        public void setHistoryTag(java.lang.String p0) {}
        public void setReferenceCounted(boolean p0) {}
        public void setStateListener(java.util.concurrent.Executor p0, android.os.PowerManager.WakeLockStateListener p1) {}
        public void setTag(java.lang.String p0) {}
        public void setUnimportantForLogging(boolean p0) {}
        public void setWorkSource(android.os.WorkSource p0) {}
        public java.lang.String toString() { return null; }
        public void updateUids(int[] p0) {}
        public java.lang.Runnable wrap(java.lang.Runnable p0) { return null; }
    }

    public static interface WakeLockStateListener {
        public void onStateChanged(boolean p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WakeReason {
    }
}
