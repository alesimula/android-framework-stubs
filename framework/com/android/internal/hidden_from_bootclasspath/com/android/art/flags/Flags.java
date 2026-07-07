package com.android.internal.hidden_from_bootclasspath.com.android.art.flags;

public final class Flags {
    private static com.android.internal.hidden_from_bootclasspath.com.android.art.flags.FeatureFlags FEATURE_FLAGS;
    public static final java.lang.String FLAG_ALWAYS_ENABLE_PROFILE_CODE = "com.android.art.flags.always_enable_profile_code";
    public static final java.lang.String FLAG_ART_MANAGED_INSTALL_FILES_VALIDATION_API = "com.android.art.flags.art_managed_install_files_validation_api";
    public static final java.lang.String FLAG_ART_SERVICE_V3 = "com.android.art.flags.art_service_v3";
    public static final java.lang.String FLAG_EXECUTABLE_METHOD_FILE_OFFSETS = "com.android.art.flags.executable_method_file_offsets";
    public static final java.lang.String FLAG_EXECUTABLE_METHOD_FILE_OFFSETS_DEPRECATION = "com.android.art.flags.executable_method_file_offsets_deprecation";
    public static final java.lang.String FLAG_EXECUTABLE_METHOD_FILE_OFFSETS_V2 = "com.android.art.flags.executable_method_file_offsets_v2";
    public static final java.lang.String FLAG_PACKAGE_LAST_USED_API = "com.android.art.flags.package_last_used_api";
    public static final java.lang.String FLAG_UPDATABLE_FILTER_AND_REASON = "com.android.art.flags.updatable_filter_and_reason";
    public static final java.lang.String FLAG_VALUE_CLASSES = "com.android.art.flags.value_classes";
    public Flags() {}
    public static boolean alwaysEnableProfileCode() { return false; }
    public static boolean artManagedInstallFilesValidationApi() { return false; }
    public static boolean artServiceV3() { return false; }
    public static boolean executableMethodFileOffsets() { return false; }
    public static boolean executableMethodFileOffsetsDeprecation() { return false; }
    public static boolean executableMethodFileOffsetsV2() { return false; }
    public static boolean packageLastUsedApi() { return false; }
    public static boolean updatableFilterAndReason() { return false; }
    public static boolean valueClasses() { return false; }
}
