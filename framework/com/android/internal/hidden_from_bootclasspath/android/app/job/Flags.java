package com.android.internal.hidden_from_bootclasspath.android.app.job;

public final class Flags {
    public static final java.lang.String FLAG_CONNECTIVITY_ENHANCED_PENDING_AND_STOP_REASONS = "android.app.job.connectivity_enhanced_pending_and_stop_reasons";
    public static final java.lang.String FLAG_ENFORCE_MINIMUM_TIME_WINDOWS = "android.app.job.enforce_minimum_time_windows";
    public static final java.lang.String FLAG_ENHANCED_PENDING_AND_STOP_REASONS_API = "android.app.job.enhanced_pending_and_stop_reasons_api";
    public static final java.lang.String FLAG_GET_PENDING_JOB_REASONS_API = "android.app.job.get_pending_job_reasons_api";
    public static final java.lang.String FLAG_GET_PENDING_JOB_REASONS_HISTORY_API = "android.app.job.get_pending_job_reasons_history_api";
    public static final java.lang.String FLAG_GET_PENDING_JOB_REASON_STATS_API = "android.app.job.get_pending_job_reason_stats_api";
    public static final java.lang.String FLAG_HANDLE_ABANDONED_JOBS = "android.app.job.handle_abandoned_jobs";
    public static final java.lang.String FLAG_IGNORE_IMPORTANT_WHILE_FOREGROUND = "android.app.job.ignore_important_while_foreground";
    public static final java.lang.String FLAG_JOB_DEBUG_INFO_APIS = "android.app.job.job_debug_info_apis";
    public static final java.lang.String FLAG_NON_BLOCKING_ABANDONED_JOBS = "android.app.job.non_blocking_abandoned_jobs";
    public Flags() {}
    public static boolean connectivityEnhancedPendingAndStopReasons() { return false; }
    public static boolean enforceMinimumTimeWindows() { return false; }
    public static boolean enhancedPendingAndStopReasonsApi() { return false; }
    public static boolean getPendingJobReasonStatsApi() { return false; }
    public static boolean getPendingJobReasonsApi() { return false; }
    public static boolean getPendingJobReasonsHistoryApi() { return false; }
    public static boolean handleAbandonedJobs() { return false; }
    public static boolean ignoreImportantWhileForeground() { return false; }
    public static boolean jobDebugInfoApis() { return false; }
    public static boolean nonBlockingAbandonedJobs() { return false; }
}
