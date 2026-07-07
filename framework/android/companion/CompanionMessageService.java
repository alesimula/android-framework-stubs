package android.companion;

@android.annotation.SystemApi
public abstract class CompanionMessageService extends android.app.Service {
    private static final java.lang.String LOG_TAG = "CDM_CompanionMessageService";
    public static final java.lang.String SERVICE_INTERFACE = "android.companion.CompanionMessageService";
    private final android.companion.CompanionMessageService.CompanionMessageServiceProxy mRemote = null;
    public CompanionMessageService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onMessageReceived(int p0, int p1, byte[] p2);

    private class CompanionMessageServiceProxy extends android.companion.ICompanionMessageService.Stub {
        final android.os.Handler mMainHandler = null;
        private CompanionMessageServiceProxy(android.companion.CompanionMessageService p0) { super(); }
        public void onMessageReceived(int p0, int p1, byte[] p2) {}
    }
}
