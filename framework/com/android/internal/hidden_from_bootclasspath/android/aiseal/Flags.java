package com.android.internal.hidden_from_bootclasspath.android.aiseal;

public final class Flags {
    public static final java.lang.String FLAG_AISEAL_ENABLE_RAMDUMP = "android.aiseal.aiseal_enable_ramdump";
    public static final java.lang.String FLAG_AISEAL_HOST_APIS = "android.aiseal.aiseal_host_apis";
    public static final java.lang.String FLAG_AISEAL_MEMORY_SHARING_API = "android.aiseal.aiseal_memory_sharing_api";
    public Flags() {}
    public static boolean aisealEnableRamdump() { return false; }
    public static boolean aisealHostApis() { return false; }
    public static boolean aisealMemorySharingApi() { return false; }
}
