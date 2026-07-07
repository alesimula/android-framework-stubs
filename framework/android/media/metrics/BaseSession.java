package android.media.metrics;

abstract class BaseSession implements java.lang.AutoCloseable {
    protected final java.lang.String mId = null;
    private final android.media.metrics.LogSessionId mLogSessionId = null;
    protected final android.media.metrics.MediaMetricsManager mManager = null;
    BaseSession(java.lang.String p0, android.media.metrics.MediaMetricsManager p1) {}
    public void close() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.media.metrics.LogSessionId getSessionId() { return null; }
    public int hashCode() { return 0; }
    public void reportBundleMetrics(android.os.PersistableBundle p0) {}
}
