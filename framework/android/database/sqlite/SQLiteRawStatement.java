package android.database.sqlite;

public final class SQLiteRawStatement implements java.io.Closeable {
    private static final int SQLITE_BUSY = 5;
    public static final int SQLITE_DATA_TYPE_BLOB = 4;
    public static final int SQLITE_DATA_TYPE_FLOAT = 2;
    public static final int SQLITE_DATA_TYPE_INTEGER = 1;
    public static final int SQLITE_DATA_TYPE_NULL = 5;
    public static final int SQLITE_DATA_TYPE_TEXT = 3;
    private static final int SQLITE_DONE = 101;
    private static final int SQLITE_LOCKED = 6;
    private static final int SQLITE_ROW = 100;
    private static final java.lang.String TAG = "SQLiteRawStatement";
    private final android.database.sqlite.SQLiteDatabase mDatabase = null;
    private android.database.sqlite.SQLiteConnection.PreparedStatement mPreparedStatement;
    private final android.database.sqlite.SQLiteSession mSession = null;
    private final java.lang.String mSql = null;
    private final long mStatement = 0L;
    private java.lang.Thread mThread;
    SQLiteRawStatement(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1) {}
    private static native void nativeBindBlob(long p0, int p1, byte[] p2, int p3, int p4);
    private static native void nativeBindDouble(long p0, int p1, double p2);
    private static native void nativeBindInt(long p0, int p1, int p2);
    private static native void nativeBindLong(long p0, int p1, long p2);
    private static native void nativeBindNull(long p0, int p1);
    private static native int nativeBindParameterCount(long p0);
    private static native int nativeBindParameterIndex(long p0, java.lang.String p1);
    private static native java.lang.String nativeBindParameterName(long p0, int p1);
    private static native void nativeBindText(long p0, int p1, java.lang.String p2);
    private static native void nativeClearBindings(long p0);
    private static native byte[] nativeColumnBlob(long p0, int p1);
    private static native int nativeColumnBuffer(long p0, int p1, byte[] p2, int p3, int p4, int p5);
    private static native int nativeColumnBytes(long p0, int p1);
    private static native int nativeColumnCount(long p0);
    private static native double nativeColumnDouble(long p0, int p1);
    private static native int nativeColumnInt(long p0, int p1);
    private static native long nativeColumnLong(long p0, int p1);
    private static native java.lang.String nativeColumnName(long p0, int p1);
    private static native java.lang.String nativeColumnText(long p0, int p1);
    private static native int nativeColumnType(long p0, int p1);
    private static native void nativeReset(long p0, boolean p1);
    private static native int nativeStep(long p0, boolean p1);
    private void throwIfInvalid() {}
    private void throwIfInvalidBounds(int p0, int p1, int p2) {}
    public void bindBlob(int p0, byte[] p1) {}
    public void bindBlob(int p0, byte[] p1, int p2, int p3) {}
    public void bindDouble(int p0, double p1) {}
    public void bindInt(int p0, int p1) {}
    public void bindLong(int p0, long p1) {}
    public void bindNull(int p0) {}
    public void bindText(int p0, java.lang.String p1) {}
    public void clearBindings() {}
    public void close() {}
    public byte[] getColumnBlob(int p0) { return null; }
    public double getColumnDouble(int p0) { return 0.0; }
    public int getColumnInt(int p0) { return 0; }
    public int getColumnLength(int p0) { return 0; }
    public long getColumnLong(int p0) { return 0L; }
    public java.lang.String getColumnName(int p0) { return null; }
    public java.lang.String getColumnText(int p0) { return null; }
    public int getColumnType(int p0) { return 0; }
    public int getParameterCount() { return 0; }
    public int getParameterIndex(java.lang.String p0) { return 0; }
    public java.lang.String getParameterName(int p0) { return null; }
    public int getResultColumnCount() { return 0; }
    public boolean isOpen() { return false; }
    public int readColumnBlob(int p0, byte[] p1, int p2, int p3, int p4) { return 0; }
    public void reset() {}
    public boolean step() { return false; }
    public int stepNoThrow() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SQLiteDataType {
    }
}
