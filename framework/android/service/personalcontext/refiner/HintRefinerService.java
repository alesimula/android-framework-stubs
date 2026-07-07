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
    public abstract java.util.List<android.service.personalcontext.hint.ContextHint> onRefine(java.util.List<android.service.personalcontext.hint.ContextHint> p0);
    public final void setExecutor(java.util.concurrent.Executor p0) {}

    private static final class Binder extends android.service.personalcontext.refiner.IRefiner.Stub {
        private final android.service.personalcontext.util.BinderRequestProcessor<android.service.personalcontext.refiner.HintRefinerService> mRequestProcessor = null;
        private Binder(android.service.personalcontext.refiner.HintRefinerService p0, java.util.concurrent.Executor p1) { super(); }
        public void getFilter(android.os.ParcelUuid p0, android.service.personalcontext.refiner.IGetFilterCallback p1, android.service.personalcontext.IOpCallback p2) {}
        public void refine(android.os.ParcelUuid p0, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p1, android.service.personalcontext.refiner.IRefineCallback p2, android.service.personalcontext.IOpCallback p3) {}
    }
}
