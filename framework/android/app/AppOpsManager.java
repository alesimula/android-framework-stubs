package android.app;

public class AppOpsManager {
    private static final java.lang.String APP_OP_MODE_CACHING_API = "getAppOpMode";
    private static final java.lang.String APP_OP_MODE_CACHING_NAME = "appOpModeCache";
    private static final int APP_OP_MODE_CACHING_SIZE = 2048;
    private static final int[] APP_OP_PERMISSION_PACKAGE_OPS = null;
    private static final int[] APP_OP_PERMISSION_UID_OPS = null;
    public static final int ATTRIBUTION_CHAIN_ID_NONE = -1;
    public static final int ATTRIBUTION_FLAGS_NONE = 0;
    public static final int ATTRIBUTION_FLAG_ACCESSOR = 1;
    public static final int ATTRIBUTION_FLAG_INTERMEDIARY = 2;
    public static final int ATTRIBUTION_FLAG_RECEIVER = 4;
    public static final int ATTRIBUTION_FLAG_TRUSTED = 8;
    private static final int BITMASK_LEN = 3;
    public static final long CALL_BACK_ON_CHANGED_LISTENER_WITH_SWITCHED_OP_CHANGE = 148180766L;
    public static final int CALL_BACK_ON_SWITCHED_OP = 2;
    private static final java.lang.String CHECK_PACKAGE_CACHING_API = "checkPackage";
    private static final java.lang.String CHECK_PACKAGE_CACHING_NAME = "checkPackageCache";
    private static final int CHECK_PACKAGE_CACHING_SIZE = 512;
    private static final int COLLECT_ASYNC = 3;
    private static final int COLLECT_SELF = 1;
    private static final int COLLECT_SYNC = 2;
    private static final int DONT_COLLECT = 0;
    public static final int FILTER_BY_ATTRIBUTION_TAG = 4;
    public static final int FILTER_BY_OP_NAMES = 8;
    public static final int FILTER_BY_PACKAGE_NAME = 2;
    public static final int FILTER_BY_UID = 1;
    private static final int FLAGS_MASK = -1;
    private static final java.lang.String FULL_LOG = "privacy_attribution_tag_full_log_enabled";
    public static final int HISTORICAL_MODE_DISABLED = 0;
    public static final int HISTORICAL_MODE_ENABLED_ACTIVE = 1;
    public static final int HISTORICAL_MODE_ENABLED_PASSIVE = 2;
    @android.annotation.SystemApi
    public static final int HISTORY_FLAGS_ALL = 3;
    @android.annotation.SystemApi
    public static final int HISTORY_FLAG_AGGREGATE = 1;
    @android.annotation.SystemApi
    public static final int HISTORY_FLAG_DISCRETE = 2;
    @android.annotation.SystemApi
    public static final int HISTORY_FLAG_GET_ATTRIBUTION_CHAINS = 4;
    public static final java.lang.String KEY_BG_STATE_SETTLE_TIME = "bg_state_settle_time";
    public static final java.lang.String KEY_FG_SERVICE_STATE_SETTLE_TIME = "fg_service_state_settle_time";
    public static final java.lang.String KEY_HISTORICAL_OPS = "historical_ops";
    public static final java.lang.String KEY_TOP_STATE_SETTLE_TIME = "top_state_settle_time";
    public static final int MAX_PRIORITY_UID_STATE = 100;
    private static final int MAX_UNFORWARDED_OPS = 10;
    public static final int MIN_PRIORITY_UID_STATE = 700;
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_FOREGROUND = 4;
    public static final int MODE_IGNORED = 1;
    public static final java.lang.String[] MODE_NAMES = null;
    private static final int NOTE_OP_BATCHING_DELAY_MILLIS = 1000;
    public static final boolean NOTE_OP_COLLECTION_ENABLED = false;
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ACCEPT_HANDOVER = "android:accept_handover";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ACCESS_ACCESSIBILITY = "android:access_accessibility";
    public static final java.lang.String OPSTR_ACCESS_HID = "android:access_hid";
    public static final java.lang.String OPSTR_ACCESS_LOCAL_NETWORK = "android:access_local_network";
    public static final java.lang.String OPSTR_ACCESS_MEDIA_LOCATION = "android:access_media_location";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ACCESS_NOTIFICATIONS = "android:access_notifications";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ACCESS_RESTRICTED_SETTINGS = "android:access_restricted_settings";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ACTIVATE_PLATFORM_VPN = "android:activate_platform_vpn";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ACTIVATE_VPN = "android:activate_vpn";
    public static final java.lang.String OPSTR_ACTIVITY_RECOGNITION = "android:activity_recognition";
    public static final java.lang.String OPSTR_ACTIVITY_RECOGNITION_SOURCE = "android:activity_recognition_source";
    public static final java.lang.String OPSTR_ADD_VOICEMAIL = "android:add_voicemail";
    public static final java.lang.String OPSTR_ANSWER_PHONE_CALLS = "android:answer_phone_calls";
    public static final java.lang.String OPSTR_ARCHIVE_ICON_OVERLAY = "android:archive_icon_overlay";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ASSIST_SCREENSHOT = "android:assist_screenshot";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ASSIST_STRUCTURE = "android:assist_structure";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_ACCESSIBILITY_VOLUME = "android:audio_accessibility_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_ALARM_VOLUME = "android:audio_alarm_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_BLUETOOTH_VOLUME = "android:audio_bluetooth_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_MASTER_VOLUME = "android:audio_master_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_MEDIA_VOLUME = "android:audio_media_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_NOTIFICATION_VOLUME = "android:audio_notification_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_RING_VOLUME = "android:audio_ring_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUDIO_VOICE_VOLUME = "android:audio_voice_volume";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUTO_REVOKE_MANAGED_BY_INSTALLER = "android:auto_revoke_managed_by_installer";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_AUTO_REVOKE_PERMISSIONS_IF_UNUSED = "android:auto_revoke_permissions_if_unused";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_BIND_ACCESSIBILITY_SERVICE = "android:bind_accessibility_service";
    public static final java.lang.String OPSTR_BLUETOOTH_ADVERTISE = "android:bluetooth_advertise";
    public static final java.lang.String OPSTR_BLUETOOTH_CONNECT = "android:bluetooth_connect";
    public static final java.lang.String OPSTR_BLUETOOTH_SCAN = "android:bluetooth_scan";
    public static final java.lang.String OPSTR_BODY_SENSORS = "android:body_sensors";
    public static final java.lang.String OPSTR_CALL_PHONE = "android:call_phone";
    public static final java.lang.String OPSTR_CAMERA = "android:camera";
    public static final java.lang.String OPSTR_CAMERA_SANDBOXED = "android:camera_sandboxed";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_CAPTURE_CONSENTLESS_BUGREPORT_ON_USERDEBUG_BUILD = "android:capture_consentless_bugreport_on_userdebug_build";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_CHANGE_WIFI_STATE = "android:change_wifi_state";
    public static final java.lang.String OPSTR_COARSE_LOCATION = "android:coarse_location";
    public static final java.lang.String OPSTR_COARSE_LOCATION_SOURCE = "android:coarse_location_source";
    public static final java.lang.String OPSTR_COMPUTER_CONTROL = "android:computer_control";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_CONTINUE_ACROSS_DEVICES = "android:continue_across_devices";
    public static final java.lang.String OPSTR_CONTROL_AUDIO = "android:control_audio";
    public static final java.lang.String OPSTR_CONTROL_AUDIO_PARTIAL = "android:control_audio_partial";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_CREATE_ACCESSIBILITY_OVERLAY = "android:create_accessibility_overlay";
    public static final java.lang.String OPSTR_DEPRECATED_2 = "android:deprecated_2";
    public static final java.lang.String OPSTR_DEPRECATED_3 = "android:deprecated_3";
    public static final java.lang.String OPSTR_DEPRECATED_4 = "android:deprecated_4";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_EMERGENCY_LOCATION = "android:emergency_location";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ENABLE_MOBILE_DATA_BY_USER = "android:enable_mobile_data_by_user";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ESTABLISH_VPN_MANAGER = "android:establish_vpn_manager";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_ESTABLISH_VPN_SERVICE = "android:establish_vpn_service";
    public static final java.lang.String OPSTR_EYE_TRACKING_COARSE = "android:eye_tracking_coarse";
    public static final java.lang.String OPSTR_EYE_TRACKING_FINE = "android:eye_tracking_fine";
    public static final java.lang.String OPSTR_FACE_TRACKING = "android:face_tracking";
    public static final java.lang.String OPSTR_FINE_LOCATION = "android:fine_location";
    public static final java.lang.String OPSTR_FINE_LOCATION_SOURCE = "android:fine_location_source";
    public static final java.lang.String OPSTR_FOREGROUND_SERVICE_SPECIAL_USE = "android:foreground_service_special_use";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_GET_ACCOUNTS = "android:get_accounts";
    public static final java.lang.String OPSTR_GET_USAGE_STATS = "android:get_usage_stats";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_GPS = "android:gps";
    public static final java.lang.String OPSTR_HAND_TRACKING = "android:hand_tracking";
    public static final java.lang.String OPSTR_HEAD_TRACKING = "android:head_tracking";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_INSTANT_APP_START_FOREGROUND = "android:instant_app_start_foreground";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_INTERACT_ACROSS_PROFILES = "android:interact_across_profiles";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_LEGACY_STORAGE = "android:legacy_storage";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_LOADER_USAGE_STATS = "android:loader_usage_stats";
    public static final java.lang.String OPSTR_MANAGE_CONTACTS = "android:manage_contacts";
    public static final java.lang.String OPSTR_MANAGE_CREDENTIALS = "android:manage_credentials";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_MANAGE_EXTERNAL_STORAGE = "android:manage_external_storage";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_MANAGE_IPSEC_TUNNELS = "android:manage_ipsec_tunnels";
    public static final java.lang.String OPSTR_MANAGE_MEDIA = "android:manage_media";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_MANAGE_ONGOING_CALLS = "android:manage_ongoing_calls";
    public static final java.lang.String OPSTR_MANAGE_PERIPHERAL_CUSTOMIZATION = "android:manage_peripheral_customization";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_MEDIA_ROUTING_CONTROL = "android:media_routing_control";
    public static final java.lang.String OPSTR_MOCK_LOCATION = "android:mock_location";
    public static final java.lang.String OPSTR_MONITOR_HIGH_POWER_LOCATION = "android:monitor_location_high_power";
    public static final java.lang.String OPSTR_MONITOR_LOCATION = "android:monitor_location";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_MUTE_MICROPHONE = "android:mute_microphone";
    public static final java.lang.String OPSTR_NEARBY_WIFI_DEVICES = "android:nearby_wifi_devices";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_NEIGHBORING_CELLS = "android:neighboring_cells";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final java.lang.String OPSTR_NO_ISOLATED_STORAGE = "android:no_isolated_storage";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_PHONE_CALL_CAMERA = "android:phone_call_camera";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_PHONE_CALL_MICROPHONE = "android:phone_call_microphone";
    public static final java.lang.String OPSTR_PICTURE_IN_PICTURE = "android:picture_in_picture";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_PLAY_AUDIO = "android:play_audio";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_POST_NOTIFICATION = "android:post_notification";
    public static final java.lang.String OPSTR_POST_PROMOTED_NOTIFICATIONS = "android:post_promoted_notifications";
    public static final java.lang.String OPSTR_PROCESS_OUTGOING_CALLS = "android:process_outgoing_calls";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_PROJECT_MEDIA = "android:project_media";
    public static final java.lang.String OPSTR_QUERY_ALL_PACKAGES = "android:query_all_packages";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_RANGING = "android:ranging";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_RAPID_CLEAR_NOTIFICATIONS_BY_LISTENER = "android:rapid_clear_notifications_by_listener";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_BLOOD_PRESSURE = "android:read_blood_pressure";
    public static final java.lang.String OPSTR_READ_CALENDAR = "android:read_calendar";
    public static final java.lang.String OPSTR_READ_CALL_LOG = "android:read_call_log";
    public static final java.lang.String OPSTR_READ_CELL_BROADCASTS = "android:read_cell_broadcasts";
    public static final java.lang.String OPSTR_READ_CELL_IDENTITY = "android:read_cell_identity";
    public static final java.lang.String OPSTR_READ_CELL_INFO = "android:read_cell_info";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_CLIPBOARD = "android:read_clipboard";
    public static final java.lang.String OPSTR_READ_CONTACTS = "android:read_contacts";
    public static final java.lang.String OPSTR_READ_DEVICE_IDENTIFIERS = "android:read_device_identifiers";
    public static final java.lang.String OPSTR_READ_EXTERNAL_STORAGE = "android:read_external_storage";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_HEART_RATE = "android:read_heart_rate";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_HEART_RATE_VARIABILITY = "android:read_heart_rate_variability";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_ICC_SMS = "android:read_icc_sms";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_MEDIA_AUDIO = "android:read_media_audio";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_MEDIA_IMAGES = "android:read_media_images";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_MEDIA_VIDEO = "android:read_media_video";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_MEDIA_VISUAL_USER_SELECTED = "android:read_media_visual_user_selected";
    public static final java.lang.String OPSTR_READ_OTP_SMS = "android:read_otp_sms";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_OXYGEN_SATURATION = "android:read_oxygen_saturation";
    public static final java.lang.String OPSTR_READ_PHONE_NUMBERS = "android:read_phone_numbers";
    public static final java.lang.String OPSTR_READ_PHONE_STATE = "android:read_phone_state";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_RESPIRATORY_RATE = "android:read_respiratory_rate";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_RESTRICTED_MESSAGES = "android:read_restricted_messages";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_SCREEN_CONTEXT = "android:read_screen_context";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_SKIN_TEMPERATURE = "android:read_skin_temperature";
    public static final java.lang.String OPSTR_READ_SMS = "android:read_sms";
    public static final java.lang.String OPSTR_READ_SYSTEM_GRAMMATICAL_GENDER = "android:read_system_grammatical_gender";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_VO2_MAX = "android:read_vo2_max";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_READ_WRITE_HEALTH_DATA = "android:read_write_health_data";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_RECEIVE_AMBIENT_TRIGGER_AUDIO = "android:receive_ambient_trigger_audio";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_RECEIVE_EMERGENCY_BROADCAST = "android:receive_emergency_broadcast";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_RECEIVE_EXPLICIT_USER_INTERACTION_AUDIO = "android:receive_explicit_user_interaction_audio";
    public static final java.lang.String OPSTR_RECEIVE_MMS = "android:receive_mms";
    public static final java.lang.String OPSTR_RECEIVE_SANDBOX_TRIGGER_AUDIO = "android:receive_sandbox_trigger_audio";
    public static final java.lang.String OPSTR_RECEIVE_SENSITIVE_NOTIFICATIONS = "android:receive_sensitive_notifications";
    public static final java.lang.String OPSTR_RECEIVE_SMS = "android:receive_sms";
    public static final java.lang.String OPSTR_RECEIVE_WAP_PUSH = "android:receive_wap_push";
    public static final java.lang.String OPSTR_RECORD_AUDIO = "android:record_audio";
    public static final java.lang.String OPSTR_RECORD_AUDIO_HOTWORD = "android:record_audio_hotword";
    public static final java.lang.String OPSTR_RECORD_AUDIO_OUTPUT = "android:record_audio_output";
    public static final java.lang.String OPSTR_RECORD_AUDIO_SANDBOXED = "android:record_audio_sandboxed";
    public static final java.lang.String OPSTR_RECORD_INCOMING_PHONE_AUDIO = "android:record_incoming_phone_audio";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_REQUEST_DELETE_PACKAGES = "android:request_delete_packages";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_REQUEST_INSTALL_PACKAGES = "android:request_install_packages";
    public static final java.lang.String OPSTR_RESERVED_FOR_TESTING = "android:reserved_for_testing";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_RUN_ANY_IN_BACKGROUND = "android:run_any_in_background";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_RUN_IN_BACKGROUND = "android:run_in_background";
    public static final java.lang.String OPSTR_RUN_USER_INITIATED_JOBS = "android:run_user_initiated_jobs";
    public static final java.lang.String OPSTR_SCENE_UNDERSTANDING_COARSE = "android:scene_understanding_coarse";
    public static final java.lang.String OPSTR_SCENE_UNDERSTANDING_FINE = "android:scene_understanding_fine";
    public static final java.lang.String OPSTR_SCHEDULE_EXACT_ALARM = "android:schedule_exact_alarm";
    public static final java.lang.String OPSTR_SEND_SMS = "android:send_sms";
    public static final java.lang.String OPSTR_SMS_FINANCIAL_TRANSACTIONS = "android:sms_financial_transactions";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_START_FOREGROUND = "android:start_foreground";
    public static final java.lang.String OPSTR_SYSTEM_ALERT_WINDOW = "android:system_alert_window";
    public static final java.lang.String OPSTR_SYSTEM_APPLICATION_OVERLAY = "android:system_application_overlay";
    public static final java.lang.String OPSTR_SYSTEM_EXEMPT_FROM_ACTIVITY_BG_START_RESTRICTION = "android:system_exempt_from_activity_bg_start_restriction";
    public static final java.lang.String OPSTR_SYSTEM_EXEMPT_FROM_DISMISSIBLE_NOTIFICATIONS = "android:system_exempt_from_dismissible_notifications";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_SYSTEM_EXEMPT_FROM_HIBERNATION = "android:system_exempt_from_hibernation";
    public static final java.lang.String OPSTR_SYSTEM_EXEMPT_FROM_POWER_RESTRICTIONS = "android:system_exempt_from_power_restrictions";
    public static final java.lang.String OPSTR_SYSTEM_EXEMPT_FROM_SUSPENSION = "android:system_exempt_from_suspension";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_TAKE_AUDIO_FOCUS = "android:take_audio_focus";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_TAKE_MEDIA_BUTTONS = "android:take_media_buttons";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_TOAST_WINDOW = "android:toast_window";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_TURN_SCREEN_ON = "android:turn_screen_on";
    public static final java.lang.String OPSTR_UNARCHIVAL_CONFIRMATION = "android:unarchival_support";
    public static final java.lang.String OPSTR_USE_BIOMETRIC = "android:use_biometric";
    public static final java.lang.String OPSTR_USE_FINGERPRINT = "android:use_fingerprint";
    public static final java.lang.String OPSTR_USE_FULL_SCREEN_INTENT = "android:use_full_screen_intent";
    public static final java.lang.String OPSTR_USE_ICC_AUTH_WITH_DEVICE_IDENTIFIER = "android:use_icc_auth_with_device_identifier";
    public static final java.lang.String OPSTR_USE_SIP = "android:use_sip";
    public static final java.lang.String OPSTR_UWB_RANGING = "android:uwb_ranging";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_VIBRATE = "android:vibrate";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WAKE_LOCK = "android:wake_lock";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WIFI_SCAN = "android:wifi_scan";
    public static final java.lang.String OPSTR_WRITE_CALENDAR = "android:write_calendar";
    public static final java.lang.String OPSTR_WRITE_CALL_LOG = "android:write_call_log";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WRITE_CLIPBOARD = "android:write_clipboard";
    public static final java.lang.String OPSTR_WRITE_CONTACTS = "android:write_contacts";
    public static final java.lang.String OPSTR_WRITE_EXTERNAL_STORAGE = "android:write_external_storage";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WRITE_ICC_SMS = "android:write_icc_sms";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WRITE_MEDIA_AUDIO = "android:write_media_audio";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WRITE_MEDIA_IMAGES = "android:write_media_images";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WRITE_MEDIA_VIDEO = "android:write_media_video";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WRITE_RESTRICTED_MESSAGES = "android:write_restricted_messages";
    public static final java.lang.String OPSTR_WRITE_SETTINGS = "android:write_settings";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WRITE_SMS = "android:write_sms";
    public static final java.lang.String OPSTR_WRITE_SYSTEM_PREFERENCES = "android:write_system_preferences";
    @android.annotation.SystemApi
    public static final java.lang.String OPSTR_WRITE_WALLPAPER = "android:write_wallpaper";
    private static final android.util.SparseBooleanArray OPS_WITHOUT_CACHING = null;
    public static final int OP_ACCEPT_HANDOVER = 74;
    public static final int OP_ACCESS_ACCESSIBILITY = 88;
    public static final int OP_ACCESS_HID = 178;
    public static final int OP_ACCESS_LOCAL_NETWORK = 169;
    public static final int OP_ACCESS_MEDIA_LOCATION = 90;
    public static final int OP_ACCESS_NOTIFICATIONS = 25;
    public static final int OP_ACCESS_RESTRICTED_SETTINGS = 119;
    public static final int OP_ACTIVATE_PLATFORM_VPN = 94;
    public static final int OP_ACTIVATE_VPN = 47;
    public static final int OP_ACTIVITY_RECOGNITION = 79;
    public static final int OP_ACTIVITY_RECOGNITION_SOURCE = 113;
    public static final int OP_ADD_VOICEMAIL = 52;
    public static final int OP_ANSWER_PHONE_CALLS = 69;
    public static final int OP_ARCHIVE_ICON_OVERLAY = 145;
    public static final int OP_ASSIST_SCREENSHOT = 50;
    public static final int OP_ASSIST_STRUCTURE = 49;
    public static final int OP_AUDIO_ACCESSIBILITY_VOLUME = 64;
    public static final int OP_AUDIO_ALARM_VOLUME = 37;
    public static final int OP_AUDIO_BLUETOOTH_VOLUME = 39;
    public static final int OP_AUDIO_MASTER_VOLUME = 33;
    public static final int OP_AUDIO_MEDIA_VOLUME = 36;
    public static final int OP_AUDIO_NOTIFICATION_VOLUME = 38;
    public static final int OP_AUDIO_RING_VOLUME = 35;
    public static final int OP_AUDIO_VOICE_VOLUME = 34;
    public static final int OP_AUTO_REVOKE_MANAGED_BY_INSTALLER = 98;
    public static final int OP_AUTO_REVOKE_PERMISSIONS_IF_UNUSED = 97;
    public static final int OP_BIND_ACCESSIBILITY_SERVICE = 73;
    public static final int OP_BLUETOOTH_ADVERTISE = 114;
    public static final int OP_BLUETOOTH_CONNECT = 111;
    public static final int OP_BLUETOOTH_SCAN = 77;
    public static final int OP_BODY_SENSORS = 56;
    public static final int OP_CALL_PHONE = 13;
    public static final int OP_CAMERA = 26;
    public static final int OP_CAMERA_SANDBOXED = 134;
    public static final int OP_CAPTURE_CONSENTLESS_BUGREPORT_ON_USERDEBUG_BUILD = 131;
    public static final int OP_CHANGE_WIFI_STATE = 71;
    public static final int OP_COARSE_LOCATION = 0;
    public static final int OP_COARSE_LOCATION_SOURCE = 109;
    public static final int OP_COMPUTER_CONTROL = 167;
    public static final int OP_CONTINUE_ACROSS_DEVICES = 174;
    public static final int OP_CONTROL_AUDIO = 154;
    public static final int OP_CONTROL_AUDIO_PARTIAL = 155;
    public static final int OP_CREATE_ACCESSIBILITY_OVERLAY = 138;
    private static final int OP_DEPRECATED_1 = 96;
    private static final int OP_DEPRECATED_2 = 132;
    private static final int OP_DEPRECATED_3 = 137;
    private static final int OP_DEPRECATED_4 = 144;
    public static final int OP_EMERGENCY_LOCATION = 147;
    public static final int OP_ENABLE_MOBILE_DATA_BY_USER = 140;
    public static final int OP_ESTABLISH_VPN_MANAGER = 118;
    public static final int OP_ESTABLISH_VPN_SERVICE = 117;
    public static final int OP_EYE_TRACKING_COARSE = 156;
    public static final int OP_EYE_TRACKING_FINE = 157;
    public static final int OP_FACE_TRACKING = 158;
    public static final int OP_FINE_LOCATION = 1;
    public static final int OP_FINE_LOCATION_SOURCE = 108;
    @android.annotation.SystemApi
    public static final int OP_FLAGS_ALL = 31;
    @android.annotation.SystemApi
    public static final int OP_FLAGS_ALL_TRUSTED = 13;
    @android.annotation.SystemApi
    public static final int OP_FLAG_SELF = 1;
    @android.annotation.SystemApi
    public static final int OP_FLAG_TRUSTED_PROXIED = 8;
    @android.annotation.SystemApi
    public static final int OP_FLAG_TRUSTED_PROXY = 2;
    @android.annotation.SystemApi
    public static final int OP_FLAG_UNTRUSTED_PROXIED = 16;
    @android.annotation.SystemApi
    public static final int OP_FLAG_UNTRUSTED_PROXY = 4;
    public static final int OP_FOREGROUND_SERVICE_SPECIAL_USE = 127;
    public static final int OP_GET_ACCOUNTS = 62;
    public static final int OP_GET_USAGE_STATS = 43;
    public static final int OP_GPS = 2;
    public static final int OP_HAND_TRACKING = 159;
    public static final int OP_HEAD_TRACKING = 160;
    public static final int OP_INSTANT_APP_START_FOREGROUND = 68;
    public static final int OP_INTERACT_ACROSS_PROFILES = 93;
    public static final int OP_LEGACY_STORAGE = 87;
    public static final int OP_LOADER_USAGE_STATS = 95;
    public static final int OP_MANAGE_CONTACTS = 180;
    public static final int OP_MANAGE_CREDENTIALS = 104;
    public static final int OP_MANAGE_EXTERNAL_STORAGE = 92;
    public static final int OP_MANAGE_IPSEC_TUNNELS = 75;
    public static final int OP_MANAGE_MEDIA = 110;
    public static final int OP_MANAGE_ONGOING_CALLS = 103;
    public static final int OP_MANAGE_PERIPHERAL_CUSTOMIZATION = 179;
    public static final int OP_MEDIA_ROUTING_CONTROL = 139;
    public static final int OP_MOCK_LOCATION = 58;
    public static final int OP_MONITOR_HIGH_POWER_LOCATION = 42;
    public static final int OP_MONITOR_LOCATION = 41;
    public static final int OP_MUTE_MICROPHONE = 44;
    public static final int OP_NEARBY_WIFI_DEVICES = 116;
    public static final int OP_NEIGHBORING_CELLS = 12;
    public static final int OP_NONE = -1;
    private static final int OP_NOTED_CALLBACK_FLAG_ALL = 1;
    public static final int OP_NOTED_CALLBACK_FLAG_IGNORE_ASYNC = 1;
    public static final int OP_NO_ISOLATED_STORAGE = 99;
    public static final int OP_PHONE_CALL_CAMERA = 101;
    public static final int OP_PHONE_CALL_MICROPHONE = 100;
    public static final int OP_PICTURE_IN_PICTURE = 67;
    public static final int OP_PLAY_AUDIO = 28;
    public static final int OP_POST_NOTIFICATION = 11;
    public static final int OP_POST_PROMOTED_NOTIFICATIONS = 163;
    public static final int OP_PROCESS_OUTGOING_CALLS = 54;
    public static final int OP_PROJECT_MEDIA = 46;
    public static final int OP_QUERY_ALL_PACKAGES = 91;
    public static final int OP_RANGING = 151;
    public static final int OP_RAPID_CLEAR_NOTIFICATIONS_BY_LISTENER = 142;
    public static final int OP_READ_BLOOD_PRESSURE = 170;
    public static final int OP_READ_CALENDAR = 8;
    public static final int OP_READ_CALL_LOG = 6;
    public static final int OP_READ_CELL_BROADCASTS = 57;
    public static final int OP_READ_CELL_IDENTITY = 165;
    public static final int OP_READ_CELL_INFO = 166;
    public static final int OP_READ_CLIPBOARD = 29;
    public static final int OP_READ_CONTACTS = 4;
    public static final int OP_READ_DEVICE_IDENTIFIERS = 89;
    public static final int OP_READ_EXTERNAL_STORAGE = 59;
    public static final int OP_READ_HEART_RATE = 149;
    public static final int OP_READ_HEART_RATE_VARIABILITY = 171;
    public static final int OP_READ_ICC_SMS = 21;
    public static final int OP_READ_MEDIA_AUDIO = 81;
    public static final int OP_READ_MEDIA_IMAGES = 85;
    public static final int OP_READ_MEDIA_VIDEO = 83;
    public static final int OP_READ_MEDIA_VISUAL_USER_SELECTED = 123;
    public static final int OP_READ_OTP_SMS = 168;
    public static final int OP_READ_OXYGEN_SATURATION = 152;
    public static final int OP_READ_PHONE_NUMBERS = 65;
    public static final int OP_READ_PHONE_STATE = 51;
    public static final int OP_READ_RESPIRATORY_RATE = 172;
    public static final int OP_READ_RESTRICTED_MESSAGES = 176;
    public static final int OP_READ_SCREEN_CONTEXT = 175;
    public static final int OP_READ_SKIN_TEMPERATURE = 150;
    public static final int OP_READ_SMS = 14;
    public static final int OP_READ_SYSTEM_GRAMMATICAL_GENDER = 143;
    public static final int OP_READ_VO2_MAX = 173;
    public static final int OP_READ_WRITE_HEALTH_DATA = 126;
    public static final int OP_RECEIVE_AMBIENT_TRIGGER_AUDIO = 120;
    public static final int OP_RECEIVE_EMERGECY_SMS = 17;
    public static final int OP_RECEIVE_EXPLICIT_USER_INTERACTION_AUDIO = 121;
    public static final int OP_RECEIVE_MMS = 18;
    public static final int OP_RECEIVE_SANDBOX_TRIGGER_AUDIO = 136;
    public static final int OP_RECEIVE_SENSITIVE_NOTIFICATIONS = 148;
    public static final int OP_RECEIVE_SMS = 16;
    public static final int OP_RECEIVE_WAP_PUSH = 19;
    public static final int OP_RECORD_AUDIO = 27;
    public static final int OP_RECORD_AUDIO_HOTWORD = 102;
    public static final int OP_RECORD_AUDIO_OUTPUT = 106;
    public static final int OP_RECORD_AUDIO_SANDBOXED = 135;
    public static final int OP_RECORD_INCOMING_PHONE_AUDIO = 115;
    public static final int OP_REQUEST_DELETE_PACKAGES = 72;
    public static final int OP_REQUEST_INSTALL_PACKAGES = 66;
    public static final int OP_RESERVED_FOR_TESTING = 141;
    public static final int OP_RUN_ANY_IN_BACKGROUND = 70;
    public static final int OP_RUN_IN_BACKGROUND = 63;
    public static final int OP_RUN_USER_INITIATED_JOBS = 122;
    public static final int OP_SCENE_UNDERSTANDING_COARSE = 161;
    public static final int OP_SCENE_UNDERSTANDING_FINE = 162;
    public static final int OP_SCHEDULE_EXACT_ALARM = 107;
    public static final int OP_SEND_SMS = 20;
    public static final int OP_SMS_FINANCIAL_TRANSACTIONS = 80;
    public static final int OP_START_FOREGROUND = 76;
    public static final int OP_SYSTEM_ALERT_WINDOW = 24;
    public static final int OP_SYSTEM_APPLICATION_OVERLAY = 164;
    public static final int OP_SYSTEM_EXEMPT_FROM_ACTIVITY_BG_START_RESTRICTION = 130;
    public static final int OP_SYSTEM_EXEMPT_FROM_DISMISSIBLE_NOTIFICATIONS = 125;
    public static final int OP_SYSTEM_EXEMPT_FROM_HIBERNATION = 129;
    public static final int OP_SYSTEM_EXEMPT_FROM_POWER_RESTRICTIONS = 128;
    public static final int OP_SYSTEM_EXEMPT_FROM_SUSPENSION = 124;
    public static final int OP_TAKE_AUDIO_FOCUS = 32;
    public static final int OP_TAKE_MEDIA_BUTTONS = 31;
    public static final int OP_TOAST_WINDOW = 45;
    public static final int OP_TURN_SCREEN_ON = 61;
    public static final int OP_UNARCHIVAL_CONFIRMATION = 146;
    public static final int OP_USE_BIOMETRIC = 78;
    public static final int OP_USE_FINGERPRINT = 55;
    public static final int OP_USE_FULL_SCREEN_INTENT = 133;
    public static final int OP_USE_ICC_AUTH_WITH_DEVICE_IDENTIFIER = 105;
    public static final int OP_USE_SIP = 53;
    public static final int OP_UWB_RANGING = 112;
    public static final int OP_VIBRATE = 3;
    public static final int OP_WAKE_LOCK = 40;
    public static final int OP_WIFI_SCAN = 10;
    public static final int OP_WRITE_CALENDAR = 9;
    public static final int OP_WRITE_CALL_LOG = 7;
    public static final int OP_WRITE_CLIPBOARD = 30;
    public static final int OP_WRITE_CONTACTS = 5;
    public static final int OP_WRITE_EXTERNAL_STORAGE = 60;
    public static final int OP_WRITE_ICC_SMS = 22;
    public static final int OP_WRITE_MEDIA_AUDIO = 82;
    public static final int OP_WRITE_MEDIA_IMAGES = 86;
    public static final int OP_WRITE_MEDIA_VIDEO = 84;
    public static final int OP_WRITE_RESTRICTED_MESSAGES = 177;
    public static final int OP_WRITE_SETTINGS = 23;
    public static final int OP_WRITE_SMS = 15;
    public static final int OP_WRITE_SYSTEM_PREFERENCES = 153;
    public static final int OP_WRITE_WALLPAPER = 48;
    private static final int[] RUNTIME_PERMISSION_OPS = null;
    public static final int SAMPLING_STRATEGY_BOOT_TIME_SAMPLING = 3;
    public static final int SAMPLING_STRATEGY_DEFAULT = 0;
    public static final int SAMPLING_STRATEGY_RARELY_USED = 2;
    public static final int SAMPLING_STRATEGY_UNIFORM = 1;
    public static final int SAMPLING_STRATEGY_UNIFORM_OPS = 4;
    public static final long SECURITY_EXCEPTION_ON_INVALID_ATTRIBUTION_TAG_CHANGE = 151105954L;
    private static final byte SHOULD_COLLECT_NOTE_OP = 2;
    private static final byte SHOULD_COLLECT_NOTE_OP_NOT_INITIALIZED = 0;
    private static final byte SHOULD_NOT_COLLECT_NOTE_OP = 1;
    public static final int[] UID_STATES = null;
    @android.annotation.SystemApi
    public static final int UID_STATE_BACKGROUND = 600;
    @android.annotation.SystemApi
    public static final int UID_STATE_CACHED = 700;
    @android.annotation.SystemApi
    public static final int UID_STATE_FOREGROUND = 500;
    @android.annotation.SystemApi
    public static final int UID_STATE_FOREGROUND_SERVICE = 400;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final int UID_STATE_FOREGROUND_SERVICE_LOCATION = 300;
    public static final int UID_STATE_MAX_LAST_NON_RESTRICTED = 500;
    public static final int UID_STATE_NONEXISTENT = 2147483647;
    private static final int UID_STATE_OFFSET = 31;
    @android.annotation.SystemApi
    public static final int UID_STATE_PERSISTENT = 100;
    @android.annotation.SystemApi
    public static final int UID_STATE_TOP = 200;
    public static final int WATCH_FOREGROUND_CHANGES = 1;
    public static final int _NUM_OP = 181;
    static final android.app.AppOpInfo[] sAppOpInfos = null;
    private static final android.os.IpcDataCache<android.app.AppOpsManager.AppOpModeQuery, java.lang.Integer> sAppOpModeCache = null;
    private static final java.lang.ThreadLocal<android.util.ArrayMap<java.lang.String, java.util.BitSet>> sAppOpsNotedInThisBinderTransaction = null;
    private static final byte[] sAppOpsToNote = null;
    private static final java.lang.Object sBatchedNoteOpLock = null;
    private static final java.lang.ThreadLocal<java.lang.Integer> sBinderThreadCallingUid = null;
    private static final android.os.IpcDataCache<android.app.AppOpsManager.CheckPackageQuery, java.lang.Integer> sCheckPackageCache = null;
    private static final android.os.IpcDataCache.QueryHandler<android.app.AppOpsManager.CheckPackageQuery, java.lang.Integer> sCheckPackageQuery = null;
    static android.os.IBinder sClientId;
    private static com.android.internal.app.MessageSamplingConfig sConfig;
    private static java.lang.Boolean sFullLog;
    private static final android.os.IpcDataCache.QueryHandler<android.app.AppOpsManager.AppOpModeQuery, java.lang.Integer> sGetAppOpModeQuery = null;
    private static android.os.HandlerThread sHandlerThread;
    private static boolean sIgnoreAsyncNotedCallback;
    private static boolean sIsBatchedNoteOpCallScheduled;
    private static final java.lang.Object sLock = null;
    private static android.app.AppOpsManager.OnOpNotedCallback sMessageCollector;
    private static android.app.AppOpsManager.OnOpNotedCallback sOnOpNotedCallback;
    private static java.util.HashMap<java.lang.String, java.lang.Integer> sOpStrToOp;
    private static android.util.ArrayMap<android.app.AppOpsManager.NotedOp, java.lang.Integer> sPendingNotedOps;
    private static java.util.HashMap<java.lang.String, java.lang.Integer> sPermToOp;
    static com.android.internal.app.IAppOpsService sService;
    private static java.util.ArrayList<android.app.AsyncNotedAppOp> sUnforwardedOps;
    private final android.util.ArrayMap<android.app.AppOpsManager.OnOpActiveChangedListener, com.android.internal.app.IAppOpsActiveCallback> mActiveWatchers = null;
    final android.content.Context mContext = null;
    private final android.util.ArrayMap<android.app.AppOpsManager.OnOpChangedListener, com.android.internal.app.IAppOpsCallback> mModeWatchers = null;
    private final android.util.ArrayMap<android.app.AppOpsManager.OnOpNotedListener, com.android.internal.app.IAppOpsNotedCallback> mNotedWatchers = null;
    final com.android.internal.app.IAppOpsService mService = null;
    private final android.util.ArrayMap<android.app.AppOpsManager.OnOpStartedListener, com.android.internal.app.IAppOpsStartedCallback> mStartedWatchers = null;
    private android.permission.PermissionUsageHelper mUsageHelper;
    AppOpsManager(android.content.Context p0, com.android.internal.app.IAppOpsService p1) {}
    private boolean batchDuplicateNoteOps(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5, boolean p6, boolean p7) { return false; }
    private java.lang.String buildSecurityExceptionMsg(int p0, int p1, java.lang.String p2) { return null; }
    private int checkOpNoThrow(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4) { return 0; }
    private int checkOpRawNoThrow(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4) { return 0; }
    private static android.util.LongSparseArray<java.lang.Object> collectKeys(android.util.LongSparseLongArray p0, android.util.LongSparseArray<java.lang.Object> p1) { return null; }
    private void collectNoteOpCallsForValidation(int p0) {}
    private void collectNotedOpForSelf(android.app.SyncNotedAppOp p0) {}
    public static void collectNotedOpSync(android.app.SyncNotedAppOp p0) {}
    private static java.util.List<android.app.AppOpsManager.AttributedOpEntry> deduplicateDiscreteEvents(java.util.List<android.app.AppOpsManager.AttributedOpEntry> p0) { return null; }
    public static void disableAppOpModeCache() {}
    public static void disableCheckPackageCache() {}
    private static boolean equalsLongSparseLongArray(android.util.LongSparseLongArray p0, android.util.LongSparseLongArray p1) { return false; }
    public static int extractFlagsFromKey(long p0) { return 0; }
    public static int extractUidStateFromKey(long p0) { return 0; }
    public static void finishNotedAppOpsCollection() {}
    private void finishOp(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, int p5) {}
    public static java.lang.String flagsToString(int p0) { return null; }
    public static android.os.IBinder getClientId() { return null; }
    private static java.lang.String getComponentPackageNameFromString(java.lang.String p0) { return null; }
    public static final java.lang.String getFlagName(int p0) { return null; }
    private static java.lang.String getFormattedStackTrace() { return null; }
    private static android.app.AppOpsManager.NoteOpEvent getLastEvent(android.util.LongSparseArray<android.app.AppOpsManager.NoteOpEvent> p0, int p1, int p2, int p3) { return null; }
    private int getNotedOpCollectionMode(int p0, java.lang.String p1, int p2) { return 0; }
    public static int getNumOps() { return 0; }
    @android.annotation.SystemApi
    public static java.lang.String[] getOpStrs() { return null; }
    private static com.android.internal.app.IAppOpsService getService() { return null; }
    private static int getSystemAlertWindowDefault() { return 0; }
    @java.lang.Deprecated
    public static android.os.IBinder getToken(com.android.internal.app.IAppOpsService p0) { return null; }
    public static java.lang.String getUidStateName(int p0) { return null; }
    public static java.lang.String historicalModeToString(int p0) { return null; }
    public static void invalidateAppOpModeCache() {}
    public static void invalidateCheckPackageCache() {}
    private static boolean isAppOpModeCachingEnabled(int p0) { return false; }
    private static boolean isCollectingStackTraces() { return false; }
    public static boolean isListeningForOpNoted() { return false; }
    public static boolean isModeValid(int p0) { return false; }
    private boolean isNoteOpBatchingSupported() { return false; }
    private static boolean isPackagePreInstalled(android.content.Context p0, java.lang.String p1, int p2) { return false; }
    public static boolean isValidOp(int p0) { return false; }
    public static java.lang.String keyToString(long p0) { return null; }
    public static int leftCircularDistance(int p0, int p1, int p2) { return 0; }
    private static java.util.List<android.app.AppOpsManager.AttributedOpEntry> listForFlagsInStates(java.util.List<android.app.AppOpsManager.AttributedOpEntry> p0, int p1, int p2, int p3) { return null; }
    public static long makeKey(int p0, int p1) { return 0L; }
    private static android.app.AppOpsManager.AttributedOpEntry mergeAttributedOpEntries(java.util.List<android.app.AppOpsManager.AttributedOpEntry> p0) { return null; }
    public static java.lang.String modeToName(int p0) { return null; }
    private int noteOpNoThrow(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5) { return 0; }
    public static android.app.AppOpsManager.RestrictionBypass opAllowSystemBypassRestriction(int p0) { return null; }
    public static boolean opAllowsReset(int p0) { return false; }
    public static boolean opIsPackageAppOpPermission(int p0) { return false; }
    public static boolean opIsRuntimePermission(int p0) { return false; }
    public static boolean opIsUidAppOpPermission(int p0) { return false; }
    public static boolean opRestrictsRead(int p0) { return false; }
    public static int opToDefaultMode(int p0) { return 0; }
    @android.annotation.SystemApi
    public static int opToDefaultMode(java.lang.String p0) { return 0; }
    public static java.lang.String opToName(int p0) { return null; }
    public static int opToPccMode(int p0) { return 0; }
    public static java.lang.String opToPermission(int p0) { return null; }
    @android.annotation.SystemApi
    public static java.lang.String opToPermission(java.lang.String p0) { return null; }
    public static java.lang.String opToPublicName(int p0) { return null; }
    public static java.lang.String opToRestriction(int p0) { return null; }
    public static int opToSwitch(int p0) { return 0; }
    public static int parseHistoricalMode(java.lang.String p0) { return 0; }
    public static android.app.AppOpsManager.PausedNotedAppOpsCollection pauseNotedAppOpsCollection() { return null; }
    public static java.lang.String permissionToOp(java.lang.String p0) { return null; }
    public static int permissionToOpCode(java.lang.String p0) { return 0; }
    public static void prefixParcelWithAppOpsIfNeeded(android.os.Parcel p0) {}
    public static void readAndLogNotedAppops(android.os.Parcel p0) {}
    private static java.util.List<android.app.AppOpsManager.AttributedOpEntry> readDiscreteAccessArrayFromParcel(android.os.Parcel p0) { return null; }
    private static android.util.LongSparseLongArray readLongSparseLongArrayFromParcel(android.os.Parcel p0) { return null; }
    public static int resolveFirstUnrestrictedUidState(int p0) { return 0; }
    public static int resolveLastRestrictedUidState(int p0) { return 0; }
    public static java.lang.String resolvePackageName(int p0, java.lang.String p1) { return null; }
    public static void resumeNotedAppOpsCollection(android.app.AppOpsManager.PausedNotedAppOpsCollection p0) {}
    public static boolean shouldForceCollectNoteForOp(int p0) { return false; }
    public static void startNotedAppOpsCollection(int p0) {}
    private int startOpNoThrow(android.os.IBinder p0, int p1, int p2, java.lang.String p3, boolean p4, java.lang.String p5, int p6, java.lang.String p7, int p8, int p9) { return 0; }
    public static int strDebugOpToOp(java.lang.String p0) { return 0; }
    public static int strOpToOp(java.lang.String p0) { return 0; }
    private static long sumForFlagsInStates(android.util.LongSparseLongArray p0, int p1, int p2, int p3) { return 0L; }
    public static java.lang.String toReceiverId(android.app.PendingIntent p0) { return null; }
    public static java.lang.String toReceiverId(java.lang.Object p0) { return null; }
    public static java.lang.String uidStateToString(int p0) { return null; }
    private static void writeDiscreteAccessArrayToParcel(java.util.List<android.app.AppOpsManager.AttributedOpEntry> p0, android.os.Parcel p1, int p2) {}
    private static void writeLongSparseLongArrayToParcel(android.util.LongSparseLongArray p0, android.os.Parcel p1) {}
    public void addHistoricalOps(android.app.AppOpsManager.HistoricalOps p0) {}
    public int checkAudioOp(int p0, int p1, int p2, java.lang.String p3) { return 0; }
    public int checkAudioOpNoThrow(int p0, int p1, int p2, java.lang.String p3) { return 0; }
    public int checkOp(int p0, int p1, java.lang.String p2) { return 0; }
    public int checkOp(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int checkOp(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) { return 0; }
    public int checkOpNoThrow(int p0, int p1, java.lang.String p2) { return 0; }
    public int checkOpNoThrow(int p0, android.content.AttributionSource p1) { return 0; }
    public int checkOpNoThrow(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int checkOpNoThrow(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) { return 0; }
    public int checkOpRawNoThrow(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) { return 0; }
    @java.lang.Deprecated
    public void checkPackage(int p0, java.lang.String p1) {}
    public void clearHistory() {}
    @android.annotation.SystemApi
    public android.app.RuntimeAppOpAccessMessage collectRuntimeAppOpAccessMessage() { return null; }
    @java.lang.Deprecated
    public void finishOp(int p0) {}
    public void finishOp(int p0, int p1, java.lang.String p2) {}
    public void finishOp(int p0, int p1, java.lang.String p2, java.lang.String p3) {}
    public void finishOp(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4) {}
    public void finishOp(android.os.IBinder p0, int p1, android.content.AttributionSource p2) {}
    public void finishOp(java.lang.String p0, int p1, java.lang.String p2) {}
    public void finishOp(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) {}
    public void finishProxyOp(android.os.IBinder p0, java.lang.String p1, android.content.AttributionSource p2, boolean p3) {}
    public void finishProxyOp(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) {}
    @android.annotation.SystemApi
    public void getHistoricalOps(android.app.AppOpsManager.HistoricalOpsRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.app.AppOpsManager.HistoricalOps> p2) {}
    public void getHistoricalOpsFromDiskRaw(android.app.AppOpsManager.HistoricalOpsRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.app.AppOpsManager.HistoricalOps> p2) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int p0, java.lang.String p1, int[] p2) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int p0, java.lang.String p1, java.lang.String... p2) { return null; }
    public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(java.lang.String[] p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(java.lang.String[] p0, java.lang.String p1) { return null; }
    public java.util.List<java.lang.String> getPackagesWithNonDefaultUidMode(int p0, int p1) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.permission.PermissionGroupUsage> getPermissionGroupUsageForPrivacyIndicator(boolean p0) { return null; }
    public boolean isOpActive(java.lang.String p0, int p1, java.lang.String p2) { return false; }
    public boolean isOperationActive(int p0, int p1, java.lang.String p2) { return false; }
    public boolean isProxying(int p0, java.lang.String p1, int p2, java.lang.String p3) { return false; }
    @java.lang.Deprecated
    public int noteOp(int p0) { return 0; }
    @java.lang.Deprecated
    public int noteOp(int p0, int p1, java.lang.String p2) { return 0; }
    public int noteOp(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return 0; }
    @java.lang.Deprecated
    public int noteOp(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int noteOp(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return 0; }
    @java.lang.Deprecated
    public int noteOpNoThrow(int p0, int p1, java.lang.String p2) { return 0; }
    public int noteOpNoThrow(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return 0; }
    public int noteOpNoThrow(int p0, android.content.AttributionSource p1, java.lang.String p2) { return 0; }
    @java.lang.Deprecated
    public int noteOpNoThrow(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int noteOpNoThrow(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return 0; }
    public int noteProxyOp(int p0, android.content.AttributionSource p1, java.lang.String p2, boolean p3) { return 0; }
    @java.lang.Deprecated
    public int noteProxyOp(int p0, java.lang.String p1) { return 0; }
    public int noteProxyOp(int p0, java.lang.String p1, int p2, java.lang.String p3, java.lang.String p4) { return 0; }
    @java.lang.Deprecated
    public int noteProxyOp(java.lang.String p0, java.lang.String p1) { return 0; }
    public int noteProxyOp(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, java.lang.String p4) { return 0; }
    public int noteProxyOpNoThrow(int p0, android.content.AttributionSource p1, java.lang.String p2, boolean p3) { return 0; }
    @java.lang.Deprecated
    public int noteProxyOpNoThrow(java.lang.String p0, java.lang.String p1) { return 0; }
    @java.lang.Deprecated
    public int noteProxyOpNoThrow(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    public int noteProxyOpNoThrow(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, java.lang.String p4) { return 0; }
    public void offsetHistory(long p0) {}
    public void rebootHistory(long p0) {}
    public void reloadNonHistoricalState() {}
    public void resetAllModes() {}
    public void resetHistoryParameters() {}
    public void resetPackageOpsNoHistory(java.lang.String p0) {}
    public void setAudioRestriction(int p0, int[] p1, int p2, java.lang.String[] p3) {}
    public void setHistoryParameters(int p0, long p1, int p2) {}
    public void setMode(int p0, int p1, java.lang.String p2, int p3) {}
    @android.annotation.SystemApi
    public void setMode(java.lang.String p0, int p1, java.lang.String p2, int p3) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void setNotedAppOpsCollector(android.app.AppOpsManager.AppOpsCollector p0) {}
    public void setOnOpNotedCallback(java.util.concurrent.Executor p0, android.app.AppOpsManager.OnOpNotedCallback p1) {}
    public void setOnOpNotedCallback(java.util.concurrent.Executor p0, android.app.AppOpsManager.OnOpNotedCallback p1, int p2) {}
    @java.lang.Deprecated
    public void setRestriction(int p0, int p1, int p2, java.lang.String[] p3) {}
    public void setUidMode(int p0, int p1, int p2) {}
    @android.annotation.SystemApi
    public void setUidMode(java.lang.String p0, int p1, int p2) {}
    public void setUserRestriction(int p0, boolean p1, android.os.IBinder p2) {}
    public void setUserRestriction(int p0, boolean p1, android.os.IBinder p2, android.os.PackageTagsList p3) {}
    public void setUserRestrictionForUser(int p0, boolean p1, android.os.IBinder p2, android.os.PackageTagsList p3, int p4) {}
    @java.lang.Deprecated
    public int startOp(int p0) { return 0; }
    @java.lang.Deprecated
    public int startOp(int p0, int p1, java.lang.String p2) { return 0; }
    @java.lang.Deprecated
    public int startOp(int p0, int p1, java.lang.String p2, boolean p3) { return 0; }
    public int startOp(int p0, int p1, java.lang.String p2, boolean p3, java.lang.String p4, java.lang.String p5) { return 0; }
    @java.lang.Deprecated
    public int startOp(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int startOp(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return 0; }
    @java.lang.Deprecated
    public int startOpNoThrow(int p0, int p1, java.lang.String p2) { return 0; }
    @java.lang.Deprecated
    public int startOpNoThrow(int p0, int p1, java.lang.String p2, boolean p3) { return 0; }
    public int startOpNoThrow(int p0, int p1, java.lang.String p2, boolean p3, java.lang.String p4, java.lang.String p5) { return 0; }
    public int startOpNoThrow(android.os.IBinder p0, int p1, int p2, java.lang.String p3, boolean p4, java.lang.String p5, java.lang.String p6) { return 0; }
    public int startOpNoThrow(android.os.IBinder p0, int p1, int p2, java.lang.String p3, boolean p4, java.lang.String p5, java.lang.String p6, int p7, int p8) { return 0; }
    public int startOpNoThrow(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3, java.lang.String p4, int p5, int p6) { return 0; }
    @java.lang.Deprecated
    public int startOpNoThrow(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int startOpNoThrow(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return 0; }
    public int startProxyOp(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return 0; }
    public int startProxyOp(java.lang.String p0, android.content.AttributionSource p1, java.lang.String p2, boolean p3) { return 0; }
    public int startProxyOpNoThrow(int p0, android.content.AttributionSource p1, java.lang.String p2, boolean p3) { return 0; }
    public int startProxyOpNoThrow(android.os.IBinder p0, int p1, android.content.AttributionSource p2, java.lang.String p3, boolean p4, int p5, int p6, int p7) { return 0; }
    public int startProxyOpNoThrow(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return 0; }
    @java.lang.Deprecated
    public void startWatchingActive(int[] p0, android.app.AppOpsManager.OnOpActiveChangedListener p1) {}
    public void startWatchingActive(java.lang.String[] p0, java.util.concurrent.Executor p1, android.app.AppOpsManager.OnOpActiveChangedListener p2) {}
    public void startWatchingMode(int p0, java.lang.String p1, int p2, android.app.AppOpsManager.OnOpChangedListener p3) {}
    public void startWatchingMode(int p0, java.lang.String p1, android.app.AppOpsManager.OnOpChangedListener p2) {}
    public void startWatchingMode(java.lang.String p0, java.lang.String p1, int p2, android.app.AppOpsManager.OnOpChangedListener p3) {}
    public void startWatchingMode(java.lang.String p0, java.lang.String p1, android.app.AppOpsManager.OnOpChangedListener p2) {}
    public void startWatchingNoted(int[] p0, android.app.AppOpsManager.OnOpNotedListener p1) {}
    public void startWatchingNoted(int[] p0, java.util.concurrent.Executor p1, android.app.AppOpsManager.OnOpNotedListener p2) {}
    @android.annotation.SystemApi
    public void startWatchingNoted(java.lang.String[] p0, android.app.AppOpsManager.OnOpNotedListener p1) {}
    @android.annotation.SystemApi
    public void startWatchingNoted(java.lang.String[] p0, java.util.concurrent.Executor p1, android.app.AppOpsManager.OnOpNotedListener p2) {}
    public void startWatchingStarted(int[] p0, android.app.AppOpsManager.OnOpStartedListener p1) {}
    public void stopWatchingActive(android.app.AppOpsManager.OnOpActiveChangedListener p0) {}
    public void stopWatchingMode(android.app.AppOpsManager.OnOpChangedListener p0) {}
    @android.annotation.SystemApi
    public void stopWatchingNoted(android.app.AppOpsManager.OnOpNotedListener p0) {}
    public void stopWatchingStarted(android.app.AppOpsManager.OnOpStartedListener p0) {}
    @java.lang.Deprecated
    public int unsafeCheckOp(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    @java.lang.Deprecated
    public int unsafeCheckOpNoThrow(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    @java.lang.Deprecated
    public int unsafeCheckOpRaw(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int unsafeCheckOpRawNoThrow(int p0, int p1, java.lang.String p2) { return 0; }
    public int unsafeCheckOpRawNoThrow(int p0, android.content.AttributionSource p1) { return 0; }
    @java.lang.Deprecated
    public int unsafeCheckOpRawNoThrow(java.lang.String p0, int p1, java.lang.String p2) { return 0; }
    public int unsafeCheckOpRawNoThrow(java.lang.String p0, android.content.AttributionSource p1) { return 0; }

    private static final class AppOpModeQuery {
        final java.lang.String attributionTag = null;
        final java.lang.String methodName = null;
        final int op = 0;
        final java.lang.String packageName = null;
        final int uid = 0;
        final int virtualDeviceId = 0;
        AppOpModeQuery(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4, java.lang.String p5) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static abstract class AppOpsCollector extends android.app.AppOpsManager.OnOpNotedCallback {
        public AppOpsCollector() { super(); }
        public java.util.concurrent.Executor getAsyncNotedExecutor() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppOpString {
    }

    @android.annotation.SystemApi
    public static final class AttributedHistoricalOps implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.AttributedHistoricalOps> CREATOR = null;
        private android.util.ArrayMap<java.lang.String, android.app.AppOpsManager.HistoricalOp> mHistoricalOps;
        private final java.lang.String mTag = null;
        private AttributedHistoricalOps(android.app.AppOpsManager.AttributedHistoricalOps p0) {}
        AttributedHistoricalOps(android.os.Parcel p0) {}
        public AttributedHistoricalOps(java.lang.String p0) {}
        public AttributedHistoricalOps(java.lang.String p0, android.util.ArrayMap<java.lang.String, android.app.AppOpsManager.HistoricalOp> p1) {}
        private void accept(android.app.AppOpsManager.HistoricalOpsVisitor p0) {}
        private void addDiscreteAccess(int p0, int p1, int p2, long p3, long p4, android.app.AppOpsManager.OpEventProxyInfo p5) {}
        private void filter(java.lang.String[] p0, int p1, int p2, double p3, long p4, long p5) {}
        private android.app.AppOpsManager.HistoricalOp getOrCreateHistoricalOp(int p0) { return null; }
        private void increaseAccessCount(int p0, int p1, int p2, long p3) {}
        private void increaseAccessDuration(int p0, int p1, int p2, long p3) {}
        private void increaseRejectCount(int p0, int p1, int p2, long p3) {}
        private boolean isEmpty() { return false; }
        private void merge(android.app.AppOpsManager.AttributedHistoricalOps p0) {}
        private android.app.AppOpsManager.AttributedHistoricalOps splice(double p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.app.AppOpsManager.HistoricalOp getOp(java.lang.String p0) { return null; }
        public android.app.AppOpsManager.HistoricalOp getOpAt(int p0) { return null; }
        public int getOpCount() { return 0; }
        public java.lang.String getTag() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @android.annotation.SystemApi
    public static final class AttributedOpEntry implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.AttributedOpEntry> CREATOR = null;
        static com.android.internal.util.Parcelling<android.util.LongSparseArray<android.app.AppOpsManager.NoteOpEvent>> sParcellingForAccessEvents;
        static com.android.internal.util.Parcelling<android.util.LongSparseArray<android.app.AppOpsManager.NoteOpEvent>> sParcellingForRejectEvents;
        private final android.util.LongSparseArray<android.app.AppOpsManager.NoteOpEvent> mAccessEvents = null;
        private final int mOp = 0;
        private final android.util.LongSparseArray<android.app.AppOpsManager.NoteOpEvent> mRejectEvents = null;
        private final boolean mRunning = false;
        public AttributedOpEntry(int p0, boolean p1, android.util.LongSparseArray<android.app.AppOpsManager.NoteOpEvent> p2, android.util.LongSparseArray<android.app.AppOpsManager.NoteOpEvent> p3) {}
        private AttributedOpEntry(android.app.AppOpsManager.AttributedOpEntry p0) {}
        AttributedOpEntry(android.os.Parcel p0) {}
        private android.app.AppOpsManager.NoteOpEvent getLastAccessEvent(int p0, int p1, int p2) { return null; }
        private android.app.AppOpsManager.NoteOpEvent getLastRejectEvent(int p0, int p1, int p2) { return null; }
        public android.util.ArraySet<java.lang.Long> collectKeys() { return null; }
        public int describeContents() { return 0; }
        public long getLastAccessBackgroundTime(int p0) { return 0L; }
        public long getLastAccessForegroundTime(int p0) { return 0L; }
        public long getLastAccessTime(int p0) { return 0L; }
        public long getLastAccessTime(int p0, int p1, int p2) { return 0L; }
        public long getLastBackgroundDuration(int p0) { return 0L; }
        public android.app.AppOpsManager.OpEventProxyInfo getLastBackgroundProxyInfo(int p0) { return null; }
        public long getLastDuration(int p0) { return 0L; }
        public long getLastDuration(int p0, int p1, int p2) { return 0L; }
        public long getLastForegroundDuration(int p0) { return 0L; }
        public android.app.AppOpsManager.OpEventProxyInfo getLastForegroundProxyInfo(int p0) { return null; }
        public android.app.AppOpsManager.OpEventProxyInfo getLastProxyInfo(int p0) { return null; }
        public android.app.AppOpsManager.OpEventProxyInfo getLastProxyInfo(int p0, int p1, int p2) { return null; }
        public long getLastRejectBackgroundTime(int p0) { return 0L; }
        public long getLastRejectForegroundTime(int p0) { return 0L; }
        public long getLastRejectTime(int p0) { return 0L; }
        public long getLastRejectTime(int p0, int p1, int p2) { return 0L; }
        int getOp() { return 0; }
        java.lang.String getOpName() { return null; }
        public boolean isRunning() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        private static class LongSparseArrayParceling implements com.android.internal.util.Parcelling<android.util.LongSparseArray<android.app.AppOpsManager.NoteOpEvent>> {
            private LongSparseArrayParceling() {}
            public void parcel(android.util.LongSparseArray<android.app.AppOpsManager.NoteOpEvent> p0, android.os.Parcel p1, int p2) {}
            public android.util.LongSparseArray<android.app.AppOpsManager.NoteOpEvent> unparcel(android.os.Parcel p0) { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttributionFlags {
    }

    private static final class CheckPackageQuery {
        private final java.lang.String packageName = null;
        private final int uid = 0;
        private CheckPackageQuery(int p0, java.lang.String p1) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public java.lang.String packageName() { return null; }
        public java.lang.String toString() { return null; }
        public int uid() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD})
    public static @interface DataBucketKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HistoricalMode {
    }

    @android.annotation.SystemApi
    public static final class HistoricalOp implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.HistoricalOp> CREATOR = null;
        private android.util.LongSparseLongArray mAccessCount;
        private android.util.LongSparseLongArray mAccessDuration;
        private java.util.List<android.app.AppOpsManager.AttributedOpEntry> mDiscreteAccesses;
        private final int mOp = 0;
        private android.util.LongSparseLongArray mRejectCount;
        public HistoricalOp(int p0) {}
        private HistoricalOp(android.app.AppOpsManager.HistoricalOp p0) {}
        private HistoricalOp(android.os.Parcel p0) {}
        private void accept(android.app.AppOpsManager.HistoricalOpsVisitor p0) {}
        private void addDiscreteAccess(int p0, int p1, long p2, long p3, android.app.AppOpsManager.OpEventProxyInfo p4) {}
        private void filter(int p0, double p1, long p2, long p3) {}
        private android.util.LongSparseLongArray getOrCreateAccessCount() { return null; }
        private android.util.LongSparseLongArray getOrCreateAccessDuration() { return null; }
        private java.util.List<android.app.AppOpsManager.AttributedOpEntry> getOrCreateDiscreteAccesses() { return null; }
        private android.util.LongSparseLongArray getOrCreateRejectCount() { return null; }
        private boolean hasData(android.util.LongSparseLongArray p0) { return false; }
        private void increaseAccessCount(int p0, int p1, long p2) {}
        private void increaseAccessDuration(int p0, int p1, long p2) {}
        private void increaseCount(android.util.LongSparseLongArray p0, int p1, int p2, long p3) {}
        private void increaseRejectCount(int p0, int p1, long p2) {}
        private boolean isEmpty() { return false; }
        private void merge(android.app.AppOpsManager.HistoricalOp p0) {}
        private static void merge(java.util.function.Supplier<android.util.LongSparseLongArray> p0, android.util.LongSparseLongArray p1) {}
        private static void scale(android.util.LongSparseLongArray p0, double p1) {}
        private android.app.AppOpsManager.HistoricalOp splice(double p0) { return null; }
        private static void splice(android.util.LongSparseLongArray p0, java.util.function.Supplier<android.util.LongSparseLongArray> p1, double p2) {}
        public android.util.LongSparseArray<java.lang.Object> collectKeys() { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public long getAccessCount(int p0, int p1, int p2) { return 0L; }
        public long getAccessDuration(int p0, int p1, int p2) { return 0L; }
        public long getBackgroundAccessCount(int p0) { return 0L; }
        public long getBackgroundAccessDuration(int p0) { return 0L; }
        public java.util.List<android.app.AppOpsManager.AttributedOpEntry> getBackgroundDiscreteAccesses(int p0) { return null; }
        public long getBackgroundRejectCount(int p0) { return 0L; }
        public android.app.AppOpsManager.AttributedOpEntry getDiscreteAccessAt(int p0) { return null; }
        public int getDiscreteAccessCount() { return 0; }
        public java.util.List<android.app.AppOpsManager.AttributedOpEntry> getDiscreteAccesses(int p0, int p1, int p2) { return null; }
        public long getForegroundAccessCount(int p0) { return 0L; }
        public long getForegroundAccessDuration(int p0) { return 0L; }
        public java.util.List<android.app.AppOpsManager.AttributedOpEntry> getForegroundDiscreteAccesses(int p0) { return null; }
        public long getForegroundRejectCount(int p0) { return 0L; }
        public int getOpCode() { return 0; }
        public java.lang.String getOpName() { return null; }
        public long getRejectCount(int p0, int p1, int p2) { return 0L; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @android.annotation.SystemApi
    public static final class HistoricalOps implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.HistoricalOps> CREATOR = null;
        private long mBeginTimeMillis;
        private long mEndTimeMillis;
        private android.util.SparseArray<android.app.AppOpsManager.HistoricalUidOps> mHistoricalUidOps;
        public HistoricalOps(long p0, long p1) {}
        public HistoricalOps(android.app.AppOpsManager.HistoricalOps p0) {}
        private HistoricalOps(android.os.Parcel p0) {}
        private android.app.AppOpsManager.HistoricalUidOps getOrCreateHistoricalUidOps(int p0) { return null; }
        public static double round(double p0) { return 0.0; }
        private android.app.AppOpsManager.HistoricalOps splice(double p0, boolean p1) { return null; }
        public void accept(android.app.AppOpsManager.HistoricalOpsVisitor p0) {}
        public void addDiscreteAccess(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, long p6, long p7) {}
        public void addDiscreteAccess(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, long p6, long p7, android.app.AppOpsManager.OpEventProxyInfo p8) {}
        public void clearHistory(int p0, java.lang.String p1) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public void filter(int p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, int p4, int p5, long p6, long p7) {}
        public long getBeginTimeMillis() { return 0L; }
        public long getDurationMillis() { return 0L; }
        public long getEndTimeMillis() { return 0L; }
        public int getUidCount() { return 0; }
        public android.app.AppOpsManager.HistoricalUidOps getUidOps(int p0) { return null; }
        public android.app.AppOpsManager.HistoricalUidOps getUidOpsAt(int p0) { return null; }
        public int hashCode() { return 0; }
        public void increaseAccessCount(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, long p6) {}
        public void increaseAccessDuration(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, long p6) {}
        public void increaseRejectCount(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, long p6) {}
        public boolean isEmpty() { return false; }
        public void merge(android.app.AppOpsManager.HistoricalOps p0) {}
        public void offsetBeginAndEndTime(long p0) {}
        public void setBeginAndEndTime(long p0, long p1) {}
        public void setBeginTime(long p0) {}
        public void setEndTime(long p0) {}
        public android.app.AppOpsManager.HistoricalOps spliceFromBeginning(double p0) { return null; }
        public android.app.AppOpsManager.HistoricalOps spliceFromEnd(double p0) { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @android.annotation.SystemApi
    public static final class HistoricalOpsRequest {
        private final java.lang.String mAttributionTag = null;
        private final long mBeginTimeMillis = 0L;
        private final long mEndTimeMillis = 0L;
        private final int mFilter = 0;
        private final int mFlags = 0;
        private final int mHistoryFlags = 0;
        private final java.util.List<java.lang.String> mOpNames = null;
        private final java.lang.String mPackageName = null;
        private final int mUid = 0;
        private HistoricalOpsRequest(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, int p5, long p6, long p7, int p8) {}

        @android.annotation.SystemApi
        public static final class Builder {
            private java.lang.String mAttributionTag;
            private final long mBeginTimeMillis = 0L;
            private final long mEndTimeMillis = 0L;
            private int mFilter;
            private int mFlags;
            private int mHistoryFlags;
            private java.util.List<java.lang.String> mOpNames;
            private java.lang.String mPackageName;
            private int mUid;
            public Builder(long p0, long p1) {}
            public android.app.AppOpsManager.HistoricalOpsRequest build() { return null; }
            public android.app.AppOpsManager.HistoricalOpsRequest.Builder setAttributionTag(java.lang.String p0) { return null; }
            public android.app.AppOpsManager.HistoricalOpsRequest.Builder setFlags(int p0) { return null; }
            public android.app.AppOpsManager.HistoricalOpsRequest.Builder setHistoryFlags(int p0) { return null; }
            public android.app.AppOpsManager.HistoricalOpsRequest.Builder setOpNames(java.util.List<java.lang.String> p0) { return null; }
            public android.app.AppOpsManager.HistoricalOpsRequest.Builder setPackageName(java.lang.String p0) { return null; }
            public android.app.AppOpsManager.HistoricalOpsRequest.Builder setUid(int p0) { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HistoricalOpsRequestFilter {
    }

    public static interface HistoricalOpsVisitor {
        public void visitHistoricalAttributionOps(android.app.AppOpsManager.AttributedHistoricalOps p0);
        public void visitHistoricalOp(android.app.AppOpsManager.HistoricalOp p0);
        public void visitHistoricalOps(android.app.AppOpsManager.HistoricalOps p0);
        public void visitHistoricalPackageOps(android.app.AppOpsManager.HistoricalPackageOps p0);
        public void visitHistoricalUidOps(android.app.AppOpsManager.HistoricalUidOps p0);
    }

    @android.annotation.SystemApi
    public static final class HistoricalPackageOps implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.HistoricalPackageOps> CREATOR = null;
        private android.util.ArrayMap<java.lang.String, android.app.AppOpsManager.AttributedHistoricalOps> mAttributedHistoricalOps;
        private final java.lang.String mPackageName = null;
        private HistoricalPackageOps(android.app.AppOpsManager.HistoricalPackageOps p0) {}
        private HistoricalPackageOps(android.os.Parcel p0) {}
        public HistoricalPackageOps(java.lang.String p0) {}
        private void accept(android.app.AppOpsManager.HistoricalOpsVisitor p0) {}
        private void addDiscreteAccess(int p0, java.lang.String p1, int p2, int p3, long p4, long p5, android.app.AppOpsManager.OpEventProxyInfo p6) {}
        private void filter(java.lang.String p0, java.lang.String[] p1, int p2, int p3, double p4, long p5, long p6) {}
        private android.app.AppOpsManager.AttributedHistoricalOps getOrCreateAttributedHistoricalOps(java.lang.String p0) { return null; }
        private void increaseAccessCount(int p0, java.lang.String p1, int p2, int p3, long p4) {}
        private void increaseAccessDuration(int p0, java.lang.String p1, int p2, int p3, long p4) {}
        private void increaseRejectCount(int p0, java.lang.String p1, int p2, int p3, long p4) {}
        private boolean isEmpty() { return false; }
        private void merge(android.app.AppOpsManager.HistoricalPackageOps p0) {}
        private android.app.AppOpsManager.HistoricalPackageOps splice(double p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.app.AppOpsManager.AttributedHistoricalOps getAttributedOps(java.lang.String p0) { return null; }
        public android.app.AppOpsManager.AttributedHistoricalOps getAttributedOpsAt(int p0) { return null; }
        public int getAttributedOpsCount() { return 0; }
        public android.app.AppOpsManager.HistoricalOp getOp(java.lang.String p0) { return null; }
        public android.app.AppOpsManager.HistoricalOp getOpAt(int p0) { return null; }
        public int getOpCount() { return 0; }
        public java.lang.String getPackageName() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @android.annotation.SystemApi
    public static final class HistoricalUidOps implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.HistoricalUidOps> CREATOR = null;
        private android.util.ArrayMap<java.lang.String, android.app.AppOpsManager.HistoricalPackageOps> mHistoricalPackageOps;
        private final int mUid = 0;
        public HistoricalUidOps(int p0) {}
        private HistoricalUidOps(android.app.AppOpsManager.HistoricalUidOps p0) {}
        private HistoricalUidOps(android.os.Parcel p0) {}
        private void accept(android.app.AppOpsManager.HistoricalOpsVisitor p0) {}
        private void addDiscreteAccess(int p0, java.lang.String p1, java.lang.String p2, int p3, int p4, long p5, long p6, android.app.AppOpsManager.OpEventProxyInfo p7) {}
        private void clearHistory(java.lang.String p0) {}
        private void filter(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, int p3, int p4, double p5, long p6, long p7) {}
        private android.app.AppOpsManager.HistoricalPackageOps getOrCreateHistoricalPackageOps(java.lang.String p0) { return null; }
        private void increaseAccessCount(int p0, java.lang.String p1, java.lang.String p2, int p3, int p4, long p5) {}
        private void increaseAccessDuration(int p0, java.lang.String p1, java.lang.String p2, int p3, int p4, long p5) {}
        private void increaseRejectCount(int p0, java.lang.String p1, java.lang.String p2, int p3, int p4, long p5) {}
        private boolean isEmpty() { return false; }
        private void merge(android.app.AppOpsManager.HistoricalUidOps p0) {}
        private android.app.AppOpsManager.HistoricalUidOps splice(double p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getPackageCount() { return 0; }
        public android.app.AppOpsManager.HistoricalPackageOps getPackageOps(java.lang.String p0) { return null; }
        public android.app.AppOpsManager.HistoricalPackageOps getPackageOpsAt(int p0) { return null; }
        public int getUid() { return 0; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Mode {
    }

    public static final class NotedOp implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.NotedOp> CREATOR = null;
        private final java.lang.String mAttributionTag = null;
        private final java.lang.String mMessage = null;
        private final int mOp = 0;
        private final java.lang.String mPackageName = null;
        private final boolean mShouldCollectAsyncNotedOp = false;
        private final boolean mShouldCollectMessage = false;
        private final int mUid = 0;
        private final int mVirtualDeviceId = 0;
        public NotedOp(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5, boolean p6, boolean p7) {}
        NotedOp(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getAttributionTag() { return null; }
        public java.lang.String getMessage() { return null; }
        public int getOp() { return 0; }
        public java.lang.String getPackageName() { return null; }
        public boolean getShouldCollectAsyncNotedOp() { return false; }
        public boolean getShouldCollectMessage() { return false; }
        public int getUid() { return 0; }
        public int getVirtualDeviceId() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface NotedOpCollectionMode {
    }

    public static final class NoteOpEvent implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.NoteOpEvent> CREATOR = null;
        private long mDuration;
        private long mNoteTime;
        private android.app.AppOpsManager.OpEventProxyInfo mProxy;
        public NoteOpEvent(long p0, long p1, android.app.AppOpsManager.OpEventProxyInfo p2) {}
        public NoteOpEvent(android.app.AppOpsManager.NoteOpEvent p0) {}
        NoteOpEvent(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public long getDuration() { return 0L; }
        public long getNoteTime() { return 0L; }
        public android.app.AppOpsManager.OpEventProxyInfo getProxy() { return null; }
        public void reinit(long p0, long p1, android.app.AppOpsManager.OpEventProxyInfo p2, android.util.Pools.Pool<android.app.AppOpsManager.OpEventProxyInfo> p3) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static interface OnOpActiveChangedInternalListener extends android.app.AppOpsManager.OnOpActiveChangedListener {
        default public void onOpActiveChanged(int p0, int p1, java.lang.String p2, int p3, boolean p4) {}
        default public void onOpActiveChanged(int p0, int p1, java.lang.String p2, boolean p3) {}
        default public void onOpActiveChanged(java.lang.String p0, int p1, java.lang.String p2, boolean p3) {}
    }

    public static interface OnOpActiveChangedListener {
        default public void onOpActiveChanged(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, int p6, int p7) {}
        default public void onOpActiveChanged(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, int p5, int p6) {}
        public void onOpActiveChanged(java.lang.String p0, int p1, java.lang.String p2, boolean p3);
    }

    public static class OnOpChangedInternalListener implements android.app.AppOpsManager.OnOpChangedListener {
        public OnOpChangedInternalListener() {}
        public void onOpChanged(int p0, java.lang.String p1) {}
        public void onOpChanged(int p0, java.lang.String p1, java.lang.String p2) {}
        public void onOpChanged(java.lang.String p0, java.lang.String p1) {}
    }

    public static interface OnOpChangedListener {
        public void onOpChanged(java.lang.String p0, java.lang.String p1);
        default public void onOpChanged(java.lang.String p0, java.lang.String p1, int p2) {}
        default public void onOpChanged(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) {}
    }

    public static abstract class OnOpNotedCallback {
        private final com.android.internal.app.IAppOpsAsyncNotedCallback mAsyncCb = null;
        private java.util.concurrent.Executor mAsyncExecutor;
        public OnOpNotedCallback() {}
        protected java.util.concurrent.Executor getAsyncNotedExecutor() { return null; }
        public abstract void onAsyncNoted(android.app.AsyncNotedAppOp p0);
        public abstract void onNoted(android.app.SyncNotedAppOp p0);
        public abstract void onSelfNoted(android.app.SyncNotedAppOp p0);
    }

    public static interface OnOpNotedInternalListener extends android.app.AppOpsManager.OnOpNotedListener {
        public void onOpNoted(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5);
        default public void onOpNoted(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5) {}
    }

    @android.annotation.SystemApi
    public static interface OnOpNotedListener {
        public void onOpNoted(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5);
        default public void onOpNoted(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6) {}
    }

    public static interface OnOpStartedListener {
        public static final int START_TYPE_FAILED = 0;
        public static final int START_TYPE_RESUMED = 2;
        public static final int START_TYPE_STARTED = 1;
        public void onOpStarted(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5);
        default public void onOpStarted(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6, int p7, int p8) {}
        default public void onOpStarted(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6, int p7, int p8, int p9) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface StartedType {
        }
    }

    @android.annotation.SystemApi
    public static final class OpEntry implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.OpEntry> CREATOR = null;
        private final java.util.Map<java.lang.String, android.app.AppOpsManager.AttributedOpEntry> mAttributedOpEntries = null;
        private final int mMode = 0;
        private final int mOp = 0;
        public OpEntry(int p0, int p1, java.util.Map<java.lang.String, android.app.AppOpsManager.AttributedOpEntry> p2) {}
        OpEntry(android.os.Parcel p0) {}
        private android.app.AppOpsManager.NoteOpEvent getLastAccessEvent(int p0, int p1, int p2) { return null; }
        private android.app.AppOpsManager.NoteOpEvent getLastRejectEvent(int p0, int p1, int p2) { return null; }
        public int describeContents() { return 0; }
        public java.util.Map<java.lang.String, android.app.AppOpsManager.AttributedOpEntry> getAttributedOpEntries() { return null; }
        @java.lang.Deprecated
        public long getDuration() { return 0L; }
        public long getLastAccessBackgroundTime(int p0) { return 0L; }
        public long getLastAccessForegroundTime(int p0) { return 0L; }
        public long getLastAccessTime(int p0) { return 0L; }
        public long getLastAccessTime(int p0, int p1, int p2) { return 0L; }
        public long getLastBackgroundDuration(int p0) { return 0L; }
        public android.app.AppOpsManager.OpEventProxyInfo getLastBackgroundProxyInfo(int p0) { return null; }
        public long getLastDuration(int p0) { return 0L; }
        public long getLastDuration(int p0, int p1, int p2) { return 0L; }
        public long getLastForegroundDuration(int p0) { return 0L; }
        public android.app.AppOpsManager.OpEventProxyInfo getLastForegroundProxyInfo(int p0) { return null; }
        public android.app.AppOpsManager.OpEventProxyInfo getLastProxyInfo(int p0) { return null; }
        public android.app.AppOpsManager.OpEventProxyInfo getLastProxyInfo(int p0, int p1, int p2) { return null; }
        public long getLastRejectBackgroundTime(int p0) { return 0L; }
        public long getLastRejectForegroundTime(int p0) { return 0L; }
        public long getLastRejectTime(int p0) { return 0L; }
        public long getLastRejectTime(int p0, int p1, int p2) { return 0L; }
        public int getMode() { return 0; }
        public int getOp() { return 0; }
        public java.lang.String getOpStr() { return null; }
        @java.lang.Deprecated
        public java.lang.String getProxyPackageName() { return null; }
        @java.lang.Deprecated
        public java.lang.String getProxyPackageName(int p0, int p1) { return null; }
        @java.lang.Deprecated
        public int getProxyUid() { return 0; }
        @java.lang.Deprecated
        public int getProxyUid(int p0, int p1) { return 0; }
        @java.lang.Deprecated
        public long getRejectTime() { return 0L; }
        @java.lang.Deprecated
        public long getTime() { return 0L; }
        public boolean isRunning() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @android.annotation.SystemApi
    public static final class OpEventProxyInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.OpEventProxyInfo> CREATOR = null;
        private java.lang.String mAttributionTag;
        private java.lang.String mDeviceId;
        private java.lang.String mPackageName;
        private int mUid;
        public OpEventProxyInfo(int p0, java.lang.String p1, java.lang.String p2) {}
        public OpEventProxyInfo(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
        public OpEventProxyInfo(android.app.AppOpsManager.OpEventProxyInfo p0) {}
        OpEventProxyInfo(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public java.lang.String getAttributionTag() { return null; }
        public java.lang.String getDeviceId() { return null; }
        public java.lang.String getPackageName() { return null; }
        public int getUid() { return 0; }
        public void reinit(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OpFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OpHistoryFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface OpNotedCallbackFlags {
    }

    @android.annotation.SystemApi
    public static final class PackageOps implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.AppOpsManager.PackageOps> CREATOR = null;
        private final java.util.List<android.app.AppOpsManager.OpEntry> mEntries = null;
        private final java.lang.String mPackageName = null;
        private final int mUid = 0;
        PackageOps(android.os.Parcel p0) {}
        public PackageOps(java.lang.String p0, int p1, java.util.List<android.app.AppOpsManager.OpEntry> p2) {}
        public int describeContents() { return 0; }
        public java.util.List<android.app.AppOpsManager.OpEntry> getOps() { return null; }
        public java.lang.String getPackageName() { return null; }
        public int getUid() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class PausedNotedAppOpsCollection {
        final android.util.ArrayMap<java.lang.String, java.util.BitSet> mCollectedNotedAppOps = null;
        final int mUid = 0;
        PausedNotedAppOpsCollection(int p0, android.util.ArrayMap<java.lang.String, java.util.BitSet> p1) {}
    }

    public static class RestrictionBypass {
        public static android.app.AppOpsManager.RestrictionBypass UNRESTRICTED;
        public boolean isPrivileged;
        public boolean isRecordAudioRestrictionExcept;
        public boolean isSystemUid;
        public RestrictionBypass(boolean p0, boolean p1, boolean p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SamplingStrategy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ShouldCollectNoteOp {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UidState {
    }
}
