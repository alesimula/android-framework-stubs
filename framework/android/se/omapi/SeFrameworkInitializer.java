package android.se.omapi;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class SeFrameworkInitializer {
    private static volatile android.se.omapi.SeServiceManager sSeServiceManager;
    private SeFrameworkInitializer() {}
    public static android.se.omapi.SeServiceManager getSeServiceManager() { return null; }
    public static void setSeServiceManager(android.se.omapi.SeServiceManager p0) {}
}
