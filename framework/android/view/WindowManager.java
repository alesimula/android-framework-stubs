package android.view;

public interface WindowManager extends android.view.ViewManager {
    public static final boolean ACTIVITY_EMBEDDING_GUARD_WITH_ANDROID_15 = Boolean.valueOf(false);
    public static final java.lang.String ALLOW_HOME_ACTIVITY_ALWAYS_PRESENT = "android.window.ALLOW_HOME_ACTIVITY_ALWAYS_PRESENT";
    public static final int COMPAT_SMALL_COVER_SCREEN_OPT_IN = 1;
    @android.annotation.SystemApi
    public static final int DISPLAY_IME_POLICY_FALLBACK_DISPLAY = 1;
    @android.annotation.SystemApi
    public static final int DISPLAY_IME_POLICY_HIDE = 2;
    @android.annotation.SystemApi
    public static final int DISPLAY_IME_POLICY_LOCAL = 0;
    public static final int DOCKED_BOTTOM = 4;
    public static final int DOCKED_INVALID = -1;
    public static final int DOCKED_LEFT = 1;
    public static final int DOCKED_RIGHT = 3;
    public static final int DOCKED_TOP = 2;
    public static final long ENABLE_ACTIVITY_EMBEDDING_FOR_ANDROID_15 = 306666082L;
    public static final int ENGAGEMENT_CONTROL_FLAG_SUSTAIN_VISUALS = 1;
    public static final int ENGAGEMENT_MODE_FLAG_AUDIO_ON = 2;
    public static final int ENGAGEMENT_MODE_FLAG_VISUALS_ON = 1;
    public static final boolean HAS_WINDOW_EXTENSIONS_ON_DEVICE = Boolean.valueOf(false);
    public static final java.lang.String INPUT_CONSUMER_NAVIGATION = "nav_input_consumer";
    public static final java.lang.String INPUT_CONSUMER_PIP = "pip_input_consumer";
    public static final java.lang.String INPUT_CONSUMER_RECENTS_ANIMATION = "recents_animation_input_consumer";
    public static final java.lang.String INPUT_CONSUMER_WALLPAPER = "wallpaper_input_consumer";
    public static final int KEYGUARD_VISIBILITY_TRANSIT_FLAGS = 47360;
    public static final int LARGE_SCREEN_SMALLEST_SCREEN_WIDTH_DP = 600;
    public static final java.lang.String PARCEL_KEY_A11Y_EMBEDDED_CONNECTION = "a11y_embedded_connection";
    public static final java.lang.String PARCEL_KEY_SHORTCUTS_ARRAY = "shortcuts_array";
    public static final java.lang.String PROPERTY_ACTIVITY_EMBEDDING_ALLOW_SYSTEM_OVERRIDE = "android.window.PROPERTY_ACTIVITY_EMBEDDING_ALLOW_SYSTEM_OVERRIDE";
    public static final java.lang.String PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED = "android.window.PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED";
    public static final java.lang.String PROPERTY_ALLOW_UNTRUSTED_ACTIVITY_EMBEDDING_STATE_SHARING = "android.window.PROPERTY_ALLOW_UNTRUSTED_ACTIVITY_EMBEDDING_STATE_SHARING";
    public static final java.lang.String PROPERTY_CAMERA_COMPAT_ALLOW_FORCE_ROTATION = "android.window.PROPERTY_CAMERA_COMPAT_ALLOW_FORCE_ROTATION";
    public static final java.lang.String PROPERTY_CAMERA_COMPAT_ALLOW_REFRESH = "android.window.PROPERTY_CAMERA_COMPAT_ALLOW_REFRESH";
    public static final java.lang.String PROPERTY_CAMERA_COMPAT_ALLOW_SIMULATE_REQUESTED_ORIENTATION = "android.window.PROPERTY_CAMERA_COMPAT_ALLOW_SIMULATE_REQUESTED_ORIENTATION";
    public static final java.lang.String PROPERTY_CAMERA_COMPAT_ENABLE_REFRESH_VIA_PAUSE = "android.window.PROPERTY_CAMERA_COMPAT_ENABLE_REFRESH_VIA_PAUSE";
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_DISPLAY_ORIENTATION_OVERRIDE = "android.window.PROPERTY_COMPAT_ALLOW_DISPLAY_ORIENTATION_OVERRIDE";
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_EXCLUDE_CAPTION_INSETS = "android.window.PROPERTY_COMPAT_ALLOW_EXCLUDE_CAPTION_INSETS";
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_IGNORING_ORIENTATION_REQUEST_WHEN_LOOP_DETECTED = "android.window.PROPERTY_COMPAT_ALLOW_IGNORING_ORIENTATION_REQUEST_WHEN_LOOP_DETECTED";
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_MIN_ASPECT_RATIO_OVERRIDE = "android.window.PROPERTY_COMPAT_ALLOW_MIN_ASPECT_RATIO_OVERRIDE";
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_ORIENTATION_OVERRIDE = "android.window.PROPERTY_COMPAT_ALLOW_ORIENTATION_OVERRIDE";
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_RESIZEABLE_ACTIVITY_OVERRIDES = "android.window.PROPERTY_COMPAT_ALLOW_RESIZEABLE_ACTIVITY_OVERRIDES";
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_RESTRICTED_RESIZABILITY = "android.window.PROPERTY_COMPAT_ALLOW_RESTRICTED_RESIZABILITY";
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_SAFE_REGION_LETTERBOXING = "android.window.PROPERTY_COMPAT_ALLOW_SAFE_REGION_LETTERBOXING";
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_SANDBOXING_VIEW_BOUNDS_APIS = "android.window.PROPERTY_COMPAT_ALLOW_SANDBOXING_VIEW_BOUNDS_APIS";
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_SMALL_COVER_SCREEN = "android.window.PROPERTY_COMPAT_ALLOW_SMALL_COVER_SCREEN";
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_SYNCHRONIZED_INSETS_ANIMATION = "android.window.PROPERTY_COMPAT_ALLOW_SYNCHRONIZED_INSETS_ANIMATION";
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_USER_ASPECT_RATIO_FULLSCREEN_OVERRIDE = "android.window.PROPERTY_COMPAT_ALLOW_USER_ASPECT_RATIO_FULLSCREEN_OVERRIDE";
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_USER_ASPECT_RATIO_OVERRIDE = "android.window.PROPERTY_COMPAT_ALLOW_USER_ASPECT_RATIO_OVERRIDE";
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_VIRTUAL_GAMEPAD_OVERRIDE = "android.window.PROPERTY_COMPAT_ALLOW_VIRTUAL_GAMEPAD_OVERRIDE";
    public static final java.lang.String PROPERTY_COMPAT_ENABLE_FAKE_FOCUS = "android.window.PROPERTY_COMPAT_ENABLE_FAKE_FOCUS";
    public static final java.lang.String PROPERTY_COMPAT_IGNORE_REQUESTED_ORIENTATION = "android.window.PROPERTY_COMPAT_IGNORE_REQUESTED_ORIENTATION";
    @android.annotation.SystemApi
    public static final java.lang.String PROPERTY_PREFER_FULLSCREEN_IN_NEW_TASK = "android.window.PROPERTY_PREFER_FULLSCREEN_IN_NEW_TASK";
    public static final java.lang.String PROPERTY_SUPPORTS_MULTI_INSTANCE_SYSTEM_UI = "android.window.PROPERTY_SUPPORTS_MULTI_INSTANCE_SYSTEM_UI";
    public static final int REMOVE_CONTENT_MODE_DESTROY = 2;
    public static final int REMOVE_CONTENT_MODE_MOVE_TO_PRIMARY = 1;
    public static final int REMOVE_CONTENT_MODE_UNDEFINED = 0;
    public static final int SCREEN_RECORDING_STATE_NOT_VISIBLE = 0;
    public static final int SCREEN_RECORDING_STATE_VISIBLE = 1;
    public static final int SHELL_ROOT_LAYER_DIVIDER = 0;
    public static final int SHELL_ROOT_LAYER_PIP = 1;
    public static final int TAKE_SCREENSHOT_FULLSCREEN = 1;
    public static final int TAKE_SCREENSHOT_PROVIDED_IMAGE = 3;
    public static final int TRANSIT_CHANGE = 6;
    public static final int TRANSIT_CLOSE = 2;
    public static final int TRANSIT_CLOSE_PREPARE_BACK_NAVIGATION = 14;
    public static final int TRANSIT_FIRST_CUSTOM = 1000;
    public static final int TRANSIT_FLAG_AOD_APPEARING = 32768;
    public static final int TRANSIT_FLAG_APP_CRASHED = 16;
    public static final int TRANSIT_FLAG_AVOID_MOVE_TO_FRONT = 65536;
    public static final int TRANSIT_FLAG_DISPLAY_LEVEL_TRANSITION = 131072;
    public static final int TRANSIT_FLAG_INVISIBLE = 1024;
    public static final int TRANSIT_FLAG_IS_RECENTS = 128;
    public static final int TRANSIT_FLAG_KEYGUARD_APPEARING = 2048;
    public static final int TRANSIT_FLAG_KEYGUARD_GOING_AWAY = 256;
    public static final int TRANSIT_FLAG_KEYGUARD_GOING_AWAY_NO_ANIMATION = 2;
    public static final int TRANSIT_FLAG_KEYGUARD_GOING_AWAY_SUBTLE_ANIMATION = 8;
    public static final int TRANSIT_FLAG_KEYGUARD_GOING_AWAY_TO_LAUNCHER_CLEAR_SNAPSHOT = 512;
    public static final int TRANSIT_FLAG_KEYGUARD_GOING_AWAY_TO_SHADE = 1;
    public static final int TRANSIT_FLAG_KEYGUARD_GOING_AWAY_WITH_WALLPAPER = 4;
    public static final int TRANSIT_FLAG_KEYGUARD_LOCKED = 64;
    public static final int TRANSIT_FLAG_KEYGUARD_OCCLUDING = 4096;
    public static final int TRANSIT_FLAG_KEYGUARD_UNOCCLUDING = 8192;
    public static final int TRANSIT_FLAG_OPEN_BEHIND = 32;
    @java.lang.Deprecated
    public static final int TRANSIT_KEYGUARD_GOING_AWAY = 7;
    public static final int TRANSIT_KEYGUARD_OCCLUDE = 8;
    public static final int TRANSIT_KEYGUARD_UNOCCLUDE = 9;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_OLD_ACTIVITY_CLOSE = 7;
    public static final int TRANSIT_OLD_ACTIVITY_OPEN = 6;
    public static final int TRANSIT_OLD_KEYGUARD_GOING_AWAY = 20;
    public static final int TRANSIT_OLD_KEYGUARD_GOING_AWAY_ON_WALLPAPER = 21;
    public static final int TRANSIT_OLD_KEYGUARD_OCCLUDE = 22;
    public static final int TRANSIT_OLD_KEYGUARD_OCCLUDE_BY_DREAM = 33;
    public static final int TRANSIT_OLD_KEYGUARD_UNOCCLUDE = 23;
    public static final int TRANSIT_OLD_NONE = 0;
    public static final int TRANSIT_OLD_TASK_FRAGMENT_CHANGE = 30;
    public static final int TRANSIT_OLD_TASK_FRAGMENT_CLOSE = 29;
    public static final int TRANSIT_OLD_TASK_FRAGMENT_OPEN = 28;
    public static final int TRANSIT_OLD_TASK_OPEN = 8;
    public static final int TRANSIT_OLD_TASK_TO_BACK = 11;
    public static final int TRANSIT_OLD_TASK_TO_FRONT = 10;
    public static final int TRANSIT_OLD_UNSET = -1;
    public static final int TRANSIT_OLD_WALLPAPER_CLOSE = 12;
    public static final int TRANSIT_OLD_WALLPAPER_OPEN = 13;
    public static final int TRANSIT_OPEN = 1;
    public static final int TRANSIT_PIP = 10;
    public static final int TRANSIT_PREPARE_BACK_NAVIGATION = 13;
    public static final int TRANSIT_RELAUNCH = 5;
    public static final int TRANSIT_SLEEP = 12;
    public static final int TRANSIT_START_LOCK_TASK_MODE = 15;
    public static final int TRANSIT_TO_BACK = 4;
    public static final int TRANSIT_TO_FRONT = 3;
    public static final int TRANSIT_WAKE = 11;
    public static float fixScale(float p0) { return 0.0f; }
    public static boolean hasWindowExtensionsEnabled() { return false; }
    public static java.lang.String transitTypeToString(int p0) { return null; }
    default public void addCrossWindowBlurEnabledListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
    default public void addCrossWindowBlurEnabledListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    @android.annotation.SystemApi
    default public void addEngagementControlRequestConsumer(java.util.concurrent.Executor p0, java.util.function.Consumer<android.view.WindowManager.EngagementControlRequest> p1) {}
    default public void addProposedRotationListener(java.util.concurrent.Executor p0, java.util.function.IntConsumer p1) {}
    default public int addScreenRecordingCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) { return 0; }
    default public android.view.WindowManager createLocalWindowManager(android.view.Window p0) { return null; }
    public android.view.KeyboardShortcutGroup getApplicationLaunchKeyboardShortcuts(int p0);
    @android.annotation.SystemApi
    public android.graphics.Region getCurrentImeTouchRegion();
    default public android.view.WindowMetrics getCurrentWindowMetrics() { return null; }
    @java.lang.Deprecated
    public android.view.Display getDefaultDisplay();
    default public android.os.IBinder getDefaultToken() { return null; }
    default public int getDisplayEngagementMode(int p0) { return 0; }
    default public int getDisplayImePolicy(int p0) { return 0; }
    default public android.view.WindowMetrics getMaximumWindowMetrics() { return null; }
    default public java.util.Set<android.view.WindowMetrics> getPossibleMaximumWindowMetrics(int p0) { return null; }
    default public android.os.IBinder getSurfaceControlInputClientToken(android.view.SurfaceControl p0) { return null; }
    default public void holdLock(android.os.IBinder p0, int p1) {}
    default public boolean isCrossWindowBlurEnabled() { return false; }
    default public boolean isEligibleForDesktopMode(int p0) { return false; }
    default public boolean isGlobalKey(int p0) { return false; }
    default public boolean isTaskSnapshotSupported() { return false; }
    @android.annotation.SystemApi
    default public java.util.List<android.content.ComponentName> notifyScreenshotListeners(int p0) { return null; }
    default public android.window.InputTransferToken registerBatchedSurfaceControlInputReceiver(android.window.InputTransferToken p0, android.view.SurfaceControl p1, android.view.Choreographer p2, android.view.SurfaceControlInputReceiver p3) { return null; }
    default public void registerDisplayEngagementModeCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<android.view.WindowManager.DisplayEngagementModeState> p1) {}
    @android.annotation.SystemApi
    default public void registerTaskFpsCallback(int p0, java.util.concurrent.Executor p1, android.window.TaskFpsCallback p2) {}
    default public void registerTrustedPresentationListener(android.os.IBinder p0, android.window.TrustedPresentationThresholds p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    default public android.window.InputTransferToken registerUnbatchedSurfaceControlInputReceiver(android.window.InputTransferToken p0, android.view.SurfaceControl p1, android.os.Looper p2, android.view.SurfaceControlInputReceiver p3) { return null; }
    default public void removeCrossWindowBlurEnabledListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    @android.annotation.SystemApi
    default public void removeEngagementControlRequestConsumer(java.util.function.Consumer<android.view.WindowManager.EngagementControlRequest> p0) {}
    default public void removeProposedRotationListener(java.util.function.IntConsumer p0) {}
    default public void removeScreenRecordingCallback(java.util.function.Consumer<java.lang.Integer> p0) {}
    public void removeViewImmediate(android.view.View p0);
    default public boolean replaceContentOnDisplayWithMirror(int p0, android.view.Window p1) { return false; }
    default public boolean replaceContentOnDisplayWithSc(int p0, android.view.SurfaceControl p1) { return false; }
    public void requestAppKeyboardShortcuts(android.view.WindowManager.KeyboardShortcutsReceiver p0, int p1);
    default public void requestEngagementControlState(int p0) {}
    default public void requestImeKeyboardShortcuts(android.view.WindowManager.KeyboardShortcutsReceiver p0, int p1) {}
    @android.annotation.SystemApi
    default public void setDisplayEngagementMode(int p0, int p1) {}
    default public void setDisplayImePolicy(int p0, int p1) {}
    default public void setParentWindow(android.view.Window p0) {}
    default public void setShouldShowWithInsecureKeyguard(int p0, boolean p1) {}
    default public boolean shouldShowSystemDecors(int p0) { return false; }
    default public android.graphics.Bitmap snapshotTaskForRecents(int p0) { return null; }
    default public boolean transferTouchGesture(android.window.InputTransferToken p0, android.window.InputTransferToken p1) { return false; }
    default public void unregisterDisplayEngagementModeCallback(java.util.function.Consumer<android.view.WindowManager.DisplayEngagementModeState> p0) {}
    default public void unregisterSurfaceControlInputReceiver(android.view.SurfaceControl p0) {}
    @android.annotation.SystemApi
    default public void unregisterTaskFpsCallback(android.window.TaskFpsCallback p0) {}
    default public void unregisterTrustedPresentationListener(java.util.function.Consumer<java.lang.Boolean> p0) {}

    public static class BadTokenException extends java.lang.RuntimeException {
        public BadTokenException() { super(); }
        public BadTokenException(java.lang.String p0) { super(); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CompatSmallScreenPolicy {
    }

    public static final class DisplayEngagementModeState {
        private final int mDisplayId = 0;
        private final int mEngagementModeFlags = 0;
        DisplayEngagementModeState(int p0, int p1) {}
        public int getDisplayId() { return 0; }
        public int getEngagementModeFlags() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisplayImePolicy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EngagementControlFlags {
    }

    @android.annotation.SystemApi
    public static final class EngagementControlRequest {
        private final int mDisplayId = 0;
        private final int mEngagementControlFlags = 0;
        private final int mTaskId = 0;
        public EngagementControlRequest(int p0, int p1, int p2) {}
        public int getDisplayId() { return 0; }
        public int getEngagementControlFlags() { return 0; }
        public int getTaskId() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EngagementModeFlags {
    }

    @android.annotation.SystemApi
    public static class InsetsParams {
        private android.graphics.Insets mInsets;
        private final int mType = 0;
        public InsetsParams(int p0) {}
        public android.graphics.Insets getInsetsSize() { return null; }
        public int getType() { return 0; }
        public android.view.WindowManager.InsetsParams setInsetsSize(android.graphics.Insets p0) { return null; }
    }

    public static class InvalidDisplayException extends java.lang.RuntimeException {
        public InvalidDisplayException() { super(); }
        public InvalidDisplayException(java.lang.String p0) { super(); }
    }

    public static interface KeyboardShortcutsReceiver {
        public void onKeyboardShortcutsReceived(java.util.List<android.view.KeyboardShortcutGroup> p0);
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams implements android.os.Parcelable {
        public static final int ACCESSIBILITY_ANCHOR_CHANGED = 16777216;
        public static final int ACCESSIBILITY_TITLE_CHANGED = 33554432;
        public static final int ALPHA_CHANGED = 128;
        public static final int ANIMATION_CHANGED = 16;
        public static final int BLUR_BEHIND_RADIUS_CHANGED = 536870912;
        public static final float BRIGHTNESS_OVERRIDE_FULL = 1.0f;
        public static final float BRIGHTNESS_OVERRIDE_NONE = -1.0f;
        public static final float BRIGHTNESS_OVERRIDE_OFF = 0.0f;
        public static final int BUTTON_BRIGHTNESS_CHANGED = 8192;
        public static final int COLOR_MODE_CHANGED = 67108864;
        public static final android.os.Parcelable.Creator<android.view.WindowManager.LayoutParams> CREATOR = null;
        public static final int DIM_AMOUNT_CHANGED = 32;
        public static final int DISPLAY_FLAGS_CHANGED = 4194304;
        public static final int DISPLAY_FLAG_DISABLE_HDR_CONVERSION = 1;
        public static final int FIRST_APPLICATION_WINDOW = 1;
        public static final int FIRST_SUB_WINDOW = 1000;
        public static final int FIRST_SYSTEM_WINDOW = 2000;
        public static final int FLAGS_CHANGED = 4;
        public static final int FLAG_ALLOW_LOCK_WHILE_SCREEN_ON = 1;
        public static final int FLAG_ALT_FOCUSABLE_IM = 131072;
        public static final int FLAG_BLUR_BEHIND = 4;
        public static final int FLAG_DIM_BEHIND = 2;
        @java.lang.Deprecated
        public static final int FLAG_DISMISS_KEYGUARD = 4194304;
        @java.lang.Deprecated
        public static final int FLAG_DITHER = 4096;
        public static final int FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS = -2147483648;
        @java.lang.Deprecated
        public static final int FLAG_FORCE_NOT_FULLSCREEN = 2048;
        @java.lang.Deprecated
        public static final int FLAG_FULLSCREEN = 1024;
        public static final int FLAG_HARDWARE_ACCELERATED = 16777216;
        public static final int FLAG_IGNORE_CHEEK_PRESSES = 32768;
        public static final int FLAG_KEEP_SCREEN_ON = 128;
        @java.lang.Deprecated
        public static final int FLAG_LAYOUT_ATTACHED_IN_DECOR = 1073741824;
        @java.lang.Deprecated
        public static final int FLAG_LAYOUT_INSET_DECOR = 65536;
        @java.lang.Deprecated
        public static final int FLAG_LAYOUT_IN_OVERSCAN = 33554432;
        public static final int FLAG_LAYOUT_IN_SCREEN = 256;
        public static final int FLAG_LAYOUT_NO_LIMITS = 512;
        public static final int FLAG_LOCAL_FOCUS_MODE = 268435456;
        public static final int FLAG_NOT_FOCUSABLE = 8;
        public static final int FLAG_NOT_TOUCHABLE = 16;
        public static final int FLAG_NOT_TOUCH_MODAL = 32;
        public static final int FLAG_SCALED = 16384;
        public static final int FLAG_SECURE = 8192;
        public static final int FLAG_SHOW_WALLPAPER = 1048576;
        @java.lang.Deprecated
        public static final int FLAG_SHOW_WHEN_LOCKED = 524288;
        public static final int FLAG_SLIPPERY = 536870912;
        public static final int FLAG_SPLIT_TOUCH = 8388608;
        @java.lang.Deprecated
        public static final int FLAG_TOUCHABLE_WHEN_WAKING = 64;
        @java.lang.Deprecated
        public static final int FLAG_TRANSLUCENT_NAVIGATION = 134217728;
        @java.lang.Deprecated
        public static final int FLAG_TRANSLUCENT_STATUS = 67108864;
        @java.lang.Deprecated
        public static final int FLAG_TURN_SCREEN_ON = 2097152;
        public static final int FLAG_WATCH_OUTSIDE_TOUCH = 262144;
        public static final int FORMAT_CHANGED = 8;
        public static final int INPUT_FEATURES_CHANGED = 65536;
        public static final int INPUT_FEATURE_CAPTURE_KEYBOARD = 32;
        public static final int INPUT_FEATURE_DISABLE_USER_ACTIVITY = 2;
        public static final int INPUT_FEATURE_DISPLAY_TOPOLOGY_AWARE = 16;
        public static final int INPUT_FEATURE_NO_INPUT_CHANNEL = 1;
        public static final int INPUT_FEATURE_SENSITIVE_FOR_PRIVACY = 8;
        public static final int INPUT_FEATURE_SKIP_FOCUS_DURING_SEARCH = 128;
        public static final int INPUT_FEATURE_SKIP_FOCUS_ON_TOUCH = 64;
        public static final int INPUT_FEATURE_SPY = 4;
        public static final int INSET_FLAGS_CHANGED = 134217728;
        public static final int INVALID_WINDOW_TYPE = -1;
        public static final int LAST_APPLICATION_WINDOW = 99;
        public static final int LAST_SUB_WINDOW = 1999;
        public static final int LAST_SYSTEM_WINDOW = 2999;
        public static final int LAYOUT_CHANGED = 1;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_ALWAYS = 3;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_DEFAULT = 0;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_NEVER = 2;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES = 1;
        public static final int MEMORY_TYPE_CHANGED = 256;
        @java.lang.Deprecated
        public static final int MEMORY_TYPE_GPU = 2;
        @java.lang.Deprecated
        public static final int MEMORY_TYPE_HARDWARE = 1;
        @java.lang.Deprecated
        public static final int MEMORY_TYPE_NORMAL = 0;
        @java.lang.Deprecated
        public static final int MEMORY_TYPE_PUSH_BUFFERS = 3;
        public static final int MINIMAL_POST_PROCESSING_PREFERENCE_CHANGED = 268435456;
        public static final int PREFERRED_DISPLAY_MODE_ID = 8388608;
        public static final int PREFERRED_MAX_DISPLAY_REFRESH_RATE = -2147483648;
        public static final int PREFERRED_MIN_DISPLAY_REFRESH_RATE = 1073741824;
        public static final int PREFERRED_REFRESH_RATE_CHANGED = 2097152;
        public static final int PRIVATE_FLAGS_CHANGED = 131072;
        public static final int PRIVATE_FLAG_ALLOW_ACTION_KEY_EVENTS = 8388608;
        public static final int PRIVATE_FLAG_APP_PROGRESS_GENERATION_ALLOWED = 128;
        public static final int PRIVATE_FLAG_COLOR_SPACE_AGNOSTIC = 16777216;
        public static final int PRIVATE_FLAG_CONSUME_IME_INSETS = 33554432;
        public static final int PRIVATE_FLAG_EDGE_TO_EDGE_ENFORCED = 2048;
        public static final int PRIVATE_FLAG_EXCLUDE_FROM_SCREEN_MAGNIFICATION = 2097152;
        public static final int PRIVATE_FLAG_FIT_INSETS_CONTROLLED = 268435456;
        public static final int PRIVATE_FLAG_IMMERSIVE_CONFIRMATION_WINDOW = 131072;
        public static final int PRIVATE_FLAG_INPUT_METHOD_WINDOW = 134217728;
        public static final int PRIVATE_FLAG_INSET_PARENT_FRAME_BY_IME = 1073741824;
        public static final int PRIVATE_FLAG_INTERCEPT_GLOBAL_DRAG_AND_DROP = -2147483648;
        public static final int PRIVATE_FLAG_IS_ROUNDED_CORNERS_OVERLAY = 1048576;
        public static final int PRIVATE_FLAG_LAYOUT_CHILD_WINDOW_IN_PARENT_FRAME = 16384;
        public static final int PRIVATE_FLAG_LAYOUT_SIZE_EXTENDED_BY_CUTOUT = 4096;
        public static final int PRIVATE_FLAG_NOT_MAGNIFIABLE = 4194304;
        public static final int PRIVATE_FLAG_NO_MOVE_ANIMATION = 64;
        public static final int PRIVATE_FLAG_OPTIMIZE_MEASURE = 512;
        public static final int PRIVATE_FLAG_OPT_OUT_EDGE_TO_EDGE = 67108864;
        public static final int PRIVATE_FLAG_OVERRIDE_LAYOUT_IN_DISPLAY_CUTOUT_MODE = 262144;
        public static final int PRIVATE_FLAG_SYSTEM_APPLICATION_OVERLAY = 8;
        public static final int PRIVATE_FLAG_SYSTEM_ERROR = 256;
        public static final int PRIVATE_FLAG_TRUSTED_OVERLAY = 536870912;
        public static final int PRIVATE_FLAG_UNRESTRICTED_GESTURE_EXCLUSION = 32;
        public static final int PRIVATE_FLAG_WANTS_OFFSET_NOTIFICATIONS = 4;
        public static final int RENDERING_HINT_DISABLE_IPC_RENDERING = 32;
        public static final int RENDERING_HINT_DISABLE_PERFORMANCE_HINT = 1;
        public static final int RENDERING_HINT_FORCE_DRAW_BAR_BACKGROUNDS = 4;
        public static final int RENDERING_HINT_FORCE_HARDWARE_ACCELERATED = 2;
        public static final int RENDERING_HINT_LOW_PRIORITY = 16;
        public static final int RENDERING_HINT_SUSTAINED_PERFORMANCE_MODE = 8;
        public static final int ROTATION_ANIMATION_CHANGED = 4096;
        public static final int ROTATION_ANIMATION_CROSSFADE = 1;
        public static final int ROTATION_ANIMATION_JUMPCUT = 2;
        public static final int ROTATION_ANIMATION_ROTATE = 0;
        public static final int ROTATION_ANIMATION_SEAMLESS = 3;
        public static final int ROTATION_ANIMATION_UNSPECIFIED = -1;
        public static final int SCREEN_BRIGHTNESS_CHANGED = 2048;
        public static final int SCREEN_ORIENTATION_CHANGED = 1024;
        public static final int SOFT_INPUT_ADJUST_NOTHING = 48;
        public static final int SOFT_INPUT_ADJUST_PAN = 32;
        @java.lang.Deprecated
        public static final int SOFT_INPUT_ADJUST_RESIZE = 16;
        public static final int SOFT_INPUT_ADJUST_UNSPECIFIED = 0;
        public static final int SOFT_INPUT_IS_FORWARD_NAVIGATION = 256;
        public static final int SOFT_INPUT_MASK_ADJUST = 240;
        public static final int SOFT_INPUT_MASK_STATE = 15;
        public static final int SOFT_INPUT_MODE_CHANGED = 512;
        public static final int SOFT_INPUT_STATE_ALWAYS_HIDDEN = 3;
        public static final int SOFT_INPUT_STATE_ALWAYS_VISIBLE = 5;
        public static final int SOFT_INPUT_STATE_HIDDEN = 2;
        public static final int SOFT_INPUT_STATE_UNCHANGED = 1;
        public static final int SOFT_INPUT_STATE_UNSPECIFIED = 0;
        public static final int SOFT_INPUT_STATE_VISIBLE = 4;
        public static final int SURFACE_INSETS_CHANGED = 1048576;
        @android.annotation.SystemApi
        public static final int SYSTEM_FLAG_HIDE_NON_SYSTEM_OVERLAY_WINDOWS = 524288;
        @android.annotation.SystemApi
        public static final int SYSTEM_FLAG_SHOW_FOR_ALL_USERS = 16;
        public static final int SYSTEM_UI_LISTENER_CHANGED = 32768;
        public static final int SYSTEM_UI_VISIBILITY_CHANGED = 16384;
        public static final int TITLE_CHANGED = 64;
        public static final int TRANSLUCENT_FLAGS_CHANGED = 524288;
        public static final int TYPE_ACCESSIBILITY_MAGNIFICATION_OVERLAY = 2039;
        public static final int TYPE_ACCESSIBILITY_OVERLAY = 2032;
        public static final int TYPE_APPLICATION = 2;
        public static final int TYPE_APPLICATION_ABOVE_SUB_PANEL = 1005;
        public static final int TYPE_APPLICATION_ATTACHED_DIALOG = 1003;
        public static final int TYPE_APPLICATION_CAPTION_BAR = 1006;
        public static final int TYPE_APPLICATION_MEDIA = 1001;
        public static final int TYPE_APPLICATION_MEDIA_OVERLAY = 1004;
        public static final int TYPE_APPLICATION_OVERLAY = 2038;
        public static final int TYPE_APPLICATION_PANEL = 1000;
        public static final int TYPE_APPLICATION_STARTING = 3;
        public static final int TYPE_APPLICATION_SUB_PANEL = 1002;
        public static final int TYPE_BASE_APPLICATION = 1;
        public static final int TYPE_BOOT_PROGRESS = 2021;
        public static final int TYPE_CHANGED = 2;
        public static final int TYPE_DISPLAY_OVERLAY = 2026;
        public static final int TYPE_DOCK_DIVIDER = 2034;
        public static final int TYPE_DRAG = 2016;
        public static final int TYPE_DRAWN_APPLICATION = 4;
        public static final int TYPE_INPUT_CONSUMER = 2022;
        public static final int TYPE_INPUT_METHOD = 2011;
        public static final int TYPE_INPUT_METHOD_DIALOG = 2012;
        public static final int TYPE_KEYGUARD = 2004;
        public static final int TYPE_KEYGUARD_DIALOG = 2009;
        public static final int TYPE_MAGNIFICATION_OVERLAY = 2027;
        public static final int TYPE_NAVIGATION_BAR = 2019;
        public static final int TYPE_NAVIGATION_BAR_PANEL = 2024;
        public static final int TYPE_NOTIFICATION_SHADE = 2040;
        @java.lang.Deprecated
        public static final int TYPE_PHONE = 2002;
        public static final int TYPE_POINTER = 2018;
        public static final int TYPE_PRESENTATION = 2037;
        @java.lang.Deprecated
        public static final int TYPE_PRIORITY_PHONE = 2007;
        public static final int TYPE_PRIVATE_PRESENTATION = 2030;
        public static final int TYPE_QS_DIALOG = 2035;
        public static final int TYPE_SCREENSHOT = 2036;
        public static final int TYPE_SEARCH_BAR = 2001;
        public static final int TYPE_SECURE_SYSTEM_OVERLAY = 2015;
        public static final int TYPE_STATUS_BAR = 2000;
        public static final int TYPE_STATUS_BAR_ADDITIONAL = 2041;
        public static final int TYPE_STATUS_BAR_PANEL = 2014;
        public static final int TYPE_STATUS_BAR_SUB_PANEL = 2017;
        @java.lang.Deprecated
        public static final int TYPE_SYSTEM_ALERT = 2003;
        public static final int TYPE_SYSTEM_DIALOG = 2008;
        @java.lang.Deprecated
        public static final int TYPE_SYSTEM_ERROR = 2010;
        @java.lang.Deprecated
        public static final int TYPE_SYSTEM_OVERLAY = 2006;
        @java.lang.Deprecated
        public static final int TYPE_TOAST = 2005;
        public static final int TYPE_VOICE_INTERACTION = 2031;
        public static final int TYPE_VOICE_INTERACTION_STARTING = 2033;
        public static final int TYPE_VOLUME_OVERLAY = 2020;
        public static final int TYPE_WALLPAPER = 2013;
        public static final int USER_ACTIVITY_TIMEOUT_CHANGED = 262144;
        private static boolean sToolkitSetFrameRateReadOnlyFlagValue;
        public long accessibilityIdOfAnchor;
        public java.lang.CharSequence accessibilityTitle;
        public float alpha;
        public float buttonBrightness;
        public float dimAmount;
        public long dimColor;
        @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(equals=1, mask=1, name="ALLOW_LOCK_WHILE_SCREEN_ON"), @android.view.ViewDebug.FlagToString(equals=2, mask=2, name="DIM_BEHIND"), @android.view.ViewDebug.FlagToString(equals=4, mask=4, name="BLUR_BEHIND"), @android.view.ViewDebug.FlagToString(equals=8, mask=8, name="NOT_FOCUSABLE"), @android.view.ViewDebug.FlagToString(equals=16, mask=16, name="NOT_TOUCHABLE"), @android.view.ViewDebug.FlagToString(equals=32, mask=32, name="NOT_TOUCH_MODAL"), @android.view.ViewDebug.FlagToString(equals=64, mask=64, name="TOUCHABLE_WHEN_WAKING"), @android.view.ViewDebug.FlagToString(equals=128, mask=128, name="KEEP_SCREEN_ON"), @android.view.ViewDebug.FlagToString(equals=256, mask=256, name="LAYOUT_IN_SCREEN"), @android.view.ViewDebug.FlagToString(equals=512, mask=512, name="LAYOUT_NO_LIMITS"), @android.view.ViewDebug.FlagToString(equals=1024, mask=1024, name="FULLSCREEN"), @android.view.ViewDebug.FlagToString(equals=2048, mask=2048, name="FORCE_NOT_FULLSCREEN"), @android.view.ViewDebug.FlagToString(equals=4096, mask=4096, name="DITHER"), @android.view.ViewDebug.FlagToString(equals=8192, mask=8192, name="SECURE"), @android.view.ViewDebug.FlagToString(equals=16384, mask=16384, name="SCALED"), @android.view.ViewDebug.FlagToString(equals=32768, mask=32768, name="IGNORE_CHEEK_PRESSES"), @android.view.ViewDebug.FlagToString(equals=65536, mask=65536, name="LAYOUT_INSET_DECOR"), @android.view.ViewDebug.FlagToString(equals=131072, mask=131072, name="ALT_FOCUSABLE_IM"), @android.view.ViewDebug.FlagToString(equals=262144, mask=262144, name="WATCH_OUTSIDE_TOUCH"), @android.view.ViewDebug.FlagToString(equals=524288, mask=524288, name="SHOW_WHEN_LOCKED"), @android.view.ViewDebug.FlagToString(equals=1048576, mask=1048576, name="SHOW_WALLPAPER"), @android.view.ViewDebug.FlagToString(equals=2097152, mask=2097152, name="TURN_SCREEN_ON"), @android.view.ViewDebug.FlagToString(equals=4194304, mask=4194304, name="DISMISS_KEYGUARD"), @android.view.ViewDebug.FlagToString(equals=8388608, mask=8388608, name="SPLIT_TOUCH"), @android.view.ViewDebug.FlagToString(equals=16777216, mask=16777216, name="HARDWARE_ACCELERATED"), @android.view.ViewDebug.FlagToString(equals=33554432, mask=33554432, name="LOCAL_FOCUS_MODE"), @android.view.ViewDebug.FlagToString(equals=67108864, mask=67108864, name="TRANSLUCENT_STATUS"), @android.view.ViewDebug.FlagToString(equals=134217728, mask=134217728, name="TRANSLUCENT_NAVIGATION"), @android.view.ViewDebug.FlagToString(equals=268435456, mask=268435456, name="LOCAL_FOCUS_MODE"), @android.view.ViewDebug.FlagToString(equals=536870912, mask=536870912, name="FLAG_SLIPPERY"), @android.view.ViewDebug.FlagToString(equals=1073741824, mask=1073741824, name="FLAG_LAYOUT_ATTACHED_IN_DECOR"), @android.view.ViewDebug.FlagToString(equals=-2147483648, mask=-2147483648, name="DRAWS_SYSTEM_BAR_BACKGROUNDS")}, formatToHexString=true)
        public int flags;
        public int forciblyShownTypes;
        public int format;
        public int gravity;
        public boolean hasManualSurfaceInsets;
        public boolean hasSystemUiListeners;
        public long hideTimeoutMilliseconds;
        public float horizontalMargin;
        @android.view.ViewDebug.ExportedProperty
        public float horizontalWeight;
        public int inputFeatures;
        public final android.view.InsetsFlags insetsFlags = null;
        public int layoutInDisplayCutoutMode;
        private int mBlurBehindRadius;
        private boolean mCanChangeGlobalTouchMode;
        private int mColorMode;
        private int[] mCompatibilityParamsBackup;
        private float mDesiredHdrHeadroom;
        private int mDisplayFlags;
        private boolean mFitInsetsIgnoringVisibility;
        private int mFitInsetsSides;
        private int mFitInsetsTypes;
        private boolean mFrameRateBoostOnTouch;
        private boolean mIsFrameRatePowerSavingsBalanced;
        private java.lang.CharSequence mTitle;
        private boolean mWallpaperTouchEventsEnabled;
        public android.os.IBinder mWindowContextToken;
        @java.lang.Deprecated
        public int memoryType;
        public java.lang.String packageName;
        public android.view.WindowManager.LayoutParams[] paramsForRotation;
        public boolean preferMinimalPostProcessing;
        public int preferredDisplayModeId;
        public float preferredMaxDisplayRefreshRate;
        public float preferredMinDisplayRefreshRate;
        public float preferredRefreshRate;
        public boolean preservePreviousSurfaceInsets;
        @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(equals=4, mask=4, name="WANTS_OFFSET_NOTIFICATIONS"), @android.view.ViewDebug.FlagToString(equals=16, mask=16, name="SHOW_FOR_ALL_USERS"), @android.view.ViewDebug.FlagToString(equals=32, mask=32, name="UNRESTRICTED_GESTURE_EXCLUSION"), @android.view.ViewDebug.FlagToString(equals=64, mask=64, name="NO_MOVE_ANIMATION"), @android.view.ViewDebug.FlagToString(equals=256, mask=256, name="SYSTEM_ERROR"), @android.view.ViewDebug.FlagToString(equals=512, mask=512, name="OPTIMIZE_MEASURE"), @android.view.ViewDebug.FlagToString(equals=2048, mask=2048, name="EDGE_TO_EDGE_ENFORCED"), @android.view.ViewDebug.FlagToString(equals=4096, mask=4096, name="LAYOUT_SIZE_EXTENDED_BY_CUTOUT"), @android.view.ViewDebug.FlagToString(equals=16384, mask=16384, name="LAYOUT_CHILD_WINDOW_IN_PARENT_FRAME"), @android.view.ViewDebug.FlagToString(equals=131072, mask=131072, name="IMMERSIVE_CONFIRMATION_WINDOW"), @android.view.ViewDebug.FlagToString(equals=262144, mask=262144, name="OVERRIDE_LAYOUT_IN_DISPLAY_CUTOUT_MODE"), @android.view.ViewDebug.FlagToString(equals=524288, mask=524288, name="HIDE_NON_SYSTEM_OVERLAY_WINDOWS"), @android.view.ViewDebug.FlagToString(equals=1048576, mask=1048576, name="IS_ROUNDED_CORNERS_OVERLAY"), @android.view.ViewDebug.FlagToString(equals=2097152, mask=2097152, name="EXCLUDE_FROM_SCREEN_MAGNIFICATION"), @android.view.ViewDebug.FlagToString(equals=134217728, mask=134217728, name="INPUT_METHOD_WINDOW"), @android.view.ViewDebug.FlagToString(equals=4194304, mask=4194304, name="NOT_MAGNIFIABLE"), @android.view.ViewDebug.FlagToString(equals=16777216, mask=16777216, name="COLOR_SPACE_AGNOSTIC"), @android.view.ViewDebug.FlagToString(equals=33554432, mask=33554432, name="CONSUME_IME_INSETS"), @android.view.ViewDebug.FlagToString(equals=67108864, mask=67108864, name="OPTOUT_EDGE_TO_EDGE"), @android.view.ViewDebug.FlagToString(equals=268435456, mask=268435456, name="FIT_INSETS_CONTROLLED"), @android.view.ViewDebug.FlagToString(equals=536870912, mask=536870912, name="TRUSTED_OVERLAY"), @android.view.ViewDebug.FlagToString(equals=1073741824, mask=1073741824, name="INSET_PARENT_FRAME_BY_IME"), @android.view.ViewDebug.FlagToString(equals=-2147483648, mask=-2147483648, name="INTERCEPT_GLOBAL_DRAG_AND_DROP"), @android.view.ViewDebug.FlagToString(equals=8, mask=8, name="SYSTEM_APPLICATION_OVERLAY")})
        public int privateFlags;
        public android.view.InsetsFrameProvider[] providedInsets;
        public boolean receiveInsetsIgnoringZOrder;
        @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(equals=1, mask=1, name="DISABLE_PERFORMANCE_HINT"), @android.view.ViewDebug.FlagToString(equals=2, mask=2, name="FORCE_HARDWARE_ACCELERATED"), @android.view.ViewDebug.FlagToString(equals=4, mask=4, name="FORCE_DRAW_BAR_BACKGROUNDS"), @android.view.ViewDebug.FlagToString(equals=8, mask=8, name="SUSTAINED_PERFORMANCE_MODE"), @android.view.ViewDebug.FlagToString(equals=16, mask=16, name="LOW_PRIORITY"), @android.view.ViewDebug.FlagToString(equals=32, mask=32, name="DISABLE_IPC_RENDERING")})
        public int renderingHints;
        public int rotationAnimation;
        public float screenBrightness;
        public int screenBrightnessUnit;
        public int screenOrientation;
        public int softInputMode;
        public int subtreeSystemUiVisibility;
        public final android.graphics.Rect surfaceInsets = null;
        @java.lang.Deprecated
        public int systemUiVisibility;
        public android.os.IBinder token;
        @android.view.ViewDebug.ExportedProperty(mapping={@android.view.ViewDebug.IntToString(from=1, to="BASE_APPLICATION"), @android.view.ViewDebug.IntToString(from=2, to="APPLICATION"), @android.view.ViewDebug.IntToString(from=3, to="APPLICATION_STARTING"), @android.view.ViewDebug.IntToString(from=4, to="DRAWN_APPLICATION"), @android.view.ViewDebug.IntToString(from=1000, to="APPLICATION_PANEL"), @android.view.ViewDebug.IntToString(from=1001, to="APPLICATION_MEDIA"), @android.view.ViewDebug.IntToString(from=1002, to="APPLICATION_SUB_PANEL"), @android.view.ViewDebug.IntToString(from=1005, to="APPLICATION_ABOVE_SUB_PANEL"), @android.view.ViewDebug.IntToString(from=1003, to="APPLICATION_ATTACHED_DIALOG"), @android.view.ViewDebug.IntToString(from=1006, to="APPLICATION_CAPTION_BAR"), @android.view.ViewDebug.IntToString(from=1004, to="APPLICATION_MEDIA_OVERLAY"), @android.view.ViewDebug.IntToString(from=2000, to="STATUS_BAR"), @android.view.ViewDebug.IntToString(from=2001, to="SEARCH_BAR"), @android.view.ViewDebug.IntToString(from=2002, to="PHONE"), @android.view.ViewDebug.IntToString(from=2003, to="SYSTEM_ALERT"), @android.view.ViewDebug.IntToString(from=2004, to="KEYGUARD"), @android.view.ViewDebug.IntToString(from=2005, to="TOAST"), @android.view.ViewDebug.IntToString(from=2006, to="SYSTEM_OVERLAY"), @android.view.ViewDebug.IntToString(from=2007, to="PRIORITY_PHONE"), @android.view.ViewDebug.IntToString(from=2008, to="SYSTEM_DIALOG"), @android.view.ViewDebug.IntToString(from=2009, to="KEYGUARD_DIALOG"), @android.view.ViewDebug.IntToString(from=2010, to="SYSTEM_ERROR"), @android.view.ViewDebug.IntToString(from=2011, to="INPUT_METHOD"), @android.view.ViewDebug.IntToString(from=2012, to="INPUT_METHOD_DIALOG"), @android.view.ViewDebug.IntToString(from=2013, to="WALLPAPER"), @android.view.ViewDebug.IntToString(from=2014, to="STATUS_BAR_PANEL"), @android.view.ViewDebug.IntToString(from=2015, to="SECURE_SYSTEM_OVERLAY"), @android.view.ViewDebug.IntToString(from=2016, to="DRAG"), @android.view.ViewDebug.IntToString(from=2017, to="STATUS_BAR_SUB_PANEL"), @android.view.ViewDebug.IntToString(from=2018, to="POINTER"), @android.view.ViewDebug.IntToString(from=2019, to="NAVIGATION_BAR"), @android.view.ViewDebug.IntToString(from=2020, to="VOLUME_OVERLAY"), @android.view.ViewDebug.IntToString(from=2021, to="BOOT_PROGRESS"), @android.view.ViewDebug.IntToString(from=2022, to="INPUT_CONSUMER"), @android.view.ViewDebug.IntToString(from=2024, to="NAVIGATION_BAR_PANEL"), @android.view.ViewDebug.IntToString(from=2026, to="DISPLAY_OVERLAY"), @android.view.ViewDebug.IntToString(from=2027, to="MAGNIFICATION_OVERLAY"), @android.view.ViewDebug.IntToString(from=2037, to="PRESENTATION"), @android.view.ViewDebug.IntToString(from=2030, to="PRIVATE_PRESENTATION"), @android.view.ViewDebug.IntToString(from=2031, to="VOICE_INTERACTION"), @android.view.ViewDebug.IntToString(from=2032, to="ACCESSIBILITY_OVERLAY"), @android.view.ViewDebug.IntToString(from=2033, to="VOICE_INTERACTION_STARTING"), @android.view.ViewDebug.IntToString(from=2034, to="DOCK_DIVIDER"), @android.view.ViewDebug.IntToString(from=2035, to="QS_DIALOG"), @android.view.ViewDebug.IntToString(from=2036, to="SCREENSHOT"), @android.view.ViewDebug.IntToString(from=2038, to="APPLICATION_OVERLAY"), @android.view.ViewDebug.IntToString(from=2039, to="ACCESSIBILITY_MAGNIFICATION_OVERLAY"), @android.view.ViewDebug.IntToString(from=2040, to="NOTIFICATION_SHADE"), @android.view.ViewDebug.IntToString(from=2041, to="STATUS_BAR_ADDITIONAL")})
        public int type;
        public long userActivityTimeout;
        public float verticalMargin;
        @android.view.ViewDebug.ExportedProperty
        public float verticalWeight;
        public int windowAnimations;
        @android.view.ViewDebug.ExportedProperty
        public int x;
        @android.view.ViewDebug.ExportedProperty
        public int y;
        public LayoutParams() { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, int p2) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, int p2, int p3, int p4) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, int p2, int p3, int p4, int p5, int p6) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.os.Parcel p0) { super((android.view.ViewGroup.LayoutParams)null); }
        private void checkNonRecursiveParams() {}
        private static boolean hasLayoutDiff(android.view.WindowManager.LayoutParams p0, android.view.WindowManager.LayoutParams p1) { return false; }
        private static java.lang.String inputFeaturesToString(int p0) { return null; }
        public static boolean isSubWindowType(int p0) { return false; }
        public static boolean isSystemAlertWindowType(int p0) { return false; }
        public static java.lang.String layoutInDisplayCutoutModeToString(int p0) { return null; }
        public static boolean mayUseInputMethod(int p0) { return false; }
        private static java.lang.String rotationAnimationToString(int p0) { return null; }
        private static java.lang.String softInputModeToString(int p0) { return null; }
        public boolean areWallpaperTouchEventsEnabled() { return false; }
        void backup() {}
        public boolean canChangeGlobalTouchMode() { return false; }
        public boolean canPlayMoveAnimation() { return false; }
        public final int copyFrom(android.view.WindowManager.LayoutParams p0) { return 0; }
        public java.lang.String debug(java.lang.String p0) { return null; }
        public int describeContents() { return 0; }
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
        public void dumpDimensions(java.lang.StringBuilder p0) {}
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
        public android.view.WindowManager.LayoutParams forRotation(int p0) { return null; }
        public int getBlurBehindRadius() { return 0; }
        public int getColorMode() { return 0; }
        public float getDesiredHdrHeadroom() { return 0.0f; }
        public int getFitInsetsSides() { return 0; }
        public int getFitInsetsTypes() { return 0; }
        public boolean getFrameRateBoostOnTouchEnabled() { return false; }
        public final java.lang.CharSequence getTitle() { return null; }
        @android.annotation.SystemApi
        public final long getUserActivityTimeout() { return 0L; }
        public final android.os.IBinder getWindowContextToken() { return null; }
        public boolean hasKeyboardCapture() { return false; }
        public boolean isFitInsetsIgnoringVisibility() { return false; }
        public boolean isFrameRatePowerSavingsBalanced() { return false; }
        public boolean isFullscreen() { return false; }
        public boolean isHdrConversionEnabled() { return false; }
        public boolean isIpcRenderingDisabled() { return false; }
        public boolean isModal() { return false; }
        public boolean isPerfHintSessionDisabled() { return false; }
        @android.annotation.SystemApi
        public boolean isSystemApplicationOverlay() { return false; }
        void restore() {}
        public void scale(float p0) {}
        public void setBlurBehindRadius(int p0) {}
        public void setCanChangeGlobalTouchMode(boolean p0) {}
        public void setCanPlayMoveAnimation(boolean p0) {}
        public void setColorMode(int p0) {}
        public void setDesiredHdrHeadroom(float p0) {}
        public void setFitInsetsIgnoringVisibility(boolean p0) {}
        public void setFitInsetsSides(int p0) {}
        public void setFitInsetsTypes(int p0) {}
        public void setFrameRateBoostOnTouchEnabled(boolean p0) {}
        public void setFrameRatePowerSavingsBalanced(boolean p0) {}
        public void setHdrConversionEnabled(boolean p0) {}
        @android.annotation.SystemApi
        public void setInsetsParams(java.util.List<android.view.WindowManager.InsetsParams> p0) {}
        public void setKeyboardCaptureEnabled(boolean p0) {}
        public final void setSurfaceInsets(android.view.View p0, boolean p1, boolean p2) {}
        @android.annotation.SystemApi
        public void setSystemApplicationOverlay(boolean p0) {}
        public final void setTitle(java.lang.CharSequence p0) {}
        public void setTrustedOverlay() {}
        @android.annotation.SystemApi
        public final void setUserActivityTimeout(long p0) {}
        public void setWallpaperTouchEventsEnabled(boolean p0) {}
        public final void setWindowContextToken(android.os.IBinder p0) {}
        public java.lang.String toString() { return null; }
        public java.lang.String toString(java.lang.String p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static @interface DisplayFlags {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Flags {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface InputFeatureFlags {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface LayoutInDisplayCutoutMode {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PrivateFlags {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface RenderingHints {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SoftInputModeFlags {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SystemFlags {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SystemUiVisibilityFlags {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface WindowType {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RemoveContentMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface ScreenRecordingState {
    }

    public static @interface ScreenshotSource {
        public static final int SCREENSHOT_ACCESSIBILITY_ACTIONS = 4;
        public static final int SCREENSHOT_GLOBAL_ACTIONS = 0;
        public static final int SCREENSHOT_KEY_CHORD = 1;
        public static final int SCREENSHOT_KEY_OTHER = 2;
        public static final int SCREENSHOT_OTHER = 5;
        public static final int SCREENSHOT_OVERVIEW = 3;
        public static final int SCREENSHOT_SCREEN_CAPTURE_UI = 7;
        public static final int SCREENSHOT_VENDOR_GESTURE = 6;
    }

    public static @interface ScreenshotType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShellRootLayer {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransitionFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransitionOldType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransitionType {
    }
}
