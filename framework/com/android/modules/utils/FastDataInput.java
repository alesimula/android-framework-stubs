package com.android.modules.utils;

public class FastDataInput implements java.io.DataInput, java.io.Closeable {
    protected static final int DEFAULT_BUFFER_SIZE = 32768;
    protected static final int MAX_UNSIGNED_SHORT = 65535;
    protected final byte[] mBuffer = null;
    protected final int mBufferCap = 0;
    protected int mBufferLim;
    protected int mBufferPos;
    private java.io.InputStream mIn;
    private int mStringRefCount;
    private java.lang.String[] mStringRefs;
    public FastDataInput(java.io.InputStream p0, int p1) {}
    public static com.android.modules.utils.FastDataInput obtain(java.io.InputStream p0) { return null; }
    public void close() throws java.io.IOException {}
    protected void fill(int p0) throws java.io.IOException {}
    public byte[] newByteArray(int p0) { return null; }
    public byte peekByte() throws java.io.IOException { return 0; }
    public boolean readBoolean() throws java.io.IOException { return false; }
    public byte readByte() throws java.io.IOException { return 0; }
    public char readChar() throws java.io.IOException { return 0; }
    public double readDouble() throws java.io.IOException { return 0.0; }
    public float readFloat() throws java.io.IOException { return 0.0f; }
    public void readFully(byte[] p0) throws java.io.IOException {}
    public void readFully(byte[] p0, int p1, int p2) throws java.io.IOException {}
    public int readInt() throws java.io.IOException { return 0; }
    public java.lang.String readInternedUTF() throws java.io.IOException { return null; }
    public java.lang.String readLine() throws java.io.IOException { return null; }
    public long readLong() throws java.io.IOException { return 0L; }
    public short readShort() throws java.io.IOException { return 0; }
    public java.lang.String readUTF() throws java.io.IOException { return null; }
    public int readUnsignedByte() throws java.io.IOException { return 0; }
    public int readUnsignedShort() throws java.io.IOException { return 0; }
    public void release() {}
    protected void setInput(java.io.InputStream p0) {}
    public int skipBytes(int p0) throws java.io.IOException { return 0; }
}
