package com.android.internal.hidden_from_bootclasspath.android.crashrecovery.flags;

public final class Flags {
    public static final java.lang.String FLAG_ALLOW_RESCUE_PARTY_FLAG_RESETS = "android.crashrecovery.flags.allow_rescue_party_flag_resets";
    public static final java.lang.String FLAG_ENABLE_CRASHRECOVERY = "android.crashrecovery.flags.enable_crashrecovery";
    public static final java.lang.String FLAG_RECOVERABILITY_DETECTION = "android.crashrecovery.flags.recoverability_detection";
    public static final java.lang.String FLAG_SYNCHRONOUS_REBOOT_IN_RESCUE_PARTY = "android.crashrecovery.flags.synchronous_reboot_in_rescue_party";
    public Flags() {}
    public static boolean allowRescuePartyFlagResets() { return false; }
    public static boolean enableCrashrecovery() { return false; }
    public static boolean recoverabilityDetection() { return false; }
    public static boolean synchronousRebootInRescueParty() { return false; }
}
