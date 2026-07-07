package com.android.framework.protobuf;

public class LazyStringArrayList extends com.android.framework.protobuf.AbstractProtobufList<java.lang.String> implements com.android.framework.protobuf.LazyStringList, java.util.RandomAccess {
    @java.lang.Deprecated
    public static final com.android.framework.protobuf.LazyStringList EMPTY = null;
    private static final com.android.framework.protobuf.LazyStringArrayList EMPTY_LIST = null;
    private final java.util.List<java.lang.Object> list = null;
    public LazyStringArrayList() { super(); }
    public LazyStringArrayList(int p0) { super(); }
    public LazyStringArrayList(com.android.framework.protobuf.LazyStringList p0) { super(); }
    private LazyStringArrayList(java.util.ArrayList<java.lang.Object> p0) { super(); }
    public LazyStringArrayList(java.util.List<java.lang.String> p0) { super(); }
    private LazyStringArrayList(boolean p0) { super(); }
    private void add(int p0, com.android.framework.protobuf.ByteString p1) {}
    private void add(int p0, byte[] p1) {}
    private static byte[] asByteArray(java.lang.Object p0) { return null; }
    private static com.android.framework.protobuf.ByteString asByteString(java.lang.Object p0) { return null; }
    private static java.lang.String asString(java.lang.Object p0) { return null; }
    public static com.android.framework.protobuf.LazyStringArrayList emptyList() { return null; }
    private java.lang.Object setAndReturn(int p0, com.android.framework.protobuf.ByteString p1) { return null; }
    private java.lang.Object setAndReturn(int p0, byte[] p1) { return null; }
    public void add(int p0, java.lang.String p1) {}
    public void add(com.android.framework.protobuf.ByteString p0) {}
    public void add(byte[] p0) {}
    public boolean add(java.lang.String p0) { return false; }
    public boolean addAll(int p0, java.util.Collection<? extends java.lang.String> p1) { return false; }
    public boolean addAll(java.util.Collection<? extends java.lang.String> p0) { return false; }
    public boolean addAllByteArray(java.util.Collection<byte[]> p0) { return false; }
    public boolean addAllByteString(java.util.Collection<? extends com.android.framework.protobuf.ByteString> p0) { return false; }
    public java.util.List<byte[]> asByteArrayList() { return null; }
    public java.util.List<com.android.framework.protobuf.ByteString> asByteStringList() { return null; }
    public void clear() {}
    public java.lang.String get(int p0) { return null; }
    public byte[] getByteArray(int p0) { return null; }
    public com.android.framework.protobuf.ByteString getByteString(int p0) { return null; }
    public java.lang.Object getRaw(int p0) { return null; }
    public java.util.List<?> getUnderlyingElements() { return null; }
    public com.android.framework.protobuf.LazyStringList getUnmodifiableView() { return null; }
    public void mergeFrom(com.android.framework.protobuf.LazyStringList p0) {}
    public com.android.framework.protobuf.LazyStringArrayList mutableCopyWithCapacity(int p0) { return null; }
    public java.lang.String remove(int p0) { return null; }
    public java.lang.String set(int p0, java.lang.String p1) { return null; }
    public void set(int p0, com.android.framework.protobuf.ByteString p1) {}
    public void set(int p0, byte[] p1) {}
    public int size() { return 0; }

    private static class ByteArrayListView extends java.util.AbstractList<byte[]> implements java.util.RandomAccess {
        private final com.android.framework.protobuf.LazyStringArrayList list = null;
        ByteArrayListView(com.android.framework.protobuf.LazyStringArrayList p0) { super(); }
        public void add(int p0, byte[] p1) {}
        public byte[] get(int p0) { return null; }
        public byte[] remove(int p0) { return null; }
        public byte[] set(int p0, byte[] p1) { return null; }
        public int size() { return 0; }
    }

    private static class ByteStringListView extends java.util.AbstractList<com.android.framework.protobuf.ByteString> implements java.util.RandomAccess {
        private final com.android.framework.protobuf.LazyStringArrayList list = null;
        ByteStringListView(com.android.framework.protobuf.LazyStringArrayList p0) { super(); }
        public void add(int p0, com.android.framework.protobuf.ByteString p1) {}
        public com.android.framework.protobuf.ByteString get(int p0) { return null; }
        public com.android.framework.protobuf.ByteString remove(int p0) { return null; }
        public com.android.framework.protobuf.ByteString set(int p0, com.android.framework.protobuf.ByteString p1) { return null; }
        public int size() { return 0; }
    }
}
