package com.android.internal.hidden_from_bootclasspath.android.provider.flags;

public final class Flags {
    private static com.android.internal.hidden_from_bootclasspath.android.provider.flags.FeatureFlags FEATURE_FLAGS;
    public static final java.lang.String FLAG_ANGLE_DYNAMIC_DENYLIST = "android.provider.flags.angle_dynamic_denylist";
    public static final java.lang.String FLAG_DEVICE_CONFIG_WRITABLE_NAMESPACES_API = "android.provider.flags.device_config_writable_namespaces_api";
    public static final java.lang.String FLAG_DUMP_IMPROVEMENTS = "android.provider.flags.dump_improvements";
    public static final java.lang.String FLAG_MMD_DEVICE_CONFIG = "android.provider.flags.mmd_device_config";
    public static final java.lang.String FLAG_NEW_STORAGE_PUBLIC_API = "android.provider.flags.new_storage_public_api";
    public static final java.lang.String FLAG_NEW_STORAGE_WRITER_SYSTEM_API = "android.provider.flags.new_storage_writer_system_api";
    public static final java.lang.String FLAG_PUBLIC_INTERNAL_READ_API = "android.provider.flags.public_internal_read_api";
    public Flags() {}
    public static boolean angleDynamicDenylist() { return false; }
    public static boolean deviceConfigWritableNamespacesApi() { return false; }
    public static boolean dumpImprovements() { return false; }
    public static boolean mmdDeviceConfig() { return false; }
    public static boolean newStoragePublicApi() { return false; }
    public static boolean newStorageWriterSystemApi() { return false; }
    public static boolean publicInternalReadApi() { return false; }
}
