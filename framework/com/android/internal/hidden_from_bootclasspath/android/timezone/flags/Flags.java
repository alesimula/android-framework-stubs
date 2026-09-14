package com.android.internal.hidden_from_bootclasspath.android.timezone.flags;

public final class Flags {
    public static final java.lang.String FLAG_ADD_LTZP_UID_TO_DETECTOR_STATE = "android.timezone.flags.add_ltzp_uid_to_detector_state";
    public static final java.lang.String FLAG_ENABLE_FUSED_TIME_ZONE_DETECTOR = "android.timezone.flags.enable_fused_time_zone_detector";
    public static final java.lang.String FLAG_ENABLE_HOME_TIME_ZONE_API = "android.timezone.flags.enable_home_time_zone_api";
    public static final java.lang.String FLAG_EXPOSE_TIME_ZONE_SYSTEM_API = "android.timezone.flags.expose_time_zone_system_api";
    public static final java.lang.String FLAG_USE_ELAPSED_REALTIME_WAKEUP_FOR_NETWORK_TIME_UPDATE_SERVICE = "android.timezone.flags.use_elapsed_realtime_wakeup_for_network_time_update_service";
    public Flags() {}
    public static boolean addLtzpUidToDetectorState() { return false; }
    public static boolean enableFusedTimeZoneDetector() { return false; }
    public static boolean enableHomeTimeZoneApi() { return false; }
    public static boolean exposeTimeZoneSystemApi() { return false; }
    public static boolean useElapsedRealtimeWakeupForNetworkTimeUpdateService() { return false; }
}
