package android.database.sqlite;

public final class SQLiteGlobal {
    public static final java.lang.String SYNC_MODE_FULL = "FULL";
    private static final java.lang.String TAG = "SQLiteGlobal";
    static final java.lang.String WIPE_CHECK_FILE_SUFFIX = "-wipecheck";
    private static int sDefaultPageSize;
    public static volatile java.lang.String sDefaultSyncMode;
    private static final java.lang.Object sLock = null;
    private SQLiteGlobal() {}
    public static boolean checkDbWipe() { return false; }
    private static java.lang.String getDataPathForBlockSizeCheck() { return null; }
    private static java.lang.String getDataPathForBlockSizeCheck$ravenwood() { return null; }
    public static java.lang.String getDefaultJournalMode() { return null; }
    public static int getDefaultPageSize() { return 0; }
    public static java.lang.String getDefaultSyncMode() { return null; }
    public static int getIdleConnectionTimeout() { return 0; }
    public static int getJournalSizeLimit() { return 0; }
    public static int getWALAutoCheckpoint() { return 0; }
    public static int getWALConnectionPoolSize() { return 0; }
    public static java.lang.String getWALSyncMode() { return null; }
    public static long getWALTruncateSize() { return 0L; }
    private static native int nativeReleaseMemory();
    public static int releaseMemory() { return 0; }
}
