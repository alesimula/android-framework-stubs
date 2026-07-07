package android.service.selectiontoolbar;

public abstract class SelectionToolbarRenderService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.selectiontoolbar.SelectionToolbarRenderService";
    private static final java.lang.String TAG = "SelectionToolbarRenderService";
    private final android.service.selectiontoolbar.ISelectionToolbarRenderService mInterface = null;
    private volatile android.service.selectiontoolbar.ISelectionToolbarRenderServiceCallback mServiceCallback;
    private final android.os.HandlerThread mThread = null;
    private final java.util.concurrent.Executor mThreadExecutor = null;
    public SelectionToolbarRenderService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onDismiss(int p0);
    public abstract void onHide(int p0);
    protected void onPasteAction(int p0) {}
    public abstract void onShow(int p0, android.view.selectiontoolbar.ShowInfo p1, android.service.selectiontoolbar.SelectionToolbarRenderCallback p2);
    public abstract void onUidDied(int p0);

    public static interface OnPasteActionCallback {
        public void onPasteAction(int p0);
    }

    public static class RemoteCallbackWrapper implements android.service.selectiontoolbar.SelectionToolbarRenderCallback {
        private final android.os.IBinder.DeathRecipient mDeathRecipient = null;
        private final android.view.selectiontoolbar.ISelectionToolbarCallback mRemoteCallback = null;
        RemoteCallbackWrapper(android.view.selectiontoolbar.ISelectionToolbarCallback p0, android.os.IBinder.DeathRecipient p1) {}
        private void unlinkToDeath() {}
        public void onInvisible() {}
        public void onMenuItemClicked(int p0) {}
        public void onShown(android.view.selectiontoolbar.WidgetInfo p0) {}
        public void onUpdated(android.view.selectiontoolbar.WidgetInfo p0) {}
    }
}
