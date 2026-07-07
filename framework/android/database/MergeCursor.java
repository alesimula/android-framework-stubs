package android.database;

public class MergeCursor extends android.database.AbstractCursor {
    private android.database.Cursor mCursor;
    private android.database.Cursor[] mCursors;
    private android.database.DataSetObserver mObserver;
    public MergeCursor(android.database.Cursor[] p0) { super(); }
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
    public void registerContentObserver(android.database.ContentObserver p0) {}
    public void registerDataSetObserver(android.database.DataSetObserver p0) {}
    public boolean requery() { return false; }
    public void unregisterContentObserver(android.database.ContentObserver p0) {}
    public void unregisterDataSetObserver(android.database.DataSetObserver p0) {}
}
