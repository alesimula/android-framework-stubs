package android.service.selectiontoolbar;

public abstract class SelectionToolbarRenderService2 extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.selectiontoolbar.SelectionToolbarRenderService2";
    private static final java.lang.String TAG = "SelectionToolbarRenderService2";
    private final android.util.SparseBooleanArray mHasSession = null;
    private final android.view.selectiontoolbar.ISelectionToolbarService mInterface = null;
    private final android.util.ArrayMap<android.os.IBinder, android.service.selectiontoolbar.SelectionToolbarRenderService2.SessionRecord> mSessions = null;
    private final android.os.HandlerThread mThread = null;
    private final java.util.concurrent.Executor mThreadExecutor = null;
    public SelectionToolbarRenderService2() { super(); }
    private static android.view.selectiontoolbar.ShowInfo createShowInfo(boolean p0, java.util.List<android.view.selectiontoolbar.ToolbarMenuItem> p1, android.graphics.Rect p2, int p3, android.graphics.Rect p4, android.window.InputTransferToken p5, boolean p6, android.content.res.Configuration p7) { return null; }
    private void handleClientDied(int p0, android.os.IBinder p1) {}
    protected android.os.Handler getThreadHandler() { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onClose(android.os.IBinder p0);
    public abstract void onHide(android.os.IBinder p0);
    protected void onPasteAction(int p0) {}
    public abstract void onShow(android.os.IBinder p0, int p1, android.view.selectiontoolbar.ShowInfo p2, android.service.selectiontoolbar.SelectionToolbarRenderCallback p3);
    public abstract void onUpdate(android.os.IBinder p0, android.view.selectiontoolbar.ShowInfo p1);

    public class RemoteCallbackWrapper implements android.service.selectiontoolbar.SelectionToolbarRenderCallback {
        private final android.view.selectiontoolbar.ISelectionToolbarClient mClient = null;
        private final android.os.IBinder.DeathRecipient mDeathRecipient = null;
        private RemoteCallbackWrapper(android.service.selectiontoolbar.SelectionToolbarRenderService2 p0, android.view.selectiontoolbar.ISelectionToolbarClient p1, android.os.IBinder.DeathRecipient p2) {}
        public void onInvisible() {}
        public void onMenuItemClicked(int p0) {}
        public void onShown(android.view.selectiontoolbar.WidgetInfo p0) {}
        public void onUpdated(android.view.selectiontoolbar.WidgetInfo p0) {}
    }

    private static final class SessionRecord {
        private final android.view.selectiontoolbar.ISelectionToolbarClient mClient = null;
        private final android.os.IBinder.DeathRecipient mDeathRecipient = null;
        private final android.view.selectiontoolbar.SelectionToolbarRequest mRequest = null;
        private final int mUid = 0;
        private SessionRecord(int p0, android.view.selectiontoolbar.SelectionToolbarRequest p1, android.view.selectiontoolbar.ISelectionToolbarClient p2, android.os.IBinder.DeathRecipient p3) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public android.view.selectiontoolbar.ISelectionToolbarClient mClient() { return null; }
        public android.os.IBinder.DeathRecipient mDeathRecipient() { return null; }
        public android.view.selectiontoolbar.SelectionToolbarRequest mRequest() { return null; }
        public int mUid() { return 0; }
        public final java.lang.String toString() { return null; }
    }
}
