package com.android.internal.util;

public class RateLimitingCache<Value extends java.lang.Object> {
    private final java.util.concurrent.atomic.AtomicReference<com.android.internal.util.RateLimitingCache<Value>.CachedValue> mCachedValue = null;
    private final int mLimit = 0;
    private final long mPeriodMillis = 0L;
    private final long mRandomOffset = 0L;
    public RateLimitingCache(long p0) {}
    public RateLimitingCache(long p0, int p1) {}
    public Value get(com.android.internal.util.RateLimitingCache.ValueFetcher<Value> p0) { return null; }
    protected long getTime() { return 0L; }

    class CachedValue {
        java.util.concurrent.atomic.AtomicInteger count;
        long timestamp;
        CachedValue(com.android.internal.util.RateLimitingCache p0) {}
    }

    public static interface ValueFetcher<V extends java.lang.Object> {
        public V fetchValue();
    }
}
