package com.android.internal.hidden_from_bootclasspath.com.android.telephony.flags;

final class FeatureFlagsImpl implements com.android.internal.hidden_from_bootclasspath.com.android.telephony.flags.FeatureFlags {
    private static final java.lang.String TAG = "FeatureFlagsImplExport";
    private static boolean enableOnsMainlineApi;
    private static volatile boolean isCached;
    private static boolean phoneNumberParsingApi;
    private static boolean supportGetPhoneNumberTs43;
    FeatureFlagsImpl() {}
    private void init() {}
    public boolean enableOnsMainlineApi() { return false; }
    public boolean phoneNumberParsingApi() { return false; }
    public boolean supportGetPhoneNumberTs43() { return false; }
}
