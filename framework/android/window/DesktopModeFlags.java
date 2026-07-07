package android.window;

public enum DesktopModeFlags {
    ENABLE_DESKTOP_APP_HANDLE_ANIMATION,
    ENABLE_DESKTOP_WINDOWING_APP_TO_WEB_EDUCATION,
    ENABLE_DESKTOP_WINDOWING_MODE,
    ENABLE_HANDLE_INPUT_FIX,
    ENABLE_RESIZING_METRICS,
    ENABLE_TASKBAR_OVERFLOW,
    ENABLE_TASK_STACK_OBSERVER_IN_SHELL;
    private static final android.window.DesktopModeFlags[] $VALUES = null;
    private static final java.lang.String TAG = "DesktopModeFlags";
    private static android.window.DesktopModeFlags.ToggleOverride sCachedRawToggleOverride;
    private static android.window.DesktopModeFlags.ToggleOverride sCachedToggleOverride;
    private final java.util.function.BooleanSupplier mFlagFunction = null;
    private final boolean mShouldOverrideByDevOption = false;
    private DesktopModeFlags() {}
    private static android.window.DesktopModeFlags.ToggleOverride getRawToggleOverride() { return null; }
    private static android.window.DesktopModeFlags.ToggleOverride getToggleOverride() { return null; }
    private static android.window.DesktopModeFlags.ToggleOverride getToggleOverrideFromSystem() { return null; }
    public static boolean isDesktopModeForcedEnabled() { return false; }
    private static boolean isFlagTrue(java.util.function.BooleanSupplier p0, boolean p1) { return false; }
    public boolean isTrue() { return false; }

    public static class DesktopModeFlag {
        private final java.util.function.BooleanSupplier mFlagFunction = null;
        private final boolean mShouldOverrideByDevOption = false;
        public DesktopModeFlag(java.util.function.BooleanSupplier p0, boolean p1) {}
        public boolean isTrue() { return false; }
    }

    public static enum ToggleOverride {
        OVERRIDE_OFF,
        OVERRIDE_ON,
        OVERRIDE_UNSET;
        private static final android.window.DesktopModeFlags.ToggleOverride[] $VALUES = null;
        private ToggleOverride() {}
        public static android.window.DesktopModeFlags.ToggleOverride fromSetting(int p0, android.window.DesktopModeFlags.ToggleOverride p1) { return null; }
        public int getSetting() { return 0; }
    }
}
