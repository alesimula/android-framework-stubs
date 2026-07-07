package android.util;

public class CopyOnWriteSparseArray<T extends java.lang.Object> {
    private volatile android.util.SparseArray<T> mContainer;
    private final boolean mDebug = false;
    private final java.lang.Object mLock = null;
    private final java.lang.String mTag = null;
    public CopyOnWriteSparseArray() {}
    public CopyOnWriteSparseArray(java.lang.String p0, boolean p1) {}
    private static <T extends java.lang.Object> android.util.SparseArray<T> cloneWithKey(android.util.SparseArray<T> p0, int p1, T p2) { return null; }
    private static <T extends java.lang.Object> android.util.SparseArray<T> cloneWithoutKey(android.util.SparseArray<T> p0, int p1) { return null; }
    public void clear() {}
    public int[] filteredKeys(java.util.function.BiFunction<java.lang.Integer, T, java.lang.Boolean> p0) { return null; }
    public void forEach(java.util.function.BiFunction<java.lang.Integer, T, java.lang.Boolean> p0) {}
    public T get(int p0) { return null; }
    android.util.SparseArray<T> getArray() { return null; }
    public void put(int p0, T p1) {}
    public void remove(int p0) {}
    public int size() { return 0; }
    public java.lang.String toString() { return null; }
}
