package android.content.pm;

public class ActivityInfo extends android.content.pm.ComponentInfo implements android.os.Parcelable {
    public static final long ALWAYS_SANDBOX_DISPLAY_APIS = 185004937L;
    private static final long CHECK_MIN_WIDTH_HEIGHT_FOR_MULTI_WINDOW = 197654537L;
    public static final int COLOR_MODE_A8 = 4;
    public static final int COLOR_MODE_DEFAULT = 0;
    public static final int COLOR_MODE_HDR = 2;
    public static final int COLOR_MODE_HDR10 = 3;
    public static final int COLOR_MODE_WIDE_COLOR_GAMUT = 1;
    public static final int CONFIG_ASSETS_PATHS = -2147483648;
    public static final int CONFIG_COLOR_MODE = 16384;
    public static final int CONFIG_DENSITY = 4096;
    public static final int CONFIG_FONT_SCALE = 1073741824;
    public static final int CONFIG_FONT_WEIGHT_ADJUSTMENT = 268435456;
    public static final int CONFIG_GRAMMATICAL_GENDER = 32768;
    public static final int CONFIG_KEYBOARD = 16;
    public static final int CONFIG_KEYBOARD_HIDDEN = 32;
    public static final int CONFIG_LAYOUT_DIRECTION = 8192;
    public static final int CONFIG_LOCALE = 4;
    public static final int CONFIG_MCC = 1;
    public static final int CONFIG_MNC = 2;
    public static int[] CONFIG_NATIVE_BITS;
    public static final int CONFIG_NAVIGATION = 64;
    public static final int CONFIG_ORIENTATION = 128;
    public static final int CONFIG_RESOURCES_UNUSED = 134217728;
    public static final int CONFIG_SCREEN_LAYOUT = 256;
    public static final int CONFIG_SCREEN_SIZE = 1024;
    public static final int CONFIG_SMALLEST_SCREEN_SIZE = 2048;
    public static final int CONFIG_TOUCHSCREEN = 8;
    public static final int CONFIG_UI_MODE = 512;
    public static final int CONFIG_WINDOW_CONFIGURATION = 536870912;
    public static final int CONTENT_URI_PERMISSION_NONE = 0;
    public static final int CONTENT_URI_PERMISSION_READ = 1;
    public static final int CONTENT_URI_PERMISSION_READ_AND_WRITE = 4;
    public static final int CONTENT_URI_PERMISSION_READ_OR_WRITE = 3;
    public static final int CONTENT_URI_PERMISSION_WRITE = 2;
    public static final android.os.Parcelable.Creator<android.content.pm.ActivityInfo> CREATOR = null;
    public static final int DOCUMENT_LAUNCH_ALWAYS = 2;
    public static final int DOCUMENT_LAUNCH_INTO_EXISTING = 1;
    public static final int DOCUMENT_LAUNCH_NEVER = 3;
    public static final int DOCUMENT_LAUNCH_NONE = 0;
    public static final long ENABLE_FLUID_RESIZING = 460405642L;
    public static final long ENABLE_SYNCHRONIZED_INSETS_ANIMATION = 463899193L;
    @java.lang.Deprecated
    public static final int FLAG_ALLOW_EMBEDDED = -2147483648;
    public static final int FLAG_ALLOW_TASK_REPARENTING = 64;
    public static final int FLAG_ALLOW_UNTRUSTED_ACTIVITY_EMBEDDING = 268435456;
    public static final int FLAG_ALWAYS_FOCUSABLE = 262144;
    public static final int FLAG_ALWAYS_RETAIN_TASK_STATE = 8;
    public static final int FLAG_AUTO_REMOVE_FROM_RECENTS = 8192;
    public static final int FLAG_CAN_DISPLAY_ON_REMOTE_DEVICES = 65536;
    public static final int FLAG_CLEAR_TASK_ON_LAUNCH = 4;
    public static final int FLAG_ENABLE_VR_MODE = 32768;
    public static final int FLAG_EXCLUDE_FROM_RECENTS = 32;
    public static final int FLAG_FINISH_ON_CLOSE_SYSTEM_DIALOGS = 256;
    public static final int FLAG_FINISH_ON_TASK_LAUNCH = 2;
    public static final int FLAG_HARDWARE_ACCELERATED = 512;
    public static final int FLAG_IMMERSIVE = 2048;
    public static final int FLAG_IMPLICITLY_VISIBLE_TO_INSTANT_APP = 2097152;
    public static final int FLAG_INHERIT_SHOW_WHEN_LOCKED = 1;
    public static final int FLAG_MULTIPROCESS = 1;
    public static final int FLAG_NO_HISTORY = 128;
    public static final int FLAG_PREFER_MINIMAL_POST_PROCESSING = 33554432;
    public static final int FLAG_RELINQUISH_TASK_IDENTITY = 4096;
    public static final int FLAG_RESUME_WHILE_PAUSING = 16384;
    public static final int FLAG_RUN_IN_PCC_SANDBOX = 524288;
    public static final int FLAG_SHOW_FOR_ALL_USERS = 1024;
    public static final int FLAG_SHOW_WHEN_LOCKED = 8388608;
    public static final int FLAG_SINGLE_USER = 1073741824;
    public static final int FLAG_STATE_NOT_NEEDED = 16;
    public static final int FLAG_SUPPORTS_PICTURE_IN_PICTURE = 4194304;
    public static final int FLAG_SYSTEM_USER_ONLY = 536870912;
    public static final int FLAG_TURN_SCREEN_ON = 16777216;
    public static final int FLAG_VISIBLE_TO_INSTANT_APP = 1048576;
    public static final long FORCE_LAUNCH_FULLSCREEN_FROM_DESKTOP = 492280747L;
    public static final long FORCE_NON_RESIZE_APP = 181136395L;
    public static final long FORCE_RESIZE_APP = 174042936L;
    public static final long INSETS_DECOUPLED_CONFIGURATION_ENFORCED = 151861875L;
    public static final int LAUNCH_MULTIPLE = 0;
    public static final int LAUNCH_SINGLE_INSTANCE = 3;
    public static final int LAUNCH_SINGLE_INSTANCE_PER_TASK = 4;
    public static final int LAUNCH_SINGLE_TASK = 2;
    public static final int LAUNCH_SINGLE_TOP = 1;
    public static final int LOCK_TASK_LAUNCH_MODE_ALWAYS = 2;
    public static final int LOCK_TASK_LAUNCH_MODE_DEFAULT = 0;
    public static final int LOCK_TASK_LAUNCH_MODE_IF_ALLOWLISTED = 3;
    public static final int LOCK_TASK_LAUNCH_MODE_NEVER = 1;
    public static final long MASK_PRESENTATION_FLAGS_ON_INTERNAL_DISPLAYS = 483802160L;
    public static final long MIN_ASPECT_RATIO_ONLY_FOR_LARGE_SCREEN = 502054815L;
    public static final long MIN_ASPECT_RATIO_ONLY_FOR_SMALL_SCREEN = 502054812L;
    public static final long NEVER_SANDBOX_DISPLAY_APIS = 184838306L;
    public static final long OVERRIDE_ANY_ORIENTATION = 265464455L;
    public static final long OVERRIDE_ANY_ORIENTATION_TO_USER = 310816437L;
    public static final long OVERRIDE_AUTO_RESTART_ON_DISPLAY_MOVE = 427878712L;
    public static final long OVERRIDE_CAMERA_COMPAT_DISABLE_FORCE_ROTATION = 263959004L;
    public static final long OVERRIDE_CAMERA_COMPAT_DISABLE_REFRESH = 264304459L;
    public static final long OVERRIDE_CAMERA_COMPAT_DISABLE_SIMULATE_REQUESTED_ORIENTATION = 398195815L;
    public static final long OVERRIDE_CAMERA_COMPAT_ENABLE_REFRESH_VIA_PAUSE = 264301586L;
    public static final long OVERRIDE_CAMERA_COMPAT_ENABLE_SIMULATE_REQUESTED_ORIENTATION = 387235770L;
    public static final long OVERRIDE_ENABLE_COMPAT_FAKE_FOCUS = 263259275L;
    public static final long OVERRIDE_ENABLE_COMPAT_IGNORE_ORIENTATION_REQUEST_WHEN_LOOP_DETECTED = 273509367L;
    public static final long OVERRIDE_ENABLE_COMPAT_IGNORE_REQUESTED_ORIENTATION = 254631730L;
    public static final long OVERRIDE_ENABLE_INSETS_DECOUPLED_CONFIGURATION = 327313645L;
    public static final long OVERRIDE_ENABLE_VIRTUAL_GAMEPAD = 447093535L;
    public static final long OVERRIDE_EXCLUDE_CAPTION_INSETS_FROM_APP_BOUNDS = 388014743L;
    public static final long OVERRIDE_LANDSCAPE_ORIENTATION_TO_REVERSE_LANDSCAPE = 266124927L;
    public static final long OVERRIDE_MIN_ASPECT_RATIO = 174042980L;
    public static final long OVERRIDE_MIN_ASPECT_RATIO_EXCLUDE_PORTRAIT_FULLSCREEN = 218959984L;
    public static final long OVERRIDE_MIN_ASPECT_RATIO_FOR_ORIENTATION_MISMATCH = 499150578L;
    public static final long OVERRIDE_MIN_ASPECT_RATIO_LARGE = 180326787L;
    public static final float OVERRIDE_MIN_ASPECT_RATIO_LARGE_VALUE = 1.7777777910232544f;
    public static final long OVERRIDE_MIN_ASPECT_RATIO_MEDIUM = 180326845L;
    public static final float OVERRIDE_MIN_ASPECT_RATIO_MEDIUM_VALUE = 1.5f;
    public static final long OVERRIDE_MIN_ASPECT_RATIO_ONLY_FOR_CAMERA = 325586858L;
    public static final long OVERRIDE_MIN_ASPECT_RATIO_PORTRAIT_ONLY = 203647190L;
    public static final long OVERRIDE_MIN_ASPECT_RATIO_SMALL = 349045028L;
    public static final float OVERRIDE_MIN_ASPECT_RATIO_SMALL_VALUE = 1.3333333730697632f;
    public static final long OVERRIDE_MIN_ASPECT_RATIO_TO_ALIGN_WITH_SPLIT_SCREEN = 208648326L;
    public static final long OVERRIDE_MOUSE_TO_TOUCH = 413207127L;
    public static final long OVERRIDE_ORIENTATION_ONLY_FOR_CAMERA = 265456536L;
    public static final long OVERRIDE_RESPECT_REQUESTED_ORIENTATION = 236283604L;
    public static final long OVERRIDE_SANDBOX_VIEW_BOUNDS_APIS = 237531167L;
    public static final long OVERRIDE_UNDEFINED_ORIENTATION_TO_NOSENSOR = 265451093L;
    public static final long OVERRIDE_UNDEFINED_ORIENTATION_TO_PORTRAIT = 265452344L;
    public static final long OVERRIDE_USE_DISPLAY_LANDSCAPE_NATURAL_ORIENTATION = 255940284L;
    public static final int PERSIST_ACROSS_REBOOTS = 2;
    public static final int PERSIST_NEVER = 1;
    public static final int PERSIST_ROOT_ONLY = 0;
    public static final int PRIVATE_FLAG_DISABLE_ON_BACK_INVOKED_CALLBACK = 8;
    public static final int PRIVATE_FLAG_ENABLE_ON_BACK_INVOKED_CALLBACK = 4;
    public static final int PRIVATE_FLAG_HOME_TRANSITION_SOUND = 2;
    public static final int RESIZE_MODE_FORCE_RESIZABLE_LANDSCAPE_ONLY = 5;
    public static final int RESIZE_MODE_FORCE_RESIZABLE_PORTRAIT_ONLY = 6;
    public static final int RESIZE_MODE_FORCE_RESIZABLE_PRESERVE_ORIENTATION = 7;
    public static final int RESIZE_MODE_FORCE_RESIZEABLE = 4;
    public static final int RESIZE_MODE_RESIZEABLE = 2;
    public static final int RESIZE_MODE_RESIZEABLE_AND_PIPABLE_DEPRECATED = 3;
    public static final int RESIZE_MODE_RESIZEABLE_VIA_SDK_VERSION = 1;
    public static final int RESIZE_MODE_UNRESIZEABLE = 0;
    public static final int SCREEN_ORIENTATION_BEHIND = 3;
    public static final int SCREEN_ORIENTATION_FULL_SENSOR = 10;
    public static final int SCREEN_ORIENTATION_FULL_USER = 13;
    public static final int SCREEN_ORIENTATION_LANDSCAPE = 0;
    public static final int SCREEN_ORIENTATION_LOCKED = 14;
    public static final int SCREEN_ORIENTATION_NOSENSOR = 5;
    public static final int SCREEN_ORIENTATION_PORTRAIT = 1;
    public static final int SCREEN_ORIENTATION_REVERSE_LANDSCAPE = 8;
    public static final int SCREEN_ORIENTATION_REVERSE_PORTRAIT = 9;
    public static final int SCREEN_ORIENTATION_SENSOR = 4;
    public static final int SCREEN_ORIENTATION_SENSOR_LANDSCAPE = 6;
    public static final int SCREEN_ORIENTATION_SENSOR_PORTRAIT = 7;
    public static final int SCREEN_ORIENTATION_UNSET = -2;
    public static final int SCREEN_ORIENTATION_UNSPECIFIED = -1;
    public static final int SCREEN_ORIENTATION_USER = 2;
    public static final int SCREEN_ORIENTATION_USER_LANDSCAPE = 11;
    public static final int SCREEN_ORIENTATION_USER_PORTRAIT = 12;
    public static final int SIZE_CHANGES_SUPPORTED_METADATA = 2;
    public static final int SIZE_CHANGES_SUPPORTED_OVERRIDE = 3;
    public static final int SIZE_CHANGES_UNSUPPORTED_METADATA = 0;
    public static final int SIZE_CHANGES_UNSUPPORTED_OVERRIDE = 1;
    public static final long SKIP_ACTIVITY_RECREATION_ON_CONFIG_CHANGE = 454795633L;
    public static final int UIOPTION_SPLIT_ACTION_BAR_WHEN_NARROW = 1;
    public static final long UNIVERSAL_RESIZABLE_BY_DEFAULT = 357141415L;
    private static final com.android.internal.util.Parcelling.BuiltIn.ForStringSet sForStringSet = null;
    public int colorMode;
    public int configChanges;
    public int documentLaunchMode;
    public int flags;
    public int launchMode;
    public java.lang.String launchToken;
    public int lockTaskLaunchMode;
    private java.util.Set<java.lang.String> mKnownActivityEmbeddingCerts;
    private float mMaxAspectRatio;
    private float mMinAspectRatio;
    public int maxRecents;
    public java.lang.String parentActivityName;
    public java.lang.String permission;
    public int persistableMode;
    public int privateFlags;
    public java.lang.String requestedVrComponent;
    public int requireContentUriPermissionFromCaller;
    public java.lang.String requiredDisplayCategory;
    public int resizeMode;
    public int rotationAnimation;
    public int screenOrientation;
    public int softInputMode;
    public boolean supportsSizeChanges;
    public java.lang.String targetActivity;
    public java.lang.String taskAffinity;
    public int theme;
    public int uiOptions;
    public android.content.pm.ActivityInfo.WindowLayout windowLayout;
    public ActivityInfo() { super(); }
    public ActivityInfo(android.content.pm.ActivityInfo p0) { super(); }
    private ActivityInfo(android.os.Parcel p0) { super(); }
    public static int activityInfoConfigJavaToNative(int p0) { return 0; }
    public static int activityInfoConfigNativeToJava(int p0) { return 0; }
    public static java.lang.String colorModeToString(int p0) { return null; }
    public static boolean isFixedOrientation(int p0) { return false; }
    public static boolean isFixedOrientationLandscape(int p0) { return false; }
    public static boolean isFixedOrientationPortrait(int p0) { return false; }
    public static boolean isPreserveOrientationMode(int p0) { return false; }
    public static boolean isRequiredContentUriPermissionRead(int p0) { return false; }
    public static boolean isRequiredContentUriPermissionWrite(int p0) { return false; }
    public static boolean isResizeableMode(int p0) { return false; }
    public static boolean isTranslucentOrFloating(android.content.res.TypedArray p0) { return false; }
    public static java.lang.String launchModeToString(int p0) { return null; }
    public static final java.lang.String lockTaskLaunchModeToString(int p0) { return null; }
    private java.lang.String persistableModeToString() { return null; }
    private java.lang.String requiredContentUriPermissionToFullString(int p0) { return null; }
    public static java.lang.String requiredContentUriPermissionToShortString(int p0) { return null; }
    public static java.lang.String resizeModeToString(int p0) { return null; }
    public static int reverseOrientation(int p0) { return 0; }
    public static java.lang.String screenOrientationToString(int p0) { return null; }
    public static java.lang.String sizeChangesSupportModeToString(int p0) { return null; }
    public boolean alwaysSandboxDisplayApis(android.content.pm.ConstrainDisplayApisConfig p0) { return false; }
    public int describeContents() { return 0; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public void dump(android.util.Printer p0, java.lang.String p1, int p2) {}
    public java.util.Set<java.lang.String> getKnownActivityEmbeddingCerts() { return null; }
    public float getManifestMinAspectRatio() { return 0.0f; }
    public float getMaxAspectRatio() { return 0.0f; }
    public float getMinAspectRatio() { return 0.0f; }
    public int getRealConfigChanged() { return 0; }
    public final int getThemeResource() { return 0; }
    public boolean hasFixedAspectRatio() { return false; }
    public boolean hasOnBackInvokedCallbackEnabled() { return false; }
    public boolean isChangeEnabled(long p0) { return false; }
    public boolean isFixedOrientation() { return false; }
    boolean isFixedOrientationLandscape() { return false; }
    boolean isFixedOrientationPortrait() { return false; }
    public boolean isOnBackInvokedCallbackEnabled() { return false; }
    public boolean neverSandboxDisplayApis(android.content.pm.ConstrainDisplayApisConfig p0) { return false; }
    public void setKnownActivityEmbeddingCerts(java.util.Set<java.lang.String> p0) {}
    public void setMaxAspectRatio(float p0) {}
    public void setMinAspectRatio(float p0) {}
    public boolean shouldCheckMinWidthHeightForMultiWindow() { return false; }
    public boolean shouldRunInPccSandbox() { return false; }
    public boolean supportsPictureInPicture() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ColorMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Config {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LaunchMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequiredContentUriPermission {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScreenOrientation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SizeChangesSupportMode {
    }

    public static final class WindowLayout {
        public static final android.content.pm.ActivityInfo.WindowLayout EMPTY = null;
        private final int complexHeight = 0;
        private final int complexMinHeight = 0;
        private final int complexMinWidth = 0;
        private final int complexWidth = 0;
        public final int gravity = 0;
        @java.lang.Deprecated
        public final int height = 0;
        public final float heightFraction = 0.0f;
        @java.lang.Deprecated
        public final int minHeight = 0;
        @java.lang.Deprecated
        public final int minWidth = 0;
        @java.lang.Deprecated
        public final int width = 0;
        public final float widthFraction = 0.0f;
        public java.lang.String windowLayoutAffinity;
        @java.lang.Deprecated
        public WindowLayout(int p0, float p1, int p2, float p3, int p4, int p5, int p6) {}
        public WindowLayout(int p0, float p1, int p2, float p3, int p4, int p5, int p6, java.lang.String p7, android.util.DisplayMetrics p8) {}
        private WindowLayout(int p0, int p1, float p2, int p3, int p4, float p5, int p6, int p7, int p8, int p9, int p10, java.lang.String p11) {}
        public WindowLayout(android.os.Parcel p0) {}
        private static int complexToDimensionPixelSize(int p0, android.util.DisplayMetrics p1) { return 0; }
        public int getComplexMinHeight() { return 0; }
        public int getComplexMinWidth() { return 0; }
        public int getDefaultHeight(android.util.DisplayMetrics p0) { return 0; }
        public int getDefaultWidth(android.util.DisplayMetrics p0) { return 0; }
        public int getMinHeight(android.util.DisplayMetrics p0) { return 0; }
        public int getMinWidth(android.util.DisplayMetrics p0) { return 0; }
        public boolean hasSpecifiedSize() { return false; }
        public void writeToParcel(android.os.Parcel p0) {}
    }
}
