package com.android.framework.protobuf;

final class IterableByteBufferInputStream extends java.io.InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private java.nio.ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize;
    private boolean hasArray;
    private java.util.Iterator<java.nio.ByteBuffer> iterator;
    IterableByteBufferInputStream(java.lang.Iterable<java.nio.ByteBuffer> p0) { super(); }
    private boolean getNextByteBuffer() { return false; }
    private void updateCurrentByteBufferPos(int p0) {}
    public int read() throws java.io.IOException { return 0; }
    public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
}
