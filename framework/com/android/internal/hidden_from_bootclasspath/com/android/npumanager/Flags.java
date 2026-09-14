package com.android.internal.hidden_from_bootclasspath.com.android.npumanager;

public final class Flags {
    public static final java.lang.String FLAG_DEFAULT_POLICY_CONFIG = "com.android.npumanager.default_policy_config";
    public static final java.lang.String FLAG_MEMORY_PREEMPT_REUSE = "com.android.npumanager.memory_preempt_reuse";
    public static final java.lang.String FLAG_NPUMANAGER_ENABLED = "com.android.npumanager.npumanager_enabled";
    public static final java.lang.String FLAG_OPPORTUNISTIC_PRIORITY = "com.android.npumanager.opportunistic_priority";
    public static final java.lang.String FLAG_REQUEST_UNLOAD_REASON = "com.android.npumanager.request_unload_reason";
    public static final java.lang.String FLAG_WORK_STATUS_LISTENER = "com.android.npumanager.work_status_listener";
    public Flags() {}
    public static boolean defaultPolicyConfig() { return false; }
    public static boolean memoryPreemptReuse() { return false; }
    public static boolean npumanagerEnabled() { return false; }
    public static boolean opportunisticPriority() { return false; }
    public static boolean requestUnloadReason() { return false; }
    public static boolean workStatusListener() { return false; }
}
