package android.content;

@java.lang.Deprecated
public abstract class AsyncTaskLoader<D extends java.lang.Object> extends android.content.Loader<D> {
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "AsyncTaskLoader";
    volatile android.content.AsyncTaskLoader<D>.LoadTask mCancellingTask;
    private final java.util.concurrent.Executor mExecutor = null;
    android.os.Handler mHandler;
    long mLastLoadCompleteTime;
    volatile android.content.AsyncTaskLoader<D>.LoadTask mTask;
    long mUpdateThrottle;
    public AsyncTaskLoader(android.content.Context p0) { super(null); }
    public AsyncTaskLoader(android.content.Context p0, java.util.concurrent.Executor p1) { super(null); }
    public void cancelLoadInBackground() {}
    void dispatchOnCancelled(android.content.AsyncTaskLoader<D>.LoadTask p0, D p1) {}
    void dispatchOnLoadComplete(android.content.AsyncTaskLoader<D>.LoadTask p0, D p1) {}
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    void executePendingTask() {}
    public boolean isLoadInBackgroundCanceled() { return false; }
    public abstract D loadInBackground();
    protected boolean onCancelLoad() { return false; }
    public void onCanceled(D p0) {}
    protected void onForceLoad() {}
    protected D onLoadInBackground() { return null; }
    public void setUpdateThrottle(long p0) {}
    public void waitForLoader() {}

    final class LoadTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, D> implements java.lang.Runnable {
        private final java.util.concurrent.CountDownLatch mDone = null;
        boolean waiting;
        LoadTask(android.content.AsyncTaskLoader p0) { super(); }
        protected D doInBackground(java.lang.Void... p0) { return null; }
        protected void onCancelled(D p0) {}
        protected void onPostExecute(D p0) {}
        public void run() {}
        public void waitForLoader() {}
    }
}
