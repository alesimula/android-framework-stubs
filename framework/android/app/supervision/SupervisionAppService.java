package android.app.supervision;

@android.annotation.SystemApi
public class SupervisionAppService extends android.app.Service {
    public static final java.lang.String ACTION_SUPERVISION_APP_SERVICE = "android.app.action.SUPERVISION_APP_SERVICE";
    private final android.app.supervision.ISupervisionListener mBinder = null;
    private final android.os.Handler mHandler = null;
    public SupervisionAppService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.SystemApi
    public void onPolicyChanged(android.app.supervision.Policy p0) {}
    public void onServiceBound(android.content.Intent p0) {}
    @android.annotation.SystemApi
    public void onSupervisionDisabled() {}
    @android.annotation.SystemApi
    public void onSupervisionEnabled() {}
}
