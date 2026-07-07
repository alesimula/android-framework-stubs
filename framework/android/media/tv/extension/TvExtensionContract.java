package android.media.tv.extension;

public class TvExtensionContract {
    public static final java.lang.String ANALOG_TUNER_SETTING_TABLE = "analog_tuner_settings";
    public static final java.lang.String AUTHORITY = "android.media.tv.extension";
    public static final android.net.Uri AUTHORITY_URI = null;
    public static final java.lang.String CC_STYLE_SETTINGS = "cc_style_settings";
    public static final java.lang.String DIGITAL_TUNER_SETTING_TABLE = "digital_tuner_settings";
    public static final java.lang.String DVB_EXTENSION_TABLE = "dvb_extensions";
    public static final java.lang.String GENERAL_SETTING_TABLE = "general_settings";
    public static final java.lang.String GLOBAL_SETTING_TABLE = "global_settings";
    public static final java.lang.String INTERACTIVE_SETTING_TABLE = "interactive_settings";
    public static final java.lang.String TUNER_OPERATOR_TABLE = "tuner_operator";
    public TvExtensionContract() {}
    private static android.net.Uri buildTableUri(java.lang.String p0) { return null; }

    public static final class AnalogTunerSettings {
        public static final int ANALOG_DISPLAY_MUTE = 2;
        public static final int ANALOG_DISPLAY_OFF = 0;
        public static final int ANALOG_DISPLAY_ON = 1;
        public static final int ANALOG_SUBTITLE_DISPLAY_OFF = 0;
        public static final int ANALOG_SUBTITLE_EIA_608 = 1;
        public static final int ANALOG_SUBTITLE_SCTE = 3;
        public static final int ANALOG_SUBTITLE_TELETEXT = 2;
        public static final java.lang.String COLUMN_ANALOG_SERVICE_SELECTION = "analog_service_selection";
        public static final java.lang.String COLUMN_CLOSED_CAPTION_DISPLAY = "closed_caption_display";
        public static final java.lang.String COLUMN_ID = "_id";
        public static final java.lang.String COLUMN_SUBTITLE_DISPLAY = "analog_subtitle_display";
        public static final android.net.Uri CONTENT_URI = null;
        public AnalogTunerSettings() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface AnalogSubtitle {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ClosedCaptionDisplay {
        }
    }

    public static final class CCStyleSettings {
        public static final java.lang.String CLOSED_CAPTION_BACKGROUND_COLOR = "closed_caption_background_color";
        public static final java.lang.String CLOSED_CAPTION_BACKGROUND_OPACITY = "closed_caption_background_opacity";
        public static final int CLOSED_CAPTION_COLOR_BLACK = 1;
        public static final int CLOSED_CAPTION_COLOR_BLUE = 4;
        public static final int CLOSED_CAPTION_COLOR_CYAN = 6;
        public static final int CLOSED_CAPTION_COLOR_DEFAULT = 0;
        public static final int CLOSED_CAPTION_COLOR_GREEN = 3;
        public static final int CLOSED_CAPTION_COLOR_MAGENTA = 8;
        public static final int CLOSED_CAPTION_COLOR_RED = 5;
        public static final int CLOSED_CAPTION_COLOR_WHITE = 2;
        public static final int CLOSED_CAPTION_COLOR_YELLOW = 7;
        public static final java.lang.String CLOSED_CAPTION_EDGE_COLOR = "closed_caption_edge_color";
        public static final java.lang.String CLOSED_CAPTION_EDGE_TYPE = "closed_caption_edge_type";
        public static final int CLOSED_CAPTION_EDGE_TYPE_DEFAULT = 0;
        public static final int CLOSED_CAPTION_EDGE_TYPE_DEPRESSED = 5;
        public static final int CLOSED_CAPTION_EDGE_TYPE_DROP_SHADOW = 3;
        public static final int CLOSED_CAPTION_EDGE_TYPE_DROP_SHADOW_LEFT = 6;
        public static final int CLOSED_CAPTION_EDGE_TYPE_NONE = 1;
        public static final int CLOSED_CAPTION_EDGE_TYPE_OUTLINE = 2;
        public static final int CLOSED_CAPTION_EDGE_TYPE_RAISED = 4;
        public static final java.lang.String CLOSED_CAPTION_FONT_FAMILY = "closed_caption_font_family";
        public static final int CLOSED_CAPTION_FRONT_FAMILY_CASUAL = 5;
        public static final int CLOSED_CAPTION_FRONT_FAMILY_CURSIVE = 6;
        public static final int CLOSED_CAPTION_FRONT_FAMILY_SANS_DEFAULT = 0;
        public static final int CLOSED_CAPTION_FRONT_FAMILY_SANS_SERIF = 1;
        public static final int CLOSED_CAPTION_FRONT_FAMILY_SANS_SERIF_MONOSPACE = 2;
        public static final int CLOSED_CAPTION_FRONT_FAMILY_SERIF = 3;
        public static final int CLOSED_CAPTION_FRONT_FAMILY_SERIF_MONOSPACE = 4;
        public static final int CLOSED_CAPTION_FRONT_FAMILY_SMALL_CAPTIALS = 7;
        public static final int CLOSED_CAPTION_OPACITY_DEFAULT = 0;
        public static final int CLOSED_CAPTION_OPACITY_FLASHING = 4;
        public static final int CLOSED_CAPTION_OPACITY_SOLID = 1;
        public static final int CLOSED_CAPTION_OPACITY_TRANSLUCENT = 2;
        public static final int CLOSED_CAPTION_OPACITY_TRANSPARENT = 3;
        public static final java.lang.String CLOSED_CAPTION_TEXT_COLOR = "closed_caption_text_color";
        public static final java.lang.String CLOSED_CAPTION_TEXT_OPACITY = "closed_caption_text_opacity";
        public static final java.lang.String CLOSED_CAPTION_TEXT_SIZE = "closed_caption_text_size";
        public static final int CLOSED_CAPTION_TEXT_SIZE_DEFAULT = 0;
        public static final int CLOSED_CAPTION_TEXT_SIZE_LARGE = 3;
        public static final int CLOSED_CAPTION_TEXT_SIZE_NORMAL = 2;
        public static final int CLOSED_CAPTION_TEXT_SIZE_SMALL = 1;
        public static final java.lang.String CLOSED_CAPTION_WINDOW_COLOR = "closed_caption_window_color";
        public static final java.lang.String COLUMN_ID = "_id";
        public static final android.net.Uri CONTENT_URI = null;
        public CCStyleSettings() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface BackgroundColor {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface BackgroundOpacity {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ClosedCaptionEdgeColor {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ClosedCaptionEdgeType {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ClosedCaptionFontFamily {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ClosedCaptionTextColor {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ClosedCaptionTextOpacity {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ClosedCaptionTextSize {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ClosedCaptionWindowColor {
        }
    }

    public static final class DigitalTunerSettings {
        public static final java.lang.String COLUMN_CC_DISPLAY = "digital_cc_display";
        public static final java.lang.String COLUMN_DIGITAL_SUBTITLE_DISPLAY = "digital_subtitle_display";
        public static final java.lang.String COLUMN_DIGITAL_SUBTITLE_TRACK = "digital_subtitle_track";
        public static final java.lang.String COLUMN_ID = "_id";
        public static final java.lang.String COLUMN_SUPERIMPOSE = "superimpose";
        public static final android.net.Uri CONTENT_URI = null;
        public static final int DIGITAL_CC_DISPLAY_MUTE = 2;
        public static final int DIGITAL_CC_DISPLAY_OFF = 0;
        public static final int DIGITAL_CC_DISPLAY_ON = 1;
        public static final int DIGITAL_SUBTITLE_DISPLAY_HEARING_IMPAIRED = 2;
        public static final int DIGITAL_SUBTITLE_DISPLAY_OFF = 0;
        public static final int DIGITAL_SUBTITLE_DISPLAY_ON = 1;
        public static final int SUPERIMPOSE_SETUP_LANG1 = 1;
        public static final int SUPERIMPOSE_SETUP_LANG2 = 2;
        public static final int SUPERIMPOSE_SETUP_OFF = 0;
        public DigitalTunerSettings() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DigitalCCDisplay {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DigitalSubtitleDisplay {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SuperImposeSetup {
        }
    }

    public static final class DvbExtensions {
        public static final java.lang.String COLUMN_CHANNEL_NUM_ADDED = "channel_num_added";
        public static final java.lang.String COLUMN_ID = "_id";
        public static final java.lang.String COLUMN_INDONESIA_EWS_LOCATION_CODE = "indonesia_ews_location_code";
        public static final java.lang.String COLUMN_LCN_CONFLICT = "bgm_lcn_conflict_happened";
        public static final java.lang.String COLUMN_LCN_USER_SETTING_CABLE = "lcn_user_setting_cable";
        public static final java.lang.String COLUMN_LCN_USER_SETTING_TERRESTRIAL = "lcn_user_setting_terrestrial";
        public static final java.lang.String COLUMN_TKGS_AVAIL_COND = "tkgs_avail_cond";
        public static final java.lang.String COLUMN_TKGS_HIDDEN_LOCATOR_LIST = "tkgs_hidden_locator_list";
        public static final java.lang.String COLUMN_TKGS_OPER_MODE = "tkgs_oper_mode";
        public static final java.lang.String COLUMN_TKGS_TABLE_VERSION = "tkgs_table_version";
        public static final java.lang.String COLUMN_TKGS_USER_MESSAGE = "tkgs_user_message";
        public static final java.lang.String COLUMN_TKGS_VISIBLE_LOCATOR_LIST = "tkgs_visible_locator_list";
        public static final android.net.Uri CONTENT_URI = null;
        public static final int LCN_CONFICT_HAS_OCCURRED = 1;
        public static final int LCN_CONFLICT_HAS_NOT_OCCURRED = 0;
        public static final int LCN_NONE = 0;
        public static final int LCN_OFF = 2;
        public static final int LCN_ON = 1;
        public static final int TKGS_AVAILABILITY_COND_CERTIFICATION = 1;
        public static final int TKGS_AVAILABILITY_COND_NORMAL = 0;
        public static final int TKGS_OPERATING_MODE_AUTO = 0;
        public static final int TKGS_OPERATING_MODE_CUST = 1;
        public static final int TKGS_OPERATING_MODE_OFF = 2;
        public DvbExtensions() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface LcnConflict {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface LcnUserSettings {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface TkgsAvailability {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface TkgsOperatingMode {
        }
    }

    public static final class GeneralSettings {
        public static final int AUDIO_TYPE_AUDIO_DESCRIPTION = 1;
        public static final int AUDIO_TYPE_AUDIO_DESCRIPTION_AND_SPOKEN_SUBTITLE = 4;
        public static final int AUDIO_TYPE_FOR_HARD_OF_HEARING = 3;
        public static final int AUDIO_TYPE_NORMAL = 0;
        public static final int AUDIO_TYPE_SPOKEN_SUBTITLE = 2;
        public static final int BLOCK_UNRATED_PROG_OFF = 0;
        public static final int BLOCK_UNRATED_PROG_ON = 1;
        public static final java.lang.String COLUMN_AUDIO_TYPE = "audio_type";
        public static final java.lang.String COLUMN_BLOCK_UNRATED_PROG = "block_unrated_prog";
        public static final java.lang.String COLUMN_ID = "_id";
        public static final java.lang.String COLUMN_PREFERRED_AUDIO_LANG_PRIMARY = "audio_primary_language";
        public static final java.lang.String COLUMN_PREFERRED_AUDIO_LANG_SECONDARY = "audio_secondary_language";
        public static final java.lang.String COLUMN_PREFERRED_SUBTITLE_LANG_PRIMARY = "subtitle_primary_language";
        public static final java.lang.String COLUMN_PREFERRED_SUBTITLE_LANG_SECONDARY = "subtitle_secondary_language";
        public static final java.lang.String COLUMN_TELETEXT_DECODING_LANGUAGE = "teletext_decoding_language";
        public static final java.lang.String COLUMN_TELETEXT_DIGITAL_LANGUAGE = "teletext_digital_language";
        public static final java.lang.String COLUMN_VISUALLY_IMPAIRED_FADER_CONTROL = "visually_impaired_fader_control";
        public static final java.lang.String COLUMN_VISUALLY_IMPAIRED_MIXING_LEVEL = "visually_impaired_mixing_level";
        public static final android.net.Uri CONTENT_URI = null;
        public static final int TELETEXT_DECODING_LANGUAGE_ARAB = 8;
        public static final int TELETEXT_DECODING_LANGUAGE_ARAB_HBRW = 6;
        public static final int TELETEXT_DECODING_LANGUAGE_BYELORUSSIAN = 9;
        public static final int TELETEXT_DECODING_LANGUAGE_EAST_EUR = 1;
        public static final int TELETEXT_DECODING_LANGUAGE_FARSIAN = 7;
        public static final int TELETEXT_DECODING_LANGUAGE_GREEK = 4;
        public static final int TELETEXT_DECODING_LANGUAGE_RUSSIA = 2;
        public static final int TELETEXT_DECODING_LANGUAGE_RUSSIA_2 = 3;
        public static final int TELETEXT_DECODING_LANGUAGE_TURKEY = 5;
        public static final int TELETEXT_DECODING_LANGUAGE_WEST_EUR = 0;
        public static final int VISUALLY_IMPAIRED_FADER_CONTROL_OFF = 0;
        public static final int VISUALLY_IMPAIRED_FADER_CONTROL_ON = 1;
        public GeneralSettings() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface AudioType {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface BlockUnratedProg {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface TeletextDecodingLanguage {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface VisuallyImpairedFaderControl {
        }
    }

    public static final class GlobalSettings implements android.media.tv.extension.TvExtensionContract.KeyValueColumns {
        public static final int BROADCAST_TUNER_TYPE_ANTENNA = 0;
        public static final int BROADCAST_TUNER_TYPE_CABLE = 1;
        public static final int BROADCAST_TUNER_TYPE_SATELLITE = 2;
        public static final int CAM_TYPE_PCMCIA = 0;
        public static final int CAM_TYPE_PCMCIA_USB = 2;
        public static final int CAM_TYPE_USB = 1;
        public static final java.lang.String COLUMN_ID = "_id";
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String KEY_CABLE_BROADCASTER_NAME = "cable_broadcaster_name";
        public static final java.lang.String KEY_CAM_IS_CI2PLUS_SUPPORTED = "cam_is_ciplus2_supported";
        public static final java.lang.String KEY_CAM_PIN_CODE = "cam_pin_code";
        public static final java.lang.String KEY_CAM_TYPE = "cam_type";
        public static final java.lang.String KEY_CHANNEL_LIST_TYPE = "channel_list_type";
        public static final java.lang.String KEY_CURRENT_COUNTRY_REGION = "current_country_region_code";
        public static final java.lang.String KEY_EAS_IS_CHANNEL_CHANGE = "eas_channel_change";
        public static final java.lang.String KEY_EAS_STATUS = "eas_status";
        public static final java.lang.String KEY_OAD_MARK = "oad_into_mark";
        public static final java.lang.String KEY_OAD_OFFSET = "oad_offset";
        public static final java.lang.String KEY_OAD_PROPERTIES = "oad_update_properties";
        public static final java.lang.String KEY_OAD_REJECT_UPDATE = "oad_update_rejected_flag";
        public static final java.lang.String KEY_OAD_SIZE = "oad_size";
        public static final java.lang.String KEY_OAD_UNDONE = "oad_into_undone";
        public static final java.lang.String KEY_RECORDING_PATH = "pvr_storage_path";
        public static final java.lang.String KEY_RECORDING_STATE = "recording_state";
        public static final java.lang.String KEY_SATELLITE_BROADCASTER = "satellite_broadcaster_name";
        public static final java.lang.String KEY_TIMESHIFT_FREE_SIZE = "timeshift_storage_free_bytes";
        public static final java.lang.String KEY_TIMESHIFT_MODE = "timeshift_mode";
        public static final java.lang.String KEY_TIMESHIFT_PATH = "timeshift_storage_path";
        public static final java.lang.String KEY_TUNER_SATELLITE_TYPE = "satellite_type";
        public static final java.lang.String KEY_TUNER_TYPE = "tuner_source_type";
        public static final java.lang.String KEY_TUNER_USER_TYPE = "user_broadcast_tuner_type";
        public static final java.lang.String KEY_UI_CHANNEL_UPDATE_MSG = "ui_show_channel_update_notification";
        public static final java.lang.String KEY_UI_KEYPAD_IS_FOREGROUND = "ui_tv_app_is_foreground";
        public static final java.lang.String KEY_UI_KEYPAD_SHOW_MENU = "ui_show_menu_on_keypad_press";
        public static final int RECORDING_STATE_OFF = 0;
        public static final int RECORDING_STATE_PVR_PLAYING = 3;
        public static final int RECORDING_STATE_PVR_RECORDING = 2;
        public static final int RECORDING_STATE_TIMESHIFT_RUNNING = 1;
        public static final int SATELLITE_TYPE_GENERAL = 0;
        public static final int SATELLITE_TYPE_PREFERRED = 1;
        public static final int TIMESHIFT_MODE_OFF = 0;
        public static final int TIMESHIFT_MODE_ON = 1;
        public GlobalSettings() {}
        public static java.lang.Boolean isGlobalSettingsKey(java.lang.String p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CamType {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface RecordingState {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SatelliteType {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Timeshift {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface TunerSourceType {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface TunerUserType {
        }
    }

    public static final class InteractiveSettings {
        public static final int AEAS_FILTER_AUDIENCE_NONE = 0;
        public static final int AEAS_FILTER_AUDIENCE_PRIVATE = 3;
        public static final int AEAS_FILTER_AUDIENCE_PUBLIC = 1;
        public static final int AEAS_FILTER_AUDIENCE_RESTRICTED = 2;
        public static final int AEAS_FILTER_PRIORITY_HIGH = 4;
        public static final int AEAS_FILTER_PRIORITY_LOW = 2;
        public static final int AEAS_FILTER_PRIORITY_MAXIMUM = 5;
        public static final int AEAS_FILTER_PRIORITY_MINOR = 1;
        public static final int AEAS_FILTER_PRIORITY_MODERATE = 3;
        public static final int AEAS_FILTER_PRIORITY_NONE = 0;
        public static final int BLOCK = 1;
        public static final java.lang.String COLUMN_AEAS_FILTER_AUDIENCE = "aeas_filter_audience";
        public static final java.lang.String COLUMN_AEAS_FILTER_PRIORITY = "aeas_filter_priority";
        public static final java.lang.String COLUMN_GINGA_AUTO_START_APPLICATION_STATE = "ginga_auto_start_application_state";
        public static final java.lang.String COLUMN_GINGA_STATE = "ginga_state";
        public static final java.lang.String COLUMN_HBBTV_BLOCK_TRACKING = "hbbtv_block_tracking";
        public static final java.lang.String COLUMN_HBBTV_DEVICE_ID = "hbbtv_has_device_id";
        public static final java.lang.String COLUMN_HBBTV_ENABLE = "hbbtv_enable";
        public static final java.lang.String COLUMN_HBBTV_PRIVACY_POLICY_COOKIES_SETTINGS = "hbbtv_privacy_policy_cookies_settings";
        public static final java.lang.String COLUMN_HBBTV_PRIVACY_POLICY_DO_NOT_TRACK = "hbbtv_privacy_policy_do_not_track";
        public static final java.lang.String COLUMN_HBBTV_PRIVACY_POLICY_PERSISTENT_STORAGE = "hbbtv_privacy_policy_persistent_storage";
        public static final java.lang.String COLUMN_HBBTV_RESET_DEVICE_ID = "hbbtv_reset_device_id";
        public static final java.lang.String COLUMN_ID = "_id";
        public static final java.lang.String COLUMN_IS_AEAS_AUDIO_ENABLED = "is_aeas_audio_enabled";
        public static final java.lang.String COLUMN_IS_AEAS_ENABLED = "is_aeas_enabled";
        public static final java.lang.String COLUMN_IS_ATSC_3_0_SUPPORTED = "is_atsc_3_0_supported";
        public static final java.lang.String COLUMN_OPAPP_LAUNCH_PARAMS = "opapp_launch_params";
        public static final java.lang.String COLUMN_SIGNED_SIGNAL_CHECK_ENABLED = "signed_signal_check_enabled";
        public static final android.net.Uri CONTENT_URI = null;
        public static final int DISABLE = 0;
        public static final int ENABLE = 1;
        public static final int HAS_DEVICE_ID = 1;
        public static final java.lang.String HBBTV_DEVICE_ID_SEED_TIMESTAMP = "hbbtv_device_id_seed_timestamp";
        public static final int HBBTV_PRIVACY_POLICY_BLOCK_3RD_PARTY_COOKIES = 1;
        public static final int HBBTV_PRIVACY_POLICY_BLOCK_ALL = 0;
        public static final int HBBTV_PRIVACY_POLICY_DEFAULT = 2;
        public static final int HBBTV_PRIVACY_POLICY_DO_NOT_TRACK_DEFAULT = 2;
        public static final int HBBTV_PRIVACY_POLICY_DO_NOT_TRACK_OFF = 0;
        public static final int HBBTV_PRIVACY_POLICY_DO_NOT_TRACK_ON = 1;
        public static final int NONE = 0;
        public InteractiveSettings() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface AeasFilterAudience {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface AeasFilterPriority {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface GingaAutoStartApplicationState {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface GingaState {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HbbtvBlockTracking {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HbbtvEnable {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HBBTV_HAS_DEVICE_ID {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HBBTV_PRIVACY_COOKIES_POLICY {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HBBTV_PRIVACY_DO_NOT_TRACK {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HBBTV_PRIVACY_POLICY_PERSISTENT_STORAGE {
        }
    }

    public static interface KeyValueColumns {
        public static final java.lang.String COLUMN_KEY = "setting_key";
        public static final java.lang.String COLUMN_VALUE = "setting_value";
    }

    public static final class TunerOperators {
        public static final int ANTENNA = 0;
        public static final int CABLE = 1;
        public static final java.lang.String COLUMN_OPERATOR_ID = "operator_id";
        public static final java.lang.String COLUMN_OPERATOR_NAME = "operator_name";
        public static final java.lang.String COLUMN_TUNER_NAME = "broadcast_tuner_type";
        public static final android.net.Uri CONTENT_URI = null;
        public static final int OPERATOR_AT_M7_HD_AUSTRIA = 700;
        public static final int OPERATOR_AT_MAGENTA_UPC = 33;
        public static final int OPERATOR_AT_ORF = 39;
        public static final int OPERATOR_AT_SIMPLITV = 31;
        public static final int OPERATOR_AU_FREEVIEW_PLUS = 10001;
        public static final int OPERATOR_BE_M7_TELESAT = 705;
        public static final int OPERATOR_BE_M7_TV_VLAANDEREN = 702;
        public static final int OPERATOR_BE_TELENET = 20;
        public static final int OPERATOR_BE_VOO = 24;
        public static final int OPERATOR_CH_KABELIO = 10002;
        public static final int OPERATOR_CH_SUNRISE_UPC = 62;
        public static final int OPERATOR_CZ_M7_SKYLINK = 703;
        public static final int OPERATOR_DEFAULT_CABLE = 901;
        public static final int OPERATOR_DEFAULT_TERRESTRIAL = 900;
        public static final int OPERATOR_DE_DTVP = 10003;
        public static final int OPERATOR_DE_FREENET = 10004;
        public static final int OPERATOR_DE_HD_PLUS = 26;
        public static final int OPERATOR_DE_M7_FAST_SCAN_DEUTSCHLAND = 3004;
        public static final int OPERATOR_DE_SKY_DEUTSCHLAND = 27;
        public static final int OPERATOR_DE_VODAFONE_KDG = 17;
        public static final int OPERATOR_DE_VODAFONE_UNITY = 8;
        public static final int OPERATOR_DK_NORLYS = 10005;
        public static final int OPERATOR_DK_STOFA = 5;
        public static final int OPERATOR_DK_YOUSEE = 6;
        public static final int OPERATOR_EE_ANTENNI_TV = 10006;
        public static final int OPERATOR_ES_DIGI = 10009;
        public static final int OPERATOR_ES_LOVESTV = 10007;
        public static final int OPERATOR_ES_TDT_HIBRIDA = 10008;
        public static final int OPERATOR_FI_ANTENNA_READY = 10010;
        public static final int OPERATOR_FI_CABLE_READY = 35;
        public static final int OPERATOR_FR_CANAL_READY = 18;
        public static final int OPERATOR_FR_FRANSAT = 10011;
        public static final int OPERATOR_FR_TNT_HD = 10012;
        public static final int OPERATOR_GENERAL_SATELLITE = 902;
        public static final int OPERATOR_GR_ERTFLIX = 10013;
        public static final int OPERATOR_HR_OIV = 10014;
        public static final int OPERATOR_HU_DIGI = 706;
        public static final int OPERATOR_HU_MINDIG = 10015;
        public static final int OPERATOR_HU_VODAFONE_UPC = 10016;
        public static final int OPERATOR_IE_SAORVIEW = 10017;
        public static final int OPERATOR_IT_LATIVU = 10018;
        public static final int OPERATOR_IT_TIVUSAT = 25;
        public static final int OPERATOR_NL_M7_CANAL_DIGITAAL = 701;
        public static final int OPERATOR_NL_ZIGGO_UPC = 7;
        public static final int OPERATOR_NORDIC_VIASAT = 10020;
        public static final int OPERATOR_NO_CANAL_DIGITAL = 103;
        public static final int OPERATOR_NO_RIKSTV = 10019;
        public static final int OPERATOR_NZ_FREEVIEW = 10021;
        public static final int OPERATOR_PL_CANAL_PLUS = 10022;
        public static final int OPERATOR_PL_UPC = 10023;
        public static final int OPERATOR_RO_DIGI = 709;
        public static final int OPERATOR_RO_M7_FOCUSSAT = 10024;
        public static final int OPERATOR_RO_VODAFONE_UPC = 10025;
        public static final int OPERATOR_RS_DIGITAL_TV = 54;
        public static final int OPERATOR_SE_BOXER = 10026;
        public static final int OPERATOR_SE_TELE2_COMHEM = 2;
        public static final int OPERATOR_SE_TELENOR = 104;
        public static final int OPERATOR_TR_DSMART = 30;
        public static final int OPERATOR_TR_TKGS = 3001;
        public static final int SATELLITE = 2;
        public TunerOperators() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface BroadcastTunerType {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface OperatorId {
        }
    }
}
