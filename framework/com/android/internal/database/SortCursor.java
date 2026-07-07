package com.android.internal.database;

public class SortCursor extends android.database.AbstractCursor {
    private static final java.lang.String TAG = "SortCursor";
    private final int ROWCACHESIZE = 0;
    private int[][] mCurRowNumCache;
    private android.database.Cursor mCursor;
    private int[] mCursorCache;
    private android.database.Cursor[] mCursors;
    private int mLastCacheHit;
    private android.database.DataSetObserver mObserver;
    private int[] mRowNumCache;
    private int[] mSortColumns;
    public SortCursor(android.database.Cursor[] p0, java.lang.String p1) { super(); }
    public void close() {}
    public void deactivate() {}
    public byte[] getBlob(int p0) { return null; }
    public java.lang.String[] getColumnNames() { return null; }
    public int getCount() { return 0; }
    public double getDouble(int p0) { return 0.0; }
    public float getFloat(int p0) { return 0.0f; }
    public int getInt(int p0) { return 0; }
    public long getLong(int p0) { return 0L; }
    public short getShort(int p0) { return 0; }
    public java.lang.String getString(int p0) { return null; }
    public int getType(int p0) { return 0; }
    public boolean isNull(int p0) { return false; }
    public boolean onMove(int p0, int p1) { return false; }
    public void registerDataSetObserver(android.database.DataSetObserver p0) {}
    public boolean requery() { return false; }
    public void unregisterDataSetObserver(android.database.DataSetObserver p0) {}
}
