package android.app;

public class PropertyInvalidatedCache<Query extends java.lang.Object, Result extends java.lang.Object> {
    static final java.lang.String BRIEF = "-brief";
    private static final java.lang.String CACHE_KEY_PREFIX = "cache_key";
    private static final boolean DEBUG = false;
    private static final int MAX_RESERVED_NONCE = 3;
    public static final java.lang.String MODULE_ADSERVICES = "adservices";
    public static final java.lang.String MODULE_BLUETOOTH = "bluetooth";
    public static final java.lang.String MODULE_SYSTEM = "system_server";
    public static final java.lang.String MODULE_TELEPHONY = "telephony";
    public static final java.lang.String MODULE_TEST = "test";
    static final java.lang.String NAME_CONTAINS = "-name-has=";
    static final java.lang.String NAME_LIKE = "-name-like=";
    private static final int NONCE_BYPASS = 3;
    private static final int NONCE_CORKED = 2;
    private static final int NONCE_DISABLED = 1;
    static final int NONCE_UNSET = 0;
    private static final java.lang.String PREFIX_SYSTEM = "cache_key.system_server.";
    private static final java.lang.String PREFIX_TEST = "cache_key.test.";
    static final java.lang.String PROPERTY_CONTAINS = "-property-has=";
    static final java.lang.String PROPERTY_LIKE = "-property-like=";
    private static final java.lang.String TAG = "PropertyInvalidatedCache";
    private static final java.util.WeakHashMap<android.app.PropertyInvalidatedCache, java.lang.Void> sCaches = null;
    private static final java.lang.Object sCorkLock = null;
    private static final java.util.HashSet<java.lang.String> sDisabledKeys = null;
    private static boolean sEnabled;
    private static final java.lang.Object sGlobalLock = null;
    private static final java.util.concurrent.ConcurrentHashMap<android.app.PropertyInvalidatedCache.CacheKey, android.app.PropertyInvalidatedCache.NonceHandler> sHandlers = null;
    private static final android.app.PropertyInvalidatedCache.Namespace sNamespaceAdservices = null;
    private static final android.app.PropertyInvalidatedCache.Namespace sNamespaceBluetooth = null;
    private static final android.app.PropertyInvalidatedCache.Namespace sNamespaceSystem = null;
    private static final android.app.PropertyInvalidatedCache.Namespace sNamespaceTelephony = null;
    private static final android.app.PropertyInvalidatedCache.Namespace sNamespaceTest = null;
    private static final java.lang.String[] sNonceName = null;
    private static boolean sTestMode;
    private static final java.lang.String[] sValidKeyPrefix = null;
    private static final java.lang.String[] sValidModule = null;
    private final android.app.PropertyInvalidatedCache<Query, Result>.CacheMap<Query, Result> mCache = null;
    private final java.lang.String mCacheName = null;
    private final boolean mCacheNullResults = false;
    private long mClears;
    private android.app.PropertyInvalidatedCache.QueryHandler<Query, Result> mComputer;
    private boolean mDisabled;
    private long mHighWaterMark;
    private long mHits;
    private long mLastSeenNonce;
    private final java.lang.Object mLock = null;
    private final int mMaxEntries = 0;
    private long mMissOverflow;
    private long mMisses;
    private final android.app.PropertyInvalidatedCache.NonceHandler mNonce = null;
    private long mNulls;
    private long[] mSkips;
    @java.lang.Deprecated
    public PropertyInvalidatedCache(int p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public PropertyInvalidatedCache(int p0, java.lang.String p1, java.lang.String p2) {}
    public PropertyInvalidatedCache(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.app.PropertyInvalidatedCache.QueryHandler<Query, Result> p4) {}
    public PropertyInvalidatedCache(android.app.PropertyInvalidatedCache.Args p0, java.lang.String p1, android.app.PropertyInvalidatedCache.QueryHandler<Query, Result> p2) {}
    private static boolean anyDetailed(java.lang.String[] p0) { return false; }
    public static java.lang.String apiFromProperty(java.lang.String p0) { return null; }
    private static android.app.PropertyInvalidatedCache.Args argsFromProperty(java.lang.String p0) { return null; }
    private static boolean briefRequested(java.lang.String[] p0) { return false; }
    private static boolean chooses(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3) { return false; }
    public static void corkInvalidations(java.lang.String p0) {}
    public static java.lang.String createPropertyName(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.lang.String createSystemCacheKey(java.lang.String p0) { return null; }
    public static void disableForCurrentProcess(java.lang.String p0) {}
    public static void disableForTestMode() {}
    private static final void disableLocal(java.lang.String p0) {}
    public static void dumpCacheInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) {}
    public static void dumpCacheInfo(java.io.PrintWriter p0, java.lang.String[] p1) {}
    private void dumpContents(java.io.PrintWriter p0, boolean p1, boolean p2, java.lang.String[] p3) {}
    private static void dumpHandlers(java.io.PrintWriter p0, boolean p1) {}
    private static java.util.ArrayList<android.app.PropertyInvalidatedCache> getActiveCaches() { return null; }
    private long getCurrentNonce() { return 0L; }
    private boolean getDisabledState() { return false; }
    private static android.app.PropertyInvalidatedCache.NonceHandler getNonceHandler(android.app.PropertyInvalidatedCache.Args p0) { return null; }
    private static android.app.PropertyInvalidatedCache.NonceHandler getNonceHandler(android.app.PropertyInvalidatedCache.CacheKey p0) { return null; }
    private static android.app.PropertyInvalidatedCache.NonceHandler getNonceHandler(java.lang.String p0) { return null; }
    public static android.app.PropertyInvalidatedCache.NonceWatcher getNonceWatcher(java.lang.String p0) { return null; }
    private long getSkipsLocked() { return 0L; }
    public static void invalidateCache(android.app.PropertyInvalidatedCache.Args p0) {}
    public static void invalidateCache(java.lang.String p0) {}
    public static void invalidateCache(java.lang.String p0, java.lang.String p1) {}
    private boolean isActive() { return false; }
    private static boolean isMultiProcess() { return false; }
    private static boolean isMultiProcess$ravenwood() { return false; }
    private static boolean isReservedNonce(long p0) { return false; }
    private static android.app.PropertyInvalidatedCache.Namespace nameToNamespace(java.lang.String p0) { return null; }
    private static native int nativeGetByteBlock(long p0, int p1, byte[] p2);
    private static native int nativeGetByteBlockHash(long p0);
    private static native int nativeGetMaxByte(long p0);
    private static native int nativeGetMaxNonce(long p0);
    private static native long nativeGetNonce(long p0, int p1);
    private static native void nativeSetByteBlock(long p0, int p1, byte[] p2);
    private static native boolean nativeSetNonce(long p0, int p1, long p2);
    private void registerCache() {}
    public static void setTestMode(boolean p0) {}
    private static void setTestModeLocked(boolean p0) {}
    private boolean showDetailed(java.lang.String[] p0) { return false; }
    private static void throwIfInvalidCacheKey(java.lang.String p0) {}
    private static void throwIfInvalidKey(java.lang.String p0) {}
    private static void throwIfInvalidModule(java.lang.String p0) {}
    private static void throwIfNotTest() {}
    public static void uncorkInvalidations(java.lang.String p0) {}
    public boolean bypass(Query p0) { return false; }
    public final java.lang.String cacheName() { return null; }
    public final void clear() {}
    public void corkInvalidations() {}
    public void disableForCurrentProcess() {}
    public void disableInstance() {}
    public void disableLocal() {}
    public void disableSystemWide() {}
    public void dumpCacheEntries(java.io.PrintWriter p0) {}
    public void forgetDisableLocal() {}
    public long getNonce() { return 0L; }
    public android.app.PropertyInvalidatedCache.NonceWatcher getNonceWatcher() { return null; }
    public void invalidateCache() {}
    public boolean isDisabled() { return false; }
    public Result query(Query p0) { return null; }
    protected java.lang.String queryToString(Query p0) { return null; }
    public Result recompute(Query p0) { return null; }
    public int size() { return 0; }
    public void testPropertyName() {}
    public void uncorkInvalidations() {}

    public static final class Args {
        public static final boolean DEFAULT_CACHE_NULLS = false;
        public static final boolean DEFAULT_ISOLATE_UIDS = true;
        public static final int DEFAULT_MAX_ENTRIES = 32;
        private final java.lang.String mApi = null;
        private final boolean mCacheNulls = false;
        private final boolean mIsolateUids = false;
        private final int mMaxEntries = 0;
        private final android.app.PropertyInvalidatedCache.Namespace mNamespace = null;
        private final boolean mTestMode = false;
        public Args(android.app.PropertyInvalidatedCache.Namespace p0) {}
        public Args(android.app.PropertyInvalidatedCache.Namespace p0, java.lang.String p1, int p2, boolean p3, boolean p4, boolean p5) {}
        public Args(java.lang.String p0) {}
        public android.app.PropertyInvalidatedCache.Args api(java.lang.String p0) { return null; }
        public android.app.PropertyInvalidatedCache.Args cacheNulls(boolean p0) { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public android.app.PropertyInvalidatedCache.Args isolateUids(boolean p0) { return null; }
        public java.lang.String mApi() { return null; }
        public boolean mCacheNulls() { return false; }
        public boolean mIsolateUids() { return false; }
        public int mMaxEntries() { return 0; }
        public android.app.PropertyInvalidatedCache.Namespace mNamespace() { return null; }
        public boolean mTestMode() { return false; }
        public android.app.PropertyInvalidatedCache.Args maxEntries(int p0) { return null; }
        public android.app.PropertyInvalidatedCache.Args testMode(boolean p0) { return null; }
        public final java.lang.String toString() { return null; }
    }

    private static final class CacheKey {
        private final java.lang.String key = null;
        private final android.app.PropertyInvalidatedCache.Namespace namespace = null;
        public CacheKey(android.app.PropertyInvalidatedCache.Namespace p0, java.lang.String p1) {}
        public int compareTo(android.app.PropertyInvalidatedCache.CacheKey p0) { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public java.lang.String key() { return null; }
        public android.app.PropertyInvalidatedCache.Namespace namespace() { return null; }
        public java.lang.String toString() { return null; }
    }

    private class CacheMap<Query extends java.lang.Object, Result extends java.lang.Object> {
        private final android.util.SparseArray<java.util.LinkedHashMap<Query, Result>> mCache = null;
        private final boolean mIsolated = false;
        private final int mSelfUid = 0;
        private final boolean mTestMode = false;
        CacheMap(android.app.PropertyInvalidatedCache p0, boolean p1, boolean p2) {}
        private int callerUid() { return 0; }
        private java.util.LinkedHashMap<Query, Result> createMap() { return null; }
        void clear() {}
        boolean containsKey(Query p0) { return false; }
        void dumpDetailed(java.io.PrintWriter p0) {}
        Result get(Query p0) { return null; }
        void put(Query p0, Result p1) {}
        void remove(Query p0) {}
        int size() { return 0; }
    }

    private static class DefaultComputer<Query extends java.lang.Object, Result extends java.lang.Object> extends android.app.PropertyInvalidatedCache.QueryHandler<Query, Result> {
        final android.app.PropertyInvalidatedCache<Query, Result> mCache = null;
        DefaultComputer(android.app.PropertyInvalidatedCache<Query, Result> p0) { super(); }
        public Result apply(Query p0) { return null; }
    }

    private static final class Namespace {
        private final java.lang.String mName = null;
        private Namespace(java.lang.String p0) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public java.lang.String mName() { return null; }
        public final java.lang.String toString() { return null; }
    }

    private static abstract class NonceHandler {
        private int mCorkedInvalidates;
        private int mCorks;
        final android.app.PropertyInvalidatedCache.CacheKey mId = null;
        private int mInvalidated;
        protected final java.lang.Object mLock = null;
        protected long mShadowNonce;
        private volatile boolean mTestMode;
        private java.util.ArrayList<java.util.concurrent.Semaphore> mWatchers;
        private boolean mWritten;
        NonceHandler(android.app.PropertyInvalidatedCache.CacheKey p0) {}
        private void wakeAllWatchersLocked() {}
        void cork() {}
        void disable() {}
        java.lang.String getName() { return null; }
        long getNonce() { return 0L; }
        abstract long getNonceInternal();
        android.app.PropertyInvalidatedCache.NonceHandler.Stats getStats() { return null; }
        void invalidate() {}
        boolean isActive() { return false; }
        void registerWatcher(java.util.concurrent.Semaphore p0) {}
        void setNonce(long p0) {}
        abstract void setNonceInternal(long p0);
        void setTestMode(boolean p0) {}
        void uncork() {}
        void unregisterWatcher(java.util.concurrent.Semaphore p0) {}

        static final class Stats {
            private final int corkedInvalidates = 0;
            private final int invalidated = 0;
            Stats(int p0, int p1) {}
            public int corkedInvalidates() { return 0; }
            public final boolean equals(java.lang.Object p0) { return false; }
            public final int hashCode() { return 0; }
            public int invalidated() { return 0; }
            public final java.lang.String toString() { return null; }
        }
    }

    private static class NonceLocal extends android.app.PropertyInvalidatedCache.NonceHandler {
        private long mValue;
        NonceLocal(android.app.PropertyInvalidatedCache.CacheKey p0) { super(null); }
        long getNonceInternal() { return 0L; }
        void setNonceInternal(long p0) {}
    }

    private static final class NonceSharedMem extends android.app.PropertyInvalidatedCache.NonceHandler {
        private volatile int mHandle;
        private final java.lang.String mShortName = null;
        private volatile android.app.PropertyInvalidatedCache.NonceStore mStore;
        NonceSharedMem(android.app.PropertyInvalidatedCache.CacheKey p0) { super(null); }
        private int initializeLocked(boolean p0) { return 0; }
        long getNonceInternal() { return 0L; }
        void setNonceInternal(long p0) {}
    }

    public static class NonceStore {
        public static final int INVALID_NONCE_INDEX = -1;
        private static final int MAX_STRING_LENGTH = 63;
        private static android.app.PropertyInvalidatedCache.NonceStore sInstance;
        private static java.lang.Object sLock;
        private int mBlockHash;
        private volatile int mHighestIndex;
        private final java.lang.Object mLock = null;
        public final int mMaxByte = 0;
        public final int mMaxNonce = 0;
        private final boolean mMutable = false;
        private int mPartialReads;
        private final long mPtr = 0L;
        private int mStringBytes;
        private final android.util.ArrayMap<java.lang.String, java.lang.Integer> mStringHandle = null;
        private int mStringUpdated;
        public NonceStore(long p0, boolean p1) {}
        private void appendStringToMapLocked(java.lang.String p0, byte[] p1) {}
        static android.app.PropertyInvalidatedCache.NonceStore getInstance() { return null; }
        static android.app.PropertyInvalidatedCache.NonceStore maybeGetInstance() { return null; }
        private void refreshStringBlockLocked() {}
        private void throwIfBadHandle(int p0) {}
        private static void throwIfBadString(java.lang.String p0) {}
        private void throwIfImmutable() {}
        private void updateStringMapLocked(byte[] p0) {}
        public void dump(java.io.PrintWriter p0, java.lang.String p1, boolean p2) {}
        public int getHandleForName(java.lang.String p0) { return 0; }
        public long getNonce(int p0) { return 0L; }
        public boolean setNonce(int p0, long p1) { return false; }
        public int storeName(java.lang.String p0) { return 0; }
    }

    private static final class NonceSysprop extends android.app.PropertyInvalidatedCache.NonceHandler {
        private volatile android.os.SystemProperties.Handle mHandle;
        private final java.lang.String mPropertyName = null;
        NonceSysprop(android.app.PropertyInvalidatedCache.CacheKey p0) { super(null); }
        long getNonceInternal() { return 0L; }
        void setNonceInternal(long p0) {}
    }

    public static class NonceWatcher implements java.lang.AutoCloseable {
        private final android.app.PropertyInvalidatedCache.NonceHandler mHandler = null;
        private long mLastSeen;
        private final java.util.concurrent.Semaphore mSem = null;
        private NonceWatcher(android.app.PropertyInvalidatedCache.NonceHandler p0) {}
        public void close() {}
        public boolean isChanged() { return false; }
        public long lastSeen() { return 0L; }
        public int waitForChange() throws java.lang.InterruptedException { return 0; }
        public int waitForChange(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException { return 0; }
        public void wakeUp() {}
    }

    private static final class NoPreloadHolder {
        private static final java.util.concurrent.atomic.AtomicLong sNextNonce = null;
        private NoPreloadHolder() {}
        public static long next() { return 0L; }
    }

    public static abstract class QueryHandler<Q extends java.lang.Object, R extends java.lang.Object> {
        public QueryHandler() {}
        public abstract R apply(Q p0);
        public boolean shouldBypassCache(Q p0) { return false; }
    }
}
