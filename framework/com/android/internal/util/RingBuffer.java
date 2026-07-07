package com.android.internal.util;

public class RingBuffer<T extends java.lang.Object> {
    private final T[] mBuffer = null;
    private long mCursor;
    private final java.util.function.Supplier<T> mNewItem = null;
    @java.lang.Deprecated
    public RingBuffer(java.lang.Class<T> p0, int p1) {}
    public RingBuffer(java.util.function.Supplier<T> p0, java.util.function.IntFunction<T[]> p1, int p2) {}
    private static java.lang.Object createNewItem(java.lang.Class p0) { return null; }
    private int indexOf(long p0) { return 0; }
    public void append(T p0) {}
    public void clear() {}
    public T getNextSlot() { return null; }
    public boolean isEmpty() { return false; }
    public int size() { return 0; }
    public T[] toArray() { return null; }
}
