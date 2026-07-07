package android.app.compat;

public final class ChangeIdStateCache extends android.app.PropertyInvalidatedCache<android.app.compat.ChangeIdStateQuery, java.lang.Boolean> {
    private static final java.lang.String CACHE_API = "is_compat_change_enabled";
    private static final java.lang.String CACHE_MODULE = "system_server";
    private static final int MAX_ENTRIES = 2048;
    private static boolean sDisabled;
    private volatile com.android.internal.compat.IPlatformCompat mPlatformCompat;
    public ChangeIdStateCache() { super(0, (java.lang.String)null); }
    public static void disable() {}
    private static boolean getDefaultDisabled() { return false; }
    private static boolean getDefaultDisabled$ravenwood() { return false; }
    public static void invalidate() {}
    com.android.internal.compat.IPlatformCompat getPlatformCompatService() { return null; }
    public java.lang.Boolean recompute(android.app.compat.ChangeIdStateQuery p0) { return null; }
}
