package android.database.sqlite;

public abstract class SQLiteClosable implements java.io.Closeable {
    private static final java.lang.invoke.VarHandle sClosedBy = null;
    private static final java.lang.invoke.VarHandle sRef = null;
    private volatile java.lang.Throwable mClosedBy;
    private volatile int mReferenceCount;
    protected volatile boolean mTrackClosure;
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
