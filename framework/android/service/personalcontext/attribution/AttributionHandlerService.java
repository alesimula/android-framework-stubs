package android.service.personalcontext.attribution;

@android.annotation.SystemApi
public abstract class AttributionHandlerService extends android.app.Service {
    private static final java.lang.String SERVICE_INTERFACE = "android.service.personalcontext.attribution.AttributionHandlerService";
    public AttributionHandlerService() { super(); }
    public static android.content.Intent createBindIntent() { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onHandleInsightAttribution(android.service.personalcontext.insight.InsightDisplayDetails p0, android.service.personalcontext.insight.interaction.AttributionDetails p1);

    private static final class Binder extends android.service.personalcontext.attribution.IAttributionHandler.Stub {
        private final android.service.personalcontext.util.BinderRequestProcessor<android.service.personalcontext.attribution.AttributionHandlerService> mRequestProcessor = null;
        Binder(android.service.personalcontext.attribution.AttributionHandlerService p0, java.util.concurrent.Executor p1) { super(); }
        public void handleInsightAttribution(android.service.personalcontext.insight.InsightDisplayDetails p0, android.service.personalcontext.insight.interaction.AttributionDetails p1, android.service.personalcontext.IOpCallback p2) {}
    }
}
