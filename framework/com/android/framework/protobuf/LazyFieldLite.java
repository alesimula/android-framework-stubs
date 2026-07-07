package com.android.framework.protobuf;

public class LazyFieldLite {
    private volatile boolean corrupted;
    private com.android.framework.protobuf.ByteString delayedBytes;
    private com.android.framework.protobuf.ExtensionRegistryLite extensionRegistry;
    private volatile com.android.framework.protobuf.ByteString memoizedBytes;
    protected volatile com.android.framework.protobuf.MessageLite value;
    public LazyFieldLite() {}
    public LazyFieldLite(com.android.framework.protobuf.ExtensionRegistryLite p0, com.android.framework.protobuf.ByteString p1) {}
    private static void checkArguments(com.android.framework.protobuf.ExtensionRegistryLite p0, com.android.framework.protobuf.ByteString p1) {}
    public static com.android.framework.protobuf.LazyFieldLite fromValue(com.android.framework.protobuf.MessageLite p0) { return null; }
    private static com.android.framework.protobuf.MessageLite mergeValueAndBytes(com.android.framework.protobuf.MessageLite p0, com.android.framework.protobuf.ByteString p1, com.android.framework.protobuf.ExtensionRegistryLite p2) { return null; }
    public void clear() {}
    public int computeMessageSetExtensionSize(int p0) { return 0; }
    public int computeSize(int p0) { return 0; }
    public int computeSizeNoTag() { return 0; }
    public boolean containsDefaultInstance() { return false; }
    protected void ensureInitialized(com.android.framework.protobuf.MessageLite p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int getSerializedSize() { return 0; }
    public com.android.framework.protobuf.MessageLite getValue(com.android.framework.protobuf.MessageLite p0) { return null; }
    public int hashCode() { return 0; }
    boolean isCorrupted() { return false; }
    public void merge(com.android.framework.protobuf.LazyFieldLite p0) {}
    public void mergeFrom(com.android.framework.protobuf.CodedInputStream p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {}
    public void set(com.android.framework.protobuf.LazyFieldLite p0) {}
    public void setByteString(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ExtensionRegistryLite p1) {}
    public com.android.framework.protobuf.MessageLite setValue(com.android.framework.protobuf.MessageLite p0) { return null; }
    public com.android.framework.protobuf.ByteString toByteString() { return null; }
    void writeTo(com.android.framework.protobuf.Writer p0, int p1) throws java.io.IOException {}
}
