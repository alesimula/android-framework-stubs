package com.android.framework.protobuf;

class SmallSortedMap<K extends java.lang.Comparable<K>, V extends java.lang.Object> extends java.util.AbstractMap<K, V> {
    static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private java.lang.Object[] entries;
    private int entriesSize;
    private boolean isImmutable;
    private volatile com.android.framework.protobuf.SmallSortedMap<K, V>.EntrySet lazyEntrySet;
    private java.util.Map<K, V> overflowEntries;
    private java.util.Map<K, V> overflowEntriesDescending;
    private SmallSortedMap() { super(); }
    private int binarySearchInArray(K p0) { return 0; }
    private void checkMutable() {}
    private void ensureEntryArrayMutable() {}
    private java.util.SortedMap<K, V> getOverflowEntriesMutable() { return null; }
    static <FieldDescriptorT extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<FieldDescriptorT>> com.android.framework.protobuf.SmallSortedMap<FieldDescriptorT, java.lang.Object> newFieldMap() { return null; }
    static <K extends java.lang.Comparable<K>, V extends java.lang.Object> com.android.framework.protobuf.SmallSortedMap<K, V> newInstanceForTest() { return null; }
    private V removeArrayEntryAt(int p0) { return null; }
    public void clear() {}
    public boolean containsKey(java.lang.Object p0) { return false; }
    java.util.Set<java.util.Map.Entry<K, V>> descendingEntrySet() { return null; }
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public V get(java.lang.Object p0) { return null; }
    public java.util.Map.Entry<K, V> getArrayEntryAt(int p0) { return null; }
    public int getNumArrayEntries() { return 0; }
    public int getNumOverflowEntries() { return 0; }
    public java.lang.Iterable<java.util.Map.Entry<K, V>> getOverflowEntries() { return null; }
    public int hashCode() { return 0; }
    public boolean isImmutable() { return false; }
    public void makeImmutable() {}
    public V put(K p0, V p1) { return null; }
    public V remove(java.lang.Object p0) { return null; }
    public int size() { return 0; }

    private class DescendingEntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private java.util.Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private int pos;
        private DescendingEntryIterator(com.android.framework.protobuf.SmallSortedMap p0) {}
        private java.util.Iterator<java.util.Map.Entry<K, V>> getOverflowIterator() { return null; }
        public boolean hasNext() { return false; }
        public java.util.Map.Entry<K, V> next() { return null; }
        public void remove() {}
    }

    private class DescendingEntrySet extends com.android.framework.protobuf.SmallSortedMap<K, V>.EntrySet {
        private DescendingEntrySet(com.android.framework.protobuf.SmallSortedMap p0) { super(null); }
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() { return null; }
    }

    private class Entry implements java.util.Map.Entry<K, V>, java.lang.Comparable<com.android.framework.protobuf.SmallSortedMap<K, V>.Entry> {
        private final K key = null;
        private V value;
        Entry(K p0, V p1) {}
        Entry(java.util.Map.Entry<K, V> p0) {}
        private boolean equals(java.lang.Object p0, java.lang.Object p1) { return false; }
        public int compareTo(com.android.framework.protobuf.SmallSortedMap<K, V>.Entry p0) { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public K getKey() { return null; }
        public V getValue() { return null; }
        public int hashCode() { return 0; }
        public V setValue(V p0) { return null; }
        public java.lang.String toString() { return null; }
    }

    private class EntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private java.util.Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;
        private EntryIterator(com.android.framework.protobuf.SmallSortedMap p0) {}
        private java.util.Iterator<java.util.Map.Entry<K, V>> getOverflowIterator() { return null; }
        public boolean hasNext() { return false; }
        public java.util.Map.Entry<K, V> next() { return null; }
        public void remove() {}
    }

    private class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        private EntrySet(com.android.framework.protobuf.SmallSortedMap p0) { super(); }
        public boolean add(java.util.Map.Entry<K, V> p0) { return false; }
        public void clear() {}
        public boolean contains(java.lang.Object p0) { return false; }
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() { return null; }
        public boolean remove(java.lang.Object p0) { return false; }
        public int size() { return 0; }
    }
}
