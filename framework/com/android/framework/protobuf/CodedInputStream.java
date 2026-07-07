package com.android.framework.protobuf;

public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = 2147483647;
    private static volatile int defaultRecursionLimit;
    int groupDepth;
    int messageDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    java.lang.Object wrapper;
    private CodedInputStream() {}
    public static int decodeZigZag32(int p0) { return 0; }
    public static long decodeZigZag64(long p0) { return 0L; }
    public static com.android.framework.protobuf.CodedInputStream newInstance(java.io.InputStream p0) { return null; }
    public static com.android.framework.protobuf.CodedInputStream newInstance(java.io.InputStream p0, int p1) { return null; }
    public static com.android.framework.protobuf.CodedInputStream newInstance(java.lang.Iterable<java.nio.ByteBuffer> p0) { return null; }
    static com.android.framework.protobuf.CodedInputStream newInstance(java.lang.Iterable<java.nio.ByteBuffer> p0, boolean p1) { return null; }
    public static com.android.framework.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer p0) { return null; }
    static com.android.framework.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer p0, boolean p1) { return null; }
    public static com.android.framework.protobuf.CodedInputStream newInstance(byte[] p0) { return null; }
    public static com.android.framework.protobuf.CodedInputStream newInstance(byte[] p0, int p1, int p2) { return null; }
    static com.android.framework.protobuf.CodedInputStream newInstance(byte[] p0, int p1, int p2, boolean p3) { return null; }
    public static int readRawVarint32(int p0, java.io.InputStream p1) throws java.io.IOException { return 0; }
    static int readRawVarint32(java.io.InputStream p0) throws java.io.IOException { return 0; }
    public abstract void checkLastTagWas(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public void checkRecursionLimit() throws com.android.framework.protobuf.InvalidProtocolBufferException {}
    public void checkValidEndTag() throws com.android.framework.protobuf.InvalidProtocolBufferException {}
    final void discardUnknownFields() {}
    public abstract void enableAliasing(boolean p0);
    public abstract int getBytesUntilLimit();
    public abstract int getLastTag();
    public abstract int getTotalBytesRead();
    public abstract boolean isAtEnd() throws java.io.IOException;
    public abstract void popLimit(int p0);
    public abstract int pushLimit(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public abstract boolean readBool() throws java.io.IOException;
    public abstract byte[] readByteArray() throws java.io.IOException;
    public abstract java.nio.ByteBuffer readByteBuffer() throws java.io.IOException;
    public abstract com.android.framework.protobuf.ByteString readBytes() throws java.io.IOException;
    public abstract double readDouble() throws java.io.IOException;
    public abstract int readEnum() throws java.io.IOException;
    public abstract int readFixed32() throws java.io.IOException;
    public abstract long readFixed64() throws java.io.IOException;
    public abstract float readFloat() throws java.io.IOException;
    public abstract <T extends com.android.framework.protobuf.MessageLite> T readGroup(int p0, com.android.framework.protobuf.Parser<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException;
    public abstract void readGroup(int p0, com.android.framework.protobuf.MessageLite.Builder p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException;
    public abstract int readInt32() throws java.io.IOException;
    public abstract long readInt64() throws java.io.IOException;
    public abstract <T extends com.android.framework.protobuf.MessageLite> T readMessage(com.android.framework.protobuf.Parser<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException;
    public abstract void readMessage(com.android.framework.protobuf.MessageLite.Builder p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException;
    java.lang.Object readPrimitiveField(com.android.framework.protobuf.WireFormat.FieldType p0, com.android.framework.protobuf.WireFormat.Utf8Validation p1) throws java.io.IOException { return null; }
    public abstract byte readRawByte() throws java.io.IOException;
    public abstract byte[] readRawBytes(int p0) throws java.io.IOException;
    public abstract int readRawLittleEndian32() throws java.io.IOException;
    public abstract long readRawLittleEndian64() throws java.io.IOException;
    public abstract int readRawVarint32() throws java.io.IOException;
    public abstract long readRawVarint64() throws java.io.IOException;
    abstract long readRawVarint64SlowPath() throws java.io.IOException;
    public abstract int readSFixed32() throws java.io.IOException;
    public abstract long readSFixed64() throws java.io.IOException;
    public abstract int readSInt32() throws java.io.IOException;
    public abstract long readSInt64() throws java.io.IOException;
    java.lang.Object readString(com.android.framework.protobuf.WireFormat.Utf8Validation p0) throws java.io.IOException { return null; }
    public abstract java.lang.String readString() throws java.io.IOException;
    public abstract java.lang.String readStringRequireUtf8() throws java.io.IOException;
    public abstract int readTag() throws java.io.IOException;
    public abstract int readUInt32() throws java.io.IOException;
    public abstract long readUInt64() throws java.io.IOException;
    @java.lang.Deprecated
    public abstract void readUnknownGroup(int p0, com.android.framework.protobuf.MessageLite.Builder p1) throws java.io.IOException;
    public abstract void resetSizeCounter();
    public final int setRecursionLimit(int p0) { return 0; }
    public final int setSizeLimit(int p0) { return 0; }
    final boolean shouldDiscardUnknownFields() { return false; }
    public abstract boolean skipField(int p0) throws java.io.IOException;
    @java.lang.Deprecated
    public abstract boolean skipField(int p0, com.android.framework.protobuf.CodedOutputStream p1) throws java.io.IOException;
    public void skipMessage() throws java.io.IOException {}
    public void skipMessage(com.android.framework.protobuf.CodedOutputStream p0) throws java.io.IOException {}
    public abstract void skipRawBytes(int p0) throws java.io.IOException;
    final void unsetDiscardUnknownFields() {}

    private static final class ArrayDecoder extends com.android.framework.protobuf.CodedInputStream {
        private final byte[] buffer = null;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable = false;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;
        private ArrayDecoder(byte[] p0, int p1, int p2, boolean p3) { super(); }
        private void recomputeBufferSizeAfterLimit() {}
        private void skipRawVarint() throws java.io.IOException {}
        private void skipRawVarintFastPath() throws java.io.IOException {}
        private void skipRawVarintSlowPath() throws java.io.IOException {}
        public void checkLastTagWas(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException {}
        public void enableAliasing(boolean p0) {}
        public int getBytesUntilLimit() { return 0; }
        public int getLastTag() { return 0; }
        public int getTotalBytesRead() { return 0; }
        public boolean isAtEnd() throws java.io.IOException { return false; }
        public void popLimit(int p0) {}
        public int pushLimit(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException { return 0; }
        public boolean readBool() throws java.io.IOException { return false; }
        public byte[] readByteArray() throws java.io.IOException { return null; }
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException { return null; }
        public com.android.framework.protobuf.ByteString readBytes() throws java.io.IOException { return null; }
        public double readDouble() throws java.io.IOException { return 0.0; }
        public int readEnum() throws java.io.IOException { return 0; }
        public int readFixed32() throws java.io.IOException { return 0; }
        public long readFixed64() throws java.io.IOException { return 0L; }
        public float readFloat() throws java.io.IOException { return 0.0f; }
        public <T extends com.android.framework.protobuf.MessageLite> T readGroup(int p0, com.android.framework.protobuf.Parser<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException { return null; }
        public void readGroup(int p0, com.android.framework.protobuf.MessageLite.Builder p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
        public int readInt32() throws java.io.IOException { return 0; }
        public long readInt64() throws java.io.IOException { return 0L; }
        public <T extends com.android.framework.protobuf.MessageLite> T readMessage(com.android.framework.protobuf.Parser<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
        public void readMessage(com.android.framework.protobuf.MessageLite.Builder p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {}
        public byte readRawByte() throws java.io.IOException { return 0; }
        public byte[] readRawBytes(int p0) throws java.io.IOException { return null; }
        public int readRawLittleEndian32() throws java.io.IOException { return 0; }
        public long readRawLittleEndian64() throws java.io.IOException { return 0L; }
        public int readRawVarint32() throws java.io.IOException { return 0; }
        public long readRawVarint64() throws java.io.IOException { return 0L; }
        long readRawVarint64SlowPath() throws java.io.IOException { return 0L; }
        public int readSFixed32() throws java.io.IOException { return 0; }
        public long readSFixed64() throws java.io.IOException { return 0L; }
        public int readSInt32() throws java.io.IOException { return 0; }
        public long readSInt64() throws java.io.IOException { return 0L; }
        public java.lang.String readString() throws java.io.IOException { return null; }
        public java.lang.String readStringRequireUtf8() throws java.io.IOException { return null; }
        public int readTag() throws java.io.IOException { return 0; }
        public int readUInt32() throws java.io.IOException { return 0; }
        public long readUInt64() throws java.io.IOException { return 0L; }
        @java.lang.Deprecated
        public void readUnknownGroup(int p0, com.android.framework.protobuf.MessageLite.Builder p1) throws java.io.IOException {}
        public void resetSizeCounter() {}
        public boolean skipField(int p0) throws java.io.IOException { return false; }
        public boolean skipField(int p0, com.android.framework.protobuf.CodedOutputStream p1) throws java.io.IOException { return false; }
        public void skipRawBytes(int p0) throws java.io.IOException {}
    }

    private static final class IterableDirectByteBufferDecoder extends com.android.framework.protobuf.CodedInputStream {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private java.nio.ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable = false;
        private final java.lang.Iterable<java.nio.ByteBuffer> input = null;
        private final java.util.Iterator<java.nio.ByteBuffer> iterator = null;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;
        private IterableDirectByteBufferDecoder(java.lang.Iterable<java.nio.ByteBuffer> p0, int p1, boolean p2) { super(); }
        private long currentRemaining() { return 0L; }
        private void getNextByteBuffer() throws com.android.framework.protobuf.InvalidProtocolBufferException {}
        private void readRawBytesTo(byte[] p0, int p1, int p2) throws java.io.IOException {}
        private void recomputeBufferSizeAfterLimit() {}
        private int remaining() { return 0; }
        private void skipRawVarint() throws java.io.IOException {}
        private java.nio.ByteBuffer slice(int p0, int p1) throws java.io.IOException { return null; }
        private void tryGetNextByteBuffer() {}
        public void checkLastTagWas(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException {}
        public void enableAliasing(boolean p0) {}
        public int getBytesUntilLimit() { return 0; }
        public int getLastTag() { return 0; }
        public int getTotalBytesRead() { return 0; }
        public boolean isAtEnd() throws java.io.IOException { return false; }
        public void popLimit(int p0) {}
        public int pushLimit(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException { return 0; }
        public boolean readBool() throws java.io.IOException { return false; }
        public byte[] readByteArray() throws java.io.IOException { return null; }
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException { return null; }
        public com.android.framework.protobuf.ByteString readBytes() throws java.io.IOException { return null; }
        public double readDouble() throws java.io.IOException { return 0.0; }
        public int readEnum() throws java.io.IOException { return 0; }
        public int readFixed32() throws java.io.IOException { return 0; }
        public long readFixed64() throws java.io.IOException { return 0L; }
        public float readFloat() throws java.io.IOException { return 0.0f; }
        public <T extends com.android.framework.protobuf.MessageLite> T readGroup(int p0, com.android.framework.protobuf.Parser<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException { return null; }
        public void readGroup(int p0, com.android.framework.protobuf.MessageLite.Builder p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
        public int readInt32() throws java.io.IOException { return 0; }
        public long readInt64() throws java.io.IOException { return 0L; }
        public <T extends com.android.framework.protobuf.MessageLite> T readMessage(com.android.framework.protobuf.Parser<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
        public void readMessage(com.android.framework.protobuf.MessageLite.Builder p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {}
        public byte readRawByte() throws java.io.IOException { return 0; }
        public byte[] readRawBytes(int p0) throws java.io.IOException { return null; }
        public int readRawLittleEndian32() throws java.io.IOException { return 0; }
        public long readRawLittleEndian64() throws java.io.IOException { return 0L; }
        public int readRawVarint32() throws java.io.IOException { return 0; }
        public long readRawVarint64() throws java.io.IOException { return 0L; }
        long readRawVarint64SlowPath() throws java.io.IOException { return 0L; }
        public int readSFixed32() throws java.io.IOException { return 0; }
        public long readSFixed64() throws java.io.IOException { return 0L; }
        public int readSInt32() throws java.io.IOException { return 0; }
        public long readSInt64() throws java.io.IOException { return 0L; }
        public java.lang.String readString() throws java.io.IOException { return null; }
        public java.lang.String readStringRequireUtf8() throws java.io.IOException { return null; }
        public int readTag() throws java.io.IOException { return 0; }
        public int readUInt32() throws java.io.IOException { return 0; }
        public long readUInt64() throws java.io.IOException { return 0L; }
        @java.lang.Deprecated
        public void readUnknownGroup(int p0, com.android.framework.protobuf.MessageLite.Builder p1) throws java.io.IOException {}
        public void resetSizeCounter() {}
        public boolean skipField(int p0) throws java.io.IOException { return false; }
        public boolean skipField(int p0, com.android.framework.protobuf.CodedOutputStream p1) throws java.io.IOException { return false; }
        public void skipRawBytes(int p0) throws java.io.IOException {}
    }

    private static final class StreamDecoder extends com.android.framework.protobuf.CodedInputStream {
        private final byte[] buffer = null;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final java.io.InputStream input = null;
        private int lastTag;
        private int pos;
        private com.android.framework.protobuf.CodedInputStream.StreamDecoder.RefillCallback refillCallback;
        private int totalBytesRetired;
        private StreamDecoder(java.io.InputStream p0, int p1) { super(); }
        private static int available(java.io.InputStream p0) throws java.io.IOException { return 0; }
        private static int read(java.io.InputStream p0, byte[] p1, int p2, int p3) throws java.io.IOException { return 0; }
        private com.android.framework.protobuf.ByteString readBytesSlowPath(int p0) throws java.io.IOException { return null; }
        private byte[] readRawBytesSlowPath(int p0, boolean p1) throws java.io.IOException { return null; }
        private byte[] readRawBytesSlowPathOneChunk(int p0) throws java.io.IOException { return null; }
        private java.util.List<byte[]> readRawBytesSlowPathRemainingChunks(int p0) throws java.io.IOException { return null; }
        private void recomputeBufferSizeAfterLimit() {}
        private void refillBuffer(int p0) throws java.io.IOException {}
        private static long skip(java.io.InputStream p0, long p1) throws java.io.IOException { return 0L; }
        private void skipRawBytesSlowPath(int p0) throws java.io.IOException {}
        private void skipRawVarint() throws java.io.IOException {}
        private void skipRawVarintFastPath() throws java.io.IOException {}
        private void skipRawVarintSlowPath() throws java.io.IOException {}
        private boolean tryRefillBuffer(int p0) throws java.io.IOException { return false; }
        public void checkLastTagWas(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException {}
        public void enableAliasing(boolean p0) {}
        public int getBytesUntilLimit() { return 0; }
        public int getLastTag() { return 0; }
        public int getTotalBytesRead() { return 0; }
        public boolean isAtEnd() throws java.io.IOException { return false; }
        public void popLimit(int p0) {}
        public int pushLimit(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException { return 0; }
        public boolean readBool() throws java.io.IOException { return false; }
        public byte[] readByteArray() throws java.io.IOException { return null; }
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException { return null; }
        public com.android.framework.protobuf.ByteString readBytes() throws java.io.IOException { return null; }
        public double readDouble() throws java.io.IOException { return 0.0; }
        public int readEnum() throws java.io.IOException { return 0; }
        public int readFixed32() throws java.io.IOException { return 0; }
        public long readFixed64() throws java.io.IOException { return 0L; }
        public float readFloat() throws java.io.IOException { return 0.0f; }
        public <T extends com.android.framework.protobuf.MessageLite> T readGroup(int p0, com.android.framework.protobuf.Parser<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException { return null; }
        public void readGroup(int p0, com.android.framework.protobuf.MessageLite.Builder p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
        public int readInt32() throws java.io.IOException { return 0; }
        public long readInt64() throws java.io.IOException { return 0L; }
        public <T extends com.android.framework.protobuf.MessageLite> T readMessage(com.android.framework.protobuf.Parser<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
        public void readMessage(com.android.framework.protobuf.MessageLite.Builder p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {}
        public byte readRawByte() throws java.io.IOException { return 0; }
        public byte[] readRawBytes(int p0) throws java.io.IOException { return null; }
        public int readRawLittleEndian32() throws java.io.IOException { return 0; }
        public long readRawLittleEndian64() throws java.io.IOException { return 0L; }
        public int readRawVarint32() throws java.io.IOException { return 0; }
        public long readRawVarint64() throws java.io.IOException { return 0L; }
        long readRawVarint64SlowPath() throws java.io.IOException { return 0L; }
        public int readSFixed32() throws java.io.IOException { return 0; }
        public long readSFixed64() throws java.io.IOException { return 0L; }
        public int readSInt32() throws java.io.IOException { return 0; }
        public long readSInt64() throws java.io.IOException { return 0L; }
        public java.lang.String readString() throws java.io.IOException { return null; }
        public java.lang.String readStringRequireUtf8() throws java.io.IOException { return null; }
        public int readTag() throws java.io.IOException { return 0; }
        public int readUInt32() throws java.io.IOException { return 0; }
        public long readUInt64() throws java.io.IOException { return 0L; }
        @java.lang.Deprecated
        public void readUnknownGroup(int p0, com.android.framework.protobuf.MessageLite.Builder p1) throws java.io.IOException {}
        public void resetSizeCounter() {}
        public boolean skipField(int p0) throws java.io.IOException { return false; }
        public boolean skipField(int p0, com.android.framework.protobuf.CodedOutputStream p1) throws java.io.IOException { return false; }
        public void skipRawBytes(int p0) throws java.io.IOException {}

        private static interface RefillCallback {
            public void onRefill();
        }

        private class SkippedDataSink implements com.android.framework.protobuf.CodedInputStream.StreamDecoder.RefillCallback {
            private java.io.ByteArrayOutputStream byteArrayStream;
            private int lastPos;
            private SkippedDataSink(com.android.framework.protobuf.CodedInputStream.StreamDecoder p0) {}
            java.nio.ByteBuffer getSkippedData() { return null; }
            public void onRefill() {}
        }
    }

    private static final class UnsafeDirectNioDecoder extends com.android.framework.protobuf.CodedInputStream {
        private final long address = 0L;
        private final java.nio.ByteBuffer buffer = null;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable = false;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;
        private UnsafeDirectNioDecoder(java.nio.ByteBuffer p0, boolean p1) { super(); }
        private int bufferPos(long p0) { return 0; }
        static boolean isSupported() { return false; }
        private void recomputeBufferSizeAfterLimit() {}
        private int remaining() { return 0; }
        private void skipRawVarint() throws java.io.IOException {}
        private void skipRawVarintFastPath() throws java.io.IOException {}
        private void skipRawVarintSlowPath() throws java.io.IOException {}
        private java.nio.ByteBuffer slice(long p0, long p1) throws java.io.IOException { return null; }
        public void checkLastTagWas(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException {}
        public void enableAliasing(boolean p0) {}
        public int getBytesUntilLimit() { return 0; }
        public int getLastTag() { return 0; }
        public int getTotalBytesRead() { return 0; }
        public boolean isAtEnd() throws java.io.IOException { return false; }
        public void popLimit(int p0) {}
        public int pushLimit(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException { return 0; }
        public boolean readBool() throws java.io.IOException { return false; }
        public byte[] readByteArray() throws java.io.IOException { return null; }
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException { return null; }
        public com.android.framework.protobuf.ByteString readBytes() throws java.io.IOException { return null; }
        public double readDouble() throws java.io.IOException { return 0.0; }
        public int readEnum() throws java.io.IOException { return 0; }
        public int readFixed32() throws java.io.IOException { return 0; }
        public long readFixed64() throws java.io.IOException { return 0L; }
        public float readFloat() throws java.io.IOException { return 0.0f; }
        public <T extends com.android.framework.protobuf.MessageLite> T readGroup(int p0, com.android.framework.protobuf.Parser<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException { return null; }
        public void readGroup(int p0, com.android.framework.protobuf.MessageLite.Builder p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
        public int readInt32() throws java.io.IOException { return 0; }
        public long readInt64() throws java.io.IOException { return 0L; }
        public <T extends com.android.framework.protobuf.MessageLite> T readMessage(com.android.framework.protobuf.Parser<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
        public void readMessage(com.android.framework.protobuf.MessageLite.Builder p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {}
        public byte readRawByte() throws java.io.IOException { return 0; }
        public byte[] readRawBytes(int p0) throws java.io.IOException { return null; }
        public int readRawLittleEndian32() throws java.io.IOException { return 0; }
        public long readRawLittleEndian64() throws java.io.IOException { return 0L; }
        public int readRawVarint32() throws java.io.IOException { return 0; }
        public long readRawVarint64() throws java.io.IOException { return 0L; }
        long readRawVarint64SlowPath() throws java.io.IOException { return 0L; }
        public int readSFixed32() throws java.io.IOException { return 0; }
        public long readSFixed64() throws java.io.IOException { return 0L; }
        public int readSInt32() throws java.io.IOException { return 0; }
        public long readSInt64() throws java.io.IOException { return 0L; }
        public java.lang.String readString() throws java.io.IOException { return null; }
        public java.lang.String readStringRequireUtf8() throws java.io.IOException { return null; }
        public int readTag() throws java.io.IOException { return 0; }
        public int readUInt32() throws java.io.IOException { return 0; }
        public long readUInt64() throws java.io.IOException { return 0L; }
        @java.lang.Deprecated
        public void readUnknownGroup(int p0, com.android.framework.protobuf.MessageLite.Builder p1) throws java.io.IOException {}
        public void resetSizeCounter() {}
        public boolean skipField(int p0) throws java.io.IOException { return false; }
        public boolean skipField(int p0, com.android.framework.protobuf.CodedOutputStream p1) throws java.io.IOException { return false; }
        public void skipRawBytes(int p0) throws java.io.IOException {}
    }
}
