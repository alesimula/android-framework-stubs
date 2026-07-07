package com.android.internal.hidden_from_bootclasspath.com.android.sdksandbox.flags;

final class FeatureFlagsImpl implements com.android.internal.hidden_from_bootclasspath.com.android.sdksandbox.flags.FeatureFlags {
    private static final java.lang.String TAG = "FeatureFlagsImplExport";
    private static volatile boolean isCached;
    private static boolean sandboxActivitySdkBasedContext;
    private static boolean sandboxClientImportanceListener;
    private static boolean sdkSandboxInstrumentationInfo;
    private static boolean sdkSandboxUidToAppUidApi;
    private static boolean selinuxInputSelector;
    private static boolean selinuxSdkSandboxAudit;
    FeatureFlagsImpl() {}
    private void init() {}
    public boolean sandboxActivitySdkBasedContext() { return false; }
    public boolean sandboxClientImportanceListener() { return false; }
    public boolean sdkSandboxInstrumentationInfo() { return false; }
    public boolean sdkSandboxUidToAppUidApi() { return false; }
    public boolean selinuxInputSelector() { return false; }
    public boolean selinuxSdkSandboxAudit() { return false; }
}
