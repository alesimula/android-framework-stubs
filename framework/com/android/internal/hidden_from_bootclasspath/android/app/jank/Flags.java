package com.android.internal.hidden_from_bootclasspath.android.app.jank;

public final class Flags {
    public static final java.lang.String FLAG_DETAILED_APP_JANK_METRICS_API = "android.app.jank.detailed_app_jank_metrics_api";
    public static final java.lang.String FLAG_DETAILED_APP_JANK_METRICS_LOGGING_ENABLED = "android.app.jank.detailed_app_jank_metrics_logging_enabled";
    public static final java.lang.String FLAG_DISABLE_USER_BUILD_JANK_METRICS = "android.app.jank.disable_user_build_jank_metrics";
    public static final java.lang.String FLAG_INSTRUMENT_LISTVIEW_SCROLL_STATES = "android.app.jank.instrument_listview_scroll_states";
    public static final java.lang.String FLAG_INSTRUMENT_SCROLLVIEW_SCROLL_STATES = "android.app.jank.instrument_scrollview_scroll_states";
    public static final java.lang.String FLAG_VIEWROOT_CHOREOGRAPHER = "android.app.jank.viewroot_choreographer";
    public Flags() {}
    public static boolean detailedAppJankMetricsApi() { return false; }
    public static boolean detailedAppJankMetricsLoggingEnabled() { return false; }
    public static boolean disableUserBuildJankMetrics() { return false; }
    public static boolean instrumentListviewScrollStates() { return false; }
    public static boolean instrumentScrollviewScrollStates() { return false; }
    public static boolean viewrootChoreographer() { return false; }
}
