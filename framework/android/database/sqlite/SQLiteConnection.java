package android.database.sqlite;

public final class SQLiteConnection implements android.os.CancellationSignal.OnCancelListener {
    static final boolean $assertionsDisabled = false;
    private static final boolean DEBUG = false;
    private static final byte[] EMPTY_BYTE_ARRAY = null;
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    private static final java.lang.String TAG = "SQLiteConnection";
    private int mCancellationSignalAttachCount;
    private final android.database.sqlite.SQLiteDatabaseConfiguration mConfiguration = null;
    private final int mConnectionId = 0;
    private final java.lang.Object mConnectionLock = null;
    private long mConnectionPtr;
    private final boolean mIsPrimaryConnection = false;
    private final boolean mIsReadOnlyConnection = false;
    private boolean mOnlyAllowReadOnlyOperations;
    private final android.database.sqlite.SQLiteConnectionPool mPool = null;
    private final android.database.sqlite.SQLiteConnection.PreparedStatementCache mPreparedStatementCache = null;
    private final android.database.sqlite.SQLiteConnection.OperationLog mRecentOperations = null;
    private SQLiteConnection(android.database.sqlite.SQLiteConnectionPool p0, android.database.sqlite.SQLiteDatabaseConfiguration p1, int p2, boolean p3) {}
    private android.database.sqlite.SQLiteConnection.PreparedStatement acquirePreparedStatementLI(java.lang.String p0) { return null; }
    private void applyBlockGuardPolicy(android.database.sqlite.SQLiteConnection.PreparedStatement p0) {}
    private void attachCancellationSignal(android.os.CancellationSignal p0) {}
    private void bindArguments(android.database.sqlite.SQLiteConnection.PreparedStatement p0, java.lang.Object[] p1) {}
    private static java.lang.String canonicalizeSyncMode(java.lang.String p0) { return null; }
    private void checkDatabaseWiped() {}
    private void detachCancellationSignal(android.os.CancellationSignal p0) {}
    private void dispose(boolean p0) {}
    private void dumpActiveConfiguration(android.util.Printer p0) {}
    private void executePerConnectionSqlFromConfiguration(int p0) {}
    private void finalizePreparedStatement(android.database.sqlite.SQLiteConnection.PreparedStatement p0) {}
    private android.database.sqlite.SQLiteDebug.DbStats getMainDbStatsUnsafe(int p0, long p1, long p2) { return null; }
    private static boolean isCacheable(int p0) { return false; }
    private void maybeTruncateWalFile() {}
    private static native void nativeBindBlob(long p0, long p1, int p2, byte[] p3);
    private static native void nativeBindDouble(long p0, long p1, int p2, double p3);
    private static native void nativeBindLong(long p0, long p1, int p2, long p3);
    private static native void nativeBindNull(long p0, long p1, int p2);
    private static native void nativeBindString(long p0, long p1, int p2, java.lang.String p3);
    private static native void nativeCancel(long p0);
    private static native long nativeChanges(long p0);
    private static native void nativeClose(long p0, boolean p1);
    private static native void nativeExecute(long p0, long p1, boolean p2);
    private static native int nativeExecuteForBlobFileDescriptor(long p0, long p1);
    private static native int nativeExecuteForChangedRowCount(long p0, long p1);
    private static native long nativeExecuteForCursorWindow(long p0, long p1, long p2, int p3, int p4, boolean p5);
    private static native long nativeExecuteForLastInsertedRowId(long p0, long p1);
    private static native long nativeExecuteForLong(long p0, long p1);
    private static native java.lang.String nativeExecuteForString(long p0, long p1);
    private static native void nativeFinalizeStatement(long p0);
    private static native int nativeGetColumnCount(long p0, long p1);
    private static native java.lang.String nativeGetColumnName(long p0, long p1, int p2);
    private static native java.lang.String[] nativeGetDbConfig(long p0);
    private static native int nativeGetDbLookaside(long p0);
    private static native int nativeGetParameterCount(long p0, long p1);
    private static native boolean nativeIsReadOnly(long p0, long p1);
    private static native int nativeLastInsertRowId(long p0);
    private static native long nativeOpen(java.lang.String p0, int p1, java.lang.String p2, boolean p3, boolean p4, int p5, int p6);
    private static native long nativePrepareStatement(long p0, java.lang.String p1);
    private static native void nativeRegisterCustomAggregateFunction(long p0, java.lang.String p1, java.util.function.BinaryOperator<java.lang.String> p2);
    private static native void nativeRegisterCustomScalarFunction(long p0, java.lang.String p1, java.util.function.UnaryOperator<java.lang.String> p2);
    private static native void nativeRegisterLocalizedCollators(long p0, java.lang.String p1);
    private static native void nativeResetCancel(long p0, boolean p1);
    private static native void nativeResetStatementAndClearBindings(long p0, long p1);
    private static native long nativeTotalChanges(long p0);
    private static native boolean nativeUpdatesTempOnly(long p0, long p1);
    private android.database.sqlite.SQLiteConnection.PreparedStatement obtainPreparedStatement(java.lang.String p0, long p1, int p2, int p3, boolean p4, long p5) { return null; }
    static android.database.sqlite.SQLiteConnection open(android.database.sqlite.SQLiteConnectionPool p0, android.database.sqlite.SQLiteDatabaseConfiguration p1, int p2, boolean p3) { return null; }
    private void open() {}
    private void releasePreparedStatementLI(android.database.sqlite.SQLiteConnection.PreparedStatement p0) {}
    private void setAutoCheckpointInterval() {}
    private void setCustomFunctionsFromConfiguration() {}
    private void setForeignKeyModeFromConfiguration() {}
    private void setJournalFromConfiguration() {}
    private void setJournalMode(java.lang.String p0) {}
    private void setJournalSizeLimit() {}
    private void setLocaleFromConfiguration() {}
    private void setPageSize() {}
    private void setSyncMode(java.lang.String p0) {}
    private void setSyncModeFromConfiguration() {}
    private static java.lang.String trimSqlForDisplay(java.lang.String p0) { return null; }
    android.database.sqlite.SQLiteConnection.PreparedStatement acquirePersistentStatement(java.lang.String p0) { return null; }
    android.database.sqlite.SQLiteConnection.PreparedStatement acquirePreparedStatement(java.lang.String p0) { return null; }
    void close() {}
    void collectDbStats(java.util.ArrayList<android.database.sqlite.SQLiteDebug.DbStats> p0) {}
    void collectDbStatsUnsafe(java.util.ArrayList<android.database.sqlite.SQLiteDebug.DbStats> p0) {}
    java.lang.String describeCurrentOperationUnsafe() { return null; }
    public void dump(android.util.Printer p0, boolean p1) {}
    void dumpUnsafe(android.util.Printer p0, boolean p1) {}
    public void execute(java.lang.String p0, java.lang.Object[] p1, android.os.CancellationSignal p2) {}
    public android.os.ParcelFileDescriptor executeForBlobFileDescriptor(java.lang.String p0, java.lang.Object[] p1, android.os.CancellationSignal p2) { return null; }
    public int executeForChangedRowCount(java.lang.String p0, java.lang.Object[] p1, android.os.CancellationSignal p2) { return 0; }
    public int executeForCursorWindow(java.lang.String p0, java.lang.Object[] p1, android.database.CursorWindow p2, int p3, int p4, boolean p5, android.os.CancellationSignal p6) { return 0; }
    public long executeForLastInsertedRowId(java.lang.String p0, java.lang.Object[] p1, android.os.CancellationSignal p2) { return 0L; }
    public long executeForLong(java.lang.String p0, java.lang.Object[] p1, android.os.CancellationSignal p2) { return 0L; }
    public java.lang.String executeForString(java.lang.String p0, java.lang.Object[] p1, android.os.CancellationSignal p2) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public int getConnectionId() { return 0; }
    long getLastChangedRowCount() { return 0L; }
    long getLastInsertRowId() { return 0L; }
    int getPreparedStatementCacheHitCount() { return 0; }
    int getPreparedStatementCacheMissCount() { return 0; }
    int getPreparedStatementCacheSize() { return 0; }
    long getTotalChangedRowCount() { return 0L; }
    boolean isPreparedStatementInCache(java.lang.String p0) { return false; }
    public boolean isPrimaryConnection() { return false; }
    public void onCancel() {}
    public void prepare(java.lang.String p0, android.database.sqlite.SQLiteStatementInfo p1) {}
    void reconfigure(android.database.sqlite.SQLiteDatabaseConfiguration p0) {}
    void recordBeginTransaction(java.lang.String p0) {}
    void recordEndTransaction(boolean p0) {}
    void releasePreparedStatement(android.database.sqlite.SQLiteConnection.PreparedStatement p0) {}
    void setDatabaseSeqNum(long p0) {}
    void setOnlyAllowReadOnlyOperations(boolean p0) {}
    void throwIfStatementForbidden(android.database.sqlite.SQLiteConnection.PreparedStatement p0) {}
    public java.lang.String toString() { return null; }

    private final class Operation {
        private static final long EMPTY_OPERATION = -1L;
        private static final int MAX_TRACE_METHOD_NAME_LEN = 256;
        private static final java.time.format.DateTimeFormatter sDateTime = null;
        public java.util.ArrayList<java.lang.Object> mBindArgs;
        public int mCookie;
        public long mEndTime;
        public java.lang.Exception mException;
        public boolean mFinished;
        public java.lang.String mKind;
        public long mResultLong;
        public java.lang.String mResultString;
        public java.lang.String mSql;
        public long mStartTime;
        public long mStartWallTime;
        public boolean mTraced;
        private Operation(android.database.sqlite.SQLiteConnection p0) {}
        private java.lang.String getStatus() { return null; }
        private java.lang.String getTraceMethodName() { return null; }
        private java.lang.String timeString(long p0) { return null; }
        void copyFrom(android.database.sqlite.SQLiteConnection.Operation p0) {}
        public java.lang.String describe(int p0) { return null; }
        public void describe(java.lang.StringBuilder p0, boolean p1) {}
        boolean isEmpty() { return false; }
        void setEmpty() {}
        void start() {}
    }

    private final class OperationLog {
        private static final int COOKIE_GENERATION_SHIFT = 8;
        private static final int COOKIE_INDEX_MASK = 255;
        private static final long LONG_OPERATION_THRESHOLD_MS = 2000L;
        private static final int MAX_LONG_OPERATIONS = 10;
        private static final int MAX_RECENT_OPERATIONS = 20;
        private int mGeneration;
        private int mIndex;
        private final android.database.sqlite.SQLiteConnection.RateLimiter mLongLimiter = null;
        private final com.android.internal.util.RingBuffer<android.database.sqlite.SQLiteConnection.Operation> mLongOperations = null;
        private final android.database.sqlite.SQLiteConnection.Operation[] mOperations = null;
        private long mResultLong;
        private java.lang.String mResultString;
        private int mTotalLongOperations;
        private final java.lang.String mTraceTrackName = null;
        private final android.database.sqlite.SQLiteConnection.Operation mTransaction = null;
        OperationLog(android.database.sqlite.SQLiteConnection p0) {}
        private int dumpIfNotRecentLocked(android.util.Printer p0, android.database.sqlite.SQLiteConnection.Operation p1, int p2) { return 0; }
        private void dumpLongLocked(android.util.Printer p0) {}
        private void dumpRecentLocked(android.util.Printer p0) {}
        private boolean endOperationDeferLogLocked(int p0) { return false; }
        private long finishOperationLocked(android.database.sqlite.SQLiteConnection.Operation p0) { return 0L; }
        private android.database.sqlite.SQLiteConnection.Operation getOperationLocked(int p0) { return null; }
        private void logOperationLocked(int p0, java.lang.String p1) {}
        private int newOperationCookieLocked(int p0) { return 0; }
        private android.database.sqlite.SQLiteConnection.Operation newOperationLocked() { return null; }
        public int beginOperation(java.lang.String p0, java.lang.String p1, java.lang.Object[] p2) { return 0; }
        public void beginTransaction(java.lang.String p0) {}
        public java.lang.String describeCurrentOperation() { return null; }
        public void dump(android.util.Printer p0) {}
        public void endOperation(int p0) {}
        public boolean endOperationDeferLog(int p0) { return false; }
        public boolean endTransaction(boolean p0) { return false; }
        public void failOperation(int p0, java.lang.Exception p1) {}
        public long getTotalLongOperations() { return 0L; }
        public void logOperation(int p0, java.lang.String p1) {}
        public void setResult(long p0) {}
        public void setResult(java.lang.String p0) {}
    }

    static final class PreparedStatement {
        public boolean mInCache;
        public boolean mInUse;
        public int mNumParameters;
        public boolean mReadOnly;
        public long mSeqNum;
        public java.lang.String mSql;
        public long mStatementPtr;
        public int mType;
        PreparedStatement() {}
        void close() {}
    }

    private static final class PreparedStatementCache extends android.util.LruCache<java.lang.String, android.database.sqlite.SQLiteConnection.PreparedStatement> {
        private long mDatabaseSeqNum;
        private long mLastSeqNum;
        public PreparedStatementCache(int p0) { super(0); }
        long createStatement(long p0, java.lang.String p1) { return 0L; }
        public void dump(android.util.Printer p0) {}
        protected void entryRemoved(boolean p0, java.lang.String p1, android.database.sqlite.SQLiteConnection.PreparedStatement p2, android.database.sqlite.SQLiteConnection.PreparedStatement p3) {}
        public long getLastSeqNum() { return 0L; }
        public android.database.sqlite.SQLiteConnection.PreparedStatement getStatement(java.lang.String p0) { return null; }
        public void setDatabaseSeqNum(long p0) {}
    }

    private static class RateLimiter {
        private final long mCreationUptimeMs = 0L;
        private final int mMaxCredits = 0;
        private final long mMsPerCredit = 0L;
        private long mSpent;
        RateLimiter(long p0, int p1) {}
        boolean tryAcquire() { return false; }
    }
}
