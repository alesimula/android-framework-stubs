package android.webkit;

@java.lang.Deprecated
public final class CookieSyncManager extends android.webkit.WebSyncManager {
    private static boolean sGetInstanceAllowed;
    private static final java.lang.Object sLock = null;
    private static android.webkit.CookieSyncManager sRef;
    private CookieSyncManager() { super(null, null); }
    private static void checkInstanceIsAllowed() {}
    public static android.webkit.CookieSyncManager createInstance(android.content.Context p0) { return null; }
    public static android.webkit.CookieSyncManager getInstance() { return null; }
    static void setGetInstanceIsAllowed() {}
    @java.lang.Deprecated
    public void resetSync() {}
    @java.lang.Deprecated
    public void startSync() {}
    @java.lang.Deprecated
    public void stopSync() {}
    @java.lang.Deprecated
    public void sync() {}
    @java.lang.Deprecated
    protected void syncFromRamToFlash() {}
}
