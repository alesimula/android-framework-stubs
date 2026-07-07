package android.database.sqlite;

public abstract class SQLiteClosable implements java.io.Closeable {
    private java.lang.Throwable mClosedBy;
    private int mReferenceCount;
    protected boolean mTrackClosure;
    public SQLiteClosable() {}
    public void acquireReference() {}
    public void close() {}
    protected abstract void onAllReferencesReleased();
    @java.lang.Deprecated
    protected void onAllReferencesReleasedFromContainer() {}
    public void releaseReference() {}
    @java.lang.Deprecated
    public void releaseReferenceFromContainer() {}
}
