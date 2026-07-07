package android.database.sqlite;

public final class SQLiteDatabaseConfiguration {
    private static final java.util.regex.Pattern EMAIL_IN_DB_PATTERN = null;
    public static final java.lang.String MEMORY_DB_PATH = ":memory:";
    public final android.util.ArrayMap<java.lang.String, java.util.function.BinaryOperator<java.lang.String>> customAggregateFunctions = null;
    public final android.util.ArrayMap<java.lang.String, java.util.function.UnaryOperator<java.lang.String>> customScalarFunctions = null;
    public boolean foreignKeyConstraintsEnabled;
    public long idleConnectionTimeoutMs;
    public java.lang.String journalMode;
    public final java.lang.String label = null;
    public java.util.Locale locale;
    public int lookasideSlotCount;
    public int lookasideSlotSize;
    public int maxSqlCacheSize;
    public int openFlags;
    public final java.lang.String path = null;
    public final java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.Object[]>> perConnectionSql = null;
    public boolean shouldTruncateWalFile;
    public java.lang.String syncMode;
    public SQLiteDatabaseConfiguration(android.database.sqlite.SQLiteDatabaseConfiguration p0) {}
    public SQLiteDatabaseConfiguration(java.lang.String p0, int p1) {}
    private boolean isWalEnabledInternal() { return false; }
    private static java.lang.String stripPathForLogs(java.lang.String p0) { return null; }
    public boolean isInMemoryDb() { return false; }
    boolean isLegacyCompatibilityWalEnabled() { return false; }
    boolean isLookasideConfigSet() { return false; }
    public boolean isReadOnlyDatabase() { return false; }
    public java.lang.String resolveJournalMode() { return null; }
    public java.lang.String resolveSyncMode() { return null; }
    public void updateParametersFrom(android.database.sqlite.SQLiteDatabaseConfiguration p0) {}
}
