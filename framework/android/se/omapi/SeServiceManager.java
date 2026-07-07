package android.se.omapi;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class SeServiceManager {
    public SeServiceManager() {}
    public android.se.omapi.SeServiceManager.ServiceRegisterer getSeManagerServiceRegisterer() { return null; }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static class ServiceNotFoundException extends android.os.ServiceManager.ServiceNotFoundException {
        public ServiceNotFoundException(java.lang.String p0) { super(null); }
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final class ServiceRegisterer {
        private final java.lang.String mServiceName = null;
        public ServiceRegisterer(java.lang.String p0) {}
        public android.os.IBinder get() { return null; }
        public android.os.IBinder getOrThrow() throws android.se.omapi.SeServiceManager.ServiceNotFoundException { return null; }
        public void register(android.os.IBinder p0) {}
        public android.os.IBinder tryGet() { return null; }
    }
}
