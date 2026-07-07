package android.content.res;

abstract class ThemedResourceCache<T extends java.lang.Object> {
    public static final int UNDEFINED_GENERATION = -1;
    private int mGeneration;
    private android.util.LongSparseArray<java.lang.ref.WeakReference<T>> mNullThemedEntries;
    private android.util.ArrayMap<android.content.res.Resources.ThemeKey, android.util.LongSparseArray<java.lang.ref.WeakReference<T>>> mThemedEntries;
    private android.util.LongSparseArray<java.lang.ref.WeakReference<T>> mUnthemedEntries;
    ThemedResourceCache() {}
    private android.util.LongSparseArray<java.lang.ref.WeakReference<T>> getThemedLocked(android.content.res.Resources.Theme p0, boolean p1) { return null; }
    private android.util.LongSparseArray<java.lang.ref.WeakReference<T>> getUnthemedLocked(boolean p0) { return null; }
    private boolean pruneEntriesLocked(android.util.LongSparseArray<java.lang.ref.WeakReference<T>> p0, int p1) { return false; }
    private boolean pruneEntryLocked(T p0, int p1) { return false; }
    private boolean pruneLocked(int p0) { return false; }
    public void clear() {}
    public T get(long p0, android.content.res.Resources.Theme p1) { return null; }
    public int getGeneration() { return 0; }
    public void onConfigurationChange(int p0) {}
    public void put(long p0, android.content.res.Resources.Theme p1, T p2, int p3) {}
    public void put(long p0, android.content.res.Resources.Theme p1, T p2, int p3, boolean p4) {}
    protected abstract boolean shouldInvalidateEntry(T p0, int p1);
}
