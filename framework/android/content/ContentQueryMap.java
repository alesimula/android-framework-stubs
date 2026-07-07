package android.content;

public class ContentQueryMap extends java.util.Observable {
    private java.lang.String[] mColumnNames;
    private android.database.ContentObserver mContentObserver;
    private volatile android.database.Cursor mCursor;
    private boolean mDirty;
    private android.os.Handler mHandlerForUpdateNotifications;
    private boolean mKeepUpdated;
    private int mKeyColumn;
    private java.util.Map<java.lang.String, android.content.ContentValues> mValues;
    public ContentQueryMap(android.database.Cursor p0, java.lang.String p1, boolean p2, android.os.Handler p3) { super(); }
    private void readCursorIntoCache(android.database.Cursor p0) {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public java.util.Map<java.lang.String, android.content.ContentValues> getRows() { return null; }
    public android.content.ContentValues getValues(java.lang.String p0) { return null; }
    public void requery() {}
    public void setKeepUpdated(boolean p0) {}
}
