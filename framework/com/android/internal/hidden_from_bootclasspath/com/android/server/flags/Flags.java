package com.android.internal.hidden_from_bootclasspath.com.android.server.flags;

public final class Flags {
    public static final java.lang.String FLAG_DISABLE_SYSTEM_COMPACTION = "com.android.server.flags.disable_system_compaction";
    public static final java.lang.String FLAG_ENABLE_FILESYSTEM_CONFIGURATION_V2 = "com.android.server.flags.enable_filesystem_configuration_v2";
    public static final java.lang.String FLAG_FIX_KEYSTORE_MEMORY_CLEANUP = "com.android.server.flags.fix_keystore_memory_cleanup";
    public static final java.lang.String FLAG_PARALLELIZE_ONBOOTPHASE = "com.android.server.flags.parallelize_onbootphase";
    public static final java.lang.String FLAG_PINNER_LIST_EMPTY = "com.android.server.flags.pinner_list_empty";
    public static final java.lang.String FLAG_PINNER_LIST_REMOVE_WEAR_APKS = "com.android.server.flags.pinner_list_remove_wear_apks";
    public static final java.lang.String FLAG_RESET_KEYGUARD_FIRST_STATE_DISPATCH_ON_SERVICE_CONNECTED = "com.android.server.flags.reset_keyguard_first_state_dispatch_on_service_connected";
    public Flags() {}
    public static boolean disableSystemCompaction() { return false; }
    public static boolean enableFilesystemConfigurationV2() { return false; }
    public static boolean fixKeystoreMemoryCleanup() { return false; }
    public static boolean parallelizeOnbootphase() { return false; }
    public static boolean pinnerListEmpty() { return false; }
    public static boolean pinnerListRemoveWearApks() { return false; }
    public static boolean resetKeyguardFirstStateDispatchOnServiceConnected() { return false; }
}
