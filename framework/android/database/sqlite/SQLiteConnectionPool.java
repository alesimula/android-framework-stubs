package android.database.sqlite;

public final class SQLiteConnectionPool implements java.io.Closeable {
    static final boolean $assertionsDisabled = false;
    public static final int CONNECTION_FLAG_INTERACTIVE = 4;
    public static final int CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY = 2;
    public static final int CONNECTION_FLAG_READ_ONLY = 1;
    private static final long CONNECTION_POOL_BUSY_MILLIS = 30000L;
    private static final java.lang.String TAG = "SQLiteConnectionPool";
    private final java.util.WeakHashMap<android.database.sqlite.SQLiteConnection, android.database.sqlite.SQLiteConnectionPool.AcquiredConnectionStatus> mAcquiredConnections = null;
    private final java.util.ArrayList<android.database.sqlite.SQLiteConnection> mAvailableNonPrimaryConnections = null;
    private android.database.sqlite.SQLiteConnection mAvailablePrimaryConnection;
    private java.lang.Throwable mClosedBy;
    private final android.database.sqlite.SQLiteDatabaseConfiguration mConfiguration = null;
    private final java.util.concurrent.atomic.AtomicBoolean mConnectionLeaked = null;
    private android.database.sqlite.SQLiteConnectionPool.ConnectionWaiter mConnectionWaiterPool;
    private android.database.sqlite.SQLiteConnectionPool.ConnectionWaiter mConnectionWaiterQueue;
    private long mDatabaseSeqNum;
    private android.database.sqlite.SQLiteConnectionPool.IdleConnectionHandler mIdleConnectionHandler;
    private boolean mIsOpen;
    private final java.lang.Object mLock = null;
    private int mMaxConnectionPoolSize;
    private int mNextConnectionId;
    private final java.util.concurrent.atomic.AtomicLong mTotalStatementsCount = null;
    private final java.util.concurrent.atomic.AtomicLong mTotalStatementsTime = null;
    private SQLiteConnectionPool(android.database.sqlite.SQLiteDatabaseConfiguration p0) {}
    private void cancelConnectionWaiterLocked(android.database.sqlite.SQLiteConnectionPool.ConnectionWaiter p0) {}
    private boolean closeAvailableConnectionLocked(int p0) { return false; }
    private void closeAvailableConnectionsAndLogExceptionsLocked() {}
    private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked() {}
    private void closeConnectionAndLogExceptionsLocked(android.database.sqlite.SQLiteConnection p0) {}
    private void closeExcessConnectionsAndLogExceptionsLocked() {}
    private void discardAcquiredConnectionsLocked() {}
    private void dispose(boolean p0) {}
    private void finishAcquireConnectionLocked(android.database.sqlite.SQLiteConnection p0, int p1) {}
    private static int getPriority(int p0) { return 0; }
    private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean p0, int p1) { return false; }
    private void logConnectionPoolBusyLocked(long p0, int p1) {}
    private void markAcquiredConnectionsLocked(android.database.sqlite.SQLiteConnectionPool.AcquiredConnectionStatus p0) {}
    private android.database.sqlite.SQLiteConnectionPool.ConnectionWaiter obtainConnectionWaiterLocked(java.lang.Thread p0, long p1, int p2, boolean p3, java.lang.String p4, int p5) { return null; }
    public static android.database.sqlite.SQLiteConnectionPool open(android.database.sqlite.SQLiteDatabaseConfiguration p0) { return null; }
    private void open() {}
    private android.database.sqlite.SQLiteConnection openConnectionLocked(android.database.sqlite.SQLiteDatabaseConfiguration p0, boolean p1) { return null; }
    private void reconfigureAllConnectionsLocked() {}
    private boolean recycleConnectionLocked(android.database.sqlite.SQLiteConnection p0, android.database.sqlite.SQLiteConnectionPool.AcquiredConnectionStatus p1) { return false; }
    private void recycleConnectionWaiterLocked(android.database.sqlite.SQLiteConnectionPool.ConnectionWaiter p0) {}
    private void setMaxConnectionPoolSizeLocked() {}
    private void throwIfClosedLocked() {}
    private android.database.sqlite.SQLiteConnection tryAcquireNonPrimaryConnectionLocked(java.lang.String p0, int p1) { return null; }
    private android.database.sqlite.SQLiteConnection tryAcquirePrimaryConnectionLocked(int p0) { return null; }
    private android.database.sqlite.SQLiteConnection waitForConnection(java.lang.String p0, int p1, android.os.CancellationSignal p2) { return null; }
    private void wakeConnectionWaitersLocked() {}
    public android.database.sqlite.SQLiteConnection acquireConnection(java.lang.String p0, int p1, android.os.CancellationSignal p2) { return null; }
    void clearAcquiredConnectionsPreparedStatementCache() {}
    public void close() {}
    void closeAvailableNonPrimaryConnectionsAndLogExceptions() {}
    public void collectDbStats(java.util.ArrayList<android.database.sqlite.SQLiteDebug.DbStats> p0) {}
    void disableIdleConnectionHandler() {}
    public void dump(android.util.Printer p0, boolean p1, android.util.ArraySet<java.lang.String> p2) {}
    protected void finalize() throws java.lang.Throwable {}
    public java.lang.String getPath() { return null; }
    public double getStatementCacheMissRate() { return 0.0; }
    public long getTotalStatementsCount() { return 0L; }
    public long getTotalStatementsTime() { return 0L; }
    public boolean hasAnyAvailableNonPrimaryConnection() { return false; }
    void onConnectionLeaked() {}
    void onStatementExecuted(long p0) {}
    public void reconfigure(android.database.sqlite.SQLiteDatabaseConfiguration p0) {}
    public void releaseConnection(android.database.sqlite.SQLiteConnection p0) {}
    public void setupIdleConnectionHandler(android.os.Looper p0, long p1, java.lang.Runnable p2) {}
    public boolean shouldYieldConnection(android.database.sqlite.SQLiteConnection p0, int p1) { return false; }
    public java.lang.String toString() { return null; }

    static enum AcquiredConnectionStatus {
        DISCARD,
        NORMAL,
        RECONFIGURE;
        private static final android.database.sqlite.SQLiteConnectionPool.AcquiredConnectionStatus[] $VALUES = null;
        private AcquiredConnectionStatus() {}
    }

    private static final class ConnectionWaiter {
        public android.database.sqlite.SQLiteConnection mAssignedConnection;
        public int mConnectionFlags;
        public java.lang.RuntimeException mException;
        public android.database.sqlite.SQLiteConnectionPool.ConnectionWaiter mNext;
        public int mNonce;
        public int mPriority;
        public java.lang.String mSql;
        public long mStartTime;
        public java.lang.Thread mThread;
        public boolean mWantPrimaryConnection;
        private ConnectionWaiter() {}
    }

    private class IdleConnectionHandler extends android.os.Handler {
        private final java.lang.Runnable mOnAllConnectionsIdle = null;
        private final long mTimeout = 0L;
        IdleConnectionHandler(android.database.sqlite.SQLiteConnectionPool p0, android.os.Looper p1, long p2, java.lang.Runnable p3) { super(); }
        void connectionAcquired(android.database.sqlite.SQLiteConnection p0) {}
        void connectionClosed(android.database.sqlite.SQLiteConnection p0) {}
        void connectionReleased(android.database.sqlite.SQLiteConnection p0) {}
        public void handleMessage(android.os.Message p0) {}
    }
}
