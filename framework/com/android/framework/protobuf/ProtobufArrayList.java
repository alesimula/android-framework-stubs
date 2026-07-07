package com.android.framework.protobuf;

final class ProtobufArrayList<E extends java.lang.Object> extends com.android.framework.protobuf.AbstractProtobufList<E> implements java.util.RandomAccess {
    private static final java.lang.Object[] EMPTY_ARRAY = null;
    private static final com.android.framework.protobuf.ProtobufArrayList<java.lang.Object> EMPTY_LIST = null;
    private E[] array;
    private int size;
    ProtobufArrayList() { super(); }
    private ProtobufArrayList(E[] p0, int p1, boolean p2) { super(); }
    private static <E extends java.lang.Object> E[] createArray(int p0) { return null; }
    public static <E extends java.lang.Object> com.android.framework.protobuf.ProtobufArrayList<E> emptyList() { return null; }
    private void ensureIndexInRange(int p0) {}
    private static int growSize(int p0) { return 0; }
    private java.lang.String makeOutOfBoundsExceptionMessage(int p0) { return null; }
    public void add(int p0, E p1) {}
    public boolean add(E p0) { return false; }
    void ensureCapacity(int p0) {}
    public E get(int p0) { return null; }
    public com.android.framework.protobuf.ProtobufArrayList<E> mutableCopyWithCapacity(int p0) { return null; }
    public E remove(int p0) { return null; }
    public E set(int p0, E p1) { return null; }
    public int size() { return 0; }
}
