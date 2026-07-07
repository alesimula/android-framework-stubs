package com.android.internal.hidden_from_bootclasspath.android.app.usage;

public final class Flags {
    public static final java.lang.String FLAG_ADD_REPORT_EVENT_METRICS = "android.app.usage.add_report_event_metrics";
    public static final java.lang.String FLAG_DEPRECATE_OLD_QUERY_EVENTS_API = "android.app.usage.deprecate_old_query_events_api";
    public static final java.lang.String FLAG_ENFORCE_CALLER_CHECK_ON_USAGE_REPORTING = "android.app.usage.enforce_caller_check_on_usage_reporting";
    public static final java.lang.String FLAG_FILTER_BASED_EVENT_QUERY_API = "android.app.usage.filter_based_event_query_api";
    public static final java.lang.String FLAG_FIX_RESTRICTED_DELAY_ELAPSED_TIME = "android.app.usage.fix_restricted_delay_elapsed_time";
    public static final java.lang.String FLAG_GET_APP_BYTES_BY_DATA_TYPE_API = "android.app.usage.get_app_bytes_by_data_type_api";
    public static final java.lang.String FLAG_REPORT_USAGE_STATS_PERMISSION = "android.app.usage.report_usage_stats_permission";
    public static final java.lang.String FLAG_USER_INTERACTION_TYPE_API = "android.app.usage.user_interaction_type_api";
    public Flags() {}
    public static boolean addReportEventMetrics() { return false; }
    public static boolean deprecateOldQueryEventsApi() { return false; }
    public static boolean enforceCallerCheckOnUsageReporting() { return false; }
    public static boolean filterBasedEventQueryApi() { return false; }
    public static boolean fixRestrictedDelayElapsedTime() { return false; }
    public static boolean getAppBytesByDataTypeApi() { return false; }
    public static boolean reportUsageStatsPermission() { return false; }
    public static boolean userInteractionTypeApi() { return false; }
}
