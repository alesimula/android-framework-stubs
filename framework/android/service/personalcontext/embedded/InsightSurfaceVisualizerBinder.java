package android.service.personalcontext.embedded;

public final class InsightSurfaceVisualizerBinder extends android.service.personalcontext.embedded.IInsightSurfaceVisualizer.Stub {
    private static final java.lang.String TAG = "InsightSurfaceVisBinder";
    private final android.content.Context mContext = null;
    private final android.view.Display mDisplay = null;
    private final android.app.personalcontext.util.BinderRequestProcessor<android.service.personalcontext.embedded.InsightSurfaceVisualizerHost> mRequestProcessor = null;
    private final android.service.personalcontext.embedded.InsightSurfaceVisualizerBinder.SurfaceControlViewHostFactory mSurfaceControlViewHostFactory = null;
    private final java.util.Map<java.util.UUID, android.service.personalcontext.embedded.InsightSurfaceVisualizerBinder.SurfaceInfo> mSurfacesByClient = null;
    public InsightSurfaceVisualizerBinder(android.service.personalcontext.embedded.InsightSurfaceVisualizerHost p0, android.content.Context p1, android.view.Display p2, java.util.concurrent.Executor p3, android.service.personalcontext.embedded.InsightSurfaceVisualizerBinder.SurfaceControlViewHostFactory p4) { super(); }
    private void disconnectClient(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.embedded.InsightSurfaceVisualizerHost p1, boolean p2) {}
    private void handleClientUpdate(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.os.ResultReceiver p2, android.app.personalcontext.IOpCallback p3) {}
    private boolean releaseSurfaceForClient(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, boolean p1) { return false; }
    private void scheduleOnSurfaceCreated(android.service.personalcontext.embedded.EmbeddedSurfaceRootView p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.view.SurfaceControlViewHost.SurfacePackage p2) {}
    private void sendResult(boolean p0, android.service.personalcontext.embedded.IVisualizationResult p1) {}
    public void createVisualizationForClient(android.service.personalcontext.insight.ContextInsightWrapper p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.app.personalcontext.RenderToken p2, android.service.personalcontext.embedded.IVisualizationResult p3, android.app.personalcontext.IOpCallback p4) {}
    public void onClientDisconnected(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.app.personalcontext.IOpCallback p1) {}

    static final class SurfaceInfo {
        private final android.view.SurfaceControlViewHost host = null;
        private final android.service.personalcontext.embedded.EmbeddedSurfaceRootView rootView = null;
        private final android.view.SurfaceControlViewHost.SurfacePackage surfacePackage = null;
        SurfaceInfo(android.service.personalcontext.embedded.EmbeddedSurfaceRootView p0, android.view.SurfaceControlViewHost p1, android.view.SurfaceControlViewHost.SurfacePackage p2) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public android.view.SurfaceControlViewHost host() { return null; }
        public android.service.personalcontext.embedded.EmbeddedSurfaceRootView rootView() { return null; }
        public android.view.SurfaceControlViewHost.SurfacePackage surfacePackage() { return null; }
        public final java.lang.String toString() { return null; }
    }

    public static interface SurfaceControlViewHostFactory {
        public android.view.SurfaceControlViewHost createSurfaceControlViewHost(android.content.Context p0, android.view.Display p1, android.window.InputTransferToken p2);
    }
}
