package android.widget;

public abstract class RemoteViewsService extends android.app.Service {
    private static final java.lang.String LOG_TAG = "RemoteViewsService";
    private static final java.util.HashMap<android.content.Intent.FilterComparison, android.widget.RemoteViewsService.RemoteViewsFactoryAdapter> sFactoriesCache = null;
    private static final java.lang.Object sLock = null;
    public RemoteViewsService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract android.widget.RemoteViewsService.RemoteViewsFactory onGetViewFactory(android.content.Intent p0);

    public static interface RemoteViewsFactory {
        public int getCount();
        public long getItemId(int p0);
        public android.widget.RemoteViews getLoadingView();
        default public android.widget.RemoteViews.RemoteCollectionItems getRemoteCollectionItems(int p0, int p1) { return null; }
        public android.widget.RemoteViews getViewAt(int p0);
        public int getViewTypeCount();
        public boolean hasStableIds();
        public void onCreate();
        public void onDataSetChanged();
        public void onDestroy();
    }

    private static class RemoteViewsFactoryAdapter extends com.android.internal.widget.IRemoteViewsFactory.Stub {
        private final android.widget.RemoteViewsService.RemoteViewsFactory mFactory = null;
        private boolean mIsDataUpdatePending;
        RemoteViewsFactoryAdapter(android.widget.RemoteViewsService.RemoteViewsFactory p0) { super(); }
        public android.widget.RemoteViews.RemoteCollectionItems getRemoteCollectionItems(int p0, int p1, boolean p2) { return null; }
    }
}
