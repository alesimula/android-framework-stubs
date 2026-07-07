package android.hardware.display;

public final class DisplayManager {
    public static final java.lang.String ACTION_WIFI_DISPLAY_STATUS_CHANGED = "android.hardware.display.action.WIFI_DISPLAY_STATUS_CHANGED";
    public static final int BRIGHTNESS_UNIT_NITS = 2;
    public static final int BRIGHTNESS_UNIT_PERCENTAGE = 1;
    public static final int BRIGHTNESS_UNIT_RAW = 3;
    static final boolean DEBUG = Boolean.valueOf(false);
    public static final int DEFAULT_HDR_PREFERENCE = 1;
    public static final java.lang.String DISPLAY_CATEGORY_ALL_INCLUDING_DISABLED = "android.hardware.display.category.ALL_INCLUDING_DISABLED";
    public static final java.lang.String DISPLAY_CATEGORY_BUILT_IN_DISPLAYS = "android.hardware.display.category.BUILT_IN_DISPLAYS";
    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    public static final java.lang.String DISPLAY_CATEGORY_REAR = "android.hardware.display.category.REAR";
    public static final java.lang.String DISPLAY_CATEGORY_XR_PROJECTED = "android.hardware.display.category.XR_PROJECTED";
    private static final boolean ENABLE_VIRTUAL_DISPLAY_REFRESH_RATE = true;
    public static final long EVENT_TYPE_DISPLAY_ADDED = 1L;
    public static final long EVENT_TYPE_DISPLAY_BRIGHTNESS = 32L;
    public static final long EVENT_TYPE_DISPLAY_CHANGED = 4L;
    public static final long EVENT_TYPE_DISPLAY_REFRESH_RATE = 8L;
    public static final long EVENT_TYPE_DISPLAY_REMOVED = 2L;
    public static final long EVENT_TYPE_DISPLAY_STATE = 16L;
    public static final int EXTERNAL_DISPLAY_CONNECTION_PREFERENCE_ASK = 0;
    public static final int EXTERNAL_DISPLAY_CONNECTION_PREFERENCE_DEFAULT = 0;
    public static final int EXTERNAL_DISPLAY_CONNECTION_PREFERENCE_DESKTOP = 1;
    public static final int EXTERNAL_DISPLAY_CONNECTION_PREFERENCE_MIRROR = 2;
    public static final java.lang.String EXTRA_WIFI_DISPLAY_STATUS = "android.hardware.display.extra.WIFI_DISPLAY_STATUS";
    public static final java.lang.String HDR_OUTPUT_CONTROL_FLAG = "enable_hdr_output_control";
    public static final int HDR_PREFERENCE_HDR_ALLOWED = 1;
    public static final int HDR_PREFERENCE_SDR_ONLY = 0;
    public static final int MATCH_CONTENT_FRAMERATE_ALWAYS = 2;
    public static final int MATCH_CONTENT_FRAMERATE_NEVER = 0;
    public static final int MATCH_CONTENT_FRAMERATE_SEAMLESSS_ONLY = 1;
    public static final int MATCH_CONTENT_FRAMERATE_UNKNOWN = -1;
    public static final long PRIVATE_EVENT_TYPE_DISPLAY_COMMITTED_STATE_CHANGED = 4L;
    public static final long PRIVATE_EVENT_TYPE_DISPLAY_CONNECTION_CHANGED = 2L;
    public static final long PRIVATE_EVENT_TYPE_HDR_SDR_RATIO_CHANGED = 1L;
    public static final int SWITCHING_TYPE_ACROSS_AND_WITHIN_GROUPS = 2;
    public static final int SWITCHING_TYPE_NONE = 0;
    public static final int SWITCHING_TYPE_RENDER_FRAME_RATE_ONLY = 3;
    public static final int SWITCHING_TYPE_WITHIN_GROUPS = 1;
    private static final java.lang.String TAG = "DisplayManager";
    @android.annotation.SystemApi
    public static final int VIRTUAL_DISPLAY_FLAG_ALLOWS_CONTENT_MODE_SWITCH = 131072;
    public static final int VIRTUAL_DISPLAY_FLAG_ALWAYS_UNLOCKED = 4096;
    public static final int VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR = 16;
    public static final int VIRTUAL_DISPLAY_FLAG_CAN_SHOW_WITH_INSECURE_KEYGUARD = 32;
    public static final int VIRTUAL_DISPLAY_FLAG_DESTROY_CONTENT_ON_REMOVAL = 256;
    public static final int VIRTUAL_DISPLAY_FLAG_DEVICE_DISPLAY_GROUP = 32768;
    public static final int VIRTUAL_DISPLAY_FLAG_OWN_CONTENT_ONLY = 8;
    public static final int VIRTUAL_DISPLAY_FLAG_OWN_DISPLAY_GROUP = 2048;
    public static final int VIRTUAL_DISPLAY_FLAG_OWN_FOCUS = 16384;
    public static final int VIRTUAL_DISPLAY_FLAG_PRESENTATION = 2;
    public static final int VIRTUAL_DISPLAY_FLAG_PUBLIC = 1;
    @android.annotation.SystemApi
    public static final int VIRTUAL_DISPLAY_FLAG_ROTATES_WITH_CONTENT = 128;
    public static final int VIRTUAL_DISPLAY_FLAG_SECURE = 4;
    public static final int VIRTUAL_DISPLAY_FLAG_SHOULD_SHOW_SYSTEM_DECORATIONS = 512;
    @android.annotation.SystemApi
    public static final int VIRTUAL_DISPLAY_FLAG_STEAL_TOP_FOCUS_DISABLED = 65536;
    public static final int VIRTUAL_DISPLAY_FLAG_SUPPORTS_TOUCH = 64;
    public static final int VIRTUAL_DISPLAY_FLAG_TOUCH_FEEDBACK_DISABLED = 8192;
    @android.annotation.SystemApi
    public static final int VIRTUAL_DISPLAY_FLAG_TRUSTED = 1024;
    private android.hardware.display.AmbientDisplayConfiguration mAmbientDisplayConfiguration;
    private final android.content.Context mContext = null;
    private final android.hardware.display.DisplayManager.WeakDisplayCache mDisplayCache = null;
    private int mDisplayIdToMirror;
    private final android.hardware.display.DisplayManagerGlobal mGlobal = null;
    private final java.lang.Object mLock = null;
    public DisplayManager(android.content.Context p0) {}
    public static java.lang.String brightnessUnitToString(int p0) { return null; }
    @android.annotation.SystemApi
    public static android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String p0, int p1, int p2, int p3, android.view.Surface p4) { return null; }
    private android.hardware.display.AmbientDisplayConfiguration getAmbientDisplayConfiguration() { return null; }
    private int getDisplayIdToMirror() { return 0; }
    private android.view.Display[] getDisplays(int[] p0, java.util.function.Predicate<android.view.Display> p1) { return null; }
    private android.view.Display getOrCreateDisplay(int p0, boolean p1) { return null; }
    private static boolean isBuiltInDisplay(android.view.Display p0) { return false; }
    private static boolean isPresentationDisplay(android.view.Display p0) { return false; }
    private static boolean isRearDisplay(android.view.Display p0) { return false; }
    private void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, android.os.Handler p1, long p2, long p3, java.lang.String p4, boolean p5) {}
    private void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, java.util.concurrent.Executor p1, long p2, long p3, java.lang.String p4, boolean p5) {}
    private boolean shouldIncludeDisabledDisplays(java.lang.String p0) { return false; }
    private int toMatchContentFrameRateSetting(int p0) { return 0; }
    public boolean areUserDisabledHdrTypesAllowed() { return false; }
    public void clearGlobalUserPreferredDisplayMode() {}
    public void connectWifiDisplay(java.lang.String p0) {}
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.os.Handler p1, android.hardware.display.VirtualDisplay.Callback p2) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.media.projection.MediaProjection p0, android.hardware.display.VirtualDisplayConfig p1, android.hardware.display.VirtualDisplay.Callback p2, android.os.Handler p3) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.media.projection.MediaProjection p0, java.lang.String p1, int p2, int p3, int p4, android.view.Surface p5, int p6, android.hardware.display.VirtualDisplay.Callback p7, android.os.Handler p8, java.lang.String p9) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String p0, int p1, int p2, int p3, android.view.Surface p4, int p5) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String p0, int p1, int p2, int p3, android.view.Surface p4, int p5, android.hardware.display.VirtualDisplay.Callback p6, android.os.Handler p7) { return null; }
    public void disableConnectedDisplay(int p0) {}
    public void disconnectWifiDisplay() {}
    public void enableConnectedDisplay(int p0) {}
    public void forgetWifiDisplay(java.lang.String p0) {}
    @android.annotation.SystemApi
    public java.util.List<android.hardware.display.AmbientBrightnessDayStats> getAmbientBrightnessStats() { return null; }
    public float getBrightness(int p0) { return 0.0f; }
    public float getBrightness(int p0, int p1) { return 0.0f; }
    @android.annotation.SystemApi
    public android.hardware.display.BrightnessConfiguration getBrightnessConfiguration() { return null; }
    @android.annotation.SystemApi
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForDisplay(java.lang.String p0) { return null; }
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.hardware.display.BrightnessChangeEvent> getBrightnessEvents() { return null; }
    @android.annotation.SystemApi
    public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() { return null; }
    public float getDefaultDozeBrightness(int p0) { return 0.0f; }
    public android.view.Display getDisplay(int p0) { return null; }
    public android.hardware.display.DisplayTopology getDisplayTopology() { return null; }
    public android.view.Display[] getDisplays() { return null; }
    public android.view.Display[] getDisplays(java.lang.String p0) { return null; }
    public float[] getDozeBrightnessSensorValueToBrightness(int p0) { return null; }
    public int getExternalDisplayConnectionPreference(java.lang.String p0) { return 0; }
    public android.view.Display.Mode getGlobalUserPreferredDisplayMode() { return null; }
    public android.hardware.display.HdrConversionMode getHdrConversionMode() { return null; }
    public android.hardware.display.HdrConversionMode getHdrConversionModeSetting() { return null; }
    public int getMatchContentFrameRateUserPreference() { return 0; }
    @android.annotation.SystemApi
    public android.util.Pair<float[], float[]> getMinimumBrightnessCurve() { return null; }
    @android.annotation.SystemApi
    public android.graphics.Point getStableDisplaySize() { return null; }
    public int[] getSupportedHdrOutputTypes() { return null; }
    public int[] getUserDisabledHdrTypes() { return null; }
    public int getUserPreferredHdrMode(int p0) { return 0; }
    public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() { return null; }
    @android.annotation.SystemApi
    public boolean isAlwaysOnDisplayCurrentlyAvailable() { return false; }
    public boolean isMinimalPostProcessingRequested(int p0) { return false; }
    public void overrideHdrTypes(int p0, int[] p1) {}
    public void pauseWifiDisplay() {}
    public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, android.os.Handler p1) {}
    public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, android.os.Handler p1, long p2) {}
    public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, android.os.Handler p1, long p2, long p3) {}
    public void registerDisplayListener(java.util.concurrent.Executor p0, long p1, android.hardware.display.DisplayManager.DisplayListener p2) {}
    public void registerTopologyListener(java.util.concurrent.Executor p0, java.util.function.Consumer<android.hardware.display.DisplayTopology> p1) {}
    public void renameWifiDisplay(java.lang.String p0, java.lang.String p1) {}
    public void requestDisplayModes(int p0, int[] p1) {}
    public void resetImplicitRefreshRateCallbackStatus() {}
    public void resumeWifiDisplay() {}
    public void setAppRequestEnabledForTesting(boolean p0) {}
    public void setAreUserDisabledHdrTypesAllowed(boolean p0) {}
    public void setBrightness(int p0, float p1) {}
    public void setBrightness(int p0, float p1, int p2) {}
    @android.annotation.SystemApi
    public void setBrightnessConfiguration(android.hardware.display.BrightnessConfiguration p0) {}
    @android.annotation.SystemApi
    public void setBrightnessConfigurationForDisplay(android.hardware.display.BrightnessConfiguration p0, java.lang.String p1) {}
    public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) {}
    public void setDisplayTopology(android.hardware.display.DisplayTopology p0) {}
    public void setExternalDisplayConnectionPreference(java.lang.String p0, int p1) {}
    public void setGlobalUserPreferredDisplayMode(android.view.Display.Mode p0) {}
    public void setHdrConversionMode(android.hardware.display.HdrConversionMode p0) {}
    public void setRefreshRateSwitchingType(int p0) {}
    @android.annotation.SystemApi
    public void setSaturationLevel(float p0) {}
    public void setShouldAlwaysRespectAppRequestedMode(boolean p0) {}
    public void setTemporaryAutoBrightnessAdjustment(float p0) {}
    public void setTemporaryBrightness(int p0, float p1) {}
    public boolean setTemporaryBrightnessMode(int p0, int p1) { return false; }
    public void setUserDisabledHdrTypes(int[] p0) {}
    public void setUserPreferredDisplayMode(int p0, android.view.Display.Mode p1, boolean p2) {}
    public void setUserPreferredHdrMode(int p0, int p1) {}
    public boolean shouldAlwaysRespectAppRequestedMode() { return false; }
    public void startWifiDisplayScan() {}
    public void stopWifiDisplayScan() {}
    public boolean supportsSeamlessRefreshRateSwitching() { return false; }
    public void unregisterDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0) {}
    public void unregisterTopologyListener(java.util.function.Consumer<android.hardware.display.DisplayTopology> p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BrightnessUnit {
    }

    public static interface DeviceConfig {
        public static final java.lang.String KEY_BRIGHTNESS_THROTTLING_DATA = "brightness_throttling_data";
        public static final java.lang.String KEY_DISABLE_SCREEN_WAKE_LOCKS_WHILE_CACHED = "disable_screen_wake_locks_while_cached";
        public static final java.lang.String KEY_FIXED_REFRESH_RATE_HIGH_AMBIENT_BRIGHTNESS_THRESHOLDS = "fixed_refresh_rate_high_ambient_brightness_thresholds";
        public static final java.lang.String KEY_FIXED_REFRESH_RATE_HIGH_DISPLAY_BRIGHTNESS_THRESHOLDS = "fixed_refresh_rate_high_display_brightness_thresholds";
        public static final java.lang.String KEY_FIXED_REFRESH_RATE_LOW_AMBIENT_BRIGHTNESS_THRESHOLDS = "peak_refresh_rate_ambient_thresholds";
        public static final java.lang.String KEY_FIXED_REFRESH_RATE_LOW_DISPLAY_BRIGHTNESS_THRESHOLDS = "peak_refresh_rate_brightness_thresholds";
        public static final java.lang.String KEY_HIGH_REFRESH_RATE_BLACKLIST = "high_refresh_rate_blacklist";
        public static final java.lang.String KEY_PEAK_REFRESH_RATE_DEFAULT = "peak_refresh_rate_default";
        public static final java.lang.String KEY_POWER_THROTTLING_DATA = "power_throttling_data";
        public static final java.lang.String KEY_REFRESH_RATE_IN_HBM_HDR = "refresh_rate_in_hbm_hdr";
        public static final java.lang.String KEY_REFRESH_RATE_IN_HBM_SUNLIGHT = "refresh_rate_in_hbm_sunlight";
        public static final java.lang.String KEY_REFRESH_RATE_IN_HIGH_ZONE = "refresh_rate_in_high_zone";
        public static final java.lang.String KEY_REFRESH_RATE_IN_LOW_ZONE = "refresh_rate_in_zone";
    }

    public static interface DisplayListener {
        public void onDisplayAdded(int p0);
        public void onDisplayChanged(int p0);
        default public void onDisplayConnected(int p0) {}
        default public void onDisplayDisconnected(int p0) {}
        public void onDisplayRemoved(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ExternalDisplayConnection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HdrPreference {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MatchContentFrameRateType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PrivateEventType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SwitchingType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VirtualDisplayFlag {
    }

    private static final class WeakDisplayCache {
        private final android.util.SparseArray<java.lang.ref.WeakReference<android.view.Display>> mDisplayCache = null;
        private WeakDisplayCache() {}
        private void removeStaleEntries() {}
        android.view.Display get(int p0) { return null; }
        void put(android.view.Display p0) {}
    }
}
