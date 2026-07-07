package android.aconfig.statslog;

public final class AconfigStatsLog {
    public static final int ACONFIG_ERROR_OCCURRED = 1342;
    public static final int ACONFIG_ERROR_OCCURRED__ERROR__ACONFIG_ERROR_NONE = 1;
    public static final int ACONFIG_ERROR_OCCURRED__ERROR__ACONFIG_ERROR_UNSPECIFIED = 0;
    public static final int ACONFIG_ERROR_OCCURRED__OPERATION__ACONFIG_OPERATION_LOAD_MAINLINE_PACKAGE_MAP = 2;
    public static final int ACONFIG_ERROR_OCCURRED__OPERATION__ACONFIG_OPERATION_LOAD_PLATFORM_PACKAGE_MAP = 1;
    public static final int ACONFIG_ERROR_OCCURRED__OPERATION__ACONFIG_OPERATION_OTA_STAGING = 3;
    public static final int ACONFIG_ERROR_OCCURRED__OPERATION__ACONFIG_OPERATION_UNSPECIFIED = 0;
    public static final byte ANNOTATION_ID_DEFAULT_STATE = 6;
    public static final byte ANNOTATION_ID_EXCLUSIVE_STATE = 4;
    public static final byte ANNOTATION_ID_IS_UID = 1;
    public static final byte ANNOTATION_ID_PRIMARY_FIELD = 3;
    public static final byte ANNOTATION_ID_PRIMARY_FIELD_FIRST_UID = 5;
    public static final byte ANNOTATION_ID_STATE_NESTED = 8;
    public static final byte ANNOTATION_ID_TRIGGER_STATE_RESET = 7;
    public static final byte ANNOTATION_ID_TRUNCATE_TIMESTAMP = 2;
    public AconfigStatsLog() {}
    public static void write(int p0, int p1, int p2) {}
}
