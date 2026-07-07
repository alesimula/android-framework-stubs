package android.os;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class ProfilingServiceManager {
    public ProfilingServiceManager() {}
    public android.os.ProfilingServiceManager.ServiceRegisterer getProfilingServiceRegisterer() { return null; }

    public static class ServiceNotFoundException extends android.os.ServiceManager.ServiceNotFoundException {
        public ServiceNotFoundException(java.lang.String p0) { super(null); }
    }

    public static final class ServiceRegisterer {
        private final java.lang.String mServiceName = null;
        public ServiceRegisterer(java.lang.String p0) {}
        public android.os.IBinder get() { return null; }
        public android.os.IBinder getOrThrow() throws android.os.ProfilingServiceManager.ServiceNotFoundException { return null; }
    }
}
