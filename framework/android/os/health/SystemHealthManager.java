package android.os.health;

public class SystemHealthManager {
    private static final java.util.Comparator<android.os.PowerMonitor> POWER_MONITOR_COMPARATOR = null;
    private static final java.lang.String TAG = "SystemHealthManager";
    private static final long TAKE_UID_SNAPSHOT_TIMEOUT_MILLIS = 10000L;
    private final com.android.internal.app.IBatteryStats mBatteryStats = null;
    private final android.os.IHintManager mHintManager = null;
    private final android.os.IHintManager.HintManagerClientData mHintManagerClientData = null;
    private final android.os.health.SystemHealthManager.PendingUidSnapshots mPendingUidSnapshots = null;
    private java.util.List<android.os.PowerMonitor> mPowerMonitorsInfo;
    private final java.lang.Object mPowerMonitorsLock = null;
    private final android.os.IPowerStatsService mPowerStats = null;
    public SystemHealthManager() {}
    public SystemHealthManager(com.android.internal.app.IBatteryStats p0, android.os.IPowerStatsService p1, android.os.IHintManager p2) {}
    public static android.os.health.SystemHealthManager from(android.content.Context p0) { return null; }
    public float getCpuHeadroom(android.os.CpuHeadroomParams p0) { return 0.0f; }
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getCpuHeadroomCalculationWindowRange() { return null; }
    public long getCpuHeadroomMinIntervalMillis() { return 0L; }
    public float getGpuHeadroom(android.os.GpuHeadroomParams p0) { return 0.0f; }
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getGpuHeadroomCalculationWindowRange() { return null; }
    public long getGpuHeadroomMinIntervalMillis() { return 0L; }
    public int getMaxCpuHeadroomTidsSize() { return 0; }
    public void getPowerMonitorReadings(java.util.List<android.os.PowerMonitor> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.os.PowerMonitorReadings, java.lang.RuntimeException> p2) {}
    public void getSupportedPowerMonitors(java.util.concurrent.Executor p0, java.util.function.Consumer<java.util.List<android.os.PowerMonitor>> p1) {}
    public android.os.health.HealthStats takeMyUidSnapshot() { return null; }
    public android.os.health.HealthStats takeUidSnapshot(int p0) { return null; }
    public android.os.health.HealthStats[] takeUidSnapshots(int[] p0) { return null; }

    private static class PendingUidSnapshots {
        public android.os.SynchronousResultReceiver resultReceiver;
        public int[] uids;
        private PendingUidSnapshots() {}
    }
}
