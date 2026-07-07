package com.android.internal.util;

public class ProcFileReader implements java.io.Closeable {
    private final byte[] mBuffer = null;
    private boolean mLineFinished;
    private final java.io.InputStream mStream = null;
    private int mTail;
    public ProcFileReader(java.io.InputStream p0) throws java.io.IOException {}
    public ProcFileReader(java.io.InputStream p0, int p1) throws java.io.IOException {}
    private void consumeBuf(int p0) throws java.io.IOException {}
    private int fillBuf() throws java.io.IOException { return 0; }
    private java.lang.NumberFormatException invalidLong(int p0) { return null; }
    private int nextTokenIndex() throws java.io.IOException { return 0; }
    private long parseAndConsumeLong(int p0, boolean p1) throws java.io.IOException { return 0L; }
    private java.lang.String parseAndConsumeString(int p0) throws java.io.IOException { return null; }
    public void close() throws java.io.IOException {}
    public void finishLine() throws java.io.IOException {}
    public boolean hasMoreData() { return false; }
    public void nextIgnored() throws java.io.IOException {}
    public int nextInt() throws java.io.IOException { return 0; }
    public long nextLong() throws java.io.IOException { return 0L; }
    public long nextLong(boolean p0) throws java.io.IOException { return 0L; }
    public long nextOptionalLong(long p0) throws java.io.IOException { return 0L; }
    public java.lang.String nextString() throws java.io.IOException { return null; }
    public void rewind() throws java.io.IOException {}
}
