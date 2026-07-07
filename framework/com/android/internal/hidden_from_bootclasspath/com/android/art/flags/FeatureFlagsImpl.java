package com.android.internal.hidden_from_bootclasspath.com.android.art.flags;

final class FeatureFlagsImpl implements com.android.internal.hidden_from_bootclasspath.com.android.art.flags.FeatureFlags {
    private static final java.lang.String TAG = "FeatureFlagsImplExport";
    private static boolean alwaysEnableProfileCode;
    private static boolean artManagedInstallFilesValidationApi;
    private static boolean artServiceV3;
    private static boolean executableMethodFileOffsets;
    private static boolean executableMethodFileOffsetsDeprecation;
    private static boolean executableMethodFileOffsetsV2;
    private static volatile boolean isCached;
    private static boolean packageLastUsedApi;
    private static boolean updatableFilterAndReason;
    private static boolean valueClasses;
    FeatureFlagsImpl() {}
    private void init() {}
    public boolean alwaysEnableProfileCode() { return false; }
    public boolean artManagedInstallFilesValidationApi() { return false; }
    public boolean artServiceV3() { return false; }
    public boolean executableMethodFileOffsets() { return false; }
    public boolean executableMethodFileOffsetsDeprecation() { return false; }
    public boolean executableMethodFileOffsetsV2() { return false; }
    public boolean packageLastUsedApi() { return false; }
    public boolean updatableFilterAndReason() { return false; }
    public boolean valueClasses() { return false; }
}
