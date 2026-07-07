package android.service.messaging;

public abstract class AlternativeMessageTransportService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.messaging.AlternativeMessageTransportService";
    private static final java.lang.String TAG = null;
    public static final int UPGRADE_STATUS_ACCEPTED = 1;
    public static final int UPGRADE_STATUS_REJECTED = 2;
    private final android.service.messaging.AlternativeMessageTransportService.IAlternativeMessageTransportServiceImpl mImpl = null;
    public AlternativeMessageTransportService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onMessageUpgradeRequested(android.net.Uri p0, java.util.function.Consumer<java.lang.Integer> p1);

    private final class IAlternativeMessageTransportServiceImpl extends android.service.messaging.IAlternativeMessageTransportService.Stub {
        private IAlternativeMessageTransportServiceImpl(android.service.messaging.AlternativeMessageTransportService p0) { super(); }
        public void upgradeMessage(android.net.Uri p0, android.service.messaging.IMessageUpgradeCallback p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface UpgradeStatus {
    }
}
