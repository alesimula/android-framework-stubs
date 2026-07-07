package android.net.metrics;

public class WakeupStats {
    private static final int NO_UID = -1;
    public long applicationWakeups;
    public final long creationTimeMs = 0L;
    public long durationSec;
    public final android.util.SparseIntArray ethertypes = null;
    public final java.lang.String iface = null;
    public final android.util.SparseIntArray ipNextHeaders = null;
    public long l2BroadcastCount;
    public long l2MulticastCount;
    public long l2UnicastCount;
    public long noUidWakeups;
    public long nonApplicationWakeups;
    public long rootWakeups;
    public long systemWakeups;
    public long totalWakeups;
    public WakeupStats(java.lang.String p0) {}
    private static void increment(android.util.SparseIntArray p0, int p1) {}
    public void countEvent(android.net.metrics.WakeupEvent p0) {}
    public java.lang.String toString() { return null; }
    public void updateDuration() {}
}
