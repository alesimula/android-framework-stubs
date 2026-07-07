package android.os;

public final class PowerMonitorReadings {
    public static final int ENERGY_UNAVAILABLE = -1;
    @android.annotation.SystemApi
    public static final int GRANULARITY_FINE = 1;
    @android.annotation.SystemApi
    public static final int GRANULARITY_UNSPECIFIED = 0;
    private static final java.util.Comparator<android.os.PowerMonitor> POWER_MONITOR_COMPARATOR = null;
    private final long[] mEnergyUws = null;
    private final int mGranularity = 0;
    private final android.os.PowerMonitor[] mPowerMonitors = null;
    private final long[] mTimestampsMs = null;
    public PowerMonitorReadings(android.os.PowerMonitor[] p0, long[] p1, long[] p2, int p3) {}
    public long getConsumedEnergy(android.os.PowerMonitor p0) { return 0L; }
    @android.annotation.SystemApi
    public int getGranularity() { return 0; }
    public long getTimestampMillis(android.os.PowerMonitor p0) { return 0L; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PowerMonitorGranularity {
    }
}
