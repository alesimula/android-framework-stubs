package android.service.dreams;

public abstract class DreamOverlayService extends android.app.Service {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "DreamOverlayService";
    private android.service.dreams.DreamOverlayService.OverlayClient mCurrentClient;
    private java.lang.Boolean mCurrentRedirectToWake;
    private final android.service.dreams.IDreamOverlay mDreamOverlay = null;
    private java.util.concurrent.Executor mExecutor;
    public DreamOverlayService() { super(); }
    public DreamOverlayService(java.util.concurrent.Executor p0) { super(); }
    private void comeToFront(android.service.dreams.DreamOverlayService.OverlayClient p0) {}
    private void endDream(android.service.dreams.DreamOverlayService.OverlayClient p0) {}
    private void endDreamInternal(android.service.dreams.DreamOverlayService.OverlayClient p0) {}
    private void startDream(android.service.dreams.DreamOverlayService.OverlayClient p0, android.view.WindowManager.LayoutParams p1) {}
    private void wakeUp(android.service.dreams.DreamOverlayService.OverlayClient p0) {}
    public final android.content.ComponentName getDreamComponent() { return null; }
    public final boolean isDreamInPreviewMode() { return false; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onComeToFront() {}
    public void onCreate() {}
    public void onDestroy() {}
    public void onEndDream() {}
    public abstract void onStartDream(android.view.WindowManager.LayoutParams p0);
    public void onWakeRequested() {}
    public void onWakeUp() {}
    public final void redirectWake(boolean p0) {}
    public final void requestExit() {}
    public final boolean shouldShowComplications() { return false; }

    private static class DreamOverlay extends android.service.dreams.IDreamOverlay.Stub {
        private final java.lang.ref.WeakReference<android.service.dreams.DreamOverlayService> mService = null;
        DreamOverlay(android.service.dreams.DreamOverlayService p0) { super(); }
        public void getClient(android.service.dreams.IDreamOverlayClientCallback p0) {}
    }

    private static class OverlayClient extends android.service.dreams.IDreamOverlayClient.Stub {
        private android.content.ComponentName mDreamComponent;
        android.service.dreams.IDreamOverlayCallback mDreamOverlayCallback;
        private boolean mIsPreview;
        private final java.lang.ref.WeakReference<android.service.dreams.DreamOverlayService> mService = null;
        private boolean mShowComplications;
        OverlayClient(java.lang.ref.WeakReference<android.service.dreams.DreamOverlayService> p0) { super(); }
        private void applyToDream(java.util.function.Consumer<android.service.dreams.DreamOverlayService> p0) {}
        private android.content.ComponentName getComponent() { return null; }
        private boolean isDreamInPreviewMode() { return false; }
        private void redirectWake(boolean p0) {}
        private void requestExit() {}
        private boolean shouldShowComplications() { return false; }
        public void comeToFront() {}
        public void endDream() {}
        public void onWakeRequested() {}
        public void startDream(android.view.WindowManager.LayoutParams p0, android.service.dreams.IDreamOverlayCallback p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException {}
        public void wakeUp() {}
    }
}
