package com.android.internal.hidden_from_bootclasspath.com.android.devicelock.flags;

final class FeatureFlagsImpl implements com.android.internal.hidden_from_bootclasspath.com.android.devicelock.flags.FeatureFlags {
    private static final java.lang.String TAG = "FeatureFlagsImplExport";
    private static boolean clearDeviceRestrictions;
    private static boolean deviceIdTypeSerial;
    private static boolean extraDeviceLockVersion;
    private static boolean getEnrollmentType;
    private static volatile boolean isCached;
    private static boolean notifyKioskSetupFinished;
    FeatureFlagsImpl() {}
    private void init() {}
    public boolean clearDeviceRestrictions() { return false; }
    public boolean deviceIdTypeSerial() { return false; }
    public boolean extraDeviceLockVersion() { return false; }
    public boolean getEnrollmentType() { return false; }
    public boolean notifyKioskSetupFinished() { return false; }
}
