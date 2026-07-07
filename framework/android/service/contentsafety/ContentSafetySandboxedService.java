package android.service.contentsafety;

@android.annotation.SystemApi
public abstract class ContentSafetySandboxedService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.contentsafety.ContentSafetySandboxedService";
    private static final java.lang.String TAG = "ContentSafetySandboxedService";
    private android.os.Handler mHandler;
    public ContentSafetySandboxedService() { super(); }
    private android.os.Bundle serializeMapToBundle(java.util.Map<java.lang.String, java.util.List<java.lang.Integer>> p0) { return null; }
    private android.os.OutcomeReceiver<java.lang.Void, android.service.contentsafety.ContentSafetyException> wrapLoadFeatureCallback(android.service.contentsafety.ILoadFeatureCallback p0) { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @java.lang.Deprecated
    public abstract void onCheckContentRequest(int p0, java.util.Map<java.lang.Integer, java.util.List<android.os.ParcelFileDescriptor>> p1, android.os.CancellationSignal p2, java.util.function.Consumer<java.util.Map<java.lang.String, java.util.List<java.lang.Integer>>> p3);
    public void onCreate() {}
    public abstract void onLoadFeatureRequest(java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> p0, android.os.CancellationSignal p1, android.os.OutcomeReceiver<java.lang.Void, android.service.contentsafety.ContentSafetyException> p2);
    public void onRequestClassification(java.util.List<android.app.contentsafety.ClassifiableContent> p0, android.app.contentsafety.CheckContentCallback p1) {}

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD})
    public static @interface CheckLoadFeatureParams {
    }
}
