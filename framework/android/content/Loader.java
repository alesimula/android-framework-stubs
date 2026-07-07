package android.content;

@java.lang.Deprecated
public class Loader<D extends java.lang.Object> {
    boolean mAbandoned;
    boolean mContentChanged;
    android.content.Context mContext;
    int mId;
    android.content.Loader.OnLoadCompleteListener<D> mListener;
    android.content.Loader.OnLoadCanceledListener<D> mOnLoadCanceledListener;
    boolean mProcessingChange;
    boolean mReset;
    boolean mStarted;
    public Loader(android.content.Context p0) {}
    public void abandon() {}
    public boolean cancelLoad() { return false; }
    public void commitContentChanged() {}
    public java.lang.String dataToString(D p0) { return null; }
    public void deliverCancellation() {}
    public void deliverResult(D p0) {}
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    public void forceLoad() {}
    public android.content.Context getContext() { return null; }
    public int getId() { return 0; }
    public boolean isAbandoned() { return false; }
    public boolean isReset() { return false; }
    public boolean isStarted() { return false; }
    protected void onAbandon() {}
    protected boolean onCancelLoad() { return false; }
    public void onContentChanged() {}
    protected void onForceLoad() {}
    protected void onReset() {}
    protected void onStartLoading() {}
    protected void onStopLoading() {}
    public void registerListener(int p0, android.content.Loader.OnLoadCompleteListener<D> p1) {}
    public void registerOnLoadCanceledListener(android.content.Loader.OnLoadCanceledListener<D> p0) {}
    public void reset() {}
    public void rollbackContentChanged() {}
    public final void startLoading() {}
    public void stopLoading() {}
    public boolean takeContentChanged() { return false; }
    public java.lang.String toString() { return null; }
    public void unregisterListener(android.content.Loader.OnLoadCompleteListener<D> p0) {}
    public void unregisterOnLoadCanceledListener(android.content.Loader.OnLoadCanceledListener<D> p0) {}

    @java.lang.Deprecated
    public final class ForceLoadContentObserver extends android.database.ContentObserver {
        public ForceLoadContentObserver(android.content.Loader p0) { super((android.os.Handler)null); }
        public boolean deliverSelfNotifications() { return false; }
        public void onChange(boolean p0) {}
    }

    @java.lang.Deprecated
    public static interface OnLoadCanceledListener<D extends java.lang.Object> {
        public void onLoadCanceled(android.content.Loader<D> p0);
    }

    @java.lang.Deprecated
    public static interface OnLoadCompleteListener<D extends java.lang.Object> {
        public void onLoadComplete(android.content.Loader<D> p0, D p1);
    }
}
