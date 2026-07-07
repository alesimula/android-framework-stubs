package android.database.sqlite;

public final class SQLiteDebug {
    private SQLiteDebug() {}
    public static void dump(android.util.Printer p0, java.lang.String[] p1) {}
    public static void dump(android.util.Printer p0, java.lang.String[] p1, boolean p2) {}
    public static android.database.sqlite.SQLiteDebug.PagerStats getDatabaseInfo() { return null; }
    private static native void nativeGetPagerStats(android.database.sqlite.SQLiteDebug.PagerStats p0);
    public static boolean shouldLogSlowQuery(long p0) { return false; }

    public static class DbStats {
        public final boolean arePoolStats = false;
        public int cacheHits;
        public int cacheMisses;
        public int cacheSize;
        public java.lang.String dbName;
        public long dbSize;
        public int lookaside;
        public long pageSize;
        public DbStats(java.lang.String p0, long p1, long p2, int p3, int p4, int p5, int p6, boolean p7) {}
        void addCacheStatsFrom(android.database.sqlite.SQLiteConnection p0) {}
    }

    public static final class NoPreloadHolder {
        public static final boolean DEBUG_LOG_DETAILED = Boolean.valueOf(false);
        public static final boolean DEBUG_LOG_SLOW_QUERIES = Boolean.valueOf(false);
        public static final boolean DEBUG_SQL_LOG = Boolean.valueOf(false);
        public static final boolean DEBUG_SQL_STATEMENTS = Boolean.valueOf(false);
        public static final boolean DEBUG_SQL_TIME = Boolean.valueOf(false);
        public static final boolean NO_DOUBLE_QUOTED_STRS = Boolean.valueOf(false);
        private static final java.lang.String SLOW_QUERY_THRESHOLD_PROP = "db.log.slow_query_threshold";
        private static final java.lang.String SLOW_QUERY_THRESHOLD_UID_PROP = null;
        public NoPreloadHolder() {}
    }

    public static class PagerStats {
        public java.util.ArrayList<android.database.sqlite.SQLiteDebug.DbStats> dbStats;
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
        public PagerStats() {}
    }
}
