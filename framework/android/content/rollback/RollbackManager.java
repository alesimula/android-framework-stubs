package android.content.rollback;

@android.annotation.SystemApi
public final class RollbackManager {
    public static final java.lang.String EXTRA_STATUS = "android.content.rollback.extra.STATUS";
    public static final java.lang.String EXTRA_STATUS_MESSAGE = "android.content.rollback.extra.STATUS_MESSAGE";
    public static final java.lang.String PROPERTY_ROLLBACK_LIFETIME_MILLIS = "rollback_lifetime_in_millis";
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_FAILURE_INSTALL = 3;
    public static final int STATUS_FAILURE_ROLLBACK_UNAVAILABLE = 2;
    public static final int STATUS_SUCCESS = 0;
    private final android.content.rollback.IRollbackManager mBinder = null;
    private final java.lang.String mCallerPackageName = null;
    public RollbackManager(android.content.Context p0, android.content.rollback.IRollbackManager p1) {}
    public void blockRollbackManager(long p0) {}
    public void commitRollback(int p0, java.util.List<android.content.pm.VersionedPackage> p1, android.content.IntentSender p2) {}
    public void expireRollbackForPackage(java.lang.String p0) {}
    public java.util.List<android.content.rollback.RollbackInfo> getAvailableRollbacks() { return null; }
    public java.util.List<android.content.rollback.RollbackInfo> getRecentlyCommittedRollbacks() { return null; }
    public void reloadPersistedData() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
