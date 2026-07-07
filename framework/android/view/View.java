package android.view;

public class View implements android.graphics.drawable.Drawable.Callback, android.view.KeyEvent.Callback, android.view.accessibility.AccessibilityEventSource {
    public static final int ACCESSIBILITY_CURSOR_POSITION_UNDEFINED = -1;
    public static final int ACCESSIBILITY_DATA_SENSITIVE_AUTO = 0;
    public static final int ACCESSIBILITY_DATA_SENSITIVE_NO = 2;
    public static final int ACCESSIBILITY_DATA_SENSITIVE_YES = 1;
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    static final int ACCESSIBILITY_LIVE_REGION_DEFAULT = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    static final int ALL_RTL_PROPERTIES_RESOLVED = 1610678816;
    public static final android.util.Property<android.view.View, java.lang.Float> ALPHA = null;
    public static final int AUTOFILL_FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 1;
    private static final int[] AUTOFILL_HIGHLIGHT_ATTR = null;
    public static final java.lang.String AUTOFILL_HINT_CREDENTIAL_MANAGER = "credential";
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE = "creditCardExpirationDate";
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY = "creditCardExpirationDay";
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH = "creditCardExpirationMonth";
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR = "creditCardExpirationYear";
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_NUMBER = "creditCardNumber";
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE = "creditCardSecurityCode";
    public static final java.lang.String AUTOFILL_HINT_EMAIL_ADDRESS = "emailAddress";
    public static final java.lang.String AUTOFILL_HINT_NAME = "name";
    public static final java.lang.String AUTOFILL_HINT_PASSWORD = "password";
    public static final java.lang.String AUTOFILL_HINT_PASSWORD_AUTO = "passwordAuto";
    public static final java.lang.String AUTOFILL_HINT_PHONE = "phone";
    public static final java.lang.String AUTOFILL_HINT_POSTAL_ADDRESS = "postalAddress";
    public static final java.lang.String AUTOFILL_HINT_POSTAL_CODE = "postalCode";
    public static final java.lang.String AUTOFILL_HINT_USERNAME = "username";
    private static final java.lang.String AUTOFILL_LOG_TAG = "View.Autofill";
    public static final int AUTOFILL_TYPE_DATE = 4;
    public static final int AUTOFILL_TYPE_LIST = 3;
    public static final int AUTOFILL_TYPE_NONE = 0;
    public static final int AUTOFILL_TYPE_TEXT = 1;
    public static final int AUTOFILL_TYPE_TOGGLE = 2;
    static final int CLICKABLE = 16384;
    private static final java.lang.String CONTENT_CAPTURE_LOG_TAG = "View.ContentCapture";
    public static final int CONTENT_SENSITIVITY_AUTO = 0;
    public static final int CONTENT_SENSITIVITY_NOT_SENSITIVE = 2;
    public static final int CONTENT_SENSITIVITY_SENSITIVE = 1;
    static final int CONTEXT_CLICKABLE = 8388608;
    private static final boolean DBG = false;
    private static final boolean DEBUG_CONTENT_CAPTURE = false;
    static final int DEBUG_CORNERS_COLOR = Integer.valueOf(0);
    static final int DEBUG_CORNERS_SIZE_DIP = 8;
    public static boolean DEBUG_DRAW;
    static final int DISABLED = 32;
    public static final int DRAG_FLAG_ACCESSIBILITY_ACTION = 1024;
    public static final int DRAG_FLAG_DISABLE_DEFAULT_POINTER_ICON = 32768;
    public static final int DRAG_FLAG_GLOBAL = 256;
    public static final int DRAG_FLAG_GLOBAL_PERSISTABLE_URI_PERMISSION = 64;
    public static final int DRAG_FLAG_GLOBAL_PREFIX_URI_PERMISSION = 128;
    public static final int DRAG_FLAG_GLOBAL_SAME_APPLICATION = 4096;
    public static final int DRAG_FLAG_GLOBAL_URI_READ = 1;
    public static final int DRAG_FLAG_GLOBAL_URI_WRITE = 2;
    public static final int DRAG_FLAG_HIDE_CALLING_TASK_ON_DRAG_START = 16384;
    public static final int DRAG_FLAG_OPAQUE = 512;
    public static final int DRAG_FLAG_REQUEST_SURFACE_FOR_RETURN_ANIMATION = 2048;
    public static final int DRAG_FLAG_START_INTENT_SENDER_ON_UNHANDLED_DRAG = 8192;
    static final int DRAG_MASK = 3;
    static final int DRAWING_CACHE_ENABLED = 32768;
    @java.lang.Deprecated
    public static final int DRAWING_CACHE_QUALITY_AUTO = 0;
    private static final int[] DRAWING_CACHE_QUALITY_FLAGS = null;
    @java.lang.Deprecated
    public static final int DRAWING_CACHE_QUALITY_HIGH = 1048576;
    @java.lang.Deprecated
    public static final int DRAWING_CACHE_QUALITY_LOW = 524288;
    static final int DRAWING_CACHE_QUALITY_MASK = 1572864;
    static final int DRAW_MASK = 128;
    static final int DUPLICATE_PARENT_STATE = 4194304;
    protected static final int[] EMPTY_STATE_SET = null;
    static final int ENABLED = 0;
    protected static final int[] ENABLED_FOCUSED_SELECTED_STATE_SET = null;
    protected static final int[] ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] ENABLED_FOCUSED_STATE_SET = null;
    protected static final int[] ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
    static final int ENABLED_MASK = 32;
    protected static final int[] ENABLED_SELECTED_STATE_SET = null;
    protected static final int[] ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] ENABLED_STATE_SET = null;
    protected static final int[] ENABLED_WINDOW_FOCUSED_STATE_SET = null;
    static final int FADING_EDGE_HORIZONTAL = 4096;
    static final int FADING_EDGE_MASK = 12288;
    static final int FADING_EDGE_NONE = 0;
    static final int FADING_EDGE_VERTICAL = 8192;
    static final int FILTER_TOUCHES_WHEN_OBSCURED = 1024;
    public static final int FIND_VIEWS_WITH_ACCESSIBILITY_NODE_PROVIDERS = 4;
    public static final int FIND_VIEWS_WITH_CONTENT_DESCRIPTION = 2;
    public static final int FIND_VIEWS_WITH_TEXT = 1;
    private static final int FITS_SYSTEM_WINDOWS = 2;
    public static final int FOCUSABLE = 1;
    public static final int FOCUSABLES_ALL = 0;
    public static final int FOCUSABLES_TOUCH_MODE = 1;
    public static final int FOCUSABLE_AUTO = 16;
    static final int FOCUSABLE_IN_TOUCH_MODE = 262144;
    private static final int FOCUSABLE_MASK = 17;
    protected static final int[] FOCUSED_SELECTED_STATE_SET = null;
    protected static final int[] FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] FOCUSED_STATE_SET = null;
    protected static final int[] FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
    public static final int FOCUS_BACKWARD = 1;
    public static final int FOCUS_DOWN = 130;
    public static final int FOCUS_FORWARD = 2;
    public static final int FOCUS_LEFT = 17;
    public static final int FOCUS_RIGHT = 66;
    public static final int FOCUS_UP = 33;
    public static final int FRAME_RATE_CATEGORY_REASON_BOOST = 134217728;
    public static final int FRAME_RATE_CATEGORY_REASON_CONFLICTED = 167772160;
    public static final int FRAME_RATE_CATEGORY_REASON_INTERMITTENT = 33554432;
    public static final int FRAME_RATE_CATEGORY_REASON_INVALID = 83886080;
    public static final int FRAME_RATE_CATEGORY_REASON_LARGE = 50331648;
    private static final int FRAME_RATE_CATEGORY_REASON_MASK = -65536;
    public static final int FRAME_RATE_CATEGORY_REASON_REQUESTED = 67108864;
    public static final int FRAME_RATE_CATEGORY_REASON_SMALL = 16777216;
    public static final int FRAME_RATE_CATEGORY_REASON_TOUCH = 150994944;
    public static final int FRAME_RATE_CATEGORY_REASON_UNKNOWN = 0;
    public static final int FRAME_RATE_CATEGORY_REASON_VELOCITY = 100663296;
    private static final float FRAME_RATE_NARROW_SIZE_DP = 10.0f;
    private static final float FRAME_RATE_SIZE_PERCENTAGE_THRESHOLD = 0.07000000029802322f;
    private static final float FRAME_RATE_SQUARE_SMALL_SIZE_DP = 40.0f;
    public static final int GONE = 8;
    public static final int HAPTIC_FEEDBACK_ENABLED = 268435456;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    static final int IMPORTANT_FOR_ACCESSIBILITY_DEFAULT = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int IMPORTANT_FOR_AUTOFILL_AUTO = 0;
    public static final int IMPORTANT_FOR_AUTOFILL_NO = 2;
    public static final int IMPORTANT_FOR_AUTOFILL_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_AUTOFILL_YES = 1;
    public static final int IMPORTANT_FOR_AUTOFILL_YES_EXCLUDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;
    public static final int INVISIBLE = 4;
    public static final int KEEP_SCREEN_ON = 67108864;
    public static final int LAST_APP_AUTOFILL_ID = 1073741823;
    public static final int LAYER_TYPE_HARDWARE = 2;
    public static final int LAYER_TYPE_NONE = 0;
    public static final int LAYER_TYPE_SOFTWARE = 1;
    private static final int LAYOUT_DIRECTION_DEFAULT = 2;
    private static final int[] LAYOUT_DIRECTION_FLAGS = null;
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    static final int LAYOUT_DIRECTION_RESOLVED_DEFAULT = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;
    public static final int LAYOUT_DIRECTION_UNDEFINED = -1;
    static final int LONG_CLICKABLE = 2097152;
    static final float MAX_FRAME_RATE = 120.0f;
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
    public static final int MEASURED_SIZE_MASK = 16777215;
    public static final int MEASURED_STATE_MASK = -16777216;
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;
    public static final int NOT_FOCUSABLE = 0;
    public static final int NO_ID = -1;
    static final int OPTIONAL_FITS_SYSTEM_WINDOWS = 2048;
    public static final int OVER_SCROLL_ALWAYS = 0;
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    public static final int OVER_SCROLL_NEVER = 2;
    static final int PARENT_SAVE_DISABLED = 536870912;
    static final int PARENT_SAVE_DISABLED_MASK = 536870912;
    static final int PFLAG2_ACCESSIBILITY_FOCUSED = 67108864;
    static final int PFLAG2_ACCESSIBILITY_LIVE_REGION_MASK = 25165824;
    static final int PFLAG2_ACCESSIBILITY_LIVE_REGION_SHIFT = 23;
    static final int PFLAG2_DRAG_CAN_ACCEPT = 1;
    static final int PFLAG2_DRAG_HOVERED = 2;
    static final int PFLAG2_DRAWABLE_RESOLVED = 1073741824;
    static final int PFLAG2_HAS_TRANSIENT_STATE = -2147483648;
    static final int PFLAG2_IMPORTANT_FOR_ACCESSIBILITY_MASK = 7340032;
    static final int PFLAG2_IMPORTANT_FOR_ACCESSIBILITY_SHIFT = 20;
    static final int PFLAG2_LAYOUT_DIRECTION_MASK = 12;
    static final int PFLAG2_LAYOUT_DIRECTION_MASK_SHIFT = 2;
    static final int PFLAG2_LAYOUT_DIRECTION_RESOLVED = 32;
    static final int PFLAG2_LAYOUT_DIRECTION_RESOLVED_MASK = 48;
    static final int PFLAG2_LAYOUT_DIRECTION_RESOLVED_RTL = 16;
    static final int PFLAG2_PADDING_RESOLVED = 536870912;
    static final int PFLAG2_SUBTREE_ACCESSIBILITY_STATE_CHANGED = 134217728;
    private static final int[] PFLAG2_TEXT_ALIGNMENT_FLAGS = null;
    static final int PFLAG2_TEXT_ALIGNMENT_MASK = 57344;
    static final int PFLAG2_TEXT_ALIGNMENT_MASK_SHIFT = 13;
    static final int PFLAG2_TEXT_ALIGNMENT_RESOLVED = 65536;
    private static final int PFLAG2_TEXT_ALIGNMENT_RESOLVED_DEFAULT = 131072;
    static final int PFLAG2_TEXT_ALIGNMENT_RESOLVED_MASK = 917504;
    static final int PFLAG2_TEXT_ALIGNMENT_RESOLVED_MASK_SHIFT = 17;
    private static final int[] PFLAG2_TEXT_DIRECTION_FLAGS = null;
    static final int PFLAG2_TEXT_DIRECTION_MASK = 448;
    static final int PFLAG2_TEXT_DIRECTION_MASK_SHIFT = 6;
    static final int PFLAG2_TEXT_DIRECTION_RESOLVED = 512;
    static final int PFLAG2_TEXT_DIRECTION_RESOLVED_DEFAULT = 1024;
    static final int PFLAG2_TEXT_DIRECTION_RESOLVED_MASK = 7168;
    static final int PFLAG2_TEXT_DIRECTION_RESOLVED_MASK_SHIFT = 10;
    static final int PFLAG2_VIEW_QUICK_REJECTED = 268435456;
    private static final int PFLAG3_ACCESSIBILITY_HEADING = -2147483648;
    private static final int PFLAG3_AGGREGATED_VISIBLE = 536870912;
    static final int PFLAG3_APPLYING_INSETS = 32;
    static final int PFLAG3_ASSIST_BLOCKED = 16384;
    private static final int PFLAG3_AUTOFILLID_EXPLICITLY_SET = 1073741824;
    static final int PFLAG3_CALLED_SUPER = 16;
    private static final int PFLAG3_CLUSTER = 32768;
    private static final int PFLAG3_FINGER_DOWN = 131072;
    static final int PFLAG3_FITTING_SYSTEM_WINDOWS = 64;
    private static final int PFLAG3_FOCUSED_BY_DEFAULT = 262144;
    private static final int PFLAG3_HAS_OVERLAPPING_RENDERING_FORCED = 16777216;
    static final int PFLAG3_IMPORTANT_FOR_AUTOFILL_MASK = 7864320;
    static final int PFLAG3_IMPORTANT_FOR_AUTOFILL_SHIFT = 19;
    private static final int PFLAG3_IS_AUTOFILLED = 65536;
    static final int PFLAG3_IS_LAID_OUT = 4;
    static final int PFLAG3_MEASURE_NEEDED_BEFORE_LAYOUT = 8;
    static final int PFLAG3_NESTED_SCROLLING_ENABLED = 128;
    static final int PFLAG3_NOTIFY_AUTOFILL_ENTER_ON_LAYOUT = 134217728;
    private static final int PFLAG3_NO_REVEAL_ON_FOCUS = 67108864;
    private static final int PFLAG3_OVERLAPPING_RENDERING_FORCED_VALUE = 8388608;
    private static final int PFLAG3_SCREEN_READER_FOCUSABLE = 268435456;
    static final int PFLAG3_SCROLL_INDICATOR_BOTTOM = 512;
    static final int PFLAG3_SCROLL_INDICATOR_END = 8192;
    static final int PFLAG3_SCROLL_INDICATOR_LEFT = 1024;
    static final int PFLAG3_SCROLL_INDICATOR_RIGHT = 2048;
    static final int PFLAG3_SCROLL_INDICATOR_START = 4096;
    static final int PFLAG3_SCROLL_INDICATOR_TOP = 256;
    static final int PFLAG3_TEMPORARY_DETACH = 33554432;
    static final int PFLAG3_VIEW_IS_ANIMATING_ALPHA = 2;
    static final int PFLAG3_VIEW_IS_ANIMATING_TRANSFORM = 1;
    private static final int PFLAG4_ALLOW_CLICK_WHEN_DISABLED = 4096;
    private static final int PFLAG4_AUTOFILL_HIDE_HIGHLIGHT = 512;
    private static final int PFLAG4_AUTO_HANDWRITING_ENABLED = 65536;
    private static final int PFLAG4_CONTENT_CAPTURE_IMPORTANCE_CACHED_VALUE = 128;
    private static final int PFLAG4_CONTENT_CAPTURE_IMPORTANCE_IS_CACHED = 64;
    private static final int PFLAG4_CONTENT_CAPTURE_IMPORTANCE_MASK = 192;
    private static final int PFLAG4_CONTENT_SENSITIVITY_MASK = 50331648;
    private static final int PFLAG4_CONTENT_SENSITIVITY_SHIFT = 24;
    private static final int PFLAG4_DETACHED = 8192;
    private static final int PFLAG4_DRAG_A11Y_STARTED = 32768;
    private static final int PFLAG4_FORCED_OVERRIDE_FRAME_RATE = 1073741824;
    static final int PFLAG4_FRAMEWORK_OPTIONAL_FITS_SYSTEM_WINDOWS = 256;
    private static final int PFLAG4_HAS_DRAWN = 134217728;
    private static final int PFLAG4_HAS_MOVED = 268435456;
    private static final int PFLAG4_HAS_TRANSLATION_TRANSIENT_STATE = 16384;
    private static final int PFLAG4_HAS_VIEW_PROPERTY_INVALIDATION = 536870912;
    private static final int PFLAG4_IMPORTANT_FOR_CONTENT_CAPTURE_MASK = 15;
    private static final int PFLAG4_IMPORTANT_FOR_CREDENTIAL_MANAGER = 131072;
    private static final int PFLAG4_IS_COUNTED_AS_SENSITIVE = 67108864;
    private static final int PFLAG4_NOTIFIED_CONTENT_CAPTURE_APPEARED = 16;
    private static final int PFLAG4_NOTIFIED_CONTENT_CAPTURE_DISAPPEARED = 32;
    private static final int PFLAG4_RELAYOUT_TRACING_ENABLED = 524288;
    private static final int PFLAG4_ROTARY_HAPTICS_DETERMINED = 1048576;
    private static final int PFLAG4_ROTARY_HAPTICS_ENABLED = 2097152;
    private static final int PFLAG4_ROTARY_HAPTICS_SCROLL_SINCE_LAST_ROTARY_INPUT = 4194304;
    private static final int PFLAG4_ROTARY_HAPTICS_WAITING_FOR_SCROLL_EVENT = 8388608;
    static final int PFLAG4_SCROLL_CAPTURE_HINT_MASK = 7168;
    static final int PFLAG4_SCROLL_CAPTURE_HINT_SHIFT = 10;
    private static final int PFLAG4_SELF_REQUESTED_FRAME_RATE = -2147483648;
    private static final int PFLAG4_TRAVERSAL_TRACING_ENABLED = 262144;
    static final int PFLAG_ACTIVATED = 1073741824;
    static final int PFLAG_ALPHA_SET = 262144;
    static final int PFLAG_ANIMATION_STARTED = 65536;
    private static final int PFLAG_AWAKEN_SCROLL_BARS_ON_ATTACH = 134217728;
    static final int PFLAG_CANCEL_NEXT_UP_EVENT = 67108864;
    static final int PFLAG_DIRTY = 2097152;
    static final int PFLAG_DIRTY_MASK = 2097152;
    static final int PFLAG_DRAWABLE_STATE_DIRTY = 1024;
    static final int PFLAG_DRAWING_CACHE_VALID = 32768;
    static final int PFLAG_DRAWN = 32;
    static final int PFLAG_DRAW_ANIMATION = 64;
    static final int PFLAG_FOCUSED = 2;
    static final int PFLAG_FORCE_LAYOUT = 4096;
    static final int PFLAG_HAS_BOUNDS = 16;
    private static final int PFLAG_HOVERED = 268435456;
    static final int PFLAG_INVALIDATED = -2147483648;
    static final int PFLAG_IS_ROOT_NAMESPACE = 8;
    static final int PFLAG_LAYOUT_REQUIRED = 8192;
    static final int PFLAG_MEASURED_DIMENSION_SET = 2048;
    private static final int PFLAG_NOTIFY_AUTOFILL_MANAGER_ON_CLICK = 536870912;
    static final int PFLAG_OPAQUE_BACKGROUND = 8388608;
    static final int PFLAG_OPAQUE_MASK = 25165824;
    static final int PFLAG_OPAQUE_SCROLLBARS = 16777216;
    private static final int PFLAG_PREPRESSED = 33554432;
    private static final int PFLAG_PRESSED = 16384;
    static final int PFLAG_REQUEST_TRANSPARENT_REGIONS = 512;
    private static final int PFLAG_SAVE_STATE_CALLED = 131072;
    static final int PFLAG_SCROLL_CONTAINER = 524288;
    static final int PFLAG_SCROLL_CONTAINER_ADDED = 1048576;
    static final int PFLAG_SELECTED = 4;
    static final int PFLAG_SKIP_DRAW = 128;
    static final int PFLAG_WANTS_FOCUS = 1;
    public static final int POINTER_CAPTURE_MODE_ABSOLUTE = 1;
    public static final int POINTER_CAPTURE_MODE_RELATIVE = 2;
    public static final int POINTER_CAPTURE_MODE_UNCAPTURED = 0;
    private static final int POPULATING_ACCESSIBILITY_EVENT_TYPES = 172479;
    protected static final int[] PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_SELECTED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_STATE_SET = null;
    protected static final int[] PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_FOCUSED_SELECTED_STATE_SET = null;
    protected static final int[] PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_SELECTED_STATE_SET = null;
    protected static final int[] PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    protected static final int[] PRESSED_STATE_SET = null;
    protected static final int[] PRESSED_WINDOW_FOCUSED_STATE_SET = null;
    private static final int PROVIDER_BACKGROUND = 0;
    private static final int PROVIDER_BOUNDS = 2;
    private static final int PROVIDER_NONE = 1;
    private static final int PROVIDER_PADDED_BOUNDS = 3;
    public static final int PUBLIC_STATUS_BAR_VISIBILITY_MASK = 16375;
    public static final int RECTANGLE_ON_SCREEN_REQUEST_SOURCE_INPUT_FOCUS = 3;
    public static final int RECTANGLE_ON_SCREEN_REQUEST_SOURCE_SCROLL_ONLY = 1;
    public static final int RECTANGLE_ON_SCREEN_REQUEST_SOURCE_TEXT_CURSOR = 2;
    public static final int RECTANGLE_ON_SCREEN_REQUEST_SOURCE_UNDEFINED = 0;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_DEFAULT = Float.NaN;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_HIGH = -4.0f;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_LOW = -2.0f;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_NORMAL = -3.0f;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_NO_PREFERENCE = -1.0f;
    public static final android.util.Property<android.view.View, java.lang.Float> ROTATION = null;
    public static final android.util.Property<android.view.View, java.lang.Float> ROTATION_X = null;
    public static final android.util.Property<android.view.View, java.lang.Float> ROTATION_Y = null;
    static final int SAVE_DISABLED = 65536;
    static final int SAVE_DISABLED_MASK = 65536;
    public static final android.util.Property<android.view.View, java.lang.Float> SCALE_X = null;
    public static final android.util.Property<android.view.View, java.lang.Float> SCALE_Y = null;
    public static final int SCREEN_STATE_OFF = 0;
    public static final int SCREEN_STATE_ON = 1;
    static final int SCROLLBARS_HORIZONTAL = 256;
    static final int SCROLLBARS_INSET_MASK = 16777216;
    public static final int SCROLLBARS_INSIDE_INSET = 16777216;
    public static final int SCROLLBARS_INSIDE_OVERLAY = 0;
    static final int SCROLLBARS_MASK = 768;
    static final int SCROLLBARS_NONE = 0;
    public static final int SCROLLBARS_OUTSIDE_INSET = 50331648;
    static final int SCROLLBARS_OUTSIDE_MASK = 33554432;
    public static final int SCROLLBARS_OUTSIDE_OVERLAY = 33554432;
    static final int SCROLLBARS_STYLE_MASK = 50331648;
    static final int SCROLLBARS_VERTICAL = 512;
    public static final int SCROLLBAR_POSITION_DEFAULT = 0;
    public static final int SCROLLBAR_POSITION_LEFT = 1;
    public static final int SCROLLBAR_POSITION_RIGHT = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_CAPTURE_HINT_AUTO = 0;
    public static final int SCROLL_CAPTURE_HINT_EXCLUDE = 1;
    public static final int SCROLL_CAPTURE_HINT_EXCLUDE_DESCENDANTS = 4;
    public static final int SCROLL_CAPTURE_HINT_INCLUDE = 2;
    static final int SCROLL_INDICATORS_NONE = 0;
    static final int SCROLL_INDICATORS_PFLAG3_MASK = 16128;
    static final int SCROLL_INDICATORS_TO_PFLAGS3_LSHIFT = 8;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    protected static final int[] SELECTED_STATE_SET = null;
    protected static final int[] SELECTED_WINDOW_FOCUSED_STATE_SET = null;
    public static final int SOUND_EFFECTS_ENABLED = 134217728;
    public static final int STATUS_BAR_DISABLE_BACK = 4194304;
    public static final int STATUS_BAR_DISABLE_CLOCK = 8388608;
    public static final int STATUS_BAR_DISABLE_EXPAND = 65536;
    public static final int STATUS_BAR_DISABLE_HOME = 2097152;
    public static final int STATUS_BAR_DISABLE_NOTIFICATION_ALERTS = 262144;
    public static final int STATUS_BAR_DISABLE_NOTIFICATION_ICONS = 131072;
    public static final int STATUS_BAR_DISABLE_NOTIFICATION_TICKER = 524288;
    public static final int STATUS_BAR_DISABLE_ONGOING_CALL_CHIP = 67108864;
    public static final int STATUS_BAR_DISABLE_RECENT = 16777216;
    public static final int STATUS_BAR_DISABLE_SEARCH = 33554432;
    public static final int STATUS_BAR_DISABLE_SYSTEM_INFO = 1048576;
    @java.lang.Deprecated
    public static final int STATUS_BAR_HIDDEN = 1;
    @java.lang.Deprecated
    public static final int STATUS_BAR_VISIBLE = 0;
    public static final int SYSTEM_UI_CLEARABLE_FLAGS = 7;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_FULLSCREEN = 4;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_HIDE_NAVIGATION = 2;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_IMMERSIVE = 2048;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_IMMERSIVE_STICKY = 4096;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN = 1024;
    public static final int SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION = 512;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_LAYOUT_STABLE = 256;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR = 16;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = 8192;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_LOW_PROFILE = 1;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_FLAG_VISIBLE = 0;
    @java.lang.Deprecated
    public static final int SYSTEM_UI_LAYOUT_FLAGS = 1536;
    private static final int SYSTEM_UI_RESERVED_LEGACY1 = 16384;
    private static final int SYSTEM_UI_RESERVED_LEGACY2 = 65536;
    public static final int TEXT_ALIGNMENT_CENTER = 4;
    private static final int TEXT_ALIGNMENT_DEFAULT = 1;
    public static final int TEXT_ALIGNMENT_GRAVITY = 1;
    public static final int TEXT_ALIGNMENT_INHERIT = 0;
    static final int TEXT_ALIGNMENT_RESOLVED_DEFAULT = 1;
    public static final int TEXT_ALIGNMENT_TEXT_END = 3;
    public static final int TEXT_ALIGNMENT_TEXT_START = 2;
    public static final int TEXT_ALIGNMENT_VIEW_END = 6;
    public static final int TEXT_ALIGNMENT_VIEW_START = 5;
    public static final int TEXT_DIRECTION_ANY_RTL = 2;
    private static final int TEXT_DIRECTION_DEFAULT = 0;
    public static final int TEXT_DIRECTION_FIRST_STRONG = 1;
    public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = 6;
    public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = 7;
    public static final int TEXT_DIRECTION_INHERIT = 0;
    public static final int TEXT_DIRECTION_LOCALE = 5;
    public static final int TEXT_DIRECTION_LTR = 3;
    static final int TEXT_DIRECTION_RESOLVED_DEFAULT = 1;
    public static final int TEXT_DIRECTION_RTL = 4;
    static final int TOOLTIP = 1073741824;
    public static final android.util.Property<android.view.View, java.lang.Float> TRANSLATION_X = null;
    public static final android.util.Property<android.view.View, java.lang.Float> TRANSLATION_Y = null;
    public static final android.util.Property<android.view.View, java.lang.Float> TRANSLATION_Z = null;
    private static final int UNDEFINED_PADDING = -2147483648;
    protected static final java.lang.String VIEW_LOG_TAG = "View";
    protected static final int VIEW_STRUCTURE_FOR_ASSIST = 0;
    protected static final int VIEW_STRUCTURE_FOR_AUTOFILL = 1;
    protected static final int VIEW_STRUCTURE_FOR_CONTENT_CAPTURE = 2;
    private static final int[] VISIBILITY_FLAGS = null;
    static final int VISIBILITY_MASK = 12;
    public static final int VISIBLE = 0;
    static final int WILL_NOT_CACHE_DRAWING = 131072;
    static final int WILL_NOT_DRAW = 128;
    protected static final int[] WINDOW_FOCUSED_STATE_SET = null;
    public static final android.util.Property<android.view.View, java.lang.Float> X = null;
    public static final android.util.Property<android.view.View, java.lang.Float> Y = null;
    public static final android.util.Property<android.view.View, java.lang.Float> Z = null;
    private static android.util.SparseArray<java.lang.String> mAttributeMap;
    private static boolean sAcceptZeroSizeDragShadow;
    private static boolean sAlwaysAssignFocus;
    private static boolean sAlwaysRemeasureExactly;
    private static boolean sAutoFocusableOffUIThreadWontNotifyParents;
    static boolean sBrokenInsetsDispatch;
    protected static boolean sBrokenWindowBackground;
    private static boolean sCanFocusZeroSized;
    static boolean sCascadedDragDrop;
    private static boolean sCompatibilityDone;
    private static android.graphics.Paint sDebugPaint;
    public static boolean sDebugViewAttributes;
    public static java.lang.String sDebugViewAttributesApplicationPackage;
    static boolean sForceLayoutWhenInsetsChanged;
    private static int[][] sFrameRateMappings;
    static boolean sHasFocusableExcludeAutoFocusable;
    private static int sNextAccessibilityViewId;
    private static final java.util.concurrent.atomic.AtomicInteger sNextGeneratedId = null;
    protected static boolean sPreserveMarginParamsInLayoutParamConversion;
    static boolean sTextureViewIgnoresDrawableSetters;
    static final java.lang.ThreadLocal<android.graphics.Rect> sThreadLocal = null;
    private static boolean sThrowOnInvalidFloatProperties;
    private static final boolean sToolkitFrameRateBySizeReadOnlyFlagValue = Boolean.valueOf(false);
    private static boolean sToolkitMetricsForFrameRateDecisionFlagValue;
    protected static boolean sToolkitSetFrameRateReadOnlyFlagValue;
    private static boolean sToolkitViewGroupFrameRateApiFlagValue;
    private static boolean sTraceLayoutSteps;
    private static java.lang.String sTraceRequestLayoutClass;
    private static boolean sUseDefaultFocusHighlight;
    private static boolean sUseMeasureCacheDuringForceLayoutFlagValue;
    private int mAccessibilityCursorPosition;
    android.view.View.AccessibilityDelegate mAccessibilityDelegate;
    private java.lang.CharSequence mAccessibilityPaneTitle;
    private int mAccessibilityTraversalAfterId;
    private int mAccessibilityTraversalBeforeId;
    private int mAccessibilityViewId;
    private java.lang.String mAllowedHandwritingDelegatePackageName;
    private java.lang.String mAllowedHandwritingDelegatorPackageName;
    private android.view.ViewPropertyAnimator mAnimator;
    android.view.View.AttachInfo mAttachInfo;
    private android.util.SparseArray<int[]> mAttributeResolutionStacks;
    private android.util.SparseIntArray mAttributeSourceResId;
    @android.view.ViewDebug.ExportedProperty(category="attributes", hasAdjacentMapping=true)
    public java.lang.String[] mAttributes;
    private java.lang.String[] mAutofillHints;
    private android.view.autofill.AutofillId mAutofillId;
    private int mAutofillViewId;
    @android.view.ViewDebug.ExportedProperty(deepExport=true, prefix="bg_")
    private android.graphics.drawable.Drawable mBackground;
    android.graphics.RenderNode mBackgroundRenderNode;
    private int mBackgroundResource;
    private boolean mBackgroundSizeChanged;
    private android.view.View.TintInfo mBackgroundTint;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    protected int mBottom;
    public boolean mCachingFailed;
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    android.graphics.Rect mClipBounds;
    private android.view.contentcapture.ContentCaptureSession mContentCaptureSession;
    private boolean mContentCaptureSessionCached;
    private java.lang.CharSequence mContentDescription;
    @android.view.ViewDebug.ExportedProperty(deepExport=true)
    protected android.content.Context mContext;
    protected android.view.animation.Animation mCurrentAnimation;
    private android.graphics.drawable.Drawable mDefaultFocusHighlight;
    private android.graphics.drawable.Drawable mDefaultFocusHighlightCache;
    boolean mDefaultFocusHighlightEnabled;
    private boolean mDefaultFocusHighlightSizeChanged;
    private int[] mDrawableState;
    private android.graphics.Bitmap mDrawingCache;
    private int mDrawingCacheBackgroundColor;
    private int mExplicitAccessibilityDataSensitive;
    private int mExplicitStyle;
    private android.view.ViewTreeObserver mFloatingTreeObserver;
    @android.view.ViewDebug.ExportedProperty(deepExport=true, prefix="fg_")
    private android.view.View.ForegroundInfo mForegroundInfo;
    private float mFrameContentVelocity;
    private java.util.ArrayList<android.view.FrameMetricsObserver> mFrameMetricsObservers;
    int mFrameRateCompatibility;
    android.view.GhostView mGhostView;
    private float mHandwritingBoundsOffsetBottom;
    private float mHandwritingBoundsOffsetLeft;
    private float mHandwritingBoundsOffsetRight;
    private float mHandwritingBoundsOffsetTop;
    private int mHandwritingDelegateFlags;
    private java.lang.Runnable mHandwritingDelegatorCallback;
    private boolean mHasPerformedLongPress;
    private boolean mHoveringTouchDelegate;
    @android.view.ViewDebug.ExportedProperty(resolveId=true)
    int mID;
    private boolean mIgnoreNextUpEvent;
    private boolean mInContextButtonPress;
    private int mInferredAccessibilityDataSensitive;
    protected final android.view.InputEventConsistencyVerifier mInputEventConsistencyVerifier = null;
    private boolean mIsHandwritingDelegate;
    private android.util.SparseArray<java.lang.Object> mKeyedTags;
    private int mLabelForId;
    private int mLastFrameLeft;
    private int mLastFrameRateCategory;
    private int mLastFrameTop;
    private boolean mLastIsOpaque;
    android.graphics.Paint mLayerPaint;
    int mLayerType;
    private android.graphics.Insets mLayoutInsets;
    protected android.view.ViewGroup.LayoutParams mLayoutParams;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    protected int mLeft;
    private boolean mLeftPaddingDefined;
    android.view.View.ListenerInfo mListenerInfo;
    private float mLongClickX;
    private float mLongClickY;
    private android.view.View.MatchIdPredicate mMatchIdPredicate;
    private android.view.View.MatchLabelForPredicate mMatchLabelForPredicate;
    private android.util.LongSparseLongArray mMeasureCache;
    @android.view.ViewDebug.ExportedProperty(category="measurement")
    int mMeasuredHeight;
    @android.view.ViewDebug.ExportedProperty(category="measurement")
    int mMeasuredWidth;
    @android.view.ViewDebug.ExportedProperty(category="measurement")
    private int mMinHeight;
    @android.view.ViewDebug.ExportedProperty(category="measurement")
    private int mMinWidth;
    private android.view.PointerIcon mMousePointerIcon;
    private android.view.ViewParent mNestedScrollingParent;
    int mNextClusterForwardId;
    private int mNextFocusDownId;
    int mNextFocusForwardId;
    private int mNextFocusLeftId;
    private int mNextFocusRightId;
    private int mNextFocusUpId;
    int mOldHeightMeasureSpec;
    int mOldWidthMeasureSpec;
    android.view.ViewOutlineProvider mOutlineProvider;
    private int mOverScrollMode;
    android.view.ViewOverlay mOverlay;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    protected int mPaddingBottom;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    protected int mPaddingLeft;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    protected int mPaddingRight;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    protected int mPaddingTop;
    protected android.view.ViewParent mParent;
    private android.view.View.CheckForLongPress mPendingCheckForLongPress;
    private android.view.View.CheckForTap mPendingCheckForTap;
    private android.view.View.PerformClick mPerformClick;
    private float mPreferredFrameRate;
    @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(equals=4096, mask=4096, name="FORCE_LAYOUT"), @android.view.ViewDebug.FlagToString(equals=8192, mask=8192, name="LAYOUT_REQUIRED"), @android.view.ViewDebug.FlagToString(equals=32768, mask=32768, name="DRAWING_CACHE_INVALID", outputIf=false), @android.view.ViewDebug.FlagToString(equals=32, mask=32, name="DRAWN", outputIf=true), @android.view.ViewDebug.FlagToString(equals=32, mask=32, name="NOT_DRAWN", outputIf=false), @android.view.ViewDebug.FlagToString(equals=2097152, mask=2097152, name="DIRTY")}, formatToHexString=true)
    public int mPrivateFlags;
    int mPrivateFlags2;
    int mPrivateFlags3;
    private int mPrivateFlags4;
    private java.lang.String[] mReceiveContentMimeTypes;
    boolean mRecreateDisplayList;
    final android.graphics.RenderNode mRenderNode = null;
    private final android.content.res.Resources mResources = null;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    protected int mRight;
    private boolean mRightPaddingDefined;
    private android.view.RoundScrollbarRenderer mRoundScrollbarRenderer;
    private android.view.HandlerActionQueue mRunQueue;
    private android.view.View.ScrollabilityCache mScrollCache;
    public android.view.HapticScrollFeedbackProvider mScrollFeedbackProvider;
    private android.graphics.drawable.Drawable mScrollIndicatorDrawable;
    @android.view.ViewDebug.ExportedProperty(category="scrolling")
    protected int mScrollX;
    @android.view.ViewDebug.ExportedProperty(category="scrolling")
    protected int mScrollY;
    private android.view.View.SendAccessibilityEventThrottle mSendStateChangedAccessibilityEvent;
    private android.view.View.SendViewScrolledAccessibilityEvent mSendViewScrolledAccessibilityEvent;
    private boolean mSendingHoverAccessibilityEvents;
    private boolean mShouldFakeFocus;
    private int mSizeBasedFrameRateCategoryAndReason;
    private int mSourceLayoutId;
    java.lang.String mStartActivityRequestWho;
    private java.lang.CharSequence mStateDescription;
    private android.animation.StateListAnimator mStateListAnimator;
    private java.lang.CharSequence mSupplementalDescription;
    @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(equals=1, mask=1, name="LOW_PROFILE"), @android.view.ViewDebug.FlagToString(equals=2, mask=2, name="HIDE_NAVIGATION"), @android.view.ViewDebug.FlagToString(equals=4, mask=4, name="FULLSCREEN"), @android.view.ViewDebug.FlagToString(equals=256, mask=256, name="LAYOUT_STABLE"), @android.view.ViewDebug.FlagToString(equals=512, mask=512, name="LAYOUT_HIDE_NAVIGATION"), @android.view.ViewDebug.FlagToString(equals=1024, mask=1024, name="LAYOUT_FULLSCREEN"), @android.view.ViewDebug.FlagToString(equals=2048, mask=2048, name="IMMERSIVE"), @android.view.ViewDebug.FlagToString(equals=4096, mask=4096, name="IMMERSIVE_STICKY"), @android.view.ViewDebug.FlagToString(equals=8192, mask=8192, name="LIGHT_STATUS_BAR"), @android.view.ViewDebug.FlagToString(equals=16, mask=16, name="LIGHT_NAVIGATION_BAR"), @android.view.ViewDebug.FlagToString(equals=65536, mask=65536, name="STATUS_BAR_DISABLE_EXPAND"), @android.view.ViewDebug.FlagToString(equals=131072, mask=131072, name="STATUS_BAR_DISABLE_NOTIFICATION_ICONS"), @android.view.ViewDebug.FlagToString(equals=262144, mask=262144, name="STATUS_BAR_DISABLE_NOTIFICATION_ALERTS"), @android.view.ViewDebug.FlagToString(equals=524288, mask=524288, name="STATUS_BAR_DISABLE_NOTIFICATION_TICKER"), @android.view.ViewDebug.FlagToString(equals=1048576, mask=1048576, name="STATUS_BAR_DISABLE_SYSTEM_INFO"), @android.view.ViewDebug.FlagToString(equals=2097152, mask=2097152, name="STATUS_BAR_DISABLE_HOME"), @android.view.ViewDebug.FlagToString(equals=4194304, mask=4194304, name="STATUS_BAR_DISABLE_BACK"), @android.view.ViewDebug.FlagToString(equals=8388608, mask=8388608, name="STATUS_BAR_DISABLE_CLOCK"), @android.view.ViewDebug.FlagToString(equals=16777216, mask=16777216, name="STATUS_BAR_DISABLE_RECENT"), @android.view.ViewDebug.FlagToString(equals=33554432, mask=33554432, name="STATUS_BAR_DISABLE_SEARCH"), @android.view.ViewDebug.FlagToString(equals=67108864, mask=67108864, name="STATUS_BAR_DISABLE_ONGOING_CALL_CHIP")}, formatToHexString=true)
    int mSystemUiVisibility;
    protected java.lang.Object mTag;
    private int[] mTempNestedScrollConsumed;
    android.view.View.TooltipInfo mTooltipInfo;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    protected int mTop;
    private android.view.TouchDelegate mTouchDelegate;
    private android.view.ViewTraversalTracingStrings mTracingStrings;
    public android.view.View.TransformationInfo mTransformationInfo;
    int mTransientStateCount;
    private java.lang.String mTransitionName;
    int mUnbufferedInputSource;
    private android.graphics.Bitmap mUnscaledDrawingCache;
    private android.view.View.UnsetPressedState mUnsetPressedState;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    protected int mUserPaddingBottom;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    int mUserPaddingEnd;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    protected int mUserPaddingLeft;
    int mUserPaddingLeftInitial;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    protected int mUserPaddingRight;
    int mUserPaddingRightInitial;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    int mUserPaddingStart;
    private float mVerticalScrollFactor;
    private int mVerticalScrollbarPosition;
    private final android.view.ViewConfiguration mViewConfiguration = null;
    private android.view.ViewCredentialHandler mViewCredentialHandler;
    @android.view.ViewDebug.ExportedProperty(formatToHexString=true)
    int mViewFlags;
    private android.view.translation.ViewTranslationCallback mViewTranslationCallback;
    private android.view.translation.ViewTranslationResponse mViewTranslationResponse;
    private android.os.Handler mVisibilityChangeForAutofillHandler;
    int mWindowAttachCount;
    View() {}
    public View(android.content.Context p0) {}
    public View(android.content.Context p0, android.util.AttributeSet p1) {}
    public View(android.content.Context p0, android.util.AttributeSet p1, int p2) {}
    public View(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) {}
    private void addExtraDataToAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0, java.lang.String p1, android.os.Bundle p2) {}
    private void applyBackgroundTint() {}
    private void applyForegroundTint() {}
    private void applyInsets(android.graphics.Rect p0) {}
    private boolean applyLegacyAnimation(android.view.ViewGroup p0, long p1, android.view.animation.Animation p2, boolean p3) { return false; }
    private void buildDrawingCacheImpl(boolean p0) {}
    private boolean calculateIsImportantForContentCapture() { return false; }
    private boolean canAcceptAccessibilityDrop() { return false; }
    private boolean canTakeFocus() { return false; }
    private void cancel(android.view.View.SendAccessibilityEventThrottle p0) {}
    private void checkForLongClick(long p0, float p1, float p2, int p3) {}
    static void cleanUpPendingIntents(android.content.ClipData p0) {}
    private void cleanupDraw() {}
    private void clearAccessibilityThrottles() {}
    public static int combineMeasuredStates(int p0, int p1) { return 0; }
    private int computeHapticFeedbackPrivateFlags() { return 0; }
    private float convertVelocityToFrameRate(float p0) { return 0.0f; }
    private void debugDrawFocus(android.graphics.Canvas p0) {}
    protected static java.lang.String debugIndent(int p0) { return null; }
    private void deepCopyRectsObjectRecycling(java.util.ArrayList<android.graphics.Rect> p0, java.util.List<android.graphics.Rect> p1) {}
    private boolean detached() { return false; }
    private void dispatchContentCaptureInteractionEvent() {}
    private boolean dispatchGenericMotionEventInternal(android.view.MotionEvent p0) { return false; }
    private void dispatchProvideStructure(android.view.ViewStructure p0, int p1, int p2) {}
    private boolean dispatchTouchExplorationHoverEvent(android.view.MotionEvent p0) { return false; }
    private void doRotaryLimitForScrollHaptics(android.view.MotionEvent p0) {}
    private void doRotaryProgressForScrollHaptics(android.view.MotionEvent p0) {}
    private void drawAutofilledHighlight(android.graphics.Canvas p0) {}
    private void drawBackground(android.graphics.Canvas p0) {}
    private void drawDefaultFocusHighlight(android.graphics.Canvas p0) {}
    private static void dumpFlag(java.util.HashMap<java.lang.String, java.lang.String> p0, java.lang.String p1, int p2) {}
    private static void dumpFlags() {}
    private android.view.View findAccessibilityFocusHost(boolean p0) { return null; }
    private android.view.FrameMetricsObserver findFrameMetricsObserver(android.view.Window.OnFrameMetricsAvailableListener p0) { return null; }
    private android.view.View findLabelForView(android.view.View p0, int p1) { return null; }
    private android.view.View findViewInsideOutShouldExist(android.view.View p0, int p1) { return null; }
    private android.view.View findViewInsideOutShouldExist(android.view.View p0, android.view.View p1, int p2) { return null; }
    private boolean fitSystemWindowsInt(android.graphics.Rect p0) { return false; }
    public static int generateViewId() { return 0; }
    private android.view.contentcapture.ContentCaptureSession getAndCacheContentCaptureSession() { return null; }
    private static android.util.SparseArray<java.lang.String> getAttributeMap() { return null; }
    private android.view.autofill.AutofillManager getAutofillManager() { return null; }
    private android.graphics.drawable.Drawable getAutofilledDrawable() { return null; }
    private void getBoundsInParent(android.view.accessibility.AccessibilityNodeInfo p0, android.view.accessibility.AccessibilityNodeInfo p1, android.graphics.Rect p2) {}
    private void getBoundsToScreenInternal(android.graphics.RectF p0, boolean p1) {}
    private void getBoundsToWindowInternal(android.graphics.RectF p0, boolean p1) {}
    static android.graphics.Paint getDebugPaint() { return null; }
    private android.graphics.drawable.Drawable getDefaultFocusHighlightDrawable() { return null; }
    public static int getDefaultSize(int p0, int p1) { return 0; }
    private android.graphics.RenderNode getDrawableRenderNode(android.graphics.drawable.Drawable p0, android.graphics.RenderNode p1) { return null; }
    private float getFinalAlpha() { return 0.0f; }
    private int getFocusableAttribute(android.content.res.TypedArray p0) { return 0; }
    private float getFrameRateByVelocity(java.util.List<android.view.FrameRateVelocityPoint> p0, float p1) { return 0.0f; }
    private int getFrameRateByVelocity(int[][] p0, int p1) { return 0; }
    private void getHorizontalScrollBarBounds(android.graphics.Rect p0, android.graphics.Rect p1) {}
    private boolean getNotifiedContentCaptureDisappeared() { return false; }
    private android.view.View getProjectionReceiver() { return null; }
    private android.view.HandlerActionQueue getRunQueue() { return null; }
    private android.view.View.ScrollabilityCache getScrollCache() { return null; }
    private android.view.HapticScrollFeedbackProvider getScrollFeedbackProvider() { return null; }
    private void getStraightVerticalScrollBarBounds(android.graphics.Rect p0, android.graphics.Rect p1) {}
    private int getTapTimeoutMillis() { return 0; }
    private android.view.View.SendAccessibilityEventThrottle getThrottleForAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return null; }
    private void getVerticalScrollBarBounds(android.graphics.Rect p0, android.graphics.Rect p1) {}
    private void handleTooltipUp() {}
    static boolean hasActivityPendingIntents(android.content.ClipData p0) { return false; }
    private boolean hasAncestorThatBlocksDescendantFocus() { return false; }
    private boolean hasExpensiveMeasuresDuringInputEvent() { return false; }
    private boolean hasListenersForAccessibility() { return false; }
    private boolean hasParentWantsFocus() { return false; }
    private boolean hasPendingLongPressCallback() { return false; }
    private boolean hasRtlSupport() { return false; }
    private boolean hasSize() { return false; }
    public static android.view.View inflate(android.content.Context p0, int p1, android.view.ViewGroup p2) { return null; }
    private void initScrollCache() {}
    private boolean initialAwakenScrollBars() { return false; }
    private void initializeScrollBarDrawable() {}
    private void initializeScrollIndicatorsInternal() {}
    private boolean isAccessibilityPane() { return false; }
    private boolean isAutofillable() { return false; }
    public static boolean isDefaultFocusHighlightEnabled() { return false; }
    private boolean isHoverable() { return false; }
    public static boolean isLayoutModeOptical(java.lang.Object p0) { return false; }
    private boolean isOnHorizontalScrollbarThumb(float p0, float p1) { return false; }
    private boolean isOnVerticalScrollbarThumb(float p0, float p1) { return false; }
    private boolean isPerformHapticFeedbackSuppressed(int p0, int p1) { return false; }
    private boolean isProjectionReceiver() { return false; }
    private boolean isRelayoutTracingEnabled() { return false; }
    private boolean isRtlCompatibilityMode() { return false; }
    private boolean isTraversalTracingEnabled() { return false; }
    private static boolean isViewIdGenerated(int p0) { return false; }
    private void makeParentImportantAndNotifyAppearedEventIfNeed() {}
    protected static int[] mergeDrawableStates(int[] p0, int[] p1) { return null; }
    private boolean needRtlPropertiesResolution() { return false; }
    private void notifyAppearedOrDisappearedForContentCaptureIfNeeded(boolean p0) {}
    private boolean notifyAugmentedAutofillIfNeeded(android.view.autofill.AutofillManager p0) { return false; }
    private void notifyAutofillManagerOnClick() {}
    private void notifyAutofillManagerViewVisibilityChanged(boolean p0) {}
    private void notifyFocusChangeToImeFocusController(boolean p0) {}
    private void notifySubtreeAccessibilityStateChangedByParentIfNeeded() {}
    private static int numViewsForAccessibility(android.view.View p0) { return 0; }
    private android.view.WindowInsets onApplyFrameworkOptionalFitSystemWindows(android.view.WindowInsets p0) { return null; }
    private void onDrawScrollIndicators(android.graphics.Canvas p0) {}
    private void onProvideVirtualStructureCompat(android.view.ViewStructure p0, boolean p1) {}
    private boolean performClickInternal() { return false; }
    private boolean performLongClickInternal(float p0, float p1) { return false; }
    private boolean performOnTouchCallback(android.view.MotionEvent p0) { return false; }
    private void populateAccessibilityNodeInfoDrawingOrderInParent(android.view.accessibility.AccessibilityNodeInfo p0) {}
    private void populateVirtualStructure(android.view.ViewStructure p0, android.view.accessibility.AccessibilityNodeProvider p1, android.view.accessibility.AccessibilityNodeInfo p2, android.view.accessibility.AccessibilityNodeInfo p3, boolean p4) {}
    private void postSendViewScrolledAccessibilityEventCallback(int p0, int p1) {}
    private void postUpdate(java.lang.Runnable p0) {}
    private static java.lang.String printFlags(int p0) { return null; }
    private static java.lang.String printPrivateFlags(int p0) { return null; }
    private void printStackStrace(java.lang.String p0) {}
    private void processScrollEventForRotaryEncoderHaptics() {}
    private void rebuildOutline() {}
    private void recordGestureClassification(int p0) {}
    public static void registerCalledFromWrongThreadListener(android.view.View.CalledFromWrongThreadListener p0) {}
    private void registerPendingFrameMetricsObservers() {}
    private void removeLongPressCallback() {}
    private void removePerformClickCallback() {}
    private void removeTapCallback() {}
    private void removeUnsetPressCallback() {}
    private boolean requestFocusNoSearch(int p0, android.graphics.Rect p1) { return false; }
    private void requestParentSendAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    private void resetDisplayList() {}
    private void resetPressedState() {}
    public static int resolveSize(int p0, int p1) { return 0; }
    public static int resolveSizeAndState(int p0, int p1, int p2) { return 0; }
    private void retrieveExplicitStyle(android.content.res.Resources.Theme p0, android.util.AttributeSet p1) {}
    private static float sanitizeFloatPropertyValue(float p0, java.lang.String p1) { return 0.0f; }
    private static float sanitizeFloatPropertyValue(float p0, java.lang.String p1, float p2, float p3) { return 0.0f; }
    private void saveAttributeData(android.util.AttributeSet p0, android.content.res.TypedArray p1) {}
    private void sendAccessibilityHoverEvent(int p0) {}
    private void sendViewTextTraversedAtGranularityEvent(int p0, int p1, int p2, int p3) {}
    private void setBackgroundRenderNodeProperties(android.graphics.RenderNode p0) {}
    private void setDefaultFocusHighlight(android.graphics.drawable.Drawable p0) {}
    private void setFocusedInCluster(android.view.View p0) {}
    private void setKeyedTag(int p0, java.lang.Object p1) {}
    private void setMeasuredDimensionRaw(int p0, int p1) {}
    private void setNotifiedContentCaptureAppeared() {}
    private boolean setOpticalFrame(int p0, int p1, int p2, int p3) { return false; }
    private void setOutlineProviderFromAttribute(int p0) {}
    private void setPressed(boolean p0, float p1, float p2) {}
    private void setRelayoutTracingEnabled(boolean p0) {}
    public static void setTraceLayoutSteps(boolean p0) {}
    public static void setTracedRequestLayoutClassClass(java.lang.String p0) {}
    private void setTraversalTracingEnabled(boolean p0) {}
    private boolean showHoverTooltip() { return false; }
    private boolean showLongClickTooltip(int p0, int p1) { return false; }
    private boolean showTooltip(int p0, int p1, boolean p2) { return false; }
    private void sizeChange(int p0, int p1, int p2, int p3) {}
    private boolean skipInvalidate() { return false; }
    private boolean startedSystemDragForAccessibility() { return false; }
    private void switchDefaultFocusHighlight() {}
    private boolean traverseAtGranularity(int p0, boolean p1, boolean p2) { return false; }
    public static void unregisterCalledFromWrongThreadListener(android.view.View.CalledFromWrongThreadListener p0) {}
    private void updateFocusedInCluster(android.view.View p0, int p1) {}
    private void updatePflags3AndNotifyA11yIfChanged(int p0, boolean p1) {}
    private void updatePositionUpdateListener() {}
    private void updatePreferKeepClearForFocus() {}
    private void updateSensitiveViewsCountIfNeeded(boolean p0) {}
    public void addChildrenForAccessibility(java.util.ArrayList<android.view.View> p0) {}
    public void addExtraDataToAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0, java.lang.String p1, android.os.Bundle p2) {}
    public void addFocusables(java.util.ArrayList<android.view.View> p0, int p1) {}
    public void addFocusables(java.util.ArrayList<android.view.View> p0, int p1, int p2) {}
    public void addFrameMetricsListener(android.view.Window p0, android.view.Window.OnFrameMetricsAvailableListener p1, android.os.Handler p2) {}
    public void addKeyboardNavigationClusters(java.util.Collection<android.view.View> p0, int p1) {}
    public void addOnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener p0) {}
    public void addOnLayoutChangeListener(android.view.View.OnLayoutChangeListener p0) {}
    public void addOnUnhandledKeyEventListener(android.view.View.OnUnhandledKeyEventListener p0) {}
    public void addTouchables(java.util.ArrayList<android.view.View> p0) {}
    public android.view.ViewPropertyAnimator animate() { return null; }
    @java.lang.Deprecated
    public void announceForAccessibility(java.lang.CharSequence p0) {}
    void appendId(java.lang.StringBuilder p0) {}
    public void applyDrawableToTransparentRegion(android.graphics.drawable.Drawable p0, android.graphics.Region p1) {}
    boolean areDrawablesResolved() { return false; }
    void assignParent(android.view.ViewParent p0) {}
    public void autofill(android.util.SparseArray<android.view.autofill.AutofillValue> p0) {}
    public void autofill(android.view.autofill.AutofillValue p0) {}
    protected boolean awakenScrollBars() { return false; }
    protected boolean awakenScrollBars(int p0) { return false; }
    protected boolean awakenScrollBars(int p0, boolean p1) { return false; }
    public void bringToFront() {}
    @java.lang.Deprecated
    public void buildDrawingCache() {}
    @java.lang.Deprecated
    public void buildDrawingCache(boolean p0) {}
    public void buildLayer() {}
    void calculateAccessibilityDataSensitive() {}
    protected int calculateFrameRateCategory() { return 0; }
    final boolean callDragEventHandler(android.view.DragEvent p0) { return false; }
    public boolean callOnClick() { return false; }
    boolean canAcceptDrag() { return false; }
    public boolean canHaveDisplayList() { return false; }
    public boolean canNotifyAutofillEnterExitEvent() { return false; }
    protected boolean canReceivePointerEvents() { return false; }
    public boolean canResolveLayoutDirection() { return false; }
    public boolean canResolveTextAlignment() { return false; }
    public boolean canResolveTextDirection() { return false; }
    public boolean canScrollHorizontally(int p0) { return false; }
    public boolean canScrollVertically(int p0) { return false; }
    public final void cancelDragAndDrop() {}
    public void cancelLongPress() {}
    public final void cancelPendingInputEvents() {}
    public void captureTransitioningViews(java.util.List<android.view.View> p0) {}
    public boolean checkInputConnectionProxy(android.view.View p0) { return false; }
    public void clearAccessibilityFocus() {}
    void clearAccessibilityFocusNoCallbacks(int p0) {}
    public void clearAnimation() {}
    public void clearFocus() {}
    public void clearFocusInternal(android.view.View p0, boolean p1, boolean p2) {}
    void clearParentsWantFocus() {}
    public void clearPendingCredentialRequest() {}
    public void clearTranslationState() {}
    public void clearViewTranslationCallback() {}
    public void clearViewTranslationResponse() {}
    java.util.List<android.graphics.Rect> collectPreferKeepClearRects() { return null; }
    java.util.List<android.graphics.Rect> collectUnrestrictedPreferKeepClearRects() { return null; }
    int combineVisibility(int p0, int p1) { return 0; }
    @java.lang.Deprecated
    protected boolean computeFitSystemWindows(android.graphics.Rect p0, android.graphics.Rect p1) { return false; }
    protected int computeHorizontalScrollExtent() { return 0; }
    protected int computeHorizontalScrollOffset() { return 0; }
    protected int computeHorizontalScrollRange() { return 0; }
    protected void computeOpaqueFlags() {}
    android.graphics.Insets computeOpticalInsets() { return null; }
    public void computeScroll() {}
    public android.view.WindowInsets computeSystemWindowInsets(android.view.WindowInsets p0, android.graphics.Rect p1) { return null; }
    protected int computeVerticalScrollExtent() { return 0; }
    protected int computeVerticalScrollOffset() { return 0; }
    protected int computeVerticalScrollRange() { return 0; }
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfoInternal() { return null; }
    public void createContextMenu(android.view.ContextMenu p0) {}
    public android.view.ScrollCaptureCallback createScrollCaptureCallbackInternal(android.graphics.Rect p0, android.graphics.Point p1) { return null; }
    public android.graphics.Bitmap createSnapshot(android.view.ViewDebug.CanvasProvider p0, boolean p1) { return null; }
    protected void damageInParent() {}
    public void debug() {}
    protected void debug(int p0) {}
    @java.lang.Deprecated
    public void destroyDrawingCache() {}
    protected void destroyHardwareResources() {}
    final int dipsToPixels(int p0) { return 0; }
    void disableRotaryScrollFeedback() {}
    public boolean dispatchActivityResult(java.lang.String p0, int p1, int p2, android.content.Intent p3) { return false; }
    public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    void dispatchAttachedToWindow(android.view.View.AttachInfo p0, int p1) {}
    void dispatchCancelPendingInputEvents() {}
    public boolean dispatchCapturedPointerEvent(android.view.MotionEvent p0) { return false; }
    void dispatchCollectViewAttributes(android.view.View.AttachInfo p0, int p1) {}
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}
    public void dispatchCreateViewTranslationRequest(java.util.Map<android.view.autofill.AutofillId, long[]> p0, int[] p1, android.view.translation.TranslationCapability p2, java.util.List<android.view.translation.ViewTranslationRequest> p3) {}
    void dispatchDetachedFromWindow() {}
    public void dispatchDisplayHint(int p0) {}
    boolean dispatchDragEnterExitInPreN(android.view.DragEvent p0) { return false; }
    public boolean dispatchDragEvent(android.view.DragEvent p0) { return false; }
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    public void dispatchDrawableHotspotChanged(float p0, float p1) {}
    public void dispatchFinishTemporaryDetach() {}
    protected boolean dispatchGenericFocusedEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    protected boolean dispatchGenericPointerEvent(android.view.MotionEvent p0) { return false; }
    protected void dispatchGetDisplayList() {}
    protected boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public void dispatchInitialProvideContentCaptureStructure() {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    void dispatchMovedToDisplay(android.view.Display p0, android.content.res.Configuration p1) {}
    public boolean dispatchNestedFling(float p0, float p1, boolean p2) { return false; }
    public boolean dispatchNestedPreFling(float p0, float p1) { return false; }
    public boolean dispatchNestedPrePerformAccessibilityAction(int p0, android.os.Bundle p1) { return false; }
    public boolean dispatchNestedPreScroll(int p0, int p1, int[] p2, int[] p3) { return false; }
    public boolean dispatchNestedScroll(int p0, int p1, int p2, int p3, int[] p4) { return false; }
    public void dispatchPointerCaptureChanged(boolean p0) {}
    public final boolean dispatchPointerEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public void dispatchProvideAutofillStructure(android.view.ViewStructure p0, int p1) {}
    void dispatchProvideContentCaptureStructure() {}
    public void dispatchProvideStructure(android.view.ViewStructure p0) {}
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    void dispatchScreenStateChanged(int p0) {}
    public void dispatchScrollCaptureSearch(android.graphics.Rect p0, android.graphics.Point p1, java.util.function.Consumer<android.view.ScrollCaptureTarget> p2) {}
    public boolean dispatchScrollToTop(int p0) { return false; }
    protected void dispatchSetActivated(boolean p0) {}
    protected void dispatchSetPressed(boolean p0) {}
    protected void dispatchSetSelected(boolean p0) {}
    public void dispatchStartTemporaryDetach() {}
    @java.lang.Deprecated
    public void dispatchSystemUiVisibilityChanged(int p0) {}
    boolean dispatchTooltipHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    android.view.View dispatchUnhandledKeyEvent(android.view.KeyEvent p0) { return null; }
    public boolean dispatchUnhandledMove(android.view.View p0, int p1) { return false; }
    boolean dispatchVisibilityAggregated(boolean p0) { return false; }
    protected void dispatchVisibilityChanged(android.view.View p0, int p1) {}
    public void dispatchWindowFocusChanged(boolean p0) {}
    public void dispatchWindowInsetsAnimationEnd(android.view.WindowInsetsAnimation p0) {}
    public void dispatchWindowInsetsAnimationPrepare(android.view.WindowInsetsAnimation p0) {}
    public android.view.WindowInsets dispatchWindowInsetsAnimationProgress(android.view.WindowInsets p0, java.util.List<android.view.WindowInsetsAnimation> p1) { return null; }
    public android.view.WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(android.view.WindowInsetsAnimation p0, android.view.WindowInsetsAnimation.Bounds p1) { return null; }
    @java.lang.Deprecated
    public void dispatchWindowSystemUiVisiblityChanged(int p0) {}
    public void dispatchWindowVisibilityChanged(int p0) {}
    public void draw(android.graphics.Canvas p0) {}
    boolean draw(android.graphics.Canvas p0, android.view.ViewGroup p1, long p2) { return false; }
    public void drawableHotspotChanged(float p0, float p1) {}
    protected void drawableStateChanged() {}
    protected final boolean drawsWithRenderNode(android.graphics.Canvas p0) { return false; }
    public void encode(android.view.ViewHierarchyEncoder p0) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    void ensureTransformationInfo() {}
    public void fakeFocusAfterAttachingToWindow() {}
    public void findAutofillableViewsByTraversal(java.util.List<android.view.View> p0) {}
    public android.view.View findFocus() { return null; }
    android.view.View findKeyboardNavigationCluster() { return null; }
    public void findNamedViews(java.util.Map<java.lang.String, android.view.View> p0) {}
    public final android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcher() { return null; }
    android.view.View findUserSetNextFocus(android.view.View p0, int p1) { return null; }
    android.view.View findUserSetNextKeyboardNavigationCluster(android.view.View p0, int p1) { return null; }
    public <T extends android.view.View> T findViewByAccessibilityIdTraversal(int p0) { return null; }
    public <T extends android.view.View> T findViewByAutofillIdTraversal(int p0) { return null; }
    public final <T extends android.view.View> T findViewById(int p0) { return null; }
    public final <T extends android.view.View> T findViewByPredicate(java.util.function.Predicate<android.view.View> p0) { return null; }
    public final <T extends android.view.View> T findViewByPredicateInsideOut(android.view.View p0, java.util.function.Predicate<android.view.View> p1) { return null; }
    protected <T extends android.view.View> T findViewByPredicateTraversal(java.util.function.Predicate<android.view.View> p0, android.view.View p1) { return null; }
    protected <T extends android.view.View> T findViewTraversal(int p0) { return null; }
    public final <T extends android.view.View> T findViewWithTag(java.lang.Object p0) { return null; }
    protected <T extends android.view.View> T findViewWithTagTraversal(java.lang.Object p0) { return null; }
    public void findViewsWithText(java.util.ArrayList<android.view.View> p0, java.lang.CharSequence p1, int p2) {}
    public void finishMovingTask() {}
    @java.lang.Deprecated
    protected boolean fitSystemWindows(android.graphics.Rect p0) { return false; }
    public final boolean fitsSystemWindows() { return false; }
    public android.view.View focusSearch(int p0) { return null; }
    public void forceHasOverlappingRendering(boolean p0) {}
    public void forceLayout() {}
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    public void generateDisplayHash(java.lang.String p0, android.graphics.Rect p1, java.util.concurrent.Executor p2, android.view.displayhash.DisplayHashResultCallback p3) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public android.view.View.AccessibilityDelegate getAccessibilityDelegate() { return null; }
    public int getAccessibilityLiveRegion() { return 0; }
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() { return null; }
    public java.lang.CharSequence getAccessibilityPaneTitle() { return null; }
    public int getAccessibilitySelectionEnd() { return 0; }
    public int getAccessibilitySelectionStart() { return 0; }
    public int getAccessibilityTraversalAfter() { return 0; }
    public int getAccessibilityTraversalBefore() { return 0; }
    public int getAccessibilityViewId() { return 0; }
    public int getAccessibilityWindowId() { return 0; }
    public java.lang.String getAllowedHandwritingDelegatePackageName() { return null; }
    public java.lang.String getAllowedHandwritingDelegatorPackageName() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getAlpha() { return 0.0f; }
    public android.view.animation.Animation getAnimation() { return null; }
    public android.graphics.Matrix getAnimationMatrix() { return null; }
    public android.os.IBinder getApplicationWindowToken() { return null; }
    public int[] getAttributeResolutionStack(int p0) { return null; }
    public java.util.Map<java.lang.Integer, java.lang.Integer> getAttributeSourceResourceMap() { return null; }
    @android.view.ViewDebug.ExportedProperty
    public java.lang.String[] getAutofillHints() { return null; }
    public final android.view.autofill.AutofillId getAutofillId() { return null; }
    public int getAutofillType() { return 0; }
    public android.view.autofill.AutofillValue getAutofillValue() { return null; }
    public final int getAutofillViewId() { return 0; }
    public android.graphics.drawable.Drawable getBackground() { return null; }
    public android.graphics.BlendMode getBackgroundTintBlendMode() { return null; }
    public android.content.res.ColorStateList getBackgroundTintList() { return null; }
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="layout")
    public int getBaseline() { return 0; }
    @android.view.ViewDebug.CapturedViewProperty
    public final int getBottom() { return 0; }
    protected float getBottomFadingEdgeStrength() { return 0.0f; }
    protected int getBottomPaddingOffset() { return 0; }
    public void getBoundsInWindow(android.graphics.Rect p0, boolean p1) {}
    public void getBoundsOnScreen(android.graphics.Rect p0) {}
    public void getBoundsOnScreen(android.graphics.Rect p0, boolean p1) {}
    public void getBoundsOnScreen(android.graphics.RectF p0, boolean p1) {}
    public float getCameraDistance() { return 0.0f; }
    public android.graphics.Rect getClipBounds() { return null; }
    public boolean getClipBounds(android.graphics.Rect p0) { return false; }
    public final boolean getClipToOutline() { return false; }
    public final android.view.contentcapture.ContentCaptureSession getContentCaptureSession() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="accessibility")
    public java.lang.CharSequence getContentDescription() { return null; }
    public final int getContentSensitivity() { return 0; }
    @android.view.ViewDebug.CapturedViewProperty
    public final android.content.Context getContext() { return null; }
    protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public final boolean getDefaultFocusHighlightEnabled() { return false; }
    public android.view.Display getDisplay() { return null; }
    public final int[] getDrawableState() { return null; }
    @java.lang.Deprecated
    public android.graphics.Bitmap getDrawingCache() { return null; }
    @java.lang.Deprecated
    public android.graphics.Bitmap getDrawingCache(boolean p0) { return null; }
    @java.lang.Deprecated
    public int getDrawingCacheBackgroundColor() { return 0; }
    @java.lang.Deprecated
    public int getDrawingCacheQuality() { return 0; }
    public void getDrawingRect(android.graphics.Rect p0) {}
    public long getDrawingTime() { return 0L; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getElevation() { return 0.0f; }
    public int getExplicitStyle() { return 0; }
    protected int getFadeHeight(boolean p0) { return 0; }
    protected int getFadeTop(boolean p0) { return 0; }
    public int getFadingEdge() { return 0; }
    public int getFadingEdgeLength() { return 0; }
    @android.view.ViewDebug.ExportedProperty
    public boolean getFilterTouchesWhenObscured() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean getFitsSystemWindows() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="focus", mapping={@android.view.ViewDebug.IntToString(from=0, to="NOT_FOCUSABLE"), @android.view.ViewDebug.IntToString(from=1, to="FOCUSABLE"), @android.view.ViewDebug.IntToString(from=16, to="FOCUSABLE_AUTO")})
    public int getFocusable() { return 0; }
    public java.util.ArrayList<android.view.View> getFocusables(int p0) { return null; }
    public void getFocusedRect(android.graphics.Rect p0) {}
    boolean getForcedOverrideFrameRateFlag() { return false; }
    public android.graphics.drawable.Drawable getForeground() { return null; }
    public int getForegroundGravity() { return 0; }
    public android.graphics.BlendMode getForegroundTintBlendMode() { return null; }
    public android.content.res.ColorStateList getForegroundTintList() { return null; }
    public android.graphics.PorterDuff.Mode getForegroundTintMode() { return null; }
    public float getFrameContentVelocity() { return 0.0f; }
    public final boolean getGlobalVisibleRect(android.graphics.Rect p0) { return false; }
    public boolean getGlobalVisibleRect(android.graphics.Rect p0, android.graphics.Point p1) { return false; }
    public android.os.Handler getHandler() { return null; }
    public android.graphics.Rect getHandwritingArea() { return null; }
    public float getHandwritingBoundsOffsetBottom() { return 0.0f; }
    public float getHandwritingBoundsOffsetLeft() { return 0.0f; }
    public float getHandwritingBoundsOffsetRight() { return 0.0f; }
    public float getHandwritingBoundsOffsetTop() { return 0.0f; }
    public int getHandwritingDelegateFlags() { return 0; }
    public java.lang.Runnable getHandwritingDelegatorCallback() { return null; }
    public final boolean getHasOverlappingRendering() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="layout")
    public final int getHeight() { return 0; }
    public void getHitRect(android.graphics.Rect p0) {}
    public int getHorizontalFadingEdgeLength() { return 0; }
    protected float getHorizontalScrollFactor() { return 0.0f; }
    protected int getHorizontalScrollbarHeight() { return 0; }
    public android.graphics.drawable.Drawable getHorizontalScrollbarThumbDrawable() { return null; }
    public android.graphics.drawable.Drawable getHorizontalScrollbarTrackDrawable() { return null; }
    public void getHotspotBounds(android.graphics.Rect p0) {}
    @android.view.ViewDebug.CapturedViewProperty
    public int getId() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="accessibility", mapping={@android.view.ViewDebug.IntToString(from=0, to="auto"), @android.view.ViewDebug.IntToString(from=1, to="yes"), @android.view.ViewDebug.IntToString(from=2, to="no"), @android.view.ViewDebug.IntToString(from=4, to="noHideDescendants")})
    public int getImportantForAccessibility() { return 0; }
    @android.view.ViewDebug.ExportedProperty(mapping={@android.view.ViewDebug.IntToString(from=0, to="auto"), @android.view.ViewDebug.IntToString(from=1, to="yes"), @android.view.ViewDebug.IntToString(from=2, to="no"), @android.view.ViewDebug.IntToString(from=4, to="yesExcludeDescendants"), @android.view.ViewDebug.IntToString(from=8, to="noExcludeDescendants")})
    public int getImportantForAutofill() { return 0; }
    @android.view.ViewDebug.ExportedProperty(mapping={@android.view.ViewDebug.IntToString(from=0, to="auto"), @android.view.ViewDebug.IntToString(from=1, to="yes"), @android.view.ViewDebug.IntToString(from=2, to="no"), @android.view.ViewDebug.IntToString(from=4, to="yesExcludeDescendants"), @android.view.ViewDebug.IntToString(from=8, to="noExcludeDescendants")})
    public int getImportantForContentCapture() { return 0; }
    public final android.graphics.Matrix getInverseMatrix() { return null; }
    public java.lang.CharSequence getIterableTextForAccessibility() { return null; }
    public android.view.AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(int p0) { return null; }
    public android.app.jank.JankTracker getJankTracker() { return null; }
    public boolean getKeepScreenOn() { return false; }
    public android.view.KeyEvent.DispatcherState getKeyDispatcherState() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="accessibility")
    public int getLabelFor() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="drawing", mapping={@android.view.ViewDebug.IntToString(from=0, to="NONE"), @android.view.ViewDebug.IntToString(from=1, to="SOFTWARE"), @android.view.ViewDebug.IntToString(from=2, to="HARDWARE")})
    public int getLayerType() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="layout", mapping={@android.view.ViewDebug.IntToString(from=0, to="RESOLVED_DIRECTION_LTR"), @android.view.ViewDebug.IntToString(from=1, to="RESOLVED_DIRECTION_RTL")})
    public int getLayoutDirection() { return 0; }
    @android.view.ViewDebug.ExportedProperty(deepExport=true, prefix="layout_")
    public android.view.ViewGroup.LayoutParams getLayoutParams() { return null; }
    @android.view.ViewDebug.CapturedViewProperty
    public final int getLeft() { return 0; }
    protected float getLeftFadingEdgeStrength() { return 0.0f; }
    protected int getLeftPaddingOffset() { return 0; }
    android.view.View.ListenerInfo getListenerInfo() { return null; }
    public final boolean getLocalVisibleRect(android.graphics.Rect p0) { return false; }
    public void getLocationInSurface(int[] p0) {}
    public void getLocationInWindow(int[] p0) {}
    public void getLocationOnScreen(int[] p0) {}
    @android.view.ViewDebug.ExportedProperty(category="layout", indexMapping={@android.view.ViewDebug.IntToString(from=0, to="x"), @android.view.ViewDebug.IntToString(from=1, to="y")})
    public int[] getLocationOnScreen() { return null; }
    protected int getLongPressTimeoutMillis() { return 0; }
    public android.graphics.Matrix getMatrix() { return null; }
    public final int getMeasuredHeight() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="measurement", flagMapping=@android.view.ViewDebug.FlagToString(equals=16777216, mask=-16777216, name="MEASURED_STATE_TOO_SMALL"))
    public final int getMeasuredHeightAndState() { return 0; }
    public final int getMeasuredState() { return 0; }
    public final int getMeasuredWidth() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="measurement", flagMapping=@android.view.ViewDebug.FlagToString(equals=16777216, mask=-16777216, name="MEASURED_STATE_TOO_SMALL"))
    public final int getMeasuredWidthAndState() { return 0; }
    public int getMinimumHeight() { return 0; }
    public int getMinimumWidth() { return 0; }
    public int getNextClusterForwardId() { return 0; }
    public int getNextFocusDownId() { return 0; }
    public int getNextFocusForwardId() { return 0; }
    public int getNextFocusLeftId() { return 0; }
    public int getNextFocusRightId() { return 0; }
    public int getNextFocusUpId() { return 0; }
    protected boolean getNotifiedContentCaptureAppeared() { return false; }
    public android.view.View.OnFocusChangeListener getOnFocusChangeListener() { return null; }
    public android.view.View.OnLongClickListener getOnLongClickListener() { return null; }
    public android.graphics.Insets getOpticalInsets() { return null; }
    public int getOutlineAmbientShadowColor() { return 0; }
    public android.view.ViewOutlineProvider getOutlineProvider() { return null; }
    public int getOutlineSpotShadowColor() { return 0; }
    public int getOverScrollMode() { return 0; }
    public android.view.ViewOverlay getOverlay() { return null; }
    public int getPaddingBottom() { return 0; }
    public int getPaddingEnd() { return 0; }
    public int getPaddingLeft() { return 0; }
    public int getPaddingRight() { return 0; }
    public int getPaddingStart() { return 0; }
    public int getPaddingTop() { return 0; }
    public final android.view.ViewParent getParent() { return null; }
    public android.view.ViewParent getParentForAccessibility() { return null; }
    public final android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> getPendingCredentialCallback() { return null; }
    public final android.credentials.GetCredentialRequest getPendingCredentialRequest() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getPivotX() { return 0.0f; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getPivotY() { return 0.0f; }
    public android.view.PointerIcon getPointerIcon() { return null; }
    public final java.util.List<android.graphics.Rect> getPreferKeepClearRects() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="layout", mapping={@android.view.ViewDebug.IntToString(from=0, to="LTR"), @android.view.ViewDebug.IntToString(from=1, to="RTL"), @android.view.ViewDebug.IntToString(from=2, to="INHERIT"), @android.view.ViewDebug.IntToString(from=3, to="LOCALE")})
    public int getRawLayoutDirection() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="text", mapping={@android.view.ViewDebug.IntToString(from=0, to="INHERIT"), @android.view.ViewDebug.IntToString(from=1, to="GRAVITY"), @android.view.ViewDebug.IntToString(from=2, to="TEXT_START"), @android.view.ViewDebug.IntToString(from=3, to="TEXT_END"), @android.view.ViewDebug.IntToString(from=4, to="CENTER"), @android.view.ViewDebug.IntToString(from=5, to="VIEW_START"), @android.view.ViewDebug.IntToString(from=6, to="VIEW_END")})
    public int getRawTextAlignment() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="text", mapping={@android.view.ViewDebug.IntToString(from=0, to="INHERIT"), @android.view.ViewDebug.IntToString(from=1, to="FIRST_STRONG"), @android.view.ViewDebug.IntToString(from=2, to="ANY_RTL"), @android.view.ViewDebug.IntToString(from=3, to="LTR"), @android.view.ViewDebug.IntToString(from=4, to="RTL"), @android.view.ViewDebug.IntToString(from=5, to="LOCALE"), @android.view.ViewDebug.IntToString(from=6, to="FIRST_STRONG_LTR"), @android.view.ViewDebug.IntToString(from=7, to="FIRST_STRONG_RTL")})
    public int getRawTextDirection() { return 0; }
    public java.lang.String[] getReceiveContentMimeTypes() { return null; }
    public float getRequestedFrameRate() { return 0.0f; }
    public android.content.res.Resources getResources() { return null; }
    public final boolean getRevealOnFocusHint() { return false; }
    @android.view.ViewDebug.CapturedViewProperty
    public final int getRight() { return 0; }
    protected float getRightFadingEdgeStrength() { return 0.0f; }
    protected int getRightPaddingOffset() { return 0; }
    public android.view.AttachedSurfaceControl getRootSurfaceControl() { return null; }
    public android.view.View getRootView() { return null; }
    public android.view.WindowInsets getRootWindowInsets() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getRotation() { return 0.0f; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getRotationX() { return 0.0f; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getRotationY() { return 0.0f; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getScaleX() { return 0.0f; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getScaleY() { return 0.0f; }
    public int getScrollBarDefaultDelayBeforeFade() { return 0; }
    public int getScrollBarFadeDuration() { return 0; }
    public int getScrollBarSize() { return 0; }
    @android.view.ViewDebug.ExportedProperty(mapping={@android.view.ViewDebug.IntToString(from=0, to="INSIDE_OVERLAY"), @android.view.ViewDebug.IntToString(from=16777216, to="INSIDE_INSET"), @android.view.ViewDebug.IntToString(from=33554432, to="OUTSIDE_OVERLAY"), @android.view.ViewDebug.IntToString(from=50331648, to="OUTSIDE_INSET")})
    public int getScrollBarStyle() { return 0; }
    public int getScrollCaptureHint() { return 0; }
    void getScrollIndicatorBounds(android.graphics.Rect p0) {}
    public int getScrollIndicators() { return 0; }
    public final int getScrollX() { return 0; }
    public final int getScrollY() { return 0; }
    android.view.View getSelfOrParentImportantForA11y() { return null; }
    boolean getSelfRequestedFrameRateFlag() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public int getSolidColor() { return 0; }
    public int getSourceLayoutResId() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="accessibility")
    public final java.lang.CharSequence getStateDescription() { return null; }
    public android.animation.StateListAnimator getStateListAnimator() { return null; }
    protected int getSuggestedMinimumHeight() { return 0; }
    protected int getSuggestedMinimumWidth() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="accessibility")
    public java.lang.CharSequence getSupplementalDescription() { return null; }
    public java.util.List<android.graphics.Rect> getSystemGestureExclusionRects() { return null; }
    @java.lang.Deprecated
    public int getSystemUiVisibility() { return 0; }
    @android.view.ViewDebug.ExportedProperty
    public java.lang.Object getTag() { return null; }
    public java.lang.Object getTag(int p0) { return null; }
    @android.view.ViewDebug.ExportedProperty(category="text", mapping={@android.view.ViewDebug.IntToString(from=0, to="INHERIT"), @android.view.ViewDebug.IntToString(from=1, to="GRAVITY"), @android.view.ViewDebug.IntToString(from=2, to="TEXT_START"), @android.view.ViewDebug.IntToString(from=3, to="TEXT_END"), @android.view.ViewDebug.IntToString(from=4, to="CENTER"), @android.view.ViewDebug.IntToString(from=5, to="VIEW_START"), @android.view.ViewDebug.IntToString(from=6, to="VIEW_END")})
    public int getTextAlignment() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="text", mapping={@android.view.ViewDebug.IntToString(from=0, to="INHERIT"), @android.view.ViewDebug.IntToString(from=1, to="FIRST_STRONG"), @android.view.ViewDebug.IntToString(from=2, to="ANY_RTL"), @android.view.ViewDebug.IntToString(from=3, to="LTR"), @android.view.ViewDebug.IntToString(from=4, to="RTL"), @android.view.ViewDebug.IntToString(from=5, to="LOCALE"), @android.view.ViewDebug.IntToString(from=6, to="FIRST_STRONG_LTR"), @android.view.ViewDebug.IntToString(from=7, to="FIRST_STRONG_RTL")})
    public int getTextDirection() { return 0; }
    public android.view.ThreadedRenderer getThreadedRenderer() { return null; }
    public java.lang.CharSequence getTooltip() { return null; }
    public java.lang.CharSequence getTooltipText() { return null; }
    public android.view.View getTooltipView() { return null; }
    @android.view.ViewDebug.CapturedViewProperty
    public final int getTop() { return 0; }
    protected float getTopFadingEdgeStrength() { return 0.0f; }
    protected int getTopPaddingOffset() { return 0; }
    public android.view.TouchDelegate getTouchDelegate() { return null; }
    public java.util.ArrayList<android.view.View> getTouchables() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getTransitionAlpha() { return 0.0f; }
    @android.view.ViewDebug.ExportedProperty
    public java.lang.String getTransitionName() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getTranslationX() { return 0.0f; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getTranslationY() { return 0.0f; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getTranslationZ() { return 0.0f; }
    public long getUniqueDrawingId() { return 0L; }
    @android.annotation.SystemApi
    public final java.util.List<android.graphics.Rect> getUnrestrictedPreferKeepClearRects() { return null; }
    public int getVerticalFadingEdgeLength() { return 0; }
    protected float getVerticalScrollFactor() { return 0.0f; }
    public int getVerticalScrollbarPosition() { return 0; }
    public android.graphics.drawable.Drawable getVerticalScrollbarThumbDrawable() { return null; }
    public android.graphics.drawable.Drawable getVerticalScrollbarTrackDrawable() { return null; }
    public int getVerticalScrollbarWidth() { return 0; }
    public android.view.ViewCredentialHandler getViewCredentialHandler() { return null; }
    public android.view.ViewRootImpl getViewRootImpl() { return null; }
    public android.view.translation.ViewTranslationCallback getViewTranslationCallback() { return null; }
    public android.view.translation.ViewTranslationResponse getViewTranslationResponse() { return null; }
    public android.view.ViewTreeObserver getViewTreeObserver() { return null; }
    @android.view.ViewDebug.ExportedProperty(mapping={@android.view.ViewDebug.IntToString(from=0, to="VISIBLE"), @android.view.ViewDebug.IntToString(from=4, to="INVISIBLE"), @android.view.ViewDebug.IntToString(from=8, to="GONE")})
    public int getVisibility() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="layout")
    public final int getWidth() { return 0; }
    protected android.view.IWindow getWindow() { return null; }
    protected int getWindowAttachCount() { return 0; }
    public void getWindowDisplayFrame(android.graphics.Rect p0) {}
    public android.view.WindowId getWindowId() { return null; }
    public android.view.WindowInsetsController getWindowInsetsController() { return null; }
    android.view.IWindowSession getWindowSession() { return null; }
    @java.lang.Deprecated
    public int getWindowSystemUiVisibility() { return 0; }
    public android.os.IBinder getWindowToken() { return null; }
    public int getWindowVisibility() { return 0; }
    public void getWindowVisibleDisplayFrame(android.graphics.Rect p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getX() { return 0.0f; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getY() { return 0.0f; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public float getZ() { return 0.0f; }
    void handleFocusGainInternal(int p0, android.graphics.Rect p1) {}
    protected boolean handleScrollBarDragging(android.view.MotionEvent p0) { return false; }
    void handleTooltipKey(android.view.KeyEvent p0) {}
    protected boolean hasContentOnApplyWindowInsetsListener() { return false; }
    boolean hasDefaultFocus() { return false; }
    public boolean hasExplicitFocusable() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public boolean hasFocus() { return false; }
    public boolean hasFocusable() { return false; }
    boolean hasFocusable(boolean p0, boolean p1) { return false; }
    protected boolean hasHoveredChild() { return false; }
    public final boolean hasIdentityMatrix() { return false; }
    public boolean hasImeFocus() { return false; }
    public boolean hasNestedScrollingParent() { return false; }
    public boolean hasOnClickListeners() { return false; }
    public boolean hasOnLongClickListeners() { return false; }
    protected boolean hasOpaqueScrollbars() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean hasOverlappingRendering() { return false; }
    public boolean hasPointerCapture() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean hasShadow() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="layout")
    public boolean hasTransientState() { return false; }
    public boolean hasTranslationTransientState() { return false; }
    boolean hasUnhandledKeyListener() { return false; }
    public boolean hasWindowFocus() { return false; }
    public boolean hasWindowInsetsAnimationCallback() { return false; }
    public boolean hideAutofillHighlight() { return false; }
    void hideTooltip() {}
    public boolean includeForAccessibility() { return false; }
    public boolean includeForAccessibility(boolean p0) { return false; }
    protected void initializeFadingEdge(android.content.res.TypedArray p0) {}
    protected void initializeFadingEdgeInternal(android.content.res.TypedArray p0) {}
    protected void initializeScrollbars(android.content.res.TypedArray p0) {}
    protected void initializeScrollbarsInternal(android.content.res.TypedArray p0) {}
    protected void internalSetPadding(int p0, int p1, int p2, int p3) {}
    public void invalidate() {}
    @java.lang.Deprecated
    public void invalidate(int p0, int p1, int p2, int p3) {}
    @java.lang.Deprecated
    public void invalidate(android.graphics.Rect p0) {}
    public void invalidate(boolean p0) {}
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    void invalidateInheritedLayoutMode(int p0) {}
    void invalidateInternal(int p0, int p1, int p2, int p3, boolean p4, boolean p5) {}
    public void invalidateOutline() {}
    protected void invalidateParentCaches() {}
    protected void invalidateParentIfNeeded() {}
    protected void invalidateParentIfNeededAndWasQuickRejected() {}
    void invalidateViewProperty(boolean p0, boolean p1) {}
    @android.view.ViewDebug.ExportedProperty(category="accessibility")
    public boolean isAccessibilityDataSensitive() { return false; }
    public boolean isAccessibilityFocused() { return false; }
    boolean isAccessibilityFocusedViewOrHost() { return false; }
    public boolean isAccessibilityHeading() { return false; }
    public boolean isAccessibilitySelectionExtendable() { return false; }
    public boolean isActionableForAccessibility() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isActivated() { return false; }
    final boolean isActivityDeniedForAutofillForUnimportantView() { return false; }
    public boolean isAggregatedVisible() { return false; }
    public final boolean isAssistBlocked() { return false; }
    public boolean isAttachedToWindow() { return false; }
    public boolean isAutoHandwritingEnabled() { return false; }
    public boolean isAutofilled() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isClickable() { return false; }
    public final boolean isContentSensitive() { return false; }
    public boolean isContextClickable() { return false; }
    @java.lang.Deprecated
    public boolean isCredential() { return false; }
    public boolean isDefaultFocusHighlightNeeded(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1) { return false; }
    public boolean isDirty() { return false; }
    boolean isDraggingScrollBar() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    @java.lang.Deprecated
    public boolean isDrawingCacheEnabled() { return false; }
    public boolean isDuplicateParentStateEnabled() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isEnabled() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public final boolean isFocusable() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public final boolean isFocusableInTouchMode() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public boolean isFocused() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public final boolean isFocusedByDefault() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean isForceDarkAllowed() { return false; }
    public boolean isForegroundInsidePadding() { return false; }
    public final boolean isFrameworkOptionalFitsSystemWindows() { return false; }
    public boolean isHandwritingDelegate() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isHapticFeedbackEnabled() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean isHardwareAccelerated() { return false; }
    public boolean isHorizontalFadingEdgeEnabled() { return false; }
    public boolean isHorizontalScrollBarEnabled() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isHovered() { return false; }
    public boolean isImportantForAccessibility() { return false; }
    public final boolean isImportantForAutofill() { return false; }
    public final boolean isImportantForContentCapture() { return false; }
    public boolean isInEditMode() { return false; }
    public boolean isInLayout() { return false; }
    public boolean isInScrollingContainer() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isInTouchMode() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public final boolean isKeyboardNavigationCluster() { return false; }
    public boolean isLaidOut() { return false; }
    public boolean isLayoutDirectionInherited() { return false; }
    public boolean isLayoutDirectionResolved() { return false; }
    public boolean isLayoutRequested() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="layout")
    public boolean isLayoutRtl() { return false; }
    boolean isLayoutValid() { return false; }
    public boolean isLongClickable() { return false; }
    final boolean isMatchingAutofillableHeuristics() { return false; }
    public boolean isNestedScrollingEnabled() { return false; }
    boolean isOnScrollbar(float p0, float p1) { return false; }
    boolean isOnScrollbarThumb(float p0, float p1) { return false; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean isOpaque() { return false; }
    protected boolean isPaddingOffsetRequired() { return false; }
    public boolean isPaddingRelative() { return false; }
    boolean isPaddingResolved() { return false; }
    public boolean isPivotSet() { return false; }
    public final boolean isPreferKeepClear() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isPressed() { return false; }
    public boolean isRootNamespace() { return false; }
    public boolean isSaveEnabled() { return false; }
    public boolean isSaveFromParentEnabled() { return false; }
    public boolean isScreenReaderFocusable() { return false; }
    public boolean isScrollContainer() { return false; }
    public boolean isScrollbarFadingEnabled() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isSelected() { return false; }
    public final boolean isShowingLayoutBounds() { return false; }
    public boolean isShown() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isSoundEffectsEnabled() { return false; }
    public boolean isStylusHandwritingAvailable() { return false; }
    public final boolean isTemporarilyDetached() { return false; }
    public boolean isTextAlignmentInherited() { return false; }
    public boolean isTextAlignmentResolved() { return false; }
    public boolean isTextDirectionInherited() { return false; }
    public boolean isTextDirectionResolved() { return false; }
    public boolean isVerticalFadingEdgeEnabled() { return false; }
    public boolean isVerticalScrollBarEnabled() { return false; }
    protected boolean isVerticalScrollBarHidden() { return false; }
    public boolean isVisibleToUser() { return false; }
    protected boolean isVisibleToUser(android.graphics.Rect p0) { return false; }
    public boolean isVisibleToUserForAutofill(int p0) { return false; }
    public void jumpDrawablesToCurrentState() {}
    public android.view.View keyboardNavigationClusterSearch(android.view.View p0, int p1) { return null; }
    public void layout(int p0, int p1, int p2, int p3) {}
    public void makeFrameworkOptionalFitsSystemWindows() {}
    public void makeOptionalFitsSystemWindows() {}
    public void mapRectFromViewToScreenCoords(android.graphics.RectF p0, boolean p1) {}
    public void mapRectFromViewToWindowCoords(android.graphics.RectF p0, boolean p1) {}
    public final void measure(int p0, int p1) {}
    void needGlobalAttributesUpdate(boolean p0) {}
    public void notifyEnterOrExitForAutoFillIfNeeded(boolean p0) {}
    void notifyGlobalFocusCleared(android.view.View p0) {}
    public void notifySubtreeAccessibilityStateChangedIfNeeded() {}
    public void notifyViewAccessibilityStateChangedIfNeeded(int p0) {}
    public void offsetLeftAndRight(int p0) {}
    public void offsetTopAndBottom(int p0) {}
    public void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    protected void onAnimationEnd() {}
    protected void onAnimationStart() {}
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    protected void onAttachedToWindow() {}
    public void onCancelPendingInputEvents() {}
    public boolean onCapturedPointerEvent(android.view.MotionEvent p0) { return false; }
    public boolean onCheckIsTextEditor() { return false; }
    public void onCloseSystemDialogs(java.lang.String p0) {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    protected void onCreateContextMenu(android.view.ContextMenu p0) {}
    protected int[] onCreateDrawableState(int p0) { return null; }
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p0) { return null; }
    public void onCreateViewTranslationRequest(int[] p0, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> p1) {}
    public void onCreateVirtualViewTranslationRequests(long[] p0, int[] p1, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> p2) {}
    protected void onDetachedFromWindow() {}
    protected void onDetachedFromWindowInternal() {}
    protected void onDisplayHint(int p0) {}
    public boolean onDragEvent(android.view.DragEvent p0) { return false; }
    protected void onDraw(android.graphics.Canvas p0) {}
    public void onDrawForeground(android.graphics.Canvas p0) {}
    protected void onDrawHorizontalScrollBar(android.graphics.Canvas p0, android.graphics.drawable.Drawable p1, int p2, int p3, int p4, int p5) {}
    protected final void onDrawScrollBars(android.graphics.Canvas p0) {}
    protected void onDrawVerticalScrollBar(android.graphics.Canvas p0, android.graphics.drawable.Drawable p1, int p2, int p3, int p4, int p5) {}
    public boolean onFilterTouchEventForSecurity(android.view.MotionEvent p0) { return false; }
    protected void onFinishInflate() {}
    public void onFinishTemporaryDetach() {}
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    protected void onFocusLost() {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public void onGetCredentialException(java.lang.String p0, java.lang.String p1) {}
    public void onGetCredentialResponse(android.credentials.GetCredentialResponse p0) {}
    public void onHoverChanged(boolean p0) {}
    public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void onInputConnectionClosedInternal() {}
    public void onInputConnectionOpenedInternal(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1, android.os.Handler p2) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyPreIme(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyShortcut(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public void onMovedToDisplay(int p0, android.content.res.Configuration p1) {}
    protected void onOverScrolled(int p0, int p1, boolean p2, boolean p3) {}
    public void onPointerCaptureChange(boolean p0) {}
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public void onPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void onProvideAutofillStructure(android.view.ViewStructure p0, int p1) {}
    public void onProvideAutofillVirtualStructure(android.view.ViewStructure p0, int p1) {}
    public void onProvideContentCaptureStructure(android.view.ViewStructure p0, int p1) {}
    public void onProvideStructure(android.view.ViewStructure p0) {}
    protected void onProvideStructure(android.view.ViewStructure p0, int p1, int p2) {}
    public void onProvideVirtualStructure(android.view.ViewStructure p0) {}
    public android.view.ContentInfo onReceiveContent(android.view.ContentInfo p0) { return null; }
    public void onResolveDrawables(int p0) {}
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    public void onRtlPropertiesChanged(int p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    public void onScreenStateChanged(int p0) {}
    public void onScrollCaptureSearch(android.graphics.Rect p0, android.graphics.Point p1, java.util.function.Consumer<android.view.ScrollCaptureTarget> p2) {}
    protected void onScrollChanged(int p0, int p1, int p2, int p3) {}
    public boolean onScrollToTop(int p0) { return false; }
    protected boolean onSetAlpha(int p0) { return false; }
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public void onStartTemporaryDetach() {}
    public void onSystemBarAppearanceChanged(int p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    boolean onUnhandledKeyEvent(android.view.KeyEvent p0) { return false; }
    public void onViewTranslationResponse(android.view.translation.ViewTranslationResponse p0) {}
    public void onVirtualViewTranslationResponses(android.util.LongSparseArray<android.view.translation.ViewTranslationResponse> p0) {}
    public void onVisibilityAggregated(boolean p0) {}
    protected void onVisibilityChanged(android.view.View p0, int p1) {}
    public void onWindowFocusChanged(boolean p0) {}
    @java.lang.Deprecated
    public void onWindowSystemUiVisibilityChanged(int p0) {}
    protected void onWindowVisibilityChanged(int p0) {}
    public void outputDirtyFlags(java.lang.String p0, boolean p1, int p2) {}
    protected boolean overScrollBy(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, boolean p8) { return false; }
    void overrideFrameRate(float p0, boolean p1) {}
    public boolean performAccessibilityAction(int p0, android.os.Bundle p1) { return false; }
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    protected boolean performButtonActionOnTouchDown(android.view.MotionEvent p0) { return false; }
    public boolean performClick() { return false; }
    void performCollectViewAttributes(android.view.View.AttachInfo p0, int p1) {}
    public boolean performContextClick() { return false; }
    public boolean performContextClick(float p0, float p1) { return false; }
    public boolean performHapticFeedback(int p0) { return false; }
    public boolean performHapticFeedback(int p0, int p1) { return false; }
    public boolean performHapticFeedback(android.os.vibrator.HapticFeedbackRequest p0) { return false; }
    public void performHapticFeedbackForInputDevice(int p0, int p1, int p2, int p3) {}
    public boolean performLongClick() { return false; }
    public boolean performLongClick(float p0, float p1) { return false; }
    public android.view.ContentInfo performReceiveContent(android.view.ContentInfo p0) { return null; }
    public void playSoundEffect(int p0) {}
    protected boolean pointInHoveredChild(android.view.MotionEvent p0) { return false; }
    final boolean pointInView(float p0, float p1) { return false; }
    public boolean pointInView(float p0, float p1, float p2) { return false; }
    public boolean post(java.lang.Runnable p0) { return false; }
    public boolean postDelayed(java.lang.Runnable p0, long p1) { return false; }
    public void postInvalidate() {}
    public void postInvalidate(int p0, int p1, int p2, int p3) {}
    public void postInvalidateDelayed(long p0) {}
    public void postInvalidateDelayed(long p0, int p1, int p2, int p3, int p4) {}
    public void postInvalidateOnAnimation() {}
    public void postInvalidateOnAnimation(int p0, int p1, int p2, int p3) {}
    public void postOnAnimation(java.lang.Runnable p0) {}
    public void postOnAnimationDelayed(java.lang.Runnable p0, long p1) {}
    public void prepareForExtendedAccessibilitySelection() {}
    public boolean probablyHasInput() { return false; }
    protected void recomputePadding() {}
    public void refreshDrawableState() {}
    public void releasePointerCapture() {}
    public boolean removeCallbacks(java.lang.Runnable p0) { return false; }
    public void removeFrameMetricsListener(android.view.Window.OnFrameMetricsAvailableListener p0) {}
    public void removeOnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener p0) {}
    public void removeOnLayoutChangeListener(android.view.View.OnLayoutChangeListener p0) {}
    public void removeOnUnhandledKeyEventListener(android.view.View.OnUnhandledKeyEventListener p0) {}
    public void reportAppJankStats(android.app.jank.AppJankStats p0) {}
    public boolean requestAccessibilityFocus() { return false; }
    public void requestApplyInsets() {}
    @java.lang.Deprecated
    public void requestFitSystemWindows() {}
    public final boolean requestFocus() { return false; }
    public final boolean requestFocus(int p0) { return false; }
    public boolean requestFocus(int p0, android.graphics.Rect p1) { return false; }
    public final boolean requestFocusFromTouch() { return false; }
    public void requestKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> p0, int p1) {}
    public void requestLayout() {}
    public void requestPointerCapture() {}
    public void requestPointerCapture(int p0) {}
    public boolean requestRectangleOnScreen(android.graphics.Rect p0) { return false; }
    public boolean requestRectangleOnScreen(android.graphics.Rect p0, boolean p1) { return false; }
    public boolean requestRectangleOnScreen(android.graphics.Rect p0, boolean p1, int p2) { return false; }
    public final void requestUnbufferedDispatch(int p0) {}
    public final void requestUnbufferedDispatch(android.view.MotionEvent p0) {}
    public final <T extends android.view.View> T requireViewById(int p0) { return null; }
    public void resetPaddingToInitialValues() {}
    public void resetPivot() {}
    protected void resetResolvedDrawables() {}
    void resetResolvedDrawablesInternal() {}
    public void resetResolvedLayoutDirection() {}
    public void resetResolvedPadding() {}
    void resetResolvedPaddingInternal() {}
    public void resetResolvedTextAlignment() {}
    public void resetResolvedTextDirection() {}
    public void resetRtlProperties() {}
    void resetSubtreeAccessibilityStateChanged() {}
    public void resetSubtreeAutofillIds() {}
    protected void resolveDrawables() {}
    public boolean resolveLayoutDirection() { return false; }
    public void resolveLayoutParams() {}
    public void resolvePadding() {}
    public boolean resolveRtlPropertiesIfNeeded() { return false; }
    public boolean resolveTextAlignment() { return false; }
    public boolean resolveTextDirection() { return false; }
    public boolean restoreDefaultFocus() { return false; }
    public boolean restoreFocusInCluster(int p0) { return false; }
    public boolean restoreFocusNotInCluster() { return false; }
    public void restoreHierarchyState(android.util.SparseArray<android.os.Parcelable> p0) {}
    boolean rootViewRequestFocus() { return false; }
    public final void saveAttributeDataForStyleable(android.content.Context p0, int[] p1, android.util.AttributeSet p2, android.content.res.TypedArray p3, int p4, int p5) {}
    public void saveHierarchyState(android.util.SparseArray<android.os.Parcelable> p0) {}
    public void scheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2) {}
    public void scrollBy(int p0, int p1) {}
    public void scrollTo(int p0, int p1) {}
    public void sendAccessibilityEvent(int p0) {}
    public void sendAccessibilityEventInternal(int p0) {}
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent p0) {}
    public void sendAccessibilityEventUncheckedInternal(android.view.accessibility.AccessibilityEvent p0) {}
    void sendWindowContentChangedAccessibilityEvent(int p0) {}
    public void setAccessibilityDataSensitive(int p0) {}
    public void setAccessibilityDelegate(android.view.View.AccessibilityDelegate p0) {}
    void setAccessibilityDragStarted(boolean p0) {}
    public void setAccessibilityHeading(boolean p0) {}
    public void setAccessibilityLiveRegion(int p0) {}
    public void setAccessibilityPaneTitle(java.lang.CharSequence p0) {}
    public void setAccessibilitySelection(int p0, int p1) {}
    @android.view.RemotableViewMethod
    public void setAccessibilityTraversalAfter(int p0) {}
    @android.view.RemotableViewMethod
    public void setAccessibilityTraversalBefore(int p0) {}
    public void setActivated(boolean p0) {}
    public void setAllowClickWhenDisabled(boolean p0) {}
    public void setAllowedHandwritingDelegatePackage(java.lang.String p0) {}
    public void setAllowedHandwritingDelegatorPackage(java.lang.String p0) {}
    @android.view.RemotableViewMethod
    public void setAlpha(float p0) {}
    void setAlphaInternal(float p0) {}
    boolean setAlphaNoInvalidation(float p0) { return false; }
    public void setAnimation(android.view.animation.Animation p0) {}
    public void setAnimationMatrix(android.graphics.Matrix p0) {}
    public final void setAssistBlocked(boolean p0) {}
    public void setAutoHandwritingEnabled(boolean p0) {}
    public void setAutofillHints(java.lang.String... p0) {}
    public void setAutofillId(android.view.autofill.AutofillId p0) {}
    public void setAutofilled(boolean p0, boolean p1) {}
    public void setBackdropRenderEffect(android.graphics.RenderEffect p0) {}
    public void setBackground(android.graphics.drawable.Drawable p0) {}
    void setBackgroundBounds() {}
    @android.view.RemotableViewMethod
    public void setBackgroundColor(int p0) {}
    @java.lang.Deprecated
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod
    public void setBackgroundResource(int p0) {}
    @android.view.RemotableViewMethod
    public void setBackgroundTintBlendMode(android.graphics.BlendMode p0) {}
    @android.view.RemotableViewMethod
    public void setBackgroundTintList(android.content.res.ColorStateList p0) {}
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode p0) {}
    public final void setBottom(int p0) {}
    public void setCameraDistance(float p0) {}
    public void setClickable(boolean p0) {}
    public void setClipBounds(android.graphics.Rect p0) {}
    @android.view.RemotableViewMethod
    public void setClipToOutline(boolean p0) {}
    public void setContentCaptureSession(android.view.contentcapture.ContentCaptureSession p0) {}
    @android.view.RemotableViewMethod
    public void setContentDescription(java.lang.CharSequence p0) {}
    public final void setContentSensitivity(int p0) {}
    public void setContextClickable(boolean p0) {}
    public void setDefaultFocusHighlightEnabled(boolean p0) {}
    protected void setDetached(boolean p0) {}
    public void setDisabledSystemUiVisibility(int p0) {}
    void setDisplayListProperties(android.graphics.RenderNode p0) {}
    @java.lang.Deprecated
    public void setDrawingCacheBackgroundColor(int p0) {}
    @java.lang.Deprecated
    public void setDrawingCacheEnabled(boolean p0) {}
    @java.lang.Deprecated
    public void setDrawingCacheQuality(int p0) {}
    public void setDuplicateParentStateEnabled(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setElevation(float p0) {}
    @android.view.RemotableViewMethod
    public void setEnabled(boolean p0) {}
    public void setFadingEdgeLength(int p0) {}
    public void setFilterTouchesWhenObscured(boolean p0) {}
    public void setFitsSystemWindows(boolean p0) {}
    void setFlags(int p0, int p1) {}
    @android.view.RemotableViewMethod
    public void setFocusable(int p0) {}
    @android.view.RemotableViewMethod
    public void setFocusable(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setFocusableInTouchMode(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setFocusedByDefault(boolean p0) {}
    public final void setFocusedInCluster() {}
    public void setForceDarkAllowed(boolean p0) {}
    void setForcedOverrideFrameRateFlag(boolean p0) {}
    public void setForeground(android.graphics.drawable.Drawable p0) {}
    public void setForegroundGravity(int p0) {}
    @android.view.RemotableViewMethod
    public void setForegroundTintBlendMode(android.graphics.BlendMode p0) {}
    @android.view.RemotableViewMethod
    public void setForegroundTintList(android.content.res.ColorStateList p0) {}
    public void setForegroundTintMode(android.graphics.PorterDuff.Mode p0) {}
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    public void setFrameContentVelocity(float p0) {}
    public void setHandwritingArea(android.graphics.Rect p0) {}
    public void setHandwritingBoundsOffsets(float p0, float p1, float p2, float p3) {}
    public void setHandwritingDelegateFlags(int p0) {}
    public void setHandwritingDelegatorCallback(java.lang.Runnable p0) {}
    public void setHapticFeedbackEnabled(boolean p0) {}
    public void setHasTransientState(boolean p0) {}
    public void setHasTranslationTransientState(boolean p0) {}
    public void setHorizontalFadingEdgeEnabled(boolean p0) {}
    public void setHorizontalScrollBarEnabled(boolean p0) {}
    public void setHorizontalScrollbarThumbDrawable(android.graphics.drawable.Drawable p0) {}
    public void setHorizontalScrollbarTrackDrawable(android.graphics.drawable.Drawable p0) {}
    public void setHovered(boolean p0) {}
    public void setId(int p0) {}
    public void setImportantForAccessibility(int p0) {}
    public void setImportantForAutofill(int p0) {}
    public void setImportantForContentCapture(int p0) {}
    @java.lang.Deprecated
    public void setIsCredential(boolean p0) {}
    public void setIsHandwritingDelegate(boolean p0) {}
    public void setIsRootNamespace(boolean p0) {}
    public void setKeepScreenOn(boolean p0) {}
    public void setKeyboardNavigationCluster(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setLabelFor(int p0) {}
    public void setLayerPaint(android.graphics.Paint p0) {}
    public void setLayerType(int p0, android.graphics.Paint p1) {}
    @android.view.RemotableViewMethod
    public void setLayoutDirection(int p0) {}
    public void setLayoutParams(android.view.ViewGroup.LayoutParams p0) {}
    public final void setLeft(int p0) {}
    public final void setLeftTopRightBottom(int p0, int p1, int p2, int p3) {}
    public void setLongClickable(boolean p0) {}
    protected final void setMeasuredDimension(int p0, int p1) {}
    @android.view.RemotableViewMethod
    public void setMinimumHeight(int p0) {}
    @android.view.RemotableViewMethod
    public void setMinimumWidth(int p0) {}
    public void setNestedScrollingEnabled(boolean p0) {}
    public void setNextClusterForwardId(int p0) {}
    public void setNextFocusDownId(int p0) {}
    public void setNextFocusForwardId(int p0) {}
    public void setNextFocusLeftId(int p0) {}
    public void setNextFocusRightId(int p0) {}
    public void setNextFocusUpId(int p0) {}
    public void setNotifyAutofillManagerOnClick(boolean p0) {}
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener p0) {}
    public void setOnCapturedPointerListener(android.view.View.OnCapturedPointerListener p0) {}
    public void setOnClickListener(android.view.View.OnClickListener p0) {}
    public void setOnContextClickListener(android.view.View.OnContextClickListener p0) {}
    public void setOnCreateContextMenuListener(android.view.View.OnCreateContextMenuListener p0) {}
    public void setOnDragListener(android.view.View.OnDragListener p0) {}
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener p0) {}
    public void setOnGenericMotionListener(android.view.View.OnGenericMotionListener p0) {}
    public void setOnHoverListener(android.view.View.OnHoverListener p0) {}
    public void setOnKeyListener(android.view.View.OnKeyListener p0) {}
    public void setOnLongClickListener(android.view.View.OnLongClickListener p0) {}
    public void setOnReceiveContentListener(java.lang.String[] p0, android.view.OnReceiveContentListener p1) {}
    public void setOnScrollChangeListener(android.view.View.OnScrollChangeListener p0) {}
    @java.lang.Deprecated
    public void setOnSystemUiVisibilityChangeListener(android.view.View.OnSystemUiVisibilityChangeListener p0) {}
    public void setOnTouchListener(android.view.View.OnTouchListener p0) {}
    public void setOpticalInsets(android.graphics.Insets p0) {}
    public void setOutlineAmbientShadowColor(int p0) {}
    public void setOutlineProvider(android.view.ViewOutlineProvider p0) {}
    public void setOutlineSpotShadowColor(int p0) {}
    public void setOverScrollMode(int p0) {}
    public void setPadding(int p0, int p1, int p2, int p3) {}
    public void setPaddingRelative(int p0, int p1, int p2, int p3) {}
    public void setPendingCredentialRequest(android.credentials.GetCredentialRequest p0, android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> p1) {}
    @android.view.RemotableViewMethod
    public void setPivotX(float p0) {}
    @android.view.RemotableViewMethod
    public void setPivotY(float p0) {}
    public void setPointerIcon(android.view.PointerIcon p0) {}
    public final void setPreferKeepClear(boolean p0) {}
    public final void setPreferKeepClearRects(java.util.List<android.graphics.Rect> p0) {}
    public void setPressed(boolean p0) {}
    public void setRenderEffect(android.graphics.RenderEffect p0) {}
    public void setRequestedFrameRate(float p0) {}
    public void setRevealClip(boolean p0, float p1, float p2, float p3) {}
    public final void setRevealOnFocusHint(boolean p0) {}
    public final void setRight(int p0) {}
    @android.view.RemotableViewMethod
    public void setRotation(float p0) {}
    @android.view.RemotableViewMethod
    public void setRotationX(float p0) {}
    @android.view.RemotableViewMethod
    public void setRotationY(float p0) {}
    public void setSaveEnabled(boolean p0) {}
    public void setSaveFromParentEnabled(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setScaleX(float p0) {}
    @android.view.RemotableViewMethod
    public void setScaleY(float p0) {}
    public void setScreenReaderFocusable(boolean p0) {}
    public void setScrollBarDefaultDelayBeforeFade(int p0) {}
    public void setScrollBarFadeDuration(int p0) {}
    public void setScrollBarSize(int p0) {}
    public void setScrollBarStyle(int p0) {}
    public final void setScrollCaptureCallback(android.view.ScrollCaptureCallback p0) {}
    public void setScrollCaptureHint(int p0) {}
    public void setScrollContainer(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setScrollIndicators(int p0) {}
    public void setScrollIndicators(int p0, int p1) {}
    public void setScrollX(int p0) {}
    public void setScrollY(int p0) {}
    public void setScrollbarFadingEnabled(boolean p0) {}
    public void setSelected(boolean p0) {}
    void setSelfRequestedFrameRateFlag(boolean p0) {}
    public final void setShowingLayoutBounds(boolean p0) {}
    public void setSoundEffectsEnabled(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setStateDescription(java.lang.CharSequence p0) {}
    public void setStateListAnimator(android.animation.StateListAnimator p0) {}
    @android.view.RemotableViewMethod
    public void setSupplementalDescription(java.lang.CharSequence p0) {}
    public void setSystemGestureExclusionRects(java.util.List<android.graphics.Rect> p0) {}
    @java.lang.Deprecated
    public void setSystemUiVisibility(int p0) {}
    public void setTag(int p0, java.lang.Object p1) {}
    public void setTag(java.lang.Object p0) {}
    public void setTagInternal(int p0, java.lang.Object p1) {}
    public void setTextAlignment(int p0) {}
    public void setTextDirection(int p0) {}
    public void setTooltip(java.lang.CharSequence p0) {}
    public void setTooltipText(java.lang.CharSequence p0) {}
    public final void setTop(int p0) {}
    public void setTouchDelegate(android.view.TouchDelegate p0) {}
    public void setTransitionAlpha(float p0) {}
    public final void setTransitionName(java.lang.String p0) {}
    public void setTransitionVisibility(int p0) {}
    @android.view.RemotableViewMethod
    public void setTranslationX(float p0) {}
    @android.view.RemotableViewMethod
    public void setTranslationY(float p0) {}
    @android.view.RemotableViewMethod
    public void setTranslationZ(float p0) {}
    @android.annotation.SystemApi
    public final void setUnrestrictedPreferKeepClearRects(java.util.List<android.graphics.Rect> p0) {}
    public void setUsageHint(int p0) {}
    public void setVerticalFadingEdgeEnabled(boolean p0) {}
    public void setVerticalScrollBarEnabled(boolean p0) {}
    public void setVerticalScrollbarPosition(int p0) {}
    public void setVerticalScrollbarThumbDrawable(android.graphics.drawable.Drawable p0) {}
    public void setVerticalScrollbarTrackDrawable(android.graphics.drawable.Drawable p0) {}
    public void setViewTranslationCallback(android.view.translation.ViewTranslationCallback p0) {}
    @android.view.RemotableViewMethod
    public void setVisibility(int p0) {}
    @java.lang.Deprecated
    public void setWillNotCacheDrawing(boolean p0) {}
    public void setWillNotDraw(boolean p0) {}
    public void setWindowInsetsAnimationCallback(android.view.WindowInsetsAnimation.Callback p0) {}
    public void setX(float p0) {}
    public void setY(float p0) {}
    public void setZ(float p0) {}
    boolean shouldDrawRoundScrollbar() { return false; }
    boolean shouldInitiateHandwriting() { return false; }
    public boolean shouldTrackHandwritingArea() { return false; }
    public boolean showContextMenu() { return false; }
    public boolean showContextMenu(float p0, float p1) { return false; }
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0) { return null; }
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0, int p1) { return null; }
    public void startActivityForResult(android.content.Intent p0, int p1) {}
    public void startAnimation(android.view.animation.Animation p0) {}
    @java.lang.Deprecated
    public final boolean startDrag(android.content.ClipData p0, android.view.View.DragShadowBuilder p1, java.lang.Object p2, int p3) { return false; }
    public final boolean startDragAndDrop(android.content.ClipData p0, android.view.View.DragShadowBuilder p1, java.lang.Object p2, int p3) { return false; }
    public final boolean startMovingTask(float p0, float p1) { return false; }
    public boolean startNestedScroll(int p0) { return false; }
    public void stopNestedScroll() {}
    public boolean toGlobalMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean toLocalMotionEvent(android.view.MotionEvent p0) { return false; }
    public java.lang.String toString() { return null; }
    public void transformFromViewToWindowSpace(int[] p0) {}
    public void transformMatrixRootToLocal(android.graphics.Matrix p0) {}
    public void transformMatrixToGlobal(android.graphics.Matrix p0) {}
    public void transformMatrixToLocal(android.graphics.Matrix p0) {}
    void unFocus(android.view.View p0) {}
    public void unscheduleDrawable(android.graphics.drawable.Drawable p0) {}
    public void unscheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1) {}
    public android.graphics.RenderNode updateDisplayListIfDirty() { return null; }
    public final void updateDragShadow(android.view.View.DragShadowBuilder p0) {}
    void updateHandwritingArea() {}
    void updateKeepClearRects() {}
    boolean updateLocalSystemUiVisibility(int p0, int p1) { return false; }
    void updateSystemGestureExclusionRects() {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    protected void votePreferredFrameRate() {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    @java.lang.Deprecated
    public boolean willNotCacheDrawing() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean willNotDraw() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AccessibilityDataSensitive {
    }

    public static class AccessibilityDelegate {
        public AccessibilityDelegate() {}
        public void addExtraDataToAccessibilityNodeInfo(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1, java.lang.String p2, android.os.Bundle p3) {}
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(android.view.View p0) { return null; }
        public boolean dispatchPopulateAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) { return false; }
        public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View p0) { return null; }
        public void onInitializeAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) {}
        public void onInitializeAccessibilityNodeInfo(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        public void onPopulateAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) {}
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup p0, android.view.View p1, android.view.accessibility.AccessibilityEvent p2) { return false; }
        public boolean performAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
        public void sendAccessibilityEvent(android.view.View p0, int p1) {}
        public void sendAccessibilityEventUnchecked(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) {}
    }

    static final class AttachInfo {
        int mAccessibilityFetchFlags;
        android.graphics.drawable.Drawable mAccessibilityFocusDrawable;
        int mAccessibilityWindowId;
        float mApplicationScale;
        android.graphics.drawable.Drawable mAutofilledDrawable;
        android.graphics.Canvas mCanvas;
        final android.graphics.Rect mCaptionInsets = null;
        android.util.SparseArray<java.util.ArrayList<java.lang.Object>> mContentCaptureEvents;
        android.util.SparseArray<java.util.ArrayList<java.lang.Object>> mContentCaptureInteractionEvents;
        android.view.contentcapture.ContentCaptureManager mContentCaptureManager;
        final android.graphics.Rect mContentInsets = null;
        android.view.Window.OnContentApplyWindowInsetsListener mContentOnApplyWindowInsetsListener;
        boolean mDebugLayout;
        final float mDensity = 0.0f;
        int mDisabledSystemUiVisibility;
        android.view.Display mDisplay;
        final float mDisplayPixelCount = 0.0f;
        int mDisplayState;
        android.content.ClipData mDragData;
        public android.view.Surface mDragSurface;
        android.os.IBinder mDragToken;
        long mDrawingTime;
        int mEmbeddingHostWindowId;
        boolean mForceReportNewAttributes;
        final android.view.ViewTreeObserver.InternalInsetsInfo mGivenInternalInsets = null;
        final android.os.Handler mHandler = null;
        boolean mHandlingPointerEvent;
        boolean mHardwareAccelerated;
        boolean mHardwareAccelerationRequested;
        boolean mHasNonEmptyGivenInternalInsets;
        boolean mHasSystemUiListeners;
        boolean mHasWindowFocus;
        android.view.IWindowId mIWindowId;
        boolean mInTouchMode;
        final int[] mInvalidateChildLocation = null;
        boolean mKeepScreenOn;
        final android.view.KeyEvent.DispatcherState mKeyDispatchState = null;
        int mLeashedParentAccessibilityViewId;
        android.os.IBinder mLeashedParentToken;
        boolean mNeedsUpdateLightCenter;
        boolean mNextFocusLooped;
        android.os.IBinder mPanelParentWindowToken;
        java.util.List<android.graphics.RenderNode> mPendingAnimatingRenderNodes;
        final android.graphics.Point mPoint = null;
        boolean mReadyForContentCaptureUpdates;
        boolean mRecomputeGlobalAttributes;
        final android.view.View.AttachInfo.Callbacks mRootCallbacks = null;
        android.view.View mRootView;
        boolean mScalingRequired;
        com.android.internal.view.ScrollCaptureInternal mScrollCaptureInternal;
        final java.util.ArrayList<android.view.View> mScrollContainers = null;
        int mSensitiveViewsCount;
        final android.view.IWindowSession mSession = null;
        final android.graphics.Rect mStableInsets = null;
        int mSystemUiVisibility;
        final java.util.ArrayList<android.view.View> mTempArrayList = null;
        android.view.ThreadedRenderer mThreadedRenderer;
        final android.graphics.Rect mTmpInvalRect = null;
        final int[] mTmpLocation = null;
        final android.graphics.Matrix mTmpMatrix = null;
        final android.graphics.Outline mTmpOutline = null;
        final java.util.List<android.graphics.RectF> mTmpRectList = null;
        final float[] mTmpTransformLocation = null;
        final android.graphics.RectF mTmpTransformRect = null;
        final android.graphics.RectF mTmpTransformRect1 = null;
        final android.view.animation.Transformation mTmpTransformation = null;
        android.view.View mTooltipHost;
        final int[] mTransparentLocation = null;
        final android.view.ViewTreeObserver mTreeObserver = null;
        boolean mUnbufferedDispatchRequested;
        boolean mUse32BitDrawingCache;
        android.view.View mViewRequestingLayout;
        final android.view.ViewRootImpl mViewRootImpl = null;
        boolean mViewScrollChanged;
        final boolean mViewVelocityApi = false;
        boolean mViewVisibilityChanged;
        final android.graphics.Rect mVisibleInsets = null;
        final android.view.IWindow mWindow = null;
        android.view.WindowId mWindowId;
        int mWindowLeft;
        android.graphics.Matrix mWindowMatrixInEmbeddedHierarchy;
        final android.os.IBinder mWindowToken = null;
        int mWindowTop;
        int mWindowVisibility;
        AttachInfo(android.view.IWindowSession p0, android.view.IWindow p1, android.view.Display p2, android.view.ViewRootImpl p3, android.os.Handler p4, android.view.View.AttachInfo.Callbacks p5, android.content.Context p6) {}
        private void delayNotifyContentCaptureEvent(android.view.contentcapture.ContentCaptureSession p0, android.view.View p1, boolean p2) {}
        private void delayNotifyContentInteractionEvent(android.view.contentcapture.ContentCaptureSession p0, android.view.View p1) {}
        private java.util.ArrayList<java.lang.Object> ensureEvents(android.view.contentcapture.ContentCaptureSession p0) { return null; }
        private java.util.ArrayList<java.lang.Object> ensureInteractionEvents(android.view.contentcapture.ContentCaptureSession p0) { return null; }
        private android.util.SparseArray<java.util.ArrayList<java.lang.Object>> getOrCreateSessionEvents(android.util.SparseArray<java.util.ArrayList<java.lang.Object>> p0, int p1) { return null; }
        void decreaseSensitiveViewsCount() {}
        void delayNotifyContentCaptureInsetsEvent(android.graphics.Insets p0) {}
        public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
        android.view.contentcapture.ContentCaptureManager getContentCaptureManager(android.content.Context p0) { return null; }
        android.view.AttachedSurfaceControl getRootSurfaceControl() { return null; }
        com.android.internal.view.ScrollCaptureInternal getScrollCaptureInternal() { return null; }
        void increaseSensitiveViewsCount() {}

        static interface Callbacks {
            public boolean performHapticFeedback(int p0, int p1, int p2, int p3);
            public void performHapticFeedbackForInputDevice(int p0, int p1, int p2, int p3, int p4);
            public void playSoundEffect(int p0);
        }

        static class InvalidateInfo {
            private static final int POOL_LIMIT = 10;
            private static final android.util.Pools.SynchronizedPool<android.view.View.AttachInfo.InvalidateInfo> sPool = null;
            int bottom;
            int left;
            int right;
            android.view.View target;
            int top;
            InvalidateInfo() {}
            public static android.view.View.AttachInfo.InvalidateInfo obtain() { return null; }
            public void recycle() {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutofillFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutofillImportance {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutofillType {
    }

    public static class BaseSavedState extends android.view.AbsSavedState {
        static final int AUTOFILL_ID = 4;
        public static final android.os.Parcelable.Creator<android.view.View.BaseSavedState> CREATOR = null;
        static final int IS_AUTOFILLED = 2;
        static final int START_ACTIVITY_REQUESTED_WHO_SAVED = 1;
        int mAutofillViewId;
        boolean mHideHighlight;
        boolean mIsAutofilled;
        int mSavedData;
        java.lang.String mStartActivityRequestWhoSaved;
        public BaseSavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public BaseSavedState(android.os.Parcel p0, java.lang.ClassLoader p1) { super((android.os.Parcel)null); }
        public BaseSavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static interface CalledFromWrongThreadListener {
        public void onCalledFromWrongThread();
    }

    private final class CheckForLongPress implements java.lang.Runnable {
        private int mClassification;
        private boolean mOriginalPressedState;
        private int mOriginalWindowAttachCount;
        private float mX;
        private float mY;
        private CheckForLongPress(android.view.View p0) {}
        public void rememberPressedState() {}
        public void rememberWindowAttachCount() {}
        public void run() {}
        public void setAnchor(float p0, float p1) {}
        public void setClassification(int p0) {}
    }

    private final class CheckForTap implements java.lang.Runnable {
        public float x;
        public float y;
        private CheckForTap(android.view.View p0) {}
        public void run() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentCaptureImportance {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentSensitivity {
    }

    private static class DeclaredOnClickListener implements android.view.View.OnClickListener {
        private final android.view.View mHostView = null;
        private final java.lang.String mMethodName = null;
        private android.content.Context mResolvedContext;
        private java.lang.reflect.Method mResolvedMethod;
        public DeclaredOnClickListener(android.view.View p0, java.lang.String p1) {}
        private void resolveMethod(android.content.Context p0, java.lang.String p1) {}
        public void onClick(android.view.View p0) {}
    }

    public static class DragShadowBuilder {
        private final java.lang.ref.WeakReference<android.view.View> mView = null;
        public DragShadowBuilder() {}
        public DragShadowBuilder(android.view.View p0) {}
        public final android.view.View getView() { return null; }
        public void onDrawShadow(android.graphics.Canvas p0) {}
        public void onProvideShadowMetrics(android.graphics.Point p0, android.graphics.Point p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DrawingCacheQuality {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FindViewFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Focusable {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FocusableMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FocusDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FocusRealDirection {
    }

    private static class ForegroundInfo {
        private boolean mBoundsChanged;
        private android.graphics.drawable.Drawable mDrawable;
        private int mGravity;
        private boolean mInsidePadding;
        private final android.graphics.Rect mOverlayBounds = null;
        private final android.graphics.Rect mSelfBounds = null;
        private android.view.View.TintInfo mTintInfo;
        private ForegroundInfo() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LayerType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LayoutDir {
    }

    static class ListenerInfo {
        private android.graphics.Rect mHandwritingArea;
        private java.util.ArrayList<android.graphics.Rect> mKeepClearRects;
        android.view.View.OnApplyWindowInsetsListener mOnApplyWindowInsetsListener;
        private java.util.concurrent.CopyOnWriteArrayList<android.view.View.OnAttachStateChangeListener> mOnAttachStateChangeListeners;
        android.view.View.OnCapturedPointerListener mOnCapturedPointerListener;
        public android.view.View.OnClickListener mOnClickListener;
        protected android.view.View.OnContextClickListener mOnContextClickListener;
        protected android.view.View.OnCreateContextMenuListener mOnCreateContextMenuListener;
        private android.view.View.OnDragListener mOnDragListener;
        protected android.view.View.OnFocusChangeListener mOnFocusChangeListener;
        private android.view.View.OnGenericMotionListener mOnGenericMotionListener;
        private android.view.View.OnHoverListener mOnHoverListener;
        private android.view.View.OnKeyListener mOnKeyListener;
        private java.util.ArrayList<android.view.View.OnLayoutChangeListener> mOnLayoutChangeListeners;
        protected android.view.View.OnLongClickListener mOnLongClickListener;
        private android.view.OnReceiveContentListener mOnReceiveContentListener;
        protected android.view.View.OnScrollChangeListener mOnScrollChangeListener;
        private android.view.View.OnSystemUiVisibilityChangeListener mOnSystemUiVisibilityChangeListener;
        private android.view.View.OnTouchListener mOnTouchListener;
        private java.lang.Runnable mPositionChangedUpdate;
        public android.graphics.RenderNode.PositionUpdateListener mPositionUpdateListener;
        private boolean mPreferKeepClear;
        android.view.ScrollCaptureCallback mScrollCaptureCallback;
        private java.util.ArrayList<android.graphics.Rect> mSystemGestureExclusionRects;
        private java.util.ArrayList<android.view.View.OnUnhandledKeyEventListener> mUnhandledKeyListeners;
        private java.util.ArrayList<android.graphics.Rect> mUnrestrictedKeepClearRects;
        android.view.WindowInsetsAnimation.Callback mWindowInsetsAnimationCallback;
        ListenerInfo() {}
    }

    private static class MatchIdPredicate implements java.util.function.Predicate<android.view.View> {
        public int mId;
        private MatchIdPredicate() {}
        public boolean test(android.view.View p0) { return false; }
    }

    private static class MatchLabelForPredicate implements java.util.function.Predicate<android.view.View> {
        private int mLabeledId;
        private MatchLabelForPredicate() {}
        public boolean test(android.view.View p0) { return false; }
    }

    public static class MeasureSpec {
        public static final int AT_MOST = -2147483648;
        public static final int EXACTLY = 1073741824;
        private static final int MODE_MASK = -1073741824;
        private static final int MODE_SHIFT = 30;
        public static final int UNSPECIFIED = 0;
        public MeasureSpec() {}
        static int adjust(int p0, int p1) { return 0; }
        public static int getMode(int p0) { return 0; }
        public static int getSize(int p0) { return 0; }
        public static int makeMeasureSpec(int p0, int p1) { return 0; }
        public static int makeSafeMeasureSpec(int p0, int p1) { return 0; }
        public static java.lang.String toString(int p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface MeasureSpecMode {
        }
    }

    public static final class NoPreloadHolder {
        private static final boolean sContentInteractionApiEnabledFlagValue = Boolean.valueOf(false);
        private static java.lang.String sFrameRateSysProp;
        private static final boolean sNewHeuristicsForContentCaptureImportanceEnabledFlagValue = Boolean.valueOf(false);
        public NoPreloadHolder() {}
        public static boolean isContentInteractionApiEnabled() { return false; }
        public static boolean isNewHeuristicsForContentCaptureImportanceEnabled() { return false; }
        public static int[][] parseFrameRateMapping(java.lang.String p0) { return null; }
    }

    public static interface OnApplyWindowInsetsListener {
        public android.view.WindowInsets onApplyWindowInsets(android.view.View p0, android.view.WindowInsets p1);
    }

    public static interface OnAttachStateChangeListener {
        public void onViewAttachedToWindow(android.view.View p0);
        public void onViewDetachedFromWindow(android.view.View p0);
    }

    public static interface OnCapturedPointerListener {
        public boolean onCapturedPointer(android.view.View p0, android.view.MotionEvent p1);
    }

    public static interface OnClickListener {
        public void onClick(android.view.View p0);
    }

    public static interface OnContextClickListener {
        public boolean onContextClick(android.view.View p0);
    }

    public static interface OnCreateContextMenuListener {
        public void onCreateContextMenu(android.view.ContextMenu p0, android.view.View p1, android.view.ContextMenu.ContextMenuInfo p2);
    }

    public static interface OnDragListener {
        public boolean onDrag(android.view.View p0, android.view.DragEvent p1);
    }

    public static interface OnFocusChangeListener {
        public void onFocusChange(android.view.View p0, boolean p1);
    }

    public static interface OnGenericMotionListener {
        public boolean onGenericMotion(android.view.View p0, android.view.MotionEvent p1);
    }

    public static interface OnHoverListener {
        public boolean onHover(android.view.View p0, android.view.MotionEvent p1);
    }

    public static interface OnKeyListener {
        public boolean onKey(android.view.View p0, int p1, android.view.KeyEvent p2);
    }

    public static interface OnLayoutChangeListener {
        public void onLayoutChange(android.view.View p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8);
    }

    public static interface OnLongClickListener {
        public boolean onLongClick(android.view.View p0);
        default public boolean onLongClickUseDefaultHapticFeedback(android.view.View p0) { return false; }
    }

    public static interface OnScrollChangeListener {
        public void onScrollChange(android.view.View p0, int p1, int p2, int p3, int p4);
    }

    @java.lang.Deprecated
    public static interface OnSystemUiVisibilityChangeListener {
        public void onSystemUiVisibilityChange(int p0);
    }

    public static interface OnTouchListener {
        public boolean onTouch(android.view.View p0, android.view.MotionEvent p1);
    }

    public static interface OnUnhandledKeyEventListener {
        public boolean onUnhandledKeyEvent(android.view.View p0, android.view.KeyEvent p1);
    }

    private final class PerformClick implements java.lang.Runnable {
        private PerformClick(android.view.View p0) {}
        public void run() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PointerCaptureMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RectangleOnScreenRequestSource {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResolvedLayoutDir {
    }

    private static class ScrollabilityCache implements java.lang.Runnable {
        public static final int DRAGGING_HORIZONTAL_SCROLL_BAR = 2;
        public static final int DRAGGING_VERTICAL_SCROLL_BAR = 1;
        public static final int FADING = 2;
        public static final int NOT_DRAGGING = 0;
        public static final int OFF = 0;
        public static final int ON = 1;
        private static final float[] OPAQUE = null;
        private static final float[] TRANSPARENT = null;
        public boolean fadeScrollBars;
        public boolean fadeScrollBarsScheduled;
        public long fadeStartTime;
        public int fadingEdgeLength;
        android.os.Handler handler;
        public android.view.View host;
        public float[] interpolatorValues;
        private int mLastColor;
        public final android.graphics.Rect mScrollBarBounds = null;
        public float mScrollBarDraggingPos;
        public int mScrollBarDraggingState;
        public final android.graphics.Rect mScrollBarTouchBounds = null;
        public final android.graphics.Matrix matrix = null;
        public final android.graphics.Paint paint = null;
        public android.widget.ScrollBarDrawable scrollBar;
        public int scrollBarDefaultDelayBeforeFade;
        public int scrollBarFadeDuration;
        public final android.graphics.Interpolator scrollBarInterpolator = null;
        public int scrollBarMinTouchTarget;
        public int scrollBarSize;
        public android.graphics.Shader shader;
        public int state;
        public ScrollabilityCache(android.view.ViewConfiguration p0, android.view.View p1) {}
        public void run() {}
        public void setFadeColor(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScrollBarStyle {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScrollCaptureHint {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScrollIndicators {
    }

    private class SendAccessibilityEventThrottle implements java.lang.Runnable {
        private android.view.accessibility.AccessibilityEvent mAccessibilityEvent;
        public volatile boolean mIsPending;
        private SendAccessibilityEventThrottle(android.view.View p0) {}
        public void post(android.view.accessibility.AccessibilityEvent p0) {}
        public void reset() {}
        public void run() {}
        public void updateWithAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    }

    private class SendViewScrolledAccessibilityEvent extends android.view.View.SendAccessibilityEventThrottle {
        public int mDeltaX;
        public int mDeltaY;
        private SendViewScrolledAccessibilityEvent(android.view.View p0) { super(null); }
        public void reset() {}
        public void updateWithAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    }

    private static class SensitiveAutofillHintsHelper {
        private static final android.util.ArraySet<java.lang.String> SENSITIVE_CONTENT_AUTOFILL_HINTS = null;
        private SensitiveAutofillHintsHelper() {}
        static boolean containsSensitiveAutofillHint(java.lang.String[] p0) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SystemUiVisibility {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TextAlignment {
    }

    static class TintInfo {
        android.graphics.BlendMode mBlendMode;
        boolean mHasTintList;
        boolean mHasTintMode;
        android.content.res.ColorStateList mTintList;
        TintInfo() {}
    }

    private static class TooltipInfo {
        int mAnchorX;
        int mAnchorY;
        java.lang.Runnable mHideTooltipRunnable;
        int mHoverSlop;
        java.lang.Runnable mShowTooltipRunnable;
        boolean mTooltipFromLongClick;
        com.android.internal.view.TooltipPopup mTooltipPopup;
        java.lang.CharSequence mTooltipText;
        private TooltipInfo() {}
        private void clearAnchorPos() {}
        private boolean updateAnchorPos(android.view.MotionEvent p0) { return false; }
    }

    static class TransformationInfo {
        @android.view.ViewDebug.ExportedProperty
        private float mAlpha;
        private android.graphics.Matrix mInverseMatrix;
        private final android.graphics.Matrix mMatrix = null;
        float mTransitionAlpha;
        TransformationInfo() {}
    }

    private final class UnsetPressedState implements java.lang.Runnable {
        private UnsetPressedState(android.view.View p0) {}
        public void run() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ViewStructureType {
    }

    private class ViewTranslationRequestConsumer implements java.util.function.Consumer<android.view.translation.ViewTranslationRequest> {
        private boolean mCalled;
        private final java.util.List<android.view.translation.ViewTranslationRequest> mRequests = null;
        ViewTranslationRequestConsumer(java.util.List<android.view.translation.ViewTranslationRequest> p0) {}
        public void accept(android.view.translation.ViewTranslationRequest p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Visibility {
    }

    private static class VisibilityChangeForAutofillHandler extends android.os.Handler {
        private final android.view.autofill.AutofillManager mAfm = null;
        private final android.view.View mView = null;
        private VisibilityChangeForAutofillHandler(android.view.autofill.AutofillManager p0, android.view.View p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.view.View> {
        private int mAccessibilityFocusedId;
        private int mAccessibilityHeadingId;
        private int mAccessibilityLiveRegionId;
        private int mAccessibilityPaneTitleId;
        private int mAccessibilityTraversalAfterId;
        private int mAccessibilityTraversalBeforeId;
        private int mActivatedId;
        private int mAlphaId;
        private int mAutofillHintsId;
        private int mBackgroundId;
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mBaselineId;
        private int mClickableId;
        private int mContentDescriptionId;
        private int mContextClickableId;
        private int mDefaultFocusHighlightEnabledId;
        private int mDrawingCacheQualityId;
        private int mDuplicateParentStateId;
        private int mElevationId;
        private int mEnabledId;
        private int mFadingEdgeLengthId;
        private int mFilterTouchesWhenObscuredId;
        private int mFitsSystemWindowsId;
        private int mFocusableId;
        private int mFocusableInTouchModeId;
        private int mFocusedByDefaultId;
        private int mFocusedId;
        private int mForceDarkAllowedId;
        private int mForegroundGravityId;
        private int mForegroundId;
        private int mForegroundTintId;
        private int mForegroundTintModeId;
        private int mHapticFeedbackEnabledId;
        private int mIdId;
        private int mImportantForAccessibilityId;
        private int mImportantForAutofillId;
        private int mImportantForContentCaptureId;
        private int mIsScrollContainerId;
        private int mKeepScreenOnId;
        private int mKeyboardNavigationClusterId;
        private int mLabelForId;
        private int mLayerTypeId;
        private int mLayoutDirectionId;
        private int mLongClickableId;
        private int mMinHeightId;
        private int mMinWidthId;
        private int mNestedScrollingEnabledId;
        private int mNextClusterForwardId;
        private int mNextFocusDownId;
        private int mNextFocusForwardId;
        private int mNextFocusLeftId;
        private int mNextFocusRightId;
        private int mNextFocusUpId;
        private int mOutlineAmbientShadowColorId;
        private int mOutlineProviderId;
        private int mOutlineSpotShadowColorId;
        private int mOverScrollModeId;
        private int mPaddingBottomId;
        private int mPaddingLeftId;
        private int mPaddingRightId;
        private int mPaddingTopId;
        private int mPointerIconId;
        private int mPressedId;
        private boolean mPropertiesMapped;
        private int mRawLayoutDirectionId;
        private int mRawTextAlignmentId;
        private int mRawTextDirectionId;
        private int mRequiresFadingEdgeId;
        private int mRotationId;
        private int mRotationXId;
        private int mRotationYId;
        private int mSaveEnabledId;
        private int mScaleXId;
        private int mScaleYId;
        private int mScreenReaderFocusableId;
        private int mScrollIndicatorsId;
        private int mScrollXId;
        private int mScrollYId;
        private int mScrollbarDefaultDelayBeforeFadeId;
        private int mScrollbarFadeDurationId;
        private int mScrollbarSizeId;
        private int mScrollbarStyleId;
        private int mSelectedId;
        private int mSolidColorId;
        private int mSoundEffectsEnabledId;
        private int mStateListAnimatorId;
        private int mSupplementalDescriptionId;
        private int mTagId;
        private int mTextAlignmentId;
        private int mTextDirectionId;
        private int mTooltipTextId;
        private int mTransformPivotXId;
        private int mTransformPivotYId;
        private int mTransitionNameId;
        private int mTranslationXId;
        private int mTranslationYId;
        private int mTranslationZId;
        private int mVisibilityId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.view.View p0, android.view.inspector.PropertyReader p1) {}
    }
}
