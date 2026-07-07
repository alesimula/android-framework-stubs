package android.os;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public final class ServiceManager {
    private static final int GET_SERVICE_LOG_EVERY_CALLS_CORE = Integer.valueOf(0);
    private static final int GET_SERVICE_LOG_EVERY_CALLS_NON_CORE = Integer.valueOf(0);
    private static final long GET_SERVICE_SLOW_THRESHOLD_US_CORE = Long.valueOf(0L);
    private static final long GET_SERVICE_SLOW_THRESHOLD_US_NON_CORE = Long.valueOf(0L);
    private static final int SLOW_LOG_INTERVAL_MS = 5000;
    private static final int STATS_LOG_INTERVAL_MS = 5000;
    private static final java.lang.String TAG = "ServiceManager";
    private static java.util.Map<java.lang.String, android.os.IBinder> sCache;
    private static int sGetServiceAccumulatedCallCount;
    private static int sGetServiceAccumulatedUs;
    private static long sLastSlowLogActualTime;
    private static long sLastSlowLogUptime;
    private static long sLastStatsLogUptime;
    private static final java.lang.Object sLock = null;
    private static android.os.IServiceManager sServiceManager;
    public static final com.android.internal.util.StatLogger sStatLogger = null;
    public ServiceManager() {}
    public static void addService(java.lang.String p0, android.os.IBinder p1) {}
    public static void addService(java.lang.String p0, android.os.IBinder p1, boolean p2) {}
    public static void addService(java.lang.String p0, android.os.IBinder p1, boolean p2, int p3) {}
    public static android.os.IBinder checkService(java.lang.String p0) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static java.lang.String[] getDeclaredInstances(java.lang.String p0) { return null; }
    private static android.os.IServiceManager getIServiceManager() { return null; }
    public static android.os.IBinder getService(java.lang.String p0) { return null; }
    public static android.os.ServiceDebugInfo[] getServiceDebugInfo() { return null; }
    public static android.os.IBinder getServiceOrThrow(java.lang.String p0) throws android.os.ServiceManager.ServiceNotFoundException { return null; }
    public static void initServiceCache(java.util.Map<java.lang.String, android.os.IBinder> p0) {}
    public static boolean isDeclared(java.lang.String p0) { return false; }
    public static java.lang.String[] listServices() { return null; }
    private static android.os.IBinder rawGetService(java.lang.String p0) throws android.os.RemoteException { return null; }
    public static void registerForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static android.os.IBinder waitForDeclaredService(java.lang.String p0) { return null; }
    public static android.os.IBinder waitForService(java.lang.String p0) { return null; }
    private static native android.os.IBinder waitForServiceNative(java.lang.String p0);

    public static class ServiceNotFoundException extends java.lang.Exception {
        public ServiceNotFoundException(java.lang.String p0) { super(); }
    }

    static interface Stats {
        public static final int COUNT = 1;
        public static final int GET_SERVICE = 0;
    }
}
