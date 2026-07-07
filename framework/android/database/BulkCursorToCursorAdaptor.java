package android.database;

public final class BulkCursorToCursorAdaptor extends android.database.AbstractWindowedCursor {
    private static final java.lang.String TAG = "BulkCursor";
    private android.database.IBulkCursor mBulkCursor;
    private java.lang.String[] mColumns;
    private int mCount;
    private android.database.AbstractCursor.SelfContentObserver mObserverBridge;
    private boolean mWantsAllOnMoveCalls;
    public BulkCursorToCursorAdaptor() { super(); }
    private void throwIfCursorIsClosed() {}
    public void close() {}
    public void deactivate() {}
    public java.lang.String[] getColumnNames() { return null; }
    public int getCount() { return 0; }
    public android.os.Bundle getExtras() { return null; }
    public android.database.IContentObserver getObserver() { return null; }
    public void initialize(android.database.BulkCursorDescriptor p0) {}
    public boolean onMove(int p0, int p1) { return false; }
    public boolean requery() { return false; }
    public android.os.Bundle respond(android.os.Bundle p0) { return null; }
}
