package android.app;

class LoaderManagerImpl extends android.app.LoaderManager {
    static boolean DEBUG;
    static final java.lang.String TAG = "LoaderManager";
    boolean mCreatingLoader;
    private android.app.FragmentHostCallback mHost;
    final android.util.SparseArray<android.app.LoaderManagerImpl.LoaderInfo> mInactiveLoaders = null;
    final android.util.SparseArray<android.app.LoaderManagerImpl.LoaderInfo> mLoaders = null;
    boolean mRetaining;
    boolean mRetainingStarted;
    boolean mStarted;
    final java.lang.String mWho = null;
    LoaderManagerImpl(java.lang.String p0, android.app.FragmentHostCallback p1, boolean p2) { super(); }
    private android.app.LoaderManagerImpl.LoaderInfo createAndInstallLoader(int p0, android.os.Bundle p1, android.app.LoaderManager.LoaderCallbacks<java.lang.Object> p2) { return null; }
    private android.app.LoaderManagerImpl.LoaderInfo createLoader(int p0, android.os.Bundle p1, android.app.LoaderManager.LoaderCallbacks<java.lang.Object> p2) { return null; }
    public void destroyLoader(int p0) {}
    void doDestroy() {}
    void doReportNextStart() {}
    void doReportStart() {}
    void doRetain() {}
    void doStart() {}
    void doStop() {}
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    void finishRetain() {}
    public android.app.FragmentHostCallback getFragmentHostCallback() { return null; }
    public <D extends java.lang.Object> android.content.Loader<D> getLoader(int p0) { return null; }
    public boolean hasRunningLoaders() { return false; }
    public <D extends java.lang.Object> android.content.Loader<D> initLoader(int p0, android.os.Bundle p1, android.app.LoaderManager.LoaderCallbacks<D> p2) { return null; }
    void installLoader(android.app.LoaderManagerImpl.LoaderInfo p0) {}
    public <D extends java.lang.Object> android.content.Loader<D> restartLoader(int p0, android.os.Bundle p1, android.app.LoaderManager.LoaderCallbacks<D> p2) { return null; }
    public java.lang.String toString() { return null; }
    void updateHostController(android.app.FragmentHostCallback p0) {}

    final class LoaderInfo implements android.content.Loader.OnLoadCompleteListener<java.lang.Object>, android.content.Loader.OnLoadCanceledListener<java.lang.Object> {
        final android.os.Bundle mArgs = null;
        android.app.LoaderManager.LoaderCallbacks<java.lang.Object> mCallbacks;
        java.lang.Object mData;
        boolean mDeliveredData;
        boolean mDestroyed;
        boolean mHaveData;
        final int mId = 0;
        boolean mListenerRegistered;
        android.content.Loader<java.lang.Object> mLoader;
        android.app.LoaderManagerImpl.LoaderInfo mPendingLoader;
        boolean mReportNextStart;
        boolean mRetaining;
        boolean mRetainingStarted;
        boolean mStarted;
        public LoaderInfo(int p0, android.os.Bundle p1, android.app.LoaderManager.LoaderCallbacks<java.lang.Object> p2) {}
        void callOnLoadFinished(android.content.Loader<java.lang.Object> p0, java.lang.Object p1) {}
        boolean cancel() { return false; }
        void destroy() {}
        public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        void finishRetain() {}
        public void onLoadCanceled(android.content.Loader<java.lang.Object> p0) {}
        public void onLoadComplete(android.content.Loader<java.lang.Object> p0, java.lang.Object p1) {}
        void reportStart() {}
        void retain() {}
        void start() {}
        void stop() {}
        public java.lang.String toString() { return null; }
    }
}
