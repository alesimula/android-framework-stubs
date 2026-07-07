package android.app;

public class BroadcastStickyCache {
    public static final java.lang.String[] STICKY_BROADCAST_ACTIONS = null;
    public static final android.util.ArrayMap<java.lang.String, java.lang.String> sActionApiNameMap = null;
    private static final android.util.ArrayMap<java.lang.String, android.os.IpcDataCache.Config> sActionConfigMap = null;
    private static final android.util.ArrayMap<android.app.BroadcastStickyCache.StickyBroadcastFilter, android.os.IpcDataCache<java.lang.Void, android.content.Intent>> sFilterCacheMap = null;
    public BroadcastStickyCache() {}
    public static void clearCacheForTest() {}
    public static void dumpCacheInfo(android.os.ParcelFileDescriptor p0) {}
    private static void dumpCacheLocked(java.io.PrintWriter p0) {}
    private static android.os.IpcDataCache<java.lang.Void, android.content.Intent> findIpcDataCache(android.content.IntentFilter p0) { return null; }
    private static android.os.IpcDataCache.Config getConfig(java.lang.String p0) { return null; }
    public static android.content.Intent getIntent(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.IntentFilter p3, java.lang.String p4, int p5, int p6) { return null; }
    public static void invalidateAllCaches() {}
    public static void invalidateCache(java.lang.String p0) {}
    public static boolean useCache(android.content.IntentFilter p0) { return false; }

    private static final class StickyBroadcastFilter {
        private final java.lang.String action = null;
        private final android.content.IntentFilter filter = null;
        private StickyBroadcastFilter(android.content.IntentFilter p0, java.lang.String p1) {}
        public java.lang.String action() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public android.content.IntentFilter filter() { return null; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
    }
}
