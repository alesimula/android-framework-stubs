package com.android.framework.protobuf;

public abstract class AbstractMessageLite<MessageType extends com.android.framework.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends com.android.framework.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements com.android.framework.protobuf.MessageLite {
    protected int memoizedHashCode;
    public AbstractMessageLite() {}
    protected static <T extends java.lang.Object> void addAll(java.lang.Iterable<T> p0, java.util.List<? super T> p1) {}
    protected static void checkByteStringIsUtf8(com.android.framework.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {}
    private java.lang.String getSerializingExceptionMessage(java.lang.String p0) { return null; }
    int getMemoizedSerializedSize() { return 0; }
    int getSerializedSize(com.android.framework.protobuf.Schema p0) { return 0; }
    com.android.framework.protobuf.UninitializedMessageException newUninitializedMessageException() { return null; }
    void setMemoizedSerializedSize(int p0) {}
    public byte[] toByteArray() { return null; }
    public com.android.framework.protobuf.ByteString toByteString() { return null; }
    public void writeDelimitedTo(java.io.OutputStream p0) throws java.io.IOException {}
    public void writeTo(java.io.OutputStream p0) throws java.io.IOException {}

    public static abstract class Builder<MessageType extends com.android.framework.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends com.android.framework.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements com.android.framework.protobuf.MessageLite.Builder {
        public Builder() {}
        @java.lang.Deprecated
        protected static <T extends java.lang.Object> void addAll(java.lang.Iterable<T> p0, java.util.Collection<? super T> p1) {}
        protected static <T extends java.lang.Object> void addAll(java.lang.Iterable<T> p0, java.util.List<? super T> p1) {}
        private static <T extends java.lang.Object> void addAllCheckingNulls(java.lang.Iterable<T> p0, java.util.List<? super T> p1) {}
        private java.lang.String getReadingExceptionMessage(java.lang.String p0) { return null; }
        protected static com.android.framework.protobuf.UninitializedMessageException newUninitializedMessageException(com.android.framework.protobuf.MessageLite p0) { return null; }
        private static void resetListAndThrow(java.util.List<?> p0, int p1) {}
        public abstract BuilderType clone();
        protected abstract BuilderType internalMergeFrom(MessageType p0);
        public boolean mergeDelimitedFrom(java.io.InputStream p0) throws java.io.IOException { return false; }
        public boolean mergeDelimitedFrom(java.io.InputStream p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return false; }
        public BuilderType mergeFrom(com.android.framework.protobuf.ByteString p0) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
        public BuilderType mergeFrom(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
        public BuilderType mergeFrom(com.android.framework.protobuf.CodedInputStream p0) throws java.io.IOException { return null; }
        public abstract BuilderType mergeFrom(com.android.framework.protobuf.CodedInputStream p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException;
        public BuilderType mergeFrom(com.android.framework.protobuf.MessageLite p0) { return null; }
        public BuilderType mergeFrom(java.io.InputStream p0) throws java.io.IOException { return null; }
        public BuilderType mergeFrom(java.io.InputStream p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
        public BuilderType mergeFrom(byte[] p0) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
        public BuilderType mergeFrom(byte[] p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
        public BuilderType mergeFrom(byte[] p0, int p1, int p2, com.android.framework.protobuf.ExtensionRegistryLite p3) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
        public BuilderType mergeFrom(byte[] p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }

        static final class LimitedInputStream extends java.io.FilterInputStream {
            private int limit;
            LimitedInputStream(java.io.InputStream p0, int p1) { super((java.io.InputStream)null); }
            public int available() throws java.io.IOException { return 0; }
            public int read() throws java.io.IOException { return 0; }
            public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
            public long skip(long p0) throws java.io.IOException { return 0L; }
        }
    }

    protected static interface InternalOneOfEnum {
        public int getNumber();
    }
}
