package android.app.usage;

@android.annotation.SystemApi
public abstract class CacheQuotaService extends android.app.Service {
    public static final java.lang.String REQUEST_LIST_KEY = "requests";
    public static final java.lang.String SERVICE_INTERFACE = "android.app.usage.CacheQuotaService";
    private static final java.lang.String TAG = "CacheQuotaService";
    private android.os.Handler mHandler;
    private android.app.usage.CacheQuotaService.CacheQuotaServiceWrapper mWrapper;
    public CacheQuotaService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract java.util.List<android.app.usage.CacheQuotaHint> onComputeCacheQuotaHints(java.util.List<android.app.usage.CacheQuotaHint> p0);
    public void onCreate() {}

    private final class CacheQuotaServiceWrapper extends android.app.usage.ICacheQuotaService.Stub {
        private CacheQuotaServiceWrapper(android.app.usage.CacheQuotaService p0) { super(); }
        public void computeCacheQuotaHints(android.os.RemoteCallback p0, java.util.List<android.app.usage.CacheQuotaHint> p1) {}
    }

    private final class ServiceHandler extends android.os.Handler {
        public static final int MSG_SEND_LIST = 1;
        public ServiceHandler(android.app.usage.CacheQuotaService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
