package android.service.personalcontext.renderer;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
public abstract class InsightRendererService extends android.app.Service {
    public static final int RENDER_RESULT_NONE = 0;
    public static final int RENDER_RESULT_RENDERED = 1;
    public static final int RENDER_RESULT_UNIMPLEMENTED = -1;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.personalcontext.renderer.InsightRendererService";
    private static final java.lang.String TAG = "InsightRendererService";
    private java.util.concurrent.Executor mBinderExecutor;
    private java.util.UUID mComponentId;
    public InsightRendererService() { super(); }
    private void configure(java.util.UUID p0) {}
    public final android.service.personalcontext.RenderToken mintRenderToken() { return null; }
    public final android.service.personalcontext.RenderToken mintRenderToken(java.lang.String p0) { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onConnected() {}
    public abstract android.service.personalcontext.insight.InsightFilter onInitializeFilter();
    public int onRender(android.app.personalcontext.insight.ContextInsight p0, android.app.PendingIntent p1) { return 0; }
    public void onRender(android.service.personalcontext.insight.PublishedContextInsight p0, android.service.personalcontext.RenderToken p1) {}
    public void onRender(android.service.personalcontext.insight.PublishedContextInsight p0, android.service.personalcontext.RenderToken p1, android.app.PendingIntent p2) {}
    public final void setExecutor(java.util.concurrent.Executor p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RenderResult {
    }

    private static final class Binder extends android.service.personalcontext.renderer.IInsightRenderer.Stub {
        private final android.app.personalcontext.util.BinderRequestProcessor<android.service.personalcontext.renderer.InsightRendererService> mRequestProcessor = null;
        Binder(android.service.personalcontext.renderer.InsightRendererService p0, java.util.concurrent.Executor p1) { super(); }
        public void configure(android.os.ParcelUuid p0) {}
        public void getFilter(android.os.ParcelUuid p0, android.service.personalcontext.renderer.IGetFilterCallback p1, android.app.personalcontext.IOpCallback p2) {}
        public void render(android.os.ParcelUuid p0, android.service.personalcontext.insight.ContextInsightWrapper p1, android.app.personalcontext.RenderToken p2, android.app.personalcontext.IOpCallback p3) {}
        public void renderWithFeedback(android.os.ParcelUuid p0, android.service.personalcontext.insight.ContextInsightWrapper p1, android.app.personalcontext.RenderToken p2, android.app.PendingIntent p3, android.app.personalcontext.IOpCallback p4) {}
    }
}
