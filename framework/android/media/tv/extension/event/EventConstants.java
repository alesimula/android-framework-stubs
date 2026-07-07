package android.media.tv.extension.event;

public final class EventConstants {
    public static final int FLOW_BARKER = 1;
    public static final int FLOW_NULL = 0;
    public static final int FLOW_SEQUENTIAL = 2;
    public static final java.lang.String KEY_BROADCAST_GENRE = "KEY_BROADCAST_GENRE";
    public static final java.lang.String KEY_CONTENT_RATING = "KEY_CONTENT_RATING";
    public static final java.lang.String KEY_END_TIME_UTC_MILLIS = "KEY_END_TIME_UTC_MILLIS";
    public static final java.lang.String KEY_EVENT_ID = "KEY_EVENT_ID";
    public static final java.lang.String KEY_GUIDANCE_TEXT = "KEY_GUIDANCE_TEXT";
    public static final java.lang.String KEY_IS_RUNNING = "KEY_IS_RUNNING";
    public static final java.lang.String KEY_IS_SCRAMBLED = "KEY_IS_SCRAMBLED";
    public static final java.lang.String KEY_LONG_DESCRIPTION = "KEY_LONG_DESCRIPTION";
    public static final java.lang.String KEY_PRIORITY_HINT_USE_CASE_TYPE = "KEY_PRIORITY_HINT_USE_CASE_TYPE";
    public static final java.lang.String KEY_SERVICE_INFO_ID = "_id";
    public static final java.lang.String KEY_SERVICE_LIST_IDS = "channel_list_id";
    public static final java.lang.String KEY_SERVICE_LIST_TYPES = "KEY_SERVICE_LIST_TYPES";
    public static final java.lang.String KEY_SHORT_DESCRIPTION = "KEY_SHORT_DESCRIPTION";
    public static final java.lang.String KEY_START_TIME_UTC_MILLIS = "KEY_START_TIME_UTC_MILLIS";
    public static final java.lang.String KEY_TITLE = "KEY_TITLE";
    public static final int RESULT_CANCELED = 1;
    public static final int RESULT_ERROR = -1;
    public static final int RESULT_SUCCESS = 0;
    public EventConstants() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventDownloadKeys {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FlowType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PresentEventInfoKeys {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SdtGuidanceKeys {
    }
}
