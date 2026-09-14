package android.service.personalcontext.embedded;

public final class InsightVisualizerBinder extends android.service.personalcontext.embedded.IInsightVisualizer.Stub {
    private static final java.lang.String TAG = "InsightVisualizerBinder";
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.service.personalcontext.embedded.InsightVisualizerSession mSession = null;
    public InsightVisualizerBinder(java.util.concurrent.Executor p0, android.service.personalcontext.embedded.InsightVisualizerSession p1) { super(); }
    private void createRemoteViewsForHintsInternal(java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.embedded.IRemoteViewsReceiver p2) {}
    public void createRemoteViewsForHints(java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.embedded.IRemoteViewsReceiver p2) {}
    public void onClientDisconnected() {}
}
