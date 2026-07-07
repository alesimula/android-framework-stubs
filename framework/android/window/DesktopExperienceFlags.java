package android.window;

public enum DesktopExperienceFlags {
    DEFER_RESUME_FOCUS_IN_NON_FOCUSED_WINDOW((java.lang.String)null),
    ENABLE_ADD_WINDOW_DECORATION_TO_ALL_TASKS((java.lang.String)null),
    ENABLE_AUTO_RECOVERY_FROM_SELF_KILL((java.lang.String)null),
    ENABLE_AUTO_ROTATE_ON_SLATE_STATE((java.lang.String)null),
    ENABLE_BUG_FIXES_FOR_SECONDARY_DISPLAY((java.lang.String)null),
    ENABLE_DEFAULT_DESK_WITHOUT_WARMUP_MIGRATION((java.lang.String)null),
    ENABLE_DESKTOP_FIRST_BASED_DEFAULT_TO_DESKTOP_BUGFIX((java.lang.String)null),
    ENABLE_DESKTOP_TASKBAR_ON_FREEFORM_DISPLAYS((java.lang.String)null),
    ENABLE_DISPLAY_CONTENT_MODE_MANAGEMENT((java.lang.String)null),
    ENABLE_DISPLAY_DISCONNECT_INTERACTION((java.lang.String)null),
    ENABLE_DISPLAY_RECONNECT_INTERACTION((java.lang.String)null),
    ENABLE_DRAWING_APP_HANDLE((java.lang.String)null),
    ENABLE_FREEFORM_BOX_SHADOWS_V2((java.lang.String)null),
    ENABLE_FULLSCREEN_WINDOW_CONTROLS((java.lang.String)null),
    ENABLE_GAME_CONTROLS_HANDLE_MENU_ENTRY((java.lang.String)null),
    ENABLE_INTERACTION_DEPENDENT_TAB_TEARING_BOUNDS((java.lang.String)null),
    ENABLE_INTERACTIVE_PICTURE_IN_PICTURE((java.lang.String)null),
    ENABLE_MULTIPLE_DESKTOPS_ACTIVATION_IN_DESKTOP_FIRST_DISPLAYS((java.lang.String)null),
    ENABLE_NON_DEFAULT_DISPLAY_SPLIT_BUGFIX((java.lang.String)null),
    ENABLE_PER_DISPLAY_DESKTOP_WALLPAPER_ACTIVITY((java.lang.String)null),
    ENABLE_PROJECTED_DISPLAY_DESKTOP_MODE((java.lang.String)null),
    ENABLE_REENABLE_APP_HANDLE_COLOR_ANIMATIONS((java.lang.String)null),
    ENABLE_REQUEST_FULLSCREEN_REFACTOR((java.lang.String)null),
    ENABLE_REQUIRE_MOVABLE_TASK_API((java.lang.String)null),
    ENABLE_SYS_DECORS_CALLBACKS_VIA_WM((java.lang.String)null),
    ENABLE_TASKBAR_CONNECTED_DISPLAYS((java.lang.String)null),
    ENABLE_WINDOW_DECORATION_REFACTOR((java.lang.String)null),
    ENABLE_WINDOW_REPOSITIONING_API((java.lang.String)null),
    USE_RESOURCES_FROM_CONTEXT_TO_CREATE_DRAWABLE_ICONS((java.lang.String)null);
    private static final android.window.DesktopExperienceFlags[] $VALUES = null;
    public static final java.lang.String SYSTEM_PROPERTY_NAME = "persist.wm.debug.desktop_experience_devopts";
    public static final java.lang.String SYSTEM_PROPERTY_OVERRIDE_PREFIX = "persist.wm.debug.desktop_experience.add_dev_option.";
    private static final java.lang.String TAG = "DesktopExperienceFlags";
    private static android.content.Context sApplicationContext;
    private static java.lang.Boolean sCachedToggleOverride;
    private static java.util.Map<java.lang.String, android.window.DesktopExperienceFlags.DesktopExperienceFlag> sDynamicFlags;
    private final java.util.function.BooleanSupplier mFlagFunction = null;
    private final java.lang.String mFlagName = null;
    private final boolean mShouldOverrideByDevOption = false;
    private DesktopExperienceFlags(java.lang.String p0) {}
    static android.content.Context getApplicationContext() { return null; }
    public static java.util.List<android.window.DesktopExperienceFlags.DesktopExperienceFlag> getRegisteredFlags() { return null; }
    public static boolean getToggleOverride() { return false; }
    static boolean isDesktopExperienceDevOptionSupported() { return false; }
    private static boolean isDesktopModeDevOptionSupported() { return false; }
    private static boolean isFlagTrue(java.util.function.BooleanSupplier p0, boolean p1) { return false; }
    private static boolean isToggleOverriddenBySystem() { return false; }
    private static void registerFlag(java.lang.String p0, android.window.DesktopExperienceFlags.DesktopExperienceFlag p1) {}
    public java.lang.String getFlagName() { return null; }
    public boolean getFlagValue() { return false; }
    public boolean isOverridable() { return false; }
    public boolean isTrue() { return false; }

    public static class DesktopExperienceFlag {
        private final java.util.function.BooleanSupplier mFlagFunction = null;
        private final java.lang.String mFlagName = null;
        private final boolean mShouldOverrideByDevOption = false;
        public DesktopExperienceFlag(java.util.function.BooleanSupplier p0, boolean p1, java.lang.String p2) {}
        public java.lang.String getFlagName() { return null; }
        public boolean getFlagValue() { return false; }
        public boolean isOverridable() { return false; }
        public boolean isTrue() { return false; }
    }
}
