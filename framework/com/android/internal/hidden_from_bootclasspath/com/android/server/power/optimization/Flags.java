package com.android.internal.hidden_from_bootclasspath.com.android.server.power.optimization;

public final class Flags {
    public static final java.lang.String FLAG_DISABLE_COMPOSITE_BATTERY_USAGE_STATS_ATOMS = "com.android.server.power.optimization.disable_composite_battery_usage_stats_atoms";
    public static final java.lang.String FLAG_MEASURE_ENERGY_CONSUMED_RESULTS = "com.android.server.power.optimization.measure_energy_consumed_results";
    public static final java.lang.String FLAG_POWER_MONITOR_API = "com.android.server.power.optimization.power_monitor_api";
    public static final java.lang.String FLAG_STREAMLINED_CONNECTIVITY_BATTERY_STATS = "com.android.server.power.optimization.streamlined_connectivity_battery_stats";
    public static final java.lang.String FLAG_UID_PARENT_ATTRIBUTION_PREVENT_OVERWRITE = "com.android.server.power.optimization.uid_parent_attribution_prevent_overwrite";
    public static final java.lang.String FLAG_X86_CPU_ENERGY_ATTRIBUTION = "com.android.server.power.optimization.x86_cpu_energy_attribution";
    public Flags() {}
    public static boolean disableCompositeBatteryUsageStatsAtoms() { return false; }
    public static boolean measureEnergyConsumedResults() { return false; }
    public static boolean powerMonitorApi() { return false; }
    public static boolean streamlinedConnectivityBatteryStats() { return false; }
    public static boolean uidParentAttributionPreventOverwrite() { return false; }
    public static boolean x86CpuEnergyAttribution() { return false; }
}
