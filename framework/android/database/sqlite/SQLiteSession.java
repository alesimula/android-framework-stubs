package android.database.sqlite;

public final class SQLiteSession {
    static final boolean $assertionsDisabled = false;
    public static final int TRANSACTION_MODE_DEFERRED = 0;
    public static final int TRANSACTION_MODE_EXCLUSIVE = 2;
    public static final int TRANSACTION_MODE_IMMEDIATE = 1;
    private android.database.sqlite.SQLiteConnection mConnection;
    private int mConnectionFlags;
    private final android.database.sqlite.SQLiteConnectionPool mConnectionPool = null;
    private int mConnectionUseCount;
    private final java.util.ArrayDeque<java.io.Closeable> mOpenDependents = null;
    private android.database.sqlite.SQLiteSession.Transaction mTransactionPool;
    private android.database.sqlite.SQLiteSession.Transaction mTransactionStack;
    public SQLiteSession(android.database.sqlite.SQLiteConnectionPool p0) {}
    private void acquireConnection(java.lang.String p0, int p1, android.os.CancellationSignal p2) {}
    private void beginTransactionUnchecked(int p0, android.database.sqlite.SQLiteTransactionListener p1, int p2, android.os.CancellationSignal p3) {}
    private void endTransactionUnchecked(android.os.CancellationSignal p0, boolean p1) {}
    private boolean executeSpecial(java.lang.String p0, java.lang.Object[] p1, int p2, android.os.CancellationSignal p3) { return false; }
    private java.lang.String modeString(int p0) { return null; }
    private android.database.sqlite.SQLiteSession.Transaction obtainTransaction(int p0, android.database.sqlite.SQLiteTransactionListener p1) { return null; }
    private void recycleTransaction(android.database.sqlite.SQLiteSession.Transaction p0) {}
    private void releaseConnection() {}
    private void throwIfNestedTransaction() {}
    private void throwIfTransactionMarkedSuccessful() {}
    private boolean yieldTransactionUnchecked(long p0, android.os.CancellationSignal p1) { return false; }
    android.database.sqlite.SQLiteConnection.PreparedStatement acquirePersistentStatement(java.lang.String p0, java.io.Closeable p1) { return null; }
    public void beginTransaction(int p0, android.database.sqlite.SQLiteTransactionListener p1, int p2, android.os.CancellationSignal p3) {}
    void closeOpenDependents() {}
    public void endTransaction(android.os.CancellationSignal p0) {}
    public void execute(java.lang.String p0, java.lang.Object[] p1, int p2, android.os.CancellationSignal p3) {}
    public android.os.ParcelFileDescriptor executeForBlobFileDescriptor(java.lang.String p0, java.lang.Object[] p1, int p2, android.os.CancellationSignal p3) { return null; }
    public int executeForChangedRowCount(java.lang.String p0, java.lang.Object[] p1, int p2, android.os.CancellationSignal p3) { return 0; }
    public int executeForCursorWindow(java.lang.String p0, java.lang.Object[] p1, android.database.CursorWindow p2, int p3, int p4, boolean p5, int p6, android.os.CancellationSignal p7) { return 0; }
    public long executeForLastInsertedRowId(java.lang.String p0, java.lang.Object[] p1, int p2, android.os.CancellationSignal p3) { return 0L; }
    public long executeForLong(java.lang.String p0, java.lang.Object[] p1, int p2, android.os.CancellationSignal p3) { return 0L; }
    public java.lang.String executeForString(java.lang.String p0, java.lang.Object[] p1, int p2, android.os.CancellationSignal p3) { return null; }
    long getLastChangedRowCount() { return 0L; }
    long getLastInsertRowId() { return 0L; }
    long getTotalChangedRowCount() { return 0L; }
    public boolean hasConnection() { return false; }
    public boolean hasNestedTransaction() { return false; }
    public boolean hasTransaction() { return false; }
    public void prepare(java.lang.String p0, int p1, android.os.CancellationSignal p2, android.database.sqlite.SQLiteStatementInfo p3) {}
    void releasePersistentStatement(android.database.sqlite.SQLiteConnection.PreparedStatement p0, java.io.Closeable p1) {}
    public void setTransactionSuccessful() {}
    void throwIfNoTransaction() {}
    public boolean yieldTransaction(long p0, boolean p1, android.os.CancellationSignal p2) { return false; }

    private static final class Transaction {
        public boolean mChildFailed;
        public android.database.sqlite.SQLiteTransactionListener mListener;
        public boolean mMarkedSuccessful;
        public int mMode;
        public android.database.sqlite.SQLiteSession.Transaction mParent;
        private Transaction() {}
    }
}
