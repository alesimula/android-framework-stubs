package android.provider;

public class GenerationCache<K extends java.lang.Object, V extends java.lang.Object> {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "GenerationCache";
    private static final java.lang.ref.Cleaner sCleaner = null;
    private final java.util.function.Consumer<K> mErrorHandler = null;
    private final java.util.concurrent.ConcurrentHashMap<K, android.provider.GenerationCache.GenerationTracker<K>> mTrackers = null;
    private final java.util.concurrent.ConcurrentHashMap<K, android.provider.GenerationCache.CacheEntry<V>> mValues = null;
    public GenerationCache(java.util.function.Consumer<K> p0) {}
    public void clear() {}
    public void destroyTracker(K p0) {}
    public void destroyTracker(K p0, android.provider.GenerationCache.GenerationTracker<K> p1) {}
    public android.provider.GenerationCache.CacheEntry<V> getCacheEntry(K p0) { return null; }
    public void invalidate(K p0) {}
    public void put(K p0, V p1, int p2) {}
    public boolean putIfUnchanged(K p0, V p1, int p2) { return false; }
    public int readLiveGeneration(K p0) { return 0; }
    public void registerTracker(K p0, android.util.MemoryIntArray p1, int p2) {}

    private static final class GenerationTracker<K extends java.lang.Object> {
        private final java.lang.ref.Cleaner.Cleanable mCleanable = null;
        private final java.util.function.BiConsumer<K, android.provider.GenerationCache.GenerationTracker<K>> mErrorHandler = null;
        private final K mKey = null;
        private final android.provider.GenerationCache.GenerationTracker.TrackerState<K> mState = null;
        GenerationTracker(K p0, android.util.MemoryIntArray p1, int p2, java.util.function.BiConsumer<K, android.provider.GenerationCache.GenerationTracker<K>> p3) {}
        void destroy() {}
        int readCurrentGeneration() { return 0; }

        private static final class TrackerState<K extends java.lang.Object> implements java.lang.Runnable {
            private static final int FLAG_CLOSED = 1073741824;
            private static final int FLAG_DESTROYED = -2147483648;
            private static final int MASK_READER_COUNT = 1073741823;
            private final android.util.MemoryIntArray mArray = null;
            private final int mIndex = 0;
            private final java.util.concurrent.atomic.AtomicInteger mState = null;
            TrackerState(android.util.MemoryIntArray p0, int p1) {}
            private void closeArray() {}
            private void decrementAndMaybeClose() {}
            int readGeneration(K p0, java.util.function.Consumer<K> p1) { return 0; }
            public void run() {}
        }
    }

    public static final class CacheEntry<V extends java.lang.Object> {
        public final int generation = 0;
        public final V value = null;
        public CacheEntry(V p0, int p1) {}
    }
}
