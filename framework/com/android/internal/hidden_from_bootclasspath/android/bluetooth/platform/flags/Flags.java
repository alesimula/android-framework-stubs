package com.android.internal.hidden_from_bootclasspath.android.bluetooth.platform.flags;

public final class Flags {
    public static final java.lang.String FLAG_AUTONOMOUS_REPAIRING_INITIATION = "android.bluetooth.platform.flags.autonomous_repairing_initiation";
    public static final java.lang.String FLAG_BLUETOOTH_PAIRING_HARDENING = "android.bluetooth.platform.flags.bluetooth_pairing_hardening";
    public static final java.lang.String FLAG_STRICT_CONFIGURATION_IN_SYSTEM_SERVER = "android.bluetooth.platform.flags.strict_configuration_in_system_server";
    public Flags() {}
    public static boolean autonomousRepairingInitiation() { return false; }
    public static boolean bluetoothPairingHardening() { return false; }
    public static boolean strictConfigurationInSystemServer() { return false; }
}
