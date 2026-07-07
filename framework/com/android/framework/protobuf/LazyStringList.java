package com.android.framework.protobuf;

public interface LazyStringList extends com.android.framework.protobuf.ProtocolStringList {
    public void add(com.android.framework.protobuf.ByteString p0);
    public void add(byte[] p0);
    public boolean addAllByteArray(java.util.Collection<byte[]> p0);
    public boolean addAllByteString(java.util.Collection<? extends com.android.framework.protobuf.ByteString> p0);
    public java.util.List<byte[]> asByteArrayList();
    public byte[] getByteArray(int p0);
    public com.android.framework.protobuf.ByteString getByteString(int p0);
    public java.lang.Object getRaw(int p0);
    public java.util.List<?> getUnderlyingElements();
    public com.android.framework.protobuf.LazyStringList getUnmodifiableView();
    public void mergeFrom(com.android.framework.protobuf.LazyStringList p0);
    public void set(int p0, com.android.framework.protobuf.ByteString p1);
    public void set(int p0, byte[] p1);
}
