package android.media.tv.extension.cam;

public final class CamConstants {
    public static final int ANSWER_ANSWER = 1;
    public static final int ANSWER_CANCEL = 0;
    public static final int ANSWER_UNATTENDED = 255;
    public static final int APP_INFO_CONDITIONAL_ACCESS = 1;
    public static final int APP_INFO_ELECTRONIC_PROGRAM_GUIDE = 2;
    public static final int APP_INFO_RESERVED = 3;
    public static final int APP_INFO_UNKNOWN = -3;
    public static final int ASK_RELEASE_OK = 0;
    public static final int ASK_RELEASE_REFUSED = 1;
    public static final java.lang.String CAM_DELIVERY_SYSTEM_HINT_SUPPORT_ALL = "ALL";
    public static final java.lang.String CAM_DELIVERY_SYSTEM_HINT_SUPPORT_DVBC_C2_AND_DVBS_S2 = "DVBC_C2_AND_DVBS_S2";
    public static final java.lang.String CAM_DELIVERY_SYSTEM_HINT_SUPPORT_DVBC_C2_AND_DVBT_T2 = "DVBC_C2_AND_DVBT_T2";
    public static final java.lang.String CAM_DELIVERY_SYSTEM_HINT_SUPPORT_DVBC_C2_ONLY = "DVBC_C2_ONLY";
    public static final java.lang.String CAM_DELIVERY_SYSTEM_HINT_SUPPORT_DVBS_S2_ONLY = "DVBS_S2_ONLY";
    public static final java.lang.String CAM_DELIVERY_SYSTEM_HINT_SUPPORT_DVBT_T2_AND_DVBS_S2 = "DVBT_T2_AND_DVBS_S2";
    public static final java.lang.String CAM_DELIVERY_SYSTEM_HINT_SUPPORT_DVBT_T2_ONLY = "DVBT_T2_ONLY";
    public static final int CAM_NO_PIN_CAPABILITY = 0;
    public static final int CAM_OP_PROFILE_TYPE_INVALID = -1;
    public static final int CAM_OP_PROFILE_TYPE_NON_PROFILED = 0;
    public static final int CAM_OP_PROFILE_TYPE_TYPE1 = 1;
    public static final int CAM_OP_PROFILE_TYPE_TYPE2 = 2;
    public static final int CAM_OP_PROFILE_TYPE_TYPE3 = 3;
    public static final int CAM_OP_SERVICE_UPDATE_MODE_ACKNOWLEDGEMENT_ONLY = 5;
    public static final int CAM_OP_SERVICE_UPDATE_MODE_ADVANCED_WARNING = 3;
    public static final int CAM_OP_SERVICE_UPDATE_MODE_CAM_NIT = 1;
    public static final int CAM_OP_SERVICE_UPDATE_MODE_INITIAL_AUTO_TUNE = 0;
    public static final int CAM_OP_SERVICE_UPDATE_MODE_INVALID = -1;
    public static final int CAM_OP_SERVICE_UPDATE_MODE_SCHEDULED = 4;
    public static final int CAM_OP_SERVICE_UPDATE_MODE_UPDATE_AUTO_TUNE = 2;
    public static final int CAM_PIN_CAPABILITY_WITH_NO_PIN_CACHE = 1;
    public static final int CAM_PIN_CAPABILITY_WITH_PIN_CACHE = 2;
    public static final int DRM_TYPE_COPY_FREELY = 0;
    public static final int DRM_TYPE_COPY_NEVER = 3;
    public static final int DRM_TYPE_COPY_NO_MORE = 1;
    public static final int DRM_TYPE_COPY_ONCE = 2;
    public static final int DRM_TYPE_UNKNOWN = -1;
    public static final int FAIL = -1;
    public static final java.lang.String KEY_APP_MANUFACTURE = "APP_MANUFACTURE";
    public static final java.lang.String KEY_APP_TYPE = "APP_TYPE";
    public static final java.lang.String KEY_CAM_DELIVERY_SYSTEM_HINT = "CAM_DELIVERY_SYSTEM_HINT";
    public static final java.lang.String KEY_CAM_DRM_TYPE = "DRM_TYPE";
    public static final java.lang.String KEY_CAM_ID = "CAM_ID";
    public static final java.lang.String KEY_CAM_PRGM_NUM = "PRGM_NUM";
    public static final java.lang.String KEY_CAM_PROFILE_NAME = "CAM_PROFILE_NAME";
    public static final java.lang.String KEY_CAM_PROFILE_TYPE = "CAM_PROFILE_TYPE";
    public static final java.lang.String KEY_CAM_REFRESH_REQUEST_FLAG = "CAM_REFRESH_REQUEST_FLAG";
    public static final java.lang.String KEY_CAM_SLOT_ID = "SLOT_ID";
    public static final java.lang.String KEY_CAM_SLOT_TYPE = "KEY_CAM_SLOT_TYPE";
    public static final java.lang.String KEY_IS_CAM_INSERTED = "IS_CAM_INSERTED";
    public static final java.lang.String KEY_MANUFACTURE_CODE = "MANUFACTURE_CODE";
    public static final java.lang.String KEY_MENU_STRING = "MENU_STRING";
    public static final java.lang.String KEY_MMI_ENQ_INPUT_TEXT = "MMI_ENQ_INPUT_TEXT";
    public static final java.lang.String KEY_MMI_ENQ_IS_HIDE = "MMI_ENQ_IS_HIDE";
    public static final java.lang.String KEY_MMI_ENQ_MAX_TEXT_LENGTH = "MMI_ENQ_MAX_TEXT_LENGTH";
    public static final java.lang.String KEY_MMI_MENULIST_FOOTERNOTE = "MMI_MENULIST_FOOTERNOTE";
    public static final java.lang.String KEY_MMI_MENULIST_ITEMLIST = "MMI_MENULIST_ITEMLIST";
    public static final java.lang.String KEY_MMI_MENULIST_SUBTITLE = "MMI_MENULIST_SUBTITLE";
    public static final java.lang.String KEY_MMI_MENULIST_TITLE = "MMI_MENULIST_TITLE";
    public static final java.lang.String KEY_NEED_SERVICE_UPDATE = "NEED_SERVICE_UPDATE";
    public static final java.lang.String KEY_PIN_CAP_CAPABILITY = "PIN_CAPABILITY";
    public static final java.lang.String KEY_PIN_CAP_DATE_TIME = "DATE_TIME";
    public static final java.lang.String KEY_PIN_VALIDATION_PINCODE_STATUS = "VALIDATION_PINCODE_STATUS";
    public static final java.lang.String KEY_PIN_VALIDATION_RESULT = "VALIDATION_RESULT";
    public static final int PIN_CODE_STATUS_ERROR_BAD_PIN = 0;
    public static final int PIN_CODE_STATUS_ERROR_CICAM_BUSY = 1;
    public static final int PIN_CODE_STATUS_ERROR_PIN_UNCONFIRMED = 3;
    public static final int PIN_CODE_STATUS_PIN_CORRECT = 2;
    public static final int PIN_NOT_SUPPORTED = -6;
    public static final int PIN_VALIDATION_REQ_FAIL_CAM_NOT_INSERTED = -2;
    public static final int PIN_VALIDATION_REQ_FAIL_INVALID_CAM_PIN = -4;
    public static final int PIN_VALIDATION_REQ_FAIL_INVALID_SLOT = -1;
    public static final int PIN_VALIDATION_REQ_FAIL_NO_CAPABILITY = -3;
    public static final int PIN_VALIDATION_REQ_SUCCESS = 0;
    public static final int REFRESH_REQUEST_FLAG_ADVANCE = 1;
    public static final int REFRESH_REQUEST_FLAG_DEFAULT = 0;
    public static final int REFRESH_REQUEST_FLAG_SCHEDULE = 3;
    public static final int REFRESH_REQUEST_FLAG_URGENT = 2;
    public static final int RESULT_CICAM_NOT_INSERTED = -2;
    public static final int RESULT_INVALID_SLOT_ID = -1;
    public static final int RESULT_SUCCESS = 0;
    public static final int SESSION_ACTIVE = 1;
    public static final int SESSION_INACTIVE = 0;
    public static final int SLOT_TYPE_PCMCIA = 0;
    public static final int SLOT_TYPE_USB = 1;
    public static final int SUCCESS = 0;
    public static final int TUNE_MODE_NORMAL = 0;
    public static final int TUNE_MODE_QUIET = 1;
    public CamConstants() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AskReleaseReplyStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamAppInfoBundleKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamAppInfoResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamAppType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamDrmInfoBundleKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamHostSessionStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamInfoBundleKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamOpDeliverySystemHint {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamOpProfileType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamOpRefreshRequestFlag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamOpServiceUpdateMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamPinCapabilityBundleKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamPinCapabilityResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamPinCapabilityType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamPinCodeStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamPinStatusBundleKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamPinValidationResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamServiceUpdateInfoBundleKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamSlotInfoBundleKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CamSlotType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DrmType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnquiryBundleKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MenuListBundleKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MmiAnswerId {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OpResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TuneQuietlyFlag {
    }
}
