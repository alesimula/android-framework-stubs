package android.util;

public class SparseArray<E extends java.lang.Object> implements java.lang.Cloneable {
    private static final java.lang.Object DELETED = null;
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private java.lang.Object[] mValues;
    public SparseArray() {}
    public SparseArray(int p0) {}
    private void gc() {}
    public void append(int p0, E p1) {}
    public void clear() {}
    public android.util.SparseArray<E> clone() { return null; }
    public boolean contains(int p0) { return false; }
    public boolean contentEquals(android.util.SparseArray<?> p0) { return false; }
    public int contentHashCode() { return 0; }
    public void delete(int p0) {}
    public E get(int p0) { return null; }
    public E get(int p0, E p1) { return null; }
    public int indexOfKey(int p0) { return 0; }
    public int indexOfValue(E p0) { return 0; }
    public int indexOfValueByValue(E p0) { return 0; }
    public int keyAt(int p0) { return 0; }
    public void put(int p0, E p1) {}
    public void remove(int p0) {}
    public void removeAt(int p0) {}
    public void removeAtRange(int p0, int p1) {}
    public E removeReturnOld(int p0) { return null; }
    public void set(int p0, E p1) {}
    public void setValueAt(int p0, E p1) {}
    public int size() { return 0; }
    public java.lang.String toString() { return null; }
    public E valueAt(int p0) { return null; }
}
