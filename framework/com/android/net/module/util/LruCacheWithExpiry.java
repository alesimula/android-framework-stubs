package com.android.net.module.util;

public class LruCacheWithExpiry<K extends java.lang.Object, V extends java.lang.Object> {
    private final long mExpiryDurationMs = 0L;
    private final android.util.LruCache<K, com.android.net.module.util.LruCacheWithExpiry.CacheValue<V>> mMap = null;
    private final java.util.function.Predicate<V> mShouldCacheValue = null;
    private final java.util.function.LongSupplier mTimeSupplier = null;
    public LruCacheWithExpiry(java.util.function.LongSupplier p0, long p1, int p2, java.util.function.Predicate<V> p3) {}
    private boolean isExpired(long p0) { return false; }
    public void clear() {}
    public V get(K p0) { return null; }
    public V getOrCompute(K p0, java.util.function.Supplier<V> p1) { return null; }
    public void put(K p0, V p1) {}
    public V putIfAbsent(K p0, V p1) { return null; }

    private static class CacheValue<V extends java.lang.Object> {
        public final V entry = null;
        public final long timestamp = 0L;
        CacheValue(long p0, V p1) {}
    }
}
