package android.os;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class ArtModuleServiceManager {
    public ArtModuleServiceManager() {}
    public android.os.ArtModuleServiceManager.ServiceRegisterer getArtdPreRebootServiceRegisterer() { return null; }
    public android.os.ArtModuleServiceManager.ServiceRegisterer getArtdServiceRegisterer() { return null; }
    public android.os.ArtModuleServiceManager.ServiceRegisterer getDexoptChrootSetupServiceRegisterer() { return null; }

    public static final class ServiceRegisterer {
        private final boolean mRetry = false;
        private final java.lang.String mServiceName = null;
        public ServiceRegisterer(java.lang.String p0, boolean p1) {}
        public android.os.IBinder waitForService() { return null; }
    }
}
