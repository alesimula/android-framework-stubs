package com.android.internal.hidden_from_bootclasspath.android.bluetooth.platform.flags;

public final class Flags {
    public static final java.lang.String FLAG_BLUETOOTH_PAIRING_HARDENING = "android.bluetooth.platform.flags.bluetooth_pairing_hardening";
    public static final java.lang.String FLAG_MANAGE_BONDS_BY_TRANSPORT = "android.bluetooth.platform.flags.manage_bonds_by_transport";
    public Flags() {}
    public static boolean bluetoothPairingHardening() { return false; }
    public static boolean manageBondsByTransport() { return false; }
}
