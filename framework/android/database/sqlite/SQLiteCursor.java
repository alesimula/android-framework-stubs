package android.database.sqlite;

public class SQLiteCursor extends android.database.AbstractWindowedCursor {
    static final int NO_COUNT = -1;
    static final java.lang.String TAG = "SQLiteCursor";
    private java.util.Map<java.lang.String, java.lang.Integer> mColumnNameMap;
    private final java.lang.String[] mColumns = null;
    private int mCount;
    private int mCursorWindowCapacity;
    private final android.database.sqlite.SQLiteCursorDriver mDriver = null;
    private final java.lang.String mEditTable = null;
    private boolean mFillWindowForwardOnly;
    private final android.database.sqlite.SQLiteQuery mQuery = null;
    public SQLiteCursor(android.database.sqlite.SQLiteCursorDriver p0, java.lang.String p1, android.database.sqlite.SQLiteQuery p2) { super(); }
    @java.lang.Deprecated
    public SQLiteCursor(android.database.sqlite.SQLiteDatabase p0, android.database.sqlite.SQLiteCursorDriver p1, java.lang.String p2, android.database.sqlite.SQLiteQuery p3) { super(); }
    private void fillWindow(int p0) {}
    public void close() {}
    public void deactivate() {}
    protected void finalize() {}
    public int getColumnIndex(java.lang.String p0) { return 0; }
    public java.lang.String[] getColumnNames() { return null; }
    public int getCount() { return 0; }
    public android.database.sqlite.SQLiteDatabase getDatabase() { return null; }
    public boolean onMove(int p0, int p1) { return false; }
    public boolean requery() { return false; }
    public void setFillWindowForwardOnly(boolean p0) {}
    public void setSelectionArguments(java.lang.String[] p0) {}
    public void setWindow(android.database.CursorWindow p0) {}
}
