package android.graphics;

public class BitmapCache {
    private static final int DEFAULT_CACHE_SIZE = 16;
    private static final java.lang.String TAG = "BitmapCache";
    private static final android.util.LruCache<android.graphics.BitmapCache.Key, android.graphics.BitmapCache.Value> sSharedBitmaps = null;
    public BitmapCache() {}
    public static android.graphics.Bitmap getShared(android.graphics.Bitmap p0) { return null; }
    public static android.graphics.Bitmap getShared(android.graphics.Bitmap p0, int p1, int p2) { return null; }
    private static android.graphics.Bitmap getShared(android.graphics.BitmapCache.Key p0, java.util.function.Supplier<android.graphics.Bitmap> p1) { return null; }
    public static android.util.LruCache<android.graphics.BitmapCache.Key, android.graphics.BitmapCache.Value> getSharedBitmapCache() { return null; }
    private static void purgeDeadEntries() {}

    private static final class Key {
        private final int generationId = 0;
        private final int hashCode = 0;
        private final int scaledHeight = 0;
        private final int scaledWidth = 0;
        private final java.lang.ref.WeakReference<android.graphics.Bitmap> sourceBitmap = null;
        Key(android.graphics.Bitmap p0) {}
        Key(android.graphics.Bitmap p0, int p1, int p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        boolean stale() { return false; }
        public final java.lang.String toString() { return null; }
    }

    private static final class Value {
        private java.lang.ref.WeakReference<android.graphics.Bitmap> bitmap;
        Value(android.graphics.Bitmap p0) {}
        android.graphics.Bitmap get() { return null; }
        public final java.lang.String toString() { return null; }
    }
}
