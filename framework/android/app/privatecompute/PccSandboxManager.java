package android.app.privatecompute;

public final class PccSandboxManager {
    private static final java.lang.String CLIENT_PROVIDED_TIMESTAMP_KEY = "client_timestamp";
    private static final int DEFAULT_FLUSH_AGE_MS = 10000;
    private static final int DEFAULT_MAX_BATCH_SIZE = 100;
    private static final long MS_TO_NS = 1000000L;
    private java.util.List<android.os.PersistableBundle> mAuditLogBatch;
    private final android.content.Context mContext = null;
    private final android.app.privatecompute.PccSandboxManager.Injector mInjector = null;
    private final java.lang.Object mLock = null;
    private final android.app.privatecompute.IPccSandboxManager mService = null;
    public PccSandboxManager(android.app.privatecompute.IPccSandboxManager p0, android.content.Context p1) {}
    public PccSandboxManager(android.app.privatecompute.IPccSandboxManager p0, android.content.Context p1, android.app.privatecompute.PccSandboxManager.Injector p2) {}
    boolean addAuditEntryToBatchAndFlushIfNeeded(android.os.PersistableBundle p0) { return false; }
    public boolean isPccTrustedSystemComponent(int p0, java.lang.String p1) { return false; }
    public boolean isPrivateComputeServicesUid(int p0) { return false; }
    public void startNonPccProcessForDataMigration(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.app.privatecompute.MigrationRequestResult, android.app.privatecompute.MigrationException> p1) {}
    public void writeToAuditLog(android.os.PersistableBundle p0) {}

    public static class Injector {
        public Injector() {}
        public boolean auditModeBatchingEnabled() { return false; }
        public long auditModeFlushAgeNanos() { return 0L; }
        public int auditModeMaxBatchSize() { return 0; }
        public long clientTimestampNanos() { return 0L; }
    }
}
