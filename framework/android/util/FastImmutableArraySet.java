package android.util;

public final class FastImmutableArraySet<T extends java.lang.Object> extends java.util.AbstractSet<T> {
    T[] mContents;
    android.util.FastImmutableArraySet.FastIterator<T> mIterator;
    public FastImmutableArraySet(T[] p0) { super(); }
    public java.util.Iterator<T> iterator() { return null; }
    public int size() { return 0; }

    private static final class FastIterator<T extends java.lang.Object> implements java.util.Iterator<T> {
        private final T[] mContents = null;
        int mIndex;
        public FastIterator(T[] p0) {}
        public boolean hasNext() { return false; }
        public T next() { return null; }
        public void remove() {}
    }
}
