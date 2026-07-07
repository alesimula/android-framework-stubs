package android.service.contentsafety;

@android.annotation.SystemApi
public abstract class ContentSafetySettingsService extends android.app.Service {
    public static final java.lang.String DEVICE_CONFIG_UPDATE_BUNDLE_KEY = "device_config_update";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.contentsafety.ContentSafetySettingsService";
    private static final java.lang.String TAG = "ContentSafetySettingsService";
    private android.os.Handler mHandler;
    public ContentSafetySettingsService() { super(); }
    private android.os.OutcomeReceiver<java.lang.Boolean, android.app.contentsafety.FeatureException> wrapIsFeatureEnabledCallback(android.app.contentsafety.IIsFeatureEnabledCallback p0) { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onCreate() {}
    public abstract void onIsFeatureEnabledRequest(int p0, android.os.UserHandle p1, android.os.CancellationSignal p2, android.os.OutcomeReceiver<java.lang.Boolean, android.app.contentsafety.FeatureException> p3);
}
