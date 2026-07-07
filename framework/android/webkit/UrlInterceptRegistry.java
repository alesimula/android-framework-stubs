package android.webkit;

@java.lang.Deprecated
public final class UrlInterceptRegistry {
    private static final java.lang.String LOGTAG = "intercept";
    private static boolean mDisabled;
    private static java.util.LinkedList mHandlerList;
    public UrlInterceptRegistry() {}
    private static java.util.LinkedList getHandlers() { return null; }
    @java.lang.Deprecated
    public static android.webkit.PluginData getPluginData(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) { return null; }
    @java.lang.Deprecated
    public static android.webkit.CacheManager.CacheResult getSurrogate(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) { return null; }
    @java.lang.Deprecated
    public static boolean registerHandler(android.webkit.UrlInterceptHandler p0) { return false; }
    @java.lang.Deprecated
    public static void setUrlInterceptDisabled(boolean p0) {}
    @java.lang.Deprecated
    public static boolean unregisterHandler(android.webkit.UrlInterceptHandler p0) { return false; }
    @java.lang.Deprecated
    public static boolean urlInterceptDisabled() { return false; }
}
