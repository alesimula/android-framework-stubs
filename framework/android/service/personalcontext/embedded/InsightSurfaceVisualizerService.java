package android.service.personalcontext.embedded;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
public abstract class InsightSurfaceVisualizerService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.personalcontext.embedded.InsightSurfaceVisualizerService";
    private static final java.lang.String TAG = "InsightSurfaceVisualizr";
    private android.service.personalcontext.embedded.InsightSurfaceVisualizerService.BinderService mBinder;
    private java.util.concurrent.Executor mBinderExecutor;
    private final android.service.personalcontext.embedded.InsightSurfaceVisualizerService.Injector mInjector = null;
    public InsightSurfaceVisualizerService() { super(); }
    public InsightSurfaceVisualizerService(android.service.personalcontext.embedded.InsightSurfaceVisualizerService.Injector p0) { super(); }
    private void onClientUpdated(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.os.ResultReceiver p2) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onClientConnected(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0);
    public abstract void onClientDisconnected(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0);
    public boolean onClientUpdated(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) { return false; }
    public abstract android.view.View onCreateEmbeddedView(android.content.Context p0, android.service.personalcontext.insight.PublishedContextInsight p1, android.service.personalcontext.RenderToken p2, android.service.personalcontext.embedded.InsightSurfaceClientInfo p3);
    public final void setExecutor(java.util.concurrent.Executor p0) {}

    private static final class BinderService extends android.service.personalcontext.embedded.IInsightSurfaceVisualizer.Stub {
        private final android.content.Context mContext = null;
        private final android.view.Display mDisplay = null;
        private final android.service.personalcontext.util.BinderRequestProcessor<android.service.personalcontext.embedded.InsightSurfaceVisualizerService> mRequestProcessor = null;
        private final android.service.personalcontext.embedded.InsightSurfaceVisualizerService.SurfaceControlViewHostFactory mSurfaceControlViewHostFactory = null;
        private final java.util.Map<java.util.UUID, android.service.personalcontext.embedded.InsightSurfaceVisualizerService.SurfaceInfo> mSurfacesByClient = null;
        BinderService(android.service.personalcontext.embedded.InsightSurfaceVisualizerService p0, android.content.Context p1, android.view.Display p2, java.util.concurrent.Executor p3, android.service.personalcontext.embedded.InsightSurfaceVisualizerService.SurfaceControlViewHostFactory p4) { super(); }
        private void disconnectClient(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.embedded.InsightSurfaceVisualizerService p1, boolean p2) {}
        private void handleClientUpdate(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.os.ResultReceiver p2, android.service.personalcontext.IOpCallback p3) {}
        private boolean releaseSurfaceForClient(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, boolean p1) { return false; }
        private void scheduleOnSurfaceCreated(android.service.personalcontext.embedded.InsightSurfaceVisualizerService.RootView p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.view.SurfaceControlViewHost.SurfacePackage p2) {}
        private void sendResult(boolean p0, android.service.personalcontext.embedded.IVisualizationResult p1) {}
        public void createVisualizationForClient(android.service.personalcontext.insight.ContextInsightWrapper p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.RenderToken p2, android.service.personalcontext.embedded.IVisualizationResult p3, android.service.personalcontext.IOpCallback p4) {}
        public void onClientDisconnected(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.IOpCallback p1) {}
    }

    private static final class DefaultInjector implements android.service.personalcontext.embedded.InsightSurfaceVisualizerService.Injector {
        private final android.content.Context mContext = null;
        private final android.service.personalcontext.embedded.InsightSurfaceVisualizerService.SurfaceControlViewHostFactory mSurfaceControlViewHostFactory = null;
        DefaultInjector(android.content.Context p0) {}
        public android.service.personalcontext.embedded.InsightSurfaceVisualizerService.RootView createRootView(android.content.Context p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.view.SurfaceControlViewHost p2) { return null; }
        public android.view.Display getDisplay() { return null; }
        public android.content.Context getDisplayContext() { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceVisualizerService.SurfaceControlViewHostFactory getSurfaceControlViewHostFactory() { return null; }
    }

    public static interface Injector {
        public android.service.personalcontext.embedded.InsightSurfaceVisualizerService.RootView createRootView(android.content.Context p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.view.SurfaceControlViewHost p2);
        public android.view.Display getDisplay();
        public android.content.Context getDisplayContext();
        public android.service.personalcontext.embedded.InsightSurfaceVisualizerService.SurfaceControlViewHostFactory getSurfaceControlViewHostFactory();
    }

    public static class RootView extends android.widget.FrameLayout {
        private android.service.personalcontext.embedded.InsightSurfaceClientInfo mClientInfo;
        private final android.view.SurfaceControlViewHost mHost = null;
        private java.lang.Runnable mOnRequestLayoutAction;
        private final java.lang.Runnable mOnRequestLayoutRunnable = null;
        public RootView(android.content.Context p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.view.SurfaceControlViewHost p2) { super((android.content.Context)null); }
        private void remeasure() {}
        public void executeOnRequestLayoutAction() {}
        public void onDestroy() {}
        public void requestLayout() {}
        public void setContentView(android.view.View p0) {}
        public void updateClientInfo(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0) {}
    }

    public static interface SurfaceControlViewHostFactory {
        public android.view.SurfaceControlViewHost createSurfaceControlViewHost(android.content.Context p0, android.view.Display p1, android.window.InputTransferToken p2);
    }

    private static final class SurfaceInfo {
        private final android.view.SurfaceControlViewHost host = null;
        private final android.service.personalcontext.embedded.InsightSurfaceVisualizerService.RootView rootView = null;
        private final android.view.SurfaceControlViewHost.SurfacePackage surfacePackage = null;
        private SurfaceInfo(android.service.personalcontext.embedded.InsightSurfaceVisualizerService.RootView p0, android.view.SurfaceControlViewHost p1, android.view.SurfaceControlViewHost.SurfacePackage p2) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public android.view.SurfaceControlViewHost host() { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceVisualizerService.RootView rootView() { return null; }
        public android.view.SurfaceControlViewHost.SurfacePackage surfacePackage() { return null; }
        public final java.lang.String toString() { return null; }
    }
}
