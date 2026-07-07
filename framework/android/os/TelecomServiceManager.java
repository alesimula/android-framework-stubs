package android.os;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class TelecomServiceManager {
    private TelecomServiceManager() {}
    public static android.os.TelecomServiceManager.ServiceRegisterer getTelecomServiceRegisterer() { return null; }

    public static final class ServiceRegisterer {
        private final java.lang.String mServiceName = null;
        private ServiceRegisterer(java.lang.String p0) {}
        public android.os.IBinder get() { return null; }
    }
}
