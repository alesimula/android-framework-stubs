package android.service.assist.classification;

@android.annotation.SystemApi
public abstract class FieldClassificationService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.assist.classification.FieldClassificationService";
    private static final java.lang.String TAG = null;
    static boolean sDebug;
    static boolean sVerbose;
    private android.content.ComponentName mServiceComponentName;
    public FieldClassificationService() { super(); }
    private void handleOnClassificationRequest(android.service.assist.classification.FieldClassificationRequest p0, android.service.assist.classification.IFieldClassificationCallback p1) {}
    private void handleOnConnected(boolean p0, boolean p1) {}
    private void handleOnDisconnected() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onClassificationRequest(android.service.assist.classification.FieldClassificationRequest p0, android.os.CancellationSignal p1, android.os.OutcomeReceiver<android.service.assist.classification.FieldClassificationResponse, java.lang.Exception> p2);
    public void onConnected() {}
    public void onCreate() {}
    public void onDisconnected() {}

    private final class FieldClassificationServiceImpl extends android.service.assist.classification.IFieldClassificationService.Stub {
        private FieldClassificationServiceImpl(android.service.assist.classification.FieldClassificationService p0) { super(); }
        public void onConnected(boolean p0, boolean p1) {}
        public void onDisconnected() {}
        public void onFieldClassificationRequest(android.service.assist.classification.FieldClassificationRequest p0, android.service.assist.classification.IFieldClassificationCallback p1) {}
    }
}
