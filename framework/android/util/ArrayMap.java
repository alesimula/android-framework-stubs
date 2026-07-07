package android.util;

public final class ArrayMap<K extends java.lang.Object, V extends java.lang.Object> implements java.util.Map<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
    private static final boolean DEBUG = false;
    public static final android.util.ArrayMap EMPTY = null;
    static final int[] EMPTY_IMMUTABLE_INTS = null;
    private static final java.lang.String TAG = "ArrayMap";
    static java.lang.Object[] mBaseCache;
    static int mBaseCacheSize;
    static java.lang.Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    private static final java.lang.Object sBaseCacheLock = null;
    private static final java.lang.Object sTwiceBaseCacheLock = null;
    java.lang.Object[] mArray;
    private android.util.MapCollections<K, V> mCollections;
    int[] mHashes;
    private final boolean mIdentityHashCode = false;
    int mSize;
    public ArrayMap() {}
    public ArrayMap(int p0) {}
    public ArrayMap(int p0, boolean p1) {}
    public ArrayMap(android.util.ArrayMap<K, V> p0) {}
    private void allocArrays(int p0) {}
    private static int binarySearchHashes(int[] p0, int p1, int p2) { return 0; }
    private static void freeArrays(int[] p0, java.lang.Object[] p1, int p2) {}
    private android.util.MapCollections<K, V> getCollection() { return null; }
    public void append(K p0, V p1) {}
    public void clear() {}
    public boolean containsAll(java.util.Collection<?> p0) { return false; }
    public boolean containsKey(java.lang.Object p0) { return false; }
    public boolean containsValue(java.lang.Object p0) { return false; }
    public void ensureCapacity(int p0) {}
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void erase() {}
    public void forEach(java.util.function.BiConsumer<? super K, ? super V> p0) {}
    public V get(java.lang.Object p0) { return null; }
    public int hashCode() { return 0; }
    int indexOf(java.lang.Object p0, int p1) { return 0; }
    public int indexOfKey(java.lang.Object p0) { return 0; }
    int indexOfNull() { return 0; }
    public int indexOfValue(java.lang.Object p0) { return 0; }
    public boolean isEmpty() { return false; }
    public K keyAt(int p0) { return null; }
    public java.util.Set<K> keySet() { return null; }
    public V put(K p0, V p1) { return null; }
    public void putAll(android.util.ArrayMap<? extends K, ? extends V> p0) {}
    public void putAll(java.util.Map<? extends K, ? extends V> p0) {}
    public V remove(java.lang.Object p0) { return null; }
    public boolean removeAll(java.util.Collection<?> p0) { return false; }
    public V removeAt(int p0) { return null; }
    public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> p0) {}
    public boolean retainAll(java.util.Collection<?> p0) { return false; }
    public V setValueAt(int p0, V p1) { return null; }
    public int size() { return 0; }
    public java.lang.String toString() { return null; }
    public void validate() {}
    public V valueAt(int p0) { return null; }
    public java.util.Collection<V> values() { return null; }
}
