package android.app.privatecompute;

public final class PccSandboxManager {
    private static final java.lang.String CLIENT_PROVIDED_TIMESTAMP_KEY = "client_timestamp";
    private static final int DEFAULT_FLUSH_AGE_MS = 10000;
    private static final int DEFAULT_MAX_BATCH_SIZE = 100;
    private static final long MS_TO_NS = 1000000L;
    @android.annotation.SystemApi
    public static final int STATUS_ALL = 2;
    @android.annotation.SystemApi
    public static final int STATUS_LIMITED = 1;
    @android.annotation.SystemApi
    public static final int STATUS_OFF = 0;
    private java.util.List<android.os.PersistableBundle> mAuditLogBatch;
    private final android.content.Context mContext = null;
    private final android.app.privatecompute.PccSandboxManager.Injector mInjector = null;
    private final java.util.Map<java.util.function.Consumer<java.lang.Integer>, android.app.privatecompute.IAuditModeStatusListener> mListeners = null;
    private final java.lang.Object mLock = null;
    private final android.app.privatecompute.IPccSandboxManager mService = null;
    public PccSandboxManager(android.app.privatecompute.IPccSandboxManager p0, android.content.Context p1) {}
    public PccSandboxManager(android.app.privatecompute.IPccSandboxManager p0, android.content.Context p1, android.app.privatecompute.PccSandboxManager.Injector p2) {}
    private void handleFailure(android.os.ParcelableException p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<?, android.app.privatecompute.PccAuditException> p2) {}
    boolean addAuditEntryToBatchAndFlushIfNeeded(android.os.PersistableBundle p0) { return false; }
    @android.annotation.SystemApi
    public void clearAuditLogs(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, android.app.privatecompute.PccAuditException> p1) {}
    public <T extends android.app.privatecompute.EgressResponse> void egressData(android.app.privatecompute.EgressRequest<T> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<T, android.app.privatecompute.PccEgressException> p2) {}
    @android.annotation.SystemApi
    public void exportAuditLogData(android.os.ParcelFileDescriptor p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.app.privatecompute.PccAuditException> p2) {}
    @android.annotation.SystemApi
    public void getAuditLogData(android.app.privatecompute.AuditLogDataQuery p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.util.List<android.app.privatecompute.AuditLogDataEntry>, android.app.privatecompute.PccAuditException> p2) {}
    @android.annotation.SystemApi
    public void getAuditLogMetadata(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.app.privatecompute.AuditLogMetadata, android.app.privatecompute.PccAuditException> p1) {}
    @android.annotation.SystemApi
    public int getAuditModeStatus() { return 0; }
    public boolean isPccTrustedSystemComponent(int p0, java.lang.String p1) { return false; }
    public boolean isPrivateComputeServicesUid(int p0) { return false; }
    @android.annotation.SystemApi
    public void registerAuditModeStatusListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    @android.annotation.SystemApi
    public void setAuditModeStatus(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.app.privatecompute.PccAuditException> p2) {}
    public void startNonPccProcessForDataMigration(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.app.privatecompute.MigrationRequestResult, android.app.privatecompute.MigrationException> p1) {}
    @android.annotation.SystemApi
    public void unregisterAuditModeStatusListener(java.util.function.Consumer<java.lang.Integer> p0) {}
    public void writeToAuditLog(android.os.PersistableBundle p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AuditStatus {
    }

    public static class Injector {
        public Injector() {}
        public boolean auditModeBatchingEnabled() { return false; }
        public long auditModeFlushAgeNanos() { return 0L; }
        public int auditModeMaxBatchSize() { return 0; }
        public long clientTimestampNanos() { return 0L; }
    }
}
