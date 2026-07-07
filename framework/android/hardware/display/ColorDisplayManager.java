package android.hardware.display;

@android.annotation.SystemApi
public final class ColorDisplayManager {
    @android.annotation.SystemApi
    public static final int AUTO_MODE_CUSTOM_TIME = 1;
    @android.annotation.SystemApi
    public static final int AUTO_MODE_DISABLED = 0;
    @android.annotation.SystemApi
    public static final int AUTO_MODE_TWILIGHT = 2;
    @android.annotation.SystemApi
    public static final int CAPABILITY_HARDWARE_ACCELERATION_GLOBAL = 2;
    @android.annotation.SystemApi
    public static final int CAPABILITY_HARDWARE_ACCELERATION_PER_APP = 4;
    @android.annotation.SystemApi
    public static final int CAPABILITY_NONE = 0;
    @android.annotation.SystemApi
    public static final int CAPABILITY_PROTECTED_CONTENT = 1;
    public static final int COLOR_MODE_AUTOMATIC = 3;
    public static final int COLOR_MODE_BOOSTED = 1;
    public static final int COLOR_MODE_NATURAL = 0;
    public static final int COLOR_MODE_SATURATED = 2;
    public static final int VENDOR_COLOR_MODE_RANGE_MAX = 511;
    public static final int VENDOR_COLOR_MODE_RANGE_MIN = 256;
    private final android.hardware.display.ColorDisplayManager.ColorDisplayManagerInternal mManager = null;
    private com.android.internal.logging.MetricsLogger mMetricsLogger;
    public ColorDisplayManager() {}
    public static boolean areAccessibilityTransformsEnabled(android.content.Context p0) { return false; }
    public static int getMaximumColorTemperature(android.content.Context p0) { return 0; }
    public static int getMaximumReduceBrightColorsStrength(android.content.Context p0) { return 0; }
    private com.android.internal.logging.MetricsLogger getMetricsLogger() { return null; }
    public static int getMinimumColorTemperature(android.content.Context p0) { return 0; }
    public static int getMinimumReduceBrightColorsStrength(android.content.Context p0) { return 0; }
    public static boolean isColorTransformAccelerated(android.content.Context p0) { return false; }
    public static boolean isDisplayWhiteBalanceAvailable(android.content.Context p0) { return false; }
    public static boolean isNightDisplayAvailable(android.content.Context p0) { return false; }
    public static boolean isReduceBrightColorsAvailable(android.content.Context p0) { return false; }
    public static boolean isStandardColorMode(int p0) { return false; }
    public int getColorMode() { return 0; }
    @android.annotation.SystemApi
    public int getNightDisplayAutoMode() { return 0; }
    public int getNightDisplayAutoModeRaw() { return 0; }
    public int getNightDisplayColorTemperature() { return 0; }
    public java.time.LocalTime getNightDisplayCustomEndTime() { return null; }
    public java.time.LocalTime getNightDisplayCustomStartTime() { return null; }
    public float getReduceBrightColorsOffsetFactor() { return 0.0f; }
    public int getReduceBrightColorsStrength() { return 0; }
    @android.annotation.SystemApi
    public int getTransformCapabilities() { return 0; }
    public boolean isDeviceColorManaged() { return false; }
    public boolean isDisplayWhiteBalanceEnabled() { return false; }
    public boolean isNightDisplayActivated() { return false; }
    public boolean isReduceBrightColorsActivated() { return false; }
    public boolean isSaturationActivated() { return false; }
    @android.annotation.SystemApi
    public boolean setAppSaturationLevel(java.lang.String p0, int p1) { return false; }
    public void setColorMode(int p0) {}
    public boolean setDisplayWhiteBalanceEnabled(boolean p0) { return false; }
    public boolean setNightDisplayActivated(boolean p0) { return false; }
    @android.annotation.SystemApi
    public boolean setNightDisplayAutoMode(int p0) { return false; }
    public boolean setNightDisplayColorTemperature(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean setNightDisplayCustomEndTime(java.time.LocalTime p0) { return false; }
    @android.annotation.SystemApi
    public boolean setNightDisplayCustomStartTime(java.time.LocalTime p0) { return false; }
    public boolean setReduceBrightColorsActivated(boolean p0) { return false; }
    public boolean setReduceBrightColorsStrength(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean setSaturationLevel(int p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutoMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CapabilityType {
    }

    private static class ColorDisplayManagerInternal {
        private static android.hardware.display.ColorDisplayManager.ColorDisplayManagerInternal sInstance;
        private final android.hardware.display.IColorDisplayManager mCdm = null;
        private ColorDisplayManagerInternal(android.hardware.display.IColorDisplayManager p0) {}
        public static android.hardware.display.ColorDisplayManager.ColorDisplayManagerInternal getInstance() { return null; }
        int getColorMode() { return 0; }
        int getNightDisplayAutoMode() { return 0; }
        int getNightDisplayAutoModeRaw() { return 0; }
        int getNightDisplayColorTemperature() { return 0; }
        android.hardware.display.Time getNightDisplayCustomEndTime() { return null; }
        android.hardware.display.Time getNightDisplayCustomStartTime() { return null; }
        float getReduceBrightColorsOffsetFactor() { return 0.0f; }
        int getReduceBrightColorsStrength() { return 0; }
        int getTransformCapabilities() { return 0; }
        boolean isDeviceColorManaged() { return false; }
        boolean isDisplayWhiteBalanceEnabled() { return false; }
        boolean isNightDisplayActivated() { return false; }
        boolean isReduceBrightColorsActivated() { return false; }
        boolean isSaturationActivated() { return false; }
        boolean setAppSaturationLevel(java.lang.String p0, int p1) { return false; }
        void setColorMode(int p0) {}
        boolean setDisplayWhiteBalanceEnabled(boolean p0) { return false; }
        boolean setNightDisplayActivated(boolean p0) { return false; }
        boolean setNightDisplayAutoMode(int p0) { return false; }
        boolean setNightDisplayColorTemperature(int p0) { return false; }
        boolean setNightDisplayCustomEndTime(android.hardware.display.Time p0) { return false; }
        boolean setNightDisplayCustomStartTime(android.hardware.display.Time p0) { return false; }
        boolean setReduceBrightColorsActivated(boolean p0) { return false; }
        boolean setReduceBrightColorsStrength(int p0) { return false; }
        boolean setSaturationLevel(int p0) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ColorMode {
    }
}
