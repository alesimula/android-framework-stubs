package android.service.personalcontext.refiner;

@android.annotation.SystemApi
public abstract class HintRefinerService extends android.app.Service {
    private static final java.lang.String TAG = "HintRefinerService";
    private java.util.concurrent.Executor mBinderExecutor;
    private java.util.UUID mComponentId;
    public HintRefinerService() { super(); }
    private void configure(java.util.UUID p0) {}
    public final java.util.UUID getComponentId() { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onConnected() {}
    public abstract android.service.personalcontext.hint.HintFilter onInitializeFilter();
    public android.service.personalcontext.refiner.RefineResult onRefine(android.service.personalcontext.refiner.RefineRequest p0) { return null; }
    public abstract java.util.List<android.service.personalcontext.hint.ContextHint> onRefine(java.util.List<android.service.personalcontext.hint.ContextHint> p0);
    public final void setExecutor(java.util.concurrent.Executor p0) {}

    private static final class Binder extends android.service.personalcontext.refiner.IRefiner.Stub {
        private final android.app.personalcontext.util.BinderRequestProcessor<android.service.personalcontext.refiner.HintRefinerService> mRequestProcessor = null;
        private Binder(android.service.personalcontext.refiner.HintRefinerService p0, java.util.concurrent.Executor p1) { super(); }
        public void getFilter(android.os.ParcelUuid p0, android.service.personalcontext.refiner.IGetFilterCallback p1, android.app.personalcontext.IOpCallback p2) {}
        public void refine(android.os.ParcelUuid p0, java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p1, android.service.personalcontext.refiner.IRefineCallback p2, android.app.personalcontext.IOpCallback p3) {}
    }

    private static final class BinderLegacy extends android.service.personalcontext.refiner.IRefinerLegacy.Stub {
        private final android.app.personalcontext.util.BinderRequestProcessor<android.service.personalcontext.refiner.HintRefinerService> mRequestProcessor = null;
        private BinderLegacy(android.service.personalcontext.refiner.HintRefinerService p0, java.util.concurrent.Executor p1) { super(); }
        public void getFilter(android.os.ParcelUuid p0, android.service.personalcontext.refiner.IGetFilterCallback p1, android.app.personalcontext.IOpCallback p2) {}
        public void handleEvent(android.os.ParcelUuid p0, java.lang.String p1, android.app.personalcontext.insight.interaction.InsightEvent p2, android.app.personalcontext.IOpCallback p3) throws android.os.RemoteException {}
        public void handleFeedback(android.os.ParcelUuid p0, android.app.personalcontext.insight.PublishedContextInsightWrapper p1, android.os.Bundle p2, android.app.personalcontext.IOpCallback p3) throws android.os.RemoteException {}
        public void refine(android.os.ParcelUuid p0, java.util.List<android.app.personalcontext.hint.PublishedContextHintWrapper> p1, android.service.personalcontext.refiner.IRefineCallbackLegacy p2, android.app.personalcontext.IOpCallback p3) throws android.os.RemoteException {}
    }
}
