package android.media.projection;

public abstract class AppContentProjectionService extends android.app.Service {
    public static final java.lang.String EXTRA_APP_CONTENT = "extra_app_content";
    public static final java.lang.String SERVICE_INTERFACE = "android.media.projection.AppContentProjectionService";
    private android.media.projection.AppContentProjectionService.AppContentProjectionCallbackInternal mService;
    public AppContentProjectionService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onContentRequest(android.media.projection.AppContentRequest p0);
    public abstract void onContentRequestCanceled();
    public abstract boolean onLoopbackProjectionStarted(android.media.projection.AppContentProjectionSession p0, int p1);
    public abstract void onSessionStopped(android.media.projection.AppContentProjectionSession p0);

    private class AppContentProjectionCallbackInternal extends android.media.projection.IAppContentProjectionCallback.Stub {
        private android.media.projection.AppContentProjectionSession mSession;
        private AppContentProjectionCallbackInternal(android.media.projection.AppContentProjectionService p0, android.os.PermissionEnforcer p1) { super(); }
        public void onContentRequest(android.os.RemoteCallback p0, int p1, int p2, int p3, int p4) {}
        public void onContentRequestCanceled() {}
        public void onLoopbackProjectionStarted(android.media.projection.IAppContentProjectionSession p0, int p1, boolean p2) {}
        public void onSessionStopped() {}
    }
}
