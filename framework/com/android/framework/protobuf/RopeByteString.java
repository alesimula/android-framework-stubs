package com.android.framework.protobuf;

final class RopeByteString extends com.android.framework.protobuf.ByteString {
    static final int[] minLengthByDepth = null;
    private static final long serialVersionUID = 1L;
    private final com.android.framework.protobuf.ByteString left = null;
    private final int leftLength = 0;
    private final com.android.framework.protobuf.ByteString right = null;
    private final int totalLength = 0;
    private final int treeDepth = 0;
    private RopeByteString(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ByteString p1) { super(); }
    static com.android.framework.protobuf.ByteString concatenate(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ByteString p1) { return null; }
    private static com.android.framework.protobuf.ByteString concatenateBytes(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ByteString p1) { return null; }
    private boolean equalsFragments(com.android.framework.protobuf.ByteString p0) { return false; }
    static int minLength(int p0) { return 0; }
    static com.android.framework.protobuf.RopeByteString newInstanceForTest(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ByteString p1) { return null; }
    private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException {}
    public java.nio.ByteBuffer asReadOnlyByteBuffer() { return null; }
    public java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() { return null; }
    public byte byteAt(int p0) { return 0; }
    public void copyTo(java.nio.ByteBuffer p0) {}
    protected void copyToInternal(byte[] p0, int p1, int p2, int p3) {}
    public boolean equals(java.lang.Object p0) { return false; }
    protected int getTreeDepth() { return 0; }
    byte internalByteAt(int p0) { return 0; }
    protected boolean isBalanced() { return false; }
    public boolean isValidUtf8() { return false; }
    public com.android.framework.protobuf.ByteString.ByteIterator iterator() { return null; }
    public com.android.framework.protobuf.CodedInputStream newCodedInput() { return null; }
    public java.io.InputStream newInput() { return null; }
    protected int partialHash(int p0, int p1, int p2) { return 0; }
    protected int partialIsValidUtf8(int p0, int p1, int p2) { return 0; }
    public int size() { return 0; }
    public com.android.framework.protobuf.ByteString substring(int p0, int p1) { return null; }
    protected java.lang.String toStringInternal(java.nio.charset.Charset p0) { return null; }
    java.lang.Object writeReplace() { return null; }
    void writeTo(com.android.framework.protobuf.ByteOutput p0) throws java.io.IOException {}
    public void writeTo(java.io.OutputStream p0) throws java.io.IOException {}
    void writeToInternal(java.io.OutputStream p0, int p1, int p2) throws java.io.IOException {}
    void writeToReverse(com.android.framework.protobuf.ByteOutput p0) throws java.io.IOException {}

    private static class Balancer {
        private final java.util.ArrayDeque<com.android.framework.protobuf.ByteString> prefixesStack = null;
        private Balancer() {}
        private com.android.framework.protobuf.ByteString balance(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ByteString p1) { return null; }
        private void doBalance(com.android.framework.protobuf.ByteString p0) {}
        private int getDepthBinForLength(int p0) { return 0; }
        private void insert(com.android.framework.protobuf.ByteString p0) {}
    }

    private static final class PieceIterator implements java.util.Iterator<com.android.framework.protobuf.ByteString.LeafByteString> {
        private final java.util.ArrayDeque<com.android.framework.protobuf.RopeByteString> breadCrumbs = null;
        private com.android.framework.protobuf.ByteString.LeafByteString next;
        private PieceIterator(com.android.framework.protobuf.ByteString p0) {}
        private com.android.framework.protobuf.ByteString.LeafByteString getLeafByLeft(com.android.framework.protobuf.ByteString p0) { return null; }
        private com.android.framework.protobuf.ByteString.LeafByteString getNextNonEmptyLeaf() { return null; }
        public boolean hasNext() { return false; }
        public com.android.framework.protobuf.ByteString.LeafByteString next() { return null; }
        public void remove() {}
    }

    private class RopeInputStream extends java.io.InputStream {
        private com.android.framework.protobuf.ByteString.LeafByteString currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private com.android.framework.protobuf.RopeByteString.PieceIterator pieceIterator;
        public RopeInputStream(com.android.framework.protobuf.RopeByteString p0) { super(); }
        private void advanceIfCurrentPieceFullyRead() {}
        private int availableInternal() { return 0; }
        private void initialize() {}
        private int readSkipInternal(byte[] p0, int p1, int p2) { return 0; }
        public int available() throws java.io.IOException { return 0; }
        public void mark(int p0) {}
        public boolean markSupported() { return false; }
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) { return 0; }
        public void reset() {}
        public long skip(long p0) { return 0L; }
    }
}
