package android.window;

public interface WindowProvider {
    public static final java.lang.String KEY_IS_WINDOW_PROVIDER_SERVICE = "android.window.WindowProvider.isWindowProviderService";
    public static final java.lang.String KEY_REPARENT_TO_DEFAULT_DISPLAY_WITH_DISPLAY_REMOVAL = "android.window.WindowProvider.reparentToDefaultDisplayWithDisplayRemoval";
    default public int getFallbackWindowType() { return 0; }
    public android.os.Bundle getWindowContextOptions();
    public android.os.IBinder getWindowContextToken();
    public int getWindowType();
    default public boolean isSelfOrSubWindowType(int p0) { return false; }
}
