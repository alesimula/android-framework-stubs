package android.content;

public abstract class AsyncQueryHandler extends android.os.Handler {
    private static final int EVENT_ARG_DELETE = 4;
    private static final int EVENT_ARG_INSERT = 2;
    private static final int EVENT_ARG_QUERY = 1;
    private static final int EVENT_ARG_UPDATE = 3;
    private static final java.lang.String TAG = "AsyncQuery";
    private static final boolean localLOGV = false;
    private static android.os.Looper sLooper;
    final java.lang.ref.WeakReference<android.content.ContentResolver> mResolver = null;
    private android.os.Handler mWorkerThreadHandler;
    public AsyncQueryHandler(android.content.ContentResolver p0) { super(); }
    public final void cancelOperation(int p0) {}
    protected android.os.Handler createHandler(android.os.Looper p0) { return null; }
    public void handleMessage(android.os.Message p0) {}
    protected void onDeleteComplete(int p0, java.lang.Object p1, int p2) {}
    protected void onInsertComplete(int p0, java.lang.Object p1, android.net.Uri p2) {}
    protected void onQueryComplete(int p0, java.lang.Object p1, android.database.Cursor p2) {}
    protected void onUpdateComplete(int p0, java.lang.Object p1, int p2) {}
    public final void startDelete(int p0, java.lang.Object p1, android.net.Uri p2, java.lang.String p3, java.lang.String[] p4) {}
    public final void startInsert(int p0, java.lang.Object p1, android.net.Uri p2, android.content.ContentValues p3) {}
    public void startQuery(int p0, java.lang.Object p1, android.net.Uri p2, java.lang.String[] p3, java.lang.String p4, java.lang.String[] p5, java.lang.String p6) {}
    public final void startUpdate(int p0, java.lang.Object p1, android.net.Uri p2, android.content.ContentValues p3, java.lang.String p4, java.lang.String[] p5) {}

    protected static final class WorkerArgs {
        public java.lang.Object cookie;
        public android.os.Handler handler;
        public java.lang.String orderBy;
        public java.lang.String[] projection;
        public java.lang.Object result;
        public java.lang.String selection;
        public java.lang.String[] selectionArgs;
        public android.net.Uri uri;
        public android.content.ContentValues values;
        protected WorkerArgs() {}
    }

    protected class WorkerHandler extends android.os.Handler {
        public WorkerHandler(android.content.AsyncQueryHandler p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
