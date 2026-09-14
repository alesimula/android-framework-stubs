package android.service.personalcontext.understander;

public abstract class ContextUnderstanderService extends android.app.Service {
    public static final java.lang.String EXTRA_ALLOW_LEGACY_UNDERSTAND = "android.service.personalcontext.extra.ALLOW_LEGACY_UNDERSTAND";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.personalcontext.understander.ContextUnderstanderService";
    private boolean mAllowLegacyUnderstand;
    private java.util.concurrent.Executor mBinderExecutor;
    private java.util.UUID mComponentId;
    public ContextUnderstanderService() { super(); }
    private android.util.SparseArray<android.service.personalcontext.insight.ContextInsight> callLegacyUnderstand(java.util.Set<android.app.personalcontext.hint.ContextHint> p0, int p1) { return null; }
    private void configure(java.util.UUID p0) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onConnected() {}
    public void onHandleEvent(java.lang.String p0, android.service.personalcontext.insight.interaction.InsightEvent p1) {}
    @android.annotation.SystemApi
    public void onHandleUserFeedback(android.service.personalcontext.insight.PublishedContextInsight p0, android.os.Bundle p1) {}
    @android.annotation.SystemApi
    public android.service.personalcontext.hint.HintFilter onInitializeFilter() { return null; }
    public android.service.personalcontext.understander.UnderstandResult onUnderstand(android.service.personalcontext.understander.UnderstandRequest p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public java.util.List<android.service.personalcontext.insight.ContextInsight> onUnderstand(java.util.List<android.service.personalcontext.hint.PublishedContextHint> p0) { return null; }
    public final void setExecutor(java.util.concurrent.Executor p0) {}

    private static final class RefinerBinder extends android.service.personalcontext.refiner.IRefinerLegacy.Stub {
        private final android.app.personalcontext.util.BinderRequestProcessor<android.service.personalcontext.understander.ContextUnderstanderService> mRequestProcessor = null;
        private RefinerBinder(android.service.personalcontext.understander.ContextUnderstanderService p0, java.util.concurrent.Executor p1) { super(); }
        public void getFilter(android.os.ParcelUuid p0, android.service.personalcontext.refiner.IGetFilterCallback p1, android.app.personalcontext.IOpCallback p2) {}
        public void handleEvent(android.os.ParcelUuid p0, java.lang.String p1, android.app.personalcontext.insight.interaction.InsightEvent p2, android.app.personalcontext.IOpCallback p3) {}
        public void handleFeedback(android.os.ParcelUuid p0, android.app.personalcontext.insight.PublishedContextInsightWrapper p1, android.os.Bundle p2, android.app.personalcontext.IOpCallback p3) {}
        public void refine(android.os.ParcelUuid p0, java.util.List<android.app.personalcontext.hint.PublishedContextHintWrapper> p1, android.service.personalcontext.refiner.IRefineCallbackLegacy p2, android.app.personalcontext.IOpCallback p3) {}
    }

    private static final class Binder extends android.service.personalcontext.understander.IUnderstander.Stub {
        private final android.app.personalcontext.util.BinderRequestProcessor<android.service.personalcontext.understander.ContextUnderstanderService> mRequestProcessor = null;
        private Binder(android.service.personalcontext.understander.ContextUnderstanderService p0, java.util.concurrent.Executor p1) { super(); }
        public void getFilter(android.os.ParcelUuid p0, android.service.personalcontext.refiner.IGetFilterCallback p1, android.app.personalcontext.IOpCallback p2) {}
        public void handleEvent(android.os.ParcelUuid p0, java.lang.String p1, android.service.personalcontext.insight.interaction.InsightEvent p2, android.app.personalcontext.IOpCallback p3) {}
        public void understand(android.os.ParcelUuid p0, java.lang.String p1, java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p2, java.util.List<android.app.personalcontext.destination.ContextDestination> p3, android.service.personalcontext.understander.IUnderstandCallback p4, android.app.personalcontext.IOpCallback p5) {}
    }
}
