package com.android.framework.protobuf;

@com.android.framework.protobuf.CheckReturnValue
public abstract class ByteString implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final com.android.framework.protobuf.ByteString EMPTY = null;
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final java.util.Comparator<com.android.framework.protobuf.ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = null;
    private static final com.android.framework.protobuf.ByteString.ByteArrayCopier byteArrayCopier = null;
    private static final long serialVersionUID = 1L;
    private int hash;
    ByteString() {}
    private static com.android.framework.protobuf.ByteString balancedConcat(java.util.Iterator<com.android.framework.protobuf.ByteString> p0, int p1) { return null; }
    static void checkIndex(int p0, int p1) {}
    static int checkRange(int p0, int p1, int p2) { return 0; }
    public static com.android.framework.protobuf.ByteString copyFrom(java.lang.Iterable<com.android.framework.protobuf.ByteString> p0) { return null; }
    public static com.android.framework.protobuf.ByteString copyFrom(java.lang.String p0, java.lang.String p1) throws java.io.UnsupportedEncodingException { return null; }
    public static com.android.framework.protobuf.ByteString copyFrom(java.lang.String p0, java.nio.charset.Charset p1) { return null; }
    public static com.android.framework.protobuf.ByteString copyFrom(java.nio.ByteBuffer p0) { return null; }
    public static com.android.framework.protobuf.ByteString copyFrom(java.nio.ByteBuffer p0, int p1) { return null; }
    public static com.android.framework.protobuf.ByteString copyFrom(byte[] p0) { return null; }
    public static com.android.framework.protobuf.ByteString copyFrom(byte[] p0, int p1, int p2) { return null; }
    public static com.android.framework.protobuf.ByteString copyFromUtf8(java.lang.String p0) { return null; }
    public static final com.android.framework.protobuf.ByteString empty() { return null; }
    private static int extractHexDigit(java.lang.String p0, int p1) { return 0; }
    public static com.android.framework.protobuf.ByteString fromHex(java.lang.String p0) { return null; }
    private static int hexDigit(char p0) { return 0; }
    static com.android.framework.protobuf.ByteString.CodedBuilder newCodedBuilder(int p0) { return null; }
    public static com.android.framework.protobuf.ByteString.Output newOutput() { return null; }
    public static com.android.framework.protobuf.ByteString.Output newOutput(int p0) { return null; }
    static com.android.framework.protobuf.ByteString nioByteString(java.nio.ByteBuffer p0) { return null; }
    private static com.android.framework.protobuf.ByteString readChunk(java.io.InputStream p0, int p1) throws java.io.IOException { return null; }
    public static com.android.framework.protobuf.ByteString readFrom(java.io.InputStream p0) throws java.io.IOException { return null; }
    public static com.android.framework.protobuf.ByteString readFrom(java.io.InputStream p0, int p1) throws java.io.IOException { return null; }
    public static com.android.framework.protobuf.ByteString readFrom(java.io.InputStream p0, int p1, int p2) throws java.io.IOException { return null; }
    private static int toInt(byte p0) { return 0; }
    private java.lang.String truncateAndEscapeForDisplay() { return null; }
    public static java.util.Comparator<com.android.framework.protobuf.ByteString> unsignedLexicographicalComparator() { return null; }
    static com.android.framework.protobuf.ByteString wrap(java.nio.ByteBuffer p0) { return null; }
    static com.android.framework.protobuf.ByteString wrap(byte[] p0) { return null; }
    static com.android.framework.protobuf.ByteString wrap(byte[] p0, int p1, int p2) { return null; }
    public abstract java.nio.ByteBuffer asReadOnlyByteBuffer();
    public abstract java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList();
    public abstract byte byteAt(int p0);
    public final com.android.framework.protobuf.ByteString concat(com.android.framework.protobuf.ByteString p0) { return null; }
    public abstract void copyTo(java.nio.ByteBuffer p0);
    public void copyTo(byte[] p0, int p1) {}
    @java.lang.Deprecated
    public final void copyTo(byte[] p0, int p1, int p2, int p3) {}
    protected abstract void copyToInternal(byte[] p0, int p1, int p2, int p3);
    public final boolean endsWith(com.android.framework.protobuf.ByteString p0) { return false; }
    public abstract boolean equals(java.lang.Object p0);
    protected abstract int getTreeDepth();
    public final int hashCode() { return 0; }
    abstract byte internalByteAt(int p0);
    protected abstract boolean isBalanced();
    public final boolean isEmpty() { return false; }
    public abstract boolean isValidUtf8();
    public com.android.framework.protobuf.ByteString.ByteIterator iterator() { return null; }
    public abstract com.android.framework.protobuf.CodedInputStream newCodedInput();
    public abstract java.io.InputStream newInput();
    protected abstract int partialHash(int p0, int p1, int p2);
    protected abstract int partialIsValidUtf8(int p0, int p1, int p2);
    protected final int peekCachedHashCode() { return 0; }
    public abstract int size();
    public final boolean startsWith(com.android.framework.protobuf.ByteString p0) { return false; }
    public final com.android.framework.protobuf.ByteString substring(int p0) { return null; }
    public abstract com.android.framework.protobuf.ByteString substring(int p0, int p1);
    public final byte[] toByteArray() { return null; }
    public final java.lang.String toString() { return null; }
    public final java.lang.String toString(java.lang.String p0) throws java.io.UnsupportedEncodingException { return null; }
    public final java.lang.String toString(java.nio.charset.Charset p0) { return null; }
    protected abstract java.lang.String toStringInternal(java.nio.charset.Charset p0);
    public final java.lang.String toStringUtf8() { return null; }
    abstract void writeTo(com.android.framework.protobuf.ByteOutput p0) throws java.io.IOException;
    public abstract void writeTo(java.io.OutputStream p0) throws java.io.IOException;
    final void writeTo(java.io.OutputStream p0, int p1, int p2) throws java.io.IOException {}
    abstract void writeToInternal(java.io.OutputStream p0, int p1, int p2) throws java.io.IOException;
    abstract void writeToReverse(com.android.framework.protobuf.ByteOutput p0) throws java.io.IOException;

    static abstract class AbstractByteIterator implements com.android.framework.protobuf.ByteString.ByteIterator {
        AbstractByteIterator() {}
        public final java.lang.Byte next() { return null; }
        public final void remove() {}
    }

    private static final class ArraysByteArrayCopier implements com.android.framework.protobuf.ByteString.ByteArrayCopier {
        private ArraysByteArrayCopier() {}
        public byte[] copyFrom(byte[] p0, int p1, int p2) { return null; }
    }

    private static final class BoundedByteString extends com.android.framework.protobuf.ByteString.LiteralByteString {
        private static final long serialVersionUID = 1L;
        private final int bytesLength = 0;
        private final int bytesOffset = 0;
        BoundedByteString(byte[] p0, int p1, int p2) { super(null); }
        private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException {}
        public byte byteAt(int p0) { return 0; }
        protected void copyToInternal(byte[] p0, int p1, int p2, int p3) {}
        protected int getOffsetIntoBytes() { return 0; }
        byte internalByteAt(int p0) { return 0; }
        public int size() { return 0; }
        java.lang.Object writeReplace() { return null; }
    }

    private static interface ByteArrayCopier {
        public byte[] copyFrom(byte[] p0, int p1, int p2);
    }

    public static interface ByteIterator extends java.util.Iterator<java.lang.Byte> {
        public byte nextByte();
    }

    static final class CodedBuilder {
        private final byte[] buffer = null;
        private final com.android.framework.protobuf.CodedOutputStream output = null;
        private CodedBuilder(int p0) {}
        public com.android.framework.protobuf.ByteString build() { return null; }
        public com.android.framework.protobuf.CodedOutputStream getCodedOutput() { return null; }
    }

    static abstract class LeafByteString extends com.android.framework.protobuf.ByteString {
        private static final long serialVersionUID = 1L;
        private LeafByteString() { super(); }
        abstract boolean equalsRange(com.android.framework.protobuf.ByteString p0, int p1, int p2);
        protected final int getTreeDepth() { return 0; }
        protected final boolean isBalanced() { return false; }
        void writeToReverse(com.android.framework.protobuf.ByteOutput p0) throws java.io.IOException {}
    }

    private static class LiteralByteString extends com.android.framework.protobuf.ByteString.LeafByteString {
        private static final long serialVersionUID = 1L;
        protected final byte[] bytes = null;
        LiteralByteString(byte[] p0) { super(); }
        public final java.nio.ByteBuffer asReadOnlyByteBuffer() { return null; }
        public final java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() { return null; }
        public byte byteAt(int p0) { return 0; }
        public final void copyTo(java.nio.ByteBuffer p0) {}
        protected void copyToInternal(byte[] p0, int p1, int p2, int p3) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        final boolean equalsRange(com.android.framework.protobuf.ByteString p0, int p1, int p2) { return false; }
        protected int getOffsetIntoBytes() { return 0; }
        byte internalByteAt(int p0) { return 0; }
        public final boolean isValidUtf8() { return false; }
        public final com.android.framework.protobuf.CodedInputStream newCodedInput() { return null; }
        public final java.io.InputStream newInput() { return null; }
        protected final int partialHash(int p0, int p1, int p2) { return 0; }
        protected final int partialIsValidUtf8(int p0, int p1, int p2) { return 0; }
        public int size() { return 0; }
        public final com.android.framework.protobuf.ByteString substring(int p0, int p1) { return null; }
        protected final java.lang.String toStringInternal(java.nio.charset.Charset p0) { return null; }
        final void writeTo(com.android.framework.protobuf.ByteOutput p0) throws java.io.IOException {}
        public final void writeTo(java.io.OutputStream p0) throws java.io.IOException {}
        final void writeToInternal(java.io.OutputStream p0, int p1, int p2) throws java.io.IOException {}
    }

    private static final class NioByteString extends com.android.framework.protobuf.ByteString.LeafByteString {
        private final java.nio.ByteBuffer buffer = null;
        NioByteString(java.nio.ByteBuffer p0) { super(); }
        private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException {}
        private java.nio.ByteBuffer slice(int p0, int p1) { return null; }
        private java.lang.Object writeReplace() { return null; }
        public java.nio.ByteBuffer asReadOnlyByteBuffer() { return null; }
        public java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() { return null; }
        public byte byteAt(int p0) { return 0; }
        public void copyTo(java.nio.ByteBuffer p0) {}
        protected void copyToInternal(byte[] p0, int p1, int p2, int p3) {}
        public boolean equals(java.lang.Object p0) { return false; }
        boolean equalsRange(com.android.framework.protobuf.ByteString p0, int p1, int p2) { return false; }
        public byte internalByteAt(int p0) { return 0; }
        public boolean isValidUtf8() { return false; }
        public com.android.framework.protobuf.CodedInputStream newCodedInput() { return null; }
        public java.io.InputStream newInput() { return null; }
        protected int partialHash(int p0, int p1, int p2) { return 0; }
        protected int partialIsValidUtf8(int p0, int p1, int p2) { return 0; }
        public int size() { return 0; }
        public com.android.framework.protobuf.ByteString substring(int p0, int p1) { return null; }
        protected java.lang.String toStringInternal(java.nio.charset.Charset p0) { return null; }
        void writeTo(com.android.framework.protobuf.ByteOutput p0) throws java.io.IOException {}
        public void writeTo(java.io.OutputStream p0) throws java.io.IOException {}
        void writeToInternal(java.io.OutputStream p0, int p1, int p2) throws java.io.IOException {}
    }

    public static final class Output extends java.io.OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = null;
        private byte[] buffer;
        private int bufferPos;
        private final java.util.ArrayList<com.android.framework.protobuf.ByteString> flushedBuffers = null;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity = 0;
        Output(int p0) { super(); }
        private void flushFullBuffer(int p0) {}
        private void flushLastBuffer() {}
        public void reset() {}
        public int size() { return 0; }
        public com.android.framework.protobuf.ByteString toByteString() { return null; }
        public java.lang.String toString() { return null; }
        public void write(int p0) {}
        public void write(byte[] p0, int p1, int p2) {}
        public void writeTo(java.io.OutputStream p0) throws java.io.IOException {}
    }

    private static final class SystemByteArrayCopier implements com.android.framework.protobuf.ByteString.ByteArrayCopier {
        private SystemByteArrayCopier() {}
        public byte[] copyFrom(byte[] p0, int p1, int p2) { return null; }
    }
}
