package android.service.personalcontext.embedded;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
public abstract class InsightSurfaceVisualizerService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.personalcontext.embedded.InsightSurfaceVisualizerService";
    private static final java.lang.String TAG = "InsightSurfaceVisualizr";
    private android.service.personalcontext.embedded.InsightSurfaceVisualizerBinder mBinder;
    private java.util.concurrent.Executor mBinderExecutor;
    private final android.service.personalcontext.embedded.InsightSurfaceVisualizerHost mHost = null;
    private final android.service.personalcontext.embedded.InsightSurfaceVisualizerService.Injector mInjector = null;
    public InsightSurfaceVisualizerService() { super(); }
    public InsightSurfaceVisualizerService(android.service.personalcontext.embedded.InsightSurfaceVisualizerService.Injector p0) { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onClientConnected(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0);
    public abstract void onClientDisconnected(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0);
    public boolean onClientUpdated(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) { return false; }
    public abstract android.view.View onCreateEmbeddedView(android.content.Context p0, android.service.personalcontext.insight.PublishedContextInsight p1, android.service.personalcontext.RenderToken p2, android.service.personalcontext.embedded.InsightSurfaceClientInfo p3);
    public final void setExecutor(java.util.concurrent.Executor p0) {}

    public static interface Injector {
        public android.view.Display getDisplay();
        public android.content.Context getDisplayContext();
        default public android.service.personalcontext.embedded.InsightSurfaceVisualizerBinder.SurfaceControlViewHostFactory getSurfaceControlViewHostFactory() { return null; }
    }

    private static final class DefaultInjector implements android.service.personalcontext.embedded.InsightSurfaceVisualizerService.Injector {
        private final android.content.Context mContext = null;
        DefaultInjector(android.content.Context p0) {}
        public android.view.Display getDisplay() { return null; }
        public android.content.Context getDisplayContext() { return null; }
    }
}
