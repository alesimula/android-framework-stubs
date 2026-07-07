package android.media;

public class MediaFrameworkPlatformInitializer {
    private static volatile android.media.MediaServiceManager sMediaServiceManager;
    private MediaFrameworkPlatformInitializer() {}
    public static android.media.MediaServiceManager getMediaServiceManager() { return null; }
    public static void registerServiceWrappers() {}
    public static void setMediaServiceManager(android.media.MediaServiceManager p0) {}
}
