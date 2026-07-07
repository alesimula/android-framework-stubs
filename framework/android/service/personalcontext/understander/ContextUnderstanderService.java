package android.service.personalcontext.understander;

@android.annotation.SystemApi
public abstract class ContextUnderstanderService extends android.app.Service {
    private static final java.util.Set<java.lang.Class<? extends android.service.personalcontext.insight.destination.DestinationSpec>> sLegacyDestinationSpecs = null;
    private java.util.concurrent.Executor mBinderExecutor;
    private java.util.UUID mComponentId;
    public ContextUnderstanderService() { super(); }
    private java.util.Map<android.service.personalcontext.insight.destination.ContextDestination, android.service.personalcontext.insight.ContextInsight> callLegacyUnderstand(java.util.Set<android.service.personalcontext.hint.ContextHint> p0, java.util.Set<android.service.personalcontext.insight.destination.ContextDestination> p1) { return null; }
    private void configure(java.util.UUID p0) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onConnected() {}
    @android.annotation.SystemApi
    public void onHandleEvent(java.lang.String p0, android.service.personalcontext.insight.interaction.InsightEvent p1) {}
    @android.annotation.SystemApi
    public void onHandleUserFeedback(android.service.personalcontext.insight.PublishedContextInsight p0, android.os.Bundle p1) {}
    public abstract android.service.personalcontext.hint.HintFilter onInitializeFilter();
    @android.annotation.SystemApi
    public abstract java.util.List<android.service.personalcontext.insight.ContextInsight> onUnderstand(java.util.List<android.service.personalcontext.hint.PublishedContextHint> p0);
    public java.util.Map<android.service.personalcontext.insight.destination.ContextDestination, android.service.personalcontext.insight.ContextInsight> onUnderstand(java.util.Set<android.service.personalcontext.hint.ContextHint> p0, java.util.Set<android.service.personalcontext.insight.destination.ContextDestination> p1) { return null; }
    public final void setExecutor(java.util.concurrent.Executor p0) {}

    private static final class Binder extends android.service.personalcontext.understander.IUnderstander.Stub {
        private final android.service.personalcontext.util.BinderRequestProcessor<android.service.personalcontext.understander.ContextUnderstanderService> mRequestProcessor = null;
        private Binder(android.service.personalcontext.understander.ContextUnderstanderService p0, java.util.concurrent.Executor p1) { super(); }
        public void getFilter(android.os.ParcelUuid p0, android.service.personalcontext.refiner.IGetFilterCallback p1, android.service.personalcontext.IOpCallback p2) {}
        public void handleEvent(android.os.ParcelUuid p0, java.lang.String p1, android.service.personalcontext.insight.interaction.InsightEvent p2, android.service.personalcontext.IOpCallback p3) {}
        public void understand(android.os.ParcelUuid p0, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p1, java.util.List<android.service.personalcontext.insight.destination.ContextDestination> p2, android.service.personalcontext.understander.IUnderstandCallback p3, android.service.personalcontext.IOpCallback p4) {}
    }
}
