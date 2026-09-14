package android.service.personalcontext.embedded;

public interface InsightSurfaceVisualizerHost {
    public void onClientConnected(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0);
    public void onClientDisconnected(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0);
    public boolean onClientUpdated(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1);
    public android.view.View onCreateEmbeddedView(android.content.Context p0, android.service.personalcontext.insight.PublishedContextInsight p1, android.service.personalcontext.RenderToken p2, android.service.personalcontext.embedded.InsightSurfaceClientInfo p3);
}
