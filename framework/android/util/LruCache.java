package android.util;

public class LruCache<K extends java.lang.Object, V extends java.lang.Object> {
    private static final boolean DEBUG = false;
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final java.util.LinkedHashMap<K, V> map = null;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;
    public LruCache(int p0) {}
    private java.util.Map.Entry<K, V> eldest() { return null; }
    private int safeSizeOf(K p0, V p1) { return 0; }
    protected V create(K p0) { return null; }
    public final int createCount() { return 0; }
    protected void entryRemoved(boolean p0, K p1, V p2, V p3) {}
    public final void evictAll() {}
    public final int evictionCount() { return 0; }
    public final V get(K p0) { return null; }
    public final int hitCount() { return 0; }
    public final int maxSize() { return 0; }
    public final int missCount() { return 0; }
    public final V put(K p0, V p1) { return null; }
    public final int putCount() { return 0; }
    public final V remove(K p0) { return null; }
    public void resize(int p0) {}
    public final int size() { return 0; }
    protected int sizeOf(K p0, V p1) { return 0; }
    public final java.util.Map<K, V> snapshot() { return null; }
    public final java.lang.String toString() { return null; }
    public void trimToSize(int p0) {}
}
