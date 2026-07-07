package android.util;

public final class ArraySet<E extends java.lang.Object> implements java.util.Collection<E>, java.util.Set<E> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ArraySet";
    static java.lang.Object[] sBaseCache;
    private static final java.lang.Object sBaseCacheLock = null;
    static int sBaseCacheSize;
    static java.lang.Object[] sTwiceBaseCache;
    private static final java.lang.Object sTwiceBaseCacheLock = null;
    static int sTwiceBaseCacheSize;
    java.lang.Object[] mArray;
    private android.util.MapCollections<E, E> mCollections;
    int[] mHashes;
    private final boolean mIdentityHashCode = false;
    int mSize;
    public ArraySet() {}
    public ArraySet(int p0) {}
    public ArraySet(int p0, boolean p1) {}
    public ArraySet(android.util.ArraySet<E> p0) {}
    public ArraySet(java.util.Collection<? extends E> p0) {}
    public ArraySet(E[] p0) {}
    private void allocArrays(int p0) {}
    private int binarySearch(int[] p0, int p1) { return 0; }
    private static void freeArrays(int[] p0, java.lang.Object[] p1, int p2) {}
    private android.util.MapCollections<E, E> getCollection() { return null; }
    private int getNewShrunkenSize() { return 0; }
    private int indexOf(java.lang.Object p0, int p1) { return 0; }
    private int indexOfNull() { return 0; }
    private boolean shouldShrink() { return false; }
    public boolean add(E p0) { return false; }
    public void addAll(android.util.ArraySet<? extends E> p0) {}
    public boolean addAll(java.util.Collection<? extends E> p0) { return false; }
    public void append(E p0) {}
    public void clear() {}
    public boolean contains(java.lang.Object p0) { return false; }
    public boolean containsAll(java.util.Collection<?> p0) { return false; }
    public void ensureCapacity(int p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public void forEach(java.util.function.Consumer<? super E> p0) {}
    public int hashCode() { return 0; }
    public int indexOf(java.lang.Object p0) { return 0; }
    public boolean isEmpty() { return false; }
    public java.util.Iterator<E> iterator() { return null; }
    public boolean remove(java.lang.Object p0) { return false; }
    public boolean removeAll(android.util.ArraySet<? extends E> p0) { return false; }
    public boolean removeAll(java.util.Collection<?> p0) { return false; }
    public E removeAt(int p0) { return null; }
    public boolean removeIf(java.util.function.Predicate<? super E> p0) { return false; }
    public boolean retainAll(java.util.Collection<?> p0) { return false; }
    public int size() { return 0; }
    public java.lang.Object[] toArray() { return null; }
    public <T extends java.lang.Object> T[] toArray(T[] p0) { return null; }
    public java.lang.String toString() { return null; }
    public E valueAt(int p0) { return null; }
    public E valueAtUnchecked(int p0) { return null; }
}
