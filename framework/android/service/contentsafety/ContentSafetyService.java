package android.service.contentsafety;

@android.annotation.SystemApi
public abstract class ContentSafetyService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.contentsafety.ContentSafetyService";
    private static final java.lang.String TAG = "ContentSafetyService";
    private android.os.Handler mHandler;
    public ContentSafetyService() { super(); }
    private android.os.OutcomeReceiver<java.util.Map<java.lang.String, android.os.ParcelFileDescriptor>, android.service.contentsafety.ContentSafetyException> wrapGetFeatureCallback(android.service.contentsafety.IGetFeatureCallback p0) { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onCancelClassification(java.util.List<android.content.LocusId> p0) {}
    public void onCreate() {}
    public abstract void onGetFeatureRequest(int p0, android.os.CancellationSignal p1, android.os.OutcomeReceiver<java.util.Map<java.lang.String, android.os.ParcelFileDescriptor>, android.service.contentsafety.ContentSafetyException> p2);
    public java.util.List<java.lang.String> onGetSupportedMimeTypes() { return null; }
    public abstract void onNotifySandboxedServiceConnected();
    public abstract void onNotifySandboxedServiceDisconnected();
    public abstract void onNotifySettingsServiceConnected();
    public abstract void onNotifySettingsServiceDisconnected();
    public void onReady() {}
}
